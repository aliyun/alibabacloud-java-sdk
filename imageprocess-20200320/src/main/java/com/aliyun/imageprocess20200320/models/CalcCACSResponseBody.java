// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class CalcCACSResponseBody extends TeaModel {
    @NameInMap("Data")
    public CalcCACSResponseBodyData data;

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

        @NameInMap("CalciumId")
        public Long calciumId;

        @NameInMap("CalciumScore")
        public Float calciumScore;

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

        @NameInMap("ResultUrl")
        public String resultUrl;

        @NameInMap("Score")
        public String score;

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
