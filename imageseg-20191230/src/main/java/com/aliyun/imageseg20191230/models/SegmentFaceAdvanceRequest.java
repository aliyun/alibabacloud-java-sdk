// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentFaceAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static SegmentFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentFaceAdvanceRequest self = new SegmentFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
