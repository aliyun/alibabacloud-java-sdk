// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSkyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SegmentSkyResponseBodyData data;

    public static SegmentSkyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentSkyResponseBody self = new SegmentSkyResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentSkyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentSkyResponseBody setData(SegmentSkyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentSkyResponseBodyData getData() {
        return this.data;
    }

    public static class SegmentSkyResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static SegmentSkyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentSkyResponseBodyData self = new SegmentSkyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentSkyResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
