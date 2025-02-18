// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VoiceModerationResultResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public VoiceModerationResultResponseBodyData data;

    /**
     * <p>The message that is returned in response to the request.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2881AD4F-638B-52A3-BA20-F74C5B1CEAE3</p>
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
        @NameInMap("Descriptions")
        public String descriptions;

        /**
         * <p>The end time of the audio segment in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The end timestamp of the segment. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1678854649720</p>
         */
        @NameInMap("EndTimestamp")
        public Long endTimestamp;

        /**
         * <p>Extended fields.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;riskTips\&quot;:\&quot;sexuality_Suggestive\&quot;,\&quot;riskWords\&quot;:\&quot;pxxxxy\&quot;}</p>
         */
        @NameInMap("Extend")
        public String extend;

        /**
         * <p>The details of the labels.</p>
         * 
         * <strong>example:</strong>
         * <p>sexual_sounds</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>Reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("OriginAlgoResult")
        public java.util.Map<String, ?> originAlgoResult;

        /**
         * <p>Risk Level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The details of the risky content.</p>
         * 
         * <strong>example:</strong>
         * <p>sexuality_Suggestive</p>
         */
        @NameInMap("RiskTips")
        public String riskTips;

        /**
         * <p>The term hit by the risky content.</p>
         * 
         * <strong>example:</strong>
         * <p>AAA,BBB,CCC</p>
         */
        @NameInMap("RiskWords")
        public String riskWords;

        /**
         * <p>The risk score. Default range: 0 to 99.</p>
         * 
         * <strong>example:</strong>
         * <p>87.01</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <p>The start time of the audio segment in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The start timestamp of the segment. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1678854649720</p>
         */
        @NameInMap("StartTimestamp")
        public Long startTimestamp;

        /**
         * <p>The text converted from the audio segment.</p>
         * 
         * <strong>example:</strong>
         * <p>Disgusting</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The temporary URL of the audio segment.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyundoc.com">https://aliyundoc.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static VoiceModerationResultResponseBodyDataSliceDetails build(java.util.Map<String, ?> map) throws Exception {
            VoiceModerationResultResponseBodyDataSliceDetails self = new VoiceModerationResultResponseBodyDataSliceDetails();
            return TeaModel.build(map, self);
        }

        public VoiceModerationResultResponseBodyDataSliceDetails setDescriptions(String descriptions) {
            this.descriptions = descriptions;
            return this;
        }
        public String getDescriptions() {
            return this.descriptions;
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

        public VoiceModerationResultResponseBodyDataSliceDetails setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
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
        /**
         * <p>The ID of the moderated object.</p>
         * 
         * <strong>example:</strong>
         * <p>26769ada6e264e7ba9aa048241e12be9</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>The unique ID of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>liveId</p>
         */
        @NameInMap("LiveId")
        public String liveId;

        /**
         * <p>Risk Level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The moderation results of audio segments.</p>
         */
        @NameInMap("SliceDetails")
        public java.util.List<VoiceModerationResultResponseBodyDataSliceDetails> sliceDetails;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>kw24ihd0WGkdi5nniVZM@qOj-1x5Ibb</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The URL of the moderated content.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyundoc.com">https://aliyundoc.com</a></p>
         */
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

        public VoiceModerationResultResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
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
