// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentLogoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentLogoResponseData data;

    public static SegmentLogoResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentLogoResponse self = new SegmentLogoResponse();
        return TeaModel.build(map, self);
    }

    public SegmentLogoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentLogoResponse setData(SegmentLogoResponseData data) {
        this.data = data;
        return this;
    }
    public SegmentLogoResponseData getData() {
        return this.data;
    }

    public static class SegmentLogoResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static SegmentLogoResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentLogoResponseData self = new SegmentLogoResponseData();
            return TeaModel.build(map, self);
        }

        public SegmentLogoResponseData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
