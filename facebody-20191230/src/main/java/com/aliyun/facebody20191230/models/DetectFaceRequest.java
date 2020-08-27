// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectFaceRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static DetectFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectFaceRequest self = new DetectFaceRequest();
        return TeaModel.build(map, self);
    }

    public DetectFaceRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
