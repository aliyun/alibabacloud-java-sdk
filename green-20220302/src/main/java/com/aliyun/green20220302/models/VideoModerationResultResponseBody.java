// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VideoModerationResultResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP status code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The moderation results.</p>
     */
    @NameInMap("Data")
    public VideoModerationResultResponseBodyData data;

    /**
     * <p>The message that is returned in response to the request.</p>
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
        @NameInMap("Description")
        public String description;

        /**
         * <p>The voice label.</p>
         * 
         * <strong>example:</strong>
         * <p>profanity</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The number of times that the label is matched.</p>
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

    public static class VideoModerationResultResponseBodyDataAudioResultSliceDetails extends TeaModel {
        @NameInMap("Descriptions")
        public String descriptions;

        /**
         * <p>The end time of the text after voice-to-text conversion. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The end timestamp of the segment. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1685245261939</p>
         */
        @NameInMap("EndTimestamp")
        public Long endTimestamp;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;consoleProduct\&quot;:\&quot;slbnext\&quot;}</p>
         */
        @NameInMap("Extend")
        public String extend;

        /**
         * <p>The details of the labels.</p>
         * 
         * <strong>example:</strong>
         * <p>porn</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>Risk Level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>Subcategory labels. Multiple labels are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("RiskTips")
        public String riskTips;

        /**
         * <p>The risk words that are hit. Multiple words are separated by commas (,).</p>
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
         * <p>The start time of the text after voice-to-text conversion. Unit: seconds.</p>
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
         * <p>1659935002123</p>
         */
        @NameInMap("StartTimestamp")
        public Long startTimestamp;

        /**
         * <p>The text converted from voice.</p>
         * 
         * <strong>example:</strong>
         * <p>Disgusting</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>If the moderation object is a voice stream, this parameter indicates the temporary access URL of the voice stream to which the text entry corresponds. The validity period of the URL is 30 minutes. You must prepare another URL to store the voice stream at the earliest opportunity.</p>
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
         * <p>Summary of voice labels.</p>
         */
        @NameInMap("AudioSummarys")
        public java.util.List<VideoModerationResultResponseBodyDataAudioResultAudioSummarys> audioSummarys;

        /**
         * <p>Risk Level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The details about the text in the moderated voice. The value is a JSON array that contains one or more elements. Each element corresponds to a text entry.</p>
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

    public static class VideoModerationResultResponseBodyDataFrameResultFrameSummarys extends TeaModel {
        /**
         * <p>The description of the result.</p>
         * 
         * <strong>example:</strong>
         * <p>no risk</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The label against which a captured frame is matched.</p>
         * 
         * <strong>example:</strong>
         * <p>violent_armedForces</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The number of times that the label is matched.</p>
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
        @NameInMap("H")
        public Integer h;

        @NameInMap("W")
        public Integer w;

        @NameInMap("X")
        public Integer x;

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
        @NameInMap("confidence")
        public Long confidence;

        @NameInMap("label")
        public String label;

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
        @NameInMap("Location")
        public VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoDataLocation location;

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

    public static class VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigure extends TeaModel {
        /**
         * <p>The information about the code of the identified figure.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx001</p>
         */
        @NameInMap("FigureId")
        public String figureId;

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

    }

    public static class VideoModerationResultResponseBodyDataFrameResultFramesResultsResult extends TeaModel {
        /**
         * <p>The score of the confidence level. Valid values: 0 to 100. The value is accurate to two decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Confidence")
        public Float confidence;

        /**
         * <p>The description of the result.</p>
         * 
         * <strong>example:</strong>
         * <p>no risk</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The label returned after a frame is moderated. Multiple risk labels and the corresponding scores of confidence levels may be returned for a frame.</p>
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

    public static class VideoModerationResultResponseBodyDataFrameResultFramesResults extends TeaModel {
        /**
         * <p>If a custom image library is hit, information about the custom image library is returned.</p>
         */
        @NameInMap("CustomImage")
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsCustomImage> customImage;

        @NameInMap("LogoData")
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsLogoData> logoData;

        /**
         * <p>If the video contains a specific figure, the code of the identified figure is returned.</p>
         */
        @NameInMap("PublicFigure")
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsPublicFigure> publicFigure;

        /**
         * <p>The results of frame moderation parameters such as the label parameter and the confidence parameter.</p>
         */
        @NameInMap("Result")
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResultsResult> result;

        /**
         * <p>The moderation service that is called.</p>
         * 
         * <strong>example:</strong>
         * <p>tonalityImprove</p>
         */
        @NameInMap("Service")
        public String service;

        /**
         * <p>The information about the text hit in the image is returned.</p>
         */
        @NameInMap("TextInImage")
        public java.util.Map<String, ?> textInImage;

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

    }

    public static class VideoModerationResultResponseBodyDataFrameResultFrames extends TeaModel {
        /**
         * <p>The interval between the start of the video file and the captured frame. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>338</p>
         */
        @NameInMap("Offset")
        public Float offset;

        /**
         * <p>The results of frame moderation parameters such as the label parameter and the confidence parameter.</p>
         */
        @NameInMap("Results")
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFramesResults> results;

        /**
         * <p>Risk Level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The temporary URL of a captured frame.</p>
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
         * <p>The number of captured frames that are returned for the video file.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FrameNum")
        public Integer frameNum;

        /**
         * <p>The summary of the labels against which captured frames are matched.</p>
         */
        @NameInMap("FrameSummarys")
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFrameSummarys> frameSummarys;

        /**
         * <p>The information about the frames that match the labels.</p>
         */
        @NameInMap("Frames")
        public java.util.List<VideoModerationResultResponseBodyDataFrameResultFrames> frames;

        /**
         * <p>Risk Level.</p>
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
         * <p>The voice moderation results. The moderation results contain a structure.</p>
         */
        @NameInMap("AudioResult")
        public VideoModerationResultResponseBodyDataAudioResult audioResult;

        /**
         * <p>The value of dataId that is specified in the API request. If this parameter is not specified in the API request, the dataId field is not available in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>product_content-2055763</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>The image moderation results. If the call is successful, the HTTP status code 200 and moderation results are returned. The moderation results contain a structure.</p>
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
         * <p>Risk Level.</p>
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
