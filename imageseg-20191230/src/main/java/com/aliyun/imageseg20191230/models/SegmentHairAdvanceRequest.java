// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHairAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static SegmentHairAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentHairAdvanceRequest self = new SegmentHairAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SegmentHairAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
