// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentFaceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static SegmentFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentFaceResponseBody self = new SegmentFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentFaceResponseBody setData(SegmentFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentFaceResponseBodyData getData() {
        return this.data;
    }

    public SegmentFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentFaceResponseBodyDataElements extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static SegmentFaceResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            SegmentFaceResponseBodyDataElements self = new SegmentFaceResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public SegmentFaceResponseBodyDataElements setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public SegmentFaceResponseBodyDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public SegmentFaceResponseBodyDataElements setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public SegmentFaceResponseBodyDataElements setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public SegmentFaceResponseBodyDataElements setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class SegmentFaceResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<SegmentFaceResponseBodyDataElements> elements;

        public static SegmentFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentFaceResponseBodyData self = new SegmentFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentFaceResponseBodyData setElements(java.util.List<SegmentFaceResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<SegmentFaceResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
