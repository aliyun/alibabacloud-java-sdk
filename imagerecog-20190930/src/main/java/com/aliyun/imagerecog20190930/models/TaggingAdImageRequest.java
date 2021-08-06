// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class TaggingAdImageRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static TaggingAdImageRequest build(java.util.Map<String, ?> map) throws Exception {
        TaggingAdImageRequest self = new TaggingAdImageRequest();
        return TeaModel.build(map, self);
    }

    public TaggingAdImageRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
