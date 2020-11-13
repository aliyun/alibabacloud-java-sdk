// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHDCommonImageAdvanceRequest extends TeaModel {
    @NameInMap("ImageUrlObject")
    @Validation(required = true)
    public java.io.InputStream imageUrlObject;

    public static SegmentHDCommonImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentHDCommonImageAdvanceRequest self = new SegmentHDCommonImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SegmentHDCommonImageAdvanceRequest setImageUrlObject(java.io.InputStream imageUrlObject) {
        this.imageUrlObject = imageUrlObject;
        return this;
    }
    public java.io.InputStream getImageUrlObject() {
        return this.imageUrlObject;
    }

}
