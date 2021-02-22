// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHDCommonImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SegmentHDCommonImageResponseBodyData data;

    public static SegmentHDCommonImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentHDCommonImageResponseBody self = new SegmentHDCommonImageResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentHDCommonImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentHDCommonImageResponseBody setData(SegmentHDCommonImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentHDCommonImageResponseBodyData getData() {
        return this.data;
    }

    public static class SegmentHDCommonImageResponseBodyData extends TeaModel {
        @NameInMap("ImageUrl")
        public String imageUrl;

        public static SegmentHDCommonImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentHDCommonImageResponseBodyData self = new SegmentHDCommonImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentHDCommonImageResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

    }

}
