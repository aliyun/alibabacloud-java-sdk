// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class CalcCACSResponseBody extends TeaModel {
    @NameInMap("Data")
    public CalcCACSResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6797D285-9290-4FBB-9742-AA1E286EF3B9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CalcCACSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CalcCACSResponseBody self = new CalcCACSResponseBody();
        return TeaModel.build(map, self);
    }

    public CalcCACSResponseBody setData(CalcCACSResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CalcCACSResponseBodyData getData() {
        return this.data;
    }

    public CalcCACSResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CalcCACSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CalcCACSResponseBodyDataDetections extends TeaModel {
        @NameInMap("CalciumCenter")
        public java.util.List<Long> calciumCenter;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CalciumId")
        public Long calciumId;

        /**
         * <strong>example:</strong>
         * <p>19.22474</p>
         */
        @NameInMap("CalciumScore")
        public Float calciumScore;

        /**
         * <strong>example:</strong>
         * <p>28.837109</p>
         */
        @NameInMap("CalciumVolume")
        public Float calciumVolume;

        public static CalcCACSResponseBodyDataDetections build(java.util.Map<String, ?> map) throws Exception {
            CalcCACSResponseBodyDataDetections self = new CalcCACSResponseBodyDataDetections();
            return TeaModel.build(map, self);
        }

        public CalcCACSResponseBodyDataDetections setCalciumCenter(java.util.List<Long> calciumCenter) {
            this.calciumCenter = calciumCenter;
            return this;
        }
        public java.util.List<Long> getCalciumCenter() {
            return this.calciumCenter;
        }

        public CalcCACSResponseBodyDataDetections setCalciumId(Long calciumId) {
            this.calciumId = calciumId;
            return this;
        }
        public Long getCalciumId() {
            return this.calciumId;
        }

        public CalcCACSResponseBodyDataDetections setCalciumScore(Float calciumScore) {
            this.calciumScore = calciumScore;
            return this;
        }
        public Float getCalciumScore() {
            return this.calciumScore;
        }

        public CalcCACSResponseBodyDataDetections setCalciumVolume(Float calciumVolume) {
            this.calciumVolume = calciumVolume;
            return this;
        }
        public Float getCalciumVolume() {
            return this.calciumVolume;
        }

    }

    public static class CalcCACSResponseBodyData extends TeaModel {
        @NameInMap("Detections")
        public java.util.List<CalcCACSResponseBodyDataDetections> detections;

        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/calc-cacs/2020-09-29/2020-09-29-11%3A07%3A41-D74FE0DF-8F80-41EB-B08B-2E67053587EC.tar.gz?Expires=1601350661&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=iB16ms28Y5mzB11ghYUd7upCi4">http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/calc-cacs/2020-09-29/2020-09-29-11%3A07%3A41-D74FE0DF-8F80-41EB-B08B-2E67053587EC.tar.gz?Expires=1601350661&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=iB16ms28Y5mzB11ghYUd7upCi4</a>****</p>
         */
        @NameInMap("ResultUrl")
        public String resultUrl;

        /**
         * <strong>example:</strong>
         * <p>117.61</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <strong>example:</strong>
         * <p>111.96</p>
         */
        @NameInMap("VolumeScore")
        public String volumeScore;

        public static CalcCACSResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CalcCACSResponseBodyData self = new CalcCACSResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CalcCACSResponseBodyData setDetections(java.util.List<CalcCACSResponseBodyDataDetections> detections) {
            this.detections = detections;
            return this;
        }
        public java.util.List<CalcCACSResponseBodyDataDetections> getDetections() {
            return this.detections;
        }

        public CalcCACSResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

        public CalcCACSResponseBodyData setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public CalcCACSResponseBodyData setVolumeScore(String volumeScore) {
            this.volumeScore = volumeScore;
            return this;
        }
        public String getVolumeScore() {
            return this.volumeScore;
        }

    }

}
