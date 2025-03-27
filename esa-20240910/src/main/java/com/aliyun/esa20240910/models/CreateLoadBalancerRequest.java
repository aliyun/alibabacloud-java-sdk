// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerRequest extends TeaModel {
    /**
     * <p>Configuration for failover across pools.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AdaptiveRouting")
    public CreateLoadBalancerRequestAdaptiveRouting adaptiveRouting;

    /**
     * <p>List of default pools.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("DefaultPools")
    public java.util.List<Long> defaultPools;

    /**
     * <p>Detailed description of the load balancer, for easier management and identification.</p>
     * 
     * <strong>example:</strong>
     * <p>测试负载均衡器描述</p>
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
     * <p>Fallback pool ID, where traffic will be directed when all other pools are unavailable.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("FallbackPool")
    public Long fallbackPool;

    /**
     * <p>Monitor configuration, used for health checks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>order</p>
     */
    @NameInMap("Monitor")
    public CreateLoadBalancerRequestMonitor monitor;

    /**
     * <p>The name of the load balancer, which must meet the domain name format validation and be a subdomain under the site.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb.example.com</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Weighted round-robin configuration, used to control the traffic distribution weights among different pools.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("RandomSteering")
    public CreateLoadBalancerRequestRandomSteering randomSteering;

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
     * <p>Rule information.</p>
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
    @NameInMap("Rules")
    public java.util.List<CreateLoadBalancerRequestRules> rules;

    /**
     * <p>Session persistence, with possible values:</p>
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
     * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Load balancing strategy.</p>
     * <ul>
     * <li>geo: Geographic strategy.</li>
     * <li>random: Weighted round-robin.</li>
     * <li>order: Primary and backup method.</li>
     * </ul>
     * <p>This parameter is required.</p>
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
     * <p>TTL value, the time-to-live for DNS records, with a default of 30 seconds. The value range is 10-600.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    public static CreateLoadBalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerRequest self = new CreateLoadBalancerRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerRequest setAdaptiveRouting(CreateLoadBalancerRequestAdaptiveRouting adaptiveRouting) {
        this.adaptiveRouting = adaptiveRouting;
        return this;
    }
    public CreateLoadBalancerRequestAdaptiveRouting getAdaptiveRouting() {
        return this.adaptiveRouting;
    }

    public CreateLoadBalancerRequest setDefaultPools(java.util.List<Long> defaultPools) {
        this.defaultPools = defaultPools;
        return this;
    }
    public java.util.List<Long> getDefaultPools() {
        return this.defaultPools;
    }

    public CreateLoadBalancerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLoadBalancerRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateLoadBalancerRequest setFallbackPool(Long fallbackPool) {
        this.fallbackPool = fallbackPool;
        return this;
    }
    public Long getFallbackPool() {
        return this.fallbackPool;
    }

    public CreateLoadBalancerRequest setMonitor(CreateLoadBalancerRequestMonitor monitor) {
        this.monitor = monitor;
        return this;
    }
    public CreateLoadBalancerRequestMonitor getMonitor() {
        return this.monitor;
    }

    public CreateLoadBalancerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLoadBalancerRequest setRandomSteering(CreateLoadBalancerRequestRandomSteering randomSteering) {
        this.randomSteering = randomSteering;
        return this;
    }
    public CreateLoadBalancerRequestRandomSteering getRandomSteering() {
        return this.randomSteering;
    }

    public CreateLoadBalancerRequest setRegionPools(Object regionPools) {
        this.regionPools = regionPools;
        return this;
    }
    public Object getRegionPools() {
        return this.regionPools;
    }

    public CreateLoadBalancerRequest setRules(java.util.List<CreateLoadBalancerRequestRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<CreateLoadBalancerRequestRules> getRules() {
        return this.rules;
    }

    public CreateLoadBalancerRequest setSessionAffinity(String sessionAffinity) {
        this.sessionAffinity = sessionAffinity;
        return this;
    }
    public String getSessionAffinity() {
        return this.sessionAffinity;
    }

    public CreateLoadBalancerRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateLoadBalancerRequest setSteeringPolicy(String steeringPolicy) {
        this.steeringPolicy = steeringPolicy;
        return this;
    }
    public String getSteeringPolicy() {
        return this.steeringPolicy;
    }

    public CreateLoadBalancerRequest setSubRegionPools(Object subRegionPools) {
        this.subRegionPools = subRegionPools;
        return this;
    }
    public Object getSubRegionPools() {
        return this.subRegionPools;
    }

    public CreateLoadBalancerRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public static class CreateLoadBalancerRequestAdaptiveRouting extends TeaModel {
        /**
         * <p>Whether to failover across pools.</p>
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

        public static CreateLoadBalancerRequestAdaptiveRouting build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestAdaptiveRouting self = new CreateLoadBalancerRequestAdaptiveRouting();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestAdaptiveRouting setFailoverAcrossPools(Boolean failoverAcrossPools) {
            this.failoverAcrossPools = failoverAcrossPools;
            return this;
        }
        public Boolean getFailoverAcrossPools() {
            return this.failoverAcrossPools;
        }

    }

    public static class CreateLoadBalancerRequestMonitor extends TeaModel {
        /**
         * <p>Number of consecutive failed probes required to consider the target unhealthy, such as <code>5</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ConsecutiveDown")
        public Integer consecutiveDown;

        /**
         * <p>Number of consecutive successful probes required to consider the target healthy, such as <code>3</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ConsecutiveUp")
        public Integer consecutiveUp;

        /**
         * <p>Expected status codes, such as <code>200,202</code>, indicating successful HTTP responses.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
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
         * <p>Header information included in the probe, which is the HTTP header.</p>
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
         * <p>Monitoring interval, such as <code>60</code> seconds, representing the frequency of checks.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>Monitor request method, such as <code>GET</code>, which is a method in the HTTP protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>Monitor check path, such as <code>/healthcheck</code>, which is the HTTP request path.</p>
         * 
         * <strong>example:</strong>
         * <p>/health</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>Origin server port.</p>
         * 
         * <strong>example:</strong>
         * <p>1921</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>Application health check timeout, in seconds, with a value range of 1-10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>Monitor protocol type, such as HTTP, used for health checks. When set to <code>off</code>, no check is performed.</p>
         * <ul>
         * <li>TCP</li>
         * <li>UDP</li>
         * <li>SMTP</li>
         * <li>HTTPS</li>
         * <li>HTTP</li>
         * <li>ICMP Ping</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateLoadBalancerRequestMonitor build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestMonitor self = new CreateLoadBalancerRequestMonitor();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestMonitor setConsecutiveDown(Integer consecutiveDown) {
            this.consecutiveDown = consecutiveDown;
            return this;
        }
        public Integer getConsecutiveDown() {
            return this.consecutiveDown;
        }

        public CreateLoadBalancerRequestMonitor setConsecutiveUp(Integer consecutiveUp) {
            this.consecutiveUp = consecutiveUp;
            return this;
        }
        public Integer getConsecutiveUp() {
            return this.consecutiveUp;
        }

        public CreateLoadBalancerRequestMonitor setExpectedCodes(String expectedCodes) {
            this.expectedCodes = expectedCodes;
            return this;
        }
        public String getExpectedCodes() {
            return this.expectedCodes;
        }

        public CreateLoadBalancerRequestMonitor setFollowRedirects(Boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }
        public Boolean getFollowRedirects() {
            return this.followRedirects;
        }

        public CreateLoadBalancerRequestMonitor setHeader(Object header) {
            this.header = header;
            return this;
        }
        public Object getHeader() {
            return this.header;
        }

        public CreateLoadBalancerRequestMonitor setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public CreateLoadBalancerRequestMonitor setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public CreateLoadBalancerRequestMonitor setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateLoadBalancerRequestMonitor setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateLoadBalancerRequestMonitor setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public CreateLoadBalancerRequestMonitor setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateLoadBalancerRequestRandomSteering extends TeaModel {
        /**
         * <p>Default weight for round-robin, used for all pools that do not have a specific weight set. The value range is an integer between 0 and 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("DefaultWeight")
        public Integer defaultWeight;

        /**
         * <p>Weight configuration for each backend server pool, with the key being the pool ID and the value being the weight coefficient. The weight coefficient represents the proportion of relative traffic distribution.</p>
         */
        @NameInMap("PoolWeights")
        public java.util.Map<String, Integer> poolWeights;

        public static CreateLoadBalancerRequestRandomSteering build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestRandomSteering self = new CreateLoadBalancerRequestRandomSteering();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestRandomSteering setDefaultWeight(Integer defaultWeight) {
            this.defaultWeight = defaultWeight;
            return this;
        }
        public Integer getDefaultWeight() {
            return this.defaultWeight;
        }

        public CreateLoadBalancerRequestRandomSteering setPoolWeights(java.util.Map<String, Integer> poolWeights) {
            this.poolWeights = poolWeights;
            return this;
        }
        public java.util.Map<String, Integer> getPoolWeights() {
            return this.poolWeights;
        }

    }

    public static class CreateLoadBalancerRequestRulesFixedResponse extends TeaModel {
        /**
         * <p>Content-Type field in the HTTP Header.</p>
         * 
         * <strong>example:</strong>
         * <p>application/octet-stream</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>Location field in the HTTP response.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/index.html">http://www.example.com/index.html</a></p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>Response body value.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello World!</p>
         */
        @NameInMap("MessageBody")
        public String messageBody;

        /**
         * <p>Response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("StatusCode")
        public Integer statusCode;

        public static CreateLoadBalancerRequestRulesFixedResponse build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestRulesFixedResponse self = new CreateLoadBalancerRequestRulesFixedResponse();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestRulesFixedResponse setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreateLoadBalancerRequestRulesFixedResponse setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public CreateLoadBalancerRequestRulesFixedResponse setMessageBody(String messageBody) {
            this.messageBody = messageBody;
            return this;
        }
        public String getMessageBody() {
            return this.messageBody;
        }

        public CreateLoadBalancerRequestRulesFixedResponse setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Integer getStatusCode() {
            return this.statusCode;
        }

    }

    public static class CreateLoadBalancerRequestRules extends TeaModel {
        /**
         * <p>Execute a specified response after matching the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;content_type&quot;: &quot;application/json&quot;, &quot;location&quot;: &quot;<a href="http://www.example.com">www.example.com</a>&quot;, &quot;message_body&quot;: &quot;Testing Hello&quot;, &quot;status_code&quot;: 0}</p>
         */
        @NameInMap("FixedResponse")
        public CreateLoadBalancerRequestRulesFixedResponse fixedResponse;

        /**
         * <p>Modify the corresponding load balancing configuration after matching the rule. The fields in the configuration will override the corresponding fields in the load balancer configuration.</p>
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
         * <p>Rule content, using conditional expressions to match user requests. This parameter does not need to be set when adding global configurations. There are two usage scenarios:</p>
         * <ul>
         * <li>Match all incoming requests: Set the value to true</li>
         * <li>Match specific requests: Set the value to a custom expression, e.g., (http.host eq \&quot;video.example.com\&quot;)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.request.method eq &quot;GET&quot; and http.request.version eq &quot;HTTP/1.0&quot;) or (ip.geoip.country eq &quot;CN&quot;) or (http.host eq &quot;<a href="http://www.example.com">www.example.com</a>&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Rule switch. This parameter does not need to be set when adding global configurations. Value range:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>Rule name. This parameter does not need to be set when adding global configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The execution order of the rule. It can be left blank, in which case the rules will be executed in the order they appear in the list. If specified, it should be an integer greater than 0, with higher values indicating a higher priority for execution.</p>
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

        public static CreateLoadBalancerRequestRules build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestRules self = new CreateLoadBalancerRequestRules();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestRules setFixedResponse(CreateLoadBalancerRequestRulesFixedResponse fixedResponse) {
            this.fixedResponse = fixedResponse;
            return this;
        }
        public CreateLoadBalancerRequestRulesFixedResponse getFixedResponse() {
            return this.fixedResponse;
        }

        public CreateLoadBalancerRequestRules setOverrides(Object overrides) {
            this.overrides = overrides;
            return this;
        }
        public Object getOverrides() {
            return this.overrides;
        }

        public CreateLoadBalancerRequestRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateLoadBalancerRequestRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public CreateLoadBalancerRequestRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public CreateLoadBalancerRequestRules setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public CreateLoadBalancerRequestRules setTerminates(Boolean terminates) {
            this.terminates = terminates;
            return this;
        }
        public Boolean getTerminates() {
            return this.terminates;
        }

    }

}
