// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentFurnitureResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentFurnitureResponseData data;

    public static SegmentFurnitureResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentFurnitureResponse self = new SegmentFurnitureResponse();
        return TeaModel.build(map, self);
    }

    public SegmentFurnitureResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentFurnitureResponse setData(SegmentFurnitureResponseData data) {
        this.data = data;
        return this;
    }
    public SegmentFurnitureResponseData getData() {
        return this.data;
    }

    public static class SegmentFurnitureResponseDataElements extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static SegmentFurnitureResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            SegmentFurnitureResponseDataElements self = new SegmentFurnitureResponseDataElements();
            return TeaModel.build(map, self);
        }

        public SegmentFurnitureResponseDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

    public static class SegmentFurnitureResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<SegmentFurnitureResponseDataElements> elements;

        public static SegmentFurnitureResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentFurnitureResponseData self = new SegmentFurnitureResponseData();
            return TeaModel.build(map, self);
        }

        public SegmentFurnitureResponseData setElements(java.util.List<SegmentFurnitureResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<SegmentFurnitureResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
