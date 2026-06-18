// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateTransportLayerApplicationShrinkRequest extends TeaModel {
    /**
     * <p>Enables or disables network optimization for access from the Chinese mainland. This feature is disabled by default. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables the optimization.</p>
     * </li>
     * <li><p><code>off</code>: Disables the optimization.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CrossBorderOptimization")
    public String crossBorderOptimization;

    /**
     * <p>Applies IP access rules from Web Application Firewall (WAF) to this Transport Layer Application. Valid values:</p>
     * <ul>
     * <li><p><code>on</code>: Enables the feature.</p>
     * </li>
     * <li><p><code>off</code>: Disables the feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("IpAccessRule")
    public String ipAccessRule;

    /**
     * <p>Enables or disables IPv6 support.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Ipv6")
    public String ipv6;

    /**
     * <p>Enables or disables keep-alive protection.</p>
     */
    @NameInMap("KeepAliveProtection")
    public String keepAliveProtection;

    /**
     * <p>The domain name of the Transport Layer Application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aaa.example.com</p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>The list of forwarding rules.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Rules")
    public String rulesShrink;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    @NameInMap("StaticIp")
    public String staticIp;

    public static CreateTransportLayerApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransportLayerApplicationShrinkRequest self = new CreateTransportLayerApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransportLayerApplicationShrinkRequest setCrossBorderOptimization(String crossBorderOptimization) {
        this.crossBorderOptimization = crossBorderOptimization;
        return this;
    }
    public String getCrossBorderOptimization() {
        return this.crossBorderOptimization;
    }

    public CreateTransportLayerApplicationShrinkRequest setIpAccessRule(String ipAccessRule) {
        this.ipAccessRule = ipAccessRule;
        return this;
    }
    public String getIpAccessRule() {
        return this.ipAccessRule;
    }

    public CreateTransportLayerApplicationShrinkRequest setIpv6(String ipv6) {
        this.ipv6 = ipv6;
        return this;
    }
    public String getIpv6() {
        return this.ipv6;
    }

    public CreateTransportLayerApplicationShrinkRequest setKeepAliveProtection(String keepAliveProtection) {
        this.keepAliveProtection = keepAliveProtection;
        return this;
    }
    public String getKeepAliveProtection() {
        return this.keepAliveProtection;
    }

    public CreateTransportLayerApplicationShrinkRequest setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    public String getRecordName() {
        return this.recordName;
    }

    public CreateTransportLayerApplicationShrinkRequest setRulesShrink(String rulesShrink) {
        this.rulesShrink = rulesShrink;
        return this;
    }
    public String getRulesShrink() {
        return this.rulesShrink;
    }

    public CreateTransportLayerApplicationShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateTransportLayerApplicationShrinkRequest setStaticIp(String staticIp) {
        this.staticIp = staticIp;
        return this;
    }
    public String getStaticIp() {
        return this.staticIp;
    }

}
