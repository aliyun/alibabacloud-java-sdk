// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateTrFirewallV2RoutePolicyShrinkRequest extends TeaModel {
    /**
     * <p>The secondary traffic redirection instances.</p>
     */
    @NameInMap("DestCandidateList")
    public String destCandidateListShrink;

    /**
     * <p>The ID of the virtual private cloud (VPC) firewall instance.</p>
     * <blockquote>
     * <p>FirewallId is required. If it is not specified, ErrorParameters(400) is returned. You can call DescribeTrFirewallsV2List to obtain the instance ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vfw-tr-f8ce36689b224f77****</p>
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
     * <p>The description of the traffic redirection configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>Singapore Point to Multipoint</p>
     */
    @NameInMap("PolicyDescription")
    public String policyDescription;

    /**
     * <p>The name of the traffic redirection configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>Singapore Point to Multipoint</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The traffic redirection scenario type for the virtual private cloud (VPC) firewall on a Cloud Enterprise Network (CEN) Enterprise Edition transit router. Valid values:</p>
     * <ul>
     * <li><p><strong>fullmesh</strong>: multi-point interconnection</p>
     * </li>
     * <li><p><strong>one_to_one</strong>: point-to-point</p>
     * </li>
     * <li><p><strong>end_to_end</strong>: point-to-multipoint</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fullmesh</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The primary traffic redirection instances.</p>
     */
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
