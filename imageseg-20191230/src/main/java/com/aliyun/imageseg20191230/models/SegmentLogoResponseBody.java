// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentLogoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SegmentLogoResponseBodyData data;

    public static SegmentLogoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentLogoResponseBody self = new SegmentLogoResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentLogoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentLogoResponseBody setData(SegmentLogoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentLogoResponseBodyData getData() {
        return this.data;
    }

    public static class SegmentLogoResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static SegmentLogoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentLogoResponseBodyData self = new SegmentLogoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentLogoResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
