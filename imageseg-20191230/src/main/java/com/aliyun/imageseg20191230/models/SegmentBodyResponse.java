// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentBodyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentBodyResponseData data;

    public static SegmentBodyResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentBodyResponse self = new SegmentBodyResponse();
        return TeaModel.build(map, self);
    }

    public SegmentBodyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentBodyResponse setData(SegmentBodyResponseData data) {
        this.data = data;
        return this;
    }
    public SegmentBodyResponseData getData() {
        return this.data;
    }

    public static class SegmentBodyResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static SegmentBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentBodyResponseData self = new SegmentBodyResponseData();
            return TeaModel.build(map, self);
        }

        public SegmentBodyResponseData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
