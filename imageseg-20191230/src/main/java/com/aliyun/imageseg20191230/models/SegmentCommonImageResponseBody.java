// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentCommonImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SegmentCommonImageResponseBodyData data;

    public static SegmentCommonImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentCommonImageResponseBody self = new SegmentCommonImageResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentCommonImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentCommonImageResponseBody setData(SegmentCommonImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentCommonImageResponseBodyData getData() {
        return this.data;
    }

    public static class SegmentCommonImageResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static SegmentCommonImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentCommonImageResponseBodyData self = new SegmentCommonImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentCommonImageResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
