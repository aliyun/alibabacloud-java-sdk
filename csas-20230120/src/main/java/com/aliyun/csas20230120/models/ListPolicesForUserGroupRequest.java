// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPolicesForUserGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    public static ListPolicesForUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPolicesForUserGroupRequest self = new ListPolicesForUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListPolicesForUserGroupRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

}
