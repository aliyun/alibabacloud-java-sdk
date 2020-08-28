// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSkyAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static SegmentSkyAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentSkyAdvanceRequest self = new SegmentSkyAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
