// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenChestCTResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ScreenChestCTResponseBodyData data;

    public static ScreenChestCTResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScreenChestCTResponseBody self = new ScreenChestCTResponseBody();
        return TeaModel.build(map, self);
    }

    public ScreenChestCTResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScreenChestCTResponseBody setData(ScreenChestCTResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ScreenChestCTResponseBodyData getData() {
        return this.data;
    }

    public static class ScreenChestCTResponseBodyDataLungNoduleSeriesElements extends TeaModel {
        @NameInMap("Lobe")
        public String lobe;

        @NameInMap("MeanValue")
        public Float meanValue;

        @NameInMap("Lung")
        public String lung;

        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("SOPInstanceUID")
        public String SOPInstanceUID;

        @NameInMap("Category")
        public String category;

        @NameInMap("Volume")
        public Float volume;

        @NameInMap("Diameter")
        public Float diameter;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        @NameInMap("Z")
        public Float z;

        @NameInMap("ImageX")
        public Float imageX;

        @NameInMap("ImageY")
        public Float imageY;

        @NameInMap("ImageZ")
        public Float imageZ;

        public static ScreenChestCTResponseBodyDataLungNoduleSeriesElements build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataLungNoduleSeriesElements self = new ScreenChestCTResponseBodyDataLungNoduleSeriesElements();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setLobe(String lobe) {
            this.lobe = lobe;
            return this;
        }
        public String getLobe() {
            return this.lobe;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setMeanValue(Float meanValue) {
            this.meanValue = meanValue;
            return this;
        }
        public Float getMeanValue() {
            return this.meanValue;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setLung(String lung) {
            this.lung = lung;
            return this;
        }
        public String getLung() {
            return this.lung;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setSOPInstanceUID(String SOPInstanceUID) {
            this.SOPInstanceUID = SOPInstanceUID;
            return this;
        }
        public String getSOPInstanceUID() {
            return this.SOPInstanceUID;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setVolume(Float volume) {
            this.volume = volume;
            return this;
        }
        public Float getVolume() {
            return this.volume;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setDiameter(Float diameter) {
            this.diameter = diameter;
            return this;
        }
        public Float getDiameter() {
            return this.diameter;
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

    }

    public static class ScreenChestCTResponseBodyDataLungNoduleSeries extends TeaModel {
        @NameInMap("SeriesInstanceUid")
        public String seriesInstanceUid;

        @NameInMap("Elements")
        public java.util.List<ScreenChestCTResponseBodyDataLungNoduleSeriesElements> elements;

        @NameInMap("Origin")
        public java.util.List<Float> origin;

        @NameInMap("Report")
        public String report;

        @NameInMap("Spacing")
        public java.util.List<Float> spacing;

        public static ScreenChestCTResponseBodyDataLungNoduleSeries build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataLungNoduleSeries self = new ScreenChestCTResponseBodyDataLungNoduleSeries();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeries setSeriesInstanceUid(String seriesInstanceUid) {
            this.seriesInstanceUid = seriesInstanceUid;
            return this;
        }
        public String getSeriesInstanceUid() {
            return this.seriesInstanceUid;
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
        @NameInMap("NormalProbability")
        public String normalProbability;

        @NameInMap("NewProbability")
        public String newProbability;

        @NameInMap("LesionRatio")
        public String lesionRatio;

        @NameInMap("OtherProbability")
        public String otherProbability;

        @NameInMap("Mask")
        public String mask;

        public static ScreenChestCTResponseBodyDataCovid build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataCovid self = new ScreenChestCTResponseBodyDataCovid();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataCovid setNormalProbability(String normalProbability) {
            this.normalProbability = normalProbability;
            return this;
        }
        public String getNormalProbability() {
            return this.normalProbability;
        }

        public ScreenChestCTResponseBodyDataCovid setNewProbability(String newProbability) {
            this.newProbability = newProbability;
            return this;
        }
        public String getNewProbability() {
            return this.newProbability;
        }

        public ScreenChestCTResponseBodyDataCovid setLesionRatio(String lesionRatio) {
            this.lesionRatio = lesionRatio;
            return this;
        }
        public String getLesionRatio() {
            return this.lesionRatio;
        }

        public ScreenChestCTResponseBodyDataCovid setOtherProbability(String otherProbability) {
            this.otherProbability = otherProbability;
            return this;
        }
        public String getOtherProbability() {
            return this.otherProbability;
        }

        public ScreenChestCTResponseBodyDataCovid setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

    }

    public static class ScreenChestCTResponseBodyDataDetectRibFractureDetections extends TeaModel {
        @NameInMap("FractureId")
        public Long fractureId;

        @NameInMap("FractureConfidence")
        public Float fractureConfidence;

        @NameInMap("FractureCategory")
        public Long fractureCategory;

        @NameInMap("Coordinates")
        public java.util.List<Long> coordinates;

        @NameInMap("CoordinateImage")
        public java.util.List<Long> coordinateImage;

        @NameInMap("FractureLocation")
        public String fractureLocation;

        @NameInMap("FractureSegment")
        public Long fractureSegment;

        public static ScreenChestCTResponseBodyDataDetectRibFractureDetections build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataDetectRibFractureDetections self = new ScreenChestCTResponseBodyDataDetectRibFractureDetections();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataDetectRibFractureDetections setFractureId(Long fractureId) {
            this.fractureId = fractureId;
            return this;
        }
        public Long getFractureId() {
            return this.fractureId;
        }

        public ScreenChestCTResponseBodyDataDetectRibFractureDetections setFractureConfidence(Float fractureConfidence) {
            this.fractureConfidence = fractureConfidence;
            return this;
        }
        public Float getFractureConfidence() {
            return this.fractureConfidence;
        }

        public ScreenChestCTResponseBodyDataDetectRibFractureDetections setFractureCategory(Long fractureCategory) {
            this.fractureCategory = fractureCategory;
            return this;
        }
        public Long getFractureCategory() {
            return this.fractureCategory;
        }

        public ScreenChestCTResponseBodyDataDetectRibFractureDetections setCoordinates(java.util.List<Long> coordinates) {
            this.coordinates = coordinates;
            return this;
        }
        public java.util.List<Long> getCoordinates() {
            return this.coordinates;
        }

        public ScreenChestCTResponseBodyDataDetectRibFractureDetections setCoordinateImage(java.util.List<Long> coordinateImage) {
            this.coordinateImage = coordinateImage;
            return this;
        }
        public java.util.List<Long> getCoordinateImage() {
            return this.coordinateImage;
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
        @NameInMap("ResultURL")
        public String resultURL;

        @NameInMap("Spacing")
        public java.util.List<Float> spacing;

        @NameInMap("Origin")
        public java.util.List<Float> origin;

        @NameInMap("Detections")
        public java.util.List<ScreenChestCTResponseBodyDataDetectRibFractureDetections> detections;

        public static ScreenChestCTResponseBodyDataDetectRibFracture build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataDetectRibFracture self = new ScreenChestCTResponseBodyDataDetectRibFracture();
            return TeaModel.build(map, self);
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

        public ScreenChestCTResponseBodyDataDetectRibFracture setOrigin(java.util.List<Float> origin) {
            this.origin = origin;
            return this;
        }
        public java.util.List<Float> getOrigin() {
            return this.origin;
        }

        public ScreenChestCTResponseBodyDataDetectRibFracture setDetections(java.util.List<ScreenChestCTResponseBodyDataDetectRibFractureDetections> detections) {
            this.detections = detections;
            return this;
        }
        public java.util.List<ScreenChestCTResponseBodyDataDetectRibFractureDetections> getDetections() {
            return this.detections;
        }

    }

    public static class ScreenChestCTResponseBodyData extends TeaModel {
        @NameInMap("LungNodule")
        public ScreenChestCTResponseBodyDataLungNodule lungNodule;

        @NameInMap("CACS")
        public ScreenChestCTResponseBodyDataCACS CACS;

        @NameInMap("Covid")
        public ScreenChestCTResponseBodyDataCovid covid;

        @NameInMap("DetectRibFracture")
        public ScreenChestCTResponseBodyDataDetectRibFracture detectRibFracture;

        public static ScreenChestCTResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyData self = new ScreenChestCTResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyData setLungNodule(ScreenChestCTResponseBodyDataLungNodule lungNodule) {
            this.lungNodule = lungNodule;
            return this;
        }
        public ScreenChestCTResponseBodyDataLungNodule getLungNodule() {
            return this.lungNodule;
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

    }

}
