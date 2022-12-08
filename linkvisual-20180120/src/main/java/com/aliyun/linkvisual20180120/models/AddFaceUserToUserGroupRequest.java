// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserToUserGroupRequest extends TeaModel {
    @NameInMap("IsolationId")
    public String isolationId;

    @NameInMap("UserGroupId")
    public String userGroupId;

    @NameInMap("UserId")
    public String userId;

    public static AddFaceUserToUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserToUserGroupRequest self = new AddFaceUserToUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceUserToUserGroupRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public AddFaceUserToUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public AddFaceUserToUserGroupRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
