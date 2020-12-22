// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectVideoLivingFaceRequest extends TeaModel {
    @NameInMap("VideoUrl")
    public String videoUrl;

    public static DetectVideoLivingFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoLivingFaceRequest self = new DetectVideoLivingFaceRequest();
        return TeaModel.build(map, self);
    }

    public DetectVideoLivingFaceRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
