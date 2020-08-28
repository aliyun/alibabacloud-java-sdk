// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentFurnitureAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static SegmentFurnitureAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentFurnitureAdvanceRequest self = new SegmentFurnitureAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
