// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectPedestrianResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectPedestrianResponseBodyData data;

    public static DetectPedestrianResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectPedestrianResponseBody self = new DetectPedestrianResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectPedestrianResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectPedestrianResponseBody setData(DetectPedestrianResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectPedestrianResponseBodyData getData() {
        return this.data;
    }

    public static class DetectPedestrianResponseBodyDataElements extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Boxes")
        public java.util.List<Integer> boxes;

        @NameInMap("Score")
        public Float score;

        public static DetectPedestrianResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectPedestrianResponseBodyDataElements self = new DetectPedestrianResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public DetectPedestrianResponseBodyDataElements setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DetectPedestrianResponseBodyDataElements setBoxes(java.util.List<Integer> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<Integer> getBoxes() {
            return this.boxes;
        }

        public DetectPedestrianResponseBodyDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class DetectPedestrianResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectPedestrianResponseBodyDataElements> elements;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        public static DetectPedestrianResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectPedestrianResponseBodyData self = new DetectPedestrianResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectPedestrianResponseBodyData setElements(java.util.List<DetectPedestrianResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectPedestrianResponseBodyDataElements> getElements() {
            return this.elements;
        }

        public DetectPedestrianResponseBodyData setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DetectPedestrianResponseBodyData setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

}
