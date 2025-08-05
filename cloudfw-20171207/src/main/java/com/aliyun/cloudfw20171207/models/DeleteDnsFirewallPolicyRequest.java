// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteDnsFirewallPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>498946f4-c98a-45c0-9038-635c******</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>140.210.39.***</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DeleteDnsFirewallPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDnsFirewallPolicyRequest self = new DeleteDnsFirewallPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDnsFirewallPolicyRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public DeleteDnsFirewallPolicyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteDnsFirewallPolicyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
