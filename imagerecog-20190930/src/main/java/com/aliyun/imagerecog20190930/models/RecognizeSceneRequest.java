// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeSceneRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static RecognizeSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeSceneRequest self = new RecognizeSceneRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeSceneRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
