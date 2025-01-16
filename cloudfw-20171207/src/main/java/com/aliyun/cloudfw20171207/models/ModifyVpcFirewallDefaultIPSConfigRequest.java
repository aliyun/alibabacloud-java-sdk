// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallDefaultIPSConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable basic protection. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes.</li>
     * <li><strong>0</strong>: no.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BasicRules")
    public String basicRules;

    /**
     * <p>Specifies whether to enable virtual patching. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes.</li>
     * <li><strong>0</strong>: no.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnableAllPatch")
    public String enableAllPatch;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default)</li>
     * <li><strong>en</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The level of the rule group for the IPS. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: loose</li>
     * <li><strong>2</strong>: medium</li>
     * <li><strong>3</strong>: strict</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleClass")
    public String ruleClass;

    /**
     * <p>The mode of the intrusion prevention system (IPS). Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: block mode.</li>
     * <li><strong>0</strong>: monitor mode.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RunMode")
    public String runMode;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
    public String sourceIp;

    /**
     * <p>The instance ID of the VPC firewall.</p>
     * <ul>
     * <li>If the VPC firewall protects traffic between a VPC and a network instance that is attached to a Cloud Enterprise Network (CEN) instance, the value of this parameter is the ID of the CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. You can call the <a href="https://help.aliyun.com/document_detail/345777.html">DescribeVpcFirewallCenList</a> operation to query the IDs of CEN instances.</li>
     * <li>If the VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit, the value of this parameter is the instance ID of the VPC firewall. You can call the <a href="https://help.aliyun.com/document_detail/342932.html">DescribeVpcFirewallList</a> operation to query the instance IDs of VPC firewalls.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-m5e7dbc4y****</p>
     */
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

    public ModifyVpcFirewallDefaultIPSConfigRequest setRuleClass(String ruleClass) {
        this.ruleClass = ruleClass;
        return this;
    }
    public String getRuleClass() {
        return this.ruleClass;
    }

    public ModifyVpcFirewallDefaultIPSConfigRequest setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

    @Deprecated
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
