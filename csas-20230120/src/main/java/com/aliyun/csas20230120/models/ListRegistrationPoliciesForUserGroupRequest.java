// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListRegistrationPoliciesForUserGroupRequest extends TeaModel {
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    public static ListRegistrationPoliciesForUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRegistrationPoliciesForUserGroupRequest self = new ListRegistrationPoliciesForUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListRegistrationPoliciesForUserGroupRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

}
