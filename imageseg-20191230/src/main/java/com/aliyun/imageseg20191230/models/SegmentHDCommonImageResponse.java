// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHDCommonImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentHDCommonImageResponseData data;

    public static SegmentHDCommonImageResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentHDCommonImageResponse self = new SegmentHDCommonImageResponse();
        return TeaModel.build(map, self);
    }

    public SegmentHDCommonImageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentHDCommonImageResponse setData(SegmentHDCommonImageResponseData data) {
        this.data = data;
        return this;
    }
    public SegmentHDCommonImageResponseData getData() {
        return this.data;
    }

    public static class SegmentHDCommonImageResponseData extends TeaModel {
        @NameInMap("ImageUrl")
        @Validation(required = true)
        public String imageUrl;

        public static SegmentHDCommonImageResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentHDCommonImageResponseData self = new SegmentHDCommonImageResponseData();
            return TeaModel.build(map, self);
        }

        public SegmentHDCommonImageResponseData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

    }

}
