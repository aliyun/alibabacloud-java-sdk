// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyFirewallV2RoutePolicySwitchRequest extends TeaModel {
    /**
     * <p>The instance ID of the virtual private cloud (VPC) firewall.</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <br>
     * <p>*   **zh** (default): Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether to restore the traffic redirection configurations. Valid values:</p>
     * <br>
     * <p>*   true: roll back</p>
     * <p>*   false: withdraw</p>
     */
    @NameInMap("ShouldRecover")
    public String shouldRecover;

    /**
     * <p>The ID of the routing policy.</p>
     */
    @NameInMap("TrFirewallRoutePolicyId")
    public String trFirewallRoutePolicyId;

    /**
     * <p>The status of the routing policy. Valid values:</p>
     * <br>
     * <p>*   open: enabled</p>
     * <p>*   close: disabled</p>
     */
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
