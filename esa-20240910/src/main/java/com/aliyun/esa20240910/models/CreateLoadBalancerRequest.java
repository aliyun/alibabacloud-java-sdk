// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerRequest extends TeaModel {
    /**
     * <p>The cross-origin address pool back-to-origin configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AdaptiveRouting")
    public CreateLoadBalancerRequestAdaptiveRouting adaptiveRouting;

    /**
     * <p>The list of default address pool IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("DefaultPools")
    public java.util.List<Long> defaultPools;

    /**
     * <p>The description of the load balancer for management and identification purposes.</p>
     * 
     * <strong>example:</strong>
     * <p>Load Balancer Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the load balancer is enabled. Valid values:</p>
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
     * <p>The fallback address pool ID. Traffic is directed to this pool when all other pools are unavailable.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("FallbackPool")
    public Long fallbackPool;

    /**
     * <p>The monitor configuration for health checks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>order</p>
     */
    @NameInMap("Monitor")
    public CreateLoadBalancerRequestMonitor monitor;

    /**
     * <p>The name of the load balancer. The name must be in a valid domain name format and must be a subdomain of the site.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb.example.com</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The weighted round-robin configuration that controls the traffic distribution weight across different address pools.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("RandomSteering")
    public CreateLoadBalancerRequestRandomSteering randomSteering;

    /**
     * <p>The address pools mapped to primary regions.</p>
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
     * <p>The rule information.</p>
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
     * <p>The session persistence mode. Valid values:</p>
     * <ul>
     * <li>off: disabled.</li>
     * <li>ip: IP-based session persistence.</li>
     * <li>cookie: cookie-based session persistence.</li>
     * <li>http_header: HTTP header-based session persistence.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("SessionAffinity")
    public String sessionAffinity;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The load balancing policy. Valid values:</p>
     * <ul>
     * <li>geo: geo-based routing.</li>
     * <li>random: weighted round-robin.</li>
     * <li>order: primary/secondary mode.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>order</p>
     */
    @NameInMap("SteeringPolicy")
    public String steeringPolicy;

    /**
     * <p>The address pools mapped to secondary regions. If multiple secondary regions share the same set of address pools, you can concatenate the secondary region names with commas as the key.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AL,MO&quot;: [92298024898****],&quot;CN-SH,CN-SX,CN-SC&quot;:[92304347804****,92843536908****]}</p>
     */
    @NameInMap("SubRegionPools")
    public Object subRegionPools;

    /**
     * <p>The TTL value, which specifies the time-to-live of the DNS record. Default value: 30 seconds. Valid values: 10 to 600.</p>
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
         * <p>Specifies whether to enable cross-origin address pool failover. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FailoverAcrossPools")
        public Boolean failoverAcrossPools;

        /**
         * <p>Specifies whether to retry the next IP address when back-to-origin fails and the origin server is a domain name that resolves to multiple IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OriginLevelRetry")
        public Boolean originLevelRetry;

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

        public CreateLoadBalancerRequestAdaptiveRouting setOriginLevelRetry(Boolean originLevelRetry) {
            this.originLevelRetry = originLevelRetry;
            return this;
        }
        public Boolean getOriginLevelRetry() {
            return this.originLevelRetry;
        }

    }

    public static class CreateLoadBalancerRequestMonitor extends TeaModel {
        /**
         * <p>The number of consecutive failed probes required to consider the check failed, such as <code>5</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ConsecutiveDown")
        public Integer consecutiveDown;

        /**
         * <p>The number of consecutive successful probes required to consider the check successful, such as <code>3</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ConsecutiveUp")
        public Integer consecutiveUp;

        /**
         * <p>The expected status codes, such as <code>200,202</code>. These are the HTTP response codes that indicate success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ExpectedCodes")
        public String expectedCodes;

        /**
         * <p>Specifies whether to follow redirects. Valid values:</p>
         * <ul>
         * <li>true: Follow redirects.</li>
         * <li>false: Do not follow redirects.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FollowRedirects")
        public Boolean followRedirects;

        /**
         * <p>The header information included in the probe request. This is the HTTP header.</p>
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
         * <p>The monitoring interval in seconds, such as <code>60</code>. This specifies the check frequency.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The monitor request method, such as <code>GET</code>. This is the HTTP method used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The region where the probe nodes are located. Default value: Global. Valid values:</p>
         * <ul>
         * <li>Global: worldwide.</li>
         * <li>ChineseMainland: the Chinese mainland.</li>
         * <li>OutsideChineseMainland: worldwide (excluding the Chinese mainland).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Global</p>
         */
        @NameInMap("MonitoringRegion")
        public String monitoringRegion;

        /**
         * <p>The monitor check path, such as <code>/healthcheck</code>. This is the URI of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>/health</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The origin server port.</p>
         * 
         * <strong>example:</strong>
         * <p>1921</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The health check timeout period. Unit: seconds. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The monitor protocol type used for health checks. A value of off indicates that health checks are disabled. Valid values:</p>
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

        public CreateLoadBalancerRequestMonitor setMonitoringRegion(String monitoringRegion) {
            this.monitoringRegion = monitoringRegion;
            return this;
        }
        public String getMonitoringRegion() {
            return this.monitoringRegion;
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
         * <p>The default round-robin weight applied to all address pools that do not have an individually specified weight. Valid values: integers from 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("DefaultWeight")
        public Integer defaultWeight;

        /**
         * <p>The weight configuration for each backend server pool. The key is the pool ID and the value is the weight coefficient. The weight coefficient represents the relative proportion of traffic distribution.</p>
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
         * <p>The Content-Type field in the HTTP header.</p>
         * 
         * <strong>example:</strong>
         * <p>application/octet-stream</p>
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
         * <p>The response body value.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello World!</p>
         */
        @NameInMap("MessageBody")
        public String messageBody;

        /**
         * <p>The response status code.</p>
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
         * <p>The fixed response content returned after a rule is matched.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;content_type&quot;: &quot;application/json&quot;, &quot;location&quot;: &quot;<a href="http://www.example.com">www.example.com</a>&quot;, &quot;message_body&quot;: &quot;Testing Hello&quot;, &quot;status_code&quot;: 0}</p>
         */
        @NameInMap("FixedResponse")
        public CreateLoadBalancerRequestRulesFixedResponse fixedResponse;

        /**
         * <p>The load balancing configuration that overwrites the corresponding fields in the load balancer configuration when a rule is matched. The specified fields overwrite the corresponding fields in the load balancer configuration.</p>
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
         * <p>The rule content that uses conditional expressions to match user requests. This parameter is not required when you add a global configuration. Two scenarios are supported:</p>
         * <ul>
         * <li>Match all incoming requests: Set the value to true.</li>
         * <li>Match specified requests: Set the value to a custom expression, such as (http.host eq \&quot;video.example.com\&quot;).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.request.method eq &quot;GET&quot; and http.request.version eq &quot;HTTP/1.0&quot;) or (ip.geoip.country eq &quot;CN&quot;) or (http.host eq &quot;<a href="http://www.example.com">www.example.com</a>&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The rule switch. This parameter is not required when you add a global configuration. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>The rule name. This parameter is not required when you add a global configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule execution order. This parameter is optional. If not specified, rules are executed in list order. If specified, the value must be a positive integer. A larger value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>Specifies whether to stop executing subsequent rules. Valid values:</p>
         * <ul>
         * <li>true: Stop executing subsequent rules.</li>
         * <li>false: Continue executing subsequent rules. This is the default value.</li>
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
