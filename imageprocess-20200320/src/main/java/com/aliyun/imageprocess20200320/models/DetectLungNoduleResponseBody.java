// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectLungNoduleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectLungNoduleResponseBodyData data;

    public static DetectLungNoduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectLungNoduleResponseBody self = new DetectLungNoduleResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectLungNoduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectLungNoduleResponseBody setData(DetectLungNoduleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectLungNoduleResponseBodyData getData() {
        return this.data;
    }

    public static class DetectLungNoduleResponseBodyDataSeriesElements extends TeaModel {
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

        public static DetectLungNoduleResponseBodyDataSeriesElements build(java.util.Map<String, ?> map) throws Exception {
            DetectLungNoduleResponseBodyDataSeriesElements self = new DetectLungNoduleResponseBodyDataSeriesElements();
            return TeaModel.build(map, self);
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setZ(Float z) {
            this.z = z;
            return this;
        }
        public Float getZ() {
            return this.z;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setLobe(String lobe) {
            this.lobe = lobe;
            return this;
        }
        public String getLobe() {
            return this.lobe;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setMeanValue(Float meanValue) {
            this.meanValue = meanValue;
            return this;
        }
        public Float getMeanValue() {
            return this.meanValue;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setImageZ(Float imageZ) {
            this.imageZ = imageZ;
            return this;
        }
        public Float getImageZ() {
            return this.imageZ;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setLung(String lung) {
            this.lung = lung;
            return this;
        }
        public String getLung() {
            return this.lung;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setSOPInstanceUID(String SOPInstanceUID) {
            this.SOPInstanceUID = SOPInstanceUID;
            return this;
        }
        public String getSOPInstanceUID() {
            return this.SOPInstanceUID;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setImageX(Float imageX) {
            this.imageX = imageX;
            return this;
        }
        public Float getImageX() {
            return this.imageX;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setVolume(Float volume) {
            this.volume = volume;
            return this;
        }
        public Float getVolume() {
            return this.volume;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setImageY(Float imageY) {
            this.imageY = imageY;
            return this;
        }
        public Float getImageY() {
            return this.imageY;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setDiameter(Float diameter) {
            this.diameter = diameter;
            return this;
        }
        public Float getDiameter() {
            return this.diameter;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

    }

    public static class DetectLungNoduleResponseBodyDataSeries extends TeaModel {
        @NameInMap("SeriesInstanceUid")
        public String seriesInstanceUid;

        @NameInMap("Elements")
        public java.util.List<DetectLungNoduleResponseBodyDataSeriesElements> elements;

        @NameInMap("Origin")
        public java.util.List<Float> origin;

        @NameInMap("Report")
        public String report;

        @NameInMap("Spacing")
        public java.util.List<Float> spacing;

        public static DetectLungNoduleResponseBodyDataSeries build(java.util.Map<String, ?> map) throws Exception {
            DetectLungNoduleResponseBodyDataSeries self = new DetectLungNoduleResponseBodyDataSeries();
            return TeaModel.build(map, self);
        }

        public DetectLungNoduleResponseBodyDataSeries setSeriesInstanceUid(String seriesInstanceUid) {
            this.seriesInstanceUid = seriesInstanceUid;
            return this;
        }
        public String getSeriesInstanceUid() {
            return this.seriesInstanceUid;
        }

        public DetectLungNoduleResponseBodyDataSeries setElements(java.util.List<DetectLungNoduleResponseBodyDataSeriesElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectLungNoduleResponseBodyDataSeriesElements> getElements() {
            return this.elements;
        }

        public DetectLungNoduleResponseBodyDataSeries setOrigin(java.util.List<Float> origin) {
            this.origin = origin;
            return this;
        }
        public java.util.List<Float> getOrigin() {
            return this.origin;
        }

        public DetectLungNoduleResponseBodyDataSeries setReport(String report) {
            this.report = report;
            return this;
        }
        public String getReport() {
            return this.report;
        }

        public DetectLungNoduleResponseBodyDataSeries setSpacing(java.util.List<Float> spacing) {
            this.spacing = spacing;
            return this;
        }
        public java.util.List<Float> getSpacing() {
            return this.spacing;
        }

    }

    public static class DetectLungNoduleResponseBodyData extends TeaModel {
        @NameInMap("Series")
        public java.util.List<DetectLungNoduleResponseBodyDataSeries> series;

        public static DetectLungNoduleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectLungNoduleResponseBodyData self = new DetectLungNoduleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectLungNoduleResponseBodyData setSeries(java.util.List<DetectLungNoduleResponseBodyDataSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DetectLungNoduleResponseBodyDataSeries> getSeries() {
            return this.series;
        }

    }

}
