// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentFaceAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static SegmentFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentFaceAdvanceRequest self = new SegmentFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SegmentFaceAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
