// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RemoveImageWatermarkRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static RemoveImageWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageWatermarkRequest self = new RemoveImageWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveImageWatermarkRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
