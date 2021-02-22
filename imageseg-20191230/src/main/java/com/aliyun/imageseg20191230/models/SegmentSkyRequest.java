// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSkyRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static SegmentSkyRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentSkyRequest self = new SegmentSkyRequest();
        return TeaModel.build(map, self);
    }

    public SegmentSkyRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
