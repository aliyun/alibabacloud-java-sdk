// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class QueryTemplateListResponseBody extends TeaModel {
    @NameInMap("NonExistTids")
    public QueryTemplateListResponseBodyNonExistTids nonExistTids;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateList")
    public QueryTemplateListResponseBodyTemplateList templateList;

    public static QueryTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTemplateListResponseBody self = new QueryTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTemplateListResponseBody setNonExistTids(QueryTemplateListResponseBodyNonExistTids nonExistTids) {
        this.nonExistTids = nonExistTids;
        return this;
    }
    public QueryTemplateListResponseBodyNonExistTids getNonExistTids() {
        return this.nonExistTids;
    }

    public QueryTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTemplateListResponseBody setTemplateList(QueryTemplateListResponseBodyTemplateList templateList) {
        this.templateList = templateList;
        return this;
    }
    public QueryTemplateListResponseBodyTemplateList getTemplateList() {
        return this.templateList;
    }

    public static class QueryTemplateListResponseBodyNonExistTids extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryTemplateListResponseBodyNonExistTids build(java.util.Map<String, ?> map) throws Exception {
            QueryTemplateListResponseBodyNonExistTids self = new QueryTemplateListResponseBodyNonExistTids();
            return TeaModel.build(map, self);
        }

        public QueryTemplateListResponseBodyNonExistTids setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class QueryTemplateListResponseBodyTemplateListTemplateAudio extends TeaModel {
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

        @NameInMap("Remove")
        public String remove;

        @NameInMap("Samplerate")
        public String samplerate;

        public static QueryTemplateListResponseBodyTemplateListTemplateAudio build(java.util.Map<String, ?> map) throws Exception {
            QueryTemplateListResponseBodyTemplateListTemplateAudio self = new QueryTemplateListResponseBodyTemplateListTemplateAudio();
            return TeaModel.build(map, self);
        }

        public QueryTemplateListResponseBodyTemplateListTemplateAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateAudio setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateAudio setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

    }

    public static class QueryTemplateListResponseBodyTemplateListTemplateContainer extends TeaModel {
        @NameInMap("Format")
        public String format;

        public static QueryTemplateListResponseBodyTemplateListTemplateContainer build(java.util.Map<String, ?> map) throws Exception {
            QueryTemplateListResponseBodyTemplateListTemplateContainer self = new QueryTemplateListResponseBodyTemplateListTemplateContainer();
            return TeaModel.build(map, self);
        }

        public QueryTemplateListResponseBodyTemplateListTemplateContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class QueryTemplateListResponseBodyTemplateListTemplateMuxConfigGif extends TeaModel {
        @NameInMap("DitherMode")
        public String ditherMode;

        @NameInMap("FinalDelay")
        public String finalDelay;

        @NameInMap("IsCustomPalette")
        public String isCustomPalette;

        @NameInMap("Loop")
        public String loop;

        public static QueryTemplateListResponseBodyTemplateListTemplateMuxConfigGif build(java.util.Map<String, ?> map) throws Exception {
            QueryTemplateListResponseBodyTemplateListTemplateMuxConfigGif self = new QueryTemplateListResponseBodyTemplateListTemplateMuxConfigGif();
            return TeaModel.build(map, self);
        }

        public QueryTemplateListResponseBodyTemplateListTemplateMuxConfigGif setDitherMode(String ditherMode) {
            this.ditherMode = ditherMode;
            return this;
        }
        public String getDitherMode() {
            return this.ditherMode;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateMuxConfigGif setFinalDelay(String finalDelay) {
            this.finalDelay = finalDelay;
            return this;
        }
        public String getFinalDelay() {
            return this.finalDelay;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateMuxConfigGif setIsCustomPalette(String isCustomPalette) {
            this.isCustomPalette = isCustomPalette;
            return this;
        }
        public String getIsCustomPalette() {
            return this.isCustomPalette;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateMuxConfigGif setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

    }

    public static class QueryTemplateListResponseBodyTemplateListTemplateMuxConfigSegment extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        public static QueryTemplateListResponseBodyTemplateListTemplateMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            QueryTemplateListResponseBodyTemplateListTemplateMuxConfigSegment self = new QueryTemplateListResponseBodyTemplateListTemplateMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public QueryTemplateListResponseBodyTemplateListTemplateMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class QueryTemplateListResponseBodyTemplateListTemplateMuxConfigWebp extends TeaModel {
        @NameInMap("Loop")
        public String loop;

        public static QueryTemplateListResponseBodyTemplateListTemplateMuxConfigWebp build(java.util.Map<String, ?> map) throws Exception {
            QueryTemplateListResponseBodyTemplateListTemplateMuxConfigWebp self = new QueryTemplateListResponseBodyTemplateListTemplateMuxConfigWebp();
            return TeaModel.build(map, self);
        }

        public QueryTemplateListResponseBodyTemplateListTemplateMuxConfigWebp setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

    }

    public static class QueryTemplateListResponseBodyTemplateListTemplateMuxConfig extends TeaModel {
        @NameInMap("Gif")
        public QueryTemplateListResponseBodyTemplateListTemplateMuxConfigGif gif;

        @NameInMap("Segment")
        public QueryTemplateListResponseBodyTemplateListTemplateMuxConfigSegment segment;

        @NameInMap("Webp")
        public QueryTemplateListResponseBodyTemplateListTemplateMuxConfigWebp webp;

        public static QueryTemplateListResponseBodyTemplateListTemplateMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryTemplateListResponseBodyTemplateListTemplateMuxConfig self = new QueryTemplateListResponseBodyTemplateListTemplateMuxConfig();
            return TeaModel.build(map, self);
        }

        public QueryTemplateListResponseBodyTemplateListTemplateMuxConfig setGif(QueryTemplateListResponseBodyTemplateListTemplateMuxConfigGif gif) {
            this.gif = gif;
            return this;
        }
        public QueryTemplateListResponseBodyTemplateListTemplateMuxConfigGif getGif() {
            return this.gif;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateMuxConfig setSegment(QueryTemplateListResponseBodyTemplateListTemplateMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public QueryTemplateListResponseBodyTemplateListTemplateMuxConfigSegment getSegment() {
            return this.segment;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateMuxConfig setWebp(QueryTemplateListResponseBodyTemplateListTemplateMuxConfigWebp webp) {
            this.webp = webp;
            return this;
        }
        public QueryTemplateListResponseBodyTemplateListTemplateMuxConfigWebp getWebp() {
            return this.webp;
        }

    }

    public static class QueryTemplateListResponseBodyTemplateListTemplateTransConfig extends TeaModel {
        @NameInMap("AdjDarMethod")
        public String adjDarMethod;

        @NameInMap("IsCheckAudioBitrate")
        public String isCheckAudioBitrate;

        @NameInMap("IsCheckAudioBitrateFail")
        public String isCheckAudioBitrateFail;

        @NameInMap("IsCheckReso")
        public String isCheckReso;

        @NameInMap("IsCheckResoFail")
        public String isCheckResoFail;

        @NameInMap("IsCheckVideoBitrate")
        public String isCheckVideoBitrate;

        @NameInMap("IsCheckVideoBitrateFail")
        public String isCheckVideoBitrateFail;

        @NameInMap("TransMode")
        public String transMode;

        public static QueryTemplateListResponseBodyTemplateListTemplateTransConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryTemplateListResponseBodyTemplateListTemplateTransConfig self = new QueryTemplateListResponseBodyTemplateListTemplateTransConfig();
            return TeaModel.build(map, self);
        }

        public QueryTemplateListResponseBodyTemplateListTemplateTransConfig setAdjDarMethod(String adjDarMethod) {
            this.adjDarMethod = adjDarMethod;
            return this;
        }
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateTransConfig setIsCheckAudioBitrate(String isCheckAudioBitrate) {
            this.isCheckAudioBitrate = isCheckAudioBitrate;
            return this;
        }
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateTransConfig setIsCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
            this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
            return this;
        }
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateTransConfig setIsCheckReso(String isCheckReso) {
            this.isCheckReso = isCheckReso;
            return this;
        }
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateTransConfig setIsCheckResoFail(String isCheckResoFail) {
            this.isCheckResoFail = isCheckResoFail;
            return this;
        }
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateTransConfig setIsCheckVideoBitrate(String isCheckVideoBitrate) {
            this.isCheckVideoBitrate = isCheckVideoBitrate;
            return this;
        }
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateTransConfig setIsCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
            this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
            return this;
        }
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateTransConfig setTransMode(String transMode) {
            this.transMode = transMode;
            return this;
        }
        public String getTransMode() {
            return this.transMode;
        }

    }

    public static class QueryTemplateListResponseBodyTemplateListTemplateVideoBitrateBnd extends TeaModel {
        @NameInMap("Max")
        public String max;

        @NameInMap("Min")
        public String min;

        public static QueryTemplateListResponseBodyTemplateListTemplateVideoBitrateBnd build(java.util.Map<String, ?> map) throws Exception {
            QueryTemplateListResponseBodyTemplateListTemplateVideoBitrateBnd self = new QueryTemplateListResponseBodyTemplateListTemplateVideoBitrateBnd();
            return TeaModel.build(map, self);
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideoBitrateBnd setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideoBitrateBnd setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

    }

    public static class QueryTemplateListResponseBodyTemplateListTemplateVideo extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("BitrateBnd")
        public QueryTemplateListResponseBodyTemplateListTemplateVideoBitrateBnd bitrateBnd;

        @NameInMap("Bufsize")
        public String bufsize;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Crf")
        public String crf;

        @NameInMap("Crop")
        public String crop;

        @NameInMap("Degrain")
        public String degrain;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Gop")
        public String gop;

        @NameInMap("Height")
        public String height;

        @NameInMap("MaxFps")
        public String maxFps;

        @NameInMap("Maxrate")
        public String maxrate;

        @NameInMap("Pad")
        public String pad;

        @NameInMap("PixFmt")
        public String pixFmt;

        @NameInMap("Preset")
        public String preset;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Qscale")
        public String qscale;

        @NameInMap("Remove")
        public String remove;

        @NameInMap("ResoPriority")
        public String resoPriority;

        @NameInMap("ScanMode")
        public String scanMode;

        @NameInMap("Width")
        public String width;

        public static QueryTemplateListResponseBodyTemplateListTemplateVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryTemplateListResponseBodyTemplateListTemplateVideo self = new QueryTemplateListResponseBodyTemplateListTemplateVideo();
            return TeaModel.build(map, self);
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setBitrateBnd(QueryTemplateListResponseBodyTemplateListTemplateVideoBitrateBnd bitrateBnd) {
            this.bitrateBnd = bitrateBnd;
            return this;
        }
        public QueryTemplateListResponseBodyTemplateListTemplateVideoBitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setDegrain(String degrain) {
            this.degrain = degrain;
            return this;
        }
        public String getDegrain() {
            return this.degrain;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setMaxFps(String maxFps) {
            this.maxFps = maxFps;
            return this;
        }
        public String getMaxFps() {
            return this.maxFps;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setResoPriority(String resoPriority) {
            this.resoPriority = resoPriority;
            return this;
        }
        public String getResoPriority() {
            return this.resoPriority;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryTemplateListResponseBodyTemplateListTemplate extends TeaModel {
        @NameInMap("Audio")
        public QueryTemplateListResponseBodyTemplateListTemplateAudio audio;

        @NameInMap("Container")
        public QueryTemplateListResponseBodyTemplateListTemplateContainer container;

        @NameInMap("Id")
        public String id;

        @NameInMap("MuxConfig")
        public QueryTemplateListResponseBodyTemplateListTemplateMuxConfig muxConfig;

        @NameInMap("Name")
        public String name;

        @NameInMap("State")
        public String state;

        @NameInMap("TransConfig")
        public QueryTemplateListResponseBodyTemplateListTemplateTransConfig transConfig;

        @NameInMap("Video")
        public QueryTemplateListResponseBodyTemplateListTemplateVideo video;

        public static QueryTemplateListResponseBodyTemplateListTemplate build(java.util.Map<String, ?> map) throws Exception {
            QueryTemplateListResponseBodyTemplateListTemplate self = new QueryTemplateListResponseBodyTemplateListTemplate();
            return TeaModel.build(map, self);
        }

        public QueryTemplateListResponseBodyTemplateListTemplate setAudio(QueryTemplateListResponseBodyTemplateListTemplateAudio audio) {
            this.audio = audio;
            return this;
        }
        public QueryTemplateListResponseBodyTemplateListTemplateAudio getAudio() {
            return this.audio;
        }

        public QueryTemplateListResponseBodyTemplateListTemplate setContainer(QueryTemplateListResponseBodyTemplateListTemplateContainer container) {
            this.container = container;
            return this;
        }
        public QueryTemplateListResponseBodyTemplateListTemplateContainer getContainer() {
            return this.container;
        }

        public QueryTemplateListResponseBodyTemplateListTemplate setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTemplateListResponseBodyTemplateListTemplate setMuxConfig(QueryTemplateListResponseBodyTemplateListTemplateMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public QueryTemplateListResponseBodyTemplateListTemplateMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public QueryTemplateListResponseBodyTemplateListTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTemplateListResponseBodyTemplateListTemplate setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryTemplateListResponseBodyTemplateListTemplate setTransConfig(QueryTemplateListResponseBodyTemplateListTemplateTransConfig transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public QueryTemplateListResponseBodyTemplateListTemplateTransConfig getTransConfig() {
            return this.transConfig;
        }

        public QueryTemplateListResponseBodyTemplateListTemplate setVideo(QueryTemplateListResponseBodyTemplateListTemplateVideo video) {
            this.video = video;
            return this;
        }
        public QueryTemplateListResponseBodyTemplateListTemplateVideo getVideo() {
            return this.video;
        }

    }

    public static class QueryTemplateListResponseBodyTemplateList extends TeaModel {
        @NameInMap("Template")
        public java.util.List<QueryTemplateListResponseBodyTemplateListTemplate> template;

        public static QueryTemplateListResponseBodyTemplateList build(java.util.Map<String, ?> map) throws Exception {
            QueryTemplateListResponseBodyTemplateList self = new QueryTemplateListResponseBodyTemplateList();
            return TeaModel.build(map, self);
        }

        public QueryTemplateListResponseBodyTemplateList setTemplate(java.util.List<QueryTemplateListResponseBodyTemplateListTemplate> template) {
            this.template = template;
            return this;
        }
        public java.util.List<QueryTemplateListResponseBodyTemplateListTemplate> getTemplate() {
            return this.template;
        }

    }

}
