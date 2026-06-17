// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyTrFirewallV2ConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the VPC firewall instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-tr-bcdf89d405ce4bd2****</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

    /**
     * <p>The name of the VPC firewall instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-firewall</p>
     */
    @NameInMap("FirewallName")
    public String firewallName;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static ModifyTrFirewallV2ConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrFirewallV2ConfigurationRequest self = new ModifyTrFirewallV2ConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTrFirewallV2ConfigurationRequest setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
    }

    public ModifyTrFirewallV2ConfigurationRequest setFirewallName(String firewallName) {
        this.firewallName = firewallName;
        return this;
    }
    public String getFirewallName() {
        return this.firewallName;
    }

    public ModifyTrFirewallV2ConfigurationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
