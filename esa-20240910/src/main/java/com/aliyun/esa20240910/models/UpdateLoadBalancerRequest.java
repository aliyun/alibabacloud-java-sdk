// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerRequest extends TeaModel {
    /**
     * <p>Configures origin-pull behavior across address pools.</p>
     */
    @NameInMap("AdaptiveRouting")
    public UpdateLoadBalancerRequestAdaptiveRouting adaptiveRouting;

    /**
     * <p>A list of default address pool IDs.</p>
     */
    @NameInMap("DefaultPools")
    public java.util.List<Long> defaultPools;

    /**
     * <p>An optional description of the load balancer for easier identification and management.</p>
     * 
     * <strong>example:</strong>
     * <p>Load balancer description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the load balancer is enabled.</p>
     * <ul>
     * <li><p><code>true</code>: The load balancer is enabled.</p>
     * </li>
     * <li><p><code>false</code>: The load balancer is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The ID of the fallback address pool. Traffic is routed to this pool when all other address pools are unavailable.</p>
     * 
     * <strong>example:</strong>
     * <p>96228666776****</p>
     */
    @NameInMap("FallbackPool")
    public Long fallbackPool;

    /**
     * <p>The ID of the load balancer. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2868897.html">ListLoadBalancers</a> API operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95913670174****</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The health check monitor configuration.</p>
     */
    @NameInMap("Monitor")
    public UpdateLoadBalancerRequestMonitor monitor;

    /**
     * <p>The configuration for weighted round-robin. This setting controls the weight of traffic distributed to different address pools.</p>
     */
    @NameInMap("RandomSteering")
    public UpdateLoadBalancerRequestRandomSteering randomSteering;

    /**
     * <p>A map of primary regions to their corresponding address pools.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;ENAM&quot;: [
     *     12345678****
     *   ],
     *   &quot;WNAM&quot;: [
     *     23456789****,
     *     23456789****
     *   ]
     * }</p>
     */
    @NameInMap("RegionPools")
    public Object regionPools;

    /**
     * <p>A list of rules that define behavior overrides for specific conditions.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Rules")
    public java.util.List<UpdateLoadBalancerRequestRules> rules;

    /**
     * <p>The method for session affinity, which ensures that requests from the same client are routed to the same origin server. Valid values:</p>
     * <ul>
     * <li><p><code>off</code>: Disables session affinity.</p>
     * </li>
     * <li><p><code>ip</code>: Enables session affinity based on the client IP address.</p>
     * </li>
     * <li><p><code>cookie</code>: Enables session affinity based on a cookie.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("SessionAffinity")
    public String sessionAffinity;

    /**
     * <p>The ID of the Site. You can obtain this ID by calling the <a href="~~ListSites~~">ListSites</a> API operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1159101787****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The traffic steering policy, which determines how traffic is distributed among the address pools.</p>
     * 
     * <strong>example:</strong>
     * <p>order</p>
     */
    @NameInMap("SteeringPolicy")
    public String steeringPolicy;

    /**
     * <p>A map of secondary regions to their corresponding address pools. To assign the same address pools to multiple secondary regions, combine their codes into a single, comma-separated key.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AL,MO&quot;: [92298024898****],&quot;CN-SH,CN-SX,CN-SC&quot;:[92304347804****,92843536908****]}</p>
     */
    @NameInMap("SubRegionPools")
    public Object subRegionPools;

    /**
     * <p>The Time to Live (TTL) for the DNS record, in seconds. The default is 30. The value must be between 10 and 600, inclusive.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    public static UpdateLoadBalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerRequest self = new UpdateLoadBalancerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerRequest setAdaptiveRouting(UpdateLoadBalancerRequestAdaptiveRouting adaptiveRouting) {
        this.adaptiveRouting = adaptiveRouting;
        return this;
    }
    public UpdateLoadBalancerRequestAdaptiveRouting getAdaptiveRouting() {
        return this.adaptiveRouting;
    }

    public UpdateLoadBalancerRequest setDefaultPools(java.util.List<Long> defaultPools) {
        this.defaultPools = defaultPools;
        return this;
    }
    public java.util.List<Long> getDefaultPools() {
        return this.defaultPools;
    }

    public UpdateLoadBalancerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLoadBalancerRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateLoadBalancerRequest setFallbackPool(Long fallbackPool) {
        this.fallbackPool = fallbackPool;
        return this;
    }
    public Long getFallbackPool() {
        return this.fallbackPool;
    }

    public UpdateLoadBalancerRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLoadBalancerRequest setMonitor(UpdateLoadBalancerRequestMonitor monitor) {
        this.monitor = monitor;
        return this;
    }
    public UpdateLoadBalancerRequestMonitor getMonitor() {
        return this.monitor;
    }

    public UpdateLoadBalancerRequest setRandomSteering(UpdateLoadBalancerRequestRandomSteering randomSteering) {
        this.randomSteering = randomSteering;
        return this;
    }
    public UpdateLoadBalancerRequestRandomSteering getRandomSteering() {
        return this.randomSteering;
    }

    public UpdateLoadBalancerRequest setRegionPools(Object regionPools) {
        this.regionPools = regionPools;
        return this;
    }
    public Object getRegionPools() {
        return this.regionPools;
    }

    public UpdateLoadBalancerRequest setRules(java.util.List<UpdateLoadBalancerRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<UpdateLoadBalancerRequestRules> getRules() {
        return this.rules;
    }

    public UpdateLoadBalancerRequest setSessionAffinity(String sessionAffinity) {
        this.sessionAffinity = sessionAffinity;
        return this;
    }
    public String getSessionAffinity() {
        return this.sessionAffinity;
    }

    public UpdateLoadBalancerRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateLoadBalancerRequest setSteeringPolicy(String steeringPolicy) {
        this.steeringPolicy = steeringPolicy;
        return this;
    }
    public String getSteeringPolicy() {
        return this.steeringPolicy;
    }

    public UpdateLoadBalancerRequest setSubRegionPools(Object subRegionPools) {
        this.subRegionPools = subRegionPools;
        return this;
    }
    public Object getSubRegionPools() {
        return this.subRegionPools;
    }

    public UpdateLoadBalancerRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public static class UpdateLoadBalancerRequestAdaptiveRouting extends TeaModel {
        /**
         * <p>Specifies whether to perform origin-pull across address pools.</p>
         * <ul>
         * <li><p><code>true</code>: Enables origin-pull across address pools.</p>
         * </li>
         * <li><p><code>false</code>: Disables origin-pull across address pools.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FailoverAcrossPools")
        public Boolean failoverAcrossPools;

        @NameInMap("OriginLevelRetry")
        public Boolean originLevelRetry;

        public static UpdateLoadBalancerRequestAdaptiveRouting build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoadBalancerRequestAdaptiveRouting self = new UpdateLoadBalancerRequestAdaptiveRouting();
            return TeaModel.build(map, self);
        }

        public UpdateLoadBalancerRequestAdaptiveRouting setFailoverAcrossPools(Boolean failoverAcrossPools) {
            this.failoverAcrossPools = failoverAcrossPools;
            return this;
        }
        public Boolean getFailoverAcrossPools() {
            return this.failoverAcrossPools;
        }

        public UpdateLoadBalancerRequestAdaptiveRouting setOriginLevelRetry(Boolean originLevelRetry) {
            this.originLevelRetry = originLevelRetry;
            return this;
        }
        public Boolean getOriginLevelRetry() {
            return this.originLevelRetry;
        }

    }

    public static class UpdateLoadBalancerRequestMonitor extends TeaModel {
        /**
         * <p>The number of consecutive failed health checks required to declare an origin server unhealthy. For example, <code>5</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ConsecutiveDown")
        public Integer consecutiveDown;

        /**
         * <p>The number of consecutive successful health checks required to declare an origin server healthy. For example, <code>3</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ConsecutiveUp")
        public Integer consecutiveUp;

        /**
         * <p>The expected HTTP status codes that indicate a healthy response. For example, <code>200,202</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>200,202</p>
         */
        @NameInMap("ExpectedCodes")
        public String expectedCodes;

        /**
         * <p>Specifies whether the health check monitor follows HTTP redirections.</p>
         * <ul>
         * <li><p><code>true</code>: The monitor follows HTTP redirections.</p>
         * </li>
         * <li><p><code>false</code>: The monitor does not follow HTTP redirections.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FollowRedirects")
        public Boolean followRedirects;

        /**
         * <p>The HTTP request headers to send with each health check.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *         &quot;host&quot;: [
         *             &quot;example1.com&quot;,
         *             &quot;example2.com&quot;
         *         ]
         *     }</p>
         */
        @NameInMap("Header")
        public Object header;

        /**
         * <p>The interval in seconds between each health check. For example, <code>60</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The HTTP method to use for the health check. For example, <code>GET</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The regions from which the health checks are performed. The default value is <code>Global</code>.</p>
         * <ul>
         * <li><p><code>Global</code>: From probe locations worldwide.</p>
         * </li>
         * <li><p><code>ChineseMainland</code>: From probe locations within the Chinese mainland.</p>
         * </li>
         * <li><p><code>OutsideChineseMainland</code>: From probe locations outside the Chinese mainland.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Global</p>
         */
        @NameInMap("MonitoringRegion")
        public String monitoringRegion;

        /**
         * <p>The path on the origin server to request for the health check. For example, <code>/healthcheck</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>/health</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The port on the origin server to use for the health check.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The timeout for the health check, in seconds. The value must be between 1 and 10, inclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The protocol to use for the health check, such as <code>HTTP</code>. If you set this to <code>off</code>, no health check is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateLoadBalancerRequestMonitor build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoadBalancerRequestMonitor self = new UpdateLoadBalancerRequestMonitor();
            return TeaModel.build(map, self);
        }

        public UpdateLoadBalancerRequestMonitor setConsecutiveDown(Integer consecutiveDown) {
            this.consecutiveDown = consecutiveDown;
            return this;
        }
        public Integer getConsecutiveDown() {
            return this.consecutiveDown;
        }

        public UpdateLoadBalancerRequestMonitor setConsecutiveUp(Integer consecutiveUp) {
            this.consecutiveUp = consecutiveUp;
            return this;
        }
        public Integer getConsecutiveUp() {
            return this.consecutiveUp;
        }

        public UpdateLoadBalancerRequestMonitor setExpectedCodes(String expectedCodes) {
            this.expectedCodes = expectedCodes;
            return this;
        }
        public String getExpectedCodes() {
            return this.expectedCodes;
        }

        public UpdateLoadBalancerRequestMonitor setFollowRedirects(Boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }
        public Boolean getFollowRedirects() {
            return this.followRedirects;
        }

        public UpdateLoadBalancerRequestMonitor setHeader(Object header) {
            this.header = header;
            return this;
        }
        public Object getHeader() {
            return this.header;
        }

        public UpdateLoadBalancerRequestMonitor setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public UpdateLoadBalancerRequestMonitor setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public UpdateLoadBalancerRequestMonitor setMonitoringRegion(String monitoringRegion) {
            this.monitoringRegion = monitoringRegion;
            return this;
        }
        public String getMonitoringRegion() {
            return this.monitoringRegion;
        }

        public UpdateLoadBalancerRequestMonitor setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateLoadBalancerRequestMonitor setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateLoadBalancerRequestMonitor setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public UpdateLoadBalancerRequestMonitor setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateLoadBalancerRequestRandomSteering extends TeaModel {
        /**
         * <p>The default weight applied to all address pools that do not have a specific weight defined. The value must be an integer from 0 to 100, inclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("DefaultWeight")
        public Integer defaultWeight;

        /**
         * <p>A map of pool IDs to their corresponding weights. These weights determine the proportion of traffic routed to each backend server pool.</p>
         */
        @NameInMap("PoolWeights")
        public java.util.Map<String, Integer> poolWeights;

        public static UpdateLoadBalancerRequestRandomSteering build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoadBalancerRequestRandomSteering self = new UpdateLoadBalancerRequestRandomSteering();
            return TeaModel.build(map, self);
        }

        public UpdateLoadBalancerRequestRandomSteering setDefaultWeight(Integer defaultWeight) {
            this.defaultWeight = defaultWeight;
            return this;
        }
        public Integer getDefaultWeight() {
            return this.defaultWeight;
        }

        public UpdateLoadBalancerRequestRandomSteering setPoolWeights(java.util.Map<String, Integer> poolWeights) {
            this.poolWeights = poolWeights;
            return this;
        }
        public java.util.Map<String, Integer> getPoolWeights() {
            return this.poolWeights;
        }

    }

    public static class UpdateLoadBalancerRequestRulesFixedResponse extends TeaModel {
        /**
         * <p>The value of the <code>Content-Type</code> field in the HTTP response header.</p>
         * 
         * <strong>example:</strong>
         * <p>application/json</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The value of the <code>Location</code> field in the HTTP response header. This is typically used for redirections.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/index.html">http://www.example.com/index.html</a></p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The content of the response body.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello World!</p>
         */
        @NameInMap("MessageBody")
        public String messageBody;

        /**
         * <p>The HTTP status code of the response.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("StatusCode")
        public Integer statusCode;

        public static UpdateLoadBalancerRequestRulesFixedResponse build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoadBalancerRequestRulesFixedResponse self = new UpdateLoadBalancerRequestRulesFixedResponse();
            return TeaModel.build(map, self);
        }

        public UpdateLoadBalancerRequestRulesFixedResponse setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public UpdateLoadBalancerRequestRulesFixedResponse setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public UpdateLoadBalancerRequestRulesFixedResponse setMessageBody(String messageBody) {
            this.messageBody = messageBody;
            return this;
        }
        public String getMessageBody() {
            return this.messageBody;
        }

        public UpdateLoadBalancerRequestRulesFixedResponse setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Integer getStatusCode() {
            return this.statusCode;
        }

    }

    public static class UpdateLoadBalancerRequestRules extends TeaModel {
        /**
         * <p>The fixed response to return when the rule\&quot;s condition is met.</p>
         */
        @NameInMap("FixedResponse")
        public UpdateLoadBalancerRequestRulesFixedResponse fixedResponse;

        /**
         * <p>The settings to override for requests that match this rule\&quot;s condition. These settings take precedence over the load balancer\&quot;s main configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *             &quot;adaptive_routing&quot;: {
         *                 &quot;failover_across_pools&quot;: true
         *             },
         *             &quot;sub_region_pools&quot;: {
         *                 &quot;AL,AT&quot;: [
         *                     92298024898****,
         *                     92304347804****
         *                 ],
         *                 &quot;BG,BY&quot;: [
         *                     92298024898****
         *                 ]
         *             },
         *             &quot;default_pools&quot;: [
         *                 92298024898****,
         *                 92304347804****
         *             ],
         *             &quot;fallback_pool&quot;: 92298024898****,
         *             &quot;location_strategy&quot;: {
         *                 &quot;mode&quot;: &quot;resolver_ip&quot;,
         *                 &quot;prefer_ecs&quot;: &quot;always&quot;
         *             },
         *             &quot;random_steering&quot;: {
         *                 &quot;default_weight&quot;: 0.3,
         *                 &quot;pool_weights&quot;: {
         *                     &quot;92298024898****&quot;: 0.7,
         *                     &quot;92304347804****&quot;: 0.8
         *                 }
         *             },
         *             &quot;region_pools&quot;: {
         *                 &quot;CN,SEAS&quot;: [
         *                     92298024898****,
         *                     92304347804****
         *                 ],
         *                 &quot;SAF,SAS&quot;: [
         *                     92304347804****
         *                 ]
         *             },
         *             &quot;session_affinity&quot;: &quot;ip&quot;,
         *             &quot;steering_policy&quot;: &quot;geo&quot;,
         *             &quot;ttl&quot;: 30
         *         }</p>
         */
        @NameInMap("Overrides")
        public Object overrides;

        /**
         * <p>The content of the rule, specified as a conditional expression to match user requests. This parameter is not required when you configure global settings. Use cases:</p>
         * <ul>
         * <li><p>To match all incoming requests, set the value to <code>true</code>.</p>
         * </li>
         * <li><p>To match specific requests, set the value to a custom expression, such as <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http.request.method eq &quot;GET&quot;</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Specifies whether the rule is enabled. This parameter is not required when you configure global settings. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: Enabled.</p>
         * </li>
         * <li><p><code>off</code>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>The name of the rule. This parameter is not required when you configure global settings.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The execution priority of the rule. This parameter is optional. If you do not specify this parameter, rules are executed in the order they are listed. If specified, the value must be an integer greater than 0. A larger value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>Specifies whether to stop processing subsequent rules after this rule is matched.</p>
         * <ul>
         * <li><p><code>true</code>: Stop processing subsequent rules.</p>
         * </li>
         * <li><p><code>false</code>: Continue processing subsequent rules. This is the default value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Terminates")
        public Boolean terminates;

        public static UpdateLoadBalancerRequestRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoadBalancerRequestRules self = new UpdateLoadBalancerRequestRules();
            return TeaModel.build(map, self);
        }

        public UpdateLoadBalancerRequestRules setFixedResponse(UpdateLoadBalancerRequestRulesFixedResponse fixedResponse) {
            this.fixedResponse = fixedResponse;
            return this;
        }
        public UpdateLoadBalancerRequestRulesFixedResponse getFixedResponse() {
            return this.fixedResponse;
        }

        public UpdateLoadBalancerRequestRules setOverrides(Object overrides) {
            this.overrides = overrides;
            return this;
        }
        public Object getOverrides() {
            return this.overrides;
        }

        public UpdateLoadBalancerRequestRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public UpdateLoadBalancerRequestRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public UpdateLoadBalancerRequestRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public UpdateLoadBalancerRequestRules setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public UpdateLoadBalancerRequestRules setTerminates(Boolean terminates) {
            this.terminates = terminates;
            return this;
        }
        public Boolean getTerminates() {
            return this.terminates;
        }

    }

}
