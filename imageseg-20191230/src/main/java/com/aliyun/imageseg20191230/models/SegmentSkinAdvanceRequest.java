// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSkinAdvanceRequest extends TeaModel {
    @NameInMap("URLObject")
    @Validation(required = true)
    public java.io.InputStream URLObject;

    public static SegmentSkinAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentSkinAdvanceRequest self = new SegmentSkinAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public SegmentSkinAdvanceRequest setURLObject(java.io.InputStream URLObject) {
        this.URLObject = URLObject;
        return this;
    }
    public java.io.InputStream getURLObject() {
        return this.URLObject;
    }

}
