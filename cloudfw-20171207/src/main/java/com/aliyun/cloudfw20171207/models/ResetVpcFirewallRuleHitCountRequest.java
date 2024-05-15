// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ResetVpcFirewallRuleHitCountRequest extends TeaModel {
    /**
     * <p>The ID of the access control policy.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The natural language of the request and response. </p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>- **zh**: Chinese (default)</p>
     * <p>- **en**: English</p>
     */
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
