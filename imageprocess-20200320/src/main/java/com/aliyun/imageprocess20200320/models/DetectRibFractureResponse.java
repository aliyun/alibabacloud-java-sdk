// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectRibFractureResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectRibFractureResponseData data;

    public static DetectRibFractureResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectRibFractureResponse self = new DetectRibFractureResponse();
        return TeaModel.build(map, self);
    }

    public DetectRibFractureResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectRibFractureResponse setData(DetectRibFractureResponseData data) {
        this.data = data;
        return this;
    }
    public DetectRibFractureResponseData getData() {
        return this.data;
    }

    public static class DetectRibFractureResponseDataDetections extends TeaModel {
        @NameInMap("FractureId")
        @Validation(required = true)
        public Integer fractureId;

        @NameInMap("FractureConfidence")
        @Validation(required = true)
        public Float fractureConfidence;

        @NameInMap("FractureCategory")
        @Validation(required = true)
        public String fractureCategory;

        @NameInMap("Coordinates")
        @Validation(required = true)
        public java.util.List<Integer> coordinates;

        @NameInMap("CoordinateImage")
        @Validation(required = true)
        public java.util.List<Integer> coordinateImage;

        public static DetectRibFractureResponseDataDetections build(java.util.Map<String, ?> map) throws Exception {
            DetectRibFractureResponseDataDetections self = new DetectRibFractureResponseDataDetections();
            return TeaModel.build(map, self);
        }

        public DetectRibFractureResponseDataDetections setFractureId(Integer fractureId) {
            this.fractureId = fractureId;
            return this;
        }
        public Integer getFractureId() {
            return this.fractureId;
        }

        public DetectRibFractureResponseDataDetections setFractureConfidence(Float fractureConfidence) {
            this.fractureConfidence = fractureConfidence;
            return this;
        }
        public Float getFractureConfidence() {
            return this.fractureConfidence;
        }

        public DetectRibFractureResponseDataDetections setFractureCategory(String fractureCategory) {
            this.fractureCategory = fractureCategory;
            return this;
        }
        public String getFractureCategory() {
            return this.fractureCategory;
        }

        public DetectRibFractureResponseDataDetections setCoordinates(java.util.List<Integer> coordinates) {
            this.coordinates = coordinates;
            return this;
        }
        public java.util.List<Integer> getCoordinates() {
            return this.coordinates;
        }

        public DetectRibFractureResponseDataDetections setCoordinateImage(java.util.List<Integer> coordinateImage) {
            this.coordinateImage = coordinateImage;
            return this;
        }
        public java.util.List<Integer> getCoordinateImage() {
            return this.coordinateImage;
        }

    }

    public static class DetectRibFractureResponseData extends TeaModel {
        @NameInMap("ResultURL")
        @Validation(required = true)
        public String resultURL;

        @NameInMap("Detections")
        @Validation(required = true)
        public java.util.List<DetectRibFractureResponseDataDetections> detections;

        @NameInMap("Spacing")
        @Validation(required = true)
        public java.util.List<Float> spacing;

        @NameInMap("Origin")
        @Validation(required = true)
        public java.util.List<Float> origin;

        public static DetectRibFractureResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectRibFractureResponseData self = new DetectRibFractureResponseData();
            return TeaModel.build(map, self);
        }

        public DetectRibFractureResponseData setResultURL(String resultURL) {
            this.resultURL = resultURL;
            return this;
        }
        public String getResultURL() {
            return this.resultURL;
        }

        public DetectRibFractureResponseData setDetections(java.util.List<DetectRibFractureResponseDataDetections> detections) {
            this.detections = detections;
            return this;
        }
        public java.util.List<DetectRibFractureResponseDataDetections> getDetections() {
            return this.detections;
        }

        public DetectRibFractureResponseData setSpacing(java.util.List<Float> spacing) {
            this.spacing = spacing;
            return this;
        }
        public java.util.List<Float> getSpacing() {
            return this.spacing;
        }

        public DetectRibFractureResponseData setOrigin(java.util.List<Float> origin) {
            this.origin = origin;
            return this;
        }
        public java.util.List<Float> getOrigin() {
            return this.origin;
        }

    }

}
