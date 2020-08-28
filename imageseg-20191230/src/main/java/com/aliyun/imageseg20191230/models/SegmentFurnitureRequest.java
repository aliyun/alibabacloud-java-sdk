// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentFurnitureRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static SegmentFurnitureRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentFurnitureRequest self = new SegmentFurnitureRequest();
        return TeaModel.build(map, self);
    }

}
