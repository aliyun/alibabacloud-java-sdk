// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHDSkyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentHDSkyResponseData data;

    public static SegmentHDSkyResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentHDSkyResponse self = new SegmentHDSkyResponse();
        return TeaModel.build(map, self);
    }

    public SegmentHDSkyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentHDSkyResponse setData(SegmentHDSkyResponseData data) {
        this.data = data;
        return this;
    }
    public SegmentHDSkyResponseData getData() {
        return this.data;
    }

    public static class SegmentHDSkyResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static SegmentHDSkyResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentHDSkyResponseData self = new SegmentHDSkyResponseData();
            return TeaModel.build(map, self);
        }

        public SegmentHDSkyResponseData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
