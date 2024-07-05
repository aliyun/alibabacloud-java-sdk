// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryAnalysisJobListResponseBody extends TeaModel {
    /**
     * <p>The IDs of template analysis jobs.</p>
     */
    @NameInMap("AnalysisJobList")
    public QueryAnalysisJobListResponseBodyAnalysisJobList analysisJobList;

    /**
     * <p>The message sent by Message Service (MNS) to notify the user of the job result.</p>
     */
    @NameInMap("NonExistAnalysisJobIds")
    public QueryAnalysisJobListResponseBodyNonExistAnalysisJobIds nonExistAnalysisJobIds;

    /**
     * <p>The status of the job. Valid values:</p>
     * <ul>
     * <li><strong>Submitted</strong>: The job has been submitted.</li>
     * <li><strong>Analyzing</strong>: The job is being run.</li>
     * <li><strong>Success</strong>: The job is successful.</li>
     * <li><strong>Fail</strong>: The job fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5CA6E020-4102-4FFF-AA56-5ED7ECD811A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryAnalysisJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAnalysisJobListResponseBody self = new QueryAnalysisJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAnalysisJobListResponseBody setAnalysisJobList(QueryAnalysisJobListResponseBodyAnalysisJobList analysisJobList) {
        this.analysisJobList = analysisJobList;
        return this;
    }
    public QueryAnalysisJobListResponseBodyAnalysisJobList getAnalysisJobList() {
        return this.analysisJobList;
    }

    public QueryAnalysisJobListResponseBody setNonExistAnalysisJobIds(QueryAnalysisJobListResponseBodyNonExistAnalysisJobIds nonExistAnalysisJobIds) {
        this.nonExistAnalysisJobIds = nonExistAnalysisJobIds;
        return this;
    }
    public QueryAnalysisJobListResponseBodyNonExistAnalysisJobIds getNonExistAnalysisJobIds() {
        return this.nonExistAnalysisJobIds;
    }

    public QueryAnalysisJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop extends TeaModel {
        /**
         * <p>The height of the video image after the margins are cropped out.</p>
         * <blockquote>
         * <p> This parameter is invalid if the Mode parameter is set to Auto or None.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The left margin to be cropped out.</p>
         * <blockquote>
         * <p> This parameter is invalid if the Mode parameter is set to Auto or None.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Left")
        public String left;

        /**
         * <p>The cropping mode. Valid values:</p>
         * <ul>
         * <li><strong>Auto</strong>: Cropping was automatically run.</li>
         * <li><strong>Force</strong>: Cropping was forced to run.</li>
         * <li><strong>None</strong>: Cropping was forced not to run.</li>
         * <li>This parameter is required if the value of the Crop parameter is not an empty JSON {}.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The top margin to be cropped out.</p>
         * <blockquote>
         * <p> This parameter is invalid if the Mode parameter is set to Auto or None.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Top")
        public String top;

        /**
         * <p>The width of the video image after the margins are cropped out.</p>
         * <blockquote>
         * <p> This parameter is invalid if the Mode parameter is set to Auto or None.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Width")
        public String width;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop setLeft(String left) {
            this.left = left;
            return this;
        }
        public String getLeft() {
            return this.left;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop setTop(String top) {
            this.top = top;
            return this;
        }
        public String getTop() {
            return this.top;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControl extends TeaModel {
        /**
         * <p>The cropping configuration of the video image.</p>
         */
        @NameInMap("Crop")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop crop;

        /**
         * <p>Specifies whether deinterlacing was forced to run. Valid values:</p>
         * <ul>
         * <li><strong>Auto</strong>: Deinterlacing was automatically run.</li>
         * <li><strong>Force</strong>: Deinterlacing was forced to run.</li>
         * <li><strong>None</strong>: Deinterlacing was forced not to run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        @NameInMap("Deinterlace")
        public String deinterlace;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControl build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControl self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControl();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControl setCrop(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop crop) {
            this.crop = crop;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControlCrop getCrop() {
            return this.crop;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControl setDeinterlace(String deinterlace) {
            this.deinterlace = deinterlace;
            return this;
        }
        public String getDeinterlace() {
            return this.deinterlace;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigQualityControl extends TeaModel {
        /**
         * <p>The playback mode. Valid values:</p>
         * <ul>
         * <li><strong>network</strong>: online playback.</li>
         * <li><strong>local</strong>: playback on on-premises devices.</li>
         * <li>Default value: <strong>network</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>network</p>
         */
        @NameInMap("MethodStreaming")
        public String methodStreaming;

        /**
         * <p>The quality level of the job output. Default value: <strong>25</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("RateQuality")
        public String rateQuality;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigQualityControl build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigQualityControl self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigQualityControl();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigQualityControl setMethodStreaming(String methodStreaming) {
            this.methodStreaming = methodStreaming;
            return this;
        }
        public String getMethodStreaming() {
            return this.methodStreaming;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigQualityControl setRateQuality(String rateQuality) {
            this.rateQuality = rateQuality;
            return this;
        }
        public String getRateQuality() {
            return this.rateQuality;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfig extends TeaModel {
        /**
         * <p>The control on the attributes of the job output.</p>
         */
        @NameInMap("PropertiesControl")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControl propertiesControl;

        /**
         * <p>The quality control on the job output.</p>
         */
        @NameInMap("QualityControl")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigQualityControl qualityControl;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfig self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfig();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfig setPropertiesControl(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControl propertiesControl) {
            this.propertiesControl = propertiesControl;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigPropertiesControl getPropertiesControl() {
            return this.propertiesControl;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfig setQualityControl(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigQualityControl qualityControl) {
            this.qualityControl = qualityControl;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfigQualityControl getQualityControl() {
            return this.qualityControl;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobInputFile extends TeaModel {
        /**
         * <p>The name of the OSS bucket in which the input file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The region in which OSS resides.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the Object Storage Service (OSS) object that is used as the input file.</p>
         * 
         * <strong>example:</strong>
         * <p>example.flv</p>
         */
        @NameInMap("Object")
        public String object;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobInputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobInputFile self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobInputFile();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobMNSMessageResult extends TeaModel {
        /**
         * <p>The error code returned if the job failed. This parameter is not returned if the job was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.ResourceNotFound</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned if the job failed. This parameter is not returned if the job was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>The resource operated \&quot;PipelineId\&quot; cannot be found</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the message returned if the job was successful. This parameter is not returned if the job failed.</p>
         * 
         * <strong>example:</strong>
         * <p>3ca84a39a9024f19853b21be9cf9****</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobMNSMessageResult self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio extends TeaModel {
        /**
         * <p>The audio bitrate of the output file.</p>
         * <ul>
         * <li>Valid values: <strong>8 to 1000</strong>.</li>
         * <li>Unit: Kbit/s.</li>
         * <li>Default value: <strong>128</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The number of sound channels. Default value: <strong>2</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <p>The audio codec. Default value: <strong>aac</strong>. Valid values:</p>
         * <ul>
         * <li><strong>aac</strong></li>
         * <li><strong>mp3</strong></li>
         * <li><strong>vorbis</strong></li>
         * <li><strong>flac</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aac</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The codec profile of the audio. Valid values when the <strong>Codec</strong> parameter is set to <strong>aac</strong>:</p>
         * <ul>
         * <li><strong>aac_low</strong></li>
         * <li><strong>aac_he</strong></li>
         * <li><strong>aac_he_v2</strong></li>
         * <li><strong>aac_ld</strong></li>
         * <li><strong>aac_eld</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aac_low</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The level of quality control on the audio.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Qscale")
        public String qscale;

        /**
         * <p>The sampling rate.</p>
         * <ul>
         * <li>Unit: Hz.</li>
         * <li>Default value: <strong>44100</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("Samplerate")
        public String samplerate;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateContainer extends TeaModel {
        /**
         * <p>The container format.</p>
         * 
         * <strong>example:</strong>
         * <p>flv</p>
         */
        @NameInMap("Format")
        public String format;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateContainer build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateContainer self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateContainer();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigGif extends TeaModel {
        /**
         * <p>The interval between two consecutive loops for the GIF format. Unit: 0.01 second. For example, a value of 500 indicates 5 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FinalDelay")
        public String finalDelay;

        /**
         * <p>The number of loops for the GIF or WebP format. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Loop")
        public String loop;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigGif build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigGif self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigGif();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigGif setFinalDelay(String finalDelay) {
            this.finalDelay = finalDelay;
            return this;
        }
        public String getFinalDelay() {
            return this.finalDelay;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigGif setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigSegment extends TeaModel {
        /**
         * <p>The segment length. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Duration")
        public String duration;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigSegment self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfig extends TeaModel {
        /**
         * <p>The transmuxing configurations for the GIF format.</p>
         */
        @NameInMap("Gif")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigGif gif;

        /**
         * <p>The segment configurations.</p>
         */
        @NameInMap("Segment")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigSegment segment;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfig self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfig();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfig setGif(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigGif gif) {
            this.gif = gif;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigGif getGif() {
            return this.gif;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfig setSegment(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfigSegment getSegment() {
            return this.segment;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateTransConfig extends TeaModel {
        /**
         * <p>The transcoding mode. Default value: <strong>onepass</strong>. Valid values:</p>
         * <ul>
         * <li><strong>onepass</strong></li>
         * <li><strong>twopass</strong></li>
         * <li><strong>CBR</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>onepass</p>
         */
        @NameInMap("TransMode")
        public String transMode;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateTransConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateTransConfig self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateTransConfig();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateTransConfig setTransMode(String transMode) {
            this.transMode = transMode;
            return this;
        }
        public String getTransMode() {
            return this.transMode;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideoBitrateBnd extends TeaModel {
        /**
         * <p>The upper limit of the total bitrate. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("Max")
        public String max;

        /**
         * <p>The lower limit of the total bitrate. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("Min")
        public String min;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideoBitrateBnd build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideoBitrateBnd self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideoBitrateBnd();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideoBitrateBnd setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideoBitrateBnd setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo extends TeaModel {
        /**
         * <p>The average bitrate of the video. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The average bitrate range of the video.</p>
         */
        @NameInMap("BitrateBnd")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideoBitrateBnd bitrateBnd;

        /**
         * <p>The buffer size.</p>
         * <ul>
         * <li>Unit: KB.</li>
         * <li>Default value: <strong>6000</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6000</p>
         */
        @NameInMap("Bufsize")
        public String bufsize;

        /**
         * <p>The codec. Valid values: H.264 and H.265. Default value: <strong>H.264</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>H.264</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The constant rate factor.</p>
         * <ul>
         * <li>Default value when the the Codec parameter is set to H.264: <strong>23</strong>, default value when the the Codec parameter is set to H.265: <strong>26</strong>.</li>
         * <li>If this parameter is specified, the value of the Bitrate parameter becomes invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("Crf")
        public String crf;

        /**
         * <p>The strength of the independent noise reduction algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Degrain")
        public String degrain;

        /**
         * <p>The frame rate of the video.</p>
         * <ul>
         * <li>The value is 60 if the frame rate of the input file exceeds 60.</li>
         * <li>Default value: <strong>the frame rate of the input video</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The maximum number of frames between two keyframes. Default value: <strong>250</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>250</p>
         */
        @NameInMap("Gop")
        public String gop;

        /**
         * <p>The height of the video.</p>
         * <ul>
         * <li>Unit: pixel.</li>
         * <li>Default value: <strong>the height of the input video</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The maximum bitrate of the video.</p>
         * <ul>
         * <li>Valid values: <strong>10 to 50000</strong>.</li>
         * <li>Unit: Kbit/s.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Maxrate")
        public String maxrate;

        /**
         * <p>The pixel format of the video. Valid values: standard pixel formats such as yuv420p and yuvj420p.</p>
         * 
         * <strong>example:</strong>
         * <p>yuv420p</p>
         */
        @NameInMap("PixFmt")
        public String pixFmt;

        /**
         * <p>The preset video algorithm. Valid values: veryfast, fast, medium, slow, and slower. Default value: <strong>medium</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("Preset")
        public String preset;

        /**
         * <p>The codec profile. Valid values:</p>
         * <ul>
         * <li><strong>baseline</strong>: applicable to mobile devices.</li>
         * <li><strong>main</strong>: applicable to standard-definition devices.</li>
         * <li><strong>high</strong>: applicable to high-definition devices.</li>
         * <li>Default value: <strong>high</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The level of quality control on the video.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Qscale")
        public String qscale;

        /**
         * <p>The scan mode. Valid values:</p>
         * <ul>
         * <li><strong>interlaced</strong></li>
         * <li><strong>progressive</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>interlaced</p>
         */
        @NameInMap("ScanMode")
        public String scanMode;

        /**
         * <p>The width of the video.</p>
         * <ul>
         * <li>Unit: pixel.</li>
         * <li>Default value: <strong>the width of the input video</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Width")
        public String width;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setBitrateBnd(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideoBitrateBnd bitrateBnd) {
            this.bitrateBnd = bitrateBnd;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideoBitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setDegrain(String degrain) {
            this.degrain = degrain;
            return this;
        }
        public String getDegrain() {
            return this.degrain;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate extends TeaModel {
        /**
         * <p>The audio codec configurations.</p>
         */
        @NameInMap("Audio")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio audio;

        /**
         * <p>The container format configurations.</p>
         */
        @NameInMap("Container")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateContainer container;

        /**
         * <p>The transcoding template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>S00000000-00****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The transmuxing configurations.</p>
         */
        @NameInMap("MuxConfig")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfig muxConfig;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>FLV-UD</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The state of the template. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong></li>
         * <li><strong>Deleted</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The general transcoding configurations.</p>
         */
        @NameInMap("TransConfig")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateTransConfig transConfig;

        /**
         * <p>The video codec configurations.</p>
         */
        @NameInMap("Video")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo video;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate setAudio(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio audio) {
            this.audio = audio;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateAudio getAudio() {
            return this.audio;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate setContainer(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateContainer container) {
            this.container = container;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateContainer getContainer() {
            return this.container;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate setMuxConfig(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate setTransConfig(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateTransConfig transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateTransConfig getTransConfig() {
            return this.transConfig;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate setVideo(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo video) {
            this.video = video;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplateVideo getVideo() {
            return this.video;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateList extends TeaModel {
        @NameInMap("Template")
        public java.util.List<QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate> template;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateList build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateList self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateList();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateList setTemplate(java.util.List<QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate> template) {
            this.template = template;
            return this;
        }
        public java.util.List<QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateListTemplate> getTemplate() {
            return this.template;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob extends TeaModel {
        /**
         * <p>The job configurations.</p>
         */
        @NameInMap("AnalysisConfig")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfig analysisConfig;

        /**
         * <p>The error code returned if the job fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.ResourceNotFound</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-01-10T12:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the template analysis job.</p>
         * 
         * <strong>example:</strong>
         * <p>57f6aa3f84824309bcba67231b406****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The information about the job input.</p>
         */
        @NameInMap("InputFile")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobInputFile inputFile;

        /**
         * <p>The message sent by Message Service (MNS) to notify users of the job result.</p>
         */
        @NameInMap("MNSMessageResult")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobMNSMessageResult MNSMessageResult;

        /**
         * <p>The error message returned if the job failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The resource operated \&quot;PipelineId\&quot; cannot be found</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The transcoding progress.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("Percent")
        public Long percent;

        /**
         * <p>The ID of the MPS queue to which the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>bb558c1cc25b45309aab5be44d19****</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The priority of the job in the ApsaraVideo Media Processing (MPS) queue to which the job was submitted.</p>
         * <ul>
         * <li>Valid values: <strong>1 to 10</strong>. The value 10 indicates the highest priority.</li>
         * <li>Default value: <strong>10</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The job status.</p>
         * <ul>
         * <li><strong>Submitted</strong>: The job was submitted.</li>
         * <li><strong>Analyzing</strong>: The job is in progress.</li>
         * <li><strong>Success</strong>: The job was successful.</li>
         * <li><strong>Fail</strong>: The job failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The matched preset templates.</p>
         */
        @NameInMap("TemplateList")
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateList templateList;

        /**
         * <p>The custom data.</p>
         * 
         * <strong>example:</strong>
         * <p>testid-001</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob self = new QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setAnalysisConfig(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfig analysisConfig) {
            this.analysisConfig = analysisConfig;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobAnalysisConfig getAnalysisConfig() {
            return this.analysisConfig;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setInputFile(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobInputFile getInputFile() {
            return this.inputFile;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setMNSMessageResult(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setPercent(Long percent) {
            this.percent = percent;
            return this;
        }
        public Long getPercent() {
            return this.percent;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setTemplateList(QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateList templateList) {
            this.templateList = templateList;
            return this;
        }
        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJobTemplateList getTemplateList() {
            return this.templateList;
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class QueryAnalysisJobListResponseBodyAnalysisJobList extends TeaModel {
        @NameInMap("AnalysisJob")
        public java.util.List<QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob> analysisJob;

        public static QueryAnalysisJobListResponseBodyAnalysisJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyAnalysisJobList self = new QueryAnalysisJobListResponseBodyAnalysisJobList();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyAnalysisJobList setAnalysisJob(java.util.List<QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob> analysisJob) {
            this.analysisJob = analysisJob;
            return this;
        }
        public java.util.List<QueryAnalysisJobListResponseBodyAnalysisJobListAnalysisJob> getAnalysisJob() {
            return this.analysisJob;
        }

    }

    public static class QueryAnalysisJobListResponseBodyNonExistAnalysisJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryAnalysisJobListResponseBodyNonExistAnalysisJobIds build(java.util.Map<String, ?> map) throws Exception {
            QueryAnalysisJobListResponseBodyNonExistAnalysisJobIds self = new QueryAnalysisJobListResponseBodyNonExistAnalysisJobIds();
            return TeaModel.build(map, self);
        }

        public QueryAnalysisJobListResponseBodyNonExistAnalysisJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
