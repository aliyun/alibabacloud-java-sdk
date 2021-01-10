// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SearchTemplateResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("TemplateList")
    public SearchTemplateResponseBodyTemplateList templateList;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    public static SearchTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTemplateResponseBody self = new SearchTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTemplateResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public SearchTemplateResponseBody setTemplateList(SearchTemplateResponseBodyTemplateList templateList) {
        this.templateList = templateList;
        return this;
    }
    public SearchTemplateResponseBodyTemplateList getTemplateList() {
        return this.templateList;
    }

    public SearchTemplateResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchTemplateResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public static class SearchTemplateResponseBodyTemplateListTemplateVideoBitrateBnd extends TeaModel {
        @NameInMap("Max")
        public String max;

        @NameInMap("Min")
        public String min;

        public static SearchTemplateResponseBodyTemplateListTemplateVideoBitrateBnd build(java.util.Map<String, ?> map) throws Exception {
            SearchTemplateResponseBodyTemplateListTemplateVideoBitrateBnd self = new SearchTemplateResponseBodyTemplateListTemplateVideoBitrateBnd();
            return TeaModel.build(map, self);
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideoBitrateBnd setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideoBitrateBnd setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

    }

    public static class SearchTemplateResponseBodyTemplateListTemplateVideo extends TeaModel {
        @NameInMap("Bufsize")
        public String bufsize;

        @NameInMap("LongShortMode")
        public String longShortMode;

        @NameInMap("Degrain")
        public String degrain;

        @NameInMap("BitrateBnd")
        public SearchTemplateResponseBodyTemplateListTemplateVideoBitrateBnd bitrateBnd;

        @NameInMap("PixFmt")
        public String pixFmt;

        @NameInMap("Pad")
        public String pad;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Height")
        public String height;

        @NameInMap("Qscale")
        public String qscale;

        @NameInMap("Crop")
        public String crop;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Maxrate")
        public String maxrate;

        @NameInMap("MaxFps")
        public String maxFps;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Crf")
        public String crf;

        @NameInMap("Remove")
        public String remove;

        @NameInMap("Gop")
        public String gop;

        @NameInMap("Width")
        public String width;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Preset")
        public String preset;

        @NameInMap("ScanMode")
        public String scanMode;

        public static SearchTemplateResponseBodyTemplateListTemplateVideo build(java.util.Map<String, ?> map) throws Exception {
            SearchTemplateResponseBodyTemplateListTemplateVideo self = new SearchTemplateResponseBodyTemplateListTemplateVideo();
            return TeaModel.build(map, self);
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setLongShortMode(String longShortMode) {
            this.longShortMode = longShortMode;
            return this;
        }
        public String getLongShortMode() {
            return this.longShortMode;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setDegrain(String degrain) {
            this.degrain = degrain;
            return this;
        }
        public String getDegrain() {
            return this.degrain;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setBitrateBnd(SearchTemplateResponseBodyTemplateListTemplateVideoBitrateBnd bitrateBnd) {
            this.bitrateBnd = bitrateBnd;
            return this;
        }
        public SearchTemplateResponseBodyTemplateListTemplateVideoBitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setMaxFps(String maxFps) {
            this.maxFps = maxFps;
            return this;
        }
        public String getMaxFps() {
            return this.maxFps;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

    }

    public static class SearchTemplateResponseBodyTemplateListTemplateTransConfig extends TeaModel {
        @NameInMap("IsCheckAudioBitrate")
        public String isCheckAudioBitrate;

        @NameInMap("TransMode")
        public String transMode;

        @NameInMap("IsCheckReso")
        public String isCheckReso;

        @NameInMap("IsCheckVideoBitrateFail")
        public String isCheckVideoBitrateFail;

        @NameInMap("AdjDarMethod")
        public String adjDarMethod;

        @NameInMap("IsCheckVideoBitrate")
        public String isCheckVideoBitrate;

        @NameInMap("IsCheckResoFail")
        public String isCheckResoFail;

        @NameInMap("IsCheckAudioBitrateFail")
        public String isCheckAudioBitrateFail;

        public static SearchTemplateResponseBodyTemplateListTemplateTransConfig build(java.util.Map<String, ?> map) throws Exception {
            SearchTemplateResponseBodyTemplateListTemplateTransConfig self = new SearchTemplateResponseBodyTemplateListTemplateTransConfig();
            return TeaModel.build(map, self);
        }

        public SearchTemplateResponseBodyTemplateListTemplateTransConfig setIsCheckAudioBitrate(String isCheckAudioBitrate) {
            this.isCheckAudioBitrate = isCheckAudioBitrate;
            return this;
        }
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        public SearchTemplateResponseBodyTemplateListTemplateTransConfig setTransMode(String transMode) {
            this.transMode = transMode;
            return this;
        }
        public String getTransMode() {
            return this.transMode;
        }

        public SearchTemplateResponseBodyTemplateListTemplateTransConfig setIsCheckReso(String isCheckReso) {
            this.isCheckReso = isCheckReso;
            return this;
        }
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        public SearchTemplateResponseBodyTemplateListTemplateTransConfig setIsCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
            this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
            return this;
        }
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        public SearchTemplateResponseBodyTemplateListTemplateTransConfig setAdjDarMethod(String adjDarMethod) {
            this.adjDarMethod = adjDarMethod;
            return this;
        }
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        public SearchTemplateResponseBodyTemplateListTemplateTransConfig setIsCheckVideoBitrate(String isCheckVideoBitrate) {
            this.isCheckVideoBitrate = isCheckVideoBitrate;
            return this;
        }
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        public SearchTemplateResponseBodyTemplateListTemplateTransConfig setIsCheckResoFail(String isCheckResoFail) {
            this.isCheckResoFail = isCheckResoFail;
            return this;
        }
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        public SearchTemplateResponseBodyTemplateListTemplateTransConfig setIsCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
            this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
            return this;
        }
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

    }

    public static class SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif extends TeaModel {
        @NameInMap("FinalDelay")
        public String finalDelay;

        @NameInMap("DitherMode")
        public String ditherMode;

        @NameInMap("Loop")
        public String loop;

        @NameInMap("IsCustomPalette")
        public String isCustomPalette;

        public static SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif build(java.util.Map<String, ?> map) throws Exception {
            SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif self = new SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif();
            return TeaModel.build(map, self);
        }

        public SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif setFinalDelay(String finalDelay) {
            this.finalDelay = finalDelay;
            return this;
        }
        public String getFinalDelay() {
            return this.finalDelay;
        }

        public SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif setDitherMode(String ditherMode) {
            this.ditherMode = ditherMode;
            return this;
        }
        public String getDitherMode() {
            return this.ditherMode;
        }

        public SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

        public SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif setIsCustomPalette(String isCustomPalette) {
            this.isCustomPalette = isCustomPalette;
            return this;
        }
        public String getIsCustomPalette() {
            return this.isCustomPalette;
        }

    }

    public static class SearchTemplateResponseBodyTemplateListTemplateMuxConfigSegment extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        public static SearchTemplateResponseBodyTemplateListTemplateMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            SearchTemplateResponseBodyTemplateListTemplateMuxConfigSegment self = new SearchTemplateResponseBodyTemplateListTemplateMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public SearchTemplateResponseBodyTemplateListTemplateMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class SearchTemplateResponseBodyTemplateListTemplateMuxConfig extends TeaModel {
        @NameInMap("Gif")
        public SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif gif;

        @NameInMap("Segment")
        public SearchTemplateResponseBodyTemplateListTemplateMuxConfigSegment segment;

        public static SearchTemplateResponseBodyTemplateListTemplateMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            SearchTemplateResponseBodyTemplateListTemplateMuxConfig self = new SearchTemplateResponseBodyTemplateListTemplateMuxConfig();
            return TeaModel.build(map, self);
        }

        public SearchTemplateResponseBodyTemplateListTemplateMuxConfig setGif(SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif gif) {
            this.gif = gif;
            return this;
        }
        public SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif getGif() {
            return this.gif;
        }

        public SearchTemplateResponseBodyTemplateListTemplateMuxConfig setSegment(SearchTemplateResponseBodyTemplateListTemplateMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public SearchTemplateResponseBodyTemplateListTemplateMuxConfigSegment getSegment() {
            return this.segment;
        }

    }

    public static class SearchTemplateResponseBodyTemplateListTemplateAudio extends TeaModel {
        @NameInMap("Profile")
        public String profile;

        @NameInMap("Remove")
        public String remove;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Samplerate")
        public String samplerate;

        @NameInMap("Qscale")
        public String qscale;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("Bitrate")
        public String bitrate;

        public static SearchTemplateResponseBodyTemplateListTemplateAudio build(java.util.Map<String, ?> map) throws Exception {
            SearchTemplateResponseBodyTemplateListTemplateAudio self = new SearchTemplateResponseBodyTemplateListTemplateAudio();
            return TeaModel.build(map, self);
        }

        public SearchTemplateResponseBodyTemplateListTemplateAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SearchTemplateResponseBodyTemplateListTemplateAudio setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public SearchTemplateResponseBodyTemplateListTemplateAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public SearchTemplateResponseBodyTemplateListTemplateAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public SearchTemplateResponseBodyTemplateListTemplateAudio setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public SearchTemplateResponseBodyTemplateListTemplateAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public SearchTemplateResponseBodyTemplateListTemplateAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

    }

    public static class SearchTemplateResponseBodyTemplateListTemplateContainer extends TeaModel {
        @NameInMap("Format")
        public String format;

        public static SearchTemplateResponseBodyTemplateListTemplateContainer build(java.util.Map<String, ?> map) throws Exception {
            SearchTemplateResponseBodyTemplateListTemplateContainer self = new SearchTemplateResponseBodyTemplateListTemplateContainer();
            return TeaModel.build(map, self);
        }

        public SearchTemplateResponseBodyTemplateListTemplateContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class SearchTemplateResponseBodyTemplateListTemplate extends TeaModel {
        @NameInMap("Video")
        public SearchTemplateResponseBodyTemplateListTemplateVideo video;

        @NameInMap("TransConfig")
        public SearchTemplateResponseBodyTemplateListTemplateTransConfig transConfig;

        @NameInMap("State")
        public String state;

        @NameInMap("MuxConfig")
        public SearchTemplateResponseBodyTemplateListTemplateMuxConfig muxConfig;

        @NameInMap("Name")
        public String name;

        @NameInMap("Audio")
        public SearchTemplateResponseBodyTemplateListTemplateAudio audio;

        @NameInMap("Id")
        public String id;

        @NameInMap("Container")
        public SearchTemplateResponseBodyTemplateListTemplateContainer container;

        public static SearchTemplateResponseBodyTemplateListTemplate build(java.util.Map<String, ?> map) throws Exception {
            SearchTemplateResponseBodyTemplateListTemplate self = new SearchTemplateResponseBodyTemplateListTemplate();
            return TeaModel.build(map, self);
        }

        public SearchTemplateResponseBodyTemplateListTemplate setVideo(SearchTemplateResponseBodyTemplateListTemplateVideo video) {
            this.video = video;
            return this;
        }
        public SearchTemplateResponseBodyTemplateListTemplateVideo getVideo() {
            return this.video;
        }

        public SearchTemplateResponseBodyTemplateListTemplate setTransConfig(SearchTemplateResponseBodyTemplateListTemplateTransConfig transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public SearchTemplateResponseBodyTemplateListTemplateTransConfig getTransConfig() {
            return this.transConfig;
        }

        public SearchTemplateResponseBodyTemplateListTemplate setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SearchTemplateResponseBodyTemplateListTemplate setMuxConfig(SearchTemplateResponseBodyTemplateListTemplateMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public SearchTemplateResponseBodyTemplateListTemplateMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public SearchTemplateResponseBodyTemplateListTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchTemplateResponseBodyTemplateListTemplate setAudio(SearchTemplateResponseBodyTemplateListTemplateAudio audio) {
            this.audio = audio;
            return this;
        }
        public SearchTemplateResponseBodyTemplateListTemplateAudio getAudio() {
            return this.audio;
        }

        public SearchTemplateResponseBodyTemplateListTemplate setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SearchTemplateResponseBodyTemplateListTemplate setContainer(SearchTemplateResponseBodyTemplateListTemplateContainer container) {
            this.container = container;
            return this;
        }
        public SearchTemplateResponseBodyTemplateListTemplateContainer getContainer() {
            return this.container;
        }

    }

    public static class SearchTemplateResponseBodyTemplateList extends TeaModel {
        @NameInMap("Template")
        public java.util.List<SearchTemplateResponseBodyTemplateListTemplate> template;

        public static SearchTemplateResponseBodyTemplateList build(java.util.Map<String, ?> map) throws Exception {
            SearchTemplateResponseBodyTemplateList self = new SearchTemplateResponseBodyTemplateList();
            return TeaModel.build(map, self);
        }

        public SearchTemplateResponseBodyTemplateList setTemplate(java.util.List<SearchTemplateResponseBodyTemplateListTemplate> template) {
            this.template = template;
            return this;
        }
        public java.util.List<SearchTemplateResponseBodyTemplateListTemplate> getTemplate() {
            return this.template;
        }

    }

}
