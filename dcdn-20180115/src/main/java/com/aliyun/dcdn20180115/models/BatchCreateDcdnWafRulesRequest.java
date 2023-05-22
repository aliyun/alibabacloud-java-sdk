// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchCreateDcdnWafRulesRequest extends TeaModel {
    /**
     * <p>The configurations of the protection rule.</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>## Description of the RuleConfigs parameter</p>
     * <br>
     * <p>- RuleConfigs is a list slice, in which each struct represents a rule.</p>
     * <p>- The fields in the RuleConfigs parameter vary based on the type of the protection policy whose ID is specified by the PolicyId parameter.</p>
     * <br>
     * <br>
     * <p>## Scenario 1:web RegEx protection (waf_group)</p>
     * <br>
     * <p>| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| status | String | No | on | Specifies whether to enable the protection rule. Valid values: on and off. Default value: on. |</p>
     * <p>| action | String | Yes | block | Specifies the action of the rule. Valid values: block and monitor. |</p>
     * <p>Sample code for waf_group</p>
     * <br>
     * <p>```</p>
     * <p>// You can configure only one rule for a protection policy of the waf_group type. </p>
     * <p>[</p>
     * <p>  {</p>
     * <p>    "status": "on",</p>
     * <p>    "action": "block"</p>
     * <p>  }</p>
     * <p>]</p>
     * <p>```</p>
     * <br>
     * <p>## Scenario 2: custom rules (custom_acl)</p>
     * <br>
     * <p>| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| name | string | Yes | acl_1 | The name of the protection rule. The name can be up to 64 characters in length and can contain letters, digits, and underscores (_). |</p>
     * <p>| status | string | No | on | Valid values: on and off. Default value: on. |</p>
     * <p>| conditions | Condition | Yes | [ {"key": "URI", "subKey": "","opValue": "contain",  "values": "/login.php" }] | The trigger condition. For more information, see **Table 1 Fields in the Conditions parameter**. |</p>
     * <p>| ccStatus | string | Yes | off | Specifies whether to enable rate limiting. Valid values: on and off. |</p>
     * <p>| rateLimit | RateLimit | No | { "target": "Header", "subKey": "User-Agent", "interval": 5, "threshold": 2, "ttl": 1800} | The rules of rate limiting. If you set ccStatus to on, you must configure this parameter. For more information, see **Table 2 Fields in the rateLimit parameter**. |</p>
     * <p>| effect | string | No | service | The effective scope of the rate limiting blacklist. If you set ccStatus to on, you must configure this parameter. Valid values: rule (takes effect for the current rule) and service (takes effect globally). |</p>
     * <p>| action | string | Yes | deny | The action of the rule. Valid values: deny, js (JavaScript verification), and monitor. |</p>
     * <p>Table 1 Fields in the Conditions parameter</p>
     * <br>
     * <p>| Field | Type | Required | Example | Description |</p>
     * <p>| ----- | ---- | -------- | ------- | ----------- |</p>
     * <p>| Key | string | Yes | Query String Parameter | The match field. For more information, see [DescribeDcdnWafFilterInfo](https://www.alibabacloud.com/help/en/dynamic-route-for-cdn/latest/obtain-the-matching-conditions-of-custom-protection-rules). |</p>
     * <p>| subKey | string | No | action | The match subfield. For more information, see [DescribeDcdnWafFilterInfo](https://www.alibabacloud.com/help/en/dynamic-route-for-cdn/latest/obtain-the-matching-conditions-of-custom-protection-rules). |</p>
     * <p>| opValue | String | Yes | eq | The logical symbol. For more information, see [DescribeDcdnWafFilterInfo](https://www.alibabacloud.com/help/en/dynamic-route-for-cdn/latest/obtain-the-matching-conditions-of-custom-protection-rules). |</p>
     * <p>| values | String | No | js | The match content. Separate multiple values with commas (,). For more information, see [DescribeDcdnWafFilterInfo](https://www.alibabacloud.com/help/en/dynamic-route-for-cdn/latest/obtain-the-matching-conditions-of-custom-protection-rules). |</p>
     * <p>Table 2 Fields in the rateLimit parameter</p>
     * <br>
     * <p>| Field | Type | Required | Example | Description |</p>
     * <p>| ----- | ---- | -------- | ------- | ----------- |</p>
     * <p>| target | string | Yes | Header | The statistical field of rate limiting. IP: calculates the frequency at which requests are sent from a specified IP address. Header: calculates the frequency of requests that contain the specified header. Query String Parameter: calculates the frequency of requests that contain the specified parameter. Cookie Name: calculates the frequency of requests that contain the specified cookie. Session: calculates the frequency of requests that are transmitted over a specified session. |</p>
     * <p>| subKey | string | No | User-Agent | The subfield of the target field. If you set target to Header, Query String Parameter, or Cookie Name, you must configure subKey. |</p>
     * <p>| Interval | Integer | Yes | 5 | The statistical interval. Valid values: 5 to 1800. Unit: seconds. |</p>
     * <p>| threshold | Integer | Yes | 2 | The trigger threshold of rate limiting. Valid values: 2 to 500000. Unit: requests. |</p>
     * <p>| ttl | Integer | Yes | 1800 | The validity period of the blacklist. Valid values: 60 to 86400. Unit: seconds. |</p>
     * <p>| status | RateLimitStatus | No | {"code": "404", "ratio": 10} | The information about the HTTP status code. For more information, see **Table 3 Fields in the RateLimitStatus parameter**. |</p>
     * <p>Table 3 Fields in the RateLimitStatus parameter</p>
     * <br>
     * <p>| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| codet | string | Yes | 404 | The HTTP status code returned. |</p>
     * <p>| ratio | Integer | No | 10 | The percentage of HTTP status codes. Valid values: 1 to 100. You can configure only one of the ratio and count fields. |</p>
     * <p>| count | Integer | No | 10 | The number of times that the HTTP status code that was returned. Valid values: 2 to 50000. You can configure only one of the ratio and count fields. |</p>
     * <p>Sample code for custom_acl</p>
     * <br>
     * <p>```</p>
     * <p>[</p>
     * <p>  // Access control</p>
     * <p>  {</p>
     * <p>    "name": "acl_1",</p>
     * <p>    "status": "off",</p>
     * <p>    "conditions":</p>
     * <p>    [</p>
     * <p>      {</p>
     * <p>        "key": "Query String Parameter",</p>
     * <p>        "subKey": "action",</p>
     * <p>        "opValue": "eq",</p>
     * <p>        "values": "js"</p>
     * <p>      }</p>
     * <p>    ],</p>
     * <p>    "ccStatus": "off",</p>
     * <p>    "action": "js"</p>
     * <p>  },</p>
     * <p>  // Rate limiting</p>
     * <p>  {</p>
     * <p>    "name": "cc_1",</p>
     * <p>    "status": "on",</p>
     * <p>  	"conditions": </p>
     * <p>    [</p>
     * <p>      {</p>
     * <p>        "key": "URI",</p>
     * <p>        "subKey": "",</p>
     * <p>        "opValue": "contain",</p>
     * <p>        "values": "/login.php"</p>
     * <p>      },</p>
     * <p>      {</p>
     * <p>        "key": "IP",</p>
     * <p>        "subKey": "",</p>
     * <p>        "opValue": "ip-contain",</p>
     * <p>        "values": "192.168.0.1/24"</p>
     * <p>      }</p>
     * <p>    ],</p>
     * <p>    "ccStatus": "on",</p>
     * <p>    "ratelimit":</p>
     * <p>    {</p>
     * <p>      "target": "Header",</p>
     * <p>      "subKey": "User-Agent",</p>
     * <p>      "interval": 5,</p>
     * <p>      "threshold": 2,</p>
     * <p>      "ttl": 1800,</p>
     * <p>      "status":</p>
     * <p>      {</p>
     * <p>        "code": "404",</p>
     * <p>        "ratio": 10</p>
     * <p>      }</p>
     * <p>    },</p>
     * <p>    "effect": "service",</p>
     * <p>    "action": "deny"</p>
     * <p>  }</p>
     * <p>]</p>
     * <p>```</p>
     * <br>
     * <p>## Scenario 3: whitelist (whitelist)</p>
     * <br>
     * <p>| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| name | string | Yes | on | The name of the protection rule. The name can be up to 64 characters in length and can contain letters, digits, and underscores (_). |</p>
     * <p>| status | string | No | on | Specifies whether to enable the protection rule. Default value: on. Valid values: on and off. off: disables the multiplexing feature for ports. |</p>
     * <p>| conditions | Condition | Yes | [{ "key": "Http-Method","subKey": "","opValue": "match-one", "values": "GET,POST,DELETE" }] | The trigger condition of the rule. For more information, see **Table 1 Fields in the Conditions parameter**. |</p>
     * <p>| tags | String | Yes | [ "waf_group",  "custom_acl"] | The types of the protection policies. |</p>
     * <p>| regularTypes | String | No | [  [ "sqli", "xss","code_exec", "crlf", "lfilei",  "rfilei", "webshell","vvip", "other"] | The type of the regular expression. If the value of the tags field contains waf_group, you can specify this field. Valid values: ["sqli", "xss", "code_exec", "crlf", "lfilei", "rfilei", "webshell", "vvip", and "other"]. |</p>
     * <p>| regularRules | String | No | [   "100001", "100002", "100003"] | The regular expression. If the value of the tags field contains waf_group, you can specify this field. You can configure only regularRules or regularTypes. The value must be a string that consists of six digits. |</p>
     * <p>Sample code for whitelist:</p>
     * <br>
     * <p>```</p>
     * <p>[</p>
     * <p>  // Skip all protection policies.</p>
     * <p>  {</p>
     * <p>    "name": "wl_all",</p>
     * <p>    "status": "on",</p>
     * <p>    "conditions":</p>
     * <p>    [</p>
     * <p>      {</p>
     * <p>        "key": "Http-Method",</p>
     * <p>        "subKey": "",</p>
     * <p>        "opValue": "match-one",</p>
     * <p>        "values": "GET,POST,DELETE"</p>
     * <p>      }</p>
     * <p>    ],</p>
     * <p>    "tags":</p>
     * <p>    [</p>
     * <p>      "waf_group",</p>
     * <p>      "custom_acl",</p>
     * <p>      "ip_blacklist",</p>
     * <p>      "region_block"</p>
     * <p>    ]</p>
     * <p>  },</p>
     * <p>  // Skip the ID of the rule that is specified in waf_group.</p>
     * <p>  {</p>
     * <p>    "name": "wl_waf_id",</p>
     * <p>    "status": "off",</p>
     * <p>    "conditions":</p>
     * <p>    [</p>
     * <p>      {</p>
     * <p>        "key": "Cookie Name",</p>
     * <p>        "subKey": "cdn-sec",</p>
     * <p>        "opValue": "prefix-match",</p>
     * <p>        "values": "a7sdsa9dsa8d8sa"</p>
     * <p>      },</p>
     * <p>      {</p>
     * <p>        "key": "Referer",</p>
     * <p>        "subKey": "",</p>
     * <p>        "opValue": "none",</p>
     * <p>        "values": ""</p>
     * <p>      }</p>
     * <p>    ],</p>
     * <p>    "tags":</p>
     * <p>    [</p>
     * <p>      "waf_group"</p>
     * <p>    ],</p>
     * <p>    "regularRules":</p>
     * <p>    [</p>
     * <p>      "100001",</p>
     * <p>      "100002",</p>
     * <p>      "100003"</p>
     * <p>    ]</p>
     * <p>  },</p>
     * <p>  {</p>
     * <p>  // Skip the type of rules that is specified in waf_group.</p>
     * <p>    "name": "wl_waf_type",</p>
     * <p>    "status": "on",</p>
     * <p>    "conditions":</p>
     * <p>    [</p>
     * <p>      {</p>
     * <p>        "key": "Query String",</p>
     * <p>        "subKey": "",</p>
     * <p>        "opValue": "exists",</p>
     * <p>        "values": ""</p>
     * <p>      }</p>
     * <p>    ],</p>
     * <p>    "tags":</p>
     * <p>    [</p>
     * <p>      "waf_group"</p>
     * <p>    ],</p>
     * <p>    "regularTypes":</p>
     * <p>    [</p>
     * <p>      "sqli",</p>
     * <p>      "xss",</p>
     * <p>      "code_exec",</p>
     * <p>      "crlf",</p>
     * <p>      "lfilei",</p>
     * <p>      "rfilei",</p>
     * <p>      "webshell",</p>
     * <p>      "vvip",</p>
     * <p>      "other"</p>
     * <p>    ]</p>
     * <p>  },</p>
     * <p>  // Skip custom rules.</p>
     * <p>  {</p>
     * <p>    "name": "wl_custom_acl",</p>
     * <p>    "status": "on",</p>
     * <p>    "conditions":</p>
     * <p>    [</p>
     * <p>      {</p>
     * <p>        "key": "Http-Method",</p>
     * <p>        "subKey": "",</p>
     * <p>        "opValue": "match-one",</p>
     * <p>        "values": "GET,POST,DELETE"</p>
     * <p>      }</p>
     * <p>    ],</p>
     * <p>    "tags":</p>
     * <p>    [</p>
     * <p>      "custom_acl"</p>
     * <p>    ]</p>
     * <p>  },</p>
     * <p>  // Skip IP addresses in the blacklist.</p>
     * <p>  {</p>
     * <p>    "name": "wl_ip_blacklist",</p>
     * <p>    "status": "on",</p>
     * <p>    "conditions":</p>
     * <p>    [</p>
     * <p>      {</p>
     * <p>        "key": "Http-Method",</p>
     * <p>        "subKey": "",</p>
     * <p>        "opValue": "match-one",</p>
     * <p>        "values": "GET,POST,DELETE"</p>
     * <p>      }</p>
     * <p>    ],</p>
     * <p>    "tags":</p>
     * <p>    [</p>
     * <p>      "ip_blacklist"</p>
     * <p>    ]</p>
     * <p>  },</p>
     * <p>  // Skip the region blocking</p>
     * <p>  {</p>
     * <p>    "name": "wl_region_block",</p>
     * <p>    "status": "on",</p>
     * <p>    "conditions":</p>
     * <p>    [</p>
     * <p>      {</p>
     * <p>        "key": "Http-Method",</p>
     * <p>        "subKey": "",</p>
     * <p>        "opValue": "match-one",</p>
     * <p>        "values": "GET,POST,DELETE"</p>
     * <p>      }</p>
     * <p>    ],</p>
     * <p>    "tags":</p>
     * <p>    [</p>
     * <p>      "region_block"</p>
     * <p>    ]</p>
     * <p>  }</p>
     * <p>]</p>
     * <p>```</p>
     * <br>
     * <p>## Scenario 4:IP address blacklist (ip_blacklist)</p>
     * <br>
     * <p>| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| name | string | Yes | ipblacklist | The name of the protection rule. The name can be up to 64 characters in length and can contain letters, digits, and underscores (_). |</p>
     * <p>| status | string | No | on | Specifies whether to enable the protection rule. Valid values: on and off. Default value: on. |</p>
     * <p>| remoteAddr | []String | Yes | ["192.168.0.1","10.10.10.10/24","::1","abcd::abcd","BCDE::BCDE"] | Filter by IP address. For more information, see [DescribeDcdnWafFilterInfo](https://www.alibabacloud.com/help/en/dynamic-route-for-cdn/latest/obtain-the-matching-conditions-of-custom-protection-rules). |</p>
     * <p>| action | string | Yes | deny | The action of the rule. Valid values: deny and monitor. |</p>
     * <p>Sample code for ipblacklist:</p>
     * <br>
     * <p>```</p>
     * <p>[</p>
     * <p>    {</p>
     * <p>    "name": "ipblacklist",</p>
     * <p>    "status": "on",</p>
     * <p>    "remoteAddr": ["192.168.0.1","10.10.10.10/24","::1","abcd::abcd","BCDE::BCDE"],</p>
     * <p>    "action": "deny"</p>
     * <p>  }</p>
     * <p>]</p>
     * <p>```</p>
     * <br>
     * <p>## Protection scenario 5: region blocking (region_block)</p>
     * <br>
     * <p>| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| status | string | No | on | Specifies whether to enable the protection rule. Valid values: on and off. Default value: on. |</p>
     * <p>| cnRegionList | string | No | 110000,TW,MO | The blocked regions in the Chinese mainland, separated by commas (,). For more information about the regions that can be blocked, see [DescribeDcdnWafGeoInfo](https://www.alibabacloud.com/help/en/dynamic-route-for-cdn/latest/describe-dcdn-waf-geo-info). |</p>
     * <p>| otherRegionList | string | No | JP,GB | Blocked regions outside the Chinese mainland, separated by commas (,). For more information about the regions that can be blocked, see [DescribeDcdnWafGeoInfo](https://www.alibabacloud.com/help/en/dynamic-route-for-cdn/latest/describe-dcdn-waf-geo-info). |</p>
     * <p>| action | string | Yes | deny | The action of the rule. Valid values: deny and monitor. |</p>
     * <p>>  You must specify at least one of the ProcessId or ProcessName parameters.  Sample code for region_block:</p>
     * <br>
     * <p>```</p>
     * <p>[</p>
     * <p>    {</p>
     * <p>    "status": "on",</p>
     * <p>    "cnRegionList": "110000,TW,MO",</p>
     * <p>    "otherRegionList": "JP,GB",</p>
     * <p>    "action": "deny"</p>
     * <p>  }</p>
     * <p>]</p>
     * <p>```</p>
     * <br>
     * <p>## Scenario 6: Bot management (bot)</p>
     * <br>
     * <p>**Rule template**All rules have the four parameters in the following table. For more information, see the rule classification.  </p>
     * <br>
     * <p>| Parameter | Type | Required | Description |</p>
     * <p>| --------- | ---- | -------- | ----------- |</p>
     * <p>| type | String | Yes | The type of the rule. For more information, see the rule classification. |</p>
     * <p>| status | String | Yes | The status of the rule. Valid values: on and off. |</p>
     * <p>| config | TargetType | No | Rule configuration. For more information, see Rule classification. |</p>
     * <p>| action | String | No | Rule actions. For more information, see Rule classification. |</p>
     * <p>**Rule category 1: protection target type**| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| type | String | Yes | target_type | The type of the rule. Set the value to target_type. |</p>
     * <p>| status | String | Yes | on | Specifies whether to enable the rule. Set the value to on. |</p>
     * <p>| config | TargetType | No | {"target":"app"} | The configuration of the rule. Format:</p>
     * <br>
     * <p>(Required) target: the type of the protection target. Valid values: web (web pages and browsers) and app (apps). |</p>
     * <p>| action | String | No | Empty | The action of the rule, which is not involved here. Leave the value empty. |</p>
     * <p>Configuration example of the protection target type:</p>
     * <br>
     * <p>```</p>
     * <p>[</p>
     * <p>  {</p>
     * <p>    "type":"target_type",</p>
     * <p>    "status":"on",</p>
     * <p>    "config":{"target":"app"},</p>
     * <p>    "action":""</p>
     * <p>  }</p>
     * <p>]</p>
     * <p>```</p>
     * <p>**Rule classification 2: Web SDK integration**| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| type | String | Yes | web_sdk | The type of the rule. Set the value to web_sdk. |</p>
     * <p>| status | String | Yes | on | Specifies whether to enable the rule. Set the value to on. |</p>
     * <p>| config | WebSdk | No | {"mode":"automatic","crossDomain":"example.com"} | The configuration of the rule. Format:</p>
     * <br>
     * <p>(Required) mode : the integration mode of the Web SDK. Valid values: automatic and manual.  </p>
     * <br>
     * <p>(Optional) crossDomain: cross-domain resource calling. This parameter takes effect only when the value of mode is automatic. |</p>
     * <p>| action | String | No | Empty | The action of the rule, which is not involved here. Leave the value empty. |</p>
     * <p>Configuration example of Web SDK integration:</p>
     * <br>
     * <p>```</p>
     * <p>[</p>
     * <p>  {</p>
     * <p>    "type":"web_sdk",</p>
     * <p>    "status":"on",</p>
     * <p>    "config":{"mode":"automatic","crossDomain":"example.com"},</p>
     * <p>    "action":""</p>
     * <p>  }</p>
     * <p>]</p>
     * <p>```</p>
     * <p>**Rule classification 3: protection target characteristics**| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| type | String | Yes | traffic_feature | The type of the rule. Set the value to traffic_feature. |</p>
     * <p>| status | String | Yes | on | Specifies whether to enable the rule. Set the value to on. |</p>
     * <p>| config | TrafficFeature | Yes | {"conditions":[{"key":"Header","subKey":"User-Agent","opValue":"contain","values":"Chrome"},{"key":"IP","subKey":"","opValue":"ip-contain","values":"192.168.0.1/24"}]} | The configuration of the rule. For more information, see **condition**. |</p>
     * <p>| action | String | No | Empty | The action of the rule, which is not involved here. Leave the value empty. |</p>
     * <p>**condition** (match condition) </p>
     * <br>
     * <p>| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| key | String | Yes | Header | The match field. For more information, see [DescribeDcdnWafFilterInfo](https://www.alibabacloud.com/help/en/dynamic-route-for-cdn/latest/obtain-the-matching-conditions-of-custom-protection-rules). |</p>
     * <p>| subKey | String | No | User-Agent | The match subfield. For more information, see [DescribeDcdnWafFilterInfo](https://www.alibabacloud.com/help/en/dynamic-route-for-cdn/latest/obtain-the-matching-conditions-of-custom-protection-rules). |</p>
     * <p>| opValue | String | Yes | contain | The operator. For more information, see [DescribeDcdnWafFilterInfo](https://www.alibabacloud.com/help/en/dynamic-route-for-cdn/latest/obtain-the-matching-conditions-of-custom-protection-rules). |</p>
     * <p>| values | String | No | Chrome | The match content. Separate multiple values with commas (,). For more information, see [DescribeDcdnWafFilterInfo](https://www.alibabacloud.com/help/en/dynamic-route-for-cdn/latest/obtain-the-matching-conditions-of-custom-protection-rules). |</p>
     * <p>Configuration example of protection target characteristics:</p>
     * <br>
     * <p>```</p>
     * <p>[</p>
     * <p>  {</p>
     * <p>    "type":"traffic_feature",</p>
     * <p>    "status":"on",</p>
     * <p>    "config":{"conditions":[{"key":"Header","subKey":"User-Agent","opValue":"contain","values":"Chrome"},{"key":"IP","subKey":"","opValue":"ip-contain","values":"192.168.0.1/24"}]},</p>
     * <p>    "action":""</p>
     * <p>  }</p>
     * <p>]</p>
     * <p>```</p>
     * <p>**Rule classification 4: legitimate Bot management**| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| type | String | Yes | intelligence_crawler | The type of the rule. Set the value to intelligence_crawler. |</p>
     * <p>| status | String | Yes | on | Specifies whether to enable the rule. Set the value to on. |</p>
     * <p>| config | IntelligenceCrawler | No | {"name":"intelligence_crawler_baidu"} | The configuration of the rule. For more information, see **name (spider whitelist)**. |</p>
     * <p>| action | String | Yes | bypass | The action of the rule. Set the value to bypass. |</p>
     * <p>**name (spider whitelist)**| Value | Description |</p>
     * <p>| ----- | ----------- |</p>
     * <p>| intelligence_crawler_all | Whitelist for authorized search engines, such as Google, Bing, Baidu, Sogou, 360, and Yandex. |</p>
     * <p>| intelligence_crawler_baidu | Baidu spider whitelist |</p>
     * <p>| intelligence_crawler_sogou | Sogou spider whitelist |</p>
     * <p>| intelligence_crawler_360 | 360 spider whitelist |</p>
     * <p>| intelligence_crawler_google | Google spider whitelist |</p>
     * <p>| intelligence_crawler_bing | Bing spider whitelist |</p>
     * <p>| intelligence_crawler_yandex | Yandex spider whitelist |</p>
     * <p>Configuration example of legitimate Bot management:</p>
     * <br>
     * <p>```</p>
     * <p>[</p>
     * <p>  {</p>
     * <p>    "type":"intelligence_crawler",</p>
     * <p>    "status":"on",</p>
     * <p>    "config":{"name":"intelligence_crawler_baidu"},</p>
     * <p>    "action":"bypass"</p>
     * <p>  },</p>
     * <p>  {</p>
     * <p>    "type":"intelligence_crawler",</p>
     * <p>    "status":"on",</p>
     * <p>    "config":{"name":"intelligence_crawler_google"},</p>
     * <p>    "action":"bypass"</p>
     * <p>  }</p>
     * <p>]</p>
     * <p>```</p>
     * <p>**Rule classification 5: script-based Bot block (JavaScript)**| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| type | String | Yes | js | The type of the rule. Set the value to js. |</p>
     * <p>| status | String | Yes | on | Specifies whether to enable the rule. Valid values: on and off. |</p>
     * <p>| config | Js | No | Empty | The configuration of the rule, which is not involved here. Leave the value empty. |</p>
     * <p>| action | String | Yes | js | The action of the rule. Set the value to js (JavaScript verification). |</p>
     * <p>Configuration example of script-based Bot block (JavaScript)</p>
     * <br>
     * <p>```</p>
     * <p>[</p>
     * <p>  {</p>
     * <p>    "type":"js",</p>
     * <p>    "status":"on",</p>
     * <p>    "config":{},</p>
     * <p>    "action":"js"</p>
     * <p>  }</p>
     * <p>]</p>
     * <p>```</p>
     * <p>**Rule classification 6: advanced Bot defense (dynamic token-based authentication)**| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| type | String | Yes | sigchl | The type of the rule. Set the value to sigchl. |</p>
     * <p>| status | String | Yes | on | Specifies whether to enable the rule. Valid values: on and off. |</p>
     * <p>| config | Sigchl | No | {"sigchl":["sig","replay","driver"]} | The configuration of the rule. Format:</p>
     * <br>
     * <p>(Required) sigchl : signature-based verification for request data. Valid values: sig (signature verification exception),replay (signature timestamp exception), and driver(WebDriver attack). |</p>
     * <p>| action | String | Yes | sigchl | The action of the rule. Set the value to sigchl (block). |</p>
     * <p>Configuration example of advanced Bot defense (dynamic token-based authentication):</p>
     * <br>
     * <p>```</p>
     * <p>[</p>
     * <p>  {</p>
     * <p>    "type":"sigchl",</p>
     * <p>    "status":"on",</p>
     * <p>    "config":{"sigchl":["sig","replay","driver"]},</p>
     * <p>    "action":"sigchl"</p>
     * <p>  }</p>
     * <p>]</p>
     * <p>```</p>
     * <p>**Rule classification 7: intelligent protection**| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| type | String | Yes | algorithm | The type of the rule. Set the value to algorithm. |</p>
     * <p>| status | String | Yes | on | Specifies whether to enable the rule. Valid values: on and off. |</p>
     * <p>| config | Algorithm | No | Empty | The configuration of the rule, which is not involved here. Leave the value empty. |</p>
     * <p>| action | String | Yes | captcha | The action of the rule. Valid values: monitor and captcha. |</p>
     * <p>Configuration example of intelligent protection:</p>
     * <br>
     * <p>```</p>
     * <p>[</p>
     * <p>  {</p>
     * <p>    "type":"algorithm",</p>
     * <p>    "status":"on",</p>
     * <p>    "config":{},</p>
     * <p>    "action":"captcha"</p>
     * <p>  }</p>
     * <p>]</p>
     * <p>```</p>
     * <p>**Rule classification 8: IP address throttling**| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| type | String | Yes | custom_cc_ip | The type of the rule. Set the value to custom_cc_ip. |</p>
     * <p>| status | String | Yes | on | Specifies whether to enable the rule. Valid values: on and off. |</p>
     * <p>| config | CustomCcIp | Yes | {"interval":20,"target":"IP","threshold":50,"ttl":2800} | The configuration of the rule. For more information, see **Fields in the config parameter of IP address throttling**. |</p>
     * <p>| action | String | Yes | monitor | The action of the rule. Valid values: deny, monitor, and captcha (only for web). |</p>
     * <p>**Fields in the config parameter of IP address throttling**| Field | Type | Required | Example | Description |</p>
     * <p>| ----- | ---- | -------- | ------- | ----------- |</p>
     * <p>| target | String | Yes | IP | The statistical field of rate limiting. Set the value to IP. |</p>
     * <p>| subKey | String | No | Empty | The subfield of the target field, which is not involved here. Leave the value empty. |</p>
     * <p>| Interval | Integer | Yes | 20 | The statistical interval. Valid values: 5 to 1800. Unit: seconds. |</p>
     * <p>| threshold | Integer | Yes | 50 | The trigger threshold of rate limiting. Valid values: 2 to 50000. Unit: calls. |</p>
     * <p>| ttl | Integer | Yes | 2800 | The validity period of the blacklist. Valid values: 60 to 86400. Unit: seconds. |</p>
     * <p>Configuration example of IP address throttling</p>
     * <br>
     * <p>```</p>
     * <p>[</p>
     * <p>  {</p>
     * <p>    "type":"custom_cc_ip",</p>
     * <p>    "status":"on",</p>
     * <p>    "config":{"interval":20,"target":"IP","threshold":50,"ttl":2800},</p>
     * <p>    "action":"monitor"</p>
     * <p>  },</p>
     * <p>  {</p>
     * <p>    "type":"custom_cc_ip",</p>
     * <p>    "status":"on",</p>
     * <p>    "config":{"interval":10,"target":"IP","threshold":30,"ttl":1800},</p>
     * <p>    "action":"monitor"</p>
     * <p>  }</p>
     * <p>]</p>
     * <p>```</p>
     * <p>**Rule classification 9: device throttling**| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| type | String | Yes | custom_cc_dev | The type of the rule. Set the value to custom_cc_dev. |</p>
     * <p>| status | String | Yes | on | Specifies whether to enable the rule. Valid values: on and off. |</p>
     * <p>| config | CustomCcDev | Yes | {"interval":20,"target":"Header","subKey":"aliwaf_wxbb_umid","threshold":50,"ttl":2800} | The configuration of the rule. For more information, see **Fields in the config parameter of device throttling**. |</p>
     * <p>| action | String | Yes | monitor | The action of the rule. Valid values: deny and monitor. |</p>
     * <p>**Fields in the config parameter of device throttling**| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| target | String | Yes | Header | The statistical field of rate limiting. Set the value to Header. |</p>
     * <p>| subKey | String | No | aliwaf_wxbb_umid | The subfield of the target field. Set the value to aliwaf_wxbb_umid. |</p>
     * <p>| Interval | Integer | Yes | 20 | The statistical interval. Valid values: 5 to 1800. Unit: seconds. |</p>
     * <p>| threshold | Integer | Yes | 50 | The trigger threshold of rate limiting. Valid values: 2 to 50000. Unit: calls. |</p>
     * <p>| ttl | Integer | Yes | 2800 | The validity period of the blacklist. Valid values: 60 to 86400. Unit: seconds. |</p>
     * <p>Configuration example of device throttling</p>
     * <br>
     * <p>```</p>
     * <p>[</p>
     * <p>  {</p>
     * <p>    "type":"custom_cc_dev",</p>
     * <p>    "status":"on",</p>
     * <p>    "config":{"interval":20,"target":"Header","subKey":"aliwaf_wxbb_umid","threshold":50,"ttl":2800},</p>
     * <p>    "action":"monitor"</p>
     * <p>  },</p>
     * <p>  {</p>
     * <p>    "type":"custom_cc_dev",</p>
     * <p>    "status":"on",</p>
     * <p>    "config":{"interval":20,"target":"Header","subKey":"aliwaf_wxbb_umid","threshold":50,"ttl":2800},</p>
     * <p>    "action":"deny"</p>
     * <p>  }</p>
     * <p>]</p>
     * <p>```</p>
     * <p>**Rule classification 10: custom session-based throttling**| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| type | String | Yes | custom_cc | The type of the rule. Set the value to custom_cc. |</p>
     * <p>| status | String | Yes | on | Specifies whether to enable the rule. Valid values: on and off. |</p>
     * <p>| config | CustomCcIp | Yes | {"interval":10,"target":"Query String Parameter","subKey":"arg","threshold":30,"ttl":1800} | The configuration of the rule. For more information, see **Fields in the config parameter of custom session-based throttling**. |</p>
     * <p>| action | String | Yes | monitor | The action of the rule. Valid values: deny, monitor, and captcha (only for web). |</p>
     * <p>**Fields in the config parameter of custom session-based throttling**| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| target | String | Yes | Query String Parameter | The statistical fields for frequency control. Valid values: Header, calculates the frequency of requests that contain the specified header; Query String Parameter, calculates the frequency of requests that contain the specified parameter; Cookie Name, calculates the frequency of requests that contain the specified cookie; and Session, calculates the frequency of requests that are transmitted over a specified session. |</p>
     * <p>| subKey | String | No | arg | The subfield of the target field. You can customize the value. |</p>
     * <p>| Interval | Integer | Yes | 10 | The statistical interval. Valid values: 5 to 1800. Unit: seconds. |</p>
     * <p>| threshold | Integer | Yes | 30 | The trigger threshold of rate limiting. Valid values: 2 to 50000. Unit: calls. |</p>
     * <p>| ttl | Integer | Yes | 2800 | The validity period of the blacklist. Valid values: 60 to 86400. Unit: seconds. |</p>
     * <p>Configuration example of custom session-based throttling</p>
     * <br>
     * <p>```</p>
     * <p>[</p>
     * <p>  {</p>
     * <p>    "type":"custom_cc",</p>
     * <p>    "status":"on",</p>
     * <p>    "config":{"interval":10,"target":"Query String Parameter","subKey":"arg","threshold":30,"ttl":1800},</p>
     * <p>    "action":"deny"</p>
     * <p>  },</p>
     * <p>  {</p>
     * <p>    "type":"custom_cc",</p>
     * <p>    "status":"on",</p>
     * <p>    "config":{"interval":10,"target":"Query String Parameter","subKey":"arg","threshold":30,"ttl":1800},</p>
     * <p>    "action":"captcha"</p>
     * <p>  }</p>
     * <p>]</p>
     * <p>```</p>
     * <p>**Rule classification 11: Bot threat intelligence library**| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| type | String | Yes | intelligence | The type of the rule. Set the value to intelligence. |</p>
     * <p>| status | String | Yes | on | Specifies whether to enable the rule. Valid values: on and off. |</p>
     * <p>| config | Intelligence | No | Empty | The configuration of the rule, which is not involved here. Leave the value empty. |</p>
     * <p>| action | String | Yes | captcha | The action of the rule. Valid values: monitor and captcha. |</p>
     * <p>Configuration example of bot threat intelligence library:</p>
     * <br>
     * <p>```</p>
     * <p>[</p>
     * <p>  {</p>
     * <p>    "type":"intelligence",</p>
     * <p>    "status":"on",</p>
     * <p>    "config":{},</p>
     * <p>    "action":"captcha"</p>
     * <p>  }</p>
     * <p>]</p>
     * <p>```</p>
     * <p>**Rule classification 12: data center blacklist**| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| type | String | Yes | intelligence_idc | The type of the rule. Set the value to intelligence_idc. |</p>
     * <p>| status | String | Yes | on | Specifies whether to enable the rule. Valid values: on and off. |</p>
     * <p>| config | IntelligenceIdc | Yes | {"name":"intelligence_idc_alibaba"} | The configuration of the rule. For more information, see **Values of name**. |</p>
     * <p>| action | String | Yes | captcha | The action of the rule. Valid values: deny, monitor, and captcha. |</p>
     * <p>**Values of name**| Value | Description |</p>
     * <p>| ----- | ----------- |</p>
     * <p>| intelligence_idc_alibaba | Data center IP address library-Alibaba Cloud |</p>
     * <p>| intelligence_idc_tencent | Data center IP address library-Tencent Cloud |</p>
     * <p>| intelligence_idc_mtyun | Data center IP address library-Meituan Open Services |</p>
     * <p>| intelligence_idc_vnet | Data center IP address library-21Vianet |</p>
     * <p>| intelligence_idc_other | Data center IP address library-Others |</p>
     * <p>Configuration example of data center blacklist</p>
     * <br>
     * <p>```</p>
     * <p>[</p>
     * <p>  {</p>
     * <p>    "type":"intelligence_idc",</p>
     * <p>    "status":"on",</p>
     * <p>    "config":{"name":"intelligence_idc_alibaba"},</p>
     * <p>    "action":"captcha"</p>
     * <p>  },</p>
     * <p>  {</p>
     * <p>    "type":"intelligence_idc",</p>
     * <p>    "status":"on",</p>
     * <p>    "config":{"name":"intelligence_idc_tencent"},</p>
     * <p>    "action":"captcha"</p>
     * <p>  }</p>
     * <p>]</p>
     * <p>```</p>
     * <p>**Rule classification 13: fake spider blocking**| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| type | String | Yes | intelligence_fake_crawler | The type of the rule. Set the value to intelligence_fake_crawler. |</p>
     * <p>| status | String | Yes | on | Specifies whether to enable the rule. Valid values: on and off. |</p>
     * <p>| config | IntelligenceFakeCrawler | No | Empty | The configuration of the rule, which is not involved here. Leave the value empty. |</p>
     * <p>| action | String | Yes | deny | The action of the rule. Set the value to deny. |</p>
     * <p>Configuration example of fake spider blocking:</p>
     * <br>
     * <p>```</p>
     * <p>[</p>
     * <p>  {</p>
     * <p>    "type": "intelligence_fake_crawler",</p>
     * <p>    "status": "on",</p>
     * <p>    "config":{},</p>
     * <p>    "action": "deny"</p>
     * <p>  }</p>
     * <p>]</p>
     * <p>```</p>
     * <p>**Rule classification 14: Bot characteristic detection**| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| type | String | Yes | app_sdk | The type of the rule. Set the value to app_sdk. |</p>
     * <p>| status | String | Yes | on | Specifies whether to enable the rule. Set the value to on. |</p>
     * <p>| config | AppSdk | Yes | {"featureAbnormal":["simulator","proxy","root","debugged","hook","virtual","antiReplay","signInvalid"],"customSignStatus":"on","customSign":{"key":"header","value":"ua"}} | The configuration of the rule. For more information, see **Fields in the config parameter of Bot characteristic detection**. |</p>
     * <p>| action | String | Yes | monitor | The action of the rule. Valid values: deny and monitor. |</p>
     * <p>**Fields in the config parameter of Bot characteristic detection**| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| featureAbnormal | []String | Yes | simulator | signInvalid: The app signature is invalid. </p>
     * <br>
     * <p>antiReplay: The signature expired. </p>
     * <br>
     * <p>simulator: Uses a simulator.</p>
     * <br>
     * <p>proxy: Uses a proxy.</p>
     * <br>
     * <p>root: Root device.</p>
     * <br>
     * <p>debugged: The debugging mode. </p>
     * <br>
     * <p>hook: The app is hooked. </p>
     * <br>
     * <p>virtual : Multiboxing. |</p>
     * <p>| customSignStatus | String | No | on | Specifies whether to enable the custom signature field. Valid values: on and off. |</p>
     * <p>| customSign | CustomSign | No | {"key":"header","value":"ua"} | The custom signature field. Format:  </p>
     * <br>
     * <p>  (Required) key : the name of the field. Valid values: header, arg, and cookie.  </p>
     * <br>
     * <p> (Required) value: the value of the field. |</p>
     * <p>Configuration example of Bot characteristic detection:</p>
     * <br>
     * <p>```</p>
     * <p>[</p>
     * <p>  {</p>
     * <p>    "type": "app_sdk",</p>
     * <p>    "status": "on",</p>
     * <p>    "config": {"featureAbnormal":["simulator","proxy","root","debugged","hook","virtual","antiReplay","signInvalid"],"customSignStatus":"on","customSign":{"key":"header","value":"ua"}},</p>
     * <p>    "action": "monitor"</p>
     * <p>  }</p>
     * <p>]</p>
     * <p>```</p>
     * <p>**Rule classification 15: advanced protection (secondary packaging detection)**| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| type | String | Yes | app_package | The type of the rule. Set the value to app_package. |</p>
     * <p>| status | String | Yes | on | Specifies whether to enable the rule. Set the value to on. |</p>
     * <p>| config | AppPackage | No | {"packageSigns":[{"name":"aaaaa","sign":"bbbb"},{"name":"cccc","sign":"dddd"}]} | The configuration of the rule. For more information, see **Fields in the packageSigns parameter**. |</p>
     * <p>| action | String | Yes | monitor | The action of the rule. Valid values: deny and monitor. |</p>
     * <p>**Fields in the packageSigns parameter**| Parameter | Type | Required | Example | Description |</p>
     * <p>| --------- | ---- | -------- | ------- | ----------- |</p>
     * <p>| name | String | Yes | aaaaa | The valid package name. |</p>
     * <p>| sign | String | No | bbbb | The signature of the package. |</p>
     * <p>Configuration examples of advanced protection (secondary packaging detection):</p>
     * <br>
     * <p>```</p>
     * <p>[</p>
     * <p>  {</p>
     * <p>    "type": "app_package",</p>
     * <p>    "status": "on",</p>
     * <p>    "config": {"packageSigns":[{"name":"aaaaa","sign":"bbbb"},{"name":"cccc","sign":"dddd"}]},</p>
     * <p>    "action": "deny"</p>
     * <p>  }</p>
     * <p>]</p>
     * <p>```</p>
     * <p>**Configuration example of Bot management and web page/browser protection**```</p>
     * <p>[</p>
     * <p>    {</p>
     * <p>        "type": "target_type",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "target": "web"</p>
     * <p>        },</p>
     * <p>        "action": ""</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "web_sdk",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "mode": "automatic",</p>
     * <p>            "crossDomain": "example.com"</p>
     * <p>        },</p>
     * <p>        "action": ""</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "traffic_feature",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "conditions":</p>
     * <p>            [</p>
     * <p>                {</p>
     * <p>                    "key": "Header",</p>
     * <p>                    "subKey": "User-Agent",</p>
     * <p>                    "opValue": "contain",</p>
     * <p>                    "values": "Chrome"</p>
     * <p>                },</p>
     * <p>                {</p>
     * <p>                    "key": "IP",</p>
     * <p>                    "subKey": "",</p>
     * <p>                    "opValue": "ip-contain",</p>
     * <p>                    "values": "192.168.0.1/24"</p>
     * <p>                }</p>
     * <p>            ]</p>
     * <p>        },</p>
     * <p>        "action": ""</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "intelligence_crawler",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "name": "intelligence_crawler_baidu"</p>
     * <p>        },</p>
     * <p>        "action": "bypass"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "intelligence_crawler",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "name": "intelligence_crawler_google"</p>
     * <p>        },</p>
     * <p>        "action": "bypass"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "js",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {},</p>
     * <p>        "action": "js"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "sigchl",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "sigchl":</p>
     * <p>            [</p>
     * <p>                "sig",</p>
     * <p>                "replay",</p>
     * <p>                "driver"</p>
     * <p>            ]</p>
     * <p>        },</p>
     * <p>        "action": "sigchl"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "algorithm",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {},</p>
     * <p>        "action": "captcha"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "custom_cc_ip",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "interval": 20,</p>
     * <p>            "target": "IP",</p>
     * <p>            "threshold": 50,</p>
     * <p>            "ttl": 2800</p>
     * <p>        },</p>
     * <p>        "action": "monitor"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "custom_cc_ip",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "interval": 10,</p>
     * <p>            "target": "IP",</p>
     * <p>            "threshold": 30,</p>
     * <p>            "ttl": 1800</p>
     * <p>        },</p>
     * <p>        "action": "monitor"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "custom_cc",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "interval": 10,</p>
     * <p>            "target": "Query String Parameter",</p>
     * <p>            "subKey": "arg",</p>
     * <p>            "threshold": 30,</p>
     * <p>            "ttl": 1800</p>
     * <p>        },</p>
     * <p>        "action": "deny"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "custom_cc",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "interval": 10,</p>
     * <p>            "target": "Query String Parameter",</p>
     * <p>            "subKey": "arg",</p>
     * <p>            "threshold": 30,</p>
     * <p>            "ttl": 1800</p>
     * <p>        },</p>
     * <p>        "action": "captcha"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "intelligence",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {},</p>
     * <p>        "action": "captcha"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "intelligence_idc",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "name": "intelligence_idc_alibaba"</p>
     * <p>        },</p>
     * <p>        "action": "captcha"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "intelligence_idc",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "name": "intelligence_idc_tencent"</p>
     * <p>        },</p>
     * <p>        "action": "captcha"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "intelligence_fake_crawler",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {},</p>
     * <p>        "action": "deny"</p>
     * <p>    }</p>
     * <p>]</p>
     * <p>```</p>
     * <p>**Configuration example of Bot management and app protection**```</p>
     * <p>json</p>
     * <p>[</p>
     * <p>    {</p>
     * <p>        "type": "target_type",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "target": "app"</p>
     * <p>        },</p>
     * <p>        "action": ""</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "traffic_feature",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "conditions":</p>
     * <p>            [</p>
     * <p>                {</p>
     * <p>                    "key": "Header",</p>
     * <p>                    "subKey": "User-Agent",</p>
     * <p>                    "opValue": "contain",</p>
     * <p>                    "values": "Chrome"</p>
     * <p>                },</p>
     * <p>                {</p>
     * <p>                    "key": "IP",</p>
     * <p>                    "subKey": "",</p>
     * <p>                    "opValue": "ip-contain",</p>
     * <p>                    "values": "192.168.0.1/24"</p>
     * <p>                }</p>
     * <p>            ]</p>
     * <p>        },</p>
     * <p>        "action": ""</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "custom_cc_ip",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "interval": 20,</p>
     * <p>            "target": "IP",</p>
     * <p>            "threshold": 50,</p>
     * <p>            "ttl": 2800</p>
     * <p>        },</p>
     * <p>        "action": "monitor"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "custom_cc_ip",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "interval": 10,</p>
     * <p>            "target": "IP",</p>
     * <p>            "threshold": 30,</p>
     * <p>            "ttl": 1800</p>
     * <p>        },</p>
     * <p>        "action": "monitor"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "custom_cc_dev",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "interval": 20,</p>
     * <p>            "target": "Header",</p>
     * <p>            "subKey": "aliwaf_wxbb_umid",</p>
     * <p>            "threshold": 50,</p>
     * <p>            "ttl": 2800</p>
     * <p>        },</p>
     * <p>        "action": "monitor"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "custom_cc_dev",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "interval": 20,</p>
     * <p>            "target": "Header",</p>
     * <p>            "subKey": "aliwaf_wxbb_umid",</p>
     * <p>            "threshold": 50,</p>
     * <p>            "ttl": 2800</p>
     * <p>        },</p>
     * <p>        "action": "deny"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "custom_cc",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "interval": 10,</p>
     * <p>            "target": "Query String Parameter",</p>
     * <p>            "subKey": "arg",</p>
     * <p>            "threshold": 30,</p>
     * <p>            "ttl": 1800</p>
     * <p>        },</p>
     * <p>        "action": "monitor"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "custom_cc",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "interval": 10,</p>
     * <p>            "target": "Query String Parameter",</p>
     * <p>            "subKey": "arg",</p>
     * <p>            "threshold": 30,</p>
     * <p>            "ttl": 1800</p>
     * <p>        },</p>
     * <p>        "action": "deny"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "app_sdk",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "featureAbnormal":</p>
     * <p>            [</p>
     * <p>                "simulator",</p>
     * <p>                "proxy",</p>
     * <p>                "root",</p>
     * <p>                "debugged",</p>
     * <p>                "hook",</p>
     * <p>                "virtual",</p>
     * <p>                "antiReplay",</p>
     * <p>                "signInvalid"</p>
     * <p>            ],</p>
     * <p>            "customSignStatus": "on",</p>
     * <p>            "customSign":</p>
     * <p>            {</p>
     * <p>                "key": "header",</p>
     * <p>                "value": "ua"</p>
     * <p>            }</p>
     * <p>        },</p>
     * <p>        "action": "monitor"</p>
     * <p>    },</p>
     * <p>    {</p>
     * <p>        "type": "app_package",</p>
     * <p>        "status": "on",</p>
     * <p>        "config":</p>
     * <p>        {</p>
     * <p>            "packageSigns":</p>
     * <p>            [</p>
     * <p>                {</p>
     * <p>                    "name": "aaaaa",</p>
     * <p>                    "sign": "bbbb"</p>
     * <p>                },</p>
     * <p>                {</p>
     * <p>                    "name": "cccc",</p>
     * <p>                    "sign": "dddd"</p>
     * <p>                }</p>
     * <p>            ]</p>
     * <p>        },</p>
     * <p>        "action": "deny"</p>
     * <p>    }</p>
     * <p>]</p>
     * <p>```</p>
     */
    @NameInMap("RuleConfigs")
    public String ruleConfigs;

    public static BatchCreateDcdnWafRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateDcdnWafRulesRequest self = new BatchCreateDcdnWafRulesRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateDcdnWafRulesRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public BatchCreateDcdnWafRulesRequest setRuleConfigs(String ruleConfigs) {
        this.ruleConfigs = ruleConfigs;
        return this;
    }
    public String getRuleConfigs() {
        return this.ruleConfigs;
    }

}
