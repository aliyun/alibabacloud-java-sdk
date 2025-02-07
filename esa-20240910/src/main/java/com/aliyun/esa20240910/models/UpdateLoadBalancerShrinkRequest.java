// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerShrinkRequest extends TeaModel {
    @NameInMap("AdaptiveRouting")
    public String adaptiveRoutingShrink;

    @NameInMap("DefaultPools")
    public String defaultPoolsShrink;

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
    public String monitorShrink;

    @NameInMap("RandomSteering")
    public String randomSteeringShrink;

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
    public String rulesShrink;

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
    public String sessionAffinityAttributesShrink;

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

    public static UpdateLoadBalancerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerShrinkRequest self = new UpdateLoadBalancerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerShrinkRequest setAdaptiveRoutingShrink(String adaptiveRoutingShrink) {
        this.adaptiveRoutingShrink = adaptiveRoutingShrink;
        return this;
    }
    public String getAdaptiveRoutingShrink() {
        return this.adaptiveRoutingShrink;
    }

    public UpdateLoadBalancerShrinkRequest setDefaultPoolsShrink(String defaultPoolsShrink) {
        this.defaultPoolsShrink = defaultPoolsShrink;
        return this;
    }
    public String getDefaultPoolsShrink() {
        return this.defaultPoolsShrink;
    }

    public UpdateLoadBalancerShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLoadBalancerShrinkRequest setFallbackPool(Long fallbackPool) {
        this.fallbackPool = fallbackPool;
        return this;
    }
    public Long getFallbackPool() {
        return this.fallbackPool;
    }

    public UpdateLoadBalancerShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLoadBalancerShrinkRequest setMonitorShrink(String monitorShrink) {
        this.monitorShrink = monitorShrink;
        return this;
    }
    public String getMonitorShrink() {
        return this.monitorShrink;
    }

    public UpdateLoadBalancerShrinkRequest setRandomSteeringShrink(String randomSteeringShrink) {
        this.randomSteeringShrink = randomSteeringShrink;
        return this;
    }
    public String getRandomSteeringShrink() {
        return this.randomSteeringShrink;
    }

    public UpdateLoadBalancerShrinkRequest setRegionPools(Object regionPools) {
        this.regionPools = regionPools;
        return this;
    }
    public Object getRegionPools() {
        return this.regionPools;
    }

    public UpdateLoadBalancerShrinkRequest setRulesShrink(String rulesShrink) {
        this.rulesShrink = rulesShrink;
        return this;
    }
    public String getRulesShrink() {
        return this.rulesShrink;
    }

    public UpdateLoadBalancerShrinkRequest setSessionAffinity(String sessionAffinity) {
        this.sessionAffinity = sessionAffinity;
        return this;
    }
    public String getSessionAffinity() {
        return this.sessionAffinity;
    }

    public UpdateLoadBalancerShrinkRequest setSessionAffinityAttributesShrink(String sessionAffinityAttributesShrink) {
        this.sessionAffinityAttributesShrink = sessionAffinityAttributesShrink;
        return this;
    }
    public String getSessionAffinityAttributesShrink() {
        return this.sessionAffinityAttributesShrink;
    }

    public UpdateLoadBalancerShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateLoadBalancerShrinkRequest setSteeringPolicy(String steeringPolicy) {
        this.steeringPolicy = steeringPolicy;
        return this;
    }
    public String getSteeringPolicy() {
        return this.steeringPolicy;
    }

    public UpdateLoadBalancerShrinkRequest setSubRegionPools(Object subRegionPools) {
        this.subRegionPools = subRegionPools;
        return this;
    }
    public Object getSubRegionPools() {
        return this.subRegionPools;
    }

    public UpdateLoadBalancerShrinkRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
