// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VideoModerationResultResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The moderation result data.</p>
     */
    @NameInMap("Data")
    public VideoModerationResultResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success finished</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6CF2815C-C8C7-4A01-B52E-FF6E24F53492</p>
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
        /**
         * <p>The label descriptions.</p>
         * 
         * <strong>example:</strong>
         * <p>疑似违禁内容</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The video audio label.</p>
         * 
         * <strong>example:</strong>
         * <p>profanity</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The number of times the label appears.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("LabelSum")
        public Integer labelSum;

        public static VideoModerationResultResponseBodyDataAudioResultAudioSummarys build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataAudioResultAudioSummarys self = new VideoModerationResultResponseBodyDataAudioResultAudioSummarys();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataAudioResultAudioSummarys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

    public static class VideoModerationResultResponseBodyDataAudioResultSliceDetailsResultCustomizedHit extends TeaModel {
        @NameInMap("KeyWords")
        public String keyWords;

        @NameInMap("LibName")
        public String libName;

        public static VideoModerationResultResponseBodyDataAudioResultSliceDetailsResultCustomizedHit build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataAudioResultSliceDetailsResultCustomizedHit self = new VideoModerationResultResponseBodyDataAudioResultSliceDetailsResultCustomizedHit();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetailsResultCustomizedHit setKeyWords(String keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public String getKeyWords() {
            return this.keyWords;
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetailsResultCustomizedHit setLibName(String libName) {
            this.libName = libName;
            return this;
        }
        public String getLibName() {
            return this.libName;
        }

    }

    public static class VideoModerationResultResponseBodyDataAudioResultSliceDetailsResultRiskPositions extends TeaModel {
        @NameInMap("EndPos")
        public Integer endPos;

        @NameInMap("RiskWord")
        public String riskWord;

        @NameInMap("StartPos")
        public Integer startPos;

        public static VideoModerationResultResponseBodyDataAudioResultSliceDetailsResultRiskPositions build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataAudioResultSliceDetailsResultRiskPositions self = new VideoModerationResultResponseBodyDataAudioResultSliceDetailsResultRiskPositions();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetailsResultRiskPositions setEndPos(Integer endPos) {
            this.endPos = endPos;
            return this;
        }
        public Integer getEndPos() {
            return this.endPos;
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetailsResultRiskPositions setRiskWord(String riskWord) {
            this.riskWord = riskWord;
            return this;
        }
        public String getRiskWord() {
            return this.riskWord;
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetailsResultRiskPositions setStartPos(Integer startPos) {
            this.startPos = startPos;
            return this;
        }
        public Integer getStartPos() {
            return this.startPos;
        }

    }

    public static class VideoModerationResultResponseBodyDataAudioResultSliceDetailsResult extends TeaModel {
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("CustomizedHit")
        public java.util.List<VideoModerationResultResponseBodyDataAudioResultSliceDetailsResultCustomizedHit> customizedHit;

        @NameInMap("Description")
        public String description;

        @NameInMap("Label")
        public String label;

        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("RiskPositions")
        public java.util.List<VideoModerationResultResponseBodyDataAudioResultSliceDetailsResultRiskPositions> riskPositions;

        @NameInMap("RiskWords")
        public String riskWords;

        public static VideoModerationResultResponseBodyDataAudioResultSliceDetailsResult build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataAudioResultSliceDetailsResult self = new VideoModerationResultResponseBodyDataAudioResultSliceDetailsResult();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetailsResult setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetailsResult setCustomizedHit(java.util.List<VideoModerationResultResponseBodyDataAudioResultSliceDetailsResultCustomizedHit> customizedHit) {
            this.customizedHit = customizedHit;
            return this;
        }
        public java.util.List<VideoModerationResultResponseBodyDataAudioResultSliceDetailsResultCustomizedHit> getCustomizedHit() {
            return this.customizedHit;
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetailsResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetailsResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetailsResult setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetailsResult setRiskPositions(java.util.List<VideoModerationResultResponseBodyDataAudioResultSliceDetailsResultRiskPositions> riskPositions) {
            this.riskPositions = riskPositions;
            return this;
        }
        public java.util.List<VideoModerationResultResponseBodyDataAudioResultSliceDetailsResultRiskPositions> getRiskPositions() {
            return this.riskPositions;
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetailsResult setRiskWords(String riskWords) {
            this.riskWords = riskWords;
            return this;
        }
        public String getRiskWords() {
            return this.riskWords;
        }

    }

    public static class VideoModerationResultResponseBodyDataAudioResultSliceDetails extends TeaModel {
        /**
         * <p>The label descriptions.</p>
         * 
         * <strong>example:</strong>
         * <p>疑似违禁内容</p>
         */
        @NameInMap("Descriptions")
        public String descriptions;

        /**
         * <p>The end time of the segment, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The end timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1685245261939</p>
         */
        @NameInMap("EndTimestamp")
        public Long endTimestamp;

        /**
         * <p>The extended field.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;consoleProduct\&quot;:\&quot;slbnext\&quot;}</p>
         */
        @NameInMap("Extend")
        public String extend;

        /**
         * <p>The violation labels that are hit.</p>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("Labels")
        public String labels;

        @NameInMap("Result")
        public java.util.List<VideoModerationResultResponseBodyDataAudioResultSliceDetailsResult> result;

        /**
         * <p>The risk level, returned based on the configured high and low risk score thresholds. Valid values:</p>
         * <ul>
         * <li><p>high: High risk.</p>
         * </li>
         * <li><p>medium: Medium risk.</p>
         * </li>
         * <li><p>low: Low risk.</p>
         * </li>
         * <li><p>none: No risk detected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The details of the hit risk.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("RiskTips")
        public String riskTips;

        /**
         * <p>The risk keywords that are hit.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("RiskWords")
        public String riskWords;

        /**
         * <p>The risk score. Default range: 0 to 99.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <p>The start time of the segment, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The start timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1659935002123</p>
         */
        @NameInMap("StartTimestamp")
        public Long startTimestamp;

        /**
         * <p>The transcribed text of the audio segment.</p>
         * 
         * <strong>example:</strong>
         * <p>今天天气真不错</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The temporary URL of the audio segment file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.abc.img">http://xxxx.abc.img</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static VideoModerationResultResponseBodyDataAudioResultSliceDetails build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataAudioResultSliceDetails self = new VideoModerationResultResponseBodyDataAudioResultSliceDetails();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetails setDescriptions(String descriptions) {
            this.descriptions = descriptions;
            return this;
        }
        public String getDescriptions() {
            return this.descriptions;
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

        public VideoModerationResultResponseBodyDataAudioResultSliceDetails setResult(java.util.List<VideoModerationResultResponseBodyDataAudioResultSliceDetailsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<VideoModerationResultResponseBodyDataAudioResultSliceDetailsResult> getResult() {
            return this.result;
        }

        public VideoModerationResultResponseBodyDataAudioResultSliceDetails setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
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
        /**
         * <p>The audio label summary.</p>
         */
        @NameInMap("AudioSummarys")
        public java.util.List<VideoModerationResultResponseBodyDataAudioResultAudioSummarys> audioSummarys;

        /**
         * <p>The risk level, returned based on the configured high and low risk score thresholds. Valid values:</p>
         * <ul>
         * <li><p>high: High risk.</p>
         * </li>
         * <li><p>medium: Medium risk.</p>
         * </li>
         * <li><p>low: Low risk.</p>
         * </li>
         * <li><p>none: No risk detected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The list of audio segments.</p>
         */
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

        public VideoModerationResultResponseBodyDataAudioResult setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public VideoModerationResultResponseBodyDataAudioResult setSliceDetails(java.util.List<VideoModerationResultResponseBodyDataAudioResultSliceDetails> sliceDetails) {
            this.sliceDetails = sliceDetails;
            return this;
        }
        public java.util.List<VideoModerationResultResponseBodyDataAudioResultSliceDetails> getSliceDetails() {
            return this.sliceDetails;
        }

    }

    public static class VideoModerationResultResponseBodyDataExtAigcDataAIGC extends TeaModel {
        /**
         * <p>The code or name of the service provider, used to identify the content producer.</p>
         * 
         * <strong>example:</strong>
         * <p>001191******M000100Y43</p>
         */
        @NameInMap("ContentProducer")
        public String contentProducer;

        /**
         * <p>The name, ID, or code of the propagation platform. For services that provide artificial intelligence-generated content, this value can be the same as ContentProducer.</p>
         * 
         * <strong>example:</strong>
         * <p>001191******M000100Y43</p>
         */
        @NameInMap("ContentPropagator")
        public String contentPropagator;

        /**
         * <p>Indicates whether the content is generated by artificial intelligence (AI). Valid values:</p>
         * <ul>
         * <li><p>1: The content is generated through artificial intelligence content generation.</p>
         * </li>
         * <li><p>2: (Propagation platforms only) The content may be generated through artificial intelligence content generation.</p>
         * </li>
         * <li><p>3: (Propagation platforms only) The content is suspected to be generated through artificial intelligence content generation.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The content production ID, which is the unique identifier used by the production platform to trace synthesized content.</p>
         * 
         * <strong>example:</strong>
         * <p>123******456</p>
         */
        @NameInMap("ProduceID")
        public String produceID;

        /**
         * <p>The content propagation ID, which is the unique identifier assigned by the propagation platform to the propagated AI-generated content.</p>
         * 
         * <strong>example:</strong>
         * <p>123******456</p>
         */
        @NameInMap("PropagateID")
        public String propagateID;

        /**
         * <p>The reserved field.</p>
         * <p>This field can store information used by the content generation service provider for self-initiated security protection to safeguard content and identifier integrity. A hashing mechanism based on ContentProducer and ProduceID can be used to securely store and verify critical information.</p>
         * 
         * <strong>example:</strong>
         * <p>d41d**********427e</p>
         */
        @NameInMap("ReservedCode1")
        public String reservedCode1;

        /**
         * <p>The reserved field.</p>
         * <p>This field can be used by the content propagation service provider for self-initiated security protection to safeguard content and identifier integrity. A hashing mechanism based on ContentProducer and ProduceID can be used to securely store and verify critical information.</p>
         * 
         * <strong>example:</strong>
         * <p>d41d**********427e</p>
         */
        @NameInMap("ReservedCode2")
        public String reservedCode2;

        public static VideoModerationResultResponseBodyDataExtAigcDataAIGC build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataExtAigcDataAIGC self = new VideoModerationResultResponseBodyDataExtAigcDataAIGC();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataExtAigcDataAIGC setContentProducer(String contentProducer) {
            this.contentProducer = contentProducer;
            return this;
        }
        public String getContentProducer() {
            return this.contentProducer;
        }

        public VideoModerationResultResponseBodyDataExtAigcDataAIGC setContentPropagator(String contentPropagator) {
            this.contentPropagator = contentPropagator;
            return this;
        }
        public String getContentPropagator() {
            return this.contentPropagator;
        }

        public VideoModerationResultResponseBodyDataExtAigcDataAIGC setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public VideoModerationResultResponseBodyDataExtAigcDataAIGC setProduceID(String produceID) {
            this.produceID = produceID;
            return this;
        }
        public String getProduceID() {
            return this.produceID;
        }

        public VideoModerationResultResponseBodyDataExtAigcDataAIGC setPropagateID(String propagateID) {
            this.propagateID = propagateID;
            return this;
        }
        public String getPropagateID() {
            return this.propagateID;
        }

        public VideoModerationResultResponseBodyDataExtAigcDataAIGC setReservedCode1(String reservedCode1) {
            this.reservedCode1 = reservedCode1;
            return this;
        }
        public String getReservedCode1() {
            return this.reservedCode1;
        }

        public VideoModerationResultResponseBodyDataExtAigcDataAIGC setReservedCode2(String reservedCode2) {
            this.reservedCode2 = reservedCode2;
            return this;
        }
        public String getReservedCode2() {
            return this.reservedCode2;
        }

    }

    public static class VideoModerationResultResponseBodyDataExtAigcData extends TeaModel {
        /**
         * <p>The AIGC metadata.</p>
         */
        @NameInMap("AIGC")
        public VideoModerationResultResponseBodyDataExtAigcDataAIGC AIGC;

        /**
         * <p>The detection result.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Result")
        public String result;

        public static VideoModerationResultResponseBodyDataExtAigcData build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataExtAigcData self = new VideoModerationResultResponseBodyDataExtAigcData();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataExtAigcData setAIGC(VideoModerationResultResponseBodyDataExtAigcDataAIGC AIGC) {
            this.AIGC = AIGC;
            return this;
        }
        public VideoModerationResultResponseBodyDataExtAigcDataAIGC getAIGC() {
            return this.AIGC;
        }

        public VideoModerationResultResponseBodyDataExtAigcData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

    public static class VideoModerationResultResponseBodyDataExt extends TeaModel {
        /**
         * <p>The AIGC metadata detection result.</p>
         */
        @NameInMap("AigcData")
        public VideoModerationResultResponseBodyDataExtAigcData aigcData;

        public static VideoModerationResultResponseBodyDataExt build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataExt self = new VideoModerationResultResponseBodyDataExt();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataExt setAigcData(VideoModerationResultResponseBodyDataExtAigcData aigcData) {
            this.aigcData = aigcData;
            return this;
        }
        public VideoModerationResultResponseBodyDataExtAigcData getAigcData() {
            return this.aigcData;
        }

    }

    public static class VideoModerationResultResponseBodyDataFrameResultFrameSummarys extends TeaModel {
        /**
         * <p>The description of the Label field.</p>
         * 
         * <strong>example:</strong>
         * <p>未检测出风险</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The video frame label.</p>
         * 
         * <strong>example:</strong>
         * <p>violent_armedForces</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The number of times the label appears.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("LabelSum")
        public Integer labelSum;

        public static VideoModerationResultResponseBodyDataFrameResultFrameSummarys build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataFrameResultFrameSummarys self = new VideoModerationResultResponseBodyDataFrameResultFrameSummarys();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataFrameResultFrameSummarys setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

    public static class VideoModerationResultResponseBodyDataFrameResultFramesResultsCustomImage extends TeaModel {
        /**
         * <p>The ID of the custom image that is hit.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The ID of the custom image library that is hit.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("LibId")
        public String libId;

        public static VideoModerationResultResponseBodyDataFrameResultFramesResultsCustomImage build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataFrameResultFramesResultsCustomImage self = new VideoModerationResultResponseBodyDataFrameResultFramesResultsCustomImage();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsCustomImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsCustomImage setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

    }

    public static class VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLocation extends TeaModel {
        /**
         * <p>The height of the text area. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("H")
        public Integer h;

        /**
         * <p>The width of the text area. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("W")
        public Integer w;

        /**
         * <p>The distance from the upper-left corner of the text area to the y-axis, with the upper-left corner of the image as the origin. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <p>The distance from the upper-left corner of the text area to the x-axis, with the upper-left corner of the image as the origin. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLocation build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLocation self = new VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLocation();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLocation setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLocation setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLogo extends TeaModel {
        /**
         * <p>The confidence score, ranging from 0 to 100, rounded to two decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>99.1</p>
         */
        @NameInMap("confidence")
        public Long confidence;

        /**
         * <p>The hit label.</p>
         * 
         * <strong>example:</strong>
         * <p>pt_logotoSocialNetwork</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>The logo name.</p>
         * 
         * <strong>example:</strong>
         * <p>**卫视</p>
         */
        @NameInMap("name")
        public String name;

        public static VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLogo build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLogo self = new VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLogo();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLogo setConfidence(Long confidence) {
            this.confidence = confidence;
            return this;
        }
        public Long getConfidence() {
            return this.confidence;
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLogo setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLogo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoData extends TeaModel {
        /**
         * <p>The text line and coordinate information.</p>
         */
        @NameInMap("Location")
        public VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLocation location;

        /**
         * <p>The logo identification information.</p>
         */
        @NameInMap("Logo")
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLogo> logo;

        public static VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoData build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoData self = new VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoData();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoData setLocation(VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLocation location) {
            this.location = location;
            return this;
        }
        public VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLocation getLocation() {
            return this.location;
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoData setLogo(java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLogo> logo) {
            this.logo = logo;
            return this;
        }
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLogo> getLogo() {
            return this.logo;
        }

    }

    public static class VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigureLocation extends TeaModel {
        /**
         * <p>The height.</p>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("H")
        public Integer h;

        /**
         * <p>The width.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("W")
        public Integer w;

        /**
         * <p>The x-coordinate of the starting point.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <p>The y-coordinate of the starting point.</p>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigureLocation build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigureLocation self = new VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigureLocation();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigureLocation setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigureLocation setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigureLocation setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigureLocation setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigure extends TeaModel {
        /**
         * <p>The code of the recognized public figure.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx001</p>
         */
        @NameInMap("FigureId")
        public String figureId;

        /**
         * <p>The name of the recognized public figure.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("FigureName")
        public String figureName;

        /**
         * <p>The location of the recognized public figure.</p>
         */
        @NameInMap("Location")
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigureLocation> location;

        public static VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigure build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigure self = new VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigure();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigure setFigureId(String figureId) {
            this.figureId = figureId;
            return this;
        }
        public String getFigureId() {
            return this.figureId;
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigure setFigureName(String figureName) {
            this.figureName = figureName;
            return this;
        }
        public String getFigureName() {
            return this.figureName;
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigure setLocation(java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigureLocation> location) {
            this.location = location;
            return this;
        }
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigureLocation> getLocation() {
            return this.location;
        }

    }

    public static class VideoModerationResultResponseBodyDataFrameResultFramesResultsResult extends TeaModel {
        /**
         * <p>The confidence score, ranging from 0 to 100, rounded to two decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The description of the Label field.</p>
         * 
         * <strong>example:</strong>
         * <p>未检测出风险</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The classification of the detection result.</p>
         * 
         * <strong>example:</strong>
         * <p>bloody</p>
         */
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

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class VideoModerationResultResponseBodyDataFrameResultFramesResultsVlContent extends TeaModel {
        /**
         * <p>The output text from the foundation model.</p>
         * 
         * <strong>example:</strong>
         * <p>in the picture XXX</p>
         */
        @NameInMap("OutputText")
        public String outputText;

        public static VideoModerationResultResponseBodyDataFrameResultFramesResultsVlContent build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataFrameResultFramesResultsVlContent self = new VideoModerationResultResponseBodyDataFrameResultFramesResultsVlContent();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResultsVlContent setOutputText(String outputText) {
            this.outputText = outputText;
            return this;
        }
        public String getOutputText() {
            return this.outputText;
        }

    }

    public static class VideoModerationResultResponseBodyDataFrameResultFramesResults extends TeaModel {
        /**
         * <p>The custom image library information that is hit. This field is returned only when a custom image library is hit.</p>
         */
        @NameInMap("CustomImage")
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsCustomImage> customImage;

        /**
         * <p>The logo information returned when the video contains a logo.</p>
         */
        @NameInMap("LogoData")
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoData> logoData;

        /**
         * <p>The recognized public figure codes returned when the video contains specific public figures.</p>
         */
        @NameInMap("PublicFigure")
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigure> publicFigure;

        /**
         * <p>The hit result details.</p>
         */
        @NameInMap("Result")
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsResult> result;

        /**
         * <p>The image moderation service type.</p>
         * 
         * <strong>example:</strong>
         * <p>tonalityImprove</p>
         */
        @NameInMap("Service")
        public String service;

        /**
         * <p>The text information in the image that is hit.</p>
         */
        @NameInMap("TextInImage")
        public java.util.Map<String, ?> textInImage;

        /**
         * <p>The foundation model result.</p>
         */
        @NameInMap("VlContent")
        public VideoModerationResultResponseBodyDataFrameResultFramesResultsVlContent vlContent;

        public static VideoModerationResultResponseBodyDataFrameResultFramesResults build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResultResponseBodyDataFrameResultFramesResults self = new VideoModerationResultResponseBodyDataFrameResultFramesResults();
            return TeaModel.build(map, self);
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResults setCustomImage(java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsCustomImage> customImage) {
            this.customImage = customImage;
            return this;
        }
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsCustomImage> getCustomImage() {
            return this.customImage;
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResults setLogoData(java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoData> logoData) {
            this.logoData = logoData;
            return this;
        }
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoData> getLogoData() {
            return this.logoData;
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResults setPublicFigure(java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigure> publicFigure) {
            this.publicFigure = publicFigure;
            return this;
        }
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigure> getPublicFigure() {
            return this.publicFigure;
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

        public VideoModerationResultResponseBodyDataFrameResultFramesResults setTextInImage(java.util.Map<String, ?> textInImage) {
            this.textInImage = textInImage;
            return this;
        }
        public java.util.Map<String, ?> getTextInImage() {
            return this.textInImage;
        }

        public VideoModerationResultResponseBodyDataFrameResultFramesResults setVlContent(VideoModerationResultResponseBodyDataFrameResultFramesResultsVlContent vlContent) {
            this.vlContent = vlContent;
            return this;
        }
        public VideoModerationResultResponseBodyDataFrameResultFramesResultsVlContent getVlContent() {
            return this.vlContent;
        }

    }

    public static class VideoModerationResultResponseBodyDataFrameResultFrames extends TeaModel {
        /**
         * <p>The offset of the captured frame.</p>
         * 
         * <strong>example:</strong>
         * <p>338</p>
         */
        @NameInMap("Offset")
        public Float offset;

        /**
         * <p>The frame detection result details.</p>
         */
        @NameInMap("Results")
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResults> results;

        /**
         * <p>The risk level, returned based on the configured high and low risk score thresholds. Valid values:</p>
         * <ul>
         * <li><p>high: High risk.</p>
         * </li>
         * <li><p>medium: Medium risk.</p>
         * </li>
         * <li><p>low: Low risk.</p>
         * </li>
         * <li><p>none: No risk detected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The temporary URL of the captured frame image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx.abc.jpg">http://xxxx.abc.jpg</a></p>
         */
        @NameInMap("TempUrl")
        public String tempUrl;

        /**
         * <p>The absolute timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1684559739000</p>
         */
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

        public VideoModerationResultResponseBodyDataFrameResultFrames setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
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
        /**
         * <p>The number of result frames.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FrameNum")
        public Integer frameNum;

        /**
         * <p>The video frame label summary.</p>
         */
        @NameInMap("FrameSummarys")
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFrameSummarys> frameSummarys;

        /**
         * <p>The information about video frames that contain hit labels.</p>
         */
        @NameInMap("Frames")
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFrames> frames;

        /**
         * <p>The risk level, returned based on the configured high and low risk score thresholds. Valid values:</p>
         * <ul>
         * <li><p>high: High risk.</p>
         * </li>
         * <li><p>medium: Medium risk.</p>
         * </li>
         * <li><p>low: Low risk.</p>
         * </li>
         * <li><p>none: No risk detected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

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

        public VideoModerationResultResponseBodyDataFrameResult setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class VideoModerationResultResponseBodyData extends TeaModel {
        /**
         * <p>The segmented results of video audio moderation.</p>
         */
        @NameInMap("AudioResult")
        public VideoModerationResultResponseBodyDataAudioResult audioResult;

        /**
         * <p>The value of dataId passed in the API request. This field is not returned if dataId was not specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>product_content-2055763</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>The extended information.</p>
         */
        @NameInMap("Ext")
        public VideoModerationResultResponseBodyDataExt ext;

        /**
         * <p>The list of video frame capture results.</p>
         */
        @NameInMap("FrameResult")
        public VideoModerationResultResponseBodyDataFrameResult frameResult;

        /**
         * <p>The unique ID of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>liveId</p>
         */
        @NameInMap("LiveId")
        public String liveId;

        /**
         * <p>The manual review task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx-xxxxx</p>
         */
        @NameInMap("ManualTaskId")
        public String manualTaskId;

        /**
         * <p>The risk level, returned based on the configured high and low risk score thresholds. Valid values:</p>
         * <ul>
         * <li><p>high: High risk.</p>
         * </li>
         * <li><p>medium: Medium risk.</p>
         * </li>
         * <li><p>low: Low risk.</p>
         * </li>
         * <li><p>none: No risk detected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx-xxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

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

        public VideoModerationResultResponseBodyData setExt(VideoModerationResultResponseBodyDataExt ext) {
            this.ext = ext;
            return this;
        }
        public VideoModerationResultResponseBodyDataExt getExt() {
            return this.ext;
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

        public VideoModerationResultResponseBodyData setManualTaskId(String manualTaskId) {
            this.manualTaskId = manualTaskId;
            return this;
        }
        public String getManualTaskId() {
            return this.manualTaskId;
        }

        public VideoModerationResultResponseBodyData setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public VideoModerationResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
