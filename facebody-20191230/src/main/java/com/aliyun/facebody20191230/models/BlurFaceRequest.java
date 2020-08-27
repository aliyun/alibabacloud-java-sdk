// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BlurFaceRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static BlurFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        BlurFaceRequest self = new BlurFaceRequest();
        return TeaModel.build(map, self);
    }

    public BlurFaceRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
