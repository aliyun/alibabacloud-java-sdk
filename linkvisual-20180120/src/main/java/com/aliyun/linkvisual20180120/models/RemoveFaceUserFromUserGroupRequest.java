// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class RemoveFaceUserFromUserGroupRequest extends TeaModel {
    @NameInMap("IsolationId")
    @Validation(required = true)
    public String isolationId;

    @NameInMap("UserId")
    @Validation(required = true)
    public String userId;

    @NameInMap("UserGroupId")
    @Validation(required = true)
    public String userGroupId;

    public static RemoveFaceUserFromUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveFaceUserFromUserGroupRequest self = new RemoveFaceUserFromUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveFaceUserFromUserGroupRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public RemoveFaceUserFromUserGroupRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public RemoveFaceUserFromUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
