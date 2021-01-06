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
        @NameInMap("Z")
        public Float z;

        @NameInMap("Lobe")
        public String lobe;

        @NameInMap("MeanValue")
        public Float meanValue;

        @NameInMap("ImageZ")
        public Float imageZ;

        @NameInMap("Lung")
        public String lung;

        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("SOPInstanceUID")
        public String SOPInstanceUID;

        @NameInMap("ImageX")
        public Float imageX;

        @NameInMap("Y")
        public Float y;

        @NameInMap("Category")
        public String category;

        @NameInMap("Volume")
        public Float volume;

        @NameInMap("ImageY")
        public Float imageY;

        @NameInMap("Diameter")
        public Float diameter;

        @NameInMap("X")
        public Float x;

        public static ScreenChestCTResponseBodyDataLungNoduleSeriesElements build(java.util.Map<String, ?> map) throws Exception {
            ScreenChestCTResponseBodyDataLungNoduleSeriesElements self = new ScreenChestCTResponseBodyDataLungNoduleSeriesElements();
            return TeaModel.build(map, self);
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setZ(Float z) {
            this.z = z;
            return this;
        }
        public Float getZ() {
            return this.z;
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

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setImageZ(Float imageZ) {
            this.imageZ = imageZ;
            return this;
        }
        public Float getImageZ() {
            return this.imageZ;
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

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setImageX(Float imageX) {
            this.imageX = imageX;
            return this;
        }
        public Float getImageX() {
            return this.imageX;
        }

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
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

        public ScreenChestCTResponseBodyDataLungNoduleSeriesElements setImageY(Float imageY) {
            this.imageY = imageY;
            return this;
        }
        public Float getImageY() {
            return this.imageY;
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

    public static class ScreenChestCTResponseBodyData extends TeaModel {
        @NameInMap("LungNodule")
        public ScreenChestCTResponseBodyDataLungNodule lungNodule;

        @NameInMap("CACS")
        public ScreenChestCTResponseBodyDataCACS CACS;

        @NameInMap("Covid")
        public ScreenChestCTResponseBodyDataCovid covid;

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

    }

}
