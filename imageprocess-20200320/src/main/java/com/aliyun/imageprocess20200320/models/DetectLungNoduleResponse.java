// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectLungNoduleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectLungNoduleResponseData data;

    public static DetectLungNoduleResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectLungNoduleResponse self = new DetectLungNoduleResponse();
        return TeaModel.build(map, self);
    }

    public DetectLungNoduleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectLungNoduleResponse setData(DetectLungNoduleResponseData data) {
        this.data = data;
        return this;
    }
    public DetectLungNoduleResponseData getData() {
        return this.data;
    }

    public static class DetectLungNoduleResponseDataSeriesElements extends TeaModel {
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

        public static DetectLungNoduleResponseDataSeriesElements build(java.util.Map<String, ?> map) throws Exception {
            DetectLungNoduleResponseDataSeriesElements self = new DetectLungNoduleResponseDataSeriesElements();
            return TeaModel.build(map, self);
        }

        public DetectLungNoduleResponseDataSeriesElements setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DetectLungNoduleResponseDataSeriesElements setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public DetectLungNoduleResponseDataSeriesElements setDiameter(Float diameter) {
            this.diameter = diameter;
            return this;
        }
        public Float getDiameter() {
            return this.diameter;
        }

        public DetectLungNoduleResponseDataSeriesElements setLobe(String lobe) {
            this.lobe = lobe;
            return this;
        }
        public String getLobe() {
            return this.lobe;
        }

        public DetectLungNoduleResponseDataSeriesElements setLung(String lung) {
            this.lung = lung;
            return this;
        }
        public String getLung() {
            return this.lung;
        }

        public DetectLungNoduleResponseDataSeriesElements setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public DetectLungNoduleResponseDataSeriesElements setZ(Float z) {
            this.z = z;
            return this;
        }
        public Float getZ() {
            return this.z;
        }

        public DetectLungNoduleResponseDataSeriesElements setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class DetectLungNoduleResponseDataSeries extends TeaModel {
        @NameInMap("SeriesInstanceUid")
        @Validation(required = true)
        public String seriesInstanceUid;

        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<DetectLungNoduleResponseDataSeriesElements> elements;

        public static DetectLungNoduleResponseDataSeries build(java.util.Map<String, ?> map) throws Exception {
            DetectLungNoduleResponseDataSeries self = new DetectLungNoduleResponseDataSeries();
            return TeaModel.build(map, self);
        }

        public DetectLungNoduleResponseDataSeries setSeriesInstanceUid(String seriesInstanceUid) {
            this.seriesInstanceUid = seriesInstanceUid;
            return this;
        }
        public String getSeriesInstanceUid() {
            return this.seriesInstanceUid;
        }

        public DetectLungNoduleResponseDataSeries setElements(java.util.List<DetectLungNoduleResponseDataSeriesElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectLungNoduleResponseDataSeriesElements> getElements() {
            return this.elements;
        }

    }

    public static class DetectLungNoduleResponseData extends TeaModel {
        @NameInMap("Series")
        @Validation(required = true)
        public java.util.List<DetectLungNoduleResponseDataSeries> series;

        public static DetectLungNoduleResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectLungNoduleResponseData self = new DetectLungNoduleResponseData();
            return TeaModel.build(map, self);
        }

        public DetectLungNoduleResponseData setSeries(java.util.List<DetectLungNoduleResponseDataSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DetectLungNoduleResponseDataSeries> getSeries() {
            return this.series;
        }

    }

}
