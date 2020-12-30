// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class CreateFaceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FaceGroupId")
    public Long faceGroupId;

    public static CreateFaceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFaceGroupResponseBody self = new CreateFaceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFaceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFaceGroupResponseBody setFaceGroupId(Long faceGroupId) {
        this.faceGroupId = faceGroupId;
        return this;
    }
    public Long getFaceGroupId() {
        return this.faceGroupId;
    }

}
