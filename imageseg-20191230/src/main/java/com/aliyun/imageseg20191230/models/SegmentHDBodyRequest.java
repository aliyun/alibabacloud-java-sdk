// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHDBodyRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static SegmentHDBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentHDBodyRequest self = new SegmentHDBodyRequest();
        return TeaModel.build(map, self);
    }

    public SegmentHDBodyRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
