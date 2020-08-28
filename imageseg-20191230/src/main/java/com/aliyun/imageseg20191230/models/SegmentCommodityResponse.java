// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentCommodityResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentCommodityResponseData data;

    public static SegmentCommodityResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentCommodityResponse self = new SegmentCommodityResponse();
        return TeaModel.build(map, self);
    }

    public static class SegmentCommodityResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static SegmentCommodityResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentCommodityResponseData self = new SegmentCommodityResponseData();
            return TeaModel.build(map, self);
        }

    }

}
