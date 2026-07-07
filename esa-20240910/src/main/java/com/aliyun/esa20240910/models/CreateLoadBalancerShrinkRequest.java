// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerShrinkRequest extends TeaModel {
    /**
     * <p>The cross-origin address pool back-to-origin configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AdaptiveRouting")
    public String adaptiveRoutingShrink;

    /**
     * <p>The list of default address pool IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("DefaultPools")
    public String defaultPoolsShrink;

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
    public String monitorShrink;

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
    public String randomSteeringShrink;

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
    public String rulesShrink;

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
