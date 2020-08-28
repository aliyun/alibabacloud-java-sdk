// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSceneAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static SegmentSceneAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentSceneAdvanceRequest self = new SegmentSceneAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
