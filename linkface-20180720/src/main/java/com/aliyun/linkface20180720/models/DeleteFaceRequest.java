// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class DeleteFaceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun1</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DeleteFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceRequest self = new DeleteFaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteFaceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
