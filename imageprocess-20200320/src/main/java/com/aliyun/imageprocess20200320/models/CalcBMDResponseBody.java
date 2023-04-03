// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class CalcBMDResponseBody extends TeaModel {
    @NameInMap("Data")
    public CalcBMDResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CalcBMDResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CalcBMDResponseBody self = new CalcBMDResponseBody();
        return TeaModel.build(map, self);
    }

    public CalcBMDResponseBody setData(CalcBMDResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CalcBMDResponseBodyData getData() {
        return this.data;
    }

    public CalcBMDResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CalcBMDResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CalcBMDResponseBodyDataDetections extends TeaModel {
        @NameInMap("VertBMD")
        public Float vertBMD;

        @NameInMap("VertCategory")
        public Float vertCategory;

        @NameInMap("VertId")
        public String vertId;

        @NameInMap("VertTScore")
        public Float vertTScore;

        @NameInMap("VertZScore")
        public Float vertZScore;

        public static CalcBMDResponseBodyDataDetections build(java.util.Map<String, ?> map) throws Exception {
            CalcBMDResponseBodyDataDetections self = new CalcBMDResponseBodyDataDetections();
            return TeaModel.build(map, self);
        }

        public CalcBMDResponseBodyDataDetections setVertBMD(Float vertBMD) {
            this.vertBMD = vertBMD;
            return this;
        }
        public Float getVertBMD() {
            return this.vertBMD;
        }

        public CalcBMDResponseBodyDataDetections setVertCategory(Float vertCategory) {
            this.vertCategory = vertCategory;
            return this;
        }
        public Float getVertCategory() {
            return this.vertCategory;
        }

        public CalcBMDResponseBodyDataDetections setVertId(String vertId) {
            this.vertId = vertId;
            return this;
        }
        public String getVertId() {
            return this.vertId;
        }

        public CalcBMDResponseBodyDataDetections setVertTScore(Float vertTScore) {
            this.vertTScore = vertTScore;
            return this;
        }
        public Float getVertTScore() {
            return this.vertTScore;
        }

        public CalcBMDResponseBodyDataDetections setVertZScore(Float vertZScore) {
            this.vertZScore = vertZScore;
            return this;
        }
        public Float getVertZScore() {
            return this.vertZScore;
        }

    }

    public static class CalcBMDResponseBodyData extends TeaModel {
        @NameInMap("Detections")
        public java.util.List<CalcBMDResponseBodyDataDetections> detections;

        @NameInMap("Origin")
        public java.util.List<Float> origin;

        @NameInMap("ResultURL")
        public String resultURL;

        @NameInMap("Spacing")
        public java.util.List<Float> spacing;

        public static CalcBMDResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CalcBMDResponseBodyData self = new CalcBMDResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CalcBMDResponseBodyData setDetections(java.util.List<CalcBMDResponseBodyDataDetections> detections) {
            this.detections = detections;
            return this;
        }
        public java.util.List<CalcBMDResponseBodyDataDetections> getDetections() {
            return this.detections;
        }

        public CalcBMDResponseBodyData setOrigin(java.util.List<Float> origin) {
            this.origin = origin;
            return this;
        }
        public java.util.List<Float> getOrigin() {
            return this.origin;
        }

        public CalcBMDResponseBodyData setResultURL(String resultURL) {
            this.resultURL = resultURL;
            return this;
        }
        public String getResultURL() {
            return this.resultURL;
        }

        public CalcBMDResponseBodyData setSpacing(java.util.List<Float> spacing) {
            this.spacing = spacing;
            return this;
        }
        public java.util.List<Float> getSpacing() {
            return this.spacing;
        }

    }

}
