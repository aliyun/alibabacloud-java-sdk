// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VoiceModerationResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public VoiceModerationResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VoiceModerationResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VoiceModerationResultResponseBody self = new VoiceModerationResultResponseBody();
        return TeaModel.build(map, self);
    }

    public VoiceModerationResultResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public VoiceModerationResultResponseBody setData(VoiceModerationResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VoiceModerationResultResponseBodyData getData() {
        return this.data;
    }

    public VoiceModerationResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VoiceModerationResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class VoiceModerationResultResponseBodyDataSliceDetails extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("EndTimestamp")
        public Long endTimestamp;

        @NameInMap("Extend")
        public String extend;

        @NameInMap("Labels")
        public String labels;

        @NameInMap("OriginAlgoResult")
        public java.util.Map<String, ?> originAlgoResult;

        @NameInMap("RiskTips")
        public String riskTips;

        @NameInMap("RiskWords")
        public String riskWords;

        @NameInMap("Score")
        public Float score;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("StartTimestamp")
        public Long startTimestamp;

        @NameInMap("Text")
        public String text;

        @NameInMap("Url")
        public String url;

        public static VoiceModerationResultResponseBodyDataSliceDetails build(java.util.Map<String, ?> map) throws Exception {
            VoiceModerationResultResponseBodyDataSliceDetails self = new VoiceModerationResultResponseBodyDataSliceDetails();
            return TeaModel.build(map, self);
        }

        public VoiceModerationResultResponseBodyDataSliceDetails setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public VoiceModerationResultResponseBodyDataSliceDetails setEndTimestamp(Long endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }
        public Long getEndTimestamp() {
            return this.endTimestamp;
        }

        public VoiceModerationResultResponseBodyDataSliceDetails setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public VoiceModerationResultResponseBodyDataSliceDetails setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public VoiceModerationResultResponseBodyDataSliceDetails setOriginAlgoResult(java.util.Map<String, ?> originAlgoResult) {
            this.originAlgoResult = originAlgoResult;
            return this;
        }
        public java.util.Map<String, ?> getOriginAlgoResult() {
            return this.originAlgoResult;
        }

        public VoiceModerationResultResponseBodyDataSliceDetails setRiskTips(String riskTips) {
            this.riskTips = riskTips;
            return this;
        }
        public String getRiskTips() {
            return this.riskTips;
        }

        public VoiceModerationResultResponseBodyDataSliceDetails setRiskWords(String riskWords) {
            this.riskWords = riskWords;
            return this;
        }
        public String getRiskWords() {
            return this.riskWords;
        }

        public VoiceModerationResultResponseBodyDataSliceDetails setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public VoiceModerationResultResponseBodyDataSliceDetails setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public VoiceModerationResultResponseBodyDataSliceDetails setStartTimestamp(Long startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }
        public Long getStartTimestamp() {
            return this.startTimestamp;
        }

        public VoiceModerationResultResponseBodyDataSliceDetails setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public VoiceModerationResultResponseBodyDataSliceDetails setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class VoiceModerationResultResponseBodyData extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("LiveId")
        public String liveId;

        @NameInMap("SliceDetails")
        public java.util.List<VoiceModerationResultResponseBodyDataSliceDetails> sliceDetails;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Url")
        public String url;

        public static VoiceModerationResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VoiceModerationResultResponseBodyData self = new VoiceModerationResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VoiceModerationResultResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public VoiceModerationResultResponseBodyData setLiveId(String liveId) {
            this.liveId = liveId;
            return this;
        }
        public String getLiveId() {
            return this.liveId;
        }

        public VoiceModerationResultResponseBodyData setSliceDetails(java.util.List<VoiceModerationResultResponseBodyDataSliceDetails> sliceDetails) {
            this.sliceDetails = sliceDetails;
            return this;
        }
        public java.util.List<VoiceModerationResultResponseBodyDataSliceDetails> getSliceDetails() {
            return this.sliceDetails;
        }

        public VoiceModerationResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public VoiceModerationResultResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
