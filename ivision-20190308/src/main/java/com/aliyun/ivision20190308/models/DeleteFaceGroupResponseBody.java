// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class DeleteFaceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GroupId")
    public String groupId;

    public static DeleteFaceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceGroupResponseBody self = new DeleteFaceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFaceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFaceGroupResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
