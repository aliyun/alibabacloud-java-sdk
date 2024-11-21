// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListInstanceQuotasRequest extends TeaModel {
    /**
     * <p>The plan ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-xcdn-96wblslz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The quota names in the plan. Separate multiple names with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>waf:phase:http_anti_scan:actions</strong>: the actions in WAF scan protection rules.</li>
     * <li><strong>waf:phase:http_bot:actions</strong>: all actions in WAF bot management rules.</li>
     * <li><strong>waf:phase:http_bot:http_custom_cc_dev:characteristic:fields</strong>: the statistical objects for the custom device-based throttling in WAF bot management rules.</li>
     * <li><strong>waf:phase:http_bot:http_custom_cc_ip:characteristic:fields</strong>: the statistical objects for the custom IP address-based throttling in WAF bot management rules.</li>
     * <li><strong><strong>waf:phase:http_bot:match:symbols</strong></strong>: the match operators in WAF bot management rules.</li>
     * <li><strong>waf:phase:http_bot:http_custom_cc:characteristic:fields</strong>: the statistical objects for the custom session-based throttling in WAF bot management rules.</li>
     * <li><strong>waf:phase:http_bot:match:fields</strong>: the match fields in WAF bot management rules.</li>
     * <li><strong>waf:phase:http_whitelist:match:symbols</strong>: the match operators in WAF whitelist rules.</li>
     * <li><strong>waf:phase:http_whitelist:match:fields</strong>: the match fields in WAF whitelist rules.</li>
     * <li><strong>waf:phase:http_anti_scan:http_directory_traversal:characteristic:fields</strong>: the statistical objects for directory traversal blocking in WAF scan protection rules.</li>
     * <li><strong>waf:phase:http_anti_scan:http_high_frequency:characteristic:fields</strong>: the statistical objects for high-frequency scanning blocking in WAF scan protection rules.</li>
     * <li><strong>waf:phase:http_anti_scan:match:symbols</strong>: the match operators in WAF scan protection rules.</li>
     * <li><strong>waf:phase:http_anti_scan:match:fields</strong>: the match fields in WAF scan protection rules.</li>
     * <li><strong>waf:phase:http_managed:actions</strong>: the actions in WAF managed rules.</li>
     * <li><strong>waf:phase:http_managed:group:reference:ids</strong>: the referenced rule groups in WAF managed rules.</li>
     * <li><strong>waf:phase:http_ratelimit:actions</strong>: the actions in WAF rate limiting rules.</li>
     * <li><strong>waf:phase:http_ratelimit:ttls</strong>: the action durations in WAF rate limiting rules.</li>
     * <li><strong>waf:phase:http_ratelimit:intervals</strong>: the statistical durations in WAF rate limiting rules.</li>
     * <li><strong>waf:phase:http_ratelimit:http_ratelimit:characteristic:fields</strong>: the match characteristics in WAF rate limiting rules.</li>
     * <li><strong>waf:phase:http_ratelimit:match:symbols</strong>: the match operators in WAF rate limiting rules.</li>
     * <li><strong>waf:phase:http_ratelimit:match:fields</strong>: the match fields in WAF rate limiting rules.</li>
     * <li><strong>waf:phase:http_custom:actions</strong>: the actions in custom WAF rules.</li>
     * <li><strong>waf:phase:http_custom:match:symbols</strong>: the match operators in custom WAF rules.</li>
     * <li><strong>waf:phase:http_custom:match:fields</strong>: the match fields in custom WAF rules.</li>
     * <li><strong>waiting_room|queuing_method</strong>: the queuing method in Waiting Room.</li>
     * <li><strong>origin_rules|origin_scheme</strong>: the origin protocol in origin rules.</li>
     * <li><strong>origin_rules|origin_sni</strong>: the origin Server Name Indication (SNI) in origin rules.</li>
     * <li><strong>origin_rules|origin_host</strong>: the origin host in origin rules.</li>
     * <li><strong>fourlayeracceleration</strong>: TCP/UDP proxy.</li>
     * <li><strong>rtlog_service</strong>: the availability to collect real-time logs.</li>
     * <li><strong>dashboard_traffic</strong>: the value-added capability of traffic analytics.</li>
     * <li><strong>custom_name_server</strong>: the availability to configure custom nameservers.</li>
     * <li><strong>waf:phase:http_bot:enable</strong>: the availability to enable WAF bot management.</li>
     * <li><strong>waf:phase:http_whitelist:enable</strong>: the availability to configure WAF whitelist rules.</li>
     * <li><strong>instantlog</strong>: the availability to collect instant logs.</li>
     * <li><strong>waf:phase:http_anti_scan:enable</strong>: the availability to enable WAF scan protection.</li>
     * <li><strong>waf:phase:http_managed:group:reference:enable</strong>: the availability to configure reference rule groups in WAF managed rules.</li>
     * <li><strong>waf:phase:http_managed:enable</strong>: the availability to configure WAF managed rules.</li>
     * <li><strong>waf:phase:http_ratelimit:on_hit:enable</strong>: the availability to configure whether to apply rate limiting to all requests that hit the cache.</li>
     * <li><strong>ddos</strong>: DDoS mitigation.</li>
     * <li><strong>waf:phase:http_ratelimit:enable</strong>: the availability to configure WAF rate limiting.</li>
     * <li><strong>waf:phase:http_custom:enable</strong>: the availability to configure custom WAF rules.</li>
     * <li><strong>waf:phase:all:page:reference:enable</strong>: the availability to configure custom error pages.</li>
     * <li><strong>rules_support_regex</strong>: the support for regular expressions in rules engine.</li>
     * <li><strong>waiting_room_event</strong>: scheduled events in Waiting Room.</li>
     * <li><strong>waiting_room_rule</strong>: the availability to allow requests to bypass the waiting room.</li>
     * <li><strong>waiting_room|json_response</strong>: the availability to enable JSON response in Waiting Room.</li>
     * <li><strong>waiting_room|disable_session_renewal</strong>: the availability to disable session renewal in Waiting Room.</li>
     * <li><strong>origin_rules|dns_record</strong>: DNS records in origin rules.</li>
     * <li><strong>managed_transforms|add_client_geolocation_headers</strong>: the availability to configure whether to add geolocation headers in transform rules.</li>
     * <li><strong>tiered_cache|regional_enable</strong>: regional tiered cache.</li>
     * <li><strong>real_client_ip_header</strong>: the availability to configure whether to add the real IP address of a client to the request header.</li>
     * <li><strong>data_timerange</strong>: minute-level time range for data query.</li>
     * <li><strong>cache_rules|edge_cache_ttl</strong>: POP cache TTL.</li>
     * <li><strong>cache_rules|browser_cache_ttl</strong>: browser cache TTL.</li>
     * <li><strong>fourLayerRecordCount</strong>: the maximum number of records of websites for which TCP/UDP acceleration is enabled.</li>
     * <li><strong>waitingroomRuleCount</strong>: the maximum number of rules per waiting room.</li>
     * <li><strong>waitingroomEventCount</strong>: the maximum number of events per waiting room.</li>
     * <li><strong>waitingroom_custom_pathhost</strong>: the availability to configure the hostname and path in Waiting Room.</li>
     * <li><strong>er_routers</strong>: Edge Routine routes.</li>
     * <li><strong>cache_rules|rule_quota</strong>: the maximum number of cache rules.</li>
     * <li><strong>configuration_rules|rule_quota</strong>: the maximum number of configuration rules.</li>
     * <li><strong>redirect_rules|rule_quota</strong>: the redirect rules.</li>
     * <li><strong>compression_rules|rule_quota</strong>: the maximum number of compression rules.</li>
     * <li><strong>origin_rules|rule_quota</strong>: the maximum number of origin rules.</li>
     * <li><strong>waf:phase:http_bot:rulesets_per_instance:less_than_or_equal</strong>: the maximum number of rulesets in WAF bot management per plan.</li>
     * <li><strong>waf:phase:http_whitelist:rules_per_instance:less_than_or_equal</strong>: the maximum number of WAF whitelist rules per plan.</li>
     * <li><strong>rtlog_quota</strong>: the maximum number of real-time log delivery tasks.</li>
     * <li><strong>waf:phase:http_anti_scan:rulesets_per_instance:less_than_or_equal</strong>: the maximum number of rulesets in WAF scan protection per plan.</li>
     * <li><strong>ddos_instance</strong>: the number of Anti-DDoS Proxy instances.</li>
     * <li><strong>waf:phase:http_ratelimit:rules_per_instance:less_than_or_equal</strong>: the maximum number of WAF rate limiting rules.</li>
     * <li><strong>waf:phase:http_custom:rules_per_instance:less_than_or_equal</strong>: the maximum number of custom WAF rules per plan.</li>
     * <li><strong>ruleNestedConditionalCount</strong>: the number of nested layers in a rule.</li>
     * <li><strong>waiting_room_rule</strong>: Waiting Room.</li>
     * <li><strong>transition_rule</strong>: the maximum number of transform rules.</li>
     * <li><strong>customHttpCert</strong>: the maximum number of custom certificates.</li>
     * <li><strong>free_cert</strong>: the maximum number of free certificates.</li>
     * <li><strong>preload</strong>: prefetch.</li>
     * <li><strong>refresh_cache_tag</strong>: purge by cache tag.</li>
     * <li><strong>refresh_ignore_param</strong>: purge by URL with specified parameters ignored.</li>
     * <li><strong>refresh_directory</strong>: purge by directory.</li>
     * <li><strong>refresh_hostname</strong>: purge by hostname.</li>
     * <li><strong>refresh_all</strong>: purge all cache.</li>
     * <li><strong>refresh_file</strong>: purge by URL.</li>
     * <li><strong>wildcard</strong>: the maximum number of wildcard domains.</li>
     * <li><strong>recordCount</strong>: the maximum number of Layer 7 records.</li>
     * <li><strong>siteCount</strong>: the maximum number of websites that can be associated with the plan.</li>
     * <li><strong>https|rule_quota</strong>: the maximum number of SSL/TLS rules.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>preload, free_cert</p>
     */
    @NameInMap("QuotaNames")
    public String quotaNames;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
