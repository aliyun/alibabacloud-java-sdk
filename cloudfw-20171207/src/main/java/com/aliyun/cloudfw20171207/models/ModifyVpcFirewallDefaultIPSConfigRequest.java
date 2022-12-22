// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallDefaultIPSConfigRequest extends TeaModel {
    // Specifies whether to enable basic protection. Valid values:
    // 
    // *   **1**: yes
    // *   **0**: no
    @NameInMap("BasicRules")
    public String basicRules;

    // Specifies whether to enable virtual patching. Valid values:
    // 
    // *   **1**: yes
    // *   **0**: no
    @NameInMap("EnableAllPatch")
    public String enableAllPatch;

    // The language of the content within the request and response. Valid values:
    // 
    // *   **zh**: Chinese (default)
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The UID of the member that is managed by your Alibaba Cloud account.
    @NameInMap("MemberUid")
    public String memberUid;

    // The mode of the intrusion prevention system (IPS). Valid values:
    // 
    // *   **1**: block mode
    // *   **0**: monitor mode
    @NameInMap("RunMode")
    public String runMode;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The instance ID of the VPC firewall. Valid values:
    // 
    // *   If the VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a Cloud Enterprise Network (CEN) instance, the value of this parameter is the ID of the CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. You can call the [DescribeVpcFirewallCenList](~~345777~~) operation to query the IDs of CEN instances.
    // *   If the VPC firewall protects mutual access traffic between two VPCs that are connected by using an Express Connect circuit, the value of this parameter is the ID of the VPC firewall. You can call the [DescribeVpcFirewallList](~~342932~~) operation to query the instance IDs of VPC firewalls.
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static ModifyVpcFirewallDefaultIPSConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallDefaultIPSConfigRequest self = new ModifyVpcFirewallDefaultIPSConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallDefaultIPSConfigRequest setBasicRules(String basicRules) {
        this.basicRules = basicRules;
        return this;
    }
    public String getBasicRules() {
        return this.basicRules;
    }

    public ModifyVpcFirewallDefaultIPSConfigRequest setEnableAllPatch(String enableAllPatch) {
        this.enableAllPatch = enableAllPatch;
        return this;
    }
    public String getEnableAllPatch() {
        return this.enableAllPatch;
    }

    public ModifyVpcFirewallDefaultIPSConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyVpcFirewallDefaultIPSConfigRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public ModifyVpcFirewallDefaultIPSConfigRequest setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

    public ModifyVpcFirewallDefaultIPSConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyVpcFirewallDefaultIPSConfigRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
