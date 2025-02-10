// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AdaptiveRouting")
    public CreateLoadBalancerRequestAdaptiveRouting adaptiveRouting;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AL,MO&quot;: [92298024898****],&quot;CN-SH,CN-SX,CN-SC&quot;:[92304347804****,92843536908****]}</p>
     */
    @NameInMap("DefaultPools")
    public java.util.List<Long> defaultPools;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("FallbackPool")
    public Long fallbackPool;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>order</p>
     */
    @NameInMap("Monitor")
    public CreateLoadBalancerRequestMonitor monitor;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb.example.com</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("RandomSteering")
    public CreateLoadBalancerRequestRandomSteering randomSteering;

    @NameInMap("RegionPools")
    public Object regionPools;

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
    @NameInMap("Rules")
    public java.util.List<CreateLoadBalancerRequestRules> rules;

    @NameInMap("SessionAffinity")
    public String sessionAffinity;

    @NameInMap("SessionAffinityAttributes")
    public CreateLoadBalancerRequestSessionAffinityAttributes sessionAffinityAttributes;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("SteeringPolicy")
    public String steeringPolicy;

    @NameInMap("SubRegionPools")
    public Object subRegionPools;

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

    public CreateLoadBalancerRequest setSessionAffinityAttributes(CreateLoadBalancerRequestSessionAffinityAttributes sessionAffinityAttributes) {
        this.sessionAffinityAttributes = sessionAffinityAttributes;
        return this;
    }
    public CreateLoadBalancerRequestSessionAffinityAttributes getSessionAffinityAttributes() {
        return this.sessionAffinityAttributes;
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
        @NameInMap("ConsecutiveDown")
        public Integer consecutiveDown;

        @NameInMap("ConsecutiveUp")
        public Integer consecutiveUp;

        @NameInMap("ExpectedCodes")
        public String expectedCodes;

        @NameInMap("FollowRedirects")
        public Boolean followRedirects;

        @NameInMap("Header")
        public Object header;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("Method")
        public String method;

        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Timeout")
        public Integer timeout;

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
        @NameInMap("DefaultWeight")
        public Integer defaultWeight;

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
        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("Location")
        public String location;

        @NameInMap("MessageBody")
        public String messageBody;

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
        @NameInMap("FixedResponse")
        public CreateLoadBalancerRequestRulesFixedResponse fixedResponse;

        @NameInMap("Overrides")
        public Object overrides;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RuleEnable")
        public String ruleEnable;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Sequence")
        public Integer sequence;

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

    public static class CreateLoadBalancerRequestSessionAffinityAttributes extends TeaModel {
        @NameInMap("SameSite")
        public String sameSite;

        @NameInMap("Secure")
        public String secure;

        @NameInMap("ZeroDowntimeFailover")
        public String zeroDowntimeFailover;

        public static CreateLoadBalancerRequestSessionAffinityAttributes build(java.util.Map<String, ?> map) throws Exception {
            CreateLoadBalancerRequestSessionAffinityAttributes self = new CreateLoadBalancerRequestSessionAffinityAttributes();
            return TeaModel.build(map, self);
        }

        public CreateLoadBalancerRequestSessionAffinityAttributes setSameSite(String sameSite) {
            this.sameSite = sameSite;
            return this;
        }
        public String getSameSite() {
            return this.sameSite;
        }

        public CreateLoadBalancerRequestSessionAffinityAttributes setSecure(String secure) {
            this.secure = secure;
            return this;
        }
        public String getSecure() {
            return this.secure;
        }

        public CreateLoadBalancerRequestSessionAffinityAttributes setZeroDowntimeFailover(String zeroDowntimeFailover) {
            this.zeroDowntimeFailover = zeroDowntimeFailover;
            return this;
        }
        public String getZeroDowntimeFailover() {
            return this.zeroDowntimeFailover;
        }

    }

}
