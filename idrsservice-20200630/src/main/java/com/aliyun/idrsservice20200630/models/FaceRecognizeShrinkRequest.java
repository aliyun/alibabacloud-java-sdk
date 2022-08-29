// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class FaceRecognizeShrinkRequest extends TeaModel {
    @NameInMap("FaceRequest")
    public String faceRequestShrink;

    public static FaceRecognizeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceRecognizeShrinkRequest self = new FaceRecognizeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FaceRecognizeShrinkRequest setFaceRequestShrink(String faceRequestShrink) {
        this.faceRequestShrink = faceRequestShrink;
        return this;
    }
    public String getFaceRequestShrink() {
        return this.faceRequestShrink;
    }

}
