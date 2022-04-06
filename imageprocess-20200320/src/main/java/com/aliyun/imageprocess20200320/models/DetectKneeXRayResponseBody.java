// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectKneeXRayResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectKneeXRayResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectKneeXRayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectKneeXRayResponseBody self = new DetectKneeXRayResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectKneeXRayResponseBody setData(DetectKneeXRayResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectKneeXRayResponseBodyData getData() {
        return this.data;
    }

    public DetectKneeXRayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectKneeXRayResponseBodyDataKLDetections extends TeaModel {
        @NameInMap("Detections")
        public java.util.List<Float> detections;

        public static DetectKneeXRayResponseBodyDataKLDetections build(java.util.Map<String, ?> map) throws Exception {
            DetectKneeXRayResponseBodyDataKLDetections self = new DetectKneeXRayResponseBodyDataKLDetections();
            return TeaModel.build(map, self);
        }

        public DetectKneeXRayResponseBodyDataKLDetections setDetections(java.util.List<Float> detections) {
            this.detections = detections;
            return this;
        }
        public java.util.List<Float> getDetections() {
            return this.detections;
        }

    }

    public static class DetectKneeXRayResponseBodyData extends TeaModel {
        @NameInMap("KLDetections")
        public java.util.List<DetectKneeXRayResponseBodyDataKLDetections> KLDetections;

        public static DetectKneeXRayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectKneeXRayResponseBodyData self = new DetectKneeXRayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectKneeXRayResponseBodyData setKLDetections(java.util.List<DetectKneeXRayResponseBodyDataKLDetections> KLDetections) {
            this.KLDetections = KLDetections;
            return this;
        }
        public java.util.List<DetectKneeXRayResponseBodyDataKLDetections> getKLDetections() {
            return this.KLDetections;
        }

    }

}
