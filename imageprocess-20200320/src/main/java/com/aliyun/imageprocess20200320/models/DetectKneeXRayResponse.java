// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectKneeXRayResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectKneeXRayResponseData data;

    public static DetectKneeXRayResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectKneeXRayResponse self = new DetectKneeXRayResponse();
        return TeaModel.build(map, self);
    }

    public DetectKneeXRayResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectKneeXRayResponse setData(DetectKneeXRayResponseData data) {
        this.data = data;
        return this;
    }
    public DetectKneeXRayResponseData getData() {
        return this.data;
    }

    public static class DetectKneeXRayResponseDataKLDetections extends TeaModel {
        @NameInMap("Detections")
        @Validation(required = true)
        public java.util.List<Float> detections;

        public static DetectKneeXRayResponseDataKLDetections build(java.util.Map<String, ?> map) throws Exception {
            DetectKneeXRayResponseDataKLDetections self = new DetectKneeXRayResponseDataKLDetections();
            return TeaModel.build(map, self);
        }

        public DetectKneeXRayResponseDataKLDetections setDetections(java.util.List<Float> detections) {
            this.detections = detections;
            return this;
        }
        public java.util.List<Float> getDetections() {
            return this.detections;
        }

    }

    public static class DetectKneeXRayResponseData extends TeaModel {
        @NameInMap("KLDetections")
        @Validation(required = true)
        public java.util.List<DetectKneeXRayResponseDataKLDetections> KLDetections;

        public static DetectKneeXRayResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectKneeXRayResponseData self = new DetectKneeXRayResponseData();
            return TeaModel.build(map, self);
        }

        public DetectKneeXRayResponseData setKLDetections(java.util.List<DetectKneeXRayResponseDataKLDetections> KLDetections) {
            this.KLDetections = KLDetections;
            return this;
        }
        public java.util.List<DetectKneeXRayResponseDataKLDetections> getKLDetections() {
            return this.KLDetections;
        }

    }

}
