// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectVideoLivingFaceAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrlObject")
    @Validation(required = true)
    public java.io.InputStream videoUrlObject;

    public static DetectVideoLivingFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoLivingFaceAdvanceRequest self = new DetectVideoLivingFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectVideoLivingFaceAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

}
