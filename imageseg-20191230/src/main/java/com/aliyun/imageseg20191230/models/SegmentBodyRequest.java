// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentBodyRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    @NameInMap("Async")
    public Boolean async;

    public static SegmentBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentBodyRequest self = new SegmentBodyRequest();
        return TeaModel.build(map, self);
    }

    public SegmentBodyRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public SegmentBodyRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

}
