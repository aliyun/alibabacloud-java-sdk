// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyFirewallV2RoutePolicySwitchRequest extends TeaModel {
    /**
     * <p>The instance ID of the virtual private cloud (VPC) firewalls.</p>
     * <p><strong>Note</strong>: This parameter is actually required. If it is not provided, the operation returns ErrorParameters (-360103).</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-tr-5b202e7f0be64611****</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

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

    /**
     * <p>Specifies whether to restore the traffic redirection configuration. Valid values:</p>
     * <ul>
     * <li><p>true: Rolls back the route.</p>
     * </li>
     * <li><p>false: Revokes the route.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShouldRecover")
    public String shouldRecover;

    /**
     * <p>The ID of the firewall route policy.</p>
     * <p><strong>Note</strong>: This parameter is actually required. If it is not provided or the policy does not exist, the operation returns ErrorTrFirewallPolicyNotFound (-361043). You can call DescribeTrFirewallV2RoutePolicyList to query valid route policy IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>policy-93684cc5caa44b2e****</p>
     */
    @NameInMap("TrFirewallRoutePolicyId")
    public String trFirewallRoutePolicyId;

    /**
     * <p>The status of the policy switch. Valid values:</p>
     * <ul>
     * <li><p>open: Enabled.</p>
     * </li>
     * <li><p>close: Disabled.</p>
     * </li>
     * </ul>
     * <p><strong>Note</strong>: This parameter is actually required. If it is not provided or the value is not within the preceding range, the operation returns ErrorParameters (-360103).</p>
     * 
     * <strong>example:</strong>
     * <p>open</p>
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
