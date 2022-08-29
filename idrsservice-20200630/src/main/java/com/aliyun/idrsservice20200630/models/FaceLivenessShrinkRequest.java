// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class FaceLivenessShrinkRequest extends TeaModel {
    @NameInMap("FaceRequest")
    public String faceRequestShrink;

    public static FaceLivenessShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceLivenessShrinkRequest self = new FaceLivenessShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FaceLivenessShrinkRequest setFaceRequestShrink(String faceRequestShrink) {
        this.faceRequestShrink = faceRequestShrink;
        return this;
    }
    public String getFaceRequestShrink() {
        return this.faceRequestShrink;
    }

}
