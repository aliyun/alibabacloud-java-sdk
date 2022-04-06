// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenChestCTResponseBody extends TeaModel {
    @NameInMap("Data")
    public ScreenChestCTResponseBodyData data;

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

    public ScreenChestCTResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ScreenChestCTResponseBodyDataAnalyzeChestVesselAortaInfo extends TeaModel {
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

    public static class ScreenChestCTResponseBodyDataCACS extends TeaModel {
        @NameInMap("ResultUrl")
        public String resultUrl;

        @NameInMap("Score")
        public String score;

        public static ScreenChestCTResponseBodyDataCACS build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataCACS self = new ScreenChestCTResponseBodyDataCACS();
            return TeaModel.build(map, self);
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

    }

    public static class ScreenChestCTResponseBodyDataDetectRibFractureDetections extends TeaModel {
        @NameInMap("CoordinateImage")
        public java.util.List<Long> coordinateImage;

        @NameInMap("Coordinates")
        public java.util.List<Long> coordinates;

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

        @NameInMap("Origin")
        public java.util.List<Float> origin;

        @NameInMap("ResultURL")
        public String resultURL;

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

        @NameInMap("MeanValue")
        public Float meanValue;

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

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setMeanValue(Float meanValue) {
            this.meanValue = meanValue;
            return this;
        }
        public Float getMeanValue() {
            return this.meanValue;
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

    public static class ScreenChestCTResponseBodyData extends TeaModel {
        @NameInMap("AnalyzeChestVessel")
        public ScreenChestCTResponseBodyDataAnalyzeChestVessel analyzeChestVessel;

        @NameInMap("CACS")
        public ScreenChestCTResponseBodyDataCACS CACS;

        @NameInMap("Covid")
        public ScreenChestCTResponseBodyDataCovid covid;

        @NameInMap("DetectRibFracture")
        public ScreenChestCTResponseBodyDataDetectRibFracture detectRibFracture;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("LungNodule")
        public ScreenChestCTResponseBodyDataLungNodule lungNodule;

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

    }

}
