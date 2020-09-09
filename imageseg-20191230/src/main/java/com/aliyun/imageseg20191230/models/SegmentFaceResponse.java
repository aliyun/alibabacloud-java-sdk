// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentFaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentFaceResponseData data;

    public static SegmentFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentFaceResponse self = new SegmentFaceResponse();
        return TeaModel.build(map, self);
    }

    public SegmentFaceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentFaceResponse setData(SegmentFaceResponseData data) {
        this.data = data;
        return this;
    }
    public SegmentFaceResponseData getData() {
        return this.data;
    }

    public static class SegmentFaceResponseDataElements extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        @NameInMap("X")
        @Validation(required = true)
        public Integer x;

        @NameInMap("Y")
        @Validation(required = true)
        public Integer y;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        public static SegmentFaceResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            SegmentFaceResponseDataElements self = new SegmentFaceResponseDataElements();
            return TeaModel.build(map, self);
        }

        public SegmentFaceResponseDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public SegmentFaceResponseDataElements setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public SegmentFaceResponseDataElements setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

        public SegmentFaceResponseDataElements setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public SegmentFaceResponseDataElements setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

    public static class SegmentFaceResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<SegmentFaceResponseDataElements> elements;

        public static SegmentFaceResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentFaceResponseData self = new SegmentFaceResponseData();
            return TeaModel.build(map, self);
        }

        public SegmentFaceResponseData setElements(java.util.List<SegmentFaceResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<SegmentFaceResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
