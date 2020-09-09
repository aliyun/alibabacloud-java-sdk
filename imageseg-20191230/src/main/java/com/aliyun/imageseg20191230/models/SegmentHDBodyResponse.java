// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHDBodyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentHDBodyResponseData data;

    public static SegmentHDBodyResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentHDBodyResponse self = new SegmentHDBodyResponse();
        return TeaModel.build(map, self);
    }

    public SegmentHDBodyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentHDBodyResponse setData(SegmentHDBodyResponseData data) {
        this.data = data;
        return this;
    }
    public SegmentHDBodyResponseData getData() {
        return this.data;
    }

    public static class SegmentHDBodyResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static SegmentHDBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentHDBodyResponseData self = new SegmentHDBodyResponseData();
            return TeaModel.build(map, self);
        }

        public SegmentHDBodyResponseData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
