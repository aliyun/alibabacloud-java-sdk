// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerRequest extends TeaModel {
    @NameInMap("AdaptiveRouting")
    public UpdateLoadBalancerRequestAdaptiveRouting adaptiveRouting;

    @NameInMap("DefaultPools")
    public java.util.List<Long> defaultPools;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>96228666776****</p>
     */
    @NameInMap("FallbackPool")
    public Long fallbackPool;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95913670174****</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("Monitor")
    public UpdateLoadBalancerRequestMonitor monitor;

    @NameInMap("RandomSteering")
    public UpdateLoadBalancerRequestRandomSteering randomSteering;

    /**
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
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Rules")
    public java.util.List<UpdateLoadBalancerRequestRules> rules;

    /**
     * <p>Session persistence. Valid values:</p>
     * <ul>
     * <li>off:disables session persistence.</li>
     * <li>ip: enables session persistence by IP address.</li>
     * <li>cookie: disables session persistence.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("SessionAffinity")
    public String sessionAffinity;

    @NameInMap("SessionAffinityAttributes")
    public UpdateLoadBalancerRequestSessionAffinityAttributes sessionAffinityAttributes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UpdateLoadBalancer</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <strong>example:</strong>
     * <p>order</p>
     */
    @NameInMap("SteeringPolicy")
    public String steeringPolicy;

    /**
     * <strong>example:</strong>
     * <p>{&quot;AL,MO&quot;: [92298024898****],&quot;CN-SH,CN-SX,CN-SC&quot;:[92304347804****,92843536908****]}</p>
     */
    @NameInMap("SubRegionPools")
    public Object subRegionPools;

    /**
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

    public UpdateLoadBalancerRequest setSessionAffinityAttributes(UpdateLoadBalancerRequestSessionAffinityAttributes sessionAffinityAttributes) {
        this.sessionAffinityAttributes = sessionAffinityAttributes;
        return this;
    }
    public UpdateLoadBalancerRequestSessionAffinityAttributes getSessionAffinityAttributes() {
        return this.sessionAffinityAttributes;
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
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FailoverAcrossPools")
        public Boolean failoverAcrossPools;

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

    }

    public static class UpdateLoadBalancerRequestMonitor extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ConsecutiveDown")
        public Integer consecutiveDown;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ConsecutiveUp")
        public Integer consecutiveUp;

        /**
         * <strong>example:</strong>
         * <p>200,202</p>
         */
        @NameInMap("ExpectedCodes")
        public String expectedCodes;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FollowRedirects")
        public Boolean followRedirects;

        /**
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
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <strong>example:</strong>
         * <p>/health</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
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
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("DefaultWeight")
        public Integer defaultWeight;

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
         * <strong>example:</strong>
         * <p>application/json</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/index.html">http://www.example.com/index.html</a></p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>Hello World!</p>
         */
        @NameInMap("MessageBody")
        public String messageBody;

        /**
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
        @NameInMap("FixedResponse")
        public UpdateLoadBalancerRequestRulesFixedResponse fixedResponse;

        /**
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
         * <strong>example:</strong>
         * <p>http.request.method eq &quot;GET&quot;</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("RuleEnable")
        public String ruleEnable;

        /**
         * <strong>example:</strong>
         * <p>rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
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

    public static class UpdateLoadBalancerRequestSessionAffinityAttributes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Lax</p>
         */
        @NameInMap("SameSite")
        public String sameSite;

        /**
         * <strong>example:</strong>
         * <p>Always</p>
         */
        @NameInMap("Secure")
        public String secure;

        /**
         * <strong>example:</strong>
         * <p>sticky</p>
         */
        @NameInMap("ZeroDowntimeFailover")
        public String zeroDowntimeFailover;

        public static UpdateLoadBalancerRequestSessionAffinityAttributes build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoadBalancerRequestSessionAffinityAttributes self = new UpdateLoadBalancerRequestSessionAffinityAttributes();
            return TeaModel.build(map, self);
        }

        public UpdateLoadBalancerRequestSessionAffinityAttributes setSameSite(String sameSite) {
            this.sameSite = sameSite;
            return this;
        }
        public String getSameSite() {
            return this.sameSite;
        }

        public UpdateLoadBalancerRequestSessionAffinityAttributes setSecure(String secure) {
            this.secure = secure;
            return this;
        }
        public String getSecure() {
            return this.secure;
        }

        public UpdateLoadBalancerRequestSessionAffinityAttributes setZeroDowntimeFailover(String zeroDowntimeFailover) {
            this.zeroDowntimeFailover = zeroDowntimeFailover;
            return this;
        }
        public String getZeroDowntimeFailover() {
            return this.zeroDowntimeFailover;
        }

    }

}
