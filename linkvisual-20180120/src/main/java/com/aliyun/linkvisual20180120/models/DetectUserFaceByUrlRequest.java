// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DetectUserFaceByUrlRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("FacePicUrl")
    public String facePicUrl;

    public static DetectUserFaceByUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectUserFaceByUrlRequest self = new DetectUserFaceByUrlRequest();
        return TeaModel.build(map, self);
    }

    public DetectUserFaceByUrlRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public DetectUserFaceByUrlRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public DetectUserFaceByUrlRequest setFacePicUrl(String facePicUrl) {
        this.facePicUrl = facePicUrl;
        return this;
    }
    public String getFacePicUrl() {
        return this.facePicUrl;
    }

}
