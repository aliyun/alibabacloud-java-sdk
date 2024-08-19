// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallPolicyBackUpAssociationListShrinkRequest extends TeaModel {
    /**
     * <p>The traffic redirection instances.</p>
     */
    @NameInMap("CandidateList")
    public String candidateListShrink;

    /**
     * <p>The instance ID of the VPC firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-tr-8b268ce1b26e4c68****</p>
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
     * <p>The ID of the routing policy.</p>
     * 
     * <strong>example:</strong>
     * <p>policy-5dcafb12ff794a56****</p>
     */
    @NameInMap("TrFirewallRoutePolicyId")
    public String trFirewallRoutePolicyId;

    public static DescribeTrFirewallPolicyBackUpAssociationListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrFirewallPolicyBackUpAssociationListShrinkRequest self = new DescribeTrFirewallPolicyBackUpAssociationListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTrFirewallPolicyBackUpAssociationListShrinkRequest setCandidateListShrink(String candidateListShrink) {
        this.candidateListShrink = candidateListShrink;
        return this;
    }
    public String getCandidateListShrink() {
        return this.candidateListShrink;
    }

    public DescribeTrFirewallPolicyBackUpAssociationListShrinkRequest setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
    }

    public DescribeTrFirewallPolicyBackUpAssociationListShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeTrFirewallPolicyBackUpAssociationListShrinkRequest setTrFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
        this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
        return this;
    }
    public String getTrFirewallRoutePolicyId() {
        return this.trFirewallRoutePolicyId;
    }

}
