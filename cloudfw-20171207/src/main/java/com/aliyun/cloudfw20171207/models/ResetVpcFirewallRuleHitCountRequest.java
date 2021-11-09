// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ResetVpcFirewallRuleHitCountRequest extends TeaModel {
    @NameInMap("AclUuid")
    public String aclUuid;

    @NameInMap("Lang")
    public String lang;

    public static ResetVpcFirewallRuleHitCountRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetVpcFirewallRuleHitCountRequest self = new ResetVpcFirewallRuleHitCountRequest();
        return TeaModel.build(map, self);
    }

    public ResetVpcFirewallRuleHitCountRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public ResetVpcFirewallRuleHitCountRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
