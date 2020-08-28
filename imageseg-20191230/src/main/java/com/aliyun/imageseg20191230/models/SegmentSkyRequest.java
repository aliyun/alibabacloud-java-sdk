// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSkyRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static SegmentSkyRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentSkyRequest self = new SegmentSkyRequest();
        return TeaModel.build(map, self);
    }

}
