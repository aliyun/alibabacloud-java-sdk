// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyFirewallV2RoutePolicySwitchRequest extends TeaModel {
    @NameInMap("FirewallId")
    public String firewallId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ShouldRecover")
    public String shouldRecover;

    @NameInMap("TrFirewallRoutePolicyId")
    public String trFirewallRoutePolicyId;

    @NameInMap("TrFirewallRoutePolicySwitchStatus")
    public String trFirewallRoutePolicySwitchStatus;

    public static ModifyFirewallV2RoutePolicySwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFirewallV2RoutePolicySwitchRequest self = new ModifyFirewallV2RoutePolicySwitchRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFirewallV2RoutePolicySwitchRequest setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
    }

    public ModifyFirewallV2RoutePolicySwitchRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyFirewallV2RoutePolicySwitchRequest setShouldRecover(String shouldRecover) {
        this.shouldRecover = shouldRecover;
        return this;
    }
    public String getShouldRecover() {
        return this.shouldRecover;
    }

    public ModifyFirewallV2RoutePolicySwitchRequest setTrFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
        this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
        return this;
    }
    public String getTrFirewallRoutePolicyId() {
        return this.trFirewallRoutePolicyId;
    }

    public ModifyFirewallV2RoutePolicySwitchRequest setTrFirewallRoutePolicySwitchStatus(String trFirewallRoutePolicySwitchStatus) {
        this.trFirewallRoutePolicySwitchStatus = trFirewallRoutePolicySwitchStatus;
        return this;
    }
    public String getTrFirewallRoutePolicySwitchStatus() {
        return this.trFirewallRoutePolicySwitchStatus;
    }

}
