// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class TaggingImageRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static TaggingImageRequest build(java.util.Map<String, ?> map) throws Exception {
        TaggingImageRequest self = new TaggingImageRequest();
        return TeaModel.build(map, self);
    }

    public TaggingImageRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
