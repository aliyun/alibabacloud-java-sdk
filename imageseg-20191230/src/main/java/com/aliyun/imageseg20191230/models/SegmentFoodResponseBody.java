// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentFoodResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SegmentFoodResponseBodyData data;

    public static SegmentFoodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentFoodResponseBody self = new SegmentFoodResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentFoodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentFoodResponseBody setData(SegmentFoodResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentFoodResponseBodyData getData() {
        return this.data;
    }

    public static class SegmentFoodResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static SegmentFoodResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentFoodResponseBodyData self = new SegmentFoodResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentFoodResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
