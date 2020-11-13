// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHDSkyRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static SegmentHDSkyRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentHDSkyRequest self = new SegmentHDSkyRequest();
        return TeaModel.build(map, self);
    }

    public SegmentHDSkyRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
