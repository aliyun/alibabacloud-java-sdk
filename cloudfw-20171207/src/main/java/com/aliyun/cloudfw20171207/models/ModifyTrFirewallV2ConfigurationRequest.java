// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyTrFirewallV2ConfigurationRequest extends TeaModel {
    @NameInMap("FirewallId")
    public String firewallId;

    @NameInMap("FirewallName")
    public String firewallName;

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
