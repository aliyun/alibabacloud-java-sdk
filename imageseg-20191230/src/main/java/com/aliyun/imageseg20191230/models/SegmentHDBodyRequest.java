// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHDBodyRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static SegmentHDBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentHDBodyRequest self = new SegmentHDBodyRequest();
        return TeaModel.build(map, self);
    }

}
