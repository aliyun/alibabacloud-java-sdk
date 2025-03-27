// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetLoadBalancerResponseBody extends TeaModel {
    /**
     * <p>Cross-pool failover configuration.</p>
     */
    @NameInMap("AdaptiveRouting")
    public GetLoadBalancerResponseBodyAdaptiveRouting adaptiveRouting;

    /**
     * <p>List of default pool IDs.</p>
     */
    @NameInMap("DefaultPools")
    public java.util.List<Long> defaultPools;

    /**
     * <p>Description of the load balancer.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Whether the load balancer is enabled.</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The fallback pool ID, to which traffic will be redirected if all other pools are unavailable.</p>
     * 
     * <strong>example:</strong>
     * <p>96228666776****</p>
     */
    @NameInMap("FallbackPool")
    public Long fallbackPool;

    /**
     * <p>The unique identifier ID of the load balancer.</p>
     * 
     * <strong>example:</strong>
     * <p>99867648760****</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Monitor configuration.</p>
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
     * <p>Weighted round-robin configuration, used to control the traffic distribution weights among different pools.</p>
     */
    @NameInMap("RandomSteering")
    public GetLoadBalancerResponseBodyRandomSteering randomSteering;

    /**
     * <p>Address pools corresponding to primary regions.</p>
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
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of rule configurations, used to define behavior under specific conditions.</p>
     */
    @NameInMap("Rules")
    public java.util.List<GetLoadBalancerResponseBodyRules> rules;

    /**
     * <p>Session persistence, with values:</p>
     * <ul>
     * <li>off: Not enabled.</li>
     * <li>ip: Session persistence by IP.</li>
     * <li>cookie: Session persistence by cookie.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("SessionAffinity")
    public String sessionAffinity;

    /**
     * <p>The site ID to which the load balancer belongs.</p>
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
     * <p>Load balancing policy.</p>
     * 
     * <strong>example:</strong>
     * <p>order</p>
     */
    @NameInMap("SteeringPolicy")
    public String steeringPolicy;

    /**
     * <p>Address pools corresponding to secondary regions. When multiple secondary regions share a set of address pools, the keys can be concatenated with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AL,MO&quot;: [92298024898****],&quot;CN-SH,CN-SX,CN-SC&quot;:[92304347804****,92843536908****]}</p>
     */
    @NameInMap("SubRegionPools")
    public Object subRegionPools;

    /**
     * <p>TTL value, the time-to-live for DNS records, with a default of 30 seconds.</p>
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
         * <p>Whether to fail over across pools.</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FailoverAcrossPools")
        public Boolean failoverAcrossPools;

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

    }

    public static class GetLoadBalancerResponseBodyMonitor extends TeaModel {
        /**
         * <p>The number of consecutive failed probes required to consider the target as unhealthy, for example, <code>5</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ConsecutiveDown")
        public Integer consecutiveDown;

        /**
         * <p>The number of consecutive successful probes required to consider the target as healthy, for example, <code>3</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ConsecutiveUp")
        public Integer consecutiveUp;

        /**
         * <p>Expected status codes, such as 200, 202, for successful HTTP responses.</p>
         * 
         * <strong>example:</strong>
         * <p>200,202</p>
         */
        @NameInMap("ExpectedCodes")
        public String expectedCodes;

        /**
         * <p>Whether to follow redirects.</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FollowRedirects")
        public Boolean followRedirects;

        /**
         * <p>The HTTP headers to be included in the probe request.</p>
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
         * <p>Health check interval, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>Health check method.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>Path.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>Target port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The timeout for the health check, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>Monitor protocol type, such as HTTP, used for health checks. When the value is <code>off</code>, it indicates that no check is performed.</p>
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
         * <p>The default round-robin weight, used for all pools that do not have individually specified weights. The value range is 0-100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("DefaultWeight")
        public Integer defaultWeight;

        /**
         * <p>Weight configurations for each backend server pool, where the key is the pool ID and the value is the weight coefficient. The weight coefficient represents the relative traffic distribution ratio.</p>
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
         * <p>The Content-Type field in the HTTP Header.</p>
         * 
         * <strong>example:</strong>
         * <p>application/json</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The location field in the HTTP response.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/index.html">http://www.example.com/index.html</a></p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The body value of the response.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello World.</p>
         */
        @NameInMap("MessageBody")
        public String messageBody;

        /**
         * <p>Status code.</p>
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
         * <p>Executes a specified response after matching the rule.</p>
         */
        @NameInMap("FixedResponse")
        public GetLoadBalancerResponseBodyRulesFixedResponse fixedResponse;

        /**
         * <p>Modifies the load balancer configuration for the corresponding request after matching the rule. The fields in this configuration will override the corresponding fields in the load balancer\&quot;s configuration.</p>
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
         * <p>Rule content, using conditional expressions to match user requests. This parameter is not required when adding global configurations. There are two usage scenarios:</p>
         * <ul>
         * <li>Match all incoming requests: Set the value to true</li>
         * <li>Match specific requests: Set the value to a custom expression, for example: (http.host eq \&quot;video.example.com\&quot;)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http.request.uri.path contains &quot;/testing&quot;</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Rule switch. This parameter is not required when adding global configurations. Possible values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>Rule name. This parameter is not required when adding global configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>r2</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>Rule execution order. The higher the number, the higher the priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>Whether to terminate the execution of subsequent rules.</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No, default value.</li>
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
