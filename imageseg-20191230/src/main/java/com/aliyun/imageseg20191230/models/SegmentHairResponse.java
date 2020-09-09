// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHairResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentHairResponseData data;

    public static SegmentHairResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentHairResponse self = new SegmentHairResponse();
        return TeaModel.build(map, self);
    }

    public SegmentHairResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentHairResponse setData(SegmentHairResponseData data) {
        this.data = data;
        return this;
    }
    public SegmentHairResponseData getData() {
        return this.data;
    }

    public static class SegmentHairResponseDataElements extends TeaModel {
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

        public static SegmentHairResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            SegmentHairResponseDataElements self = new SegmentHairResponseDataElements();
            return TeaModel.build(map, self);
        }

        public SegmentHairResponseDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public SegmentHairResponseDataElements setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public SegmentHairResponseDataElements setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

        public SegmentHairResponseDataElements setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public SegmentHairResponseDataElements setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

    public static class SegmentHairResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<SegmentHairResponseDataElements> elements;

        public static SegmentHairResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentHairResponseData self = new SegmentHairResponseData();
            return TeaModel.build(map, self);
        }

        public SegmentHairResponseData setElements(java.util.List<SegmentHairResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<SegmentHairResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
