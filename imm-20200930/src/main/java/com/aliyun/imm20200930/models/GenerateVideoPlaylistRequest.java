// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateVideoPlaylistRequest extends TeaModel {
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
    public java.util.List<GenerateVideoPlaylistRequestSourceSubtitles> sourceSubtitles;

    @NameInMap("SourceURI")
    public String sourceURI;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    @NameInMap("Targets")
    public java.util.List<GenerateVideoPlaylistRequestTargets> targets;

    public static GenerateVideoPlaylistRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoPlaylistRequest self = new GenerateVideoPlaylistRequest();
        return TeaModel.build(map, self);
    }

    public GenerateVideoPlaylistRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public GenerateVideoPlaylistRequest setMasterURI(String masterURI) {
        this.masterURI = masterURI;
        return this;
    }
    public String getMasterURI() {
        return this.masterURI;
    }

    public GenerateVideoPlaylistRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GenerateVideoPlaylistRequest setSourceDuration(Float sourceDuration) {
        this.sourceDuration = sourceDuration;
        return this;
    }
    public Float getSourceDuration() {
        return this.sourceDuration;
    }

    public GenerateVideoPlaylistRequest setSourceStartTime(Float sourceStartTime) {
        this.sourceStartTime = sourceStartTime;
        return this;
    }
    public Float getSourceStartTime() {
        return this.sourceStartTime;
    }

    public GenerateVideoPlaylistRequest setSourceSubtitles(java.util.List<GenerateVideoPlaylistRequestSourceSubtitles> sourceSubtitles) {
        this.sourceSubtitles = sourceSubtitles;
        return this;
    }
    public java.util.List<GenerateVideoPlaylistRequestSourceSubtitles> getSourceSubtitles() {
        return this.sourceSubtitles;
    }

    public GenerateVideoPlaylistRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public GenerateVideoPlaylistRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public GenerateVideoPlaylistRequest setTargets(java.util.List<GenerateVideoPlaylistRequestTargets> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<GenerateVideoPlaylistRequestTargets> getTargets() {
        return this.targets;
    }

    public static class GenerateVideoPlaylistRequestSourceSubtitles extends TeaModel {
        @NameInMap("Language")
        public String language;

        @NameInMap("URI")
        public String URI;

        public static GenerateVideoPlaylistRequestSourceSubtitles build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoPlaylistRequestSourceSubtitles self = new GenerateVideoPlaylistRequestSourceSubtitles();
            return TeaModel.build(map, self);
        }

        public GenerateVideoPlaylistRequestSourceSubtitles setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GenerateVideoPlaylistRequestSourceSubtitles setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

    public static class GenerateVideoPlaylistRequestTargetsAudioFilterAudio extends TeaModel {
        @NameInMap("Mixing")
        public Boolean mixing;

        public static GenerateVideoPlaylistRequestTargetsAudioFilterAudio build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoPlaylistRequestTargetsAudioFilterAudio self = new GenerateVideoPlaylistRequestTargetsAudioFilterAudio();
            return TeaModel.build(map, self);
        }

        public GenerateVideoPlaylistRequestTargetsAudioFilterAudio setMixing(Boolean mixing) {
            this.mixing = mixing;
            return this;
        }
        public Boolean getMixing() {
            return this.mixing;
        }

    }

    public static class GenerateVideoPlaylistRequestTargetsAudioTranscodeAudio extends TeaModel {
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

        public static GenerateVideoPlaylistRequestTargetsAudioTranscodeAudio build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoPlaylistRequestTargetsAudioTranscodeAudio self = new GenerateVideoPlaylistRequestTargetsAudioTranscodeAudio();
            return TeaModel.build(map, self);
        }

        public GenerateVideoPlaylistRequestTargetsAudioTranscodeAudio setBitrate(Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Integer getBitrate() {
            return this.bitrate;
        }

        public GenerateVideoPlaylistRequestTargetsAudioTranscodeAudio setBitrateOption(String bitrateOption) {
            this.bitrateOption = bitrateOption;
            return this;
        }
        public String getBitrateOption() {
            return this.bitrateOption;
        }

        public GenerateVideoPlaylistRequestTargetsAudioTranscodeAudio setChannel(Integer channel) {
            this.channel = channel;
            return this;
        }
        public Integer getChannel() {
            return this.channel;
        }

        public GenerateVideoPlaylistRequestTargetsAudioTranscodeAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public GenerateVideoPlaylistRequestTargetsAudioTranscodeAudio setQuality(Integer quality) {
            this.quality = quality;
            return this;
        }
        public Integer getQuality() {
            return this.quality;
        }

        public GenerateVideoPlaylistRequestTargetsAudioTranscodeAudio setSampleRate(Integer sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public Integer getSampleRate() {
            return this.sampleRate;
        }

        public GenerateVideoPlaylistRequestTargetsAudioTranscodeAudio setSampleRateOption(String sampleRateOption) {
            this.sampleRateOption = sampleRateOption;
            return this;
        }
        public String getSampleRateOption() {
            return this.sampleRateOption;
        }

    }

    public static class GenerateVideoPlaylistRequestTargetsAudio extends TeaModel {
        @NameInMap("DisableAudio")
        public Boolean disableAudio;

        @NameInMap("FilterAudio")
        public GenerateVideoPlaylistRequestTargetsAudioFilterAudio filterAudio;

        @NameInMap("TranscodeAudio")
        public GenerateVideoPlaylistRequestTargetsAudioTranscodeAudio transcodeAudio;

        public static GenerateVideoPlaylistRequestTargetsAudio build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoPlaylistRequestTargetsAudio self = new GenerateVideoPlaylistRequestTargetsAudio();
            return TeaModel.build(map, self);
        }

        public GenerateVideoPlaylistRequestTargetsAudio setDisableAudio(Boolean disableAudio) {
            this.disableAudio = disableAudio;
            return this;
        }
        public Boolean getDisableAudio() {
            return this.disableAudio;
        }

        public GenerateVideoPlaylistRequestTargetsAudio setFilterAudio(GenerateVideoPlaylistRequestTargetsAudioFilterAudio filterAudio) {
            this.filterAudio = filterAudio;
            return this;
        }
        public GenerateVideoPlaylistRequestTargetsAudioFilterAudio getFilterAudio() {
            return this.filterAudio;
        }

        public GenerateVideoPlaylistRequestTargetsAudio setTranscodeAudio(GenerateVideoPlaylistRequestTargetsAudioTranscodeAudio transcodeAudio) {
            this.transcodeAudio = transcodeAudio;
            return this;
        }
        public GenerateVideoPlaylistRequestTargetsAudioTranscodeAudio getTranscodeAudio() {
            return this.transcodeAudio;
        }

    }

    public static class GenerateVideoPlaylistRequestTargetsSubtitleExtractSubtitle extends TeaModel {
        @NameInMap("Format")
        public String format;

        @NameInMap("URI")
        public String URI;

        public static GenerateVideoPlaylistRequestTargetsSubtitleExtractSubtitle build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoPlaylistRequestTargetsSubtitleExtractSubtitle self = new GenerateVideoPlaylistRequestTargetsSubtitleExtractSubtitle();
            return TeaModel.build(map, self);
        }

        public GenerateVideoPlaylistRequestTargetsSubtitleExtractSubtitle setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public GenerateVideoPlaylistRequestTargetsSubtitleExtractSubtitle setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

    public static class GenerateVideoPlaylistRequestTargetsSubtitle extends TeaModel {
        @NameInMap("DisableSubtitle")
        public Boolean disableSubtitle;

        @NameInMap("ExtractSubtitle")
        public GenerateVideoPlaylistRequestTargetsSubtitleExtractSubtitle extractSubtitle;

        public static GenerateVideoPlaylistRequestTargetsSubtitle build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoPlaylistRequestTargetsSubtitle self = new GenerateVideoPlaylistRequestTargetsSubtitle();
            return TeaModel.build(map, self);
        }

        public GenerateVideoPlaylistRequestTargetsSubtitle setDisableSubtitle(Boolean disableSubtitle) {
            this.disableSubtitle = disableSubtitle;
            return this;
        }
        public Boolean getDisableSubtitle() {
            return this.disableSubtitle;
        }

        public GenerateVideoPlaylistRequestTargetsSubtitle setExtractSubtitle(GenerateVideoPlaylistRequestTargetsSubtitleExtractSubtitle extractSubtitle) {
            this.extractSubtitle = extractSubtitle;
            return this;
        }
        public GenerateVideoPlaylistRequestTargetsSubtitleExtractSubtitle getExtractSubtitle() {
            return this.extractSubtitle;
        }

    }

    public static class GenerateVideoPlaylistRequestTargetsVideoFilterVideoDelogos extends TeaModel {
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

        public static GenerateVideoPlaylistRequestTargetsVideoFilterVideoDelogos build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoPlaylistRequestTargetsVideoFilterVideoDelogos self = new GenerateVideoPlaylistRequestTargetsVideoFilterVideoDelogos();
            return TeaModel.build(map, self);
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoDelogos setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoDelogos setDx(Float dx) {
            this.dx = dx;
            return this;
        }
        public Float getDx() {
            return this.dx;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoDelogos setDy(Float dy) {
            this.dy = dy;
            return this;
        }
        public Float getDy() {
            return this.dy;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoDelogos setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoDelogos setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoDelogos setStartTime(Float startTime) {
            this.startTime = startTime;
            return this;
        }
        public Float getStartTime() {
            return this.startTime;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoDelogos setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

    }

    public static class GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks extends TeaModel {
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

        public static GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks self = new GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks();
            return TeaModel.build(map, self);
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setBoardWidth(Integer boardWidth) {
            this.boardWidth = boardWidth;
            return this;
        }
        public Integer getBoardWidth() {
            return this.boardWidth;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setBorderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }
        public String getBorderColor() {
            return this.borderColor;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setDx(Float dx) {
            this.dx = dx;
            return this;
        }
        public Float getDx() {
            return this.dx;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setDy(Float dy) {
            this.dy = dy;
            return this;
        }
        public Float getDy() {
            return this.dy;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setFontApha(Float fontApha) {
            this.fontApha = fontApha;
            return this;
        }
        public Float getFontApha() {
            return this.fontApha;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setStartTime(Float startTime) {
            this.startTime = startTime;
            return this;
        }
        public Float getStartTime() {
            return this.startTime;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

    }

    public static class GenerateVideoPlaylistRequestTargetsVideoFilterVideo extends TeaModel {
        @NameInMap("Delogos")
        public java.util.List<GenerateVideoPlaylistRequestTargetsVideoFilterVideoDelogos> delogos;

        @NameInMap("Watermarks")
        public java.util.List<GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks> watermarks;

        public static GenerateVideoPlaylistRequestTargetsVideoFilterVideo build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoPlaylistRequestTargetsVideoFilterVideo self = new GenerateVideoPlaylistRequestTargetsVideoFilterVideo();
            return TeaModel.build(map, self);
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideo setDelogos(java.util.List<GenerateVideoPlaylistRequestTargetsVideoFilterVideoDelogos> delogos) {
            this.delogos = delogos;
            return this;
        }
        public java.util.List<GenerateVideoPlaylistRequestTargetsVideoFilterVideoDelogos> getDelogos() {
            return this.delogos;
        }

        public GenerateVideoPlaylistRequestTargetsVideoFilterVideo setWatermarks(java.util.List<GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks> watermarks) {
            this.watermarks = watermarks;
            return this;
        }
        public java.util.List<GenerateVideoPlaylistRequestTargetsVideoFilterVideoWatermarks> getWatermarks() {
            return this.watermarks;
        }

    }

    public static class GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo extends TeaModel {
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

        public static GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo self = new GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo();
            return TeaModel.build(map, self);
        }

        public GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo setAdaptiveResolutionDirection(Boolean adaptiveResolutionDirection) {
            this.adaptiveResolutionDirection = adaptiveResolutionDirection;
            return this;
        }
        public Boolean getAdaptiveResolutionDirection() {
            return this.adaptiveResolutionDirection;
        }

        public GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo setBFrames(Integer BFrames) {
            this.BFrames = BFrames;
            return this;
        }
        public Integer getBFrames() {
            return this.BFrames;
        }

        public GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo setBitrate(Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Integer getBitrate() {
            return this.bitrate;
        }

        public GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo setBitrateOption(String bitrateOption) {
            this.bitrateOption = bitrateOption;
            return this;
        }
        public String getBitrateOption() {
            return this.bitrateOption;
        }

        public GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo setBufferSize(Integer bufferSize) {
            this.bufferSize = bufferSize;
            return this;
        }
        public Integer getBufferSize() {
            return this.bufferSize;
        }

        public GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo setCRF(Float CRF) {
            this.CRF = CRF;
            return this;
        }
        public Float getCRF() {
            return this.CRF;
        }

        public GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo setFrameRate(Float frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Float getFrameRate() {
            return this.frameRate;
        }

        public GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo setFrameRateOption(String frameRateOption) {
            this.frameRateOption = frameRateOption;
            return this;
        }
        public String getFrameRateOption() {
            return this.frameRateOption;
        }

        public GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo setGOPSize(Integer GOPSize) {
            this.GOPSize = GOPSize;
            return this;
        }
        public Integer getGOPSize() {
            return this.GOPSize;
        }

        public GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo setMaxBitrate(Integer maxBitrate) {
            this.maxBitrate = maxBitrate;
            return this;
        }
        public Integer getMaxBitrate() {
            return this.maxBitrate;
        }

        public GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo setPixelFormat(String pixelFormat) {
            this.pixelFormat = pixelFormat;
            return this;
        }
        public String getPixelFormat() {
            return this.pixelFormat;
        }

        public GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo setRefs(Integer refs) {
            this.refs = refs;
            return this;
        }
        public Integer getRefs() {
            return this.refs;
        }

        public GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo setResolutionOption(String resolutionOption) {
            this.resolutionOption = resolutionOption;
            return this;
        }
        public String getResolutionOption() {
            return this.resolutionOption;
        }

        public GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo setRotation(Integer rotation) {
            this.rotation = rotation;
            return this;
        }
        public Integer getRotation() {
            return this.rotation;
        }

        public GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo setScaleType(String scaleType) {
            this.scaleType = scaleType;
            return this;
        }
        public String getScaleType() {
            return this.scaleType;
        }

    }

    public static class GenerateVideoPlaylistRequestTargetsVideo extends TeaModel {
        @NameInMap("DisableVideo")
        public Boolean disableVideo;

        @NameInMap("FilterVideo")
        public GenerateVideoPlaylistRequestTargetsVideoFilterVideo filterVideo;

        @NameInMap("TranscodeVideo")
        public GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo transcodeVideo;

        public static GenerateVideoPlaylistRequestTargetsVideo build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoPlaylistRequestTargetsVideo self = new GenerateVideoPlaylistRequestTargetsVideo();
            return TeaModel.build(map, self);
        }

        public GenerateVideoPlaylistRequestTargetsVideo setDisableVideo(Boolean disableVideo) {
            this.disableVideo = disableVideo;
            return this;
        }
        public Boolean getDisableVideo() {
            return this.disableVideo;
        }

        public GenerateVideoPlaylistRequestTargetsVideo setFilterVideo(GenerateVideoPlaylistRequestTargetsVideoFilterVideo filterVideo) {
            this.filterVideo = filterVideo;
            return this;
        }
        public GenerateVideoPlaylistRequestTargetsVideoFilterVideo getFilterVideo() {
            return this.filterVideo;
        }

        public GenerateVideoPlaylistRequestTargetsVideo setTranscodeVideo(GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo transcodeVideo) {
            this.transcodeVideo = transcodeVideo;
            return this;
        }
        public GenerateVideoPlaylistRequestTargetsVideoTranscodeVideo getTranscodeVideo() {
            return this.transcodeVideo;
        }

    }

    public static class GenerateVideoPlaylistRequestTargets extends TeaModel {
        @NameInMap("Audio")
        public GenerateVideoPlaylistRequestTargetsAudio audio;

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
        public GenerateVideoPlaylistRequestTargetsSubtitle subtitle;

        @NameInMap("TranscodeAhead")
        public Integer transcodeAhead;

        @NameInMap("URI")
        public String URI;

        @NameInMap("Video")
        public GenerateVideoPlaylistRequestTargetsVideo video;

        public static GenerateVideoPlaylistRequestTargets build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoPlaylistRequestTargets self = new GenerateVideoPlaylistRequestTargets();
            return TeaModel.build(map, self);
        }

        public GenerateVideoPlaylistRequestTargets setAudio(GenerateVideoPlaylistRequestTargetsAudio audio) {
            this.audio = audio;
            return this;
        }
        public GenerateVideoPlaylistRequestTargetsAudio getAudio() {
            return this.audio;
        }

        public GenerateVideoPlaylistRequestTargets setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GenerateVideoPlaylistRequestTargets setInitialSegments(java.util.List<Float> initialSegments) {
            this.initialSegments = initialSegments;
            return this;
        }
        public java.util.List<Float> getInitialSegments() {
            return this.initialSegments;
        }

        public GenerateVideoPlaylistRequestTargets setInitialTranscode(Float initialTranscode) {
            this.initialTranscode = initialTranscode;
            return this;
        }
        public Float getInitialTranscode() {
            return this.initialTranscode;
        }

        public GenerateVideoPlaylistRequestTargets setPresetId(PresetReference presetId) {
            this.presetId = presetId;
            return this;
        }
        public PresetReference getPresetId() {
            return this.presetId;
        }

        public GenerateVideoPlaylistRequestTargets setSpeed(Float speed) {
            this.speed = speed;
            return this;
        }
        public Float getSpeed() {
            return this.speed;
        }

        public GenerateVideoPlaylistRequestTargets setSubtitle(GenerateVideoPlaylistRequestTargetsSubtitle subtitle) {
            this.subtitle = subtitle;
            return this;
        }
        public GenerateVideoPlaylistRequestTargetsSubtitle getSubtitle() {
            return this.subtitle;
        }

        public GenerateVideoPlaylistRequestTargets setTranscodeAhead(Integer transcodeAhead) {
            this.transcodeAhead = transcodeAhead;
            return this;
        }
        public Integer getTranscodeAhead() {
            return this.transcodeAhead;
        }

        public GenerateVideoPlaylistRequestTargets setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public GenerateVideoPlaylistRequestTargets setVideo(GenerateVideoPlaylistRequestTargetsVideo video) {
            this.video = video;
            return this;
        }
        public GenerateVideoPlaylistRequestTargetsVideo getVideo() {
            return this.video;
        }

    }

}
