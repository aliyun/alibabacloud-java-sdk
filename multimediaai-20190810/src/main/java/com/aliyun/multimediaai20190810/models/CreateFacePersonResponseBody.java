// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class CreateFacePersonResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FacePersonId")
    public Long facePersonId;

    public static CreateFacePersonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFacePersonResponseBody self = new CreateFacePersonResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFacePersonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFacePersonResponseBody setFacePersonId(Long facePersonId) {
        this.facePersonId = facePersonId;
        return this;
    }
    public Long getFacePersonId() {
        return this.facePersonId;
    }

}
