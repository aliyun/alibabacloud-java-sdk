// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentClothRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static SegmentClothRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentClothRequest self = new SegmentClothRequest();
        return TeaModel.build(map, self);
    }

}
