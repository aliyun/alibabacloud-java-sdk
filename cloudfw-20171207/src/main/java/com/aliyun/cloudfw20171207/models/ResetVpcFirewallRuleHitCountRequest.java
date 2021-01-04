// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ResetVpcFirewallRuleHitCountRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("AclUuid")
    public String aclUuid;

    public static ResetVpcFirewallRuleHitCountRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetVpcFirewallRuleHitCountRequest self = new ResetVpcFirewallRuleHitCountRequest();
        return TeaModel.build(map, self);
    }

    public ResetVpcFirewallRuleHitCountRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ResetVpcFirewallRuleHitCountRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ResetVpcFirewallRuleHitCountRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

}
