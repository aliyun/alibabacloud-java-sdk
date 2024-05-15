// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyTrFirewallV2RoutePolicyScopeShrinkRequest extends TeaModel {
    @NameInMap("DestCandidateList")
    public String destCandidateListShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ShouldRecover")
    public String shouldRecover;

    @NameInMap("SrcCandidateList")
    public String srcCandidateListShrink;

    /**
     * <p>This parameter is required.</p>
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
