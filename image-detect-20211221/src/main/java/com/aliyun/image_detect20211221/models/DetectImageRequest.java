// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class DetectImageRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public String imageUrl;

    public static DetectImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectImageRequest self = new DetectImageRequest();
        return TeaModel.build(map, self);
    }

    public DetectImageRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
