// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListInstanceQuotasRequest extends TeaModel {
    /**
     * <p>The plan instance ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the ID. You must specify at least one of this parameter and SiteId.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-xcdn-96wblslz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The plan quota names, separated by commas (,). Valid values:</p>
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
     * <li><strong>waiting_room|queuing_method</strong>: waiting room - queuing method.</li>
     * <li><strong>origin_rules|origin_scheme</strong>: back-to-origin rules - back-to-origin protocol.</li>
     * <li><strong>origin_rules|origin_sni</strong>: back-to-origin rules - back-to-origin SNI.</li>
     * <li><strong>origin_rules|origin_host</strong>: back-to-origin rules - back-to-origin host.</li>
     * <li><strong>fourlayeracceleration</strong>: Layer 4 acceleration.</li>
     * <li><strong>rtlog_service</strong>: real-time log feature switch.</li>
     * <li><strong>dashboard_traffic</strong>: value-added network traffic analysis capability.</li>
     * <li><strong>custom_name_server</strong>: custom NS name.</li>
     * <li><strong>waf:phase:http_bot:enable</strong>: WAF bot management switch.</li>
     * <li><strong>waf:phase:http_whitelist:enable</strong>: WAF whitelist switch.</li>
     * <li><strong>instantlog</strong>: instant log active or not.</li>
     * <li><strong>waf:phase:http_anti_scan:enable</strong>: WAF scan protection switch.</li>
     * <li><strong>waf:phase:http_managed:group:reference:enable</strong>: WAF managed rules - referenced rule group configuration switch.</li>
     * <li><strong>waf:phase:http_managed:enable</strong>: WAF managed rules switch.</li>
     * <li><strong>waf:phase:http_ratelimit:on_hit:enable</strong>: WAF rate limiting - apply to cache-hit requests switch.</li>
     * <li><strong>ddos</strong>: DDoS instance.</li>
     * <li><strong>waf:phase:http_ratelimit:enable</strong>: WAF rate limiting rule phase switch.</li>
     * <li><strong>waf:phase:http_custom:enable</strong>: WAF custom rule phase switch.</li>
     * <li><strong>waf:phase:all:page:reference:enable</strong>: WAF custom response page switch.</li>
     * <li><strong>rules_support_regex</strong>: whether the rule DPI engine supports regular expressions.</li>
     * <li><strong>waiting_room_event</strong>: waiting room - scheduled event.</li>
     * <li><strong>waiting_room_rule</strong>: waiting room - bypass waiting room.</li>
     * <li><strong>waiting_room|json_response</strong>: waiting room - enable JSON response.</li>
     * <li><strong>waiting_room|disable_session_renewal</strong>: waiting room - disable session renewal.</li>
     * <li><strong>origin_rules|dns_record</strong>: back-to-origin rules - DNS record.</li>
     * <li><strong>managed_transforms|add_client_geolocation_headers</strong>: whether the real client IP header is active in transform rules.</li>
     * <li><strong>tiered_cache|regional_enable</strong>: area cache.</li>
     * <li><strong>real_client_ip_header</strong>: client IP header.</li>
     * <li><strong>data_timerange</strong>: data query time range in minutes.</li>
     * <li><strong>cache_rules|edge_cache_ttl</strong>: cache - node TTL.</li>
     * <li><strong>cache_rules|browser_cache_ttl</strong>: cache - browser TTL.</li>
     * <li><strong>fourLayerRecordCount</strong>: record count limit for Layer 4 acceleration.</li>
     * <li><strong>waitingroomRuleCount</strong>: maximum number of rules per waiting room ID.</li>
     * <li><strong>waitingroomEventCount</strong>: maximum number of events per waiting room ID.</li>
     * <li><strong>waitingroom_custom_pathhost</strong>: waiting room - hostname and path.</li>
     * <li><strong>er_routers</strong>: function routing.</li>
     * <li><strong>cache_rules|rule_quota</strong>: cache rules.</li>
     * <li><strong>configuration_rules|rule_quota</strong>: configuration rules.</li>
     * <li><strong>redirect_rules|rule_quota</strong>: redirect rules.</li>
     * <li><strong>compression_rules|rule_quota</strong>: compression rules.</li>
     * <li><strong>origin_rules|rule_quota</strong>: back-to-origin rules.</li>
     * <li><strong>waf:phase:http_bot:rulesets_per_instance:less_than_or_equal</strong>: WAF bot management - maximum number of rule groups per instance.</li>
     * <li><strong>waf:phase:http_whitelist:rules_per_instance:less_than_or_equal</strong>: WAF whitelist - maximum number of rules per instance.</li>
     * <li><strong>rtlog_quota</strong>: quota for real-time log push node count.</li>
     * <li><strong>waf:phase:http_anti_scan:rulesets_per_instance:less_than_or_equal</strong>: WAF scan protection - maximum number of rule groups per instance.</li>
     * <li><strong>ddos_instance</strong>: number of DDoS instances.</li>
     * <li><strong>waf:phase:http_ratelimit:rules_per_instance:less_than_or_equal</strong>: maximum number of WAF rate limiting rules.</li>
     * <li><strong>waf:phase:http_custom:rules_per_instance:less_than_or_equal</strong>: maximum number of WAF custom rules per instance.</li>
     * <li><strong>ruleNestedConditionalCount</strong>: number of nesting levels for rules.</li>
     * <li><strong>waiting_room</strong>: waiting room.</li>
     * <li><strong>transition_rule</strong>: transform rules.</li>
     * <li><strong>customHttpCert</strong>: number of custom certificates.</li>
     * <li><strong>free_cert</strong>: number of free certificates.</li>
     * <li><strong>preload</strong>: resource prefetch.</li>
     * <li><strong>refresh_cache_tag</strong>: refresh - cache tag.</li>
     * <li><strong>refresh_ignore_param</strong>: refresh - purge without parameters.</li>
     * <li><strong>refresh_directory</strong>: refresh - purge by folder.</li>
     * <li><strong>refresh_hostname</strong>: refresh - purge by hostname.</li>
     * <li><strong>refresh_all</strong>: refresh - purge all cache.</li>
     * <li><strong>refresh_file</strong>: URL refresh.</li>
     * <li><strong>wildcard</strong>: number of wildcard domain names.</li>
     * <li><strong>recordCount</strong>: number of Layer 7 records.</li>
     * <li><strong>siteCount</strong>: number of sites.</li>
     * <li><strong>https|rule_quota</strong>: number of SSL/TLS rules.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf:phase:http_anti_scan:actions, waf:phase:http_bot:actions, siteCount</p>
     */
    @NameInMap("QuotaNames")
    public String quotaNames;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the ID. You must specify at least one of this parameter and InstanceId.</p>
     * 
     * <strong>example:</strong>
     * <p>2882900****</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static ListInstanceQuotasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceQuotasRequest self = new ListInstanceQuotasRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceQuotasRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstanceQuotasRequest setQuotaNames(String quotaNames) {
        this.quotaNames = quotaNames;
        return this;
    }
    public String getQuotaNames() {
        return this.quotaNames;
    }

    public ListInstanceQuotasRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
