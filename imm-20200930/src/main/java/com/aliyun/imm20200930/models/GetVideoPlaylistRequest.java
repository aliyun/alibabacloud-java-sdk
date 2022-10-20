// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetVideoPlaylistRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    @NameInMap("MasterURI")
    public String masterURI;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SourceDuration")
    public Float sourceDuration;

    @NameInMap("SourceStartTime")
    public Float sourceStartTime;

    @NameInMap("SourceSubtitles")
    public java.util.List<GetVideoPlaylistRequestSourceSubtitles> sourceSubtitles;

    @NameInMap("SourceURI")
    public String sourceURI;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    @NameInMap("Targets")
    public java.util.List<GetVideoPlaylistRequestTargets> targets;

    public static GetVideoPlaylistRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoPlaylistRequest self = new GetVideoPlaylistRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoPlaylistRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public GetVideoPlaylistRequest setMasterURI(String masterURI) {
        this.masterURI = masterURI;
        return this;
    }
    public String getMasterURI() {
        return this.masterURI;
    }

    public GetVideoPlaylistRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetVideoPlaylistRequest setSourceDuration(Float sourceDuration) {
        this.sourceDuration = sourceDuration;
        return this;
    }
    public Float getSourceDuration() {
        return this.sourceDuration;
    }

    public GetVideoPlaylistRequest setSourceStartTime(Float sourceStartTime) {
        this.sourceStartTime = sourceStartTime;
        return this;
    }
    public Float getSourceStartTime() {
        return this.sourceStartTime;
    }

    public GetVideoPlaylistRequest setSourceSubtitles(java.util.List<GetVideoPlaylistRequestSourceSubtitles> sourceSubtitles) {
        this.sourceSubtitles = sourceSubtitles;
        return this;
    }
    public java.util.List<GetVideoPlaylistRequestSourceSubtitles> getSourceSubtitles() {
        return this.sourceSubtitles;
    }

    public GetVideoPlaylistRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public GetVideoPlaylistRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public GetVideoPlaylistRequest setTargets(java.util.List<GetVideoPlaylistRequestTargets> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<GetVideoPlaylistRequestTargets> getTargets() {
        return this.targets;
    }

    public static class GetVideoPlaylistRequestSourceSubtitles extends TeaModel {
        @NameInMap("Language")
        public String language;

        @NameInMap("URI")
        public String URI;

        public static GetVideoPlaylistRequestSourceSubtitles build(java.util.Map<String, ?> map) throws Exception {
            GetVideoPlaylistRequestSourceSubtitles self = new GetVideoPlaylistRequestSourceSubtitles();
            return TeaModel.build(map, self);
        }

        public GetVideoPlaylistRequestSourceSubtitles setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetVideoPlaylistRequestSourceSubtitles setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

    public static class GetVideoPlaylistRequestTargetsAudioFilterAudio extends TeaModel {
        @NameInMap("Mixing")
        public Boolean mixing;

        public static GetVideoPlaylistRequestTargetsAudioFilterAudio build(java.util.Map<String, ?> map) throws Exception {
            GetVideoPlaylistRequestTargetsAudioFilterAudio self = new GetVideoPlaylistRequestTargetsAudioFilterAudio();
            return TeaModel.build(map, self);
        }

        public GetVideoPlaylistRequestTargetsAudioFilterAudio setMixing(Boolean mixing) {
            this.mixing = mixing;
            return this;
        }
        public Boolean getMixing() {
            return this.mixing;
        }

    }

    public static class GetVideoPlaylistRequestTargetsAudioTranscodeAudio extends TeaModel {
        @NameInMap("Bitrate")
        public Integer bitrate;

        @NameInMap("BitrateOption")
        public String bitrateOption;

        @NameInMap("Channel")
        public Integer channel;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Quality")
        public Integer quality;

        @NameInMap("SampleRate")
        public Integer sampleRate;

        @NameInMap("SampleRateOption")
        public String sampleRateOption;

        public static GetVideoPlaylistRequestTargetsAudioTranscodeAudio build(java.util.Map<String, ?> map) throws Exception {
            GetVideoPlaylistRequestTargetsAudioTranscodeAudio self = new GetVideoPlaylistRequestTargetsAudioTranscodeAudio();
            return TeaModel.build(map, self);
        }

        public GetVideoPlaylistRequestTargetsAudioTranscodeAudio setBitrate(Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Integer getBitrate() {
            return this.bitrate;
        }

        public GetVideoPlaylistRequestTargetsAudioTranscodeAudio setBitrateOption(String bitrateOption) {
            this.bitrateOption = bitrateOption;
            return this;
        }
        public String getBitrateOption() {
            return this.bitrateOption;
        }

        public GetVideoPlaylistRequestTargetsAudioTranscodeAudio setChannel(Integer channel) {
            this.channel = channel;
            return this;
        }
        public Integer getChannel() {
            return this.channel;
        }

        public GetVideoPlaylistRequestTargetsAudioTranscodeAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public GetVideoPlaylistRequestTargetsAudioTranscodeAudio setQuality(Integer quality) {
            this.quality = quality;
            return this;
        }
        public Integer getQuality() {
            return this.quality;
        }

        public GetVideoPlaylistRequestTargetsAudioTranscodeAudio setSampleRate(Integer sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public Integer getSampleRate() {
            return this.sampleRate;
        }

        public GetVideoPlaylistRequestTargetsAudioTranscodeAudio setSampleRateOption(String sampleRateOption) {
            this.sampleRateOption = sampleRateOption;
            return this;
        }
        public String getSampleRateOption() {
            return this.sampleRateOption;
        }

    }

    public static class GetVideoPlaylistRequestTargetsAudio extends TeaModel {
        @NameInMap("DisableAudio")
        public Boolean disableAudio;

        @NameInMap("FilterAudio")
        public GetVideoPlaylistRequestTargetsAudioFilterAudio filterAudio;

        @NameInMap("TranscodeAudio")
        public GetVideoPlaylistRequestTargetsAudioTranscodeAudio transcodeAudio;

        public static GetVideoPlaylistRequestTargetsAudio build(java.util.Map<String, ?> map) throws Exception {
            GetVideoPlaylistRequestTargetsAudio self = new GetVideoPlaylistRequestTargetsAudio();
            return TeaModel.build(map, self);
        }

        public GetVideoPlaylistRequestTargetsAudio setDisableAudio(Boolean disableAudio) {
            this.disableAudio = disableAudio;
            return this;
        }
        public Boolean getDisableAudio() {
            return this.disableAudio;
        }

        public GetVideoPlaylistRequestTargetsAudio setFilterAudio(GetVideoPlaylistRequestTargetsAudioFilterAudio filterAudio) {
            this.filterAudio = filterAudio;
            return this;
        }
        public GetVideoPlaylistRequestTargetsAudioFilterAudio getFilterAudio() {
            return this.filterAudio;
        }

        public GetVideoPlaylistRequestTargetsAudio setTranscodeAudio(GetVideoPlaylistRequestTargetsAudioTranscodeAudio transcodeAudio) {
            this.transcodeAudio = transcodeAudio;
            return this;
        }
        public GetVideoPlaylistRequestTargetsAudioTranscodeAudio getTranscodeAudio() {
            return this.transcodeAudio;
        }

    }

    public static class GetVideoPlaylistRequestTargetsSubtitleExtractSubtitle extends TeaModel {
        @NameInMap("Format")
        public String format;

        @NameInMap("URI")
        public String URI;

        public static GetVideoPlaylistRequestTargetsSubtitleExtractSubtitle build(java.util.Map<String, ?> map) throws Exception {
            GetVideoPlaylistRequestTargetsSubtitleExtractSubtitle self = new GetVideoPlaylistRequestTargetsSubtitleExtractSubtitle();
            return TeaModel.build(map, self);
        }

        public GetVideoPlaylistRequestTargetsSubtitleExtractSubtitle setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public GetVideoPlaylistRequestTargetsSubtitleExtractSubtitle setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

    public static class GetVideoPlaylistRequestTargetsSubtitle extends TeaModel {
        @NameInMap("DisableSubtitle")
        public Boolean disableSubtitle;

        @NameInMap("ExtractSubtitle")
        public GetVideoPlaylistRequestTargetsSubtitleExtractSubtitle extractSubtitle;

        public static GetVideoPlaylistRequestTargetsSubtitle build(java.util.Map<String, ?> map) throws Exception {
            GetVideoPlaylistRequestTargetsSubtitle self = new GetVideoPlaylistRequestTargetsSubtitle();
            return TeaModel.build(map, self);
        }

        public GetVideoPlaylistRequestTargetsSubtitle setDisableSubtitle(Boolean disableSubtitle) {
            this.disableSubtitle = disableSubtitle;
            return this;
        }
        public Boolean getDisableSubtitle() {
            return this.disableSubtitle;
        }

        public GetVideoPlaylistRequestTargetsSubtitle setExtractSubtitle(GetVideoPlaylistRequestTargetsSubtitleExtractSubtitle extractSubtitle) {
            this.extractSubtitle = extractSubtitle;
            return this;
        }
        public GetVideoPlaylistRequestTargetsSubtitleExtractSubtitle getExtractSubtitle() {
            return this.extractSubtitle;
        }

    }

    public static class GetVideoPlaylistRequestTargetsVideoFilterVideoDelogos extends TeaModel {
        @NameInMap("Duration")
        public Float duration;

        @NameInMap("Dx")
        public Float dx;

        @NameInMap("Dy")
        public Float dy;

        @NameInMap("Height")
        public Float height;

        @NameInMap("ReferPos")
        public String referPos;

        @NameInMap("StartTime")
        public Float startTime;

        @NameInMap("Width")
        public Float width;

        public static GetVideoPlaylistRequestTargetsVideoFilterVideoDelogos build(java.util.Map<String, ?> map) throws Exception {
            GetVideoPlaylistRequestTargetsVideoFilterVideoDelogos self = new GetVideoPlaylistRequestTargetsVideoFilterVideoDelogos();
            return TeaModel.build(map, self);
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoDelogos setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoDelogos setDx(Float dx) {
            this.dx = dx;
            return this;
        }
        public Float getDx() {
            return this.dx;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoDelogos setDy(Float dy) {
            this.dy = dy;
            return this;
        }
        public Float getDy() {
            return this.dy;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoDelogos setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoDelogos setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoDelogos setStartTime(Float startTime) {
            this.startTime = startTime;
            return this;
        }
        public Float getStartTime() {
            return this.startTime;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoDelogos setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

    }

    public static class GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks extends TeaModel {
        @NameInMap("BoardWidth")
        public Integer boardWidth;

        @NameInMap("BorderColor")
        public String borderColor;

        @NameInMap("Content")
        public String content;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("Dx")
        public Float dx;

        @NameInMap("Dy")
        public Float dy;

        @NameInMap("FontApha")
        public Float fontApha;

        @NameInMap("FontColor")
        public String fontColor;

        @NameInMap("FontName")
        public String fontName;

        @NameInMap("FontSize")
        public Integer fontSize;

        @NameInMap("Height")
        public Float height;

        @NameInMap("ReferPos")
        public String referPos;

        @NameInMap("StartTime")
        public Float startTime;

        @NameInMap("Type")
        public String type;

        @NameInMap("URI")
        public String URI;

        @NameInMap("Width")
        public Float width;

        public static GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks build(java.util.Map<String, ?> map) throws Exception {
            GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks self = new GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks();
            return TeaModel.build(map, self);
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setBoardWidth(Integer boardWidth) {
            this.boardWidth = boardWidth;
            return this;
        }
        public Integer getBoardWidth() {
            return this.boardWidth;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setBorderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }
        public String getBorderColor() {
            return this.borderColor;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setDx(Float dx) {
            this.dx = dx;
            return this;
        }
        public Float getDx() {
            return this.dx;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setDy(Float dy) {
            this.dy = dy;
            return this;
        }
        public Float getDy() {
            return this.dy;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setFontApha(Float fontApha) {
            this.fontApha = fontApha;
            return this;
        }
        public Float getFontApha() {
            return this.fontApha;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setStartTime(Float startTime) {
            this.startTime = startTime;
            return this;
        }
        public Float getStartTime() {
            return this.startTime;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

    }

    public static class GetVideoPlaylistRequestTargetsVideoFilterVideo extends TeaModel {
        @NameInMap("Delogos")
        public java.util.List<GetVideoPlaylistRequestTargetsVideoFilterVideoDelogos> delogos;

        @NameInMap("Watermarks")
        public java.util.List<GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks> watermarks;

        public static GetVideoPlaylistRequestTargetsVideoFilterVideo build(java.util.Map<String, ?> map) throws Exception {
            GetVideoPlaylistRequestTargetsVideoFilterVideo self = new GetVideoPlaylistRequestTargetsVideoFilterVideo();
            return TeaModel.build(map, self);
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideo setDelogos(java.util.List<GetVideoPlaylistRequestTargetsVideoFilterVideoDelogos> delogos) {
            this.delogos = delogos;
            return this;
        }
        public java.util.List<GetVideoPlaylistRequestTargetsVideoFilterVideoDelogos> getDelogos() {
            return this.delogos;
        }

        public GetVideoPlaylistRequestTargetsVideoFilterVideo setWatermarks(java.util.List<GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks> watermarks) {
            this.watermarks = watermarks;
            return this;
        }
        public java.util.List<GetVideoPlaylistRequestTargetsVideoFilterVideoWatermarks> getWatermarks() {
            return this.watermarks;
        }

    }

    public static class GetVideoPlaylistRequestTargetsVideoTranscodeVideo extends TeaModel {
        @NameInMap("AdaptiveResolutionDirection")
        public Boolean adaptiveResolutionDirection;

        @NameInMap("BFrames")
        public Integer BFrames;

        @NameInMap("Bitrate")
        public Integer bitrate;

        @NameInMap("BitrateOption")
        public String bitrateOption;

        @NameInMap("BufferSize")
        public Integer bufferSize;

        @NameInMap("CRF")
        public Float CRF;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("FrameRate")
        public Float frameRate;

        @NameInMap("FrameRateOption")
        public String frameRateOption;

        @NameInMap("GOPSize")
        public Integer GOPSize;

        @NameInMap("MaxBitrate")
        public Integer maxBitrate;

        @NameInMap("PixelFormat")
        public String pixelFormat;

        @NameInMap("Refs")
        public Integer refs;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("ResolutionOption")
        public String resolutionOption;

        @NameInMap("Rotation")
        public Integer rotation;

        @NameInMap("ScaleType")
        public String scaleType;

        public static GetVideoPlaylistRequestTargetsVideoTranscodeVideo build(java.util.Map<String, ?> map) throws Exception {
            GetVideoPlaylistRequestTargetsVideoTranscodeVideo self = new GetVideoPlaylistRequestTargetsVideoTranscodeVideo();
            return TeaModel.build(map, self);
        }

        public GetVideoPlaylistRequestTargetsVideoTranscodeVideo setAdaptiveResolutionDirection(Boolean adaptiveResolutionDirection) {
            this.adaptiveResolutionDirection = adaptiveResolutionDirection;
            return this;
        }
        public Boolean getAdaptiveResolutionDirection() {
            return this.adaptiveResolutionDirection;
        }

        public GetVideoPlaylistRequestTargetsVideoTranscodeVideo setBFrames(Integer BFrames) {
            this.BFrames = BFrames;
            return this;
        }
        public Integer getBFrames() {
            return this.BFrames;
        }

        public GetVideoPlaylistRequestTargetsVideoTranscodeVideo setBitrate(Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Integer getBitrate() {
            return this.bitrate;
        }

        public GetVideoPlaylistRequestTargetsVideoTranscodeVideo setBitrateOption(String bitrateOption) {
            this.bitrateOption = bitrateOption;
            return this;
        }
        public String getBitrateOption() {
            return this.bitrateOption;
        }

        public GetVideoPlaylistRequestTargetsVideoTranscodeVideo setBufferSize(Integer bufferSize) {
            this.bufferSize = bufferSize;
            return this;
        }
        public Integer getBufferSize() {
            return this.bufferSize;
        }

        public GetVideoPlaylistRequestTargetsVideoTranscodeVideo setCRF(Float CRF) {
            this.CRF = CRF;
            return this;
        }
        public Float getCRF() {
            return this.CRF;
        }

        public GetVideoPlaylistRequestTargetsVideoTranscodeVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public GetVideoPlaylistRequestTargetsVideoTranscodeVideo setFrameRate(Float frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Float getFrameRate() {
            return this.frameRate;
        }

        public GetVideoPlaylistRequestTargetsVideoTranscodeVideo setFrameRateOption(String frameRateOption) {
            this.frameRateOption = frameRateOption;
            return this;
        }
        public String getFrameRateOption() {
            return this.frameRateOption;
        }

        public GetVideoPlaylistRequestTargetsVideoTranscodeVideo setGOPSize(Integer GOPSize) {
            this.GOPSize = GOPSize;
            return this;
        }
        public Integer getGOPSize() {
            return this.GOPSize;
        }

        public GetVideoPlaylistRequestTargetsVideoTranscodeVideo setMaxBitrate(Integer maxBitrate) {
            this.maxBitrate = maxBitrate;
            return this;
        }
        public Integer getMaxBitrate() {
            return this.maxBitrate;
        }

        public GetVideoPlaylistRequestTargetsVideoTranscodeVideo setPixelFormat(String pixelFormat) {
            this.pixelFormat = pixelFormat;
            return this;
        }
        public String getPixelFormat() {
            return this.pixelFormat;
        }

        public GetVideoPlaylistRequestTargetsVideoTranscodeVideo setRefs(Integer refs) {
            this.refs = refs;
            return this;
        }
        public Integer getRefs() {
            return this.refs;
        }

        public GetVideoPlaylistRequestTargetsVideoTranscodeVideo setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public GetVideoPlaylistRequestTargetsVideoTranscodeVideo setResolutionOption(String resolutionOption) {
            this.resolutionOption = resolutionOption;
            return this;
        }
        public String getResolutionOption() {
            return this.resolutionOption;
        }

        public GetVideoPlaylistRequestTargetsVideoTranscodeVideo setRotation(Integer rotation) {
            this.rotation = rotation;
            return this;
        }
        public Integer getRotation() {
            return this.rotation;
        }

        public GetVideoPlaylistRequestTargetsVideoTranscodeVideo setScaleType(String scaleType) {
            this.scaleType = scaleType;
            return this;
        }
        public String getScaleType() {
            return this.scaleType;
        }

    }

    public static class GetVideoPlaylistRequestTargetsVideo extends TeaModel {
        @NameInMap("DisableVideo")
        public Boolean disableVideo;

        @NameInMap("FilterVideo")
        public GetVideoPlaylistRequestTargetsVideoFilterVideo filterVideo;

        @NameInMap("TranscodeVideo")
        public GetVideoPlaylistRequestTargetsVideoTranscodeVideo transcodeVideo;

        public static GetVideoPlaylistRequestTargetsVideo build(java.util.Map<String, ?> map) throws Exception {
            GetVideoPlaylistRequestTargetsVideo self = new GetVideoPlaylistRequestTargetsVideo();
            return TeaModel.build(map, self);
        }

        public GetVideoPlaylistRequestTargetsVideo setDisableVideo(Boolean disableVideo) {
            this.disableVideo = disableVideo;
            return this;
        }
        public Boolean getDisableVideo() {
            return this.disableVideo;
        }

        public GetVideoPlaylistRequestTargetsVideo setFilterVideo(GetVideoPlaylistRequestTargetsVideoFilterVideo filterVideo) {
            this.filterVideo = filterVideo;
            return this;
        }
        public GetVideoPlaylistRequestTargetsVideoFilterVideo getFilterVideo() {
            return this.filterVideo;
        }

        public GetVideoPlaylistRequestTargetsVideo setTranscodeVideo(GetVideoPlaylistRequestTargetsVideoTranscodeVideo transcodeVideo) {
            this.transcodeVideo = transcodeVideo;
            return this;
        }
        public GetVideoPlaylistRequestTargetsVideoTranscodeVideo getTranscodeVideo() {
            return this.transcodeVideo;
        }

    }

    public static class GetVideoPlaylistRequestTargets extends TeaModel {
        @NameInMap("Audio")
        public GetVideoPlaylistRequestTargetsAudio audio;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("InitialSegments")
        public java.util.List<Float> initialSegments;

        @NameInMap("InitialTranscode")
        public Float initialTranscode;

        @NameInMap("PresetId")
        public PresetReference presetId;

        @NameInMap("Speed")
        public Float speed;

        @NameInMap("Subtitle")
        public GetVideoPlaylistRequestTargetsSubtitle subtitle;

        @NameInMap("TranscodeAhead")
        public Integer transcodeAhead;

        @NameInMap("URI")
        public String URI;

        @NameInMap("Video")
        public GetVideoPlaylistRequestTargetsVideo video;

        public static GetVideoPlaylistRequestTargets build(java.util.Map<String, ?> map) throws Exception {
            GetVideoPlaylistRequestTargets self = new GetVideoPlaylistRequestTargets();
            return TeaModel.build(map, self);
        }

        public GetVideoPlaylistRequestTargets setAudio(GetVideoPlaylistRequestTargetsAudio audio) {
            this.audio = audio;
            return this;
        }
        public GetVideoPlaylistRequestTargetsAudio getAudio() {
            return this.audio;
        }

        public GetVideoPlaylistRequestTargets setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetVideoPlaylistRequestTargets setInitialSegments(java.util.List<Float> initialSegments) {
            this.initialSegments = initialSegments;
            return this;
        }
        public java.util.List<Float> getInitialSegments() {
            return this.initialSegments;
        }

        public GetVideoPlaylistRequestTargets setInitialTranscode(Float initialTranscode) {
            this.initialTranscode = initialTranscode;
            return this;
        }
        public Float getInitialTranscode() {
            return this.initialTranscode;
        }

        public GetVideoPlaylistRequestTargets setPresetId(PresetReference presetId) {
            this.presetId = presetId;
            return this;
        }
        public PresetReference getPresetId() {
            return this.presetId;
        }

        public GetVideoPlaylistRequestTargets setSpeed(Float speed) {
            this.speed = speed;
            return this;
        }
        public Float getSpeed() {
            return this.speed;
        }

        public GetVideoPlaylistRequestTargets setSubtitle(GetVideoPlaylistRequestTargetsSubtitle subtitle) {
            this.subtitle = subtitle;
            return this;
        }
        public GetVideoPlaylistRequestTargetsSubtitle getSubtitle() {
            return this.subtitle;
        }

        public GetVideoPlaylistRequestTargets setTranscodeAhead(Integer transcodeAhead) {
            this.transcodeAhead = transcodeAhead;
            return this;
        }
        public Integer getTranscodeAhead() {
            return this.transcodeAhead;
        }

        public GetVideoPlaylistRequestTargets setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public GetVideoPlaylistRequestTargets setVideo(GetVideoPlaylistRequestTargetsVideo video) {
            this.video = video;
            return this;
        }
        public GetVideoPlaylistRequestTargetsVideo getVideo() {
            return this.video;
        }

    }

}
