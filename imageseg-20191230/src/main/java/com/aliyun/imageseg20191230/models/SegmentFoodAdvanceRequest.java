// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentFoodAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static SegmentFoodAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentFoodAdvanceRequest self = new SegmentFoodAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
