// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class SegmentCommodityResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentCommodityResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static SegmentCommodityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentCommodityResponseBody self = new SegmentCommodityResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentCommodityResponseBody setData(SegmentCommodityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentCommodityResponseBodyData getData() {
        return this.data;
    }

    public SegmentCommodityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentCommodityResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static SegmentCommodityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentCommodityResponseBodyData self = new SegmentCommodityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentCommodityResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
