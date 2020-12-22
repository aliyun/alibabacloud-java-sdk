// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectIPCPedestrianResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectIPCPedestrianResponseBodyData data;

    public static DetectIPCPedestrianResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectIPCPedestrianResponseBody self = new DetectIPCPedestrianResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectIPCPedestrianResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectIPCPedestrianResponseBody setData(DetectIPCPedestrianResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectIPCPedestrianResponseBodyData getData() {
        return this.data;
    }

    public static class DetectIPCPedestrianResponseBodyDataImageInfoListElements extends TeaModel {
        @NameInMap("Boxes")
        public java.util.List<Integer> boxes;

        @NameInMap("Score")
        public Float score;

        public static DetectIPCPedestrianResponseBodyDataImageInfoListElements build(java.util.Map<String, ?> map) throws Exception {
            DetectIPCPedestrianResponseBodyDataImageInfoListElements self = new DetectIPCPedestrianResponseBodyDataImageInfoListElements();
            return TeaModel.build(map, self);
        }

        public DetectIPCPedestrianResponseBodyDataImageInfoListElements setBoxes(java.util.List<Integer> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<Integer> getBoxes() {
            return this.boxes;
        }

        public DetectIPCPedestrianResponseBodyDataImageInfoListElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class DetectIPCPedestrianResponseBodyDataImageInfoList extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectIPCPedestrianResponseBodyDataImageInfoListElements> elements;

        public static DetectIPCPedestrianResponseBodyDataImageInfoList build(java.util.Map<String, ?> map) throws Exception {
            DetectIPCPedestrianResponseBodyDataImageInfoList self = new DetectIPCPedestrianResponseBodyDataImageInfoList();
            return TeaModel.build(map, self);
        }

        public DetectIPCPedestrianResponseBodyDataImageInfoList setElements(java.util.List<DetectIPCPedestrianResponseBodyDataImageInfoListElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectIPCPedestrianResponseBodyDataImageInfoListElements> getElements() {
            return this.elements;
        }

    }

    public static class DetectIPCPedestrianResponseBodyData extends TeaModel {
        @NameInMap("ImageInfoList")
        public java.util.List<DetectIPCPedestrianResponseBodyDataImageInfoList> imageInfoList;

        public static DetectIPCPedestrianResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectIPCPedestrianResponseBodyData self = new DetectIPCPedestrianResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectIPCPedestrianResponseBodyData setImageInfoList(java.util.List<DetectIPCPedestrianResponseBodyDataImageInfoList> imageInfoList) {
            this.imageInfoList = imageInfoList;
            return this;
        }
        public java.util.List<DetectIPCPedestrianResponseBodyDataImageInfoList> getImageInfoList() {
            return this.imageInfoList;
        }

    }

}
