// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectLungNoduleResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectLungNoduleResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectLungNoduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectLungNoduleResponseBody self = new DetectLungNoduleResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectLungNoduleResponseBody setData(DetectLungNoduleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectLungNoduleResponseBodyData getData() {
        return this.data;
    }

    public DetectLungNoduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectLungNoduleResponseBodyDataSeriesElements extends TeaModel {
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

        public static DetectLungNoduleResponseBodyDataSeriesElements build(java.util.Map<String, ?> map) throws Exception {
            DetectLungNoduleResponseBodyDataSeriesElements self = new DetectLungNoduleResponseBodyDataSeriesElements();
            return TeaModel.build(map, self);
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setDiameter(Float diameter) {
            this.diameter = diameter;
            return this;
        }
        public Float getDiameter() {
            return this.diameter;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setImageX(Float imageX) {
            this.imageX = imageX;
            return this;
        }
        public Float getImageX() {
            return this.imageX;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setImageY(Float imageY) {
            this.imageY = imageY;
            return this;
        }
        public Float getImageY() {
            return this.imageY;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setImageZ(Float imageZ) {
            this.imageZ = imageZ;
            return this;
        }
        public Float getImageZ() {
            return this.imageZ;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setLobe(String lobe) {
            this.lobe = lobe;
            return this;
        }
        public String getLobe() {
            return this.lobe;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setLung(String lung) {
            this.lung = lung;
            return this;
        }
        public String getLung() {
            return this.lung;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setMeanValue(Float meanValue) {
            this.meanValue = meanValue;
            return this;
        }
        public Float getMeanValue() {
            return this.meanValue;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setSOPInstanceUID(String SOPInstanceUID) {
            this.SOPInstanceUID = SOPInstanceUID;
            return this;
        }
        public String getSOPInstanceUID() {
            return this.SOPInstanceUID;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setVolume(Float volume) {
            this.volume = volume;
            return this;
        }
        public Float getVolume() {
            return this.volume;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setZ(Float z) {
            this.z = z;
            return this;
        }
        public Float getZ() {
            return this.z;
        }

    }

    public static class DetectLungNoduleResponseBodyDataSeries extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectLungNoduleResponseBodyDataSeriesElements> elements;

        @NameInMap("Origin")
        public java.util.List<Float> origin;

        @NameInMap("Report")
        public String report;

        @NameInMap("SeriesInstanceUid")
        public String seriesInstanceUid;

        @NameInMap("Spacing")
        public java.util.List<Float> spacing;

        public static DetectLungNoduleResponseBodyDataSeries build(java.util.Map<String, ?> map) throws Exception {
            DetectLungNoduleResponseBodyDataSeries self = new DetectLungNoduleResponseBodyDataSeries();
            return TeaModel.build(map, self);
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

        public DetectLungNoduleResponseBodyDataSeries setSeriesInstanceUid(String seriesInstanceUid) {
            this.seriesInstanceUid = seriesInstanceUid;
            return this;
        }
        public String getSeriesInstanceUid() {
            return this.seriesInstanceUid;
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
