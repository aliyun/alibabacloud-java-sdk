// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserGroupsForPrivateAccessPolicyRequest extends TeaModel {
    /**
     * <p>A collection of private network access policy IDs. Enter a maximum of 100 private network access policy IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyIds")
    public java.util.List<String> policyIds;

    public static ListUserGroupsForPrivateAccessPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsForPrivateAccessPolicyRequest self = new ListUserGroupsForPrivateAccessPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsForPrivateAccessPolicyRequest setPolicyIds(java.util.List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

}
