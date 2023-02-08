// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitAnalysisJobResponseBody extends TeaModel {
    /**
     * <p>The information about the preset template analysis job that was submitted.</p>
     */
    @NameInMap("AnalysisJob")
    public SubmitAnalysisJobResponseBodyAnalysisJob analysisJob;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAnalysisJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAnalysisJobResponseBody self = new SubmitAnalysisJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAnalysisJobResponseBody setAnalysisJob(SubmitAnalysisJobResponseBodyAnalysisJob analysisJob) {
        this.analysisJob = analysisJob;
        return this;
    }
    public SubmitAnalysisJobResponseBodyAnalysisJob getAnalysisJob() {
        return this.analysisJob;
    }

    public SubmitAnalysisJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControlCrop extends TeaModel {
        /**
         * <p>The height of the video after the margins were cropped out.</p>
         * <br>
         * <p>>  This parameter is invalid if the **Mode** parameter is set to Auto or None.</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The left margin that was cropped out.</p>
         * <br>
         * <p>>  This parameter is invalid if the **Mode** parameter is set to Auto or None.</p>
         */
        @NameInMap("Left")
        public String left;

        /**
         * <p>The cropping mode. Valid values: Valid values:</p>
         * <br>
         * <p>*   **Auto**: Cropping was automatically run. This is the default value.</p>
         * <p>*   **Force**: Cropping was forced to run.</p>
         * <p>*   **None**: Cropping was forced not to run.</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The top margin that was cropped out.</p>
         * <br>
         * <p>>  This parameter is invalid if the **Mode** parameter is set to Auto or None.</p>
         */
        @NameInMap("Top")
        public String top;

        /**
         * <p>The width of the video after the margins were cropped out.</p>
         * <br>
         * <p>>  This parameter is invalid if the **Mode** parameter is set to Auto or None.</p>
         */
        @NameInMap("Width")
        public String width;

        public static SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControlCrop build(java.util.Map<String, ?> map) throws Exception {
            SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControlCrop self = new SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControlCrop();
            return TeaModel.build(map, self);
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControlCrop setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControlCrop setLeft(String left) {
            this.left = left;
            return this;
        }
        public String getLeft() {
            return this.left;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControlCrop setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControlCrop setTop(String top) {
            this.top = top;
            return this;
        }
        public String getTop() {
            return this.top;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControlCrop setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControl extends TeaModel {
        /**
         * <p>The cropping configuration of video images.</p>
         */
        @NameInMap("Crop")
        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControlCrop crop;

        /**
         * <p>Indicates whether deinterlacing was forced to run. Valid values:</p>
         * <br>
         * <p>*   **Auto**: Deinterlacing was automatically run.</p>
         * <p>*   **Force**: Deinterlacing was forced to run.</p>
         * <p>*   **None**: Deinterlacing was forced not to run.</p>
         */
        @NameInMap("Deinterlace")
        public String deinterlace;

        public static SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControl build(java.util.Map<String, ?> map) throws Exception {
            SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControl self = new SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControl();
            return TeaModel.build(map, self);
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControl setCrop(SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControlCrop crop) {
            this.crop = crop;
            return this;
        }
        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControlCrop getCrop() {
            return this.crop;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControl setDeinterlace(String deinterlace) {
            this.deinterlace = deinterlace;
            return this;
        }
        public String getDeinterlace() {
            return this.deinterlace;
        }

    }

    public static class SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigQualityControl extends TeaModel {
        /**
         * <p>The playback mode. Valid values:</p>
         * <br>
         * <p>*   **network**: online playback</p>
         * <p>*   **local**: playback on on-premises devices</p>
         * <p>*   Default value: **network**.</p>
         */
        @NameInMap("MethodStreaming")
        public String methodStreaming;

        /**
         * <p>The quality level of the job output.</p>
         */
        @NameInMap("RateQuality")
        public String rateQuality;

        public static SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigQualityControl build(java.util.Map<String, ?> map) throws Exception {
            SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigQualityControl self = new SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigQualityControl();
            return TeaModel.build(map, self);
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigQualityControl setMethodStreaming(String methodStreaming) {
            this.methodStreaming = methodStreaming;
            return this;
        }
        public String getMethodStreaming() {
            return this.methodStreaming;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigQualityControl setRateQuality(String rateQuality) {
            this.rateQuality = rateQuality;
            return this;
        }
        public String getRateQuality() {
            return this.rateQuality;
        }

    }

    public static class SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfig extends TeaModel {
        /**
         * <p>The control on the attributes of the job output.</p>
         */
        @NameInMap("PropertiesControl")
        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControl propertiesControl;

        /**
         * <p>The quality control on the job output.</p>
         */
        @NameInMap("QualityControl")
        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigQualityControl qualityControl;

        public static SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfig self = new SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfig();
            return TeaModel.build(map, self);
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfig setPropertiesControl(SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControl propertiesControl) {
            this.propertiesControl = propertiesControl;
            return this;
        }
        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControl getPropertiesControl() {
            return this.propertiesControl;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfig setQualityControl(SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigQualityControl qualityControl) {
            this.qualityControl = qualityControl;
            return this;
        }
        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigQualityControl getQualityControl() {
            return this.qualityControl;
        }

    }

    public static class SubmitAnalysisJobResponseBodyAnalysisJobInputFile extends TeaModel {
        /**
         * <p>The name of the OSS bucket to which the input file is uploaded.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the OSS region.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the input file uploaded to the OSS bucket.</p>
         */
        @NameInMap("Object")
        public String object;

        public static SubmitAnalysisJobResponseBodyAnalysisJobInputFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitAnalysisJobResponseBodyAnalysisJobInputFile self = new SubmitAnalysisJobResponseBodyAnalysisJobInputFile();
            return TeaModel.build(map, self);
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class SubmitAnalysisJobResponseBodyAnalysisJobMNSMessageResult extends TeaModel {
        /**
         * <p>The error code returned when the job fails. This parameter is not returned if the job is successful.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the job fails. This parameter is not returned if the job is successful.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the success message. This parameter is not returned if the job fails.</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        public static SubmitAnalysisJobResponseBodyAnalysisJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            SubmitAnalysisJobResponseBodyAnalysisJobMNSMessageResult self = new SubmitAnalysisJobResponseBodyAnalysisJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

    public static class SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateAudio extends TeaModel {
        /**
         * <p>The audio bitrate of the output file.</p>
         * <br>
         * <p>*   Unit: Kbit/s.</p>
         * <p>*   Default value: **128**.</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The number of sound channels. Default value: **2**.</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <p>The audio codec format. Default value: **aac**.</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The codec profile of the audio file. Valid values when the **Codec** parameter is set to **aac**: aac_low, aac_he, aac_he_v2, aac_ld, and aac_eld.</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The level of quality control on the audio.</p>
         */
        @NameInMap("Qscale")
        public String qscale;

        /**
         * <p>The sampling rate.</p>
         * <br>
         * <p>*   Unit: Hz.</p>
         * <p>*   Default value: **44100**.</p>
         */
        @NameInMap("Samplerate")
        public String samplerate;

        public static SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateAudio build(java.util.Map<String, ?> map) throws Exception {
            SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateAudio self = new SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateAudio();
            return TeaModel.build(map, self);
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateAudio setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

    }

    public static class SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateContainer extends TeaModel {
        /**
         * <p>The container format.</p>
         */
        @NameInMap("Format")
        public String format;

        public static SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateContainer build(java.util.Map<String, ?> map) throws Exception {
            SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateContainer self = new SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateContainer();
            return TeaModel.build(map, self);
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfigGif extends TeaModel {
        /**
         * <p>The interval between two consecutive loops for the GIF format. Unit: 0.01s. For example, a value of 500 indicates 5 seconds.</p>
         */
        @NameInMap("FinalDelay")
        public String finalDelay;

        /**
         * <p>The number of loops for the GIF or WebP format. Default value: 0.</p>
         */
        @NameInMap("Loop")
        public String loop;

        public static SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfigGif build(java.util.Map<String, ?> map) throws Exception {
            SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfigGif self = new SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfigGif();
            return TeaModel.build(map, self);
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfigGif setFinalDelay(String finalDelay) {
            this.finalDelay = finalDelay;
            return this;
        }
        public String getFinalDelay() {
            return this.finalDelay;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfigGif setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

    }

    public static class SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfigSegment extends TeaModel {
        /**
         * <p>The length of the segment. Unit: seconds.</p>
         */
        @NameInMap("Duration")
        public String duration;

        public static SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfigSegment self = new SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfig extends TeaModel {
        /**
         * <p>The GIF format.</p>
         */
        @NameInMap("Gif")
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfigGif gif;

        /**
         * <p>The segment configuration.</p>
         */
        @NameInMap("Segment")
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfigSegment segment;

        public static SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfig self = new SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfig();
            return TeaModel.build(map, self);
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfig setGif(SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfigGif gif) {
            this.gif = gif;
            return this;
        }
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfigGif getGif() {
            return this.gif;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfig setSegment(SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfigSegment getSegment() {
            return this.segment;
        }

    }

    public static class SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateTransConfig extends TeaModel {
        /**
         * <p>The transcoding mode. Valid values: onepass, twopass, and CBR. Default value: **onepass**.</p>
         */
        @NameInMap("TransMode")
        public String transMode;

        public static SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateTransConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateTransConfig self = new SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateTransConfig();
            return TeaModel.build(map, self);
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateTransConfig setTransMode(String transMode) {
            this.transMode = transMode;
            return this;
        }
        public String getTransMode() {
            return this.transMode;
        }

    }

    public static class SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideoBitrateBnd extends TeaModel {
        /**
         * <p>The upper limit of the total bitrate. Unit: Kbit/s.</p>
         */
        @NameInMap("Max")
        public String max;

        /**
         * <p>The lower limit of the total bitrate. Unit: Kbit/s.</p>
         */
        @NameInMap("Min")
        public String min;

        public static SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideoBitrateBnd build(java.util.Map<String, ?> map) throws Exception {
            SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideoBitrateBnd self = new SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideoBitrateBnd();
            return TeaModel.build(map, self);
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideoBitrateBnd setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideoBitrateBnd setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

    }

    public static class SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo extends TeaModel {
        /**
         * <p>The average bitrate of the video. Unit: Kbit/s.</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The average bitrate range of the video.</p>
         */
        @NameInMap("BitrateBnd")
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideoBitrateBnd bitrateBnd;

        /**
         * <p>The size of the buffer.</p>
         * <br>
         * <p>*   Unit: KB.</p>
         * <p>*   Default value: **6000**.</p>
         */
        @NameInMap("Bufsize")
        public String bufsize;

        /**
         * <p>The video codec format. Default value: **H.264**.</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The constant rate factor, which is the default quality control setting.</p>
         * <br>
         * <p>*   Default value when the Codec parameter is set to H.264: **23**. Default value when the Codec parameter is set to H.265: **26**.</p>
         * <p>*   If this parameter is returned, the setting of the Bitrate parameter is invalid.</p>
         */
        @NameInMap("Crf")
        public String crf;

        /**
         * <p>The level of the independent denoising algorithm.</p>
         */
        @NameInMap("Degrain")
        public String degrain;

        /**
         * <p>The frame rate.</p>
         * <br>
         * <p>*   The value is 60 if the frame rate of the input file exceeds 60.</p>
         * <p>*   Default value: **the frame rate of the input file**.</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The maximum number of frames between two keyframes. Default value: **250**.</p>
         */
        @NameInMap("Gop")
        public String gop;

        /**
         * <p>The height of the video.</p>
         * <br>
         * <p>*   Unit: pixel.</p>
         * <p>*   Default value: **the original height of the video**.</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The maximum video bitrate. Unit: Kbit/s.</p>
         */
        @NameInMap("Maxrate")
        public String maxrate;

        /**
         * <p>The pixel format for video color encoding. Valid values: standard pixel formats such as yuv420p and yuvj420p.</p>
         */
        @NameInMap("PixFmt")
        public String pixFmt;

        /**
         * <p>The preset video algorithm. Valid values: veryfast, fast, medium, slow, and slower. Default value: **medium**.</p>
         */
        @NameInMap("Preset")
        public String preset;

        /**
         * <p>The codec profile. Valid values:</p>
         * <br>
         * <p>*   **baseline**: applicable to mobile devices.</p>
         * <p>*   **main**: applicable to standard-definition devices.</p>
         * <p>*   **high**: applicable to high-definition devices.</p>
         * <p>*   Default value: **high**.</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The level of quality control on the video.</p>
         */
        @NameInMap("Qscale")
        public String qscale;

        /**
         * <p>The scan mode. Valid values:</p>
         * <br>
         * <p>*   **interlaced**: An interlaced scan was performed.</p>
         * <p>*   **progressive**: A progressive scan was performed.</p>
         */
        @NameInMap("ScanMode")
        public String scanMode;

        /**
         * <p>The width of the video.</p>
         * <br>
         * <p>*   Unit: pixel.</p>
         * <p>*   Default value: **the original width of the video**.</p>
         */
        @NameInMap("Width")
        public String width;

        public static SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo build(java.util.Map<String, ?> map) throws Exception {
            SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo self = new SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo();
            return TeaModel.build(map, self);
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo setBitrateBnd(SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideoBitrateBnd bitrateBnd) {
            this.bitrateBnd = bitrateBnd;
            return this;
        }
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideoBitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo setDegrain(String degrain) {
            this.degrain = degrain;
            return this;
        }
        public String getDegrain() {
            return this.degrain;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplate extends TeaModel {
        /**
         * <p>The audio codec configuration.</p>
         */
        @NameInMap("Audio")
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateAudio audio;

        /**
         * <p>The container configuration.</p>
         */
        @NameInMap("Container")
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateContainer container;

        /**
         * <p>The ID of the transcoding template.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The transmuxing configuration.</p>
         */
        @NameInMap("MuxConfig")
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfig muxConfig;

        /**
         * <p>The name of the template.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the template. Valid values:</p>
         * <br>
         * <p>*   **Normal**: The template is in the normal state.</p>
         * <p>*   **Deleted**: The template is deleted.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The general transcoding configuration.</p>
         */
        @NameInMap("TransConfig")
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateTransConfig transConfig;

        /**
         * <p>The video codec configuration.</p>
         */
        @NameInMap("Video")
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo video;

        public static SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplate build(java.util.Map<String, ?> map) throws Exception {
            SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplate self = new SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplate();
            return TeaModel.build(map, self);
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplate setAudio(SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateAudio audio) {
            this.audio = audio;
            return this;
        }
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateAudio getAudio() {
            return this.audio;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplate setContainer(SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateContainer container) {
            this.container = container;
            return this;
        }
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateContainer getContainer() {
            return this.container;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplate setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplate setMuxConfig(SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplate setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplate setTransConfig(SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateTransConfig transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateTransConfig getTransConfig() {
            return this.transConfig;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplate setVideo(SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo video) {
            this.video = video;
            return this;
        }
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideo getVideo() {
            return this.video;
        }

    }

    public static class SubmitAnalysisJobResponseBodyAnalysisJobTemplateList extends TeaModel {
        @NameInMap("Template")
        public java.util.List<SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplate> template;

        public static SubmitAnalysisJobResponseBodyAnalysisJobTemplateList build(java.util.Map<String, ?> map) throws Exception {
            SubmitAnalysisJobResponseBodyAnalysisJobTemplateList self = new SubmitAnalysisJobResponseBodyAnalysisJobTemplateList();
            return TeaModel.build(map, self);
        }

        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateList setTemplate(java.util.List<SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplate> template) {
            this.template = template;
            return this;
        }
        public java.util.List<SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplate> getTemplate() {
            return this.template;
        }

    }

    public static class SubmitAnalysisJobResponseBodyAnalysisJob extends TeaModel {
        /**
         * <p>The job configuration.</p>
         */
        @NameInMap("AnalysisConfig")
        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfig analysisConfig;

        /**
         * <p>The error code returned when the job fails. This parameter is not returned if the job is successful.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The time when the job was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the template analysis job.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The information about the job input.</p>
         */
        @NameInMap("InputFile")
        public SubmitAnalysisJobResponseBodyAnalysisJobInputFile inputFile;

        /**
         * <p>The message sent by MNS to notify the user of the job result.</p>
         */
        @NameInMap("MNSMessageResult")
        public SubmitAnalysisJobResponseBodyAnalysisJobMNSMessageResult MNSMessageResult;

        /**
         * <p>The error message returned when the job fails.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The transcoding progress.</p>
         */
        @NameInMap("Percent")
        public Long percent;

        /**
         * <p>The ID of the MPS queue to which the job is added.</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The priority of the job in the MPS queue to which the job is added. </p>
         * <br>
         * <p>- Valid values: **1 to 10**. A value of 10 indicates the highest priority.</p>
         * <p>- Default value: **10**.</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The status of the job. Valid values:</p>
         * <br>
         * <p>*   **Submitted**: The job has been submitted.</p>
         * <p>*   **Analyzing**: The job is being run.</p>
         * <p>*   **Success**: The job is successful.</p>
         * <p>*   **Fail**: The job fails.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The list of matched preset templates.</p>
         */
        @NameInMap("TemplateList")
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateList templateList;

        /**
         * <p>The custom data.</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static SubmitAnalysisJobResponseBodyAnalysisJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitAnalysisJobResponseBodyAnalysisJob self = new SubmitAnalysisJobResponseBodyAnalysisJob();
            return TeaModel.build(map, self);
        }

        public SubmitAnalysisJobResponseBodyAnalysisJob setAnalysisConfig(SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfig analysisConfig) {
            this.analysisConfig = analysisConfig;
            return this;
        }
        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfig getAnalysisConfig() {
            return this.analysisConfig;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJob setInputFile(SubmitAnalysisJobResponseBodyAnalysisJobInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public SubmitAnalysisJobResponseBodyAnalysisJobInputFile getInputFile() {
            return this.inputFile;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJob setMNSMessageResult(SubmitAnalysisJobResponseBodyAnalysisJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public SubmitAnalysisJobResponseBodyAnalysisJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJob setPercent(Long percent) {
            this.percent = percent;
            return this;
        }
        public Long getPercent() {
            return this.percent;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJob setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJob setTemplateList(SubmitAnalysisJobResponseBodyAnalysisJobTemplateList templateList) {
            this.templateList = templateList;
            return this;
        }
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateList getTemplateList() {
            return this.templateList;
        }

        public SubmitAnalysisJobResponseBodyAnalysisJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
