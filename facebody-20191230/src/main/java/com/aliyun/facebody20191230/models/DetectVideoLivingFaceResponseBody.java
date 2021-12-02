// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectVideoLivingFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectVideoLivingFaceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectVideoLivingFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoLivingFaceResponseBody self = new DetectVideoLivingFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectVideoLivingFaceResponseBody setData(DetectVideoLivingFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectVideoLivingFaceResponseBodyData getData() {
        return this.data;
    }

    public DetectVideoLivingFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectVideoLivingFaceResponseBodyDataElements extends TeaModel {
        @NameInMap("FaceConfidence")
        public Float faceConfidence;

        @NameInMap("LiveConfidence")
        public Float liveConfidence;

        @NameInMap("Rect")
        public java.util.List<Integer> rect;

        public static DetectVideoLivingFaceResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectVideoLivingFaceResponseBodyDataElements self = new DetectVideoLivingFaceResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public DetectVideoLivingFaceResponseBodyDataElements setFaceConfidence(Float faceConfidence) {
            this.faceConfidence = faceConfidence;
            return this;
        }
        public Float getFaceConfidence() {
            return this.faceConfidence;
        }

        public DetectVideoLivingFaceResponseBodyDataElements setLiveConfidence(Float liveConfidence) {
            this.liveConfidence = liveConfidence;
            return this;
        }
        public Float getLiveConfidence() {
            return this.liveConfidence;
        }

        public DetectVideoLivingFaceResponseBodyDataElements setRect(java.util.List<Integer> rect) {
            this.rect = rect;
            return this;
        }
        public java.util.List<Integer> getRect() {
            return this.rect;
        }

    }

    public static class DetectVideoLivingFaceResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectVideoLivingFaceResponseBodyDataElements> elements;

        public static DetectVideoLivingFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectVideoLivingFaceResponseBodyData self = new DetectVideoLivingFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectVideoLivingFaceResponseBodyData setElements(java.util.List<DetectVideoLivingFaceResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectVideoLivingFaceResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
