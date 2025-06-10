// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class CalcBMDResponseBody extends TeaModel {
    @NameInMap("Data")
    public CalcBMDResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>B48DECE6-29FE-1967-92F1-2E072873851A</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>0.78</p>
         */
        @NameInMap("VertBMD")
        public Float vertBMD;

        /**
         * <strong>example:</strong>
         * <p>NaN</p>
         */
        @NameInMap("VertCategory")
        public Float vertCategory;

        /**
         * <strong>example:</strong>
         * <p>L1</p>
         */
        @NameInMap("VertId")
        public String vertId;

        /**
         * <strong>example:</strong>
         * <p>-2.5</p>
         */
        @NameInMap("VertTScore")
        public Float vertTScore;

        /**
         * <strong>example:</strong>
         * <p>NaN</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/calc-bmd/local_test/2023-03-31/7772ECE3-22A7-193F-81B4-B0D6A02B5DAF-result.tgz?Expires=1680486509&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=GWi%2BhCCtamefKVYiS9oZJduswH">http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/calc-bmd/local_test/2023-03-31/7772ECE3-22A7-193F-81B4-B0D6A02B5DAF-result.tgz?Expires=1680486509&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=GWi%2BhCCtamefKVYiS9oZJduswH</a>****</p>
         */
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
