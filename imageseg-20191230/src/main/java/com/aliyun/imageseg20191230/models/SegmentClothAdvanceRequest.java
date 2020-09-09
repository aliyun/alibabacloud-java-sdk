// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentClothAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static SegmentClothAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentClothAdvanceRequest self = new SegmentClothAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SegmentClothAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
