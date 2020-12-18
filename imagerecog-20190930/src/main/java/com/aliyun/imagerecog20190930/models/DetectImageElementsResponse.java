// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class DetectImageElementsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectImageElementsResponseData data;

    public static DetectImageElementsResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectImageElementsResponse self = new DetectImageElementsResponse();
        return TeaModel.build(map, self);
    }

    public DetectImageElementsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectImageElementsResponse setData(DetectImageElementsResponseData data) {
        this.data = data;
        return this;
    }
    public DetectImageElementsResponseData getData() {
        return this.data;
    }

    public static class DetectImageElementsResponseDataElements extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

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

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        public static DetectImageElementsResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectImageElementsResponseDataElements self = new DetectImageElementsResponseDataElements();
            return TeaModel.build(map, self);
        }

        public DetectImageElementsResponseDataElements setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DetectImageElementsResponseDataElements setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public DetectImageElementsResponseDataElements setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

        public DetectImageElementsResponseDataElements setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DetectImageElementsResponseDataElements setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DetectImageElementsResponseDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class DetectImageElementsResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<DetectImageElementsResponseDataElements> elements;

        public static DetectImageElementsResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectImageElementsResponseData self = new DetectImageElementsResponseData();
            return TeaModel.build(map, self);
        }

        public DetectImageElementsResponseData setElements(java.util.List<DetectImageElementsResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectImageElementsResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
