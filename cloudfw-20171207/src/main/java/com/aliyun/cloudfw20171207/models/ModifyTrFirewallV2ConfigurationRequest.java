// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyTrFirewallV2ConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the VPC firewall instance. You can obtain the ID by calling DescribeTrFirewallsV2List.</p>
     * <blockquote>
     * <p>Note: FirewallId and FirewallName are jointly required. You must specify both parameters. If either parameter is missing, the API operation returns a 400 error.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vfw-tr-bcdf89d405ce4bd2****</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

    /**
     * <p>The name of the VPC firewall instance.</p>
     * <blockquote>
     * <p>Note: FirewallId and FirewallName are jointly required. You must specify both parameters. If either parameter is missing, the API operation returns a 400 error.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-firewall</p>
     */
    @NameInMap("FirewallName")
    public String firewallName;

    /**
     * <p>The language of the response message. Valid values:</p>
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
