// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHDBodyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SegmentHDBodyResponseBodyData data;

    public static SegmentHDBodyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentHDBodyResponseBody self = new SegmentHDBodyResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentHDBodyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentHDBodyResponseBody setData(SegmentHDBodyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentHDBodyResponseBodyData getData() {
        return this.data;
    }

    public static class SegmentHDBodyResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static SegmentHDBodyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentHDBodyResponseBodyData self = new SegmentHDBodyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentHDBodyResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
