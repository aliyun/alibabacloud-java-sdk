// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20200910.models;

import com.aliyun.tea.*;

public class DetectIPCPedestrianOptimizedResponseBody extends TeaModel {
    // data
    @NameInMap("Data")
    public DetectIPCPedestrianOptimizedResponseBodyData data;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    public static DetectIPCPedestrianOptimizedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectIPCPedestrianOptimizedResponseBody self = new DetectIPCPedestrianOptimizedResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectIPCPedestrianOptimizedResponseBody setData(DetectIPCPedestrianOptimizedResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectIPCPedestrianOptimizedResponseBodyData getData() {
        return this.data;
    }

    public DetectIPCPedestrianOptimizedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectIPCPedestrianOptimizedResponseBodyDataImageInfoListElements extends TeaModel {
        // box array
        @NameInMap("Boxes")
        public java.util.List<Long> boxes;

        // score
        @NameInMap("Score")
        public Float score;

        public static DetectIPCPedestrianOptimizedResponseBodyDataImageInfoListElements build(java.util.Map<String, ?> map) throws Exception {
            DetectIPCPedestrianOptimizedResponseBodyDataImageInfoListElements self = new DetectIPCPedestrianOptimizedResponseBodyDataImageInfoListElements();
            return TeaModel.build(map, self);
        }

        public DetectIPCPedestrianOptimizedResponseBodyDataImageInfoListElements setBoxes(java.util.List<Long> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<Long> getBoxes() {
            return this.boxes;
        }

        public DetectIPCPedestrianOptimizedResponseBodyDataImageInfoListElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class DetectIPCPedestrianOptimizedResponseBodyDataImageInfoList extends TeaModel {
        // Elements
        @NameInMap("Elements")
        public java.util.List<DetectIPCPedestrianOptimizedResponseBodyDataImageInfoListElements> elements;

        public static DetectIPCPedestrianOptimizedResponseBodyDataImageInfoList build(java.util.Map<String, ?> map) throws Exception {
            DetectIPCPedestrianOptimizedResponseBodyDataImageInfoList self = new DetectIPCPedestrianOptimizedResponseBodyDataImageInfoList();
            return TeaModel.build(map, self);
        }

        public DetectIPCPedestrianOptimizedResponseBodyDataImageInfoList setElements(java.util.List<DetectIPCPedestrianOptimizedResponseBodyDataImageInfoListElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectIPCPedestrianOptimizedResponseBodyDataImageInfoListElements> getElements() {
            return this.elements;
        }

    }

    public static class DetectIPCPedestrianOptimizedResponseBodyData extends TeaModel {
        // imageInfoList
        @NameInMap("ImageInfoList")
        public java.util.List<DetectIPCPedestrianOptimizedResponseBodyDataImageInfoList> imageInfoList;

        public static DetectIPCPedestrianOptimizedResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectIPCPedestrianOptimizedResponseBodyData self = new DetectIPCPedestrianOptimizedResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectIPCPedestrianOptimizedResponseBodyData setImageInfoList(java.util.List<DetectIPCPedestrianOptimizedResponseBodyDataImageInfoList> imageInfoList) {
            this.imageInfoList = imageInfoList;
            return this;
        }
        public java.util.List<DetectIPCPedestrianOptimizedResponseBodyDataImageInfoList> getImageInfoList() {
            return this.imageInfoList;
        }

    }

}
