// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenChestCTResponseBody extends TeaModel {
    @NameInMap("Data")
    public ScreenChestCTResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ScreenChestCTResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScreenChestCTResponseBody self = new ScreenChestCTResponseBody();
        return TeaModel.build(map, self);
    }

    public ScreenChestCTResponseBody setData(ScreenChestCTResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ScreenChestCTResponseBodyData getData() {
        return this.data;
    }

    public ScreenChestCTResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ScreenChestCTResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ScreenChestCTResponseBodyDataAnalyzeChestVesselAortaInfo extends TeaModel {
        /**
         * <p>1</p>
         */
        @NameInMap("Area")
        public java.util.List<Float> area;

        @NameInMap("Coordinates")
        public java.util.List<java.util.List<Float>> coordinates;

        @NameInMap("LabelValue")
        public Long labelValue;

        @NameInMap("MaxArea")
        public Float maxArea;

        @NameInMap("MaxAreaIndex")
        public Long maxAreaIndex;

        @NameInMap("MaxDiameter")
        public Float maxDiameter;

        public static ScreenChestCTResponseBodyDataAnalyzeChestVesselAortaInfo build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataAnalyzeChestVesselAortaInfo self = new ScreenChestCTResponseBodyDataAnalyzeChestVesselAortaInfo();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataAnalyzeChestVesselAortaInfo setArea(java.util.List<Float> area) {
            this.area = area;
            return this;
        }
        public java.util.List<Float> getArea() {
            return this.area;
        }

        public ScreenChestCTResponseBodyDataAnalyzeChestVesselAortaInfo setCoordinates(java.util.List<java.util.List<Float>> coordinates) {
            this.coordinates = coordinates;
            return this;
        }
        public java.util.List<java.util.List<Float>> getCoordinates() {
            return this.coordinates;
        }

        public ScreenChestCTResponseBodyDataAnalyzeChestVesselAortaInfo setLabelValue(Long labelValue) {
            this.labelValue = labelValue;
            return this;
        }
        public Long getLabelValue() {
            return this.labelValue;
        }

        public ScreenChestCTResponseBodyDataAnalyzeChestVesselAortaInfo setMaxArea(Float maxArea) {
            this.maxArea = maxArea;
            return this;
        }
        public Float getMaxArea() {
            return this.maxArea;
        }

        public ScreenChestCTResponseBodyDataAnalyzeChestVesselAortaInfo setMaxAreaIndex(Long maxAreaIndex) {
            this.maxAreaIndex = maxAreaIndex;
            return this;
        }
        public Long getMaxAreaIndex() {
            return this.maxAreaIndex;
        }

        public ScreenChestCTResponseBodyDataAnalyzeChestVesselAortaInfo setMaxDiameter(Float maxDiameter) {
            this.maxDiameter = maxDiameter;
            return this;
        }
        public Float getMaxDiameter() {
            return this.maxDiameter;
        }

    }

    public static class ScreenChestCTResponseBodyDataAnalyzeChestVesselPulmonaryInfo extends TeaModel {
        /**
         * <p>1</p>
         */
        @NameInMap("Area")
        public java.util.List<Float> area;

        @NameInMap("Coordinates")
        public java.util.List<java.util.List<Float>> coordinates;

        @NameInMap("LabelValue")
        public Long labelValue;

        @NameInMap("MaxArea")
        public Float maxArea;

        @NameInMap("MaxAreaIndex")
        public Long maxAreaIndex;

        @NameInMap("MaxDiameter")
        public Float maxDiameter;

        @NameInMap("NearestAortaArea")
        public Float nearestAortaArea;

        public static ScreenChestCTResponseBodyDataAnalyzeChestVesselPulmonaryInfo build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataAnalyzeChestVesselPulmonaryInfo self = new ScreenChestCTResponseBodyDataAnalyzeChestVesselPulmonaryInfo();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataAnalyzeChestVesselPulmonaryInfo setArea(java.util.List<Float> area) {
            this.area = area;
            return this;
        }
        public java.util.List<Float> getArea() {
            return this.area;
        }

        public ScreenChestCTResponseBodyDataAnalyzeChestVesselPulmonaryInfo setCoordinates(java.util.List<java.util.List<Float>> coordinates) {
            this.coordinates = coordinates;
            return this;
        }
        public java.util.List<java.util.List<Float>> getCoordinates() {
            return this.coordinates;
        }

        public ScreenChestCTResponseBodyDataAnalyzeChestVesselPulmonaryInfo setLabelValue(Long labelValue) {
            this.labelValue = labelValue;
            return this;
        }
        public Long getLabelValue() {
            return this.labelValue;
        }

        public ScreenChestCTResponseBodyDataAnalyzeChestVesselPulmonaryInfo setMaxArea(Float maxArea) {
            this.maxArea = maxArea;
            return this;
        }
        public Float getMaxArea() {
            return this.maxArea;
        }

        public ScreenChestCTResponseBodyDataAnalyzeChestVesselPulmonaryInfo setMaxAreaIndex(Long maxAreaIndex) {
            this.maxAreaIndex = maxAreaIndex;
            return this;
        }
        public Long getMaxAreaIndex() {
            return this.maxAreaIndex;
        }

        public ScreenChestCTResponseBodyDataAnalyzeChestVesselPulmonaryInfo setMaxDiameter(Float maxDiameter) {
            this.maxDiameter = maxDiameter;
            return this;
        }
        public Float getMaxDiameter() {
            return this.maxDiameter;
        }

        public ScreenChestCTResponseBodyDataAnalyzeChestVesselPulmonaryInfo setNearestAortaArea(Float nearestAortaArea) {
            this.nearestAortaArea = nearestAortaArea;
            return this;
        }
        public Float getNearestAortaArea() {
            return this.nearestAortaArea;
        }

    }

    public static class ScreenChestCTResponseBodyDataAnalyzeChestVessel extends TeaModel {
        @NameInMap("AortaInfo")
        public ScreenChestCTResponseBodyDataAnalyzeChestVesselAortaInfo aortaInfo;

        @NameInMap("PulmonaryInfo")
        public ScreenChestCTResponseBodyDataAnalyzeChestVesselPulmonaryInfo pulmonaryInfo;

        @NameInMap("ResultURL")
        public String resultURL;

        public static ScreenChestCTResponseBodyDataAnalyzeChestVessel build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataAnalyzeChestVessel self = new ScreenChestCTResponseBodyDataAnalyzeChestVessel();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataAnalyzeChestVessel setAortaInfo(ScreenChestCTResponseBodyDataAnalyzeChestVesselAortaInfo aortaInfo) {
            this.aortaInfo = aortaInfo;
            return this;
        }
        public ScreenChestCTResponseBodyDataAnalyzeChestVesselAortaInfo getAortaInfo() {
            return this.aortaInfo;
        }

        public ScreenChestCTResponseBodyDataAnalyzeChestVessel setPulmonaryInfo(ScreenChestCTResponseBodyDataAnalyzeChestVesselPulmonaryInfo pulmonaryInfo) {
            this.pulmonaryInfo = pulmonaryInfo;
            return this;
        }
        public ScreenChestCTResponseBodyDataAnalyzeChestVesselPulmonaryInfo getPulmonaryInfo() {
            return this.pulmonaryInfo;
        }

        public ScreenChestCTResponseBodyDataAnalyzeChestVessel setResultURL(String resultURL) {
            this.resultURL = resultURL;
            return this;
        }
        public String getResultURL() {
            return this.resultURL;
        }

    }

    public static class ScreenChestCTResponseBodyDataCACSDetections extends TeaModel {
        @NameInMap("CalciumCenter")
        public java.util.List<Long> calciumCenter;

        @NameInMap("CalciumId")
        public Long calciumId;

        @NameInMap("CalciumScore")
        public Float calciumScore;

        @NameInMap("CalciumVolume")
        public Float calciumVolume;

        public static ScreenChestCTResponseBodyDataCACSDetections build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataCACSDetections self = new ScreenChestCTResponseBodyDataCACSDetections();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataCACSDetections setCalciumCenter(java.util.List<Long> calciumCenter) {
            this.calciumCenter = calciumCenter;
            return this;
        }
        public java.util.List<Long> getCalciumCenter() {
            return this.calciumCenter;
        }

        public ScreenChestCTResponseBodyDataCACSDetections setCalciumId(Long calciumId) {
            this.calciumId = calciumId;
            return this;
        }
        public Long getCalciumId() {
            return this.calciumId;
        }

        public ScreenChestCTResponseBodyDataCACSDetections setCalciumScore(Float calciumScore) {
            this.calciumScore = calciumScore;
            return this;
        }
        public Float getCalciumScore() {
            return this.calciumScore;
        }

        public ScreenChestCTResponseBodyDataCACSDetections setCalciumVolume(Float calciumVolume) {
            this.calciumVolume = calciumVolume;
            return this;
        }
        public Float getCalciumVolume() {
            return this.calciumVolume;
        }

    }

    public static class ScreenChestCTResponseBodyDataCACS extends TeaModel {
        @NameInMap("Detections")
        public java.util.List<ScreenChestCTResponseBodyDataCACSDetections> detections;

        @NameInMap("ResultUrl")
        public String resultUrl;

        @NameInMap("Score")
        public String score;

        @NameInMap("SeriesInstanceUID")
        public String seriesInstanceUID;

        @NameInMap("VolumeScore")
        public String volumeScore;

        public static ScreenChestCTResponseBodyDataCACS build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataCACS self = new ScreenChestCTResponseBodyDataCACS();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataCACS setDetections(java.util.List<ScreenChestCTResponseBodyDataCACSDetections> detections) {
            this.detections = detections;
            return this;
        }
        public java.util.List<ScreenChestCTResponseBodyDataCACSDetections> getDetections() {
            return this.detections;
        }

        public ScreenChestCTResponseBodyDataCACS setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

        public ScreenChestCTResponseBodyDataCACS setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public ScreenChestCTResponseBodyDataCACS setSeriesInstanceUID(String seriesInstanceUID) {
            this.seriesInstanceUID = seriesInstanceUID;
            return this;
        }
        public String getSeriesInstanceUID() {
            return this.seriesInstanceUID;
        }

        public ScreenChestCTResponseBodyDataCACS setVolumeScore(String volumeScore) {
            this.volumeScore = volumeScore;
            return this;
        }
        public String getVolumeScore() {
            return this.volumeScore;
        }

    }

    public static class ScreenChestCTResponseBodyDataCalcBMDDetections extends TeaModel {
        @NameInMap("VertBMD")
        public Float vertBMD;

        @NameInMap("VertCategory")
        public Float vertCategory;

        @NameInMap("VertId")
        public String vertId;

        @NameInMap("VertTScore")
        public Float vertTScore;

        @NameInMap("VertZScore")
        public Float vertZScore;

        public static ScreenChestCTResponseBodyDataCalcBMDDetections build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataCalcBMDDetections self = new ScreenChestCTResponseBodyDataCalcBMDDetections();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataCalcBMDDetections setVertBMD(Float vertBMD) {
            this.vertBMD = vertBMD;
            return this;
        }
        public Float getVertBMD() {
            return this.vertBMD;
        }

        public ScreenChestCTResponseBodyDataCalcBMDDetections setVertCategory(Float vertCategory) {
            this.vertCategory = vertCategory;
            return this;
        }
        public Float getVertCategory() {
            return this.vertCategory;
        }

        public ScreenChestCTResponseBodyDataCalcBMDDetections setVertId(String vertId) {
            this.vertId = vertId;
            return this;
        }
        public String getVertId() {
            return this.vertId;
        }

        public ScreenChestCTResponseBodyDataCalcBMDDetections setVertTScore(Float vertTScore) {
            this.vertTScore = vertTScore;
            return this;
        }
        public Float getVertTScore() {
            return this.vertTScore;
        }

        public ScreenChestCTResponseBodyDataCalcBMDDetections setVertZScore(Float vertZScore) {
            this.vertZScore = vertZScore;
            return this;
        }
        public Float getVertZScore() {
            return this.vertZScore;
        }

    }

    public static class ScreenChestCTResponseBodyDataCalcBMD extends TeaModel {
        @NameInMap("Detections")
        public java.util.List<ScreenChestCTResponseBodyDataCalcBMDDetections> detections;

        @NameInMap("Origin")
        public java.util.List<Float> origin;

        @NameInMap("ResultURL")
        public String resultURL;

        @NameInMap("SeriesInstanceUid")
        public String seriesInstanceUid;

        @NameInMap("Spacing")
        public java.util.List<Float> spacing;

        public static ScreenChestCTResponseBodyDataCalcBMD build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataCalcBMD self = new ScreenChestCTResponseBodyDataCalcBMD();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataCalcBMD setDetections(java.util.List<ScreenChestCTResponseBodyDataCalcBMDDetections> detections) {
            this.detections = detections;
            return this;
        }
        public java.util.List<ScreenChestCTResponseBodyDataCalcBMDDetections> getDetections() {
            return this.detections;
        }

        public ScreenChestCTResponseBodyDataCalcBMD setOrigin(java.util.List<Float> origin) {
            this.origin = origin;
            return this;
        }
        public java.util.List<Float> getOrigin() {
            return this.origin;
        }

        public ScreenChestCTResponseBodyDataCalcBMD setResultURL(String resultURL) {
            this.resultURL = resultURL;
            return this;
        }
        public String getResultURL() {
            return this.resultURL;
        }

        public ScreenChestCTResponseBodyDataCalcBMD setSeriesInstanceUid(String seriesInstanceUid) {
            this.seriesInstanceUid = seriesInstanceUid;
            return this;
        }
        public String getSeriesInstanceUid() {
            return this.seriesInstanceUid;
        }

        public ScreenChestCTResponseBodyDataCalcBMD setSpacing(java.util.List<Float> spacing) {
            this.spacing = spacing;
            return this;
        }
        public java.util.List<Float> getSpacing() {
            return this.spacing;
        }

    }

    public static class ScreenChestCTResponseBodyDataCovid extends TeaModel {
        @NameInMap("LesionRatio")
        public String lesionRatio;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("NewProbability")
        public String newProbability;

        @NameInMap("NormalProbability")
        public String normalProbability;

        @NameInMap("OtherProbability")
        public String otherProbability;

        @NameInMap("SeriesInstanceUID")
        public String seriesInstanceUID;

        public static ScreenChestCTResponseBodyDataCovid build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataCovid self = new ScreenChestCTResponseBodyDataCovid();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataCovid setLesionRatio(String lesionRatio) {
            this.lesionRatio = lesionRatio;
            return this;
        }
        public String getLesionRatio() {
            return this.lesionRatio;
        }

        public ScreenChestCTResponseBodyDataCovid setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public ScreenChestCTResponseBodyDataCovid setNewProbability(String newProbability) {
            this.newProbability = newProbability;
            return this;
        }
        public String getNewProbability() {
            return this.newProbability;
        }

        public ScreenChestCTResponseBodyDataCovid setNormalProbability(String normalProbability) {
            this.normalProbability = normalProbability;
            return this;
        }
        public String getNormalProbability() {
            return this.normalProbability;
        }

        public ScreenChestCTResponseBodyDataCovid setOtherProbability(String otherProbability) {
            this.otherProbability = otherProbability;
            return this;
        }
        public String getOtherProbability() {
            return this.otherProbability;
        }

        public ScreenChestCTResponseBodyDataCovid setSeriesInstanceUID(String seriesInstanceUID) {
            this.seriesInstanceUID = seriesInstanceUID;
            return this;
        }
        public String getSeriesInstanceUID() {
            return this.seriesInstanceUID;
        }

    }

    public static class ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections extends TeaModel {
        @NameInMap("LiverHU")
        public Float liverHU;

        @NameInMap("LiverROI1")
        public Float liverROI1;

        @NameInMap("LiverROI2")
        public Float liverROI2;

        @NameInMap("LiverROI3")
        public Float liverROI3;

        @NameInMap("LiverSlice")
        public Float liverSlice;

        @NameInMap("LiverSpleenDifference")
        public Float liverSpleenDifference;

        @NameInMap("LiverSpleenRatio")
        public Float liverSpleenRatio;

        @NameInMap("LiverVolume")
        public Float liverVolume;

        @NameInMap("Prediction")
        public String prediction;

        @NameInMap("Probability")
        public Float probability;

        @NameInMap("ROI1Center")
        public java.util.List<Long> ROI1Center;

        @NameInMap("ROI2Center")
        public java.util.List<Long> ROI2Center;

        @NameInMap("ROI3Center")
        public java.util.List<Long> ROI3Center;

        @NameInMap("Radius")
        public Long radius;

        @NameInMap("SpleenCenter")
        public java.util.List<Long> spleenCenter;

        @NameInMap("SpleenHU")
        public Float spleenHU;

        @NameInMap("SpleenROI")
        public Float spleenROI;

        @NameInMap("SpleenSlice")
        public Float spleenSlice;

        @NameInMap("SpleenVolume")
        public Float spleenVolume;

        public static ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections self = new ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setLiverHU(Float liverHU) {
            this.liverHU = liverHU;
            return this;
        }
        public Float getLiverHU() {
            return this.liverHU;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setLiverROI1(Float liverROI1) {
            this.liverROI1 = liverROI1;
            return this;
        }
        public Float getLiverROI1() {
            return this.liverROI1;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setLiverROI2(Float liverROI2) {
            this.liverROI2 = liverROI2;
            return this;
        }
        public Float getLiverROI2() {
            return this.liverROI2;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setLiverROI3(Float liverROI3) {
            this.liverROI3 = liverROI3;
            return this;
        }
        public Float getLiverROI3() {
            return this.liverROI3;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setLiverSlice(Float liverSlice) {
            this.liverSlice = liverSlice;
            return this;
        }
        public Float getLiverSlice() {
            return this.liverSlice;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setLiverSpleenDifference(Float liverSpleenDifference) {
            this.liverSpleenDifference = liverSpleenDifference;
            return this;
        }
        public Float getLiverSpleenDifference() {
            return this.liverSpleenDifference;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setLiverSpleenRatio(Float liverSpleenRatio) {
            this.liverSpleenRatio = liverSpleenRatio;
            return this;
        }
        public Float getLiverSpleenRatio() {
            return this.liverSpleenRatio;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setLiverVolume(Float liverVolume) {
            this.liverVolume = liverVolume;
            return this;
        }
        public Float getLiverVolume() {
            return this.liverVolume;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setPrediction(String prediction) {
            this.prediction = prediction;
            return this;
        }
        public String getPrediction() {
            return this.prediction;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setProbability(Float probability) {
            this.probability = probability;
            return this;
        }
        public Float getProbability() {
            return this.probability;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setROI1Center(java.util.List<Long> ROI1Center) {
            this.ROI1Center = ROI1Center;
            return this;
        }
        public java.util.List<Long> getROI1Center() {
            return this.ROI1Center;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setROI2Center(java.util.List<Long> ROI2Center) {
            this.ROI2Center = ROI2Center;
            return this;
        }
        public java.util.List<Long> getROI2Center() {
            return this.ROI2Center;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setROI3Center(java.util.List<Long> ROI3Center) {
            this.ROI3Center = ROI3Center;
            return this;
        }
        public java.util.List<Long> getROI3Center() {
            return this.ROI3Center;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setRadius(Long radius) {
            this.radius = radius;
            return this;
        }
        public Long getRadius() {
            return this.radius;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setSpleenCenter(java.util.List<Long> spleenCenter) {
            this.spleenCenter = spleenCenter;
            return this;
        }
        public java.util.List<Long> getSpleenCenter() {
            return this.spleenCenter;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setSpleenHU(Float spleenHU) {
            this.spleenHU = spleenHU;
            return this;
        }
        public Float getSpleenHU() {
            return this.spleenHU;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setSpleenROI(Float spleenROI) {
            this.spleenROI = spleenROI;
            return this;
        }
        public Float getSpleenROI() {
            return this.spleenROI;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setSpleenSlice(Float spleenSlice) {
            this.spleenSlice = spleenSlice;
            return this;
        }
        public Float getSpleenSlice() {
            return this.spleenSlice;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setSpleenVolume(Float spleenVolume) {
            this.spleenVolume = spleenVolume;
            return this;
        }
        public Float getSpleenVolume() {
            return this.spleenVolume;
        }

    }

    public static class ScreenChestCTResponseBodyDataDetectLiverSteatosis extends TeaModel {
        @NameInMap("Detections")
        public java.util.List<ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections> detections;

        @NameInMap("Origin")
        public java.util.List<Float> origin;

        @NameInMap("SeriesInstanceUid")
        public String seriesInstanceUid;

        @NameInMap("Spacing")
        public java.util.List<Float> spacing;

        public static ScreenChestCTResponseBodyDataDetectLiverSteatosis build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataDetectLiverSteatosis self = new ScreenChestCTResponseBodyDataDetectLiverSteatosis();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosis setDetections(java.util.List<ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections> detections) {
            this.detections = detections;
            return this;
        }
        public java.util.List<ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections> getDetections() {
            return this.detections;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosis setOrigin(java.util.List<Float> origin) {
            this.origin = origin;
            return this;
        }
        public java.util.List<Float> getOrigin() {
            return this.origin;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosis setSeriesInstanceUid(String seriesInstanceUid) {
            this.seriesInstanceUid = seriesInstanceUid;
            return this;
        }
        public String getSeriesInstanceUid() {
            return this.seriesInstanceUid;
        }

        public ScreenChestCTResponseBodyDataDetectLiverSteatosis setSpacing(java.util.List<Float> spacing) {
            this.spacing = spacing;
            return this;
        }
        public java.util.List<Float> getSpacing() {
            return this.spacing;
        }

    }

    public static class ScreenChestCTResponseBodyDataDetectLymphLesions extends TeaModel {
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

        public static ScreenChestCTResponseBodyDataDetectLymphLesions build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataDetectLymphLesions self = new ScreenChestCTResponseBodyDataDetectLymphLesions();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataDetectLymphLesions setBoxes(java.util.List<Float> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<Float> getBoxes() {
            return this.boxes;
        }

        public ScreenChestCTResponseBodyDataDetectLymphLesions setDiametermm(java.util.List<Float> diametermm) {
            this.diametermm = diametermm;
            return this;
        }
        public java.util.List<Float> getDiametermm() {
            return this.diametermm;
        }

        public ScreenChestCTResponseBodyDataDetectLymphLesions setKeySlice(Long keySlice) {
            this.keySlice = keySlice;
            return this;
        }
        public Long getKeySlice() {
            return this.keySlice;
        }

        public ScreenChestCTResponseBodyDataDetectLymphLesions setRecist(java.util.List<java.util.List<Float>> recist) {
            this.recist = recist;
            return this;
        }
        public java.util.List<java.util.List<Float>> getRecist() {
            return this.recist;
        }

        public ScreenChestCTResponseBodyDataDetectLymphLesions setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class ScreenChestCTResponseBodyDataDetectLymph extends TeaModel {
        @NameInMap("Lesions")
        public java.util.List<ScreenChestCTResponseBodyDataDetectLymphLesions> lesions;

        @NameInMap("SeriesInstanceUID")
        public String seriesInstanceUID;

        public static ScreenChestCTResponseBodyDataDetectLymph build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataDetectLymph self = new ScreenChestCTResponseBodyDataDetectLymph();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataDetectLymph setLesions(java.util.List<ScreenChestCTResponseBodyDataDetectLymphLesions> lesions) {
            this.lesions = lesions;
            return this;
        }
        public java.util.List<ScreenChestCTResponseBodyDataDetectLymphLesions> getLesions() {
            return this.lesions;
        }

        public ScreenChestCTResponseBodyDataDetectLymph setSeriesInstanceUID(String seriesInstanceUID) {
            this.seriesInstanceUID = seriesInstanceUID;
            return this;
        }
        public String getSeriesInstanceUID() {
            return this.seriesInstanceUID;
        }

    }

    public static class ScreenChestCTResponseBodyDataDetectPdacLesion extends TeaModel {
        @NameInMap("Mask")
        public String mask;

        @NameInMap("NonPdacVol")
        public String nonPdacVol;

        @NameInMap("PancVol")
        public String pancVol;

        @NameInMap("PdacVol")
        public String pdacVol;

        @NameInMap("Possibilities")
        public java.util.List<String> possibilities;

        public static ScreenChestCTResponseBodyDataDetectPdacLesion build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataDetectPdacLesion self = new ScreenChestCTResponseBodyDataDetectPdacLesion();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataDetectPdacLesion setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public ScreenChestCTResponseBodyDataDetectPdacLesion setNonPdacVol(String nonPdacVol) {
            this.nonPdacVol = nonPdacVol;
            return this;
        }
        public String getNonPdacVol() {
            return this.nonPdacVol;
        }

        public ScreenChestCTResponseBodyDataDetectPdacLesion setPancVol(String pancVol) {
            this.pancVol = pancVol;
            return this;
        }
        public String getPancVol() {
            return this.pancVol;
        }

        public ScreenChestCTResponseBodyDataDetectPdacLesion setPdacVol(String pdacVol) {
            this.pdacVol = pdacVol;
            return this;
        }
        public String getPdacVol() {
            return this.pdacVol;
        }

        public ScreenChestCTResponseBodyDataDetectPdacLesion setPossibilities(java.util.List<String> possibilities) {
            this.possibilities = possibilities;
            return this;
        }
        public java.util.List<String> getPossibilities() {
            return this.possibilities;
        }

    }

    public static class ScreenChestCTResponseBodyDataDetectPdac extends TeaModel {
        @NameInMap("Lesion")
        public ScreenChestCTResponseBodyDataDetectPdacLesion lesion;

        @NameInMap("SeriesInstanceUID")
        public String seriesInstanceUID;

        public static ScreenChestCTResponseBodyDataDetectPdac build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataDetectPdac self = new ScreenChestCTResponseBodyDataDetectPdac();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataDetectPdac setLesion(ScreenChestCTResponseBodyDataDetectPdacLesion lesion) {
            this.lesion = lesion;
            return this;
        }
        public ScreenChestCTResponseBodyDataDetectPdacLesion getLesion() {
            return this.lesion;
        }

        public ScreenChestCTResponseBodyDataDetectPdac setSeriesInstanceUID(String seriesInstanceUID) {
            this.seriesInstanceUID = seriesInstanceUID;
            return this;
        }
        public String getSeriesInstanceUID() {
            return this.seriesInstanceUID;
        }

    }

    public static class ScreenChestCTResponseBodyDataDetectRibFractureDetections extends TeaModel {
        @NameInMap("CoordinateImage")
        public java.util.List<Long> coordinateImage;

        @NameInMap("Coordinates")
        public java.util.List<Long> coordinates;

        @NameInMap("FracSOPInstanceUID")
        public String fracSOPInstanceUID;

        @NameInMap("FractureCategory")
        public Long fractureCategory;

        @NameInMap("FractureConfidence")
        public Float fractureConfidence;

        @NameInMap("FractureId")
        public Long fractureId;

        @NameInMap("FractureLocation")
        public String fractureLocation;

        @NameInMap("FractureSegment")
        public Long fractureSegment;

        public static ScreenChestCTResponseBodyDataDetectRibFractureDetections build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataDetectRibFractureDetections self = new ScreenChestCTResponseBodyDataDetectRibFractureDetections();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataDetectRibFractureDetections setCoordinateImage(java.util.List<Long> coordinateImage) {
            this.coordinateImage = coordinateImage;
            return this;
        }
        public java.util.List<Long> getCoordinateImage() {
            return this.coordinateImage;
        }

        public ScreenChestCTResponseBodyDataDetectRibFractureDetections setCoordinates(java.util.List<Long> coordinates) {
            this.coordinates = coordinates;
            return this;
        }
        public java.util.List<Long> getCoordinates() {
            return this.coordinates;
        }

        public ScreenChestCTResponseBodyDataDetectRibFractureDetections setFracSOPInstanceUID(String fracSOPInstanceUID) {
            this.fracSOPInstanceUID = fracSOPInstanceUID;
            return this;
        }
        public String getFracSOPInstanceUID() {
            return this.fracSOPInstanceUID;
        }

        public ScreenChestCTResponseBodyDataDetectRibFractureDetections setFractureCategory(Long fractureCategory) {
            this.fractureCategory = fractureCategory;
            return this;
        }
        public Long getFractureCategory() {
            return this.fractureCategory;
        }

        public ScreenChestCTResponseBodyDataDetectRibFractureDetections setFractureConfidence(Float fractureConfidence) {
            this.fractureConfidence = fractureConfidence;
            return this;
        }
        public Float getFractureConfidence() {
            return this.fractureConfidence;
        }

        public ScreenChestCTResponseBodyDataDetectRibFractureDetections setFractureId(Long fractureId) {
            this.fractureId = fractureId;
            return this;
        }
        public Long getFractureId() {
            return this.fractureId;
        }

        public ScreenChestCTResponseBodyDataDetectRibFractureDetections setFractureLocation(String fractureLocation) {
            this.fractureLocation = fractureLocation;
            return this;
        }
        public String getFractureLocation() {
            return this.fractureLocation;
        }

        public ScreenChestCTResponseBodyDataDetectRibFractureDetections setFractureSegment(Long fractureSegment) {
            this.fractureSegment = fractureSegment;
            return this;
        }
        public Long getFractureSegment() {
            return this.fractureSegment;
        }

    }

    public static class ScreenChestCTResponseBodyDataDetectRibFracture extends TeaModel {
        @NameInMap("Detections")
        public java.util.List<ScreenChestCTResponseBodyDataDetectRibFractureDetections> detections;

        @NameInMap("FractureMaskURL")
        public String fractureMaskURL;

        @NameInMap("Origin")
        public java.util.List<Float> origin;

        @NameInMap("ResultURL")
        public String resultURL;

        @NameInMap("RibSegmentMaskURL")
        public String ribSegmentMaskURL;

        @NameInMap("SeriesInstanceUID")
        public String seriesInstanceUID;

        @NameInMap("Spacing")
        public java.util.List<Float> spacing;

        public static ScreenChestCTResponseBodyDataDetectRibFracture build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataDetectRibFracture self = new ScreenChestCTResponseBodyDataDetectRibFracture();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataDetectRibFracture setDetections(java.util.List<ScreenChestCTResponseBodyDataDetectRibFractureDetections> detections) {
            this.detections = detections;
            return this;
        }
        public java.util.List<ScreenChestCTResponseBodyDataDetectRibFractureDetections> getDetections() {
            return this.detections;
        }

        public ScreenChestCTResponseBodyDataDetectRibFracture setFractureMaskURL(String fractureMaskURL) {
            this.fractureMaskURL = fractureMaskURL;
            return this;
        }
        public String getFractureMaskURL() {
            return this.fractureMaskURL;
        }

        public ScreenChestCTResponseBodyDataDetectRibFracture setOrigin(java.util.List<Float> origin) {
            this.origin = origin;
            return this;
        }
        public java.util.List<Float> getOrigin() {
            return this.origin;
        }

        public ScreenChestCTResponseBodyDataDetectRibFracture setResultURL(String resultURL) {
            this.resultURL = resultURL;
            return this;
        }
        public String getResultURL() {
            return this.resultURL;
        }

        public ScreenChestCTResponseBodyDataDetectRibFracture setRibSegmentMaskURL(String ribSegmentMaskURL) {
            this.ribSegmentMaskURL = ribSegmentMaskURL;
            return this;
        }
        public String getRibSegmentMaskURL() {
            return this.ribSegmentMaskURL;
        }

        public ScreenChestCTResponseBodyDataDetectRibFracture setSeriesInstanceUID(String seriesInstanceUID) {
            this.seriesInstanceUID = seriesInstanceUID;
            return this;
        }
        public String getSeriesInstanceUID() {
            return this.seriesInstanceUID;
        }

        public ScreenChestCTResponseBodyDataDetectRibFracture setSpacing(java.util.List<Float> spacing) {
            this.spacing = spacing;
            return this;
        }
        public java.util.List<Float> getSpacing() {
            return this.spacing;
        }

    }

    public static class ScreenChestCTResponseBodyDataLungNoduleSeriesElements extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Diameter")
        public Float diameter;

        @NameInMap("ImageX")
        public Float imageX;

        @NameInMap("ImageY")
        public Float imageY;

        @NameInMap("ImageZ")
        public Float imageZ;

        @NameInMap("Lobe")
        public String lobe;

        @NameInMap("Lung")
        public String lung;

        @NameInMap("MajorAxis")
        public java.util.List<Float> majorAxis;

        @NameInMap("MeanValue")
        public Float meanValue;

        @NameInMap("MinorAxis")
        public java.util.List<Float> minorAxis;

        @NameInMap("RecistSOPInstanceUID")
        public String recistSOPInstanceUID;

        @NameInMap("Risk")
        public Float risk;

        @NameInMap("SOPInstanceUID")
        public String SOPInstanceUID;

        @NameInMap("Volume")
        public Float volume;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        @NameInMap("Z")
        public Float z;

        public static ScreenChestCTResponseBodyDataLungNoduleSeriesElements build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataLungNoduleSeriesElements self = new ScreenChestCTResponseBodyDataLungNoduleSeriesElements();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setDiameter(Float diameter) {
            this.diameter = diameter;
            return this;
        }
        public Float getDiameter() {
            return this.diameter;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setImageX(Float imageX) {
            this.imageX = imageX;
            return this;
        }
        public Float getImageX() {
            return this.imageX;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setImageY(Float imageY) {
            this.imageY = imageY;
            return this;
        }
        public Float getImageY() {
            return this.imageY;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setImageZ(Float imageZ) {
            this.imageZ = imageZ;
            return this;
        }
        public Float getImageZ() {
            return this.imageZ;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setLobe(String lobe) {
            this.lobe = lobe;
            return this;
        }
        public String getLobe() {
            return this.lobe;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setLung(String lung) {
            this.lung = lung;
            return this;
        }
        public String getLung() {
            return this.lung;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setMajorAxis(java.util.List<Float> majorAxis) {
            this.majorAxis = majorAxis;
            return this;
        }
        public java.util.List<Float> getMajorAxis() {
            return this.majorAxis;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setMeanValue(Float meanValue) {
            this.meanValue = meanValue;
            return this;
        }
        public Float getMeanValue() {
            return this.meanValue;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setMinorAxis(java.util.List<Float> minorAxis) {
            this.minorAxis = minorAxis;
            return this;
        }
        public java.util.List<Float> getMinorAxis() {
            return this.minorAxis;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setRecistSOPInstanceUID(String recistSOPInstanceUID) {
            this.recistSOPInstanceUID = recistSOPInstanceUID;
            return this;
        }
        public String getRecistSOPInstanceUID() {
            return this.recistSOPInstanceUID;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setRisk(Float risk) {
            this.risk = risk;
            return this;
        }
        public Float getRisk() {
            return this.risk;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setSOPInstanceUID(String SOPInstanceUID) {
            this.SOPInstanceUID = SOPInstanceUID;
            return this;
        }
        public String getSOPInstanceUID() {
            return this.SOPInstanceUID;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setVolume(Float volume) {
            this.volume = volume;
            return this;
        }
        public Float getVolume() {
            return this.volume;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setZ(Float z) {
            this.z = z;
            return this;
        }
        public Float getZ() {
            return this.z;
        }

    }

    public static class ScreenChestCTResponseBodyDataLungNoduleSeries extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<ScreenChestCTResponseBodyDataLungNoduleSeriesElements> elements;

        @NameInMap("Origin")
        public java.util.List<Float> origin;

        @NameInMap("Report")
        public String report;

        @NameInMap("SeriesInstanceUid")
        public String seriesInstanceUid;

        @NameInMap("Spacing")
        public java.util.List<Float> spacing;

        public static ScreenChestCTResponseBodyDataLungNoduleSeries build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataLungNoduleSeries self = new ScreenChestCTResponseBodyDataLungNoduleSeries();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeries setElements(java.util.List<ScreenChestCTResponseBodyDataLungNoduleSeriesElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<ScreenChestCTResponseBodyDataLungNoduleSeriesElements> getElements() {
            return this.elements;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeries setOrigin(java.util.List<Float> origin) {
            this.origin = origin;
            return this;
        }
        public java.util.List<Float> getOrigin() {
            return this.origin;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeries setReport(String report) {
            this.report = report;
            return this;
        }
        public String getReport() {
            return this.report;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeries setSeriesInstanceUid(String seriesInstanceUid) {
            this.seriesInstanceUid = seriesInstanceUid;
            return this;
        }
        public String getSeriesInstanceUid() {
            return this.seriesInstanceUid;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeries setSpacing(java.util.List<Float> spacing) {
            this.spacing = spacing;
            return this;
        }
        public java.util.List<Float> getSpacing() {
            return this.spacing;
        }

    }

    public static class ScreenChestCTResponseBodyDataLungNodule extends TeaModel {
        @NameInMap("Series")
        public java.util.List<ScreenChestCTResponseBodyDataLungNoduleSeries> series;

        public static ScreenChestCTResponseBodyDataLungNodule build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataLungNodule self = new ScreenChestCTResponseBodyDataLungNodule();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataLungNodule setSeries(java.util.List<ScreenChestCTResponseBodyDataLungNoduleSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<ScreenChestCTResponseBodyDataLungNoduleSeries> getSeries() {
            return this.series;
        }

    }

    public static class ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore extends TeaModel {
        @NameInMap("AortaCalciumScore")
        public java.util.List<Double> aortaCalciumScore;

        @NameInMap("AortaCalciumVolume")
        public java.util.List<Double> aortaCalciumVolume;

        @NameInMap("AscAoMaxDiam")
        public java.util.List<Double> ascAoMaxDiam;

        @NameInMap("AscendAortaLength")
        public java.util.List<Double> ascendAortaLength;

        @NameInMap("CardioThoracicRatio")
        public java.util.List<Double> cardioThoracicRatio;

        @NameInMap("CoronaryCalciumVol")
        public java.util.List<Double> coronaryCalciumVol;

        @NameInMap("DeepFeature")
        public java.util.List<Double> deepFeature;

        @NameInMap("EatHUMean")
        public java.util.List<Double> eatHUMean;

        @NameInMap("EatHUSTD")
        public java.util.List<Double> eatHUSTD;

        @NameInMap("EatVolume")
        public java.util.List<Double> eatVolume;

        @NameInMap("LeftLungLowattRatio")
        public java.util.List<Double> leftLungLowattRatio;

        @NameInMap("MyoEpiRatio")
        public java.util.List<Double> myoEpiRatio;

        @NameInMap("RightLungLowattRatio")
        public java.util.List<Double> rightLungLowattRatio;

        public static ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore self = new ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setAortaCalciumScore(java.util.List<Double> aortaCalciumScore) {
            this.aortaCalciumScore = aortaCalciumScore;
            return this;
        }
        public java.util.List<Double> getAortaCalciumScore() {
            return this.aortaCalciumScore;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setAortaCalciumVolume(java.util.List<Double> aortaCalciumVolume) {
            this.aortaCalciumVolume = aortaCalciumVolume;
            return this;
        }
        public java.util.List<Double> getAortaCalciumVolume() {
            return this.aortaCalciumVolume;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setAscAoMaxDiam(java.util.List<Double> ascAoMaxDiam) {
            this.ascAoMaxDiam = ascAoMaxDiam;
            return this;
        }
        public java.util.List<Double> getAscAoMaxDiam() {
            return this.ascAoMaxDiam;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setAscendAortaLength(java.util.List<Double> ascendAortaLength) {
            this.ascendAortaLength = ascendAortaLength;
            return this;
        }
        public java.util.List<Double> getAscendAortaLength() {
            return this.ascendAortaLength;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setCardioThoracicRatio(java.util.List<Double> cardioThoracicRatio) {
            this.cardioThoracicRatio = cardioThoracicRatio;
            return this;
        }
        public java.util.List<Double> getCardioThoracicRatio() {
            return this.cardioThoracicRatio;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setCoronaryCalciumVol(java.util.List<Double> coronaryCalciumVol) {
            this.coronaryCalciumVol = coronaryCalciumVol;
            return this;
        }
        public java.util.List<Double> getCoronaryCalciumVol() {
            return this.coronaryCalciumVol;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setDeepFeature(java.util.List<Double> deepFeature) {
            this.deepFeature = deepFeature;
            return this;
        }
        public java.util.List<Double> getDeepFeature() {
            return this.deepFeature;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setEatHUMean(java.util.List<Double> eatHUMean) {
            this.eatHUMean = eatHUMean;
            return this;
        }
        public java.util.List<Double> getEatHUMean() {
            return this.eatHUMean;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setEatHUSTD(java.util.List<Double> eatHUSTD) {
            this.eatHUSTD = eatHUSTD;
            return this;
        }
        public java.util.List<Double> getEatHUSTD() {
            return this.eatHUSTD;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setEatVolume(java.util.List<Double> eatVolume) {
            this.eatVolume = eatVolume;
            return this;
        }
        public java.util.List<Double> getEatVolume() {
            return this.eatVolume;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setLeftLungLowattRatio(java.util.List<Double> leftLungLowattRatio) {
            this.leftLungLowattRatio = leftLungLowattRatio;
            return this;
        }
        public java.util.List<Double> getLeftLungLowattRatio() {
            return this.leftLungLowattRatio;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setMyoEpiRatio(java.util.List<Double> myoEpiRatio) {
            this.myoEpiRatio = myoEpiRatio;
            return this;
        }
        public java.util.List<Double> getMyoEpiRatio() {
            return this.myoEpiRatio;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setRightLungLowattRatio(java.util.List<Double> rightLungLowattRatio) {
            this.rightLungLowattRatio = rightLungLowattRatio;
            return this;
        }
        public java.util.List<Double> getRightLungLowattRatio() {
            return this.rightLungLowattRatio;
        }

    }

    public static class ScreenChestCTResponseBodyDataPredictCVDLesion extends TeaModel {
        @NameInMap("CVDProbability")
        public Double CVDProbability;

        @NameInMap("FeatureScore")
        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore featureScore;

        @NameInMap("ResultURL")
        public java.util.List<String> resultURL;

        public static ScreenChestCTResponseBodyDataPredictCVDLesion build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataPredictCVDLesion self = new ScreenChestCTResponseBodyDataPredictCVDLesion();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesion setCVDProbability(Double CVDProbability) {
            this.CVDProbability = CVDProbability;
            return this;
        }
        public Double getCVDProbability() {
            return this.CVDProbability;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesion setFeatureScore(ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore featureScore) {
            this.featureScore = featureScore;
            return this;
        }
        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore getFeatureScore() {
            return this.featureScore;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesion setResultURL(java.util.List<String> resultURL) {
            this.resultURL = resultURL;
            return this;
        }
        public java.util.List<String> getResultURL() {
            return this.resultURL;
        }

    }

    public static class ScreenChestCTResponseBodyDataPredictCVD extends TeaModel {
        @NameInMap("Lesion")
        public ScreenChestCTResponseBodyDataPredictCVDLesion lesion;

        @NameInMap("SeriesInstanceUid")
        public String seriesInstanceUid;

        public static ScreenChestCTResponseBodyDataPredictCVD build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataPredictCVD self = new ScreenChestCTResponseBodyDataPredictCVD();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataPredictCVD setLesion(ScreenChestCTResponseBodyDataPredictCVDLesion lesion) {
            this.lesion = lesion;
            return this;
        }
        public ScreenChestCTResponseBodyDataPredictCVDLesion getLesion() {
            return this.lesion;
        }

        public ScreenChestCTResponseBodyDataPredictCVD setSeriesInstanceUid(String seriesInstanceUid) {
            this.seriesInstanceUid = seriesInstanceUid;
            return this;
        }
        public String getSeriesInstanceUid() {
            return this.seriesInstanceUid;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenCRCLesion extends TeaModel {
        @NameInMap("ColorectumVolume")
        public String colorectumVolume;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("Probabilities")
        public java.util.List<String> probabilities;

        public static ScreenChestCTResponseBodyDataScreenCRCLesion build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenCRCLesion self = new ScreenChestCTResponseBodyDataScreenCRCLesion();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenCRCLesion setColorectumVolume(String colorectumVolume) {
            this.colorectumVolume = colorectumVolume;
            return this;
        }
        public String getColorectumVolume() {
            return this.colorectumVolume;
        }

        public ScreenChestCTResponseBodyDataScreenCRCLesion setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public ScreenChestCTResponseBodyDataScreenCRCLesion setProbabilities(java.util.List<String> probabilities) {
            this.probabilities = probabilities;
            return this;
        }
        public java.util.List<String> getProbabilities() {
            return this.probabilities;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenCRC extends TeaModel {
        @NameInMap("Lesion")
        public ScreenChestCTResponseBodyDataScreenCRCLesion lesion;

        @NameInMap("SeriesInstanceUid")
        public String seriesInstanceUid;

        public static ScreenChestCTResponseBodyDataScreenCRC build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenCRC self = new ScreenChestCTResponseBodyDataScreenCRC();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenCRC setLesion(ScreenChestCTResponseBodyDataScreenCRCLesion lesion) {
            this.lesion = lesion;
            return this;
        }
        public ScreenChestCTResponseBodyDataScreenCRCLesion getLesion() {
            return this.lesion;
        }

        public ScreenChestCTResponseBodyDataScreenCRC setSeriesInstanceUid(String seriesInstanceUid) {
            this.seriesInstanceUid = seriesInstanceUid;
            return this;
        }
        public String getSeriesInstanceUid() {
            return this.seriesInstanceUid;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenEcLesion extends TeaModel {
        @NameInMap("BenignVolume")
        public String benignVolume;

        @NameInMap("EcVolume")
        public String ecVolume;

        @NameInMap("EsoVolume")
        public String esoVolume;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("Possibilities")
        public java.util.List<String> possibilities;

        public static ScreenChestCTResponseBodyDataScreenEcLesion build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenEcLesion self = new ScreenChestCTResponseBodyDataScreenEcLesion();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenEcLesion setBenignVolume(String benignVolume) {
            this.benignVolume = benignVolume;
            return this;
        }
        public String getBenignVolume() {
            return this.benignVolume;
        }

        public ScreenChestCTResponseBodyDataScreenEcLesion setEcVolume(String ecVolume) {
            this.ecVolume = ecVolume;
            return this;
        }
        public String getEcVolume() {
            return this.ecVolume;
        }

        public ScreenChestCTResponseBodyDataScreenEcLesion setEsoVolume(String esoVolume) {
            this.esoVolume = esoVolume;
            return this;
        }
        public String getEsoVolume() {
            return this.esoVolume;
        }

        public ScreenChestCTResponseBodyDataScreenEcLesion setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public ScreenChestCTResponseBodyDataScreenEcLesion setPossibilities(java.util.List<String> possibilities) {
            this.possibilities = possibilities;
            return this;
        }
        public java.util.List<String> getPossibilities() {
            return this.possibilities;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenEc extends TeaModel {
        @NameInMap("Lesion")
        public ScreenChestCTResponseBodyDataScreenEcLesion lesion;

        @NameInMap("SeriesInstanceUid")
        public String seriesInstanceUid;

        public static ScreenChestCTResponseBodyDataScreenEc build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenEc self = new ScreenChestCTResponseBodyDataScreenEc();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenEc setLesion(ScreenChestCTResponseBodyDataScreenEcLesion lesion) {
            this.lesion = lesion;
            return this;
        }
        public ScreenChestCTResponseBodyDataScreenEcLesion getLesion() {
            return this.lesion;
        }

        public ScreenChestCTResponseBodyDataScreenEc setSeriesInstanceUid(String seriesInstanceUid) {
            this.seriesInstanceUid = seriesInstanceUid;
            return this;
        }
        public String getSeriesInstanceUid() {
            return this.seriesInstanceUid;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenGCLesion extends TeaModel {
        @NameInMap("GCVolume")
        public String GCVolume;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("NonGCVolume")
        public String nonGCVolume;

        @NameInMap("Probabilities")
        public java.util.List<String> probabilities;

        @NameInMap("StomachVolume")
        public String stomachVolume;

        public static ScreenChestCTResponseBodyDataScreenGCLesion build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenGCLesion self = new ScreenChestCTResponseBodyDataScreenGCLesion();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenGCLesion setGCVolume(String GCVolume) {
            this.GCVolume = GCVolume;
            return this;
        }
        public String getGCVolume() {
            return this.GCVolume;
        }

        public ScreenChestCTResponseBodyDataScreenGCLesion setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public ScreenChestCTResponseBodyDataScreenGCLesion setNonGCVolume(String nonGCVolume) {
            this.nonGCVolume = nonGCVolume;
            return this;
        }
        public String getNonGCVolume() {
            return this.nonGCVolume;
        }

        public ScreenChestCTResponseBodyDataScreenGCLesion setProbabilities(java.util.List<String> probabilities) {
            this.probabilities = probabilities;
            return this;
        }
        public java.util.List<String> getProbabilities() {
            return this.probabilities;
        }

        public ScreenChestCTResponseBodyDataScreenGCLesion setStomachVolume(String stomachVolume) {
            this.stomachVolume = stomachVolume;
            return this;
        }
        public String getStomachVolume() {
            return this.stomachVolume;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenGC extends TeaModel {
        @NameInMap("Lesion")
        public ScreenChestCTResponseBodyDataScreenGCLesion lesion;

        @NameInMap("SeriesInstanceUid")
        public String seriesInstanceUid;

        public static ScreenChestCTResponseBodyDataScreenGC build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenGC self = new ScreenChestCTResponseBodyDataScreenGC();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenGC setLesion(ScreenChestCTResponseBodyDataScreenGCLesion lesion) {
            this.lesion = lesion;
            return this;
        }
        public ScreenChestCTResponseBodyDataScreenGCLesion getLesion() {
            return this.lesion;
        }

        public ScreenChestCTResponseBodyDataScreenGC setSeriesInstanceUid(String seriesInstanceUid) {
            this.seriesInstanceUid = seriesInstanceUid;
            return this;
        }
        public String getSeriesInstanceUid() {
            return this.seriesInstanceUid;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenLCLesionLesionList extends TeaModel {
        @NameInMap("Diameter")
        public java.util.List<Float> diameter;

        @NameInMap("KeySlice")
        public Long keySlice;

        @NameInMap("Malignancy")
        public Float malignancy;

        @NameInMap("RecistEndpoints")
        public java.util.List<Float> recistEndpoints;

        @NameInMap("Type")
        public String type;

        @NameInMap("Volume")
        public Float volume;

        public static ScreenChestCTResponseBodyDataScreenLCLesionLesionList build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenLCLesionLesionList self = new ScreenChestCTResponseBodyDataScreenLCLesionLesionList();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenLCLesionLesionList setDiameter(java.util.List<Float> diameter) {
            this.diameter = diameter;
            return this;
        }
        public java.util.List<Float> getDiameter() {
            return this.diameter;
        }

        public ScreenChestCTResponseBodyDataScreenLCLesionLesionList setKeySlice(Long keySlice) {
            this.keySlice = keySlice;
            return this;
        }
        public Long getKeySlice() {
            return this.keySlice;
        }

        public ScreenChestCTResponseBodyDataScreenLCLesionLesionList setMalignancy(Float malignancy) {
            this.malignancy = malignancy;
            return this;
        }
        public Float getMalignancy() {
            return this.malignancy;
        }

        public ScreenChestCTResponseBodyDataScreenLCLesionLesionList setRecistEndpoints(java.util.List<Float> recistEndpoints) {
            this.recistEndpoints = recistEndpoints;
            return this;
        }
        public java.util.List<Float> getRecistEndpoints() {
            return this.recistEndpoints;
        }

        public ScreenChestCTResponseBodyDataScreenLCLesionLesionList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ScreenChestCTResponseBodyDataScreenLCLesionLesionList setVolume(Float volume) {
            this.volume = volume;
            return this;
        }
        public Float getVolume() {
            return this.volume;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenLCLesionPatientLevelResult extends TeaModel {
        @NameInMap("BenignNonCystProb")
        public String benignNonCystProb;

        @NameInMap("CystProb")
        public String cystProb;

        @NameInMap("HCCProb")
        public String HCCProb;

        @NameInMap("MalignantNonHCCProb")
        public String malignantNonHCCProb;

        public static ScreenChestCTResponseBodyDataScreenLCLesionPatientLevelResult build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenLCLesionPatientLevelResult self = new ScreenChestCTResponseBodyDataScreenLCLesionPatientLevelResult();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenLCLesionPatientLevelResult setBenignNonCystProb(String benignNonCystProb) {
            this.benignNonCystProb = benignNonCystProb;
            return this;
        }
        public String getBenignNonCystProb() {
            return this.benignNonCystProb;
        }

        public ScreenChestCTResponseBodyDataScreenLCLesionPatientLevelResult setCystProb(String cystProb) {
            this.cystProb = cystProb;
            return this;
        }
        public String getCystProb() {
            return this.cystProb;
        }

        public ScreenChestCTResponseBodyDataScreenLCLesionPatientLevelResult setHCCProb(String HCCProb) {
            this.HCCProb = HCCProb;
            return this;
        }
        public String getHCCProb() {
            return this.HCCProb;
        }

        public ScreenChestCTResponseBodyDataScreenLCLesionPatientLevelResult setMalignantNonHCCProb(String malignantNonHCCProb) {
            this.malignantNonHCCProb = malignantNonHCCProb;
            return this;
        }
        public String getMalignantNonHCCProb() {
            return this.malignantNonHCCProb;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenLCLesion extends TeaModel {
        @NameInMap("LesionList")
        public java.util.List<ScreenChestCTResponseBodyDataScreenLCLesionLesionList> lesionList;

        @NameInMap("LiverVolume")
        public String liverVolume;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("PatientLevelResult")
        public ScreenChestCTResponseBodyDataScreenLCLesionPatientLevelResult patientLevelResult;

        public static ScreenChestCTResponseBodyDataScreenLCLesion build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenLCLesion self = new ScreenChestCTResponseBodyDataScreenLCLesion();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenLCLesion setLesionList(java.util.List<ScreenChestCTResponseBodyDataScreenLCLesionLesionList> lesionList) {
            this.lesionList = lesionList;
            return this;
        }
        public java.util.List<ScreenChestCTResponseBodyDataScreenLCLesionLesionList> getLesionList() {
            return this.lesionList;
        }

        public ScreenChestCTResponseBodyDataScreenLCLesion setLiverVolume(String liverVolume) {
            this.liverVolume = liverVolume;
            return this;
        }
        public String getLiverVolume() {
            return this.liverVolume;
        }

        public ScreenChestCTResponseBodyDataScreenLCLesion setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public ScreenChestCTResponseBodyDataScreenLCLesion setPatientLevelResult(ScreenChestCTResponseBodyDataScreenLCLesionPatientLevelResult patientLevelResult) {
            this.patientLevelResult = patientLevelResult;
            return this;
        }
        public ScreenChestCTResponseBodyDataScreenLCLesionPatientLevelResult getPatientLevelResult() {
            return this.patientLevelResult;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenLC extends TeaModel {
        @NameInMap("Lesion")
        public ScreenChestCTResponseBodyDataScreenLCLesion lesion;

        @NameInMap("SeriesInstanceUid")
        public String seriesInstanceUid;

        public static ScreenChestCTResponseBodyDataScreenLC build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenLC self = new ScreenChestCTResponseBodyDataScreenLC();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenLC setLesion(ScreenChestCTResponseBodyDataScreenLCLesion lesion) {
            this.lesion = lesion;
            return this;
        }
        public ScreenChestCTResponseBodyDataScreenLCLesion getLesion() {
            return this.lesion;
        }

        public ScreenChestCTResponseBodyDataScreenLC setSeriesInstanceUid(String seriesInstanceUid) {
            this.seriesInstanceUid = seriesInstanceUid;
            return this;
        }
        public String getSeriesInstanceUid() {
            return this.seriesInstanceUid;
        }

    }

    public static class ScreenChestCTResponseBodyData extends TeaModel {
        @NameInMap("AnalyzeChestVessel")
        public ScreenChestCTResponseBodyDataAnalyzeChestVessel analyzeChestVessel;

        @NameInMap("CACS")
        public ScreenChestCTResponseBodyDataCACS CACS;

        @NameInMap("CalcBMD")
        public ScreenChestCTResponseBodyDataCalcBMD calcBMD;

        @NameInMap("Covid")
        public ScreenChestCTResponseBodyDataCovid covid;

        @NameInMap("DetectLiverSteatosis")
        public ScreenChestCTResponseBodyDataDetectLiverSteatosis detectLiverSteatosis;

        @NameInMap("DetectLymph")
        public ScreenChestCTResponseBodyDataDetectLymph detectLymph;

        @NameInMap("DetectPdac")
        public ScreenChestCTResponseBodyDataDetectPdac detectPdac;

        @NameInMap("DetectRibFracture")
        public ScreenChestCTResponseBodyDataDetectRibFracture detectRibFracture;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("LungNodule")
        public ScreenChestCTResponseBodyDataLungNodule lungNodule;

        @NameInMap("NestedUrlList")
        public java.util.Map<String, ?> nestedUrlList;

        @NameInMap("PredictCVD")
        public ScreenChestCTResponseBodyDataPredictCVD predictCVD;

        @NameInMap("ScreenCRC")
        public ScreenChestCTResponseBodyDataScreenCRC screenCRC;

        @NameInMap("ScreenEc")
        public ScreenChestCTResponseBodyDataScreenEc screenEc;

        @NameInMap("ScreenGC")
        public ScreenChestCTResponseBodyDataScreenGC screenGC;

        @NameInMap("ScreenLC")
        public ScreenChestCTResponseBodyDataScreenLC screenLC;

        @NameInMap("URLList")
        public java.util.Map<String, ?> URLList;

        public static ScreenChestCTResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyData self = new ScreenChestCTResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyData setAnalyzeChestVessel(ScreenChestCTResponseBodyDataAnalyzeChestVessel analyzeChestVessel) {
            this.analyzeChestVessel = analyzeChestVessel;
            return this;
        }
        public ScreenChestCTResponseBodyDataAnalyzeChestVessel getAnalyzeChestVessel() {
            return this.analyzeChestVessel;
        }

        public ScreenChestCTResponseBodyData setCACS(ScreenChestCTResponseBodyDataCACS CACS) {
            this.CACS = CACS;
            return this;
        }
        public ScreenChestCTResponseBodyDataCACS getCACS() {
            return this.CACS;
        }

        public ScreenChestCTResponseBodyData setCalcBMD(ScreenChestCTResponseBodyDataCalcBMD calcBMD) {
            this.calcBMD = calcBMD;
            return this;
        }
        public ScreenChestCTResponseBodyDataCalcBMD getCalcBMD() {
            return this.calcBMD;
        }

        public ScreenChestCTResponseBodyData setCovid(ScreenChestCTResponseBodyDataCovid covid) {
            this.covid = covid;
            return this;
        }
        public ScreenChestCTResponseBodyDataCovid getCovid() {
            return this.covid;
        }

        public ScreenChestCTResponseBodyData setDetectLiverSteatosis(ScreenChestCTResponseBodyDataDetectLiverSteatosis detectLiverSteatosis) {
            this.detectLiverSteatosis = detectLiverSteatosis;
            return this;
        }
        public ScreenChestCTResponseBodyDataDetectLiverSteatosis getDetectLiverSteatosis() {
            return this.detectLiverSteatosis;
        }

        public ScreenChestCTResponseBodyData setDetectLymph(ScreenChestCTResponseBodyDataDetectLymph detectLymph) {
            this.detectLymph = detectLymph;
            return this;
        }
        public ScreenChestCTResponseBodyDataDetectLymph getDetectLymph() {
            return this.detectLymph;
        }

        public ScreenChestCTResponseBodyData setDetectPdac(ScreenChestCTResponseBodyDataDetectPdac detectPdac) {
            this.detectPdac = detectPdac;
            return this;
        }
        public ScreenChestCTResponseBodyDataDetectPdac getDetectPdac() {
            return this.detectPdac;
        }

        public ScreenChestCTResponseBodyData setDetectRibFracture(ScreenChestCTResponseBodyDataDetectRibFracture detectRibFracture) {
            this.detectRibFracture = detectRibFracture;
            return this;
        }
        public ScreenChestCTResponseBodyDataDetectRibFracture getDetectRibFracture() {
            return this.detectRibFracture;
        }

        public ScreenChestCTResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ScreenChestCTResponseBodyData setLungNodule(ScreenChestCTResponseBodyDataLungNodule lungNodule) {
            this.lungNodule = lungNodule;
            return this;
        }
        public ScreenChestCTResponseBodyDataLungNodule getLungNodule() {
            return this.lungNodule;
        }

        public ScreenChestCTResponseBodyData setNestedUrlList(java.util.Map<String, ?> nestedUrlList) {
            this.nestedUrlList = nestedUrlList;
            return this;
        }
        public java.util.Map<String, ?> getNestedUrlList() {
            return this.nestedUrlList;
        }

        public ScreenChestCTResponseBodyData setPredictCVD(ScreenChestCTResponseBodyDataPredictCVD predictCVD) {
            this.predictCVD = predictCVD;
            return this;
        }
        public ScreenChestCTResponseBodyDataPredictCVD getPredictCVD() {
            return this.predictCVD;
        }

        public ScreenChestCTResponseBodyData setScreenCRC(ScreenChestCTResponseBodyDataScreenCRC screenCRC) {
            this.screenCRC = screenCRC;
            return this;
        }
        public ScreenChestCTResponseBodyDataScreenCRC getScreenCRC() {
            return this.screenCRC;
        }

        public ScreenChestCTResponseBodyData setScreenEc(ScreenChestCTResponseBodyDataScreenEc screenEc) {
            this.screenEc = screenEc;
            return this;
        }
        public ScreenChestCTResponseBodyDataScreenEc getScreenEc() {
            return this.screenEc;
        }

        public ScreenChestCTResponseBodyData setScreenGC(ScreenChestCTResponseBodyDataScreenGC screenGC) {
            this.screenGC = screenGC;
            return this;
        }
        public ScreenChestCTResponseBodyDataScreenGC getScreenGC() {
            return this.screenGC;
        }

        public ScreenChestCTResponseBodyData setScreenLC(ScreenChestCTResponseBodyDataScreenLC screenLC) {
            this.screenLC = screenLC;
            return this;
        }
        public ScreenChestCTResponseBodyDataScreenLC getScreenLC() {
            return this.screenLC;
        }

        public ScreenChestCTResponseBodyData setURLList(java.util.Map<String, ?> URLList) {
            this.URLList = URLList;
            return this;
        }
        public java.util.Map<String, ?> getURLList() {
            return this.URLList;
        }

    }

}
