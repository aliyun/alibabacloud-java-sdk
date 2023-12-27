// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VideoModerationResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public VideoModerationResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VideoModerationResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VideoModerationResultResponseBody self = new VideoModerationResultResponseBody();
        return TeaModel.build(map, self);
    }

    public VideoModerationResultResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public VideoModerationResultResponseBody setData(VideoModerationResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VideoModerationResultResponseBodyData getData() {
        return this.data;
    }

    public VideoModerationResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VideoModerationResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class VideoModerationResultResponseBodyDataAudioResultAudioSummarys extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("LabelSum")
        public Integer labelSum;

        public static VideoModerationResultResponseBodyDataAudioResultAudioSummarys build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataAudioResultAudioSummarys self = new VideoModerationResultResponseBodyDataAudioResultAudioSummarys();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataAudioResultAudioSummarys setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public VideoModerationResultResponseBodyDataAudioResultAudioSummarys setLabelSum(Integer labelSum) {
            this.labelSum = labelSum;
            return this;
        }
        public Integer getLabelSum() {
            return this.labelSum;
        }

    }

    public static class VideoModerationResultResponseBodyDataAudioResultSliceDetails extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("EndTimestamp")
        public Long endTimestamp;

        @NameInMap("Extend")
        public String extend;

        @NameInMap("Labels")
        public String labels;

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

        public static VideoModerationResultResponseBodyDataAudioResultSliceDetails build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataAudioResultSliceDetails self = new VideoModerationResultResponseBodyDataAudioResultSliceDetails();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetails setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetails setEndTimestamp(Long endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }
        public Long getEndTimestamp() {
            return this.endTimestamp;
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetails setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetails setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetails setRiskTips(String riskTips) {
            this.riskTips = riskTips;
            return this;
        }
        public String getRiskTips() {
            return this.riskTips;
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetails setRiskWords(String riskWords) {
            this.riskWords = riskWords;
            return this;
        }
        public String getRiskWords() {
            return this.riskWords;
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetails setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetails setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetails setStartTimestamp(Long startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }
        public Long getStartTimestamp() {
            return this.startTimestamp;
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetails setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetails setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class VideoModerationResultResponseBodyDataAudioResult extends TeaModel {
        @NameInMap("AudioSummarys")
        public java.util.List<VideoModerationResultResponseBodyDataAudioResultAudioSummarys> audioSummarys;

        @NameInMap("SliceDetails")
        public java.util.List<VideoModerationResultResponseBodyDataAudioResultSliceDetails> sliceDetails;

        public static VideoModerationResultResponseBodyDataAudioResult build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataAudioResult self = new VideoModerationResultResponseBodyDataAudioResult();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataAudioResult setAudioSummarys(java.util.List<VideoModerationResultResponseBodyDataAudioResultAudioSummarys> audioSummarys) {
            this.audioSummarys = audioSummarys;
            return this;
        }
        public java.util.List<VideoModerationResultResponseBodyDataAudioResultAudioSummarys> getAudioSummarys() {
            return this.audioSummarys;
        }

        public VideoModerationResultResponseBodyDataAudioResult setSliceDetails(java.util.List<VideoModerationResultResponseBodyDataAudioResultSliceDetails> sliceDetails) {
            this.sliceDetails = sliceDetails;
            return this;
        }
        public java.util.List<VideoModerationResultResponseBodyDataAudioResultSliceDetails> getSliceDetails() {
            return this.sliceDetails;
        }

    }

    public static class VideoModerationResultResponseBodyDataFrameResultFrameSummarys extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("LabelSum")
        public Integer labelSum;

        public static VideoModerationResultResponseBodyDataFrameResultFrameSummarys build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataFrameResultFrameSummarys self = new VideoModerationResultResponseBodyDataFrameResultFrameSummarys();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataFrameResultFrameSummarys setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public VideoModerationResultResponseBodyDataFrameResultFrameSummarys setLabelSum(Integer labelSum) {
            this.labelSum = labelSum;
            return this;
        }
        public Integer getLabelSum() {
            return this.labelSum;
        }

    }

    public static class VideoModerationResultResponseBodyDataFrameResultFramesResultsResult extends TeaModel {
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Label")
        public String label;

        public static VideoModerationResultResponseBodyDataFrameResultFramesResultsResult build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataFrameResultFramesResultsResult self = new VideoModerationResultResponseBodyDataFrameResultFramesResultsResult();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsResult setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class VideoModerationResultResponseBodyDataFrameResultFramesResults extends TeaModel {
        @NameInMap("Result")
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsResult> result;

        @NameInMap("Service")
        public String service;

        public static VideoModerationResultResponseBodyDataFrameResultFramesResults build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataFrameResultFramesResults self = new VideoModerationResultResponseBodyDataFrameResultFramesResults();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResults setResult(java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsResult> getResult() {
            return this.result;
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResults setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

    }

    public static class VideoModerationResultResponseBodyDataFrameResultFrames extends TeaModel {
        @NameInMap("Offset")
        public Float offset;

        @NameInMap("Results")
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResults> results;

        @NameInMap("TempUrl")
        public String tempUrl;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static VideoModerationResultResponseBodyDataFrameResultFrames build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataFrameResultFrames self = new VideoModerationResultResponseBodyDataFrameResultFrames();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataFrameResultFrames setOffset(Float offset) {
            this.offset = offset;
            return this;
        }
        public Float getOffset() {
            return this.offset;
        }

        public VideoModerationResultResponseBodyDataFrameResultFrames setResults(java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResults> getResults() {
            return this.results;
        }

        public VideoModerationResultResponseBodyDataFrameResultFrames setTempUrl(String tempUrl) {
            this.tempUrl = tempUrl;
            return this;
        }
        public String getTempUrl() {
            return this.tempUrl;
        }

        public VideoModerationResultResponseBodyDataFrameResultFrames setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class VideoModerationResultResponseBodyDataFrameResult extends TeaModel {
        @NameInMap("FrameNum")
        public Integer frameNum;

        @NameInMap("FrameSummarys")
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFrameSummarys> frameSummarys;

        @NameInMap("Frames")
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFrames> frames;

        public static VideoModerationResultResponseBodyDataFrameResult build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataFrameResult self = new VideoModerationResultResponseBodyDataFrameResult();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataFrameResult setFrameNum(Integer frameNum) {
            this.frameNum = frameNum;
            return this;
        }
        public Integer getFrameNum() {
            return this.frameNum;
        }

        public VideoModerationResultResponseBodyDataFrameResult setFrameSummarys(java.util.List<VideoModerationResultResponseBodyDataFrameResultFrameSummarys> frameSummarys) {
            this.frameSummarys = frameSummarys;
            return this;
        }
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFrameSummarys> getFrameSummarys() {
            return this.frameSummarys;
        }

        public VideoModerationResultResponseBodyDataFrameResult setFrames(java.util.List<VideoModerationResultResponseBodyDataFrameResultFrames> frames) {
            this.frames = frames;
            return this;
        }
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFrames> getFrames() {
            return this.frames;
        }

    }

    public static class VideoModerationResultResponseBodyData extends TeaModel {
        @NameInMap("AudioResult")
        public VideoModerationResultResponseBodyDataAudioResult audioResult;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("FrameResult")
        public VideoModerationResultResponseBodyDataFrameResult frameResult;

        @NameInMap("LiveId")
        public String liveId;

        public static VideoModerationResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyData self = new VideoModerationResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyData setAudioResult(VideoModerationResultResponseBodyDataAudioResult audioResult) {
            this.audioResult = audioResult;
            return this;
        }
        public VideoModerationResultResponseBodyDataAudioResult getAudioResult() {
            return this.audioResult;
        }

        public VideoModerationResultResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public VideoModerationResultResponseBodyData setFrameResult(VideoModerationResultResponseBodyDataFrameResult frameResult) {
            this.frameResult = frameResult;
            return this;
        }
        public VideoModerationResultResponseBodyDataFrameResult getFrameResult() {
            return this.frameResult;
        }

        public VideoModerationResultResponseBodyData setLiveId(String liveId) {
            this.liveId = liveId;
            return this;
        }
        public String getLiveId() {
            return this.liveId;
        }

    }

}
