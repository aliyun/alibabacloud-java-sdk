// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallsV2DetailRequest extends TeaModel {
    /**
     * <p>The instance ID of the virtual private cloud (VPC) firewall.</p>
     * <blockquote>
     * <p>FirewallId is required. If this parameter is not specified, ErrorParameters(400) is returned. You can call DescribeTrFirewallsV2List to query existing FirewallId values. If no VPC firewall exists, create a CEN instance and a transit router first, and then call CreateTrFirewallV2 to obtain a FirewallId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vfw-tr-a5a6b89f46764928****</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeTrFirewallsV2DetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrFirewallsV2DetailRequest self = new DescribeTrFirewallsV2DetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTrFirewallsV2DetailRequest setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
    }

    public DescribeTrFirewallsV2DetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
