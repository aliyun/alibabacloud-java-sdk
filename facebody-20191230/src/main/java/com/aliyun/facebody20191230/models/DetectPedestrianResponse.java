// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectPedestrianResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectPedestrianResponseData data;

    public static DetectPedestrianResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectPedestrianResponse self = new DetectPedestrianResponse();
        return TeaModel.build(map, self);
    }

    public DetectPedestrianResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectPedestrianResponse setData(DetectPedestrianResponseData data) {
        this.data = data;
        return this;
    }
    public DetectPedestrianResponseData getData() {
        return this.data;
    }

    public static class DetectPedestrianResponseDataElements extends TeaModel {
        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Boxes")
        @Validation(required = true)
        public java.util.List<Integer> boxes;

        public static DetectPedestrianResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectPedestrianResponseDataElements self = new DetectPedestrianResponseDataElements();
            return TeaModel.build(map, self);
        }

        public DetectPedestrianResponseDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public DetectPedestrianResponseDataElements setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DetectPedestrianResponseDataElements setBoxes(java.util.List<Integer> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<Integer> getBoxes() {
            return this.boxes;
        }

    }

    public static class DetectPedestrianResponseData extends TeaModel {
        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<DetectPedestrianResponseDataElements> elements;

        public static DetectPedestrianResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectPedestrianResponseData self = new DetectPedestrianResponseData();
            return TeaModel.build(map, self);
        }

        public DetectPedestrianResponseData setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DetectPedestrianResponseData setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DetectPedestrianResponseData setElements(java.util.List<DetectPedestrianResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectPedestrianResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
