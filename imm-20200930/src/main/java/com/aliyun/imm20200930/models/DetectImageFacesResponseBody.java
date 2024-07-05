// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageFacesResponseBody extends TeaModel {
    @NameInMap("Faces")
    public java.util.List<Figure> faces;

    /**
     * <strong>example:</strong>
     * <p>6E93D6C9-5AC0-49F9-914D-E02678D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetectImageFacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectImageFacesResponseBody self = new DetectImageFacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectImageFacesResponseBody setFaces(java.util.List<Figure> faces) {
        this.faces = faces;
        return this;
    }
    public java.util.List<Figure> getFaces() {
        return this.faces;
    }

    public DetectImageFacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
