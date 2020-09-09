// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSkyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentSkyResponseData data;

    public static SegmentSkyResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentSkyResponse self = new SegmentSkyResponse();
        return TeaModel.build(map, self);
    }

    public SegmentSkyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentSkyResponse setData(SegmentSkyResponseData data) {
        this.data = data;
        return this;
    }
    public SegmentSkyResponseData getData() {
        return this.data;
    }

    public static class SegmentSkyResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static SegmentSkyResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentSkyResponseData self = new SegmentSkyResponseData();
            return TeaModel.build(map, self);
        }

        public SegmentSkyResponseData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
