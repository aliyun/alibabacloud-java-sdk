// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteFaceUserRequest extends TeaModel {
    @NameInMap("IsolationId")
    public String isolationId;

    @NameInMap("UserId")
    public String userId;

    public static DeleteFaceUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceUserRequest self = new DeleteFaceUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceUserRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public DeleteFaceUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
