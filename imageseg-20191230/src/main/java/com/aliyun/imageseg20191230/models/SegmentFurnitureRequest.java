// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentFurnitureRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static SegmentFurnitureRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentFurnitureRequest self = new SegmentFurnitureRequest();
        return TeaModel.build(map, self);
    }

    public SegmentFurnitureRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
