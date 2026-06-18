// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateTransportLayerApplicationShrinkRequest extends TeaModel {
    /**
     * <p>The transport layer application ID. You can obtain this ID by calling the <a href="~~ListTransportLayerApplications~~">ListTransportLayerApplications</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>165503967****</p>
     */
    @NameInMap("ApplicationId")
    public Long applicationId;

    /**
     * <p>Specifies whether to enable cross-border optimization for network access from the Chinese mainland. This feature is disabled by default. Valid values:</p>
     * <ul>
     * <li><p>on: Enables the feature.</p>
     * </li>
     * <li><p>off: Disables the feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CrossBorderOptimization")
    public String crossBorderOptimization;

    /**
     * <p>Specifies whether to enable IP access rules. If enabled, the IP access rules in WAF apply to the transport layer application. Valid values:</p>
     * <ul>
     * <li><p>on: Enables the feature.</p>
     * </li>
     * <li><p>off: Disables the feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("IpAccessRule")
    public String ipAccessRule;

    /**
     * <p>Specifies whether to enable IPv6. Valid values: <code>on</code> and <code>off</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Ipv6")
    public String ipv6;

    @NameInMap("KeepAliveProtection")
    public String keepAliveProtection;

    /**
     * <p>A list of forwarding rules. For each rule, all parameters are required except for <code>Comment</code>.</p>
     */
    @NameInMap("Rules")
    public String rulesShrink;

    /**
     * <p>The site ID. You can obtain this ID by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    @NameInMap("StaticIp")
    public String staticIp;

    public static UpdateTransportLayerApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransportLayerApplicationShrinkRequest self = new UpdateTransportLayerApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTransportLayerApplicationShrinkRequest setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public Long getApplicationId() {
        return this.applicationId;
    }

    public UpdateTransportLayerApplicationShrinkRequest setCrossBorderOptimization(String crossBorderOptimization) {
        this.crossBorderOptimization = crossBorderOptimization;
        return this;
    }
    public String getCrossBorderOptimization() {
        return this.crossBorderOptimization;
    }

    public UpdateTransportLayerApplicationShrinkRequest setIpAccessRule(String ipAccessRule) {
        this.ipAccessRule = ipAccessRule;
        return this;
    }
    public String getIpAccessRule() {
        return this.ipAccessRule;
    }

    public UpdateTransportLayerApplicationShrinkRequest setIpv6(String ipv6) {
        this.ipv6 = ipv6;
        return this;
    }
    public String getIpv6() {
        return this.ipv6;
    }

    public UpdateTransportLayerApplicationShrinkRequest setKeepAliveProtection(String keepAliveProtection) {
        this.keepAliveProtection = keepAliveProtection;
        return this;
    }
    public String getKeepAliveProtection() {
        return this.keepAliveProtection;
    }

    public UpdateTransportLayerApplicationShrinkRequest setRulesShrink(String rulesShrink) {
        this.rulesShrink = rulesShrink;
        return this;
    }
    public String getRulesShrink() {
        return this.rulesShrink;
    }

    public UpdateTransportLayerApplicationShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateTransportLayerApplicationShrinkRequest setStaticIp(String staticIp) {
        this.staticIp = staticIp;
        return this;
    }
    public String getStaticIp() {
        return this.staticIp;
    }

}
