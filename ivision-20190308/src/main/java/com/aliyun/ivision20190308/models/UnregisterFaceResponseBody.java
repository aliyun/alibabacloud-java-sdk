// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class UnregisterFaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("FaceToken")
    public String faceToken;

    public static UnregisterFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnregisterFaceResponseBody self = new UnregisterFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UnregisterFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnregisterFaceResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UnregisterFaceResponseBody setFaceToken(String faceToken) {
        this.faceToken = faceToken;
        return this;
    }
    public String getFaceToken() {
        return this.faceToken;
    }

}
