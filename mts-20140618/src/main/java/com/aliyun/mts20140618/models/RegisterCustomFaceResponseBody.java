// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class RegisterCustomFaceResponseBody extends TeaModel {
    /**
     * <p>The ID of the face.</p>
     * 
     * <strong>example:</strong>
     * <p>c6cc71cb44a9491093818faf9d60****</p>
     */
    @NameInMap("FaceId")
    public String faceId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>91AEA76D-25B5-50DF-9126-AA6BB10FDAF4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RegisterCustomFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterCustomFaceResponseBody self = new RegisterCustomFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterCustomFaceResponseBody setFaceId(String faceId) {
        this.faceId = faceId;
        return this;
    }
    public String getFaceId() {
        return this.faceId;
    }

    public RegisterCustomFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
