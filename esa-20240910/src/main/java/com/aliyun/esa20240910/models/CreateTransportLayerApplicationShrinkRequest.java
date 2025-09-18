// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateTransportLayerApplicationShrinkRequest extends TeaModel {
    /**
     * <p>Whether to enable China mainland network access optimization, default is disabled. Value range:</p>
     * <ul>
     * <li>on: Enabled.</li>
     * <li>off: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CrossBorderOptimization")
    public String crossBorderOptimization;

    /**
     * <p>IP access rule switch. When enabled, the WAF\&quot;s IP access rules apply to the transport layer application.</p>
     * <ul>
     * <li>on: Enabled.</li>
     * <li>off: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("IpAccessRule")
    public String ipAccessRule;

    /**
     * <p>IPv6 switch.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Ipv6")
    public String ipv6;

    /**
     * <p>Domain name of the transport layer application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aaa.example.com</p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>List of forwarding rules.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Rules")
    public String rulesShrink;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
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
