// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectPedestrianIntrusionResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectPedestrianIntrusionResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectPedestrianIntrusionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectPedestrianIntrusionResponseBody self = new DetectPedestrianIntrusionResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectPedestrianIntrusionResponseBody setData(DetectPedestrianIntrusionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectPedestrianIntrusionResponseBodyData getData() {
        return this.data;
    }

    public DetectPedestrianIntrusionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectPedestrianIntrusionResponseBodyDataElementsBox extends TeaModel {
        @NameInMap("Bottom")
        public Long bottom;

        @NameInMap("Left")
        public Long left;

        @NameInMap("Right")
        public Long right;

        @NameInMap("Top")
        public Long top;

        public static DetectPedestrianIntrusionResponseBodyDataElementsBox build(java.util.Map<String, ?> map) throws Exception {
            DetectPedestrianIntrusionResponseBodyDataElementsBox self = new DetectPedestrianIntrusionResponseBodyDataElementsBox();
            return TeaModel.build(map, self);
        }

        public DetectPedestrianIntrusionResponseBodyDataElementsBox setBottom(Long bottom) {
            this.bottom = bottom;
            return this;
        }
        public Long getBottom() {
            return this.bottom;
        }

        public DetectPedestrianIntrusionResponseBodyDataElementsBox setLeft(Long left) {
            this.left = left;
            return this;
        }
        public Long getLeft() {
            return this.left;
        }

        public DetectPedestrianIntrusionResponseBodyDataElementsBox setRight(Long right) {
            this.right = right;
            return this;
        }
        public Long getRight() {
            return this.right;
        }

        public DetectPedestrianIntrusionResponseBodyDataElementsBox setTop(Long top) {
            this.top = top;
            return this;
        }
        public Long getTop() {
            return this.top;
        }

    }

    public static class DetectPedestrianIntrusionResponseBodyDataElements extends TeaModel {
        @NameInMap("Box")
        public DetectPedestrianIntrusionResponseBodyDataElementsBox box;

        @NameInMap("BoxId")
        public Long boxId;

        @NameInMap("IsIntrude")
        public Boolean isIntrude;

        @NameInMap("Score")
        public Long score;

        @NameInMap("Type")
        public String type;

        public static DetectPedestrianIntrusionResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectPedestrianIntrusionResponseBodyDataElements self = new DetectPedestrianIntrusionResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public DetectPedestrianIntrusionResponseBodyDataElements setBox(DetectPedestrianIntrusionResponseBodyDataElementsBox box) {
            this.box = box;
            return this;
        }
        public DetectPedestrianIntrusionResponseBodyDataElementsBox getBox() {
            return this.box;
        }

        public DetectPedestrianIntrusionResponseBodyDataElements setBoxId(Long boxId) {
            this.boxId = boxId;
            return this;
        }
        public Long getBoxId() {
            return this.boxId;
        }

        public DetectPedestrianIntrusionResponseBodyDataElements setIsIntrude(Boolean isIntrude) {
            this.isIntrude = isIntrude;
            return this;
        }
        public Boolean getIsIntrude() {
            return this.isIntrude;
        }

        public DetectPedestrianIntrusionResponseBodyDataElements setScore(Long score) {
            this.score = score;
            return this;
        }
        public Long getScore() {
            return this.score;
        }

        public DetectPedestrianIntrusionResponseBodyDataElements setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DetectPedestrianIntrusionResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectPedestrianIntrusionResponseBodyDataElements> elements;

        @NameInMap("ImageHeight")
        public Long imageHeight;

        @NameInMap("ImageWidth")
        public Long imageWidth;

        public static DetectPedestrianIntrusionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectPedestrianIntrusionResponseBodyData self = new DetectPedestrianIntrusionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectPedestrianIntrusionResponseBodyData setElements(java.util.List<DetectPedestrianIntrusionResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectPedestrianIntrusionResponseBodyDataElements> getElements() {
            return this.elements;
        }

        public DetectPedestrianIntrusionResponseBodyData setImageHeight(Long imageHeight) {
            this.imageHeight = imageHeight;
            return this;
        }
        public Long getImageHeight() {
            return this.imageHeight;
        }

        public DetectPedestrianIntrusionResponseBodyData setImageWidth(Long imageWidth) {
            this.imageWidth = imageWidth;
            return this;
        }
        public Long getImageWidth() {
            return this.imageWidth;
        }

    }

}
