// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectLiverSteatosisResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectLiverSteatosisResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>39C848F7-D814-1A06-AE0D-AFC706B9700F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetectLiverSteatosisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectLiverSteatosisResponseBody self = new DetectLiverSteatosisResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectLiverSteatosisResponseBody setData(DetectLiverSteatosisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectLiverSteatosisResponseBodyData getData() {
        return this.data;
    }

    public DetectLiverSteatosisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetectLiverSteatosisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectLiverSteatosisResponseBodyDataDetections extends TeaModel {
        @NameInMap("FatFract")
        public Double fatFract;

        /**
         * <strong>example:</strong>
         * <p>62.07644147383561</p>
         */
        @NameInMap("LiverHU")
        public Float liverHU;

        /**
         * <strong>example:</strong>
         * <p>63.50222396850586</p>
         */
        @NameInMap("LiverROI1")
        public Float liverROI1;

        /**
         * <strong>example:</strong>
         * <p>62.23713684082031</p>
         */
        @NameInMap("LiverROI2")
        public Float liverROI2;

        /**
         * <strong>example:</strong>
         * <p>59.78181838989258</p>
         */
        @NameInMap("LiverROI3")
        public Float liverROI3;

        /**
         * <strong>example:</strong>
         * <p>12.0</p>
         */
        @NameInMap("LiverSlice")
        public Float liverSlice;

        /**
         * <strong>example:</strong>
         * <p>8.206502275265478</p>
         */
        @NameInMap("LiverSpleenDifference")
        public Float liverSpleenDifference;

        /**
         * <strong>example:</strong>
         * <p>1.15233917834983</p>
         */
        @NameInMap("LiverSpleenRatio")
        public Float liverSpleenRatio;

        /**
         * <strong>example:</strong>
         * <p>1059.4175610625439</p>
         */
        @NameInMap("LiverVolume")
        public Float liverVolume;

        @NameInMap("MaossScore")
        public Double maossScore;

        /**
         * <strong>example:</strong>
         * <p>Mod</p>
         */
        @NameInMap("Prediction")
        public String prediction;

        /**
         * <strong>example:</strong>
         * <p>0.9457855224609375</p>
         */
        @NameInMap("Probability")
        public Float probability;

        @NameInMap("ROI1Center")
        public java.util.List<Long> ROI1Center;

        @NameInMap("ROI2Center")
        public java.util.List<Long> ROI2Center;

        @NameInMap("ROI3Center")
        public java.util.List<Long> ROI3Center;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Radius")
        public Long radius;

        @NameInMap("SpleenCenter")
        public java.util.List<Long> spleenCenter;

        /**
         * <strong>example:</strong>
         * <p>53.86993919857013</p>
         */
        @NameInMap("SpleenHU")
        public Float spleenHU;

        /**
         * <strong>example:</strong>
         * <p>50.553409576416016</p>
         */
        @NameInMap("SpleenROI")
        public Float spleenROI;

        /**
         * <strong>example:</strong>
         * <p>9.0</p>
         */
        @NameInMap("SpleenSlice")
        public Float spleenSlice;

        /**
         * <strong>example:</strong>
         * <p>156.01873229470647</p>
         */
        @NameInMap("SpleenVolume")
        public Float spleenVolume;

        public static DetectLiverSteatosisResponseBodyDataDetections build(java.util.Map<String, ?> map) throws Exception {
            DetectLiverSteatosisResponseBodyDataDetections self = new DetectLiverSteatosisResponseBodyDataDetections();
            return TeaModel.build(map, self);
        }

        public DetectLiverSteatosisResponseBodyDataDetections setFatFract(Double fatFract) {
            this.fatFract = fatFract;
            return this;
        }
        public Double getFatFract() {
            return this.fatFract;
        }

        public DetectLiverSteatosisResponseBodyDataDetections setLiverHU(Float liverHU) {
            this.liverHU = liverHU;
            return this;
        }
        public Float getLiverHU() {
            return this.liverHU;
        }

        public DetectLiverSteatosisResponseBodyDataDetections setLiverROI1(Float liverROI1) {
            this.liverROI1 = liverROI1;
            return this;
        }
        public Float getLiverROI1() {
            return this.liverROI1;
        }

        public DetectLiverSteatosisResponseBodyDataDetections setLiverROI2(Float liverROI2) {
            this.liverROI2 = liverROI2;
            return this;
        }
        public Float getLiverROI2() {
            return this.liverROI2;
        }

        public DetectLiverSteatosisResponseBodyDataDetections setLiverROI3(Float liverROI3) {
            this.liverROI3 = liverROI3;
            return this;
        }
        public Float getLiverROI3() {
            return this.liverROI3;
        }

        public DetectLiverSteatosisResponseBodyDataDetections setLiverSlice(Float liverSlice) {
            this.liverSlice = liverSlice;
            return this;
        }
        public Float getLiverSlice() {
            return this.liverSlice;
        }

        public DetectLiverSteatosisResponseBodyDataDetections setLiverSpleenDifference(Float liverSpleenDifference) {
            this.liverSpleenDifference = liverSpleenDifference;
            return this;
        }
        public Float getLiverSpleenDifference() {
            return this.liverSpleenDifference;
        }

        public DetectLiverSteatosisResponseBodyDataDetections setLiverSpleenRatio(Float liverSpleenRatio) {
            this.liverSpleenRatio = liverSpleenRatio;
            return this;
        }
        public Float getLiverSpleenRatio() {
            return this.liverSpleenRatio;
        }

        public DetectLiverSteatosisResponseBodyDataDetections setLiverVolume(Float liverVolume) {
            this.liverVolume = liverVolume;
            return this;
        }
        public Float getLiverVolume() {
            return this.liverVolume;
        }

        public DetectLiverSteatosisResponseBodyDataDetections setMaossScore(Double maossScore) {
            this.maossScore = maossScore;
            return this;
        }
        public Double getMaossScore() {
            return this.maossScore;
        }

        public DetectLiverSteatosisResponseBodyDataDetections setPrediction(String prediction) {
            this.prediction = prediction;
            return this;
        }
        public String getPrediction() {
            return this.prediction;
        }

        public DetectLiverSteatosisResponseBodyDataDetections setProbability(Float probability) {
            this.probability = probability;
            return this;
        }
        public Float getProbability() {
            return this.probability;
        }

        public DetectLiverSteatosisResponseBodyDataDetections setROI1Center(java.util.List<Long> ROI1Center) {
            this.ROI1Center = ROI1Center;
            return this;
        }
        public java.util.List<Long> getROI1Center() {
            return this.ROI1Center;
        }

        public DetectLiverSteatosisResponseBodyDataDetections setROI2Center(java.util.List<Long> ROI2Center) {
            this.ROI2Center = ROI2Center;
            return this;
        }
        public java.util.List<Long> getROI2Center() {
            return this.ROI2Center;
        }

        public DetectLiverSteatosisResponseBodyDataDetections setROI3Center(java.util.List<Long> ROI3Center) {
            this.ROI3Center = ROI3Center;
            return this;
        }
        public java.util.List<Long> getROI3Center() {
            return this.ROI3Center;
        }

        public DetectLiverSteatosisResponseBodyDataDetections setRadius(Long radius) {
            this.radius = radius;
            return this;
        }
        public Long getRadius() {
            return this.radius;
        }

        public DetectLiverSteatosisResponseBodyDataDetections setSpleenCenter(java.util.List<Long> spleenCenter) {
            this.spleenCenter = spleenCenter;
            return this;
        }
        public java.util.List<Long> getSpleenCenter() {
            return this.spleenCenter;
        }

        public DetectLiverSteatosisResponseBodyDataDetections setSpleenHU(Float spleenHU) {
            this.spleenHU = spleenHU;
            return this;
        }
        public Float getSpleenHU() {
            return this.spleenHU;
        }

        public DetectLiverSteatosisResponseBodyDataDetections setSpleenROI(Float spleenROI) {
            this.spleenROI = spleenROI;
            return this;
        }
        public Float getSpleenROI() {
            return this.spleenROI;
        }

        public DetectLiverSteatosisResponseBodyDataDetections setSpleenSlice(Float spleenSlice) {
            this.spleenSlice = spleenSlice;
            return this;
        }
        public Float getSpleenSlice() {
            return this.spleenSlice;
        }

        public DetectLiverSteatosisResponseBodyDataDetections setSpleenVolume(Float spleenVolume) {
            this.spleenVolume = spleenVolume;
            return this;
        }
        public Float getSpleenVolume() {
            return this.spleenVolume;
        }

    }

    public static class DetectLiverSteatosisResponseBodyData extends TeaModel {
        @NameInMap("Detections")
        public java.util.List<DetectLiverSteatosisResponseBodyDataDetections> detections;

        @NameInMap("Origin")
        public java.util.List<Float> origin;

        @NameInMap("ResultUrl")
        public String resultUrl;

        @NameInMap("Spacing")
        public java.util.List<Float> spacing;

        public static DetectLiverSteatosisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectLiverSteatosisResponseBodyData self = new DetectLiverSteatosisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectLiverSteatosisResponseBodyData setDetections(java.util.List<DetectLiverSteatosisResponseBodyDataDetections> detections) {
            this.detections = detections;
            return this;
        }
        public java.util.List<DetectLiverSteatosisResponseBodyDataDetections> getDetections() {
            return this.detections;
        }

        public DetectLiverSteatosisResponseBodyData setOrigin(java.util.List<Float> origin) {
            this.origin = origin;
            return this;
        }
        public java.util.List<Float> getOrigin() {
            return this.origin;
        }

        public DetectLiverSteatosisResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

        public DetectLiverSteatosisResponseBodyData setSpacing(java.util.List<Float> spacing) {
            this.spacing = spacing;
            return this;
        }
        public java.util.List<Float> getSpacing() {
            return this.spacing;
        }

    }

}
