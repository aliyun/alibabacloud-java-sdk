// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectVideoLivingFaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectVideoLivingFaceResponseData data;

    public static DetectVideoLivingFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoLivingFaceResponse self = new DetectVideoLivingFaceResponse();
        return TeaModel.build(map, self);
    }

    public DetectVideoLivingFaceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectVideoLivingFaceResponse setData(DetectVideoLivingFaceResponseData data) {
        this.data = data;
        return this;
    }
    public DetectVideoLivingFaceResponseData getData() {
        return this.data;
    }

    public static class DetectVideoLivingFaceResponseDataElements extends TeaModel {
        @NameInMap("LiveConfidence")
        @Validation(required = true)
        public Float liveConfidence;

        @NameInMap("FaceConfidence")
        @Validation(required = true)
        public Float faceConfidence;

        @NameInMap("Rect")
        @Validation(required = true)
        public java.util.List<Integer> rect;

        public static DetectVideoLivingFaceResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectVideoLivingFaceResponseDataElements self = new DetectVideoLivingFaceResponseDataElements();
            return TeaModel.build(map, self);
        }

        public DetectVideoLivingFaceResponseDataElements setLiveConfidence(Float liveConfidence) {
            this.liveConfidence = liveConfidence;
            return this;
        }
        public Float getLiveConfidence() {
            return this.liveConfidence;
        }

        public DetectVideoLivingFaceResponseDataElements setFaceConfidence(Float faceConfidence) {
            this.faceConfidence = faceConfidence;
            return this;
        }
        public Float getFaceConfidence() {
            return this.faceConfidence;
        }

        public DetectVideoLivingFaceResponseDataElements setRect(java.util.List<Integer> rect) {
            this.rect = rect;
            return this;
        }
        public java.util.List<Integer> getRect() {
            return this.rect;
        }

    }

    public static class DetectVideoLivingFaceResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<DetectVideoLivingFaceResponseDataElements> elements;

        public static DetectVideoLivingFaceResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectVideoLivingFaceResponseData self = new DetectVideoLivingFaceResponseData();
            return TeaModel.build(map, self);
        }

        public DetectVideoLivingFaceResponseData setElements(java.util.List<DetectVideoLivingFaceResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectVideoLivingFaceResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
