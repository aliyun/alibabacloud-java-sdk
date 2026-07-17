// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetUserMaxPlanQuotaRequest extends TeaModel {
    /**
     * <p>The plan quota name. Valid values:</p>
     * <ul>
     * <li><strong>waf:phase:http_anti_scan:actions</strong>: WAF scan protection - action enumeration.</li>
     * <li><strong>waf:phase:http_bot:actions</strong>: WAF bot management - all action enumeration.</li>
     * <li><strong>waf:phase:http_bot:http_custom_cc_dev:characteristic:fields</strong>: WAF bot management - custom device rate limiting type statistical object enumeration.</li>
     * <li><strong>waf:phase:http_bot:http_custom_cc_ip:characteristic:fields</strong>: WAF bot management - custom IP rate limiting type statistical object enumeration.</li>
     * <li><strong><strong>waf:phase:http_bot:match:symbols</strong></strong>: WAF bot management - match operator enumeration.</li>
     * <li><strong>waf:phase:http_bot:http_custom_cc:characteristic:fields</strong>: WAF bot management - custom session rate limiting type statistical object enumeration.</li>
     * <li><strong>waf:phase:http_bot:match:fields</strong>: WAF bot management - match field enumeration.</li>
     * <li><strong>waf:phase:http_whitelist:match:symbols</strong>: WAF whitelist - match operator enumeration.</li>
     * <li><strong>waf:phase:http_whitelist:match:fields</strong>: WAF whitelist - match field enumeration.</li>
     * <li><strong>waf:phase:http_anti_scan:http_directory_traversal:characteristic:fields</strong>: WAF scan protection - folder traverse blocking type statistical object enumeration.</li>
     * <li><strong>waf:phase:http_anti_scan:http_high_frequency:characteristic:fields</strong>: WAF scan protection - high-frequency scan blocking type statistical object enumeration.</li>
     * <li><strong>waf:phase:http_anti_scan:match:symbols</strong>: WAF scan protection - match operator enumeration.</li>
     * <li><strong>waf:phase:http_anti_scan:match:fields</strong>: WAF scan protection - match field enumeration.</li>
     * <li><strong>waf:phase:http_managed:actions</strong>: WAF managed rules - action enumeration.</li>
     * <li><strong>waf:phase:http_managed:group:reference:ids</strong>: WAF managed rules - referenced rule group enumeration.</li>
     * <li><strong>waf:phase:http_ratelimit:actions</strong>: WAF rate limiting - action enumeration.</li>
     * <li><strong>waf:phase:http_ratelimit:ttls</strong>: WAF rate limiting - duration enumeration.</li>
     * <li><strong>waf:phase:http_ratelimit:intervals</strong>: WAF rate limiting - statistical duration.</li>
     * <li><strong>waf:phase:http_ratelimit:http_ratelimit:characteristic:fields</strong>: WAF rate limiting - control type rule - match characteristic enumeration.</li>
     * <li><strong>waf:phase:http_ratelimit:match:symbols</strong>: WAF rate limiting rule phase match operator enumeration.</li>
     * <li><strong>waf:phase:http_ratelimit:match:fields</strong>: WAF rate limiting rule phase match field enumeration.</li>
     * <li><strong>waf:phase:http_custom:actions</strong>: WAF custom rule phase action enumeration.</li>
     * <li><strong>waf:phase:http_custom:match:symbols</strong>: WAF custom rule phase match operator enumeration.</li>
     * <li><strong>waf:phase:http_custom:match:fields</strong>: WAF custom rule phase match field.</li>
     * <li><strong>waiting_room|queuing_method</strong>: Waiting room - queuing method.</li>
     * <li><strong>origin_rules|origin_scheme</strong>: Back-to-origin rules - back-to-origin protocol.</li>
     * <li><strong>origin_rules|origin_sni</strong>: Back-to-origin rules - back-to-origin SNI.</li>
     * <li><strong>origin_rules|origin_host</strong>: Back-to-origin rules - back-to-origin host.</li>
     * <li><strong>fourlayeracceleration</strong>: Layer 4 acceleration.</li>
     * <li><strong>rtlog_service</strong>: Real-time log feature switch.</li>
     * <li><strong>dashboard_traffic</strong>: Value-added capability of network traffic analysis.</li>
     * <li><strong>custom_name_server</strong>: Custom NS name.</li>
     * <li><strong>waf:phase:http_bot:enable</strong>: WAF bot management switch.</li>
     * <li><strong>waf:phase:http_whitelist:enable</strong>: WAF whitelist switch.</li>
     * <li><strong>instantlog</strong>: Instant log active or not.</li>
     * <li><strong>waf:phase:http_anti_scan:enable</strong>: WAF scan protection switch.</li>
     * <li><strong>waf:phase:http_managed:group:reference:enable</strong>: WAF managed rules - referenced rule group configuration switch.</li>
     * <li><strong>waf:phase:http_managed:enable</strong>: WAF managed rules switch.</li>
     * <li><strong>waf:phase:http_ratelimit:on_hit:enable</strong>: WAF rate limiting - apply on cache-hit requests switch.</li>
     * <li><strong>ddos</strong>: DDoS instance.</li>
     * <li><strong>waf:phase:http_ratelimit:enable</strong>: WAF rate limiting rule phase switch.</li>
     * <li><strong>waf:phase:http_custom:enable</strong>: WAF custom rule phase switch.</li>
     * <li><strong>waf:phase:all:page:reference:enable</strong>: WAF custom response page switch.</li>
     * <li><strong>rules_support_regex</strong>: Specifies whether the DPI engine supports regular expressions.</li>
     * <li><strong>waiting_room_event</strong>: Waiting room - scheduled event.</li>
     * <li><strong>waiting_room_rule</strong>: Waiting room - bypass waiting room.</li>
     * <li><strong>waiting_room|json_response</strong>: Waiting room - enable JSON response.</li>
     * <li><strong>waiting_room|disable_session_renewal</strong>: Waiting room - disable session renewal.</li>
     * <li><strong>origin_rules|dns_record</strong>: Back-to-origin rules - DNS record.</li>
     * <li><strong>managed_transforms|add_client_geolocation_headers</strong>: Specifies whether the real client IP header is active in transform rules.</li>
     * <li><strong>tiered_cache|regional_enable</strong>: Area cache.</li>
     * <li><strong>real_client_ip_header</strong>: Client IP header.</li>
     * <li><strong>data_timerange</strong>: Data query time range - in minutes.</li>
     * <li><strong>cache_rules|edge_cache_ttl</strong>: Cache - node TTL.</li>
     * <li><strong>cache_rules|browser_cache_ttl</strong>: Cache - browser TTL.</li>
     * <li><strong>fourLayerRecordCount</strong>: Record count limit for Layer 4 acceleration.</li>
     * <li><strong>waitingroomRuleCount</strong>: Maximum number of rules per waiting room ID.</li>
     * <li><strong>waitingroomEventCount</strong>: Maximum number of events per waiting room ID.</li>
     * <li><strong>waitingroom_custom_pathhost</strong>: Waiting room - hostname and path.</li>
     * <li><strong>er_routers</strong>: Function routing.</li>
     * <li><strong>cache_rules|rule_quota</strong>: Cache rules.</li>
     * <li><strong>configuration_rules|rule_quota</strong>: Configuration rules.</li>
     * <li><strong>redirect_rules|rule_quota</strong>: Redirect rules.</li>
     * <li><strong>compression_rules|rule_quota</strong>: Compression rules.</li>
     * <li><strong>origin_rules|rule_quota</strong>: Back-to-origin rules.</li>
     * <li><strong>waf:phase:http_bot:rulesets_per_instance:less_than_or_equal</strong>: WAF bot management - maximum number of rule groups per instance.</li>
     * <li><strong>waf:phase:http_whitelist:rules_per_instance:less_than_or_equal</strong>: WAF whitelist - maximum number of rules per instance.</li>
     * <li><strong>rtlog_quota</strong>: Quota for real-time log push node count.</li>
     * <li><strong>waf:phase:http_anti_scan:rulesets_per_instance:less_than_or_equal</strong>: WAF scan protection - maximum number of rule groups per instance.</li>
     * <li><strong>ddos_instance</strong>: Number of DDoS instances.</li>
     * <li><strong>waf:phase:http_ratelimit:rules_per_instance:less_than_or_equal</strong>: Maximum number of WAF rate limiting rules.</li>
     * <li><strong>waf:phase:http_custom:rules_per_instance:less_than_or_equal</strong>: WAF custom rule phase - maximum number of rules per instance.</li>
     * <li><strong>ruleNestedConditionalCount</strong>: Number of rule nesting levels.</li>
     * <li><strong>waiting_room</strong>: Waiting room.</li>
     * <li><strong>transition_rule</strong>: Transform rules.</li>
     * <li><strong>customHttpCert</strong>: Number of custom certificates.</li>
     * <li><strong>free_cert</strong>: Number of free certificates.</li>
     * <li><strong>preload</strong>: Resource prefetch.</li>
     * <li><strong>refresh_cache_tag</strong>: Refresh - cache tag.</li>
     * <li><strong>refresh_ignore_param</strong>: Refresh - purge without parameters.</li>
     * <li><strong>refresh_directory</strong>: Refresh - purge by folder.</li>
     * <li><strong>refresh_hostname</strong>: Refresh - purge by hostname.</li>
     * <li><strong>refresh_all</strong>: Refresh - purge all cache.</li>
     * <li><strong>refresh_file</strong>: URL refresh.</li>
     * <li><strong>wildcard</strong>: Number of wildcard domain names.</li>
     * <li><strong>recordCount</strong>: Number of Layer 7 records.</li>
     * <li><strong>siteCount</strong>: Number of sites.</li>
     * <li><strong>https|rule_quota</strong>: Number of SSL/TLS rules.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>siteCount</p>
     */
    @NameInMap("QuotaName")
    public String quotaName;

    public static GetUserMaxPlanQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserMaxPlanQuotaRequest self = new GetUserMaxPlanQuotaRequest();
        return TeaModel.build(map, self);
    }

    public GetUserMaxPlanQuotaRequest setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
    }

}
