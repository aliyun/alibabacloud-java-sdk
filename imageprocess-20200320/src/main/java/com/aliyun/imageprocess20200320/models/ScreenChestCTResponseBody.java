// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenChestCTResponseBody extends TeaModel {
    @NameInMap("Data")
    public ScreenChestCTResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>imageUrl download failed</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>528B54D4-3AAB-47CF-B6CE-0C2A2FB4C7C2</p>
     */
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

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LabelValue")
        public Long labelValue;

        /**
         * <strong>example:</strong>
         * <p>2722</p>
         */
        @NameInMap("MaxArea")
        public Float maxArea;

        /**
         * <strong>example:</strong>
         * <p>416</p>
         */
        @NameInMap("MaxAreaIndex")
        public Long maxAreaIndex;

        /**
         * <strong>example:</strong>
         * <p>63</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LabelValue")
        public Long labelValue;

        /**
         * <strong>example:</strong>
         * <p>928</p>
         */
        @NameInMap("MaxArea")
        public Float maxArea;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxAreaIndex")
        public Long maxAreaIndex;

        /**
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("MaxDiameter")
        public Float maxDiameter;

        /**
         * <strong>example:</strong>
         * <p>2439</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/ct_artery_aa_ph/local_test/2021-07-08/6C4713DF-F548-47DF-A456-5DA1C8334444_result_compressed.tgz?Expires=1625732732&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSR****&Signature=5UKVmLfM7GWllIcPr9a6dKz%2B5h">http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/ct_artery_aa_ph/local_test/2021-07-08/6C4713DF-F548-47DF-A456-5DA1C8334444_result_compressed.tgz?Expires=1625732732&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSR****&amp;Signature=5UKVmLfM7GWllIcPr9a6dKz%2B5h</a>****</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CalciumId")
        public Long calciumId;

        /**
         * <strong>example:</strong>
         * <p>19.22474</p>
         */
        @NameInMap("CalciumScore")
        public Float calciumScore;

        /**
         * <strong>example:</strong>
         * <p>28.837109</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/calc-cacs/2020-09-29/2020-09-29-11%3A07%3A41-D74FE0DF-8F80-41EB-B08B-2E67053587EC.tar.gz?Expires=1601350661&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=iB16ms28Y5mzB11ghYUd7upCi4">http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/calc-cacs/2020-09-29/2020-09-29-11%3A07%3A41-D74FE0DF-8F80-41EB-B08B-2E67053587EC.tar.gz?Expires=1601350661&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=iB16ms28Y5mzB11ghYUd7upCi4</a>****</p>
         */
        @NameInMap("ResultUrl")
        public String resultUrl;

        /**
         * <strong>example:</strong>
         * <p>4.83</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <strong>example:</strong>
         * <p>1.2.392.489642.9116.2.6.1.44063.1986736248.1658817546.650139</p>
         */
        @NameInMap("SeriesInstanceUID")
        public String seriesInstanceUID;

        /**
         * <strong>example:</strong>
         * <p>111.96</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>0.9387283236994219</p>
         */
        @NameInMap("LesionRatio")
        public String lesionRatio;

        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-aic-med-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/covid19-dcm/unspecified/2020032702/1b1e1018-6fcf-11ea-8fa1-d20b34387541.nii.gz?Expires=1585276394&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=%2F1LNGWJUqvY0VRYGgg8Ldtb3BF">http://algo-app-aic-med-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/covid19-dcm/unspecified/2020032702/1b1e1018-6fcf-11ea-8fa1-d20b34387541.nii.gz?Expires=1585276394&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=%2F1LNGWJUqvY0VRYGgg8Ldtb3BF</a>****</p>
         */
        @NameInMap("Mask")
        public String mask;

        /**
         * <strong>example:</strong>
         * <p>4.062644e-06</p>
         */
        @NameInMap("NewProbability")
        public String newProbability;

        /**
         * <strong>example:</strong>
         * <p>0.7230905</p>
         */
        @NameInMap("NormalProbability")
        public String normalProbability;

        /**
         * <strong>example:</strong>
         * <p>0.27690542</p>
         */
        @NameInMap("OtherProbability")
        public String otherProbability;

        /**
         * <strong>example:</strong>
         * <p>1.2.392.200036.9116.2.6.1.44063.1805049129.1658817546.650139</p>
         */
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

    public static class ScreenChestCTResponseBodyDataDetectAD extends TeaModel {
        @NameInMap("DistanceMap")
        public String distanceMap;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("Possibility")
        public String possibility;

        @NameInMap("SeriesInstanceUid")
        public String seriesInstanceUid;

        @NameInMap("SliceVal")
        public Integer sliceVal;

        public static ScreenChestCTResponseBodyDataDetectAD build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataDetectAD self = new ScreenChestCTResponseBodyDataDetectAD();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataDetectAD setDistanceMap(String distanceMap) {
            this.distanceMap = distanceMap;
            return this;
        }
        public String getDistanceMap() {
            return this.distanceMap;
        }

        public ScreenChestCTResponseBodyDataDetectAD setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public ScreenChestCTResponseBodyDataDetectAD setPossibility(String possibility) {
            this.possibility = possibility;
            return this;
        }
        public String getPossibility() {
            return this.possibility;
        }

        public ScreenChestCTResponseBodyDataDetectAD setSeriesInstanceUid(String seriesInstanceUid) {
            this.seriesInstanceUid = seriesInstanceUid;
            return this;
        }
        public String getSeriesInstanceUid() {
            return this.seriesInstanceUid;
        }

        public ScreenChestCTResponseBodyDataDetectAD setSliceVal(Integer sliceVal) {
            this.sliceVal = sliceVal;
            return this;
        }
        public Integer getSliceVal() {
            return this.sliceVal;
        }

    }

    public static class ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections extends TeaModel {
        @NameInMap("FatFract")
        public Double fatFract;

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

        @NameInMap("MaossScore")
        public Double maossScore;

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

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setFatFract(Double fatFract) {
            this.fatFract = fatFract;
            return this;
        }
        public Double getFatFract() {
            return this.fatFract;
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

        public ScreenChestCTResponseBodyDataDetectLiverSteatosisDetections setMaossScore(Double maossScore) {
            this.maossScore = maossScore;
            return this;
        }
        public Double getMaossScore() {
            return this.maossScore;
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

        @NameInMap("ResultUrl")
        public String resultUrl;

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

        public ScreenChestCTResponseBodyDataDetectLiverSteatosis setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
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

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("KeySlice")
        public Long keySlice;

        @NameInMap("Recist")
        public java.util.List<java.util.List<Float>> recist;

        /**
         * <strong>example:</strong>
         * <p>0.6298</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>1.2.568.200036.9116.2.6.1.44063.1805049129.1357480934.650139</p>
         */
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

    public static class ScreenChestCTResponseBodyDataDetectPdacLesionLesionList extends TeaModel {
        @NameInMap("Diameter")
        public java.util.List<Float> diameter;

        @NameInMap("KeySlice")
        public Integer keySlice;

        @NameInMap("ROIEndpoints")
        public java.util.List<java.util.List<Integer>> ROIEndpoints;

        @NameInMap("RecistEndpoints")
        public java.util.List<java.util.List<Integer>> recistEndpoints;

        @NameInMap("Type")
        public String type;

        public static ScreenChestCTResponseBodyDataDetectPdacLesionLesionList build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataDetectPdacLesionLesionList self = new ScreenChestCTResponseBodyDataDetectPdacLesionLesionList();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataDetectPdacLesionLesionList setDiameter(java.util.List<Float> diameter) {
            this.diameter = diameter;
            return this;
        }
        public java.util.List<Float> getDiameter() {
            return this.diameter;
        }

        public ScreenChestCTResponseBodyDataDetectPdacLesionLesionList setKeySlice(Integer keySlice) {
            this.keySlice = keySlice;
            return this;
        }
        public Integer getKeySlice() {
            return this.keySlice;
        }

        public ScreenChestCTResponseBodyDataDetectPdacLesionLesionList setROIEndpoints(java.util.List<java.util.List<Integer>> ROIEndpoints) {
            this.ROIEndpoints = ROIEndpoints;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getROIEndpoints() {
            return this.ROIEndpoints;
        }

        public ScreenChestCTResponseBodyDataDetectPdacLesionLesionList setRecistEndpoints(java.util.List<java.util.List<Integer>> recistEndpoints) {
            this.recistEndpoints = recistEndpoints;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getRecistEndpoints() {
            return this.recistEndpoints;
        }

        public ScreenChestCTResponseBodyDataDetectPdacLesionLesionList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ScreenChestCTResponseBodyDataDetectPdacLesionOrganList extends TeaModel {
        @NameInMap("Diameter")
        public java.util.List<Float> diameter;

        @NameInMap("KeySlice")
        public Integer keySlice;

        @NameInMap("ROIEndpoints")
        public java.util.List<java.util.List<Integer>> ROIEndpoints;

        @NameInMap("RecistEndpoints")
        public java.util.List<java.util.List<Integer>> recistEndpoints;

        @NameInMap("Type")
        public String type;

        public static ScreenChestCTResponseBodyDataDetectPdacLesionOrganList build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataDetectPdacLesionOrganList self = new ScreenChestCTResponseBodyDataDetectPdacLesionOrganList();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataDetectPdacLesionOrganList setDiameter(java.util.List<Float> diameter) {
            this.diameter = diameter;
            return this;
        }
        public java.util.List<Float> getDiameter() {
            return this.diameter;
        }

        public ScreenChestCTResponseBodyDataDetectPdacLesionOrganList setKeySlice(Integer keySlice) {
            this.keySlice = keySlice;
            return this;
        }
        public Integer getKeySlice() {
            return this.keySlice;
        }

        public ScreenChestCTResponseBodyDataDetectPdacLesionOrganList setROIEndpoints(java.util.List<java.util.List<Integer>> ROIEndpoints) {
            this.ROIEndpoints = ROIEndpoints;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getROIEndpoints() {
            return this.ROIEndpoints;
        }

        public ScreenChestCTResponseBodyDataDetectPdacLesionOrganList setRecistEndpoints(java.util.List<java.util.List<Integer>> recistEndpoints) {
            this.recistEndpoints = recistEndpoints;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getRecistEndpoints() {
            return this.recistEndpoints;
        }

        public ScreenChestCTResponseBodyDataDetectPdacLesionOrganList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ScreenChestCTResponseBodyDataDetectPdacLesion extends TeaModel {
        @NameInMap("LesionList")
        public java.util.List<ScreenChestCTResponseBodyDataDetectPdacLesionLesionList> lesionList;

        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/screen-pdac/2022-05-25_14%3A33%3A30/4CA2BF25-BCDB-9C6C-B14C-EB41E8266588.nii.gz?Expires=1653462210&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSR****&Signature=8t%2FknUrQyyyCU2p7QhMC%2BXBCR">http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/screen-pdac/2022-05-25_14%3A33%3A30/4CA2BF25-BCDB-9C6C-B14C-EB41E8266588.nii.gz?Expires=1653462210&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSR****&amp;Signature=8t%2FknUrQyyyCU2p7QhMC%2BXBCR</a>****</p>
         */
        @NameInMap("Mask")
        public String mask;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NonPdacVol")
        public String nonPdacVol;

        @NameInMap("OrganList")
        public java.util.List<ScreenChestCTResponseBodyDataDetectPdacLesionOrganList> organList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PancVol")
        public String pancVol;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PdacVol")
        public String pdacVol;

        @NameInMap("Possibilities")
        public java.util.List<String> possibilities;

        public static ScreenChestCTResponseBodyDataDetectPdacLesion build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataDetectPdacLesion self = new ScreenChestCTResponseBodyDataDetectPdacLesion();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataDetectPdacLesion setLesionList(java.util.List<ScreenChestCTResponseBodyDataDetectPdacLesionLesionList> lesionList) {
            this.lesionList = lesionList;
            return this;
        }
        public java.util.List<ScreenChestCTResponseBodyDataDetectPdacLesionLesionList> getLesionList() {
            return this.lesionList;
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

        public ScreenChestCTResponseBodyDataDetectPdacLesion setOrganList(java.util.List<ScreenChestCTResponseBodyDataDetectPdacLesionOrganList> organList) {
            this.organList = organList;
            return this;
        }
        public java.util.List<ScreenChestCTResponseBodyDataDetectPdacLesionOrganList> getOrganList() {
            return this.organList;
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

        /**
         * <strong>example:</strong>
         * <p>1.2.239.200036.9116.2.6.1.44063.1805049129.1357480934.650139</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FractureCategory")
        public Long fractureCategory;

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
        public Long fractureId;

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

        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/screen-chest-ct/detect-rib-fracture/2022-07-27/2022-07-27-15_15_39-8BBD1C28-383A-548F-AD7D-CB5E0ABA207D_be6ffcb2d2e9494cba8112e07f93f466_ribFracture-mask.nii.gz?Expires=1659165340&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSR****&Signature=2lzFDLfGbhVXsHm%2BKhgpglWmA">http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/screen-chest-ct/detect-rib-fracture/2022-07-27/2022-07-27-15_15_39-8BBD1C28-383A-548F-AD7D-CB5E0ABA207D_be6ffcb2d2e9494cba8112e07f93f466_ribFracture-mask.nii.gz?Expires=1659165340&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSR****&amp;Signature=2lzFDLfGbhVXsHm%2BKhgpglWmA</a>****</p>
         */
        @NameInMap("FractureMaskURL")
        public String fractureMaskURL;

        @NameInMap("Origin")
        public java.util.List<Float> origin;

        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/detect-rib-fracture/local_test/2020-12-22/result-D5CD101C-F8E5-43CA-9E99-44C783B8F8BE.tar.gz?Expires=1608631727&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=d6c32E1IB4b7Ayo1lpjs%2Bq3Ylv">http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/detect-rib-fracture/local_test/2020-12-22/result-D5CD101C-F8E5-43CA-9E99-44C783B8F8BE.tar.gz?Expires=1608631727&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=d6c32E1IB4b7Ayo1lpjs%2Bq3Ylv</a>****</p>
         */
        @NameInMap("ResultURL")
        public String resultURL;

        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/screen-chest-ct/detect-rib-fracture/2022-07-27/2022-07-27-15_15_39-8BBD1C28-383A-548F-AD7D-CB5E0ABA207D_be6ffcb2d2e9494cba8112e07f93f466_ribFracture-ribmask.nii.gz?Expires=1659165340&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSR****&Signature=5Z%2FCS3B%2B%2Ff6nlBk7alY39LvH3">http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/screen-chest-ct/detect-rib-fracture/2022-07-27/2022-07-27-15_15_39-8BBD1C28-383A-548F-AD7D-CB5E0ABA207D_be6ffcb2d2e9494cba8112e07f93f466_ribFracture-ribmask.nii.gz?Expires=1659165340&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSR****&amp;Signature=5Z%2FCS3B%2B%2Ff6nlBk7alY39LvH3</a>****</p>
         */
        @NameInMap("RibSegmentMaskURL")
        public String ribSegmentMaskURL;

        /**
         * <strong>example:</strong>
         * <p>1.2.392.489642.9116.2.6.1.78361.1298784213.1658817546.650139</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>0.7012705768508907</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <strong>example:</strong>
         * <p>9.730626493692398</p>
         */
        @NameInMap("Diameter")
        public Float diameter;

        /**
         * <strong>example:</strong>
         * <p>308.9676976455463</p>
         */
        @NameInMap("ImageX")
        public Float imageX;

        /**
         * <strong>example:</strong>
         * <p>198.3552282631497</p>
         */
        @NameInMap("ImageY")
        public Float imageY;

        /**
         * <strong>example:</strong>
         * <p>198.3552282631497</p>
         */
        @NameInMap("ImageZ")
        public Float imageZ;

        /**
         * <strong>example:</strong>
         * <p>up</p>
         */
        @NameInMap("Lobe")
        public String lobe;

        /**
         * <strong>example:</strong>
         * <p>left</p>
         */
        @NameInMap("Lung")
        public String lung;

        @NameInMap("MajorAxis")
        public java.util.List<Float> majorAxis;

        /**
         * <strong>example:</strong>
         * <p>261.37589112119247</p>
         */
        @NameInMap("MeanValue")
        public Float meanValue;

        @NameInMap("MinorAxis")
        public java.util.List<Float> minorAxis;

        @NameInMap("RecistSOPInstanceUID")
        public String recistSOPInstanceUID;

        @NameInMap("Risk")
        public Float risk;

        /**
         * <strong>example:</strong>
         * <p>1.3.6.1.4.1.14519.5.2.1.6279.6001.261151233960269013402330853013</p>
         */
        @NameInMap("SOPInstanceUID")
        public String SOPInstanceUID;

        /**
         * <strong>example:</strong>
         * <p>10959.220491175074</p>
         */
        @NameInMap("Volume")
        public Float volume;

        /**
         * <strong>example:</strong>
         * <p>51.24291240631416</p>
         */
        @NameInMap("X")
        public Float x;

        /**
         * <strong>example:</strong>
         * <p>-32.23147700784307</p>
         */
        @NameInMap("Y")
        public Float y;

        /**
         * <strong>example:</strong>
         * <p>-46.81608170781766</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>1.3.6.1.4.1.14519.5.2.1.6279.6001.179049373636438705059720603192</p>
         */
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

    public static class ScreenChestCTResponseBodyDataMuscleFat extends TeaModel {
        @NameInMap("FAT_TYPE")
        public Integer FAT_TYPE;

        @NameInMap("MASK_PATH")
        public String MASK_PATH;

        @NameInMap("MUSCLE_MASS")
        public Integer MUSCLE_MASS;

        @NameInMap("MUSCLE_QUALITY")
        public Integer MUSCLE_QUALITY;

        @NameInMap("NAMA_TAMA_INDEX_TSCORE")
        public Float NAMA_TAMA_INDEX_TSCORE;

        @NameInMap("PERCENT_IMAT")
        public Float PERCENT_IMAT;

        @NameInMap("PERCENT_LAMA")
        public Float PERCENT_LAMA;

        @NameInMap("PERCENT_NAMA")
        public Float PERCENT_NAMA;

        @NameInMap("RENDERING_PATH")
        public String RENDERING_PATH;

        @NameInMap("SFA")
        public Float SFA;

        @NameInMap("SFT")
        public Float SFT;

        @NameInMap("SMA")
        public Float SMA;

        @NameInMap("SMI")
        public Float SMI;

        @NameInMap("STUDY_AGE")
        public Integer STUDY_AGE;

        @NameInMap("STUDY_GENDER")
        public String STUDY_GENDER;

        @NameInMap("SeriesInstanceUid")
        public String seriesInstanceUid;

        @NameInMap("VERTEBRA_IN_USE")
        public Float VERTEBRA_IN_USE;

        @NameInMap("VFA")
        public Float VFA;

        public static ScreenChestCTResponseBodyDataMuscleFat build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataMuscleFat self = new ScreenChestCTResponseBodyDataMuscleFat();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataMuscleFat setFAT_TYPE(Integer FAT_TYPE) {
            this.FAT_TYPE = FAT_TYPE;
            return this;
        }
        public Integer getFAT_TYPE() {
            return this.FAT_TYPE;
        }

        public ScreenChestCTResponseBodyDataMuscleFat setMASK_PATH(String MASK_PATH) {
            this.MASK_PATH = MASK_PATH;
            return this;
        }
        public String getMASK_PATH() {
            return this.MASK_PATH;
        }

        public ScreenChestCTResponseBodyDataMuscleFat setMUSCLE_MASS(Integer MUSCLE_MASS) {
            this.MUSCLE_MASS = MUSCLE_MASS;
            return this;
        }
        public Integer getMUSCLE_MASS() {
            return this.MUSCLE_MASS;
        }

        public ScreenChestCTResponseBodyDataMuscleFat setMUSCLE_QUALITY(Integer MUSCLE_QUALITY) {
            this.MUSCLE_QUALITY = MUSCLE_QUALITY;
            return this;
        }
        public Integer getMUSCLE_QUALITY() {
            return this.MUSCLE_QUALITY;
        }

        public ScreenChestCTResponseBodyDataMuscleFat setNAMA_TAMA_INDEX_TSCORE(Float NAMA_TAMA_INDEX_TSCORE) {
            this.NAMA_TAMA_INDEX_TSCORE = NAMA_TAMA_INDEX_TSCORE;
            return this;
        }
        public Float getNAMA_TAMA_INDEX_TSCORE() {
            return this.NAMA_TAMA_INDEX_TSCORE;
        }

        public ScreenChestCTResponseBodyDataMuscleFat setPERCENT_IMAT(Float PERCENT_IMAT) {
            this.PERCENT_IMAT = PERCENT_IMAT;
            return this;
        }
        public Float getPERCENT_IMAT() {
            return this.PERCENT_IMAT;
        }

        public ScreenChestCTResponseBodyDataMuscleFat setPERCENT_LAMA(Float PERCENT_LAMA) {
            this.PERCENT_LAMA = PERCENT_LAMA;
            return this;
        }
        public Float getPERCENT_LAMA() {
            return this.PERCENT_LAMA;
        }

        public ScreenChestCTResponseBodyDataMuscleFat setPERCENT_NAMA(Float PERCENT_NAMA) {
            this.PERCENT_NAMA = PERCENT_NAMA;
            return this;
        }
        public Float getPERCENT_NAMA() {
            return this.PERCENT_NAMA;
        }

        public ScreenChestCTResponseBodyDataMuscleFat setRENDERING_PATH(String RENDERING_PATH) {
            this.RENDERING_PATH = RENDERING_PATH;
            return this;
        }
        public String getRENDERING_PATH() {
            return this.RENDERING_PATH;
        }

        public ScreenChestCTResponseBodyDataMuscleFat setSFA(Float SFA) {
            this.SFA = SFA;
            return this;
        }
        public Float getSFA() {
            return this.SFA;
        }

        public ScreenChestCTResponseBodyDataMuscleFat setSFT(Float SFT) {
            this.SFT = SFT;
            return this;
        }
        public Float getSFT() {
            return this.SFT;
        }

        public ScreenChestCTResponseBodyDataMuscleFat setSMA(Float SMA) {
            this.SMA = SMA;
            return this;
        }
        public Float getSMA() {
            return this.SMA;
        }

        public ScreenChestCTResponseBodyDataMuscleFat setSMI(Float SMI) {
            this.SMI = SMI;
            return this;
        }
        public Float getSMI() {
            return this.SMI;
        }

        public ScreenChestCTResponseBodyDataMuscleFat setSTUDY_AGE(Integer STUDY_AGE) {
            this.STUDY_AGE = STUDY_AGE;
            return this;
        }
        public Integer getSTUDY_AGE() {
            return this.STUDY_AGE;
        }

        public ScreenChestCTResponseBodyDataMuscleFat setSTUDY_GENDER(String STUDY_GENDER) {
            this.STUDY_GENDER = STUDY_GENDER;
            return this;
        }
        public String getSTUDY_GENDER() {
            return this.STUDY_GENDER;
        }

        public ScreenChestCTResponseBodyDataMuscleFat setSeriesInstanceUid(String seriesInstanceUid) {
            this.seriesInstanceUid = seriesInstanceUid;
            return this;
        }
        public String getSeriesInstanceUid() {
            return this.seriesInstanceUid;
        }

        public ScreenChestCTResponseBodyDataMuscleFat setVERTEBRA_IN_USE(Float VERTEBRA_IN_USE) {
            this.VERTEBRA_IN_USE = VERTEBRA_IN_USE;
            return this;
        }
        public Float getVERTEBRA_IN_USE() {
            return this.VERTEBRA_IN_USE;
        }

        public ScreenChestCTResponseBodyDataMuscleFat setVFA(Float VFA) {
            this.VFA = VFA;
            return this;
        }
        public Float getVFA() {
            return this.VFA;
        }

    }

    public static class ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore extends TeaModel {
        @NameInMap("AortaCalciumScore")
        public java.util.List<Double> aortaCalciumScore;

        @NameInMap("AortaCalciumVolume")
        public java.util.List<Double> aortaCalciumVolume;

        @NameInMap("AortaMaxDiam")
        public java.util.List<Double> aortaMaxDiam;

        @NameInMap("AortaMaxDiamStd")
        public java.util.List<Double> aortaMaxDiamStd;

        @NameInMap("AorticHeightIndex")
        public java.util.List<Double> aorticHeightIndex;

        @NameInMap("AorticTortuosityIndex")
        public java.util.List<Double> aorticTortuosityIndex;

        @NameInMap("AscAoMaxDiam")
        public java.util.List<Double> ascAoMaxDiam;

        @NameInMap("AscendAortaLength")
        public java.util.List<Double> ascendAortaLength;

        @NameInMap("CardioThoracicRatio")
        public java.util.List<Double> cardioThoracicRatio;

        @NameInMap("ChestWidth")
        public java.util.List<Double> chestWidth;

        @NameInMap("CoronaryCalciumScore")
        public java.util.List<Double> coronaryCalciumScore;

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

        @NameInMap("HeartLongDiam")
        public java.util.List<Double> heartLongDiam;

        @NameInMap("HeartShortDiam")
        public java.util.List<Double> heartShortDiam;

        @NameInMap("HeartWidth")
        public java.util.List<Double> heartWidth;

        @NameInMap("LeftLungHighattRatio")
        public java.util.List<Double> leftLungHighattRatio;

        @NameInMap("LeftLungLowattRatio")
        public java.util.List<Double> leftLungLowattRatio;

        @NameInMap("MyoEpiRatio")
        public java.util.List<Double> myoEpiRatio;

        @NameInMap("RightLungHighattRatio")
        public java.util.List<Double> rightLungHighattRatio;

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

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setAortaMaxDiam(java.util.List<Double> aortaMaxDiam) {
            this.aortaMaxDiam = aortaMaxDiam;
            return this;
        }
        public java.util.List<Double> getAortaMaxDiam() {
            return this.aortaMaxDiam;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setAortaMaxDiamStd(java.util.List<Double> aortaMaxDiamStd) {
            this.aortaMaxDiamStd = aortaMaxDiamStd;
            return this;
        }
        public java.util.List<Double> getAortaMaxDiamStd() {
            return this.aortaMaxDiamStd;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setAorticHeightIndex(java.util.List<Double> aorticHeightIndex) {
            this.aorticHeightIndex = aorticHeightIndex;
            return this;
        }
        public java.util.List<Double> getAorticHeightIndex() {
            return this.aorticHeightIndex;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setAorticTortuosityIndex(java.util.List<Double> aorticTortuosityIndex) {
            this.aorticTortuosityIndex = aorticTortuosityIndex;
            return this;
        }
        public java.util.List<Double> getAorticTortuosityIndex() {
            return this.aorticTortuosityIndex;
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

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setChestWidth(java.util.List<Double> chestWidth) {
            this.chestWidth = chestWidth;
            return this;
        }
        public java.util.List<Double> getChestWidth() {
            return this.chestWidth;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setCoronaryCalciumScore(java.util.List<Double> coronaryCalciumScore) {
            this.coronaryCalciumScore = coronaryCalciumScore;
            return this;
        }
        public java.util.List<Double> getCoronaryCalciumScore() {
            return this.coronaryCalciumScore;
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

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setHeartLongDiam(java.util.List<Double> heartLongDiam) {
            this.heartLongDiam = heartLongDiam;
            return this;
        }
        public java.util.List<Double> getHeartLongDiam() {
            return this.heartLongDiam;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setHeartShortDiam(java.util.List<Double> heartShortDiam) {
            this.heartShortDiam = heartShortDiam;
            return this;
        }
        public java.util.List<Double> getHeartShortDiam() {
            return this.heartShortDiam;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setHeartWidth(java.util.List<Double> heartWidth) {
            this.heartWidth = heartWidth;
            return this;
        }
        public java.util.List<Double> getHeartWidth() {
            return this.heartWidth;
        }

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setLeftLungHighattRatio(java.util.List<Double> leftLungHighattRatio) {
            this.leftLungHighattRatio = leftLungHighattRatio;
            return this;
        }
        public java.util.List<Double> getLeftLungHighattRatio() {
            return this.leftLungHighattRatio;
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

        public ScreenChestCTResponseBodyDataPredictCVDLesionFeatureScore setRightLungHighattRatio(java.util.List<Double> rightLungHighattRatio) {
            this.rightLungHighattRatio = rightLungHighattRatio;
            return this;
        }
        public java.util.List<Double> getRightLungHighattRatio() {
            return this.rightLungHighattRatio;
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

        @NameInMap("ImagesURL")
        public String imagesURL;

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

        public ScreenChestCTResponseBodyDataPredictCVDLesion setImagesURL(String imagesURL) {
            this.imagesURL = imagesURL;
            return this;
        }
        public String getImagesURL() {
            return this.imagesURL;
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

    public static class ScreenChestCTResponseBodyDataScreenBCLesionLeft extends TeaModel {
        @NameInMap("BCVolume")
        public String BCVolume;

        @NameInMap("BreastVolume")
        public String breastVolume;

        @NameInMap("Probabilities")
        public java.util.List<String> probabilities;

        public static ScreenChestCTResponseBodyDataScreenBCLesionLeft build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenBCLesionLeft self = new ScreenChestCTResponseBodyDataScreenBCLesionLeft();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenBCLesionLeft setBCVolume(String BCVolume) {
            this.BCVolume = BCVolume;
            return this;
        }
        public String getBCVolume() {
            return this.BCVolume;
        }

        public ScreenChestCTResponseBodyDataScreenBCLesionLeft setBreastVolume(String breastVolume) {
            this.breastVolume = breastVolume;
            return this;
        }
        public String getBreastVolume() {
            return this.breastVolume;
        }

        public ScreenChestCTResponseBodyDataScreenBCLesionLeft setProbabilities(java.util.List<String> probabilities) {
            this.probabilities = probabilities;
            return this;
        }
        public java.util.List<String> getProbabilities() {
            return this.probabilities;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenBCLesionLesionList extends TeaModel {
        @NameInMap("Diameter")
        public java.util.List<Float> diameter;

        @NameInMap("KeySlice")
        public Integer keySlice;

        @NameInMap("ROIEndpoints")
        public java.util.List<java.util.List<Integer>> ROIEndpoints;

        @NameInMap("RecistEndpoints")
        public java.util.List<java.util.List<Integer>> recistEndpoints;

        @NameInMap("Type")
        public String type;

        public static ScreenChestCTResponseBodyDataScreenBCLesionLesionList build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenBCLesionLesionList self = new ScreenChestCTResponseBodyDataScreenBCLesionLesionList();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenBCLesionLesionList setDiameter(java.util.List<Float> diameter) {
            this.diameter = diameter;
            return this;
        }
        public java.util.List<Float> getDiameter() {
            return this.diameter;
        }

        public ScreenChestCTResponseBodyDataScreenBCLesionLesionList setKeySlice(Integer keySlice) {
            this.keySlice = keySlice;
            return this;
        }
        public Integer getKeySlice() {
            return this.keySlice;
        }

        public ScreenChestCTResponseBodyDataScreenBCLesionLesionList setROIEndpoints(java.util.List<java.util.List<Integer>> ROIEndpoints) {
            this.ROIEndpoints = ROIEndpoints;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getROIEndpoints() {
            return this.ROIEndpoints;
        }

        public ScreenChestCTResponseBodyDataScreenBCLesionLesionList setRecistEndpoints(java.util.List<java.util.List<Integer>> recistEndpoints) {
            this.recistEndpoints = recistEndpoints;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getRecistEndpoints() {
            return this.recistEndpoints;
        }

        public ScreenChestCTResponseBodyDataScreenBCLesionLesionList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenBCLesionOrganList extends TeaModel {
        @NameInMap("Diameter")
        public java.util.List<Float> diameter;

        @NameInMap("KeySlice")
        public Integer keySlice;

        @NameInMap("ROIEndpoints")
        public java.util.List<java.util.List<Integer>> ROIEndpoints;

        @NameInMap("RecistEndpoints")
        public java.util.List<java.util.List<Integer>> recistEndpoints;

        @NameInMap("Type")
        public String type;

        public static ScreenChestCTResponseBodyDataScreenBCLesionOrganList build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenBCLesionOrganList self = new ScreenChestCTResponseBodyDataScreenBCLesionOrganList();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenBCLesionOrganList setDiameter(java.util.List<Float> diameter) {
            this.diameter = diameter;
            return this;
        }
        public java.util.List<Float> getDiameter() {
            return this.diameter;
        }

        public ScreenChestCTResponseBodyDataScreenBCLesionOrganList setKeySlice(Integer keySlice) {
            this.keySlice = keySlice;
            return this;
        }
        public Integer getKeySlice() {
            return this.keySlice;
        }

        public ScreenChestCTResponseBodyDataScreenBCLesionOrganList setROIEndpoints(java.util.List<java.util.List<Integer>> ROIEndpoints) {
            this.ROIEndpoints = ROIEndpoints;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getROIEndpoints() {
            return this.ROIEndpoints;
        }

        public ScreenChestCTResponseBodyDataScreenBCLesionOrganList setRecistEndpoints(java.util.List<java.util.List<Integer>> recistEndpoints) {
            this.recistEndpoints = recistEndpoints;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getRecistEndpoints() {
            return this.recistEndpoints;
        }

        public ScreenChestCTResponseBodyDataScreenBCLesionOrganList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenBCLesionRight extends TeaModel {
        @NameInMap("BCVolume")
        public String BCVolume;

        @NameInMap("BreastVolume")
        public String breastVolume;

        @NameInMap("Probabilities")
        public java.util.List<String> probabilities;

        public static ScreenChestCTResponseBodyDataScreenBCLesionRight build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenBCLesionRight self = new ScreenChestCTResponseBodyDataScreenBCLesionRight();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenBCLesionRight setBCVolume(String BCVolume) {
            this.BCVolume = BCVolume;
            return this;
        }
        public String getBCVolume() {
            return this.BCVolume;
        }

        public ScreenChestCTResponseBodyDataScreenBCLesionRight setBreastVolume(String breastVolume) {
            this.breastVolume = breastVolume;
            return this;
        }
        public String getBreastVolume() {
            return this.breastVolume;
        }

        public ScreenChestCTResponseBodyDataScreenBCLesionRight setProbabilities(java.util.List<String> probabilities) {
            this.probabilities = probabilities;
            return this;
        }
        public java.util.List<String> getProbabilities() {
            return this.probabilities;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenBCLesion extends TeaModel {
        @NameInMap("Left")
        public ScreenChestCTResponseBodyDataScreenBCLesionLeft left;

        @NameInMap("LesionList")
        public java.util.List<ScreenChestCTResponseBodyDataScreenBCLesionLesionList> lesionList;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("OrganList")
        public java.util.List<ScreenChestCTResponseBodyDataScreenBCLesionOrganList> organList;

        @NameInMap("Right")
        public ScreenChestCTResponseBodyDataScreenBCLesionRight right;

        public static ScreenChestCTResponseBodyDataScreenBCLesion build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenBCLesion self = new ScreenChestCTResponseBodyDataScreenBCLesion();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenBCLesion setLeft(ScreenChestCTResponseBodyDataScreenBCLesionLeft left) {
            this.left = left;
            return this;
        }
        public ScreenChestCTResponseBodyDataScreenBCLesionLeft getLeft() {
            return this.left;
        }

        public ScreenChestCTResponseBodyDataScreenBCLesion setLesionList(java.util.List<ScreenChestCTResponseBodyDataScreenBCLesionLesionList> lesionList) {
            this.lesionList = lesionList;
            return this;
        }
        public java.util.List<ScreenChestCTResponseBodyDataScreenBCLesionLesionList> getLesionList() {
            return this.lesionList;
        }

        public ScreenChestCTResponseBodyDataScreenBCLesion setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public ScreenChestCTResponseBodyDataScreenBCLesion setOrganList(java.util.List<ScreenChestCTResponseBodyDataScreenBCLesionOrganList> organList) {
            this.organList = organList;
            return this;
        }
        public java.util.List<ScreenChestCTResponseBodyDataScreenBCLesionOrganList> getOrganList() {
            return this.organList;
        }

        public ScreenChestCTResponseBodyDataScreenBCLesion setRight(ScreenChestCTResponseBodyDataScreenBCLesionRight right) {
            this.right = right;
            return this;
        }
        public ScreenChestCTResponseBodyDataScreenBCLesionRight getRight() {
            return this.right;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenBC extends TeaModel {
        @NameInMap("Lesion")
        public ScreenChestCTResponseBodyDataScreenBCLesion lesion;

        @NameInMap("SeriesInstanceUid")
        public String seriesInstanceUid;

        public static ScreenChestCTResponseBodyDataScreenBC build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenBC self = new ScreenChestCTResponseBodyDataScreenBC();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenBC setLesion(ScreenChestCTResponseBodyDataScreenBCLesion lesion) {
            this.lesion = lesion;
            return this;
        }
        public ScreenChestCTResponseBodyDataScreenBCLesion getLesion() {
            return this.lesion;
        }

        public ScreenChestCTResponseBodyDataScreenBC setSeriesInstanceUid(String seriesInstanceUid) {
            this.seriesInstanceUid = seriesInstanceUid;
            return this;
        }
        public String getSeriesInstanceUid() {
            return this.seriesInstanceUid;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenCRCLesionLesionList extends TeaModel {
        @NameInMap("Diameter")
        public java.util.List<Float> diameter;

        @NameInMap("KeySlice")
        public Integer keySlice;

        @NameInMap("ROIEndpoints")
        public java.util.List<java.util.List<Integer>> ROIEndpoints;

        @NameInMap("RecistEndpoints")
        public java.util.List<java.util.List<Integer>> recistEndpoints;

        @NameInMap("Type")
        public String type;

        public static ScreenChestCTResponseBodyDataScreenCRCLesionLesionList build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenCRCLesionLesionList self = new ScreenChestCTResponseBodyDataScreenCRCLesionLesionList();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenCRCLesionLesionList setDiameter(java.util.List<Float> diameter) {
            this.diameter = diameter;
            return this;
        }
        public java.util.List<Float> getDiameter() {
            return this.diameter;
        }

        public ScreenChestCTResponseBodyDataScreenCRCLesionLesionList setKeySlice(Integer keySlice) {
            this.keySlice = keySlice;
            return this;
        }
        public Integer getKeySlice() {
            return this.keySlice;
        }

        public ScreenChestCTResponseBodyDataScreenCRCLesionLesionList setROIEndpoints(java.util.List<java.util.List<Integer>> ROIEndpoints) {
            this.ROIEndpoints = ROIEndpoints;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getROIEndpoints() {
            return this.ROIEndpoints;
        }

        public ScreenChestCTResponseBodyDataScreenCRCLesionLesionList setRecistEndpoints(java.util.List<java.util.List<Integer>> recistEndpoints) {
            this.recistEndpoints = recistEndpoints;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getRecistEndpoints() {
            return this.recistEndpoints;
        }

        public ScreenChestCTResponseBodyDataScreenCRCLesionLesionList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenCRCLesionOrganList extends TeaModel {
        @NameInMap("Diameter")
        public java.util.List<Float> diameter;

        @NameInMap("KeySlice")
        public Integer keySlice;

        @NameInMap("ROIEndpoints")
        public java.util.List<java.util.List<Integer>> ROIEndpoints;

        @NameInMap("RecistEndpoints")
        public java.util.List<java.util.List<Integer>> recistEndpoints;

        @NameInMap("Type")
        public String type;

        public static ScreenChestCTResponseBodyDataScreenCRCLesionOrganList build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenCRCLesionOrganList self = new ScreenChestCTResponseBodyDataScreenCRCLesionOrganList();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenCRCLesionOrganList setDiameter(java.util.List<Float> diameter) {
            this.diameter = diameter;
            return this;
        }
        public java.util.List<Float> getDiameter() {
            return this.diameter;
        }

        public ScreenChestCTResponseBodyDataScreenCRCLesionOrganList setKeySlice(Integer keySlice) {
            this.keySlice = keySlice;
            return this;
        }
        public Integer getKeySlice() {
            return this.keySlice;
        }

        public ScreenChestCTResponseBodyDataScreenCRCLesionOrganList setROIEndpoints(java.util.List<java.util.List<Integer>> ROIEndpoints) {
            this.ROIEndpoints = ROIEndpoints;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getROIEndpoints() {
            return this.ROIEndpoints;
        }

        public ScreenChestCTResponseBodyDataScreenCRCLesionOrganList setRecistEndpoints(java.util.List<java.util.List<Integer>> recistEndpoints) {
            this.recistEndpoints = recistEndpoints;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getRecistEndpoints() {
            return this.recistEndpoints;
        }

        public ScreenChestCTResponseBodyDataScreenCRCLesionOrganList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenCRCLesion extends TeaModel {
        @NameInMap("ColorectumVolume")
        public String colorectumVolume;

        @NameInMap("LesionList")
        public java.util.List<ScreenChestCTResponseBodyDataScreenCRCLesionLesionList> lesionList;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("OrganList")
        public java.util.List<ScreenChestCTResponseBodyDataScreenCRCLesionOrganList> organList;

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

        public ScreenChestCTResponseBodyDataScreenCRCLesion setLesionList(java.util.List<ScreenChestCTResponseBodyDataScreenCRCLesionLesionList> lesionList) {
            this.lesionList = lesionList;
            return this;
        }
        public java.util.List<ScreenChestCTResponseBodyDataScreenCRCLesionLesionList> getLesionList() {
            return this.lesionList;
        }

        public ScreenChestCTResponseBodyDataScreenCRCLesion setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public ScreenChestCTResponseBodyDataScreenCRCLesion setOrganList(java.util.List<ScreenChestCTResponseBodyDataScreenCRCLesionOrganList> organList) {
            this.organList = organList;
            return this;
        }
        public java.util.List<ScreenChestCTResponseBodyDataScreenCRCLesionOrganList> getOrganList() {
            return this.organList;
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

    public static class ScreenChestCTResponseBodyDataScreenEcLesionLesionList extends TeaModel {
        @NameInMap("Diameter")
        public java.util.List<Float> diameter;

        @NameInMap("KeySlice")
        public Integer keySlice;

        @NameInMap("ROIEndpoints")
        public java.util.List<java.util.List<Integer>> ROIEndpoints;

        @NameInMap("RecistEndpoints")
        public java.util.List<java.util.List<Integer>> recistEndpoints;

        @NameInMap("Type")
        public String type;

        public static ScreenChestCTResponseBodyDataScreenEcLesionLesionList build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenEcLesionLesionList self = new ScreenChestCTResponseBodyDataScreenEcLesionLesionList();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenEcLesionLesionList setDiameter(java.util.List<Float> diameter) {
            this.diameter = diameter;
            return this;
        }
        public java.util.List<Float> getDiameter() {
            return this.diameter;
        }

        public ScreenChestCTResponseBodyDataScreenEcLesionLesionList setKeySlice(Integer keySlice) {
            this.keySlice = keySlice;
            return this;
        }
        public Integer getKeySlice() {
            return this.keySlice;
        }

        public ScreenChestCTResponseBodyDataScreenEcLesionLesionList setROIEndpoints(java.util.List<java.util.List<Integer>> ROIEndpoints) {
            this.ROIEndpoints = ROIEndpoints;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getROIEndpoints() {
            return this.ROIEndpoints;
        }

        public ScreenChestCTResponseBodyDataScreenEcLesionLesionList setRecistEndpoints(java.util.List<java.util.List<Integer>> recistEndpoints) {
            this.recistEndpoints = recistEndpoints;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getRecistEndpoints() {
            return this.recistEndpoints;
        }

        public ScreenChestCTResponseBodyDataScreenEcLesionLesionList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenEcLesionOrganList extends TeaModel {
        @NameInMap("Diameter")
        public java.util.List<Float> diameter;

        @NameInMap("KeySlice")
        public Integer keySlice;

        @NameInMap("ROIEndpoints")
        public java.util.List<java.util.List<Integer>> ROIEndpoints;

        @NameInMap("RecistEndpoints")
        public java.util.List<java.util.List<Integer>> recistEndpoints;

        @NameInMap("Type")
        public String type;

        public static ScreenChestCTResponseBodyDataScreenEcLesionOrganList build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenEcLesionOrganList self = new ScreenChestCTResponseBodyDataScreenEcLesionOrganList();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenEcLesionOrganList setDiameter(java.util.List<Float> diameter) {
            this.diameter = diameter;
            return this;
        }
        public java.util.List<Float> getDiameter() {
            return this.diameter;
        }

        public ScreenChestCTResponseBodyDataScreenEcLesionOrganList setKeySlice(Integer keySlice) {
            this.keySlice = keySlice;
            return this;
        }
        public Integer getKeySlice() {
            return this.keySlice;
        }

        public ScreenChestCTResponseBodyDataScreenEcLesionOrganList setROIEndpoints(java.util.List<java.util.List<Integer>> ROIEndpoints) {
            this.ROIEndpoints = ROIEndpoints;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getROIEndpoints() {
            return this.ROIEndpoints;
        }

        public ScreenChestCTResponseBodyDataScreenEcLesionOrganList setRecistEndpoints(java.util.List<java.util.List<Integer>> recistEndpoints) {
            this.recistEndpoints = recistEndpoints;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getRecistEndpoints() {
            return this.recistEndpoints;
        }

        public ScreenChestCTResponseBodyDataScreenEcLesionOrganList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenEcLesion extends TeaModel {
        @NameInMap("BenignVolume")
        public String benignVolume;

        @NameInMap("EcVolume")
        public String ecVolume;

        @NameInMap("EgjVolume")
        public String egjVolume;

        @NameInMap("EsoVolume")
        public String esoVolume;

        @NameInMap("LesionList")
        public java.util.List<ScreenChestCTResponseBodyDataScreenEcLesionLesionList> lesionList;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("OrganList")
        public java.util.List<ScreenChestCTResponseBodyDataScreenEcLesionOrganList> organList;

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

        public ScreenChestCTResponseBodyDataScreenEcLesion setEgjVolume(String egjVolume) {
            this.egjVolume = egjVolume;
            return this;
        }
        public String getEgjVolume() {
            return this.egjVolume;
        }

        public ScreenChestCTResponseBodyDataScreenEcLesion setEsoVolume(String esoVolume) {
            this.esoVolume = esoVolume;
            return this;
        }
        public String getEsoVolume() {
            return this.esoVolume;
        }

        public ScreenChestCTResponseBodyDataScreenEcLesion setLesionList(java.util.List<ScreenChestCTResponseBodyDataScreenEcLesionLesionList> lesionList) {
            this.lesionList = lesionList;
            return this;
        }
        public java.util.List<ScreenChestCTResponseBodyDataScreenEcLesionLesionList> getLesionList() {
            return this.lesionList;
        }

        public ScreenChestCTResponseBodyDataScreenEcLesion setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public ScreenChestCTResponseBodyDataScreenEcLesion setOrganList(java.util.List<ScreenChestCTResponseBodyDataScreenEcLesionOrganList> organList) {
            this.organList = organList;
            return this;
        }
        public java.util.List<ScreenChestCTResponseBodyDataScreenEcLesionOrganList> getOrganList() {
            return this.organList;
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

    public static class ScreenChestCTResponseBodyDataScreenGCLesionLesionList extends TeaModel {
        @NameInMap("Diameter")
        public java.util.List<Float> diameter;

        @NameInMap("KeySlice")
        public Integer keySlice;

        @NameInMap("ROIEndpoints")
        public java.util.List<java.util.List<Integer>> ROIEndpoints;

        @NameInMap("RecistEndpoints")
        public java.util.List<java.util.List<Integer>> recistEndpoints;

        @NameInMap("Type")
        public String type;

        public static ScreenChestCTResponseBodyDataScreenGCLesionLesionList build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenGCLesionLesionList self = new ScreenChestCTResponseBodyDataScreenGCLesionLesionList();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenGCLesionLesionList setDiameter(java.util.List<Float> diameter) {
            this.diameter = diameter;
            return this;
        }
        public java.util.List<Float> getDiameter() {
            return this.diameter;
        }

        public ScreenChestCTResponseBodyDataScreenGCLesionLesionList setKeySlice(Integer keySlice) {
            this.keySlice = keySlice;
            return this;
        }
        public Integer getKeySlice() {
            return this.keySlice;
        }

        public ScreenChestCTResponseBodyDataScreenGCLesionLesionList setROIEndpoints(java.util.List<java.util.List<Integer>> ROIEndpoints) {
            this.ROIEndpoints = ROIEndpoints;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getROIEndpoints() {
            return this.ROIEndpoints;
        }

        public ScreenChestCTResponseBodyDataScreenGCLesionLesionList setRecistEndpoints(java.util.List<java.util.List<Integer>> recistEndpoints) {
            this.recistEndpoints = recistEndpoints;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getRecistEndpoints() {
            return this.recistEndpoints;
        }

        public ScreenChestCTResponseBodyDataScreenGCLesionLesionList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenGCLesionOrganList extends TeaModel {
        @NameInMap("Diameter")
        public java.util.List<Float> diameter;

        @NameInMap("KeySlice")
        public Integer keySlice;

        @NameInMap("ROIEndpoints")
        public java.util.List<java.util.List<Integer>> ROIEndpoints;

        @NameInMap("RecistEndpoints")
        public java.util.List<java.util.List<Integer>> recistEndpoints;

        @NameInMap("Type")
        public String type;

        public static ScreenChestCTResponseBodyDataScreenGCLesionOrganList build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenGCLesionOrganList self = new ScreenChestCTResponseBodyDataScreenGCLesionOrganList();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenGCLesionOrganList setDiameter(java.util.List<Float> diameter) {
            this.diameter = diameter;
            return this;
        }
        public java.util.List<Float> getDiameter() {
            return this.diameter;
        }

        public ScreenChestCTResponseBodyDataScreenGCLesionOrganList setKeySlice(Integer keySlice) {
            this.keySlice = keySlice;
            return this;
        }
        public Integer getKeySlice() {
            return this.keySlice;
        }

        public ScreenChestCTResponseBodyDataScreenGCLesionOrganList setROIEndpoints(java.util.List<java.util.List<Integer>> ROIEndpoints) {
            this.ROIEndpoints = ROIEndpoints;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getROIEndpoints() {
            return this.ROIEndpoints;
        }

        public ScreenChestCTResponseBodyDataScreenGCLesionOrganList setRecistEndpoints(java.util.List<java.util.List<Integer>> recistEndpoints) {
            this.recistEndpoints = recistEndpoints;
            return this;
        }
        public java.util.List<java.util.List<Integer>> getRecistEndpoints() {
            return this.recistEndpoints;
        }

        public ScreenChestCTResponseBodyDataScreenGCLesionOrganList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenGCLesion extends TeaModel {
        @NameInMap("GCVolume")
        public String GCVolume;

        @NameInMap("LesionList")
        public java.util.List<ScreenChestCTResponseBodyDataScreenGCLesionLesionList> lesionList;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("NonGCVolume")
        public String nonGCVolume;

        @NameInMap("OrganList")
        public java.util.List<ScreenChestCTResponseBodyDataScreenGCLesionOrganList> organList;

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

        public ScreenChestCTResponseBodyDataScreenGCLesion setLesionList(java.util.List<ScreenChestCTResponseBodyDataScreenGCLesionLesionList> lesionList) {
            this.lesionList = lesionList;
            return this;
        }
        public java.util.List<ScreenChestCTResponseBodyDataScreenGCLesionLesionList> getLesionList() {
            return this.lesionList;
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

        public ScreenChestCTResponseBodyDataScreenGCLesion setOrganList(java.util.List<ScreenChestCTResponseBodyDataScreenGCLesionOrganList> organList) {
            this.organList = organList;
            return this;
        }
        public java.util.List<ScreenChestCTResponseBodyDataScreenGCLesionOrganList> getOrganList() {
            return this.organList;
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

    public static class ScreenChestCTResponseBodyDataScreenLCLesionLesionListScoreAllClasses extends TeaModel {
        @NameInMap("BenignProb")
        public Float benignProb;

        @NameInMap("CalcProb")
        public Float calcProb;

        @NameInMap("CystProb")
        public Float cystProb;

        @NameInMap("MalignantProb")
        public Float malignantProb;

        public static ScreenChestCTResponseBodyDataScreenLCLesionLesionListScoreAllClasses build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataScreenLCLesionLesionListScoreAllClasses self = new ScreenChestCTResponseBodyDataScreenLCLesionLesionListScoreAllClasses();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataScreenLCLesionLesionListScoreAllClasses setBenignProb(Float benignProb) {
            this.benignProb = benignProb;
            return this;
        }
        public Float getBenignProb() {
            return this.benignProb;
        }

        public ScreenChestCTResponseBodyDataScreenLCLesionLesionListScoreAllClasses setCalcProb(Float calcProb) {
            this.calcProb = calcProb;
            return this;
        }
        public Float getCalcProb() {
            return this.calcProb;
        }

        public ScreenChestCTResponseBodyDataScreenLCLesionLesionListScoreAllClasses setCystProb(Float cystProb) {
            this.cystProb = cystProb;
            return this;
        }
        public Float getCystProb() {
            return this.cystProb;
        }

        public ScreenChestCTResponseBodyDataScreenLCLesionLesionListScoreAllClasses setMalignantProb(Float malignantProb) {
            this.malignantProb = malignantProb;
            return this;
        }
        public Float getMalignantProb() {
            return this.malignantProb;
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

        @NameInMap("ScoreAllClasses")
        public ScreenChestCTResponseBodyDataScreenLCLesionLesionListScoreAllClasses scoreAllClasses;

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

        public ScreenChestCTResponseBodyDataScreenLCLesionLesionList setScoreAllClasses(ScreenChestCTResponseBodyDataScreenLCLesionLesionListScoreAllClasses scoreAllClasses) {
            this.scoreAllClasses = scoreAllClasses;
            return this;
        }
        public ScreenChestCTResponseBodyDataScreenLCLesionLesionListScoreAllClasses getScoreAllClasses() {
            return this.scoreAllClasses;
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

        @NameInMap("BenignProb")
        public String benignProb;

        @NameInMap("CalcProb")
        public String calcProb;

        @NameInMap("CystProb")
        public String cystProb;

        @NameInMap("HCCProb")
        public String HCCProb;

        @NameInMap("MalignantNonHCCProb")
        public String malignantNonHCCProb;

        @NameInMap("MalignantProb")
        public String malignantProb;

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

        public ScreenChestCTResponseBodyDataScreenLCLesionPatientLevelResult setBenignProb(String benignProb) {
            this.benignProb = benignProb;
            return this;
        }
        public String getBenignProb() {
            return this.benignProb;
        }

        public ScreenChestCTResponseBodyDataScreenLCLesionPatientLevelResult setCalcProb(String calcProb) {
            this.calcProb = calcProb;
            return this;
        }
        public String getCalcProb() {
            return this.calcProb;
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

        public ScreenChestCTResponseBodyDataScreenLCLesionPatientLevelResult setMalignantProb(String malignantProb) {
            this.malignantProb = malignantProb;
            return this;
        }
        public String getMalignantProb() {
            return this.malignantProb;
        }

    }

    public static class ScreenChestCTResponseBodyDataScreenLCLesion extends TeaModel {
        @NameInMap("LesionList")
        public java.util.List<ScreenChestCTResponseBodyDataScreenLCLesionLesionList> lesionList;

        @NameInMap("LiverVolume")
        public String liverVolume;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("PatientLevelProb")
        public Float patientLevelProb;

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

        public ScreenChestCTResponseBodyDataScreenLCLesion setPatientLevelProb(Float patientLevelProb) {
            this.patientLevelProb = patientLevelProb;
            return this;
        }
        public Float getPatientLevelProb() {
            return this.patientLevelProb;
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

        @NameInMap("DetectAD")
        public ScreenChestCTResponseBodyDataDetectAD detectAD;

        @NameInMap("DetectLiverSteatosis")
        public ScreenChestCTResponseBodyDataDetectLiverSteatosis detectLiverSteatosis;

        @NameInMap("DetectLymph")
        public ScreenChestCTResponseBodyDataDetectLymph detectLymph;

        @NameInMap("DetectPdac")
        public ScreenChestCTResponseBodyDataDetectPdac detectPdac;

        @NameInMap("DetectRibFracture")
        public ScreenChestCTResponseBodyDataDetectRibFracture detectRibFracture;

        /**
         * <strong>example:</strong>
         * <p>Failed to execute [cacs,covid]</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("LungNodule")
        public ScreenChestCTResponseBodyDataLungNodule lungNodule;

        @NameInMap("MuscleFat")
        public ScreenChestCTResponseBodyDataMuscleFat muscleFat;

        /**
         * <strong>example:</strong>
         * <p><a href="https://medclients-sh.oss-cn-shanghai.aliyuncs.com/demo/coronacases_org_001/1.2.112.92121.1.1689.19.2.2020040219072764787101585825****.dcm">https://medclients-sh.oss-cn-shanghai.aliyuncs.com/demo/coronacases_org_001/1.2.112.92121.1.1689.19.2.2020040219072764787101585825****.dcm</a></p>
         */
        @NameInMap("NestedUrlList")
        public java.util.Map<String, ?> nestedUrlList;

        @NameInMap("PredictCVD")
        public ScreenChestCTResponseBodyDataPredictCVD predictCVD;

        @NameInMap("ScreenBC")
        public ScreenChestCTResponseBodyDataScreenBC screenBC;

        @NameInMap("ScreenCRC")
        public ScreenChestCTResponseBodyDataScreenCRC screenCRC;

        @NameInMap("ScreenEc")
        public ScreenChestCTResponseBodyDataScreenEc screenEc;

        @NameInMap("ScreenGC")
        public ScreenChestCTResponseBodyDataScreenGC screenGC;

        @NameInMap("ScreenLC")
        public ScreenChestCTResponseBodyDataScreenLC screenLC;

        /**
         * <strong>example:</strong>
         * <p><a href="https://medclients-sh.oss-cn-shanghai.aliyuncs.com/demo/coronacases_org_001/1.2.112.92121.1.1689.19.2.2020040219072764787101585825****.dcm">https://medclients-sh.oss-cn-shanghai.aliyuncs.com/demo/coronacases_org_001/1.2.112.92121.1.1689.19.2.2020040219072764787101585825****.dcm</a></p>
         */
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

        public ScreenChestCTResponseBodyData setDetectAD(ScreenChestCTResponseBodyDataDetectAD detectAD) {
            this.detectAD = detectAD;
            return this;
        }
        public ScreenChestCTResponseBodyDataDetectAD getDetectAD() {
            return this.detectAD;
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

        public ScreenChestCTResponseBodyData setMuscleFat(ScreenChestCTResponseBodyDataMuscleFat muscleFat) {
            this.muscleFat = muscleFat;
            return this;
        }
        public ScreenChestCTResponseBodyDataMuscleFat getMuscleFat() {
            return this.muscleFat;
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

        public ScreenChestCTResponseBodyData setScreenBC(ScreenChestCTResponseBodyDataScreenBC screenBC) {
            this.screenBC = screenBC;
            return this;
        }
        public ScreenChestCTResponseBodyDataScreenBC getScreenBC() {
            return this.screenBC;
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
