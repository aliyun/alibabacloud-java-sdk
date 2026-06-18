// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerShrinkRequest extends TeaModel {
    /**
     * <p>The configuration for failover across address pools.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AdaptiveRouting")
    public String adaptiveRoutingShrink;

    /**
     * <p>A list of default address pool IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("DefaultPools")
    public String defaultPoolsShrink;

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
    public String monitorShrink;

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
    public String randomSteeringShrink;

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
    public String rulesShrink;

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

    public static CreateLoadBalancerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerShrinkRequest self = new CreateLoadBalancerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerShrinkRequest setAdaptiveRoutingShrink(String adaptiveRoutingShrink) {
        this.adaptiveRoutingShrink = adaptiveRoutingShrink;
        return this;
    }
    public String getAdaptiveRoutingShrink() {
        return this.adaptiveRoutingShrink;
    }

    public CreateLoadBalancerShrinkRequest setDefaultPoolsShrink(String defaultPoolsShrink) {
        this.defaultPoolsShrink = defaultPoolsShrink;
        return this;
    }
    public String getDefaultPoolsShrink() {
        return this.defaultPoolsShrink;
    }

    public CreateLoadBalancerShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLoadBalancerShrinkRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateLoadBalancerShrinkRequest setFallbackPool(Long fallbackPool) {
        this.fallbackPool = fallbackPool;
        return this;
    }
    public Long getFallbackPool() {
        return this.fallbackPool;
    }

    public CreateLoadBalancerShrinkRequest setMonitorShrink(String monitorShrink) {
        this.monitorShrink = monitorShrink;
        return this;
    }
    public String getMonitorShrink() {
        return this.monitorShrink;
    }

    public CreateLoadBalancerShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLoadBalancerShrinkRequest setRandomSteeringShrink(String randomSteeringShrink) {
        this.randomSteeringShrink = randomSteeringShrink;
        return this;
    }
    public String getRandomSteeringShrink() {
        return this.randomSteeringShrink;
    }

    public CreateLoadBalancerShrinkRequest setRegionPools(Object regionPools) {
        this.regionPools = regionPools;
        return this;
    }
    public Object getRegionPools() {
        return this.regionPools;
    }

    public CreateLoadBalancerShrinkRequest setRulesShrink(String rulesShrink) {
        this.rulesShrink = rulesShrink;
        return this;
    }
    public String getRulesShrink() {
        return this.rulesShrink;
    }

    public CreateLoadBalancerShrinkRequest setSessionAffinity(String sessionAffinity) {
        this.sessionAffinity = sessionAffinity;
        return this;
    }
    public String getSessionAffinity() {
        return this.sessionAffinity;
    }

    public CreateLoadBalancerShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateLoadBalancerShrinkRequest setSteeringPolicy(String steeringPolicy) {
        this.steeringPolicy = steeringPolicy;
        return this;
    }
    public String getSteeringPolicy() {
        return this.steeringPolicy;
    }

    public CreateLoadBalancerShrinkRequest setSubRegionPools(Object subRegionPools) {
        this.subRegionPools = subRegionPools;
        return this;
    }
    public Object getSubRegionPools() {
        return this.subRegionPools;
    }

    public CreateLoadBalancerShrinkRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
