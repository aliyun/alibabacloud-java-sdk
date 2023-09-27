// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class ModifyIpControlPolicyItemRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CidrIp")
    public String cidrIp;

    @NameInMap("IpControlId")
    public String ipControlId;

    @NameInMap("PolicyItemId")
    public String policyItemId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyIpControlPolicyItemRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpControlPolicyItemRequest self = new ModifyIpControlPolicyItemRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIpControlPolicyItemRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyIpControlPolicyItemRequest setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
        return this;
    }
    public String getCidrIp() {
        return this.cidrIp;
    }

    public ModifyIpControlPolicyItemRequest setIpControlId(String ipControlId) {
        this.ipControlId = ipControlId;
        return this;
    }
    public String getIpControlId() {
        return this.ipControlId;
    }

    public ModifyIpControlPolicyItemRequest setPolicyItemId(String policyItemId) {
        this.policyItemId = policyItemId;
        return this;
    }
    public String getPolicyItemId() {
        return this.policyItemId;
    }

    public ModifyIpControlPolicyItemRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
