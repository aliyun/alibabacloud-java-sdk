// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentClothResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentClothResponseData data;

    public static SegmentClothResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentClothResponse self = new SegmentClothResponse();
        return TeaModel.build(map, self);
    }

    public SegmentClothResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentClothResponse setData(SegmentClothResponseData data) {
        this.data = data;
        return this;
    }
    public SegmentClothResponseData getData() {
        return this.data;
    }

    public static class SegmentClothResponseDataElements extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static SegmentClothResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            SegmentClothResponseDataElements self = new SegmentClothResponseDataElements();
            return TeaModel.build(map, self);
        }

        public SegmentClothResponseDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

    public static class SegmentClothResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<SegmentClothResponseDataElements> elements;

        public static SegmentClothResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentClothResponseData self = new SegmentClothResponseData();
            return TeaModel.build(map, self);
        }

        public SegmentClothResponseData setElements(java.util.List<SegmentClothResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<SegmentClothResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
