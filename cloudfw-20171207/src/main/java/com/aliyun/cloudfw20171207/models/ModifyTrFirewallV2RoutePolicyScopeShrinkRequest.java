// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyTrFirewallV2RoutePolicyScopeShrinkRequest extends TeaModel {
    /**
     * <p>The secondary traffic redirection instances.</p>
     */
    @NameInMap("DestCandidateList")
    public String destCandidateListShrink;

    /**
     * <p>The instance ID of the virtual private cloud (VPC) firewall.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-tr-6520de0253bc4669bbd9</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

    /**
     * <p>The language of the content within the response. Valid values:</p>
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
     * <p>Specifies whether to restore the traffic redirection configurations. Valid values:</p>
     * <ul>
     * <li>true: roll back</li>
     * <li>false: withdraw</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShouldRecover")
    public String shouldRecover;

    /**
     * <p>The primary traffic redirection instances.</p>
     */
    @NameInMap("SrcCandidateList")
    public String srcCandidateListShrink;

    /**
     * <p>The ID of the routing policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>policy-4d724d0139df48f18091</p>
     */
    @NameInMap("TrFirewallRoutePolicyId")
    public String trFirewallRoutePolicyId;

    public static ModifyTrFirewallV2RoutePolicyScopeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrFirewallV2RoutePolicyScopeShrinkRequest self = new ModifyTrFirewallV2RoutePolicyScopeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTrFirewallV2RoutePolicyScopeShrinkRequest setDestCandidateListShrink(String destCandidateListShrink) {
        this.destCandidateListShrink = destCandidateListShrink;
        return this;
    }
    public String getDestCandidateListShrink() {
        return this.destCandidateListShrink;
    }

    public ModifyTrFirewallV2RoutePolicyScopeShrinkRequest setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
    }

    public ModifyTrFirewallV2RoutePolicyScopeShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyTrFirewallV2RoutePolicyScopeShrinkRequest setShouldRecover(String shouldRecover) {
        this.shouldRecover = shouldRecover;
        return this;
    }
    public String getShouldRecover() {
        return this.shouldRecover;
    }

    public ModifyTrFirewallV2RoutePolicyScopeShrinkRequest setSrcCandidateListShrink(String srcCandidateListShrink) {
        this.srcCandidateListShrink = srcCandidateListShrink;
        return this;
    }
    public String getSrcCandidateListShrink() {
        return this.srcCandidateListShrink;
    }

    public ModifyTrFirewallV2RoutePolicyScopeShrinkRequest setTrFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
        this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
        return this;
    }
    public String getTrFirewallRoutePolicyId() {
        return this.trFirewallRoutePolicyId;
    }

}
