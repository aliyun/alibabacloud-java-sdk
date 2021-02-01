// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeFoodRequest extends TeaModel {
    // A short description of struct
    @NameInMap("ImageURL")
    public String imageURL;

    public static RecognizeFoodRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFoodRequest self = new RecognizeFoodRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeFoodRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
