// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHDSkyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SegmentHDSkyResponseBodyData data;

    public static SegmentHDSkyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentHDSkyResponseBody self = new SegmentHDSkyResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentHDSkyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentHDSkyResponseBody setData(SegmentHDSkyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentHDSkyResponseBodyData getData() {
        return this.data;
    }

    public static class SegmentHDSkyResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static SegmentHDSkyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentHDSkyResponseBodyData self = new SegmentHDSkyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentHDSkyResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
