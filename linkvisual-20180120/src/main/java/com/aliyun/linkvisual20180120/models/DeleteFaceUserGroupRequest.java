// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteFaceUserGroupRequest extends TeaModel {
    @NameInMap("IsolationId")
    @Validation(required = true)
    public String isolationId;

    @NameInMap("UserGroupId")
    @Validation(required = true)
    public String userGroupId;

    public static DeleteFaceUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceUserGroupRequest self = new DeleteFaceUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceUserGroupRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public DeleteFaceUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
