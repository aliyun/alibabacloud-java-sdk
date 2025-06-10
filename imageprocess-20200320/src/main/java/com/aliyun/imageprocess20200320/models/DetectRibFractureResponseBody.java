// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectRibFractureResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectRibFractureResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>5C695B5D-41A6-4202-8BF7-E647698678DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetectRibFractureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectRibFractureResponseBody self = new DetectRibFractureResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectRibFractureResponseBody setData(DetectRibFractureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectRibFractureResponseBodyData getData() {
        return this.data;
    }

    public DetectRibFractureResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetectRibFractureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectRibFractureResponseBodyDataDetections extends TeaModel {
        @NameInMap("CoordinateImage")
        public java.util.List<Integer> coordinateImage;

        @NameInMap("Coordinates")
        public java.util.List<Integer> coordinates;

        /**
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("FracSOPInstanceUID")
        public String fracSOPInstanceUID;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FractureCategory")
        public String fractureCategory;

        /**
         * <strong>example:</strong>
         * <p>0.7916666666666667</p>
         */
        @NameInMap("FractureConfidence")
        public Float fractureConfidence;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FractureId")
        public Integer fractureId;

        /**
         * <strong>example:</strong>
         * <p>L4</p>
         */
        @NameInMap("FractureLocation")
        public String fractureLocation;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FractureSegment")
        public Long fractureSegment;

        public static DetectRibFractureResponseBodyDataDetections build(java.util.Map<String, ?> map) throws Exception {
            DetectRibFractureResponseBodyDataDetections self = new DetectRibFractureResponseBodyDataDetections();
            return TeaModel.build(map, self);
        }

        public DetectRibFractureResponseBodyDataDetections setCoordinateImage(java.util.List<Integer> coordinateImage) {
            this.coordinateImage = coordinateImage;
            return this;
        }
        public java.util.List<Integer> getCoordinateImage() {
            return this.coordinateImage;
        }

        public DetectRibFractureResponseBodyDataDetections setCoordinates(java.util.List<Integer> coordinates) {
            this.coordinates = coordinates;
            return this;
        }
        public java.util.List<Integer> getCoordinates() {
            return this.coordinates;
        }

        public DetectRibFractureResponseBodyDataDetections setFracSOPInstanceUID(String fracSOPInstanceUID) {
            this.fracSOPInstanceUID = fracSOPInstanceUID;
            return this;
        }
        public String getFracSOPInstanceUID() {
            return this.fracSOPInstanceUID;
        }

        public DetectRibFractureResponseBodyDataDetections setFractureCategory(String fractureCategory) {
            this.fractureCategory = fractureCategory;
            return this;
        }
        public String getFractureCategory() {
            return this.fractureCategory;
        }

        public DetectRibFractureResponseBodyDataDetections setFractureConfidence(Float fractureConfidence) {
            this.fractureConfidence = fractureConfidence;
            return this;
        }
        public Float getFractureConfidence() {
            return this.fractureConfidence;
        }

        public DetectRibFractureResponseBodyDataDetections setFractureId(Integer fractureId) {
            this.fractureId = fractureId;
            return this;
        }
        public Integer getFractureId() {
            return this.fractureId;
        }

        public DetectRibFractureResponseBodyDataDetections setFractureLocation(String fractureLocation) {
            this.fractureLocation = fractureLocation;
            return this;
        }
        public String getFractureLocation() {
            return this.fractureLocation;
        }

        public DetectRibFractureResponseBodyDataDetections setFractureSegment(Long fractureSegment) {
            this.fractureSegment = fractureSegment;
            return this;
        }
        public Long getFractureSegment() {
            return this.fractureSegment;
        }

    }

    public static class DetectRibFractureResponseBodyData extends TeaModel {
        @NameInMap("Detections")
        public java.util.List<DetectRibFractureResponseBodyDataDetections> detections;

        @NameInMap("Origin")
        public java.util.List<Float> origin;

        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/detect-rib-fracture/local_test/2020-12-22/result-D5CD101C-F8E5-43CA-9E99-44C783B8F8BE.tar.gz?Expires=1608631727&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=d6c32E1IB4b7Ayo1lpjs%2Bq3Ylv">http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/detect-rib-fracture/local_test/2020-12-22/result-D5CD101C-F8E5-43CA-9E99-44C783B8F8BE.tar.gz?Expires=1608631727&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=d6c32E1IB4b7Ayo1lpjs%2Bq3Ylv</a>****</p>
         */
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
