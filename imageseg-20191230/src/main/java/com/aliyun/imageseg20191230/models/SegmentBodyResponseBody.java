// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentBodyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SegmentBodyResponseBodyData data;

    public static SegmentBodyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentBodyResponseBody self = new SegmentBodyResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentBodyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentBodyResponseBody setData(SegmentBodyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentBodyResponseBodyData getData() {
        return this.data;
    }

    public static class SegmentBodyResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static SegmentBodyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentBodyResponseBodyData self = new SegmentBodyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentBodyResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
