// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class FaceCompareShrinkRequest extends TeaModel {
    @NameInMap("FaceRequest")
    public String faceRequestShrink;

    public static FaceCompareShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceCompareShrinkRequest self = new FaceCompareShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FaceCompareShrinkRequest setFaceRequestShrink(String faceRequestShrink) {
        this.faceRequestShrink = faceRequestShrink;
        return this;
    }
    public String getFaceRequestShrink() {
        return this.faceRequestShrink;
    }

}
