// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class UnregisterFaceResponseBody extends TeaModel {
    @NameInMap("FaceToken")
    public String faceToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GroupId")
    public String groupId;

    public static UnregisterFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnregisterFaceResponseBody self = new UnregisterFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UnregisterFaceResponseBody setFaceToken(String faceToken) {
        this.faceToken = faceToken;
        return this;
    }
    public String getFaceToken() {
        return this.faceToken;
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

}
