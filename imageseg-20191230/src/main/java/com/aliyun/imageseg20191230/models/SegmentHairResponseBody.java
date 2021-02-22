// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHairResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SegmentHairResponseBodyData data;

    public static SegmentHairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentHairResponseBody self = new SegmentHairResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentHairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentHairResponseBody setData(SegmentHairResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentHairResponseBodyData getData() {
        return this.data;
    }

    public static class SegmentHairResponseBodyDataElements extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Y")
        public Integer y;

        @NameInMap("X")
        public Integer x;

        public static SegmentHairResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            SegmentHairResponseBodyDataElements self = new SegmentHairResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public SegmentHairResponseBodyDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public SegmentHairResponseBodyDataElements setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public SegmentHairResponseBodyDataElements setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public SegmentHairResponseBodyDataElements setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

        public SegmentHairResponseBodyDataElements setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

    }

    public static class SegmentHairResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<SegmentHairResponseBodyDataElements> elements;

        public static SegmentHairResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentHairResponseBodyData self = new SegmentHairResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentHairResponseBodyData setElements(java.util.List<SegmentHairResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<SegmentHairResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
