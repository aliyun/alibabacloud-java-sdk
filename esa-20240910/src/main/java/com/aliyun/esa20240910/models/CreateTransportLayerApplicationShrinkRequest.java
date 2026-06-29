// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateTransportLayerApplicationShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable network access optimization for the Chinese mainland. This feature is disabled by default. Valid values:</p>
     * <ul>
     * <li>on: enabled.</li>
     * <li>off: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CrossBorderOptimization")
    public String crossBorderOptimization;

    /**
     * <p>The IP access rule switch. When enabled, IP access rules in WAF take effect for the Layer 4 application. Valid values:</p>
     * <ul>
     * <li>on: enabled.</li>
     * <li>off: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("IpAccessRule")
    public String ipAccessRule;

    /**
     * <p>Specifies whether to enable IPv6. This feature is disabled by default. Valid values:</p>
     * <ul>
     * <li>on: enabled.</li>
     * <li>off: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Ipv6")
    public String ipv6;

    /**
     * <p>Specifies whether to enable keep-alive protection. This feature is disabled by default. Valid values:</p>
     * <ul>
     * <li>on: enabled.</li>
     * <li>off: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("KeepAliveProtection")
    public String keepAliveProtection;

    /**
     * <p>The domain name of the Layer 4 application.</p>
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
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID. The site must be activated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Specifies whether to enable static IP. This feature is disabled by default. Valid values:</p>
     * <ul>
     * <li>on: enabled.</li>
     * <li>off: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
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
