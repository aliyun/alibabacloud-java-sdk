// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ColorizeImageRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static ColorizeImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ColorizeImageRequest self = new ColorizeImageRequest();
        return TeaModel.build(map, self);
    }

    public ColorizeImageRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
