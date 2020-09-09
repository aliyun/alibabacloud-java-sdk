// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentLogoRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static SegmentLogoRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentLogoRequest self = new SegmentLogoRequest();
        return TeaModel.build(map, self);
    }

    public SegmentLogoRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
