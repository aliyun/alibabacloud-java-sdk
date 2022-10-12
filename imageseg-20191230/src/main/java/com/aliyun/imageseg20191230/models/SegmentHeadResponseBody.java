// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHeadResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentHeadResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static SegmentHeadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentHeadResponseBody self = new SegmentHeadResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentHeadResponseBody setData(SegmentHeadResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentHeadResponseBodyData getData() {
        return this.data;
    }

    public SegmentHeadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentHeadResponseBodyDataElements extends TeaModel {
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

        public static SegmentHeadResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            SegmentHeadResponseBodyDataElements self = new SegmentHeadResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public SegmentHeadResponseBodyDataElements setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public SegmentHeadResponseBodyDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public SegmentHeadResponseBodyDataElements setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public SegmentHeadResponseBodyDataElements setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public SegmentHeadResponseBodyDataElements setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class SegmentHeadResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<SegmentHeadResponseBodyDataElements> elements;

        public static SegmentHeadResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentHeadResponseBodyData self = new SegmentHeadResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentHeadResponseBodyData setElements(java.util.List<SegmentHeadResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<SegmentHeadResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
