// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectCelebrityRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static DetectCelebrityRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectCelebrityRequest self = new DetectCelebrityRequest();
        return TeaModel.build(map, self);
    }

    public DetectCelebrityRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
