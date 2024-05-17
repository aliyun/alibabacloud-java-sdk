// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserGroupsForRegistrationPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyIds")
    public java.util.List<String> policyIds;

    public static ListUserGroupsForRegistrationPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsForRegistrationPolicyRequest self = new ListUserGroupsForRegistrationPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsForRegistrationPolicyRequest setPolicyIds(java.util.List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

}
