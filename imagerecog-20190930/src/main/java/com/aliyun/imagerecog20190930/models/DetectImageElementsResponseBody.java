// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class DetectImageElementsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectImageElementsResponseBodyData data;

    public static DetectImageElementsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectImageElementsResponseBody self = new DetectImageElementsResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectImageElementsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectImageElementsResponseBody setData(DetectImageElementsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectImageElementsResponseBodyData getData() {
        return this.data;
    }

    public static class DetectImageElementsResponseBodyDataElements extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Y")
        public Integer y;

        @NameInMap("Score")
        public Float score;

        @NameInMap("X")
        public Integer x;

        public static DetectImageElementsResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectImageElementsResponseBodyDataElements self = new DetectImageElementsResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public DetectImageElementsResponseBodyDataElements setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DetectImageElementsResponseBodyDataElements setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DetectImageElementsResponseBodyDataElements setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DetectImageElementsResponseBodyDataElements setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

        public DetectImageElementsResponseBodyDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public DetectImageElementsResponseBodyDataElements setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

    }

    public static class DetectImageElementsResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectImageElementsResponseBodyDataElements> elements;

        public static DetectImageElementsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectImageElementsResponseBodyData self = new DetectImageElementsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectImageElementsResponseBodyData setElements(java.util.List<DetectImageElementsResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectImageElementsResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
