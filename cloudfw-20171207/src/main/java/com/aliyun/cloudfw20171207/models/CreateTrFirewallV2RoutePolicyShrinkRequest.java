// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateTrFirewallV2RoutePolicyShrinkRequest extends TeaModel {
    @NameInMap("DestCandidateList")
    public String destCandidateListShrink;

    @NameInMap("FirewallId")
    public String firewallId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PolicyDescription")
    public String policyDescription;

    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("PolicyType")
    public String policyType;

    @NameInMap("SrcCandidateList")
    public String srcCandidateListShrink;

    public static CreateTrFirewallV2RoutePolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrFirewallV2RoutePolicyShrinkRequest self = new CreateTrFirewallV2RoutePolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrFirewallV2RoutePolicyShrinkRequest setDestCandidateListShrink(String destCandidateListShrink) {
        this.destCandidateListShrink = destCandidateListShrink;
        return this;
    }
    public String getDestCandidateListShrink() {
        return this.destCandidateListShrink;
    }

    public CreateTrFirewallV2RoutePolicyShrinkRequest setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
    }

    public CreateTrFirewallV2RoutePolicyShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateTrFirewallV2RoutePolicyShrinkRequest setPolicyDescription(String policyDescription) {
        this.policyDescription = policyDescription;
        return this;
    }
    public String getPolicyDescription() {
        return this.policyDescription;
    }

    public CreateTrFirewallV2RoutePolicyShrinkRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreateTrFirewallV2RoutePolicyShrinkRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public CreateTrFirewallV2RoutePolicyShrinkRequest setSrcCandidateListShrink(String srcCandidateListShrink) {
        this.srcCandidateListShrink = srcCandidateListShrink;
        return this;
    }
    public String getSrcCandidateListShrink() {
        return this.srcCandidateListShrink;
    }

}
