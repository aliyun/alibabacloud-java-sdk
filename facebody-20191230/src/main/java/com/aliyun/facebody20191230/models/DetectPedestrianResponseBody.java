// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectPedestrianResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectPedestrianResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectPedestrianResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectPedestrianResponseBody self = new DetectPedestrianResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectPedestrianResponseBody setData(DetectPedestrianResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectPedestrianResponseBodyData getData() {
        return this.data;
    }

    public DetectPedestrianResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectPedestrianResponseBodyDataElements extends TeaModel {
        @NameInMap("Boxes")
        public java.util.List<Integer> boxes;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Type")
        public String type;

        public static DetectPedestrianResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectPedestrianResponseBodyDataElements self = new DetectPedestrianResponseBodyDataElements();
            return TeaModel.build(map, self);
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

        public DetectPedestrianResponseBodyDataElements setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DetectPedestrianResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectPedestrianResponseBodyDataElements> elements;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

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

        public DetectPedestrianResponseBodyData setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DetectPedestrianResponseBodyData setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}
