// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListLoadBalancersResponseBody extends TeaModel {
    /**
     * <p>Array format, returns a list of load balancers.</p>
     */
    @NameInMap("LoadBalancers")
    public java.util.List<ListLoadBalancersResponseBodyLoadBalancers> loadBalancers;

    /**
     * <p>Page number, same as the PageNumber in the request parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The size of each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of items.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListLoadBalancersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLoadBalancersResponseBody self = new ListLoadBalancersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLoadBalancersResponseBody setLoadBalancers(java.util.List<ListLoadBalancersResponseBodyLoadBalancers> loadBalancers) {
        this.loadBalancers = loadBalancers;
        return this;
    }
    public java.util.List<ListLoadBalancersResponseBodyLoadBalancers> getLoadBalancers() {
        return this.loadBalancers;
    }

    public ListLoadBalancersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLoadBalancersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLoadBalancersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLoadBalancersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListLoadBalancersResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListLoadBalancersResponseBodyLoadBalancersAdaptiveRouting extends TeaModel {
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

        public static ListLoadBalancersResponseBodyLoadBalancersAdaptiveRouting build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersAdaptiveRouting self = new ListLoadBalancersResponseBodyLoadBalancersAdaptiveRouting();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersAdaptiveRouting setFailoverAcrossPools(Boolean failoverAcrossPools) {
            this.failoverAcrossPools = failoverAcrossPools;
            return this;
        }
        public Boolean getFailoverAcrossPools() {
            return this.failoverAcrossPools;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersMonitor extends TeaModel {
        /**
         * <p>The number of consecutive failed probes required to consider the target as unhealthy, e.g., 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ConsecutiveDown")
        public Integer consecutiveDown;

        /**
         * <p>The number of consecutive successful probes required to consider the target as healthy, e.g., 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ConsecutiveUp")
        public Integer consecutiveUp;

        /**
         * <p>The expected status codes, such as 200, 202, indicating a successful HTTP response.</p>
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
         * <p>The header information included during the probe, i.e., HTTP headers.</p>
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
         * <p>The interval time for the health check, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The method used for the health check.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The path.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The target port.</p>
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
         * <p>The type of monitor protocol, such as HTTP, used for health checks. When the value is <code>off</code>, it indicates that no check will be performed.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListLoadBalancersResponseBodyLoadBalancersMonitor build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersMonitor self = new ListLoadBalancersResponseBodyLoadBalancersMonitor();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersMonitor setConsecutiveDown(Integer consecutiveDown) {
            this.consecutiveDown = consecutiveDown;
            return this;
        }
        public Integer getConsecutiveDown() {
            return this.consecutiveDown;
        }

        public ListLoadBalancersResponseBodyLoadBalancersMonitor setConsecutiveUp(Integer consecutiveUp) {
            this.consecutiveUp = consecutiveUp;
            return this;
        }
        public Integer getConsecutiveUp() {
            return this.consecutiveUp;
        }

        public ListLoadBalancersResponseBodyLoadBalancersMonitor setExpectedCodes(String expectedCodes) {
            this.expectedCodes = expectedCodes;
            return this;
        }
        public String getExpectedCodes() {
            return this.expectedCodes;
        }

        public ListLoadBalancersResponseBodyLoadBalancersMonitor setFollowRedirects(Boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }
        public Boolean getFollowRedirects() {
            return this.followRedirects;
        }

        public ListLoadBalancersResponseBodyLoadBalancersMonitor setHeader(Object header) {
            this.header = header;
            return this;
        }
        public Object getHeader() {
            return this.header;
        }

        public ListLoadBalancersResponseBodyLoadBalancersMonitor setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ListLoadBalancersResponseBodyLoadBalancersMonitor setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ListLoadBalancersResponseBodyLoadBalancersMonitor setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListLoadBalancersResponseBodyLoadBalancersMonitor setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListLoadBalancersResponseBodyLoadBalancersMonitor setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListLoadBalancersResponseBodyLoadBalancersMonitor setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersRandomSteering extends TeaModel {
        /**
         * <p>Weight configuration for each backend server pool, where the key is the pool ID and the value is the weight coefficient. The weight coefficient represents the proportion of relative traffic distribution.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("DefaultWeight")
        public Integer defaultWeight;

        /**
         * <p>Weight configuration for each backend server pool, where the key is the pool ID and the value is the weight coefficient.</p>
         */
        @NameInMap("PoolWeights")
        public java.util.Map<String, Integer> poolWeights;

        public static ListLoadBalancersResponseBodyLoadBalancersRandomSteering build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersRandomSteering self = new ListLoadBalancersResponseBodyLoadBalancersRandomSteering();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersRandomSteering setDefaultWeight(Integer defaultWeight) {
            this.defaultWeight = defaultWeight;
            return this;
        }
        public Integer getDefaultWeight() {
            return this.defaultWeight;
        }

        public ListLoadBalancersResponseBodyLoadBalancersRandomSteering setPoolWeights(java.util.Map<String, Integer> poolWeights) {
            this.poolWeights = poolWeights;
            return this;
        }
        public java.util.Map<String, Integer> getPoolWeights() {
            return this.poolWeights;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersRulesFixedResponse extends TeaModel {
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
         * <p>The response body value.</p>
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

        public static ListLoadBalancersResponseBodyLoadBalancersRulesFixedResponse build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersRulesFixedResponse self = new ListLoadBalancersResponseBodyLoadBalancersRulesFixedResponse();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersRulesFixedResponse setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ListLoadBalancersResponseBodyLoadBalancersRulesFixedResponse setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListLoadBalancersResponseBodyLoadBalancersRulesFixedResponse setMessageBody(String messageBody) {
            this.messageBody = messageBody;
            return this;
        }
        public String getMessageBody() {
            return this.messageBody;
        }

        public ListLoadBalancersResponseBodyLoadBalancersRulesFixedResponse setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Integer getStatusCode() {
            return this.statusCode;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancersRules extends TeaModel {
        /**
         * <p>Executes a specified response after matching the rule.</p>
         */
        @NameInMap("FixedResponse")
        public ListLoadBalancersResponseBodyLoadBalancersRulesFixedResponse fixedResponse;

        /**
         * <p>Modifies the corresponding load balancer configuration after matching the rule. The fields in this configuration will override the corresponding fields in the load balancer configuration.</p>
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
         * <p>Matching rule information.</p>
         * 
         * <strong>example:</strong>
         * <p>http.request.uri.path contains &quot;/testing&quot;</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Rule switch.</p>
         * <ul>
         * <li>on: Enable the rule. </li>
         * <li>off: Disable the rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <p>Rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>r2</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The execution order of the rule.</p>
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
         * <li>false: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Terminates")
        public Boolean terminates;

        public static ListLoadBalancersResponseBodyLoadBalancersRules build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancersRules self = new ListLoadBalancersResponseBodyLoadBalancersRules();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancersRules setFixedResponse(ListLoadBalancersResponseBodyLoadBalancersRulesFixedResponse fixedResponse) {
            this.fixedResponse = fixedResponse;
            return this;
        }
        public ListLoadBalancersResponseBodyLoadBalancersRulesFixedResponse getFixedResponse() {
            return this.fixedResponse;
        }

        public ListLoadBalancersResponseBodyLoadBalancersRules setOverrides(Object overrides) {
            this.overrides = overrides;
            return this;
        }
        public Object getOverrides() {
            return this.overrides;
        }

        public ListLoadBalancersResponseBodyLoadBalancersRules setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListLoadBalancersResponseBodyLoadBalancersRules setRuleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }
        public String getRuleEnable() {
            return this.ruleEnable;
        }

        public ListLoadBalancersResponseBodyLoadBalancersRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListLoadBalancersResponseBodyLoadBalancersRules setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListLoadBalancersResponseBodyLoadBalancersRules setTerminates(Boolean terminates) {
            this.terminates = terminates;
            return this;
        }
        public Boolean getTerminates() {
            return this.terminates;
        }

    }

    public static class ListLoadBalancersResponseBodyLoadBalancers extends TeaModel {
        /**
         * <p>Cross-pool fallback configuration.</p>
         */
        @NameInMap("AdaptiveRouting")
        public ListLoadBalancersResponseBodyLoadBalancersAdaptiveRouting adaptiveRouting;

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
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Fallback pool ID, to which traffic will be redirected if all other pools are unavailable.</p>
         * 
         * <strong>example:</strong>
         * <p>96228666776****</p>
         */
        @NameInMap("FallbackPool")
        public Long fallbackPool;

        /**
         * <p>Unique identifier ID of the load balancer.</p>
         * 
         * <strong>example:</strong>
         * <p>998676487607104</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Monitor configuration.</p>
         */
        @NameInMap("Monitor")
        public ListLoadBalancersResponseBodyLoadBalancersMonitor monitor;

        /**
         * <p>Name of the load balancer.</p>
         * 
         * <strong>example:</strong>
         * <p>lb.example.com</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Weighted round-robin configuration, used to control the traffic distribution weights among different address pools.</p>
         */
        @NameInMap("RandomSteering")
        public ListLoadBalancersResponseBodyLoadBalancersRandomSteering randomSteering;

        /**
         * <p>Address pool corresponding to the primary region.</p>
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
         * <p>List of rule configurations, used to define behaviors under specific conditions.</p>
         */
        @NameInMap("Rules")
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersRules> rules;

        /**
         * <p>Session persistence, with values:</p>
         * <ul>
         * <li>off: Not enabled.</li>
         * <li>ip: Session persistence by IP.</li>
         * <li>cookie: Not enabled for session persistence.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("SessionAffinity")
        public String sessionAffinity;

        /**
         * <p>Site ID to which the load balancer belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1159101787****</p>
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
         * <p>The address pools corresponding to secondary regions. When multiple secondary regions share a set of address pools, the keys can be concatenated with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AL,MO&quot;: [92298024898****],&quot;CN-SH,CN-SX,CN-SC&quot;:[92304347804****,92843536908****]}</p>
         */
        @NameInMap("SubRegionPools")
        public Object subRegionPools;

        /**
         * <p>TTL value, the time-to-live for DNS records, default is 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        public static ListLoadBalancersResponseBodyLoadBalancers build(java.util.Map<String, ?> map) throws Exception {
            ListLoadBalancersResponseBodyLoadBalancers self = new ListLoadBalancersResponseBodyLoadBalancers();
            return TeaModel.build(map, self);
        }

        public ListLoadBalancersResponseBodyLoadBalancers setAdaptiveRouting(ListLoadBalancersResponseBodyLoadBalancersAdaptiveRouting adaptiveRouting) {
            this.adaptiveRouting = adaptiveRouting;
            return this;
        }
        public ListLoadBalancersResponseBodyLoadBalancersAdaptiveRouting getAdaptiveRouting() {
            return this.adaptiveRouting;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setDefaultPools(java.util.List<Long> defaultPools) {
            this.defaultPools = defaultPools;
            return this;
        }
        public java.util.List<Long> getDefaultPools() {
            return this.defaultPools;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setFallbackPool(Long fallbackPool) {
            this.fallbackPool = fallbackPool;
            return this;
        }
        public Long getFallbackPool() {
            return this.fallbackPool;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setMonitor(ListLoadBalancersResponseBodyLoadBalancersMonitor monitor) {
            this.monitor = monitor;
            return this;
        }
        public ListLoadBalancersResponseBodyLoadBalancersMonitor getMonitor() {
            return this.monitor;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setRandomSteering(ListLoadBalancersResponseBodyLoadBalancersRandomSteering randomSteering) {
            this.randomSteering = randomSteering;
            return this;
        }
        public ListLoadBalancersResponseBodyLoadBalancersRandomSteering getRandomSteering() {
            return this.randomSteering;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setRegionPools(Object regionPools) {
            this.regionPools = regionPools;
            return this;
        }
        public Object getRegionPools() {
            return this.regionPools;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setRules(java.util.List<ListLoadBalancersResponseBodyLoadBalancersRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListLoadBalancersResponseBodyLoadBalancersRules> getRules() {
            return this.rules;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setSessionAffinity(String sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }
        public String getSessionAffinity() {
            return this.sessionAffinity;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setSteeringPolicy(String steeringPolicy) {
            this.steeringPolicy = steeringPolicy;
            return this;
        }
        public String getSteeringPolicy() {
            return this.steeringPolicy;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setSubRegionPools(Object subRegionPools) {
            this.subRegionPools = subRegionPools;
            return this;
        }
        public Object getSubRegionPools() {
            return this.subRegionPools;
        }

        public ListLoadBalancersResponseBodyLoadBalancers setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

    }

}
