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

    public static class DetectLungNoduleResponseDataSeriesElements extends TeaModel {
        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        @NameInMap("Confidence")
        @Validation(required = true)
        public Double confidence;

        @NameInMap("Diameter")
        @Validation(required = true)
        public Double diameter;

        @NameInMap("Lobe")
        @Validation(required = true)
        public String lobe;

        @NameInMap("Lung")
        @Validation(required = true)
        public String lung;

        @NameInMap("X")
        @Validation(required = true)
        public Double x;

        @NameInMap("Z")
        @Validation(required = true)
        public Double z;

        @NameInMap("Y")
        @Validation(required = true)
        public Double y;

        public static DetectLungNoduleResponseDataSeriesElements build(java.util.Map<String, ?> map) throws Exception {
            DetectLungNoduleResponseDataSeriesElements self = new DetectLungNoduleResponseDataSeriesElements();
            return TeaModel.build(map, self);
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

    }

    public static class DetectLungNoduleResponseData extends TeaModel {
        @NameInMap("Series")
        @Validation(required = true)
        public java.util.List<DetectLungNoduleResponseDataSeries> series;

        public static DetectLungNoduleResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectLungNoduleResponseData self = new DetectLungNoduleResponseData();
            return TeaModel.build(map, self);
        }

    }

}
