// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectLymphResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectLymphResponseBodyData data;

    /**
     * <p>提交异步任务后的提示信息。</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectLymphResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectLymphResponseBody self = new DetectLymphResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectLymphResponseBody setData(DetectLymphResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectLymphResponseBodyData getData() {
        return this.data;
    }

    public DetectLymphResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetectLymphResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectLymphResponseBodyDataLesions extends TeaModel {
        @NameInMap("Boxes")
        public java.util.List<Float> boxes;

        @NameInMap("Diametermm")
        public java.util.List<Float> diametermm;

        @NameInMap("KeySlice")
        public Long keySlice;

        @NameInMap("Recist")
        public java.util.List<java.util.List<Float>> recist;

        @NameInMap("Score")
        public Float score;

        public static DetectLymphResponseBodyDataLesions build(java.util.Map<String, ?> map) throws Exception {
            DetectLymphResponseBodyDataLesions self = new DetectLymphResponseBodyDataLesions();
            return TeaModel.build(map, self);
        }

        public DetectLymphResponseBodyDataLesions setBoxes(java.util.List<Float> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<Float> getBoxes() {
            return this.boxes;
        }

        public DetectLymphResponseBodyDataLesions setDiametermm(java.util.List<Float> diametermm) {
            this.diametermm = diametermm;
            return this;
        }
        public java.util.List<Float> getDiametermm() {
            return this.diametermm;
        }

        public DetectLymphResponseBodyDataLesions setKeySlice(Long keySlice) {
            this.keySlice = keySlice;
            return this;
        }
        public Long getKeySlice() {
            return this.keySlice;
        }

        public DetectLymphResponseBodyDataLesions setRecist(java.util.List<java.util.List<Float>> recist) {
            this.recist = recist;
            return this;
        }
        public java.util.List<java.util.List<Float>> getRecist() {
            return this.recist;
        }

        public DetectLymphResponseBodyDataLesions setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class DetectLymphResponseBodyData extends TeaModel {
        @NameInMap("Lesions")
        public java.util.List<DetectLymphResponseBodyDataLesions> lesions;

        public static DetectLymphResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectLymphResponseBodyData self = new DetectLymphResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectLymphResponseBodyData setLesions(java.util.List<DetectLymphResponseBodyDataLesions> lesions) {
            this.lesions = lesions;
            return this;
        }
        public java.util.List<DetectLymphResponseBodyDataLesions> getLesions() {
            return this.lesions;
        }

    }

}
