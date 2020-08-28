// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentFoodResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentFoodResponseData data;

    public static SegmentFoodResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentFoodResponse self = new SegmentFoodResponse();
        return TeaModel.build(map, self);
    }

    public static class SegmentFoodResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static SegmentFoodResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentFoodResponseData self = new SegmentFoodResponseData();
            return TeaModel.build(map, self);
        }

    }

}
