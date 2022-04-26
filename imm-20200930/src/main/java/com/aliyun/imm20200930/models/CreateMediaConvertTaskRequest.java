// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateMediaConvertTaskRequest extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Sources")
    public java.util.List<CreateMediaConvertTaskRequestSources> sources;

    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    @NameInMap("Targets")
    public java.util.List<CreateMediaConvertTaskRequestTargets> targets;

    @NameInMap("UserData")
    public String userData;

    public static CreateMediaConvertTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaConvertTaskRequest self = new CreateMediaConvertTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateMediaConvertTaskRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateMediaConvertTaskRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public CreateMediaConvertTaskRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateMediaConvertTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateMediaConvertTaskRequest setSources(java.util.List<CreateMediaConvertTaskRequestSources> sources) {
        this.sources = sources;
        return this;
    }
    public java.util.List<CreateMediaConvertTaskRequestSources> getSources() {
        return this.sources;
    }

    public CreateMediaConvertTaskRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateMediaConvertTaskRequest setTargets(java.util.List<CreateMediaConvertTaskRequestTargets> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<CreateMediaConvertTaskRequestTargets> getTargets() {
        return this.targets;
    }

    public CreateMediaConvertTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class CreateMediaConvertTaskRequestSourcesSubtitles extends TeaModel {
        @NameInMap("Language")
        public String language;

        @NameInMap("TimeOffset")
        public Float timeOffset;

        @NameInMap("URI")
        public String URI;

        public static CreateMediaConvertTaskRequestSourcesSubtitles build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestSourcesSubtitles self = new CreateMediaConvertTaskRequestSourcesSubtitles();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestSourcesSubtitles setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public CreateMediaConvertTaskRequestSourcesSubtitles setTimeOffset(Float timeOffset) {
            this.timeOffset = timeOffset;
            return this;
        }
        public Float getTimeOffset() {
            return this.timeOffset;
        }

        public CreateMediaConvertTaskRequestSourcesSubtitles setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

    public static class CreateMediaConvertTaskRequestSources extends TeaModel {
        @NameInMap("Duration")
        public Float duration;

        @NameInMap("StartTime")
        public Float startTime;

        @NameInMap("Subtitles")
        public java.util.List<CreateMediaConvertTaskRequestSourcesSubtitles> subtitles;

        @NameInMap("URI")
        public String URI;

        public static CreateMediaConvertTaskRequestSources build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestSources self = new CreateMediaConvertTaskRequestSources();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestSources setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public CreateMediaConvertTaskRequestSources setStartTime(Float startTime) {
            this.startTime = startTime;
            return this;
        }
        public Float getStartTime() {
            return this.startTime;
        }

        public CreateMediaConvertTaskRequestSources setSubtitles(java.util.List<CreateMediaConvertTaskRequestSourcesSubtitles> subtitles) {
            this.subtitles = subtitles;
            return this;
        }
        public java.util.List<CreateMediaConvertTaskRequestSourcesSubtitles> getSubtitles() {
            return this.subtitles;
        }

        public CreateMediaConvertTaskRequestSources setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

    public static class CreateMediaConvertTaskRequestTargetsAudioFilterAudio extends TeaModel {
        @NameInMap("Mixing")
        public Boolean mixing;

        public static CreateMediaConvertTaskRequestTargetsAudioFilterAudio build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargetsAudioFilterAudio self = new CreateMediaConvertTaskRequestTargetsAudioFilterAudio();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargetsAudioFilterAudio setMixing(Boolean mixing) {
            this.mixing = mixing;
            return this;
        }
        public Boolean getMixing() {
            return this.mixing;
        }

    }

    public static class CreateMediaConvertTaskRequestTargetsAudioTranscodeAudio extends TeaModel {
        @NameInMap("Bitrate")
        public Integer bitrate;

        @NameInMap("Channel")
        public Integer channel;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Quality")
        public Integer quality;

        @NameInMap("SampleRate")
        public Integer sampleRate;

        public static CreateMediaConvertTaskRequestTargetsAudioTranscodeAudio build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargetsAudioTranscodeAudio self = new CreateMediaConvertTaskRequestTargetsAudioTranscodeAudio();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargetsAudioTranscodeAudio setBitrate(Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Integer getBitrate() {
            return this.bitrate;
        }

        public CreateMediaConvertTaskRequestTargetsAudioTranscodeAudio setChannel(Integer channel) {
            this.channel = channel;
            return this;
        }
        public Integer getChannel() {
            return this.channel;
        }

        public CreateMediaConvertTaskRequestTargetsAudioTranscodeAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public CreateMediaConvertTaskRequestTargetsAudioTranscodeAudio setQuality(Integer quality) {
            this.quality = quality;
            return this;
        }
        public Integer getQuality() {
            return this.quality;
        }

        public CreateMediaConvertTaskRequestTargetsAudioTranscodeAudio setSampleRate(Integer sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public Integer getSampleRate() {
            return this.sampleRate;
        }

    }

    public static class CreateMediaConvertTaskRequestTargetsAudio extends TeaModel {
        @NameInMap("DisableAudio")
        public Boolean disableAudio;

        @NameInMap("FilterAudio")
        public CreateMediaConvertTaskRequestTargetsAudioFilterAudio filterAudio;

        @NameInMap("TranscodeAudio")
        public CreateMediaConvertTaskRequestTargetsAudioTranscodeAudio transcodeAudio;

        public static CreateMediaConvertTaskRequestTargetsAudio build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargetsAudio self = new CreateMediaConvertTaskRequestTargetsAudio();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargetsAudio setDisableAudio(Boolean disableAudio) {
            this.disableAudio = disableAudio;
            return this;
        }
        public Boolean getDisableAudio() {
            return this.disableAudio;
        }

        public CreateMediaConvertTaskRequestTargetsAudio setFilterAudio(CreateMediaConvertTaskRequestTargetsAudioFilterAudio filterAudio) {
            this.filterAudio = filterAudio;
            return this;
        }
        public CreateMediaConvertTaskRequestTargetsAudioFilterAudio getFilterAudio() {
            return this.filterAudio;
        }

        public CreateMediaConvertTaskRequestTargetsAudio setTranscodeAudio(CreateMediaConvertTaskRequestTargetsAudioTranscodeAudio transcodeAudio) {
            this.transcodeAudio = transcodeAudio;
            return this;
        }
        public CreateMediaConvertTaskRequestTargetsAudioTranscodeAudio getTranscodeAudio() {
            return this.transcodeAudio;
        }

    }

    public static class CreateMediaConvertTaskRequestTargetsImageSnapshots extends TeaModel {
        @NameInMap("Format")
        public String format;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Interval")
        public Float interval;

        @NameInMap("Number")
        public Integer number;

        @NameInMap("ScaleType")
        public String scaleType;

        @NameInMap("StartTime")
        public Float startTime;

        @NameInMap("URI")
        public String URI;

        @NameInMap("Width")
        public Integer width;

        public static CreateMediaConvertTaskRequestTargetsImageSnapshots build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargetsImageSnapshots self = new CreateMediaConvertTaskRequestTargetsImageSnapshots();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargetsImageSnapshots setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public CreateMediaConvertTaskRequestTargetsImageSnapshots setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public CreateMediaConvertTaskRequestTargetsImageSnapshots setInterval(Float interval) {
            this.interval = interval;
            return this;
        }
        public Float getInterval() {
            return this.interval;
        }

        public CreateMediaConvertTaskRequestTargetsImageSnapshots setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public CreateMediaConvertTaskRequestTargetsImageSnapshots setScaleType(String scaleType) {
            this.scaleType = scaleType;
            return this;
        }
        public String getScaleType() {
            return this.scaleType;
        }

        public CreateMediaConvertTaskRequestTargetsImageSnapshots setStartTime(Float startTime) {
            this.startTime = startTime;
            return this;
        }
        public Float getStartTime() {
            return this.startTime;
        }

        public CreateMediaConvertTaskRequestTargetsImageSnapshots setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public CreateMediaConvertTaskRequestTargetsImageSnapshots setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class CreateMediaConvertTaskRequestTargetsImageSprites extends TeaModel {
        @NameInMap("Format")
        public String format;

        @NameInMap("Interval")
        public Float interval;

        @NameInMap("Margin")
        public Integer margin;

        @NameInMap("Number")
        public Integer number;

        @NameInMap("Pad")
        public Integer pad;

        @NameInMap("ScaleHeight")
        public Float scaleHeight;

        @NameInMap("ScaleType")
        public String scaleType;

        @NameInMap("ScaleWidth")
        public Float scaleWidth;

        @NameInMap("StartTime")
        public Float startTime;

        @NameInMap("TileHeight")
        public Integer tileHeight;

        @NameInMap("TileWidth")
        public Integer tileWidth;

        @NameInMap("URI")
        public String URI;

        public static CreateMediaConvertTaskRequestTargetsImageSprites build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargetsImageSprites self = new CreateMediaConvertTaskRequestTargetsImageSprites();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargetsImageSprites setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public CreateMediaConvertTaskRequestTargetsImageSprites setInterval(Float interval) {
            this.interval = interval;
            return this;
        }
        public Float getInterval() {
            return this.interval;
        }

        public CreateMediaConvertTaskRequestTargetsImageSprites setMargin(Integer margin) {
            this.margin = margin;
            return this;
        }
        public Integer getMargin() {
            return this.margin;
        }

        public CreateMediaConvertTaskRequestTargetsImageSprites setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public CreateMediaConvertTaskRequestTargetsImageSprites setPad(Integer pad) {
            this.pad = pad;
            return this;
        }
        public Integer getPad() {
            return this.pad;
        }

        public CreateMediaConvertTaskRequestTargetsImageSprites setScaleHeight(Float scaleHeight) {
            this.scaleHeight = scaleHeight;
            return this;
        }
        public Float getScaleHeight() {
            return this.scaleHeight;
        }

        public CreateMediaConvertTaskRequestTargetsImageSprites setScaleType(String scaleType) {
            this.scaleType = scaleType;
            return this;
        }
        public String getScaleType() {
            return this.scaleType;
        }

        public CreateMediaConvertTaskRequestTargetsImageSprites setScaleWidth(Float scaleWidth) {
            this.scaleWidth = scaleWidth;
            return this;
        }
        public Float getScaleWidth() {
            return this.scaleWidth;
        }

        public CreateMediaConvertTaskRequestTargetsImageSprites setStartTime(Float startTime) {
            this.startTime = startTime;
            return this;
        }
        public Float getStartTime() {
            return this.startTime;
        }

        public CreateMediaConvertTaskRequestTargetsImageSprites setTileHeight(Integer tileHeight) {
            this.tileHeight = tileHeight;
            return this;
        }
        public Integer getTileHeight() {
            return this.tileHeight;
        }

        public CreateMediaConvertTaskRequestTargetsImageSprites setTileWidth(Integer tileWidth) {
            this.tileWidth = tileWidth;
            return this;
        }
        public Integer getTileWidth() {
            return this.tileWidth;
        }

        public CreateMediaConvertTaskRequestTargetsImageSprites setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

    public static class CreateMediaConvertTaskRequestTargetsImage extends TeaModel {
        @NameInMap("Snapshots")
        public java.util.List<CreateMediaConvertTaskRequestTargetsImageSnapshots> snapshots;

        @NameInMap("Sprites")
        public java.util.List<CreateMediaConvertTaskRequestTargetsImageSprites> sprites;

        public static CreateMediaConvertTaskRequestTargetsImage build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargetsImage self = new CreateMediaConvertTaskRequestTargetsImage();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargetsImage setSnapshots(java.util.List<CreateMediaConvertTaskRequestTargetsImageSnapshots> snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public java.util.List<CreateMediaConvertTaskRequestTargetsImageSnapshots> getSnapshots() {
            return this.snapshots;
        }

        public CreateMediaConvertTaskRequestTargetsImage setSprites(java.util.List<CreateMediaConvertTaskRequestTargetsImageSprites> sprites) {
            this.sprites = sprites;
            return this;
        }
        public java.util.List<CreateMediaConvertTaskRequestTargetsImageSprites> getSprites() {
            return this.sprites;
        }

    }

    public static class CreateMediaConvertTaskRequestTargetsSegment extends TeaModel {
        @NameInMap("Duration")
        public Float duration;

        @NameInMap("Format")
        public String format;

        public static CreateMediaConvertTaskRequestTargetsSegment build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargetsSegment self = new CreateMediaConvertTaskRequestTargetsSegment();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargetsSegment setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public CreateMediaConvertTaskRequestTargetsSegment setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class CreateMediaConvertTaskRequestTargetsSubtitleExtractSubtitle extends TeaModel {
        @NameInMap("Format")
        public String format;

        @NameInMap("URI")
        public String URI;

        public static CreateMediaConvertTaskRequestTargetsSubtitleExtractSubtitle build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargetsSubtitleExtractSubtitle self = new CreateMediaConvertTaskRequestTargetsSubtitleExtractSubtitle();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargetsSubtitleExtractSubtitle setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public CreateMediaConvertTaskRequestTargetsSubtitleExtractSubtitle setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

    public static class CreateMediaConvertTaskRequestTargetsSubtitle extends TeaModel {
        @NameInMap("DisableSubtitle")
        public Boolean disableSubtitle;

        @NameInMap("ExtractSubtitle")
        public CreateMediaConvertTaskRequestTargetsSubtitleExtractSubtitle extractSubtitle;

        public static CreateMediaConvertTaskRequestTargetsSubtitle build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargetsSubtitle self = new CreateMediaConvertTaskRequestTargetsSubtitle();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargetsSubtitle setDisableSubtitle(Boolean disableSubtitle) {
            this.disableSubtitle = disableSubtitle;
            return this;
        }
        public Boolean getDisableSubtitle() {
            return this.disableSubtitle;
        }

        public CreateMediaConvertTaskRequestTargetsSubtitle setExtractSubtitle(CreateMediaConvertTaskRequestTargetsSubtitleExtractSubtitle extractSubtitle) {
            this.extractSubtitle = extractSubtitle;
            return this;
        }
        public CreateMediaConvertTaskRequestTargetsSubtitleExtractSubtitle getExtractSubtitle() {
            return this.extractSubtitle;
        }

    }

    public static class CreateMediaConvertTaskRequestTargetsVideoFilterVideoDelogos extends TeaModel {
        @NameInMap("Durtion")
        public Float durtion;

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

        public static CreateMediaConvertTaskRequestTargetsVideoFilterVideoDelogos build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargetsVideoFilterVideoDelogos self = new CreateMediaConvertTaskRequestTargetsVideoFilterVideoDelogos();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoDelogos setDurtion(Float durtion) {
            this.durtion = durtion;
            return this;
        }
        public Float getDurtion() {
            return this.durtion;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoDelogos setDx(Float dx) {
            this.dx = dx;
            return this;
        }
        public Float getDx() {
            return this.dx;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoDelogos setDy(Float dy) {
            this.dy = dy;
            return this;
        }
        public Float getDy() {
            return this.dy;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoDelogos setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoDelogos setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoDelogos setStartTime(Float startTime) {
            this.startTime = startTime;
            return this;
        }
        public Float getStartTime() {
            return this.startTime;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoDelogos setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

    }

    public static class CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks extends TeaModel {
        @NameInMap("BorderColor")
        public String borderColor;

        @NameInMap("BorderWidth")
        public Integer borderWidth;

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

        public static CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks self = new CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks setBorderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }
        public String getBorderColor() {
            return this.borderColor;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks setBorderWidth(Integer borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }
        public Integer getBorderWidth() {
            return this.borderWidth;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks setDx(Float dx) {
            this.dx = dx;
            return this;
        }
        public Float getDx() {
            return this.dx;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks setDy(Float dy) {
            this.dy = dy;
            return this;
        }
        public Float getDy() {
            return this.dy;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks setFontApha(Float fontApha) {
            this.fontApha = fontApha;
            return this;
        }
        public Float getFontApha() {
            return this.fontApha;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Integer getFontSize() {
            return this.fontSize;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks setStartTime(Float startTime) {
            this.startTime = startTime;
            return this;
        }
        public Float getStartTime() {
            return this.startTime;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

    }

    public static class CreateMediaConvertTaskRequestTargetsVideoFilterVideo extends TeaModel {
        @NameInMap("Delogos")
        public java.util.List<CreateMediaConvertTaskRequestTargetsVideoFilterVideoDelogos> delogos;

        @NameInMap("Watermarks")
        public java.util.List<CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks> watermarks;

        public static CreateMediaConvertTaskRequestTargetsVideoFilterVideo build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargetsVideoFilterVideo self = new CreateMediaConvertTaskRequestTargetsVideoFilterVideo();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideo setDelogos(java.util.List<CreateMediaConvertTaskRequestTargetsVideoFilterVideoDelogos> delogos) {
            this.delogos = delogos;
            return this;
        }
        public java.util.List<CreateMediaConvertTaskRequestTargetsVideoFilterVideoDelogos> getDelogos() {
            return this.delogos;
        }

        public CreateMediaConvertTaskRequestTargetsVideoFilterVideo setWatermarks(java.util.List<CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks> watermarks) {
            this.watermarks = watermarks;
            return this;
        }
        public java.util.List<CreateMediaConvertTaskRequestTargetsVideoFilterVideoWatermarks> getWatermarks() {
            return this.watermarks;
        }

    }

    public static class CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo extends TeaModel {
        @NameInMap("AdaptiveResolutionDirection")
        public Boolean adaptiveResolutionDirection;

        @NameInMap("BFrames")
        public Integer BFrames;

        @NameInMap("Bitrate")
        public Integer bitrate;

        @NameInMap("BufferSize")
        public Integer bufferSize;

        @NameInMap("CRF")
        public Float CRF;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("FrameRate")
        public Float frameRate;

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

        @NameInMap("Rotation")
        public Integer rotation;

        @NameInMap("ScaleType")
        public String scaleType;

        public static CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo self = new CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo setAdaptiveResolutionDirection(Boolean adaptiveResolutionDirection) {
            this.adaptiveResolutionDirection = adaptiveResolutionDirection;
            return this;
        }
        public Boolean getAdaptiveResolutionDirection() {
            return this.adaptiveResolutionDirection;
        }

        public CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo setBFrames(Integer BFrames) {
            this.BFrames = BFrames;
            return this;
        }
        public Integer getBFrames() {
            return this.BFrames;
        }

        public CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo setBitrate(Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Integer getBitrate() {
            return this.bitrate;
        }

        public CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo setBufferSize(Integer bufferSize) {
            this.bufferSize = bufferSize;
            return this;
        }
        public Integer getBufferSize() {
            return this.bufferSize;
        }

        public CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo setCRF(Float CRF) {
            this.CRF = CRF;
            return this;
        }
        public Float getCRF() {
            return this.CRF;
        }

        public CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo setFrameRate(Float frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public Float getFrameRate() {
            return this.frameRate;
        }

        public CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo setGOPSize(Integer GOPSize) {
            this.GOPSize = GOPSize;
            return this;
        }
        public Integer getGOPSize() {
            return this.GOPSize;
        }

        public CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo setMaxBitrate(Integer maxBitrate) {
            this.maxBitrate = maxBitrate;
            return this;
        }
        public Integer getMaxBitrate() {
            return this.maxBitrate;
        }

        public CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo setPixelFormat(String pixelFormat) {
            this.pixelFormat = pixelFormat;
            return this;
        }
        public String getPixelFormat() {
            return this.pixelFormat;
        }

        public CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo setRefs(Integer refs) {
            this.refs = refs;
            return this;
        }
        public Integer getRefs() {
            return this.refs;
        }

        public CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo setRotation(Integer rotation) {
            this.rotation = rotation;
            return this;
        }
        public Integer getRotation() {
            return this.rotation;
        }

        public CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo setScaleType(String scaleType) {
            this.scaleType = scaleType;
            return this;
        }
        public String getScaleType() {
            return this.scaleType;
        }

    }

    public static class CreateMediaConvertTaskRequestTargetsVideo extends TeaModel {
        @NameInMap("DisableVideo")
        public Boolean disableVideo;

        @NameInMap("FilterVideo")
        public CreateMediaConvertTaskRequestTargetsVideoFilterVideo filterVideo;

        @NameInMap("TranscodeVideo")
        public CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo transcodeVideo;

        public static CreateMediaConvertTaskRequestTargetsVideo build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargetsVideo self = new CreateMediaConvertTaskRequestTargetsVideo();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargetsVideo setDisableVideo(Boolean disableVideo) {
            this.disableVideo = disableVideo;
            return this;
        }
        public Boolean getDisableVideo() {
            return this.disableVideo;
        }

        public CreateMediaConvertTaskRequestTargetsVideo setFilterVideo(CreateMediaConvertTaskRequestTargetsVideoFilterVideo filterVideo) {
            this.filterVideo = filterVideo;
            return this;
        }
        public CreateMediaConvertTaskRequestTargetsVideoFilterVideo getFilterVideo() {
            return this.filterVideo;
        }

        public CreateMediaConvertTaskRequestTargetsVideo setTranscodeVideo(CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo transcodeVideo) {
            this.transcodeVideo = transcodeVideo;
            return this;
        }
        public CreateMediaConvertTaskRequestTargetsVideoTranscodeVideo getTranscodeVideo() {
            return this.transcodeVideo;
        }

    }

    public static class CreateMediaConvertTaskRequestTargets extends TeaModel {
        @NameInMap("Audio")
        public CreateMediaConvertTaskRequestTargetsAudio audio;

        @NameInMap("Container")
        public String container;

        @NameInMap("Image")
        public CreateMediaConvertTaskRequestTargetsImage image;

        @NameInMap("PresetId")
        public String presetId;

        @NameInMap("Segment")
        public CreateMediaConvertTaskRequestTargetsSegment segment;

        @NameInMap("Speed")
        public Float speed;

        @NameInMap("Subtitle")
        public CreateMediaConvertTaskRequestTargetsSubtitle subtitle;

        @NameInMap("URI")
        public String URI;

        @NameInMap("Video")
        public CreateMediaConvertTaskRequestTargetsVideo video;

        public static CreateMediaConvertTaskRequestTargets build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaConvertTaskRequestTargets self = new CreateMediaConvertTaskRequestTargets();
            return TeaModel.build(map, self);
        }

        public CreateMediaConvertTaskRequestTargets setAudio(CreateMediaConvertTaskRequestTargetsAudio audio) {
            this.audio = audio;
            return this;
        }
        public CreateMediaConvertTaskRequestTargetsAudio getAudio() {
            return this.audio;
        }

        public CreateMediaConvertTaskRequestTargets setContainer(String container) {
            this.container = container;
            return this;
        }
        public String getContainer() {
            return this.container;
        }

        public CreateMediaConvertTaskRequestTargets setImage(CreateMediaConvertTaskRequestTargetsImage image) {
            this.image = image;
            return this;
        }
        public CreateMediaConvertTaskRequestTargetsImage getImage() {
            return this.image;
        }

        public CreateMediaConvertTaskRequestTargets setPresetId(String presetId) {
            this.presetId = presetId;
            return this;
        }
        public String getPresetId() {
            return this.presetId;
        }

        public CreateMediaConvertTaskRequestTargets setSegment(CreateMediaConvertTaskRequestTargetsSegment segment) {
            this.segment = segment;
            return this;
        }
        public CreateMediaConvertTaskRequestTargetsSegment getSegment() {
            return this.segment;
        }

        public CreateMediaConvertTaskRequestTargets setSpeed(Float speed) {
            this.speed = speed;
            return this;
        }
        public Float getSpeed() {
            return this.speed;
        }

        public CreateMediaConvertTaskRequestTargets setSubtitle(CreateMediaConvertTaskRequestTargetsSubtitle subtitle) {
            this.subtitle = subtitle;
            return this;
        }
        public CreateMediaConvertTaskRequestTargetsSubtitle getSubtitle() {
            return this.subtitle;
        }

        public CreateMediaConvertTaskRequestTargets setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

        public CreateMediaConvertTaskRequestTargets setVideo(CreateMediaConvertTaskRequestTargetsVideo video) {
            this.video = video;
            return this;
        }
        public CreateMediaConvertTaskRequestTargetsVideo getVideo() {
            return this.video;
        }

    }

}
