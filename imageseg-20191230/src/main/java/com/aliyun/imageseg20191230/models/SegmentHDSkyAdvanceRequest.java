// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHDSkyAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static SegmentHDSkyAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentHDSkyAdvanceRequest self = new SegmentHDSkyAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SegmentHDSkyAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
