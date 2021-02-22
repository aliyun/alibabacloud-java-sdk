// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHDCommonImageRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("Async")
    public Boolean async;

    public static SegmentHDCommonImageRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentHDCommonImageRequest self = new SegmentHDCommonImageRequest();
        return TeaModel.build(map, self);
    }

    public SegmentHDCommonImageRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public SegmentHDCommonImageRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

}
