// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class TaggingImageRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("Mode")
    public String mode;

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

    public TaggingImageRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
