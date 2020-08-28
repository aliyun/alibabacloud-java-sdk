// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentCommodityAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static SegmentCommodityAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SegmentCommodityAdvanceRequest self = new SegmentCommodityAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
