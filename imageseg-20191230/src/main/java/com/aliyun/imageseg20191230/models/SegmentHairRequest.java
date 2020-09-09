// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHairRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static SegmentHairRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentHairRequest self = new SegmentHairRequest();
        return TeaModel.build(map, self);
    }

    public SegmentHairRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
