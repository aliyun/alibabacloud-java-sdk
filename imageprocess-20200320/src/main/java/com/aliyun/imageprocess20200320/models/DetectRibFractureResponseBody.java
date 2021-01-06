// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectRibFractureResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectRibFractureResponseBodyData data;

    public static DetectRibFractureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectRibFractureResponseBody self = new DetectRibFractureResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectRibFractureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectRibFractureResponseBody setData(DetectRibFractureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectRibFractureResponseBodyData getData() {
        return this.data;
    }

    public static class DetectRibFractureResponseBodyDataDetections extends TeaModel {
        @NameInMap("Coordinates")
        public java.util.List<Integer> coordinates;

        @NameInMap("FractureId")
        public Integer fractureId;

        @NameInMap("CoordinateImage")
        public java.util.List<Integer> coordinateImage;

        @NameInMap("FractureConfidence")
        public Float fractureConfidence;

        @NameInMap("FractureCategory")
        public String fractureCategory;

        public static DetectRibFractureResponseBodyDataDetections build(java.util.Map<String, ?> map) throws Exception {
            DetectRibFractureResponseBodyDataDetections self = new DetectRibFractureResponseBodyDataDetections();
            return TeaModel.build(map, self);
        }

        public DetectRibFractureResponseBodyDataDetections setCoordinates(java.util.List<Integer> coordinates) {
            this.coordinates = coordinates;
            return this;
        }
        public java.util.List<Integer> getCoordinates() {
            return this.coordinates;
        }

        public DetectRibFractureResponseBodyDataDetections setFractureId(Integer fractureId) {
            this.fractureId = fractureId;
            return this;
        }
        public Integer getFractureId() {
            return this.fractureId;
        }

        public DetectRibFractureResponseBodyDataDetections setCoordinateImage(java.util.List<Integer> coordinateImage) {
            this.coordinateImage = coordinateImage;
            return this;
        }
        public java.util.List<Integer> getCoordinateImage() {
            return this.coordinateImage;
        }

        public DetectRibFractureResponseBodyDataDetections setFractureConfidence(Float fractureConfidence) {
            this.fractureConfidence = fractureConfidence;
            return this;
        }
        public Float getFractureConfidence() {
            return this.fractureConfidence;
        }

        public DetectRibFractureResponseBodyDataDetections setFractureCategory(String fractureCategory) {
            this.fractureCategory = fractureCategory;
            return this;
        }
        public String getFractureCategory() {
            return this.fractureCategory;
        }

    }

    public static class DetectRibFractureResponseBodyData extends TeaModel {
        @NameInMap("Detections")
        public java.util.List<DetectRibFractureResponseBodyDataDetections> detections;

        @NameInMap("Origin")
        public java.util.List<Float> origin;

        @NameInMap("ResultURL")
        public String resultURL;

        @NameInMap("Spacing")
        public java.util.List<Float> spacing;

        public static DetectRibFractureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectRibFractureResponseBodyData self = new DetectRibFractureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectRibFractureResponseBodyData setDetections(java.util.List<DetectRibFractureResponseBodyDataDetections> detections) {
            this.detections = detections;
            return this;
        }
        public java.util.List<DetectRibFractureResponseBodyDataDetections> getDetections() {
            return this.detections;
        }

        public DetectRibFractureResponseBodyData setOrigin(java.util.List<Float> origin) {
            this.origin = origin;
            return this;
        }
        public java.util.List<Float> getOrigin() {
            return this.origin;
        }

        public DetectRibFractureResponseBodyData setResultURL(String resultURL) {
            this.resultURL = resultURL;
            return this;
        }
        public String getResultURL() {
            return this.resultURL;
        }

        public DetectRibFractureResponseBodyData setSpacing(java.util.List<Float> spacing) {
            this.spacing = spacing;
            return this;
        }
        public java.util.List<Float> getSpacing() {
            return this.spacing;
        }

    }

}
