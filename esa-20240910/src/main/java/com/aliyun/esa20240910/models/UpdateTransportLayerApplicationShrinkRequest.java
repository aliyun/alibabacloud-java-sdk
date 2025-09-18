// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateTransportLayerApplicationShrinkRequest extends TeaModel {
    /**
     * <p>Transport layer application ID, which can be obtained by calling the <a href="~~ListTransportLayerApplications~~">ListTransportLayerApplications</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>165503967****</p>
     */
    @NameInMap("ApplicationId")
    public Long applicationId;

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
     * <p>IP access rule switch. When enabled, the IP access rules in WAF will take effect on the transport layer application.</p>
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
     * <p>on</p>
     */
    @NameInMap("Ipv6")
    public String ipv6;

    /**
     * <p>Forwarding rule list. Details of each rule. Except for the comment, all other parameters are required.</p>
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
