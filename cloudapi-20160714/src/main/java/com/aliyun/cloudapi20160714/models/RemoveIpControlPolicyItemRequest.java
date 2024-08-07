// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveIpControlPolicyItemRequest extends TeaModel {
    /**
     * <p>The ID of the ACL. The ID is unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7ea91319a34d48a09b5c9c871d9768b1</p>
     */
    @NameInMap("IpControlId")
    public String ipControlId;

    /**
     * <p>The ID of a policy. Separate multiple IDs with semicolons (;). A maximum of 100 IDs can be entered.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>P151533572852362;P151533557750260</p>
     */
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
