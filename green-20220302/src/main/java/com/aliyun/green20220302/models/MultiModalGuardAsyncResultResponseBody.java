// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalGuardAsyncResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public MultiModalGuardAsyncResultResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MultiModalGuardAsyncResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MultiModalGuardAsyncResultResponseBody self = new MultiModalGuardAsyncResultResponseBody();
        return TeaModel.build(map, self);
    }

    public MultiModalGuardAsyncResultResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public MultiModalGuardAsyncResultResponseBody setData(MultiModalGuardAsyncResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MultiModalGuardAsyncResultResponseBodyData getData() {
        return this.data;
    }

    public MultiModalGuardAsyncResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MultiModalGuardAsyncResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetailResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Ext")
        public Object ext;

        /**
         * <strong>example:</strong>
         * <p>drug</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("Level")
        public String level;

        public static MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetailResult build(java.util.Map<String, ?> map) throws Exception {
            MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetailResult self = new MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetailResult();
            return TeaModel.build(map, self);
        }

        public MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetailResult setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetailResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetailResult setExt(Object ext) {
            this.ext = ext;
            return this;
        }
        public Object getExt() {
            return this.ext;
        }

        public MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetailResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetailResult setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("Level")
        public String level;

        @NameInMap("Result")
        public java.util.List<MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetailResult> result;

        /**
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <strong>example:</strong>
         * <p>contentModeration</p>
         */
        @NameInMap("Type")
        public String type;

        public static MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetail build(java.util.Map<String, ?> map) throws Exception {
            MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetail self = new MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetail();
            return TeaModel.build(map, self);
        }

        public MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetail setResult(java.util.List<MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetailResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetailResult> getResult() {
            return this.result;
        }

        public MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetail setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetail setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetails extends TeaModel {
        @NameInMap("Detail")
        public java.util.List<MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetail> detail;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxxx.abc.wav">http://xxxx.abc.wav</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetails build(java.util.Map<String, ?> map) throws Exception {
            MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetails self = new MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetails();
            return TeaModel.build(map, self);
        }

        public MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetails setDetail(java.util.List<MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetailsDetail> getDetail() {
            return this.detail;
        }

        public MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetails setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetails setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetails setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetails setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetails setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class MultiModalGuardAsyncResultResponseBodyDataAudioResult extends TeaModel {
        @NameInMap("SliceDetails")
        public java.util.List<MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetails> sliceDetails;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SliceNum")
        public Integer sliceNum;

        /**
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        public static MultiModalGuardAsyncResultResponseBodyDataAudioResult build(java.util.Map<String, ?> map) throws Exception {
            MultiModalGuardAsyncResultResponseBodyDataAudioResult self = new MultiModalGuardAsyncResultResponseBodyDataAudioResult();
            return TeaModel.build(map, self);
        }

        public MultiModalGuardAsyncResultResponseBodyDataAudioResult setSliceDetails(java.util.List<MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetails> sliceDetails) {
            this.sliceDetails = sliceDetails;
            return this;
        }
        public java.util.List<MultiModalGuardAsyncResultResponseBodyDataAudioResultSliceDetails> getSliceDetails() {
            return this.sliceDetails;
        }

        public MultiModalGuardAsyncResultResponseBodyDataAudioResult setSliceNum(Integer sliceNum) {
            this.sliceNum = sliceNum;
            return this;
        }
        public Integer getSliceNum() {
            return this.sliceNum;
        }

        public MultiModalGuardAsyncResultResponseBodyDataAudioResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetailResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Ext")
        public Object ext;

        /**
         * <strong>example:</strong>
         * <p>ad</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>loose</p>
         */
        @NameInMap("Level")
        public String level;

        public static MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetailResult build(java.util.Map<String, ?> map) throws Exception {
            MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetailResult self = new MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetailResult();
            return TeaModel.build(map, self);
        }

        public MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetailResult setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetailResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetailResult setExt(Object ext) {
            this.ext = ext;
            return this;
        }
        public Object getExt() {
            return this.ext;
        }

        public MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetailResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetailResult setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("Level")
        public String level;

        @NameInMap("Result")
        public java.util.List<MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetailResult> result;

        /**
         * <strong>example:</strong>
         * <p>watch</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <strong>example:</strong>
         * <p>contentModeration</p>
         */
        @NameInMap("Type")
        public String type;

        public static MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetail build(java.util.Map<String, ?> map) throws Exception {
            MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetail self = new MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetail();
            return TeaModel.build(map, self);
        }

        public MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetail setResult(java.util.List<MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetailResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetailResult> getResult() {
            return this.result;
        }

        public MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetail setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetail setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MultiModalGuardAsyncResultResponseBodyDataFrameResultFrames extends TeaModel {
        @NameInMap("Detail")
        public java.util.List<MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetail> detail;

        /**
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        @NameInMap("Offset")
        public Float offset;

        /**
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <strong>example:</strong>
         * <p>1684559739000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx.jpeg">https://xxx.jpeg</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static MultiModalGuardAsyncResultResponseBodyDataFrameResultFrames build(java.util.Map<String, ?> map) throws Exception {
            MultiModalGuardAsyncResultResponseBodyDataFrameResultFrames self = new MultiModalGuardAsyncResultResponseBodyDataFrameResultFrames();
            return TeaModel.build(map, self);
        }

        public MultiModalGuardAsyncResultResponseBodyDataFrameResultFrames setDetail(java.util.List<MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<MultiModalGuardAsyncResultResponseBodyDataFrameResultFramesDetail> getDetail() {
            return this.detail;
        }

        public MultiModalGuardAsyncResultResponseBodyDataFrameResultFrames setOffset(Float offset) {
            this.offset = offset;
            return this;
        }
        public Float getOffset() {
            return this.offset;
        }

        public MultiModalGuardAsyncResultResponseBodyDataFrameResultFrames setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public MultiModalGuardAsyncResultResponseBodyDataFrameResultFrames setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public MultiModalGuardAsyncResultResponseBodyDataFrameResultFrames setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class MultiModalGuardAsyncResultResponseBodyDataFrameResult extends TeaModel {
        @NameInMap("Frames")
        public java.util.List<MultiModalGuardAsyncResultResponseBodyDataFrameResultFrames> frames;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SliceNum")
        public Integer sliceNum;

        /**
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        public static MultiModalGuardAsyncResultResponseBodyDataFrameResult build(java.util.Map<String, ?> map) throws Exception {
            MultiModalGuardAsyncResultResponseBodyDataFrameResult self = new MultiModalGuardAsyncResultResponseBodyDataFrameResult();
            return TeaModel.build(map, self);
        }

        public MultiModalGuardAsyncResultResponseBodyDataFrameResult setFrames(java.util.List<MultiModalGuardAsyncResultResponseBodyDataFrameResultFrames> frames) {
            this.frames = frames;
            return this;
        }
        public java.util.List<MultiModalGuardAsyncResultResponseBodyDataFrameResultFrames> getFrames() {
            return this.frames;
        }

        public MultiModalGuardAsyncResultResponseBodyDataFrameResult setSliceNum(Integer sliceNum) {
            this.sliceNum = sliceNum;
            return this;
        }
        public Integer getSliceNum() {
            return this.sliceNum;
        }

        public MultiModalGuardAsyncResultResponseBodyDataFrameResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class MultiModalGuardAsyncResultResponseBodyData extends TeaModel {
        @NameInMap("AudioResult")
        public MultiModalGuardAsyncResultResponseBodyDataAudioResult audioResult;

        /**
         * <strong>example:</strong>
         * <p>data1234</p>
         */
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("FrameResult")
        public MultiModalGuardAsyncResultResponseBodyDataFrameResult frameResult;

        /**
         * <strong>example:</strong>
         * <p>liveId</p>
         */
        @NameInMap("LiveId")
        public String liveId;

        /**
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        /**
         * <strong>example:</strong>
         * <p>vi_f_xxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static MultiModalGuardAsyncResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MultiModalGuardAsyncResultResponseBodyData self = new MultiModalGuardAsyncResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MultiModalGuardAsyncResultResponseBodyData setAudioResult(MultiModalGuardAsyncResultResponseBodyDataAudioResult audioResult) {
            this.audioResult = audioResult;
            return this;
        }
        public MultiModalGuardAsyncResultResponseBodyDataAudioResult getAudioResult() {
            return this.audioResult;
        }

        public MultiModalGuardAsyncResultResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public MultiModalGuardAsyncResultResponseBodyData setFrameResult(MultiModalGuardAsyncResultResponseBodyDataFrameResult frameResult) {
            this.frameResult = frameResult;
            return this;
        }
        public MultiModalGuardAsyncResultResponseBodyDataFrameResult getFrameResult() {
            return this.frameResult;
        }

        public MultiModalGuardAsyncResultResponseBodyData setLiveId(String liveId) {
            this.liveId = liveId;
            return this;
        }
        public String getLiveId() {
            return this.liveId;
        }

        public MultiModalGuardAsyncResultResponseBodyData setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public MultiModalGuardAsyncResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
