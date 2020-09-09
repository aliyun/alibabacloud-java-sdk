// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHeadRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static SegmentHeadRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentHeadRequest self = new SegmentHeadRequest();
        return TeaModel.build(map, self);
    }

    public SegmentHeadRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
