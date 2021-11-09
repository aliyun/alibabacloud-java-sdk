// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallDefaultIPSConfigRequest extends TeaModel {
    @NameInMap("BasicRules")
    public String basicRules;

    @NameInMap("EnableAllPatch")
    public String enableAllPatch;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MemberUid")
    public String memberUid;

    @NameInMap("RunMode")
    public String runMode;

    @NameInMap("SourceIp")
    public String sourceIp;

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
