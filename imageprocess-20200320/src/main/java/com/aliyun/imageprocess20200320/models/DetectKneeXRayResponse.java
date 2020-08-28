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

    public static class DetectKneeXRayResponseDataKLDetections extends TeaModel {
        @NameInMap("Detections")
        @Validation(required = true)
        public java.util.List<Double> detections;

        public static DetectKneeXRayResponseDataKLDetections build(java.util.Map<String, ?> map) throws Exception {
            DetectKneeXRayResponseDataKLDetections self = new DetectKneeXRayResponseDataKLDetections();
            return TeaModel.build(map, self);
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

    }

}
