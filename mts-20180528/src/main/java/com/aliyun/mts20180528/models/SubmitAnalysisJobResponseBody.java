// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class SubmitAnalysisJobResponseBody extends TeaModel {
    @NameInMap("AnalysisJob")
    public SubmitAnalysisJobResponseBodyAnalysisJob analysisJob;

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
        @NameInMap("Height")
        public String height;

        @NameInMap("Left")
        public String left;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Top")
        public String top;

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
        @NameInMap("Crop")
        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControlCrop crop;

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
        @NameInMap("MethodStreaming")
        public String methodStreaming;

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
        @NameInMap("PropertiesControl")
        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfigPropertiesControl propertiesControl;

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
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

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
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

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
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Qscale")
        public String qscale;

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
        @NameInMap("FinalDelay")
        public String finalDelay;

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
        @NameInMap("Gif")
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfigGif gif;

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
        @NameInMap("Max")
        public String max;

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
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("BitrateBnd")
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateVideoBitrateBnd bitrateBnd;

        @NameInMap("Bufsize")
        public String bufsize;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Crf")
        public String crf;

        @NameInMap("Degrain")
        public String degrain;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Gop")
        public String gop;

        @NameInMap("Height")
        public String height;

        @NameInMap("Maxrate")
        public String maxrate;

        @NameInMap("PixFmt")
        public String pixFmt;

        @NameInMap("Preset")
        public String preset;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Qscale")
        public String qscale;

        @NameInMap("ScanMode")
        public String scanMode;

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
        @NameInMap("Audio")
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateAudio audio;

        @NameInMap("Container")
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateContainer container;

        @NameInMap("Id")
        public String id;

        @NameInMap("MuxConfig")
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateMuxConfig muxConfig;

        @NameInMap("Name")
        public String name;

        @NameInMap("State")
        public String state;

        @NameInMap("TransConfig")
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateListTemplateTransConfig transConfig;

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
        @NameInMap("AnalysisConfig")
        public SubmitAnalysisJobResponseBodyAnalysisJobAnalysisConfig analysisConfig;

        @NameInMap("Code")
        public String code;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("InputFile")
        public SubmitAnalysisJobResponseBodyAnalysisJobInputFile inputFile;

        @NameInMap("MNSMessageResult")
        public SubmitAnalysisJobResponseBodyAnalysisJobMNSMessageResult MNSMessageResult;

        @NameInMap("Message")
        public String message;

        @NameInMap("Percent")
        public Long percent;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("State")
        public String state;

        @NameInMap("TemplateList")
        public SubmitAnalysisJobResponseBodyAnalysisJobTemplateList templateList;

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
