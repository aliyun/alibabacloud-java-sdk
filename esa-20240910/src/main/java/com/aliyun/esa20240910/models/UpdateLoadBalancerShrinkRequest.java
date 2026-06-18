// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerShrinkRequest extends TeaModel {
    /**
     * <p>Configures origin-pull behavior across address pools.</p>
     */
    @NameInMap("AdaptiveRouting")
    public String adaptiveRoutingShrink;

    /**
     * <p>A list of default address pool IDs.</p>
     */
    @NameInMap("DefaultPools")
    public String defaultPoolsShrink;

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
    public String monitorShrink;

    /**
     * <p>The configuration for weighted round-robin. This setting controls the weight of traffic distributed to different address pools.</p>
     */
    @NameInMap("RandomSteering")
    public String randomSteeringShrink;

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
    public String rulesShrink;

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

    public UpdateLoadBalancerShrinkRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
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
