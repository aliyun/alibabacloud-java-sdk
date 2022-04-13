// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageFacesResponseBody extends TeaModel {
    @NameInMap("Faces")
    public java.util.List<Figure> faces;

    // RequestId
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
