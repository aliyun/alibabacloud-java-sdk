// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class RemoveIpControlPolicyItemRequest extends TeaModel {
    @NameInMap("IpControlId")
    public String ipControlId;

    @NameInMap("PolicyItemIds")
    public String policyItemIds;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static RemoveIpControlPolicyItemRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveIpControlPolicyItemRequest self = new RemoveIpControlPolicyItemRequest();
        return TeaModel.build(map, self);
    }

    public RemoveIpControlPolicyItemRequest setIpControlId(String ipControlId) {
        this.ipControlId = ipControlId;
        return this;
    }
    public String getIpControlId() {
        return this.ipControlId;
    }

    public RemoveIpControlPolicyItemRequest setPolicyItemIds(String policyItemIds) {
        this.policyItemIds = policyItemIds;
        return this;
    }
    public String getPolicyItemIds() {
        return this.policyItemIds;
    }

    public RemoveIpControlPolicyItemRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
