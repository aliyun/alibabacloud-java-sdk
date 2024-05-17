// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetUserGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static GetUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserGroupRequest self = new GetUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
