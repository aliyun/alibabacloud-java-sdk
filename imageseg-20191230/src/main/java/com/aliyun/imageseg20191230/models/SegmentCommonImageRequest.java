// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentCommonImageRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static SegmentCommonImageRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentCommonImageRequest self = new SegmentCommonImageRequest();
        return TeaModel.build(map, self);
    }

}
