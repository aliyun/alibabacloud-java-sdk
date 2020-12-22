// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenChestCTResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ScreenChestCTResponseData data;

    public static ScreenChestCTResponse build(java.util.Map<String, ?> map) throws Exception {
        ScreenChestCTResponse self = new ScreenChestCTResponse();
        return TeaModel.build(map, self);
    }

    public ScreenChestCTResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScreenChestCTResponse setData(ScreenChestCTResponseData data) {
        this.data = data;
        return this;
    }
    public ScreenChestCTResponseData getData() {
        return this.data;
    }

    public static class ScreenChestCTResponseDataLungNoduleSeriesElements extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("Confidence")
        @Validation(required = true)
        public Float confidence;

        @NameInMap("Diameter")
        @Validation(required = true)
        public Float diameter;

        @NameInMap("Lobe")
        @Validation(required = true)
        public String lobe;

        @NameInMap("Lung")
        @Validation(required = true)
        public String lung;

        @NameInMap("X")
        @Validation(required = true)
        public Float x;

        @NameInMap("Z")
        @Validation(required = true)
        public Float z;

        @NameInMap("Y")
        @Validation(required = true)
        public Float y;

        @NameInMap("ImageX")
        @Validation(required = true)
        public Float imageX;

        @NameInMap("ImageY")
        @Validation(required = true)
        public Float imageY;

        @NameInMap("ImageZ")
        @Validation(required = true)
        public Float imageZ;

        @NameInMap("SOPInstanceUID")
        @Validation(required = true)
        public String SOPInstanceUID;

        @NameInMap("Volume")
        @Validation(required = true)
        public Float volume;

        @NameInMap("MeanValue")
        @Validation(required = true)
        public Float meanValue;

        public static ScreenChestCTResponseDataLungNoduleSeriesElements build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseDataLungNoduleSeriesElements self = new ScreenChestCTResponseDataLungNoduleSeriesElements();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseDataLungNoduleSeriesElements setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ScreenChestCTResponseDataLungNoduleSeriesElements setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public ScreenChestCTResponseDataLungNoduleSeriesElements setDiameter(Float diameter) {
            this.diameter = diameter;
            return this;
        }
        public Float getDiameter() {
            return this.diameter;
        }

        public ScreenChestCTResponseDataLungNoduleSeriesElements setLobe(String lobe) {
            this.lobe = lobe;
            return this;
        }
        public String getLobe() {
            return this.lobe;
        }

        public ScreenChestCTResponseDataLungNoduleSeriesElements setLung(String lung) {
            this.lung = lung;
            return this;
        }
        public String getLung() {
            return this.lung;
        }

        public ScreenChestCTResponseDataLungNoduleSeriesElements setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public ScreenChestCTResponseDataLungNoduleSeriesElements setZ(Float z) {
            this.z = z;
            return this;
        }
        public Float getZ() {
            return this.z;
        }

        public ScreenChestCTResponseDataLungNoduleSeriesElements setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public ScreenChestCTResponseDataLungNoduleSeriesElements setImageX(Float imageX) {
            this.imageX = imageX;
            return this;
        }
        public Float getImageX() {
            return this.imageX;
        }

        public ScreenChestCTResponseDataLungNoduleSeriesElements setImageY(Float imageY) {
            this.imageY = imageY;
            return this;
        }
        public Float getImageY() {
            return this.imageY;
        }

        public ScreenChestCTResponseDataLungNoduleSeriesElements setImageZ(Float imageZ) {
            this.imageZ = imageZ;
            return this;
        }
        public Float getImageZ() {
            return this.imageZ;
        }

        public ScreenChestCTResponseDataLungNoduleSeriesElements setSOPInstanceUID(String SOPInstanceUID) {
            this.SOPInstanceUID = SOPInstanceUID;
            return this;
        }
        public String getSOPInstanceUID() {
            return this.SOPInstanceUID;
        }

        public ScreenChestCTResponseDataLungNoduleSeriesElements setVolume(Float volume) {
            this.volume = volume;
            return this;
        }
        public Float getVolume() {
            return this.volume;
        }

        public ScreenChestCTResponseDataLungNoduleSeriesElements setMeanValue(Float meanValue) {
            this.meanValue = meanValue;
            return this;
        }
        public Float getMeanValue() {
            return this.meanValue;
        }

    }

    public static class ScreenChestCTResponseDataLungNoduleSeries extends TeaModel {
        @NameInMap("SeriesInstanceUid")
        @Validation(required = true)
        public String seriesInstanceUid;

        @NameInMap("Report")
        @Validation(required = true)
        public String report;

        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<ScreenChestCTResponseDataLungNoduleSeriesElements> elements;

        @NameInMap("Origin")
        @Validation(required = true)
        public java.util.List<Float> origin;

        @NameInMap("Spacing")
        @Validation(required = true)
        public java.util.List<Float> spacing;

        public static ScreenChestCTResponseDataLungNoduleSeries build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseDataLungNoduleSeries self = new ScreenChestCTResponseDataLungNoduleSeries();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseDataLungNoduleSeries setSeriesInstanceUid(String seriesInstanceUid) {
            this.seriesInstanceUid = seriesInstanceUid;
            return this;
        }
        public String getSeriesInstanceUid() {
            return this.seriesInstanceUid;
        }

        public ScreenChestCTResponseDataLungNoduleSeries setReport(String report) {
            this.report = report;
            return this;
        }
        public String getReport() {
            return this.report;
        }

        public ScreenChestCTResponseDataLungNoduleSeries setElements(java.util.List<ScreenChestCTResponseDataLungNoduleSeriesElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<ScreenChestCTResponseDataLungNoduleSeriesElements> getElements() {
            return this.elements;
        }

        public ScreenChestCTResponseDataLungNoduleSeries setOrigin(java.util.List<Float> origin) {
            this.origin = origin;
            return this;
        }
        public java.util.List<Float> getOrigin() {
            return this.origin;
        }

        public ScreenChestCTResponseDataLungNoduleSeries setSpacing(java.util.List<Float> spacing) {
            this.spacing = spacing;
            return this;
        }
        public java.util.List<Float> getSpacing() {
            return this.spacing;
        }

    }

    public static class ScreenChestCTResponseDataLungNodule extends TeaModel {
        @NameInMap("Series")
        @Validation(required = true)
        public java.util.List<ScreenChestCTResponseDataLungNoduleSeries> series;

        public static ScreenChestCTResponseDataLungNodule build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseDataLungNodule self = new ScreenChestCTResponseDataLungNodule();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseDataLungNodule setSeries(java.util.List<ScreenChestCTResponseDataLungNoduleSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<ScreenChestCTResponseDataLungNoduleSeries> getSeries() {
            return this.series;
        }

    }

    public static class ScreenChestCTResponseDataCACS extends TeaModel {
        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        @NameInMap("ResultUrl")
        @Validation(required = true)
        public String resultUrl;

        public static ScreenChestCTResponseDataCACS build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseDataCACS self = new ScreenChestCTResponseDataCACS();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseDataCACS setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public ScreenChestCTResponseDataCACS setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

    }

    public static class ScreenChestCTResponseDataCovid extends TeaModel {
        @NameInMap("NewProbability")
        @Validation(required = true)
        public String newProbability;

        @NameInMap("NormalProbability")
        @Validation(required = true)
        public String normalProbability;

        @NameInMap("OtherProbability")
        @Validation(required = true)
        public String otherProbability;

        @NameInMap("LesionRatio")
        @Validation(required = true)
        public String lesionRatio;

        @NameInMap("Mask")
        @Validation(required = true)
        public String mask;

        public static ScreenChestCTResponseDataCovid build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseDataCovid self = new ScreenChestCTResponseDataCovid();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseDataCovid setNewProbability(String newProbability) {
            this.newProbability = newProbability;
            return this;
        }
        public String getNewProbability() {
            return this.newProbability;
        }

        public ScreenChestCTResponseDataCovid setNormalProbability(String normalProbability) {
            this.normalProbability = normalProbability;
            return this;
        }
        public String getNormalProbability() {
            return this.normalProbability;
        }

        public ScreenChestCTResponseDataCovid setOtherProbability(String otherProbability) {
            this.otherProbability = otherProbability;
            return this;
        }
        public String getOtherProbability() {
            return this.otherProbability;
        }

        public ScreenChestCTResponseDataCovid setLesionRatio(String lesionRatio) {
            this.lesionRatio = lesionRatio;
            return this;
        }
        public String getLesionRatio() {
            return this.lesionRatio;
        }

        public ScreenChestCTResponseDataCovid setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

    }

    public static class ScreenChestCTResponseData extends TeaModel {
        @NameInMap("LungNodule")
        @Validation(required = true)
        public ScreenChestCTResponseDataLungNodule lungNodule;

        @NameInMap("CACS")
        @Validation(required = true)
        public ScreenChestCTResponseDataCACS CACS;

        @NameInMap("Covid")
        @Validation(required = true)
        public ScreenChestCTResponseDataCovid covid;

        public static ScreenChestCTResponseData build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseData self = new ScreenChestCTResponseData();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseData setLungNodule(ScreenChestCTResponseDataLungNodule lungNodule) {
            this.lungNodule = lungNodule;
            return this;
        }
        public ScreenChestCTResponseDataLungNodule getLungNodule() {
            return this.lungNodule;
        }

        public ScreenChestCTResponseData setCACS(ScreenChestCTResponseDataCACS CACS) {
            this.CACS = CACS;
            return this;
        }
        public ScreenChestCTResponseDataCACS getCACS() {
            return this.CACS;
        }

        public ScreenChestCTResponseData setCovid(ScreenChestCTResponseDataCovid covid) {
            this.covid = covid;
            return this;
        }
        public ScreenChestCTResponseDataCovid getCovid() {
            return this.covid;
        }

    }

}
