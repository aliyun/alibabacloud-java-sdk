// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class DetectFruitsRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static DetectFruitsRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectFruitsRequest self = new DetectFruitsRequest();
        return TeaModel.build(map, self);
    }

    public DetectFruitsRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
