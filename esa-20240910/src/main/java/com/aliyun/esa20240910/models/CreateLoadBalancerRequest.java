// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerRequest extends TeaModel {
    /**
     * <p>The configuration for failover across address pools.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AdaptiveRouting")
    public CreateLoadBalancerRequestAdaptiveRouting adaptiveRouting;

    /**
     * <p>A list of default address pool IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("DefaultPools")
    public java.util.List<Long> defaultPools;

    /**
     * <p>A description of the Server Load Balancer.</p>
     * 
     * <strong>example:</strong>
     * <p>Test load balancer description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the Server Load Balancer.</p>
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
     * <p>The ID of the fallback pool. The system directs traffic to this pool when all other pools are unavailable.</p>
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
     * <p>The name of the Server Load Balancer. It must be a valid domain name and a subdomain of the site.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb.example.com</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The configuration for weighted round-robin steering. This setting controls how the system distributes traffic across different address pools based on their weights.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("RandomSteering")
    public CreateLoadBalancerRequestRandomSteering randomSteering;

    /**
     * <p>The mapping of primary regions to address pools.</p>
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
     * <p>A list of rules to override the default traffic steering policy for specific requests.</p>
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
     * <p>Specifies the session affinity policy, which consistently routes requests from the same client to the same origin server. Valid values:</p>
     * <ul>
     * <li><p><code>off</code>: Disables session affinity.</p>
     * </li>
     * <li><p><code>ip</code>: Routes requests based on the client\&quot;s IP address.</p>
     * </li>
     * <li><p><code>cookie</code>: Uses a cookie to maintain session affinity.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("SessionAffinity")
    public String sessionAffinity;

    /**
     * <p>The site ID. Call the <a href="~~ListSites~~">ListSites</a> operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The traffic steering policy, which determines how the system distributes traffic among the address pools. Valid values:</p>
     * <ul>
     * <li><p><code>geo</code>: Geographic routing.</p>
     * </li>
     * <li><p><code>random</code>: Weighted round-robin.</p>
     * </li>
     * <li><p><code>order</code>: Primary/standby.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>order</p>
     */
    @NameInMap("SteeringPolicy")
    public String steeringPolicy;

    /**
     * <p>The mapping of secondary regions to address pools. To map multiple secondary regions to the same address pools, combine their region codes with commas to form the key.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AL,MO&quot;: [92298024898****],&quot;CN-SH,CN-SX,CN-SC&quot;:[92304347804****,92843536908****]}</p>
     */
    @NameInMap("SubRegionPools")
    public Object subRegionPools;

    /**
     * <p>The time to live (TTL) for the DNS record, in seconds. The default value is 30. The value must be between 10 and 600.</p>
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
         * <p>Indicates whether to fail over across address pools.</p>
         * <ul>
         * <li><p><code>true</code>: Yes.</p>
         * </li>
         * <li><p><code>false</code>: No.</p>
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
         * <p>The number of consecutive failed health checks required to mark an origin server as unhealthy. For example, <code>5</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ConsecutiveDown")
        public Integer consecutiveDown;

        /**
         * <p>The number of consecutive successful health checks required to mark an origin server as healthy. For example, <code>3</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ConsecutiveUp")
        public Integer consecutiveUp;

        /**
         * <p>The expected HTTP status codes that indicate a successful health check. Separate multiple codes with commas. For example, <code>200,202</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ExpectedCodes")
        public String expectedCodes;

        /**
         * <p>Specifies whether the health check monitor follows HTTP redirects.</p>
         * <ul>
         * <li><p><code>true</code>: Yes.</p>
         * </li>
         * <li><p><code>false</code>: No.</p>
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
         * <p>The interval in seconds between consecutive health checks. For example, <code>60</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The HTTP method for the health check. For example, <code>GET</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The regions from which the monitor initiates health check probes. Default: <code>Global</code>. Valid values:</p>
         * <ul>
         * <li><p><code>Global</code>: Worldwide.</p>
         * </li>
         * <li><p><code>ChineseMainland</code>: Chinese mainland.</p>
         * </li>
         * <li><p><code>OutsideChineseMainland</code>: Regions outside the Chinese mainland.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Global</p>
         */
        @NameInMap("MonitoringRegion")
        public String monitoringRegion;

        /**
         * <p>The request path for the HTTP health check. For example, <code>/healthcheck</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>/health</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The port on the origin server to check.</p>
         * 
         * <strong>example:</strong>
         * <p>1921</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The timeout for the health check, in seconds. The value must be between 1 and 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The protocol for the health check. Setting this to <code>off</code> disables health checks. Valid values:</p>
         * <ul>
         * <li><p>TCP</p>
         * </li>
         * <li><p>UDP</p>
         * </li>
         * <li><p>SMTP</p>
         * </li>
         * <li><p>HTTPS</p>
         * </li>
         * <li><p>HTTP</p>
         * </li>
         * <li><p>ICMP Ping</p>
         * </li>
         * <li><p>off</p>
         * </li>
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
         * <p>The default weight for the weighted round-robin policy. This weight applies to all address pools without a specifically assigned weight. Valid values: 0–100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("DefaultWeight")
        public Integer defaultWeight;

        /**
         * <p>A map of weights for each address pool, where the key is the pool ID and the value is its weight. The weight determines the proportion of traffic that the pool receives.</p>
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
         * <p>The value of the <code>Content-Type</code> field in the HTTP response header.</p>
         * 
         * <strong>example:</strong>
         * <p>application/octet-stream</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The value of the <code>Location</code> field in the HTTP response header, typically used for redirects.</p>
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
         * <p>Specifies a fixed response to return when a request matches the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;content_type&quot;: &quot;application/json&quot;, &quot;location&quot;: &quot;<a href="http://www.example.com">www.example.com</a>&quot;, &quot;message_body&quot;: &quot;Testing Hello&quot;, &quot;status_code&quot;: 0}</p>
         */
        @NameInMap("FixedResponse")
        public CreateLoadBalancerRequestRulesFixedResponse fixedResponse;

        /**
         * <p>The Server Load Balancer settings to override when a request matches the rule. The fields specified here replace the corresponding fields in the main Server Load Balancer configuration.</p>
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
         * <p>A conditional expression that matches incoming requests.</p>
         * <ul>
         * <li><p>To match all incoming requests, set the value to <code>true</code>.</p>
         * </li>
         * <li><p>To match specific requests, provide a custom expression, such as <code>(http.host eq &quot;video.example.com&quot;)</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.request.method eq &quot;GET&quot; and http.request.version eq &quot;HTTP/1.0&quot;) or (ip.geoip.country eq &quot;CN&quot;) or (http.host eq &quot;<a href="http://www.example.com">www.example.com</a>&quot;)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Specifies whether the rule is enabled. This parameter is not required when adding a global configuration. Valid values:</p>
         * <ul>
         * <li><p><code>on</code>: The rule is enabled.</p>
         * </li>
         * <li><p><code>off</code>: The rule is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>The name of the rule. This parameter is not required when adding a global configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The execution order of the rule. If you do not specify a value, the system executes rules in the order they appear in the list. If specified, the value must be an integer greater than 0. The system executes rules with a higher value first.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>Specifies whether to stop processing subsequent rules after a match.</p>
         * <ul>
         * <li><p><code>true</code>: Yes.</p>
         * </li>
         * <li><p><code>false</code>: No. (Default)</p>
         * </li>
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
