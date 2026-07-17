// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListInstancesQuotaRequest extends TeaModel {
    /**
     * <p>Multiple instance IDs separated by commas (,). You can obtain instance IDs by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-xcdn-96wblslz****,sp-xcdn-81wblslz****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The quota name. Separate multiple names with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>waf:phase:http_anti_scan:actions</strong>: WAF scan protection - action enumeration.</li>
     * <li><strong>waf:phase:http_bot:actions</strong>: WAF bot management - all action enumeration.</li>
     * <li><strong>waf:phase:http_bot:http_custom_cc_dev:characteristic:fields</strong>: WAF bot management - custom device rate limiting statistical object enumeration.</li>
     * <li><strong>waf:phase:http_bot:http_custom_cc_ip:characteristic:fields</strong>: WAF bot management - custom IP rate limiting statistical object enumeration.</li>
     * <li><strong>waf:phase:http_bot:match:symbols</strong>: WAF bot management - match operator enumeration.</li>
     * <li><strong>waf:phase:http_bot:http_custom_cc:characteristic:fields</strong>: WAF bot management - custom session rate limiting statistical object enumeration.</li>
     * <li><strong>waf:phase:http_bot:match:fields</strong>: WAF bot management - match field enumeration.</li>
     * <li><strong>waf:phase:http_whitelist:match:symbols</strong>: WAF whitelist - match operator enumeration.</li>
     * <li><strong>waf:phase:http_whitelist:match:fields</strong>: WAF whitelist - match field enumeration.</li>
     * <li><strong>waf:phase:http_anti_scan:http_directory_traversal:characteristic:fields</strong>: WAF scan protection - folder traverse blocking statistical object enumeration.</li>
     * <li><strong>waf:phase:http_anti_scan:http_high_frequency:characteristic:fields</strong>: WAF scan protection - high-frequency scan blocking statistical object enumeration.</li>
     * <li><strong>waf:phase:http_anti_scan:match:symbols</strong>: WAF scan protection - match operator enumeration.</li>
     * <li><strong>waf:phase:http_anti_scan:match:fields</strong>: WAF scan protection - match field enumeration.</li>
     * <li><strong>waf:phase:http_managed:actions</strong>: WAF managed rules - action enumeration.</li>
     * <li><strong>waf:phase:http_managed:group:reference:ids</strong>: WAF managed rules - referenced rule group enumeration.</li>
     * <li><strong>waf:phase:http_ratelimit:actions</strong>: WAF rate limiting - action enumeration.</li>
     * <li><strong>waf:phase:http_ratelimit:ttls</strong>: WAF rate limiting - duration enumeration.</li>
     * <li><strong>waf:phase:http_ratelimit:intervals</strong>: WAF rate limiting - statistical period.</li>
     * <li><strong>waf:phase:http_ratelimit:http_ratelimit:characteristic:fields</strong>: WAF rate limiting - control type rule match characteristic enumeration.</li>
     * <li><strong>waf:phase:http_ratelimit:match:symbols</strong>: WAF rate limiting rule phase match operator enumeration.</li>
     * <li><strong>waf:phase:http_ratelimit:match:fields</strong>: WAF rate limiting rule phase match field enumeration.</li>
     * <li><strong>waf:phase:http_custom:actions</strong>: WAF custom rule phase action enumeration.</li>
     * <li><strong>waf:phase:http_custom:match:symbols</strong>: WAF custom rule phase match operator enumeration.</li>
     * <li><strong>waf:phase:http_custom:match:fields</strong>: WAF custom rule phase match field.</li>
     * <li><strong>waiting_roomqueuing_method</strong>: waiting room - queuing method.</li>
     * <li><strong>origin_rulesorigin_scheme</strong>: back-to-origin rules - back-to-origin protocol.</li>
     * <li><strong>origin_rulesorigin_sni</strong>: back-to-origin rules - back-to-origin SNI.</li>
     * <li><strong>origin_rulesorigin_host</strong>: back-to-origin rules - back-to-origin host.</li>
     * <li><strong>fourlayeracceleration</strong>: Layer 4 acceleration.</li>
     * <li><strong>rtlog_service</strong>: real-time log feature switch.</li>
     * <li><strong>dashboard_traffic</strong>: value-added capability of network traffic analysis.</li>
     * <li><strong>custom_name_server</strong>: custom NS name.</li>
     * <li><strong>waf:phase:http_bot:enable</strong>: WAF bot management switch.</li>
     * <li><strong>waf:phase:http_whitelist:enable</strong>: WAF whitelist switch.</li>
     * <li><strong>instantlog</strong>: instant log active or inactive.</li>
     * <li><strong>waf:phase:http_anti_scan:enable</strong>: WAF scan protection switch.</li>
     * <li><strong>waf:phase:http_managed:group:reference:enable</strong>: WAF managed rules - referenced rule group configuration switch.</li>
     * <li><strong>waf:phase:http_managed:enable</strong>: WAF managed rules switch.</li>
     * <li><strong>waf:phase:http_ratelimit:on_hit:enable</strong>: WAF rate limiting - apply on cache-hit requests switch.</li>
     * <li><strong>ddos</strong>: DDoS instance.</li>
     * <li><strong>waf:phase:http_ratelimit:enable</strong>: WAF rate limiting rule phase switch.</li>
     * <li><strong>waf:phase:http_custom:enable</strong>: WAF custom rule phase switch.</li>
     * <li><strong>waf:phase:all:page:reference:enable</strong>: WAF custom response page switch.</li>
     * <li><strong>rules_support_regex</strong>: whether the rule DPI engine supports regular expressions.</li>
     * <li><strong>waiting_room_event</strong>: waiting room - scheduled event.</li>
     * <li><strong>waiting_room_rule</strong>: waiting room - bypass waiting room.</li>
     * <li><strong>waiting_roomjson_response</strong>: waiting room - enable JSON response.</li>
     * <li><strong>waiting_roomdisable_session_renewal</strong>: waiting room - disable session renewal.</li>
     * <li><strong>origin_rulesdns_record</strong>: back-to-origin rules - DNS record.</li>
     * <li><strong>managed_transformsadd_client_geolocation_headers</strong>: whether the real client IP header is active in transform rules.</li>
     * <li><strong>tiered_cacheregional_enable</strong>: area cache.</li>
     * <li><strong>real_client_ip_header</strong>: client IP header.</li>
     * <li><strong>data_timerange</strong>: data query time range in minutes.</li>
     * <li><strong>cache_rulesedge_cache_ttl</strong>: cache - edge TTL.</li>
     * <li><strong>cache_rulesbrowser_cache_ttl</strong>: cache - browser TTL.</li>
     * <li><strong>fourLayerRecordCount</strong>: record count limit for Layer 4 acceleration.</li>
     * <li><strong>waitingroomRuleCount</strong>: maximum number of rules per waiting room ID.</li>
     * <li><strong>waitingroomEventCount</strong>: maximum number of events per waiting room ID.</li>
     * <li><strong>waitingroom_custom_pathhost</strong>: waiting room - hostname and path.</li>
     * <li><strong>er_routers</strong>: function routing.</li>
     * <li><strong>cache_rulesrule_quota</strong>: cache rules.</li>
     * <li><strong>configuration_rulesrule_quota</strong>: configuration rules.</li>
     * <li><strong>redirect_rulesrule_quota</strong>: redirect rules.</li>
     * <li><strong>compression_rulesrule_quota</strong>: compression rules.</li>
     * <li><strong>origin_rulesrule_quota</strong>: back-to-origin rules.</li>
     * <li><strong>waf:phase:http_bot:rulesets_per_instance:less_than_or_equal</strong>: WAF bot management - maximum number of rule groups per instance.</li>
     * <li><strong>waf:phase:http_whitelist:rules_per_instance:less_than_or_equal</strong>: WAF whitelist - maximum number of rules per instance.</li>
     * <li><strong>rtlog_quota</strong>: quota for real-time log push node count.</li>
     * <li><strong>waf:phase:http_anti_scan:rulesets_per_instance:less_than_or_equal</strong>: WAF scan protection - maximum number of rule groups per instance.</li>
     * <li><strong>ddos_instance</strong>: number of DDoS instances.</li>
     * <li><strong>waf:phase:http_ratelimit:rules_per_instance:less_than_or_equal</strong>: maximum number of WAF rate limiting rules.</li>
     * <li><strong>waf:phase:http_custom:rules_per_instance:less_than_or_equal</strong>: WAF custom rule phase - maximum number of rules per instance.</li>
     * <li><strong>ruleNestedConditionalCount</strong>: number of nesting levels for rules.</li>
     * <li><strong>waiting_room</strong>: waiting room.</li>
     * <li><strong>transition_rule</strong>: transform rule.</li>
     * <li><strong>customHttpCert</strong>: number of custom certificates.</li>
     * <li><strong>free_cert</strong>: number of free certificates.</li>
     * <li><strong>preload</strong>: resource prefetch.</li>
     * <li><strong>refresh_cache_tag</strong>: refresh - cache tag.</li>
     * <li><strong>refresh_ignore_param</strong>: refresh - purge without parameters.</li>
     * <li><strong>refresh_directory</strong>: refresh - purge by folder.</li>
     * <li><strong>refresh_hostname</strong>: refresh - purge by hostname.</li>
     * <li><strong>refresh_all</strong>: refresh - purge all cache.</li>
     * <li><strong>refresh_file</strong>: URL purge.</li>
     * <li><strong>wildcard</strong>: number of wildcard domain names.</li>
     * <li><strong>recordCount</strong>: number of Layer 7 records.</li>
     * <li><strong>siteCount</strong>: number of sites.</li>
     * <li><strong>httpsrule_quota</strong>: number of SSL/TLS rules.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf:phase:http_anti_scan:actions, waf:phase:http_bot:actions, siteCount</p>
     */
    @NameInMap("QuotaName")
    public String quotaName;

    public static ListInstancesQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesQuotaRequest self = new ListInstancesQuotaRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesQuotaRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public ListInstancesQuotaRequest setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
    }

}
