// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DetectUserFaceByUrlRequest extends TeaModel {
    @NameInMap("FacePicUrl")
    @Validation(required = true)
    public String facePicUrl;

    public static DetectUserFaceByUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectUserFaceByUrlRequest self = new DetectUserFaceByUrlRequest();
        return TeaModel.build(map, self);
    }

    public DetectUserFaceByUrlRequest setFacePicUrl(String facePicUrl) {
        this.facePicUrl = facePicUrl;
        return this;
    }
    public String getFacePicUrl() {
        return this.facePicUrl;
    }

}
