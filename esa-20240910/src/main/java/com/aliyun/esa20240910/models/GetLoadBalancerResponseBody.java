// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetLoadBalancerResponseBody extends TeaModel {
    /**
     * <p>The configuration for failover across pools.</p>
     */
    @NameInMap("AdaptiveRouting")
    public GetLoadBalancerResponseBodyAdaptiveRouting adaptiveRouting;

    /**
     * <p>A list of default origin pool IDs.</p>
     */
    @NameInMap("DefaultPools")
    public java.util.List<Long> defaultPools;

    /**
     * <p>The description of the load balancer.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether the load balancer is enabled.</p>
     * <ul>
     * <li><p><code>true</code>: Enabled.</p>
     * </li>
     * <li><p><code>false</code>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The ID of the fallback pool. Routes traffic to this origin pool when all other origin pools are unavailable.</p>
     * 
     * <strong>example:</strong>
     * <p>96228666776****</p>
     */
    @NameInMap("FallbackPool")
    public Long fallbackPool;

    /**
     * <p>The unique identifier for the load balancer.</p>
     * 
     * <strong>example:</strong>
     * <p>99867648760****</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The health check configuration.</p>
     */
    @NameInMap("Monitor")
    public GetLoadBalancerResponseBodyMonitor monitor;

    /**
     * <p>The name of the load balancer.</p>
     * 
     * <strong>example:</strong>
     * <p>lb.example.com</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The weighted routing configuration, which controls the traffic distribution weight among origin pools.</p>
     */
    @NameInMap("RandomSteering")
    public GetLoadBalancerResponseBodyRandomSteering randomSteering;

    /**
     * <p>A map of regions to their corresponding origin pools.</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of rule configurations that define behavior for specific conditions.</p>
     */
    @NameInMap("Rules")
    public java.util.List<GetLoadBalancerResponseBodyRules> rules;

    /**
     * <p>The session affinity policy. Valid values are:</p>
     * <ul>
     * <li><p><code>off</code>: Session affinity is disabled.</p>
     * </li>
     * <li><p><code>ip</code>: Session affinity is based on the client\&quot;s IP address.</p>
     * </li>
     * <li><p><code>cookie</code>: Session affinity is based on a cookie.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("SessionAffinity")
    public String sessionAffinity;

    /**
     * <p>The ID of the site for the load balancer.</p>
     * 
     * <strong>example:</strong>
     * <p>11591017874****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The status of the load balancer.</p>
     * 
     * <strong>example:</strong>
     * <p>healthy</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The steering policy.</p>
     * 
     * <strong>example:</strong>
     * <p>order</p>
     */
    @NameInMap("SteeringPolicy")
    public String steeringPolicy;

    /**
     * <p>A map of sub-regions to their corresponding origin pools. To map multiple sub-regions to the same set of origin pools, concatenate their codes with commas to create the key.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AL,MO&quot;: [92298024898****],&quot;CN-SH,CN-SX,CN-SC&quot;:[92304347804****,92843536908****]}</p>
     */
    @NameInMap("SubRegionPools")
    public Object subRegionPools;

    /**
     * <p>The Time to Live (TTL) for the DNS record, in seconds. The default is 30.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    public static GetLoadBalancerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoadBalancerResponseBody self = new GetLoadBalancerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoadBalancerResponseBody setAdaptiveRouting(GetLoadBalancerResponseBodyAdaptiveRouting adaptiveRouting) {
        this.adaptiveRouting = adaptiveRouting;
        return this;
    }
    public GetLoadBalancerResponseBodyAdaptiveRouting getAdaptiveRouting() {
        return this.adaptiveRouting;
    }

    public GetLoadBalancerResponseBody setDefaultPools(java.util.List<Long> defaultPools) {
        this.defaultPools = defaultPools;
        return this;
    }
    public java.util.List<Long> getDefaultPools() {
        return this.defaultPools;
    }

    public GetLoadBalancerResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetLoadBalancerResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetLoadBalancerResponseBody setFallbackPool(Long fallbackPool) {
        this.fallbackPool = fallbackPool;
        return this;
    }
    public Long getFallbackPool() {
        return this.fallbackPool;
    }

    public GetLoadBalancerResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetLoadBalancerResponseBody setMonitor(GetLoadBalancerResponseBodyMonitor monitor) {
        this.monitor = monitor;
        return this;
    }
    public GetLoadBalancerResponseBodyMonitor getMonitor() {
        return this.monitor;
    }

    public GetLoadBalancerResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetLoadBalancerResponseBody setRandomSteering(GetLoadBalancerResponseBodyRandomSteering randomSteering) {
        this.randomSteering = randomSteering;
        return this;
    }
    public GetLoadBalancerResponseBodyRandomSteering getRandomSteering() {
        return this.randomSteering;
    }

    public GetLoadBalancerResponseBody setRegionPools(Object regionPools) {
        this.regionPools = regionPools;
        return this;
    }
    public Object getRegionPools() {
        return this.regionPools;
    }

    public GetLoadBalancerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLoadBalancerResponseBody setRules(java.util.List<GetLoadBalancerResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<GetLoadBalancerResponseBodyRules> getRules() {
        return this.rules;
    }

    public GetLoadBalancerResponseBody setSessionAffinity(String sessionAffinity) {
        this.sessionAffinity = sessionAffinity;
        return this;
    }
    public String getSessionAffinity() {
        return this.sessionAffinity;
    }

    public GetLoadBalancerResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public GetLoadBalancerResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetLoadBalancerResponseBody setSteeringPolicy(String steeringPolicy) {
        this.steeringPolicy = steeringPolicy;
        return this;
    }
    public String getSteeringPolicy() {
        return this.steeringPolicy;
    }

    public GetLoadBalancerResponseBody setSubRegionPools(Object subRegionPools) {
        this.subRegionPools = subRegionPools;
        return this;
    }
    public Object getSubRegionPools() {
        return this.subRegionPools;
    }

    public GetLoadBalancerResponseBody setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public static class GetLoadBalancerResponseBodyAdaptiveRouting extends TeaModel {
        /**
         * <p>Indicates whether failover across pools is enabled.</p>
         * <ul>
         * <li><p><code>true</code>: Enabled.</p>
         * </li>
         * <li><p><code>false</code>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FailoverAcrossPools")
        public Boolean failoverAcrossPools;

        @NameInMap("OriginLevelRetry")
        public Boolean originLevelRetry;

        public static GetLoadBalancerResponseBodyAdaptiveRouting build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerResponseBodyAdaptiveRouting self = new GetLoadBalancerResponseBodyAdaptiveRouting();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerResponseBodyAdaptiveRouting setFailoverAcrossPools(Boolean failoverAcrossPools) {
            this.failoverAcrossPools = failoverAcrossPools;
            return this;
        }
        public Boolean getFailoverAcrossPools() {
            return this.failoverAcrossPools;
        }

        public GetLoadBalancerResponseBodyAdaptiveRouting setOriginLevelRetry(Boolean originLevelRetry) {
            this.originLevelRetry = originLevelRetry;
            return this;
        }
        public Boolean getOriginLevelRetry() {
            return this.originLevelRetry;
        }

    }

    public static class GetLoadBalancerResponseBodyMonitor extends TeaModel {
        /**
         * <p>The number of consecutive failed probes required to declare an origin unhealthy. For example, <code>5</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ConsecutiveDown")
        public Integer consecutiveDown;

        /**
         * <p>The number of consecutive successful probes required to declare an origin healthy. For example, <code>3</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ConsecutiveUp")
        public Integer consecutiveUp;

        /**
         * <p>The expected HTTP status codes for a successful response, such as 200 or 202.</p>
         * 
         * <strong>example:</strong>
         * <p>200,202</p>
         */
        @NameInMap("ExpectedCodes")
        public String expectedCodes;

        /**
         * <p>Specifies whether the health check probe follows redirects.</p>
         * <ul>
         * <li><p><code>true</code>: Follows redirects.</p>
         * </li>
         * <li><p><code>false</code>: Does not follow redirects.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FollowRedirects")
        public Boolean followRedirects;

        /**
         * <p>The HTTP headers to include in the health check request.</p>
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
         * <p>The interval for health checks, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The method for the health check.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The region from which probes are sent. Default is <code>Global</code>. Valid values:</p>
         * <ul>
         * <li><p><code>Global</code>: From global locations.</p>
         * </li>
         * <li><p><code>ChineseMainland</code>: From locations within the Chinese Mainland.</p>
         * </li>
         * <li><p><code>OutsideChineseMainland</code>: From global locations outside of the Chinese Mainland.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Global</p>
         */
        @NameInMap("MonitoringRegion")
        public String monitoringRegion;

        /**
         * <p>The path for the health check request.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The destination port for the health check.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The health check timeout, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The protocol used for health checks, such as HTTP. If set to <code>off</code>, health checks are disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetLoadBalancerResponseBodyMonitor build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerResponseBodyMonitor self = new GetLoadBalancerResponseBodyMonitor();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerResponseBodyMonitor setConsecutiveDown(Integer consecutiveDown) {
            this.consecutiveDown = consecutiveDown;
            return this;
        }
        public Integer getConsecutiveDown() {
            return this.consecutiveDown;
        }

        public GetLoadBalancerResponseBodyMonitor setConsecutiveUp(Integer consecutiveUp) {
            this.consecutiveUp = consecutiveUp;
            return this;
        }
        public Integer getConsecutiveUp() {
            return this.consecutiveUp;
        }

        public GetLoadBalancerResponseBodyMonitor setExpectedCodes(String expectedCodes) {
            this.expectedCodes = expectedCodes;
            return this;
        }
        public String getExpectedCodes() {
            return this.expectedCodes;
        }

        public GetLoadBalancerResponseBodyMonitor setFollowRedirects(Boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }
        public Boolean getFollowRedirects() {
            return this.followRedirects;
        }

        public GetLoadBalancerResponseBodyMonitor setHeader(Object header) {
            this.header = header;
            return this;
        }
        public Object getHeader() {
            return this.header;
        }

        public GetLoadBalancerResponseBodyMonitor setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public GetLoadBalancerResponseBodyMonitor setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetLoadBalancerResponseBodyMonitor setMonitoringRegion(String monitoringRegion) {
            this.monitoringRegion = monitoringRegion;
            return this;
        }
        public String getMonitoringRegion() {
            return this.monitoringRegion;
        }

        public GetLoadBalancerResponseBodyMonitor setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetLoadBalancerResponseBodyMonitor setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetLoadBalancerResponseBodyMonitor setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public GetLoadBalancerResponseBodyMonitor setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetLoadBalancerResponseBodyRandomSteering extends TeaModel {
        /**
         * <p>The default weight for origin pools that do not have an individually assigned weight. The value must be an integer from 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("DefaultWeight")
        public Integer defaultWeight;

        /**
         * <p>A map of weights for individual origin pools, where the key is the origin pool ID and the value is its weight. The weight determines the traffic distribution ratio.</p>
         */
        @NameInMap("PoolWeights")
        public java.util.Map<String, Integer> poolWeights;

        public static GetLoadBalancerResponseBodyRandomSteering build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerResponseBodyRandomSteering self = new GetLoadBalancerResponseBodyRandomSteering();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerResponseBodyRandomSteering setDefaultWeight(Integer defaultWeight) {
            this.defaultWeight = defaultWeight;
            return this;
        }
        public Integer getDefaultWeight() {
            return this.defaultWeight;
        }

        public GetLoadBalancerResponseBodyRandomSteering setPoolWeights(java.util.Map<String, Integer> poolWeights) {
            this.poolWeights = poolWeights;
            return this;
        }
        public java.util.Map<String, Integer> getPoolWeights() {
            return this.poolWeights;
        }

    }

    public static class GetLoadBalancerResponseBodyRulesFixedResponse extends TeaModel {
        /**
         * <p>The value for the <code>Content-Type</code> HTTP response header.</p>
         * 
         * <strong>example:</strong>
         * <p>application/json</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The value for the <code>Location</code> HTTP response header.</p>
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
         * <p>Hello World.</p>
         */
        @NameInMap("MessageBody")
        public String messageBody;

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("StatusCode")
        public Integer statusCode;

        public static GetLoadBalancerResponseBodyRulesFixedResponse build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerResponseBodyRulesFixedResponse self = new GetLoadBalancerResponseBodyRulesFixedResponse();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerResponseBodyRulesFixedResponse setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GetLoadBalancerResponseBodyRulesFixedResponse setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetLoadBalancerResponseBodyRulesFixedResponse setMessageBody(String messageBody) {
            this.messageBody = messageBody;
            return this;
        }
        public String getMessageBody() {
            return this.messageBody;
        }

        public GetLoadBalancerResponseBodyRulesFixedResponse setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Integer getStatusCode() {
            return this.statusCode;
        }

    }

    public static class GetLoadBalancerResponseBodyRules extends TeaModel {
        /**
         * <p>Specifies a fixed response to return when the rule matches.</p>
         */
        @NameInMap("FixedResponse")
        public GetLoadBalancerResponseBodyRulesFixedResponse fixedResponse;

        /**
         * <p>A set of settings that override the primary load balancer configuration when this rule matches. Fields defined here take precedence over the primary configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *             &quot;adaptive_routing&quot;: {
         *                 &quot;failover_across_pools&quot;: true
         *             },
         *             &quot;sub_region_pools&quot;: {
         *                 &quot;GB&quot;: [
         *                     96228666776****
         *                 ],
         *                 &quot;US&quot;: [
         *                     96228666776****
         *                 ]
         *             },
         *             &quot;default_pools&quot;: [
         *                 96228666776****,
         *                 96228666776****
         *             ],
         *             &quot;fallback_pool&quot;: 96228666776****,
         *             &quot;location_strategy&quot;: {
         *                 &quot;mode&quot;: &quot;resolver_ip&quot;,
         *                 &quot;prefer_ecs&quot;: &quot;always&quot;
         *             },
         *             &quot;random_steering&quot;: {
         *                 &quot;default_weight&quot;: 30,
         *                 &quot;pool_weights&quot;: {
         *                     &quot;96228666776****&quot;: 70,
         *                     &quot;96228666776****&quot;: 80
         *                 }
         *             },
         *             &quot;region_pools&quot;: {
         *                 &quot;ENAM&quot;: [
         *                     96228666776****,
         *                     92843536908****
         *                 ],
         *                 &quot;WNAM&quot;: [
         *                     92843536908****
         *                 ]
         *             },
         *             &quot;session_affinity&quot;: &quot;cookie&quot;,
         *             &quot;session_affinity_attributes&quot;: {
         *                 &quot;drain_duration&quot;: 100,
         *                 &quot;headers&quot;: [&quot;none&quot;],
         *                 &quot;require_all_headers&quot;: false,
         *                 &quot;samesite&quot;: &quot;Auto&quot;,
         *                 &quot;secure&quot;: &quot;Auto&quot;,
         *                 &quot;zero_downtime_failover&quot;: &quot;sticky&quot;
         *             },
         *             &quot;session_affinity_ttl&quot;: 1800,
         *             &quot;steering_policy&quot;: &quot;dynamic_latency&quot;,
         *             &quot;ttl&quot;: 30
         *         }</p>
         */
        @NameInMap("Overrides")
        public Object overrides;

        /**
         * <p>The conditional expression used to match incoming requests. This parameter is not required for the global configuration.</p>
         * <ul>
         * <li><p>To match all requests, set the value to <code>true</code>.</p>
         * </li>
         * <li><p>To match specific requests, use a custom expression. For example, <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http.request.uri.path contains &quot;/testing&quot;</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Indicates whether the rule is enabled. This parameter is not required for the global configuration. Valid values are:</p>
         * <ul>
         * <li><p><code>on</code>: Enabled.</p>
         * </li>
         * <li><p><code>off</code>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>The name of the rule. This parameter is not required when adding a global configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>r2</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The execution priority of the rule. A higher value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>Indicates whether to stop evaluating subsequent rules after this one matches.</p>
         * <ul>
         * <li><p><code>true</code>: Stop evaluation.</p>
         * </li>
         * <li><p><code>false</code>: Continues evaluation. (Default)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Terminates")
        public Boolean terminates;

        public static GetLoadBalancerResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            GetLoadBalancerResponseBodyRules self = new GetLoadBalancerResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public GetLoadBalancerResponseBodyRules setFixedResponse(GetLoadBalancerResponseBodyRulesFixedResponse fixedResponse) {
            this.fixedResponse = fixedResponse;
            return this;
        }
        public GetLoadBalancerResponseBodyRulesFixedResponse getFixedResponse() {
            return this.fixedResponse;
        }

        public GetLoadBalancerResponseBodyRules setOverrides(Object overrides) {
            this.overrides = overrides;
            return this;
        }
        public Object getOverrides() {
            return this.overrides;
        }

        public GetLoadBalancerResponseBodyRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public GetLoadBalancerResponseBodyRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public GetLoadBalancerResponseBodyRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetLoadBalancerResponseBodyRules setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public GetLoadBalancerResponseBodyRules setTerminates(Boolean terminates) {
            this.terminates = terminates;
            return this;
        }
        public Boolean getTerminates() {
            return this.terminates;
        }

    }

}
