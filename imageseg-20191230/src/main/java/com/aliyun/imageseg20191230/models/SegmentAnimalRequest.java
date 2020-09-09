// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentAnimalRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static SegmentAnimalRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentAnimalRequest self = new SegmentAnimalRequest();
        return TeaModel.build(map, self);
    }

    public SegmentAnimalRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
