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

    public static class ScreenChestCTResponseBodyData extends TeaModel {
        @NameInMap("AnalyzeChestVessel")
        public ScreenChestCTResponseBodyDataAnalyzeChestVessel analyzeChestVessel;

        @NameInMap("CACS")
        public ScreenChestCTResponseBodyDataCACS CACS;

        @NameInMap("Covid")
        public ScreenChestCTResponseBodyDataCovid covid;

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

        @NameInMap("ScreenEc")
        public ScreenChestCTResponseBodyDataScreenEc screenEc;

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

        public ScreenChestCTResponseBodyData setCovid(ScreenChestCTResponseBodyDataCovid covid) {
            this.covid = covid;
            return this;
        }
        public ScreenChestCTResponseBodyDataCovid getCovid() {
            return this.covid;
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

        public ScreenChestCTResponseBodyData setScreenEc(ScreenChestCTResponseBodyDataScreenEc screenEc) {
            this.screenEc = screenEc;
            return this;
        }
        public ScreenChestCTResponseBodyDataScreenEc getScreenEc() {
            return this.screenEc;
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
