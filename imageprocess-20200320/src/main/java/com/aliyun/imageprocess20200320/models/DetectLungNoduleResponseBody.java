// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectLungNoduleResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectLungNoduleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9889ef5b-b973-4dd0-9f26-3b9cc489c436</p>
     */
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

    public DetectLungNoduleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetectLungNoduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectLungNoduleResponseBodyDataSeriesElements extends TeaModel {
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
         * <p>20.434030793471255</p>
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

        /**
         * <p>结节最大径位置所在帧的ID标识。</p>
         * 
         * <strong>example:</strong>
         * <p>1.3.6.1.4.1.14519.5.2.1.6279.6001.468208655866166788627471660948</p>
         */
        @NameInMap("RecistSOPInstanceUID")
        public String recistSOPInstanceUID;

        /**
         * <p>结节为恶性的置信度。取值范围0~1。</p>
         * 
         * <strong>example:</strong>
         * <p>0.173</p>
         */
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

        public DetectLungNoduleResponseBodyDataSeriesElements setMajorAxis(java.util.List<Float> majorAxis) {
            this.majorAxis = majorAxis;
            return this;
        }
        public java.util.List<Float> getMajorAxis() {
            return this.majorAxis;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setMeanValue(Float meanValue) {
            this.meanValue = meanValue;
            return this;
        }
        public Float getMeanValue() {
            return this.meanValue;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setMinorAxis(java.util.List<Float> minorAxis) {
            this.minorAxis = minorAxis;
            return this;
        }
        public java.util.List<Float> getMinorAxis() {
            return this.minorAxis;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setRecistSOPInstanceUID(String recistSOPInstanceUID) {
            this.recistSOPInstanceUID = recistSOPInstanceUID;
            return this;
        }
        public String getRecistSOPInstanceUID() {
            return this.recistSOPInstanceUID;
        }

        public DetectLungNoduleResponseBodyDataSeriesElements setRisk(Float risk) {
            this.risk = risk;
            return this;
        }
        public Float getRisk() {
            return this.risk;
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

        /**
         * <p>1</p>
         */
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

        /**
         * <p>1</p>
         */
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
