// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class UpdateTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Template")
    public UpdateTemplateResponseBodyTemplate template;

    public static UpdateTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateResponseBody self = new UpdateTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateTemplateResponseBody setTemplate(UpdateTemplateResponseBodyTemplate template) {
        this.template = template;
        return this;
    }
    public UpdateTemplateResponseBodyTemplate getTemplate() {
        return this.template;
    }

    public static class UpdateTemplateResponseBodyTemplateAudio extends TeaModel {
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

        public static UpdateTemplateResponseBodyTemplateAudio build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateResponseBodyTemplateAudio self = new UpdateTemplateResponseBodyTemplateAudio();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateResponseBodyTemplateAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public UpdateTemplateResponseBodyTemplateAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public UpdateTemplateResponseBodyTemplateAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public UpdateTemplateResponseBodyTemplateAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public UpdateTemplateResponseBodyTemplateAudio setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public UpdateTemplateResponseBodyTemplateAudio setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public UpdateTemplateResponseBodyTemplateAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

    }

    public static class UpdateTemplateResponseBodyTemplateContainer extends TeaModel {
        @NameInMap("Format")
        public String format;

        public static UpdateTemplateResponseBodyTemplateContainer build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateResponseBodyTemplateContainer self = new UpdateTemplateResponseBodyTemplateContainer();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateResponseBodyTemplateContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class UpdateTemplateResponseBodyTemplateMuxConfigGif extends TeaModel {
        @NameInMap("DitherMode")
        public String ditherMode;

        @NameInMap("FinalDelay")
        public String finalDelay;

        @NameInMap("IsCustomPalette")
        public String isCustomPalette;

        @NameInMap("Loop")
        public String loop;

        public static UpdateTemplateResponseBodyTemplateMuxConfigGif build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateResponseBodyTemplateMuxConfigGif self = new UpdateTemplateResponseBodyTemplateMuxConfigGif();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateResponseBodyTemplateMuxConfigGif setDitherMode(String ditherMode) {
            this.ditherMode = ditherMode;
            return this;
        }
        public String getDitherMode() {
            return this.ditherMode;
        }

        public UpdateTemplateResponseBodyTemplateMuxConfigGif setFinalDelay(String finalDelay) {
            this.finalDelay = finalDelay;
            return this;
        }
        public String getFinalDelay() {
            return this.finalDelay;
        }

        public UpdateTemplateResponseBodyTemplateMuxConfigGif setIsCustomPalette(String isCustomPalette) {
            this.isCustomPalette = isCustomPalette;
            return this;
        }
        public String getIsCustomPalette() {
            return this.isCustomPalette;
        }

        public UpdateTemplateResponseBodyTemplateMuxConfigGif setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

    }

    public static class UpdateTemplateResponseBodyTemplateMuxConfigSegment extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        public static UpdateTemplateResponseBodyTemplateMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateResponseBodyTemplateMuxConfigSegment self = new UpdateTemplateResponseBodyTemplateMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateResponseBodyTemplateMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class UpdateTemplateResponseBodyTemplateMuxConfigWebp extends TeaModel {
        @NameInMap("Loop")
        public String loop;

        public static UpdateTemplateResponseBodyTemplateMuxConfigWebp build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateResponseBodyTemplateMuxConfigWebp self = new UpdateTemplateResponseBodyTemplateMuxConfigWebp();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateResponseBodyTemplateMuxConfigWebp setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

    }

    public static class UpdateTemplateResponseBodyTemplateMuxConfig extends TeaModel {
        @NameInMap("Gif")
        public UpdateTemplateResponseBodyTemplateMuxConfigGif gif;

        @NameInMap("Segment")
        public UpdateTemplateResponseBodyTemplateMuxConfigSegment segment;

        @NameInMap("Webp")
        public UpdateTemplateResponseBodyTemplateMuxConfigWebp webp;

        public static UpdateTemplateResponseBodyTemplateMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateResponseBodyTemplateMuxConfig self = new UpdateTemplateResponseBodyTemplateMuxConfig();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateResponseBodyTemplateMuxConfig setGif(UpdateTemplateResponseBodyTemplateMuxConfigGif gif) {
            this.gif = gif;
            return this;
        }
        public UpdateTemplateResponseBodyTemplateMuxConfigGif getGif() {
            return this.gif;
        }

        public UpdateTemplateResponseBodyTemplateMuxConfig setSegment(UpdateTemplateResponseBodyTemplateMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public UpdateTemplateResponseBodyTemplateMuxConfigSegment getSegment() {
            return this.segment;
        }

        public UpdateTemplateResponseBodyTemplateMuxConfig setWebp(UpdateTemplateResponseBodyTemplateMuxConfigWebp webp) {
            this.webp = webp;
            return this;
        }
        public UpdateTemplateResponseBodyTemplateMuxConfigWebp getWebp() {
            return this.webp;
        }

    }

    public static class UpdateTemplateResponseBodyTemplateTransConfig extends TeaModel {
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

        public static UpdateTemplateResponseBodyTemplateTransConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateResponseBodyTemplateTransConfig self = new UpdateTemplateResponseBodyTemplateTransConfig();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateResponseBodyTemplateTransConfig setAdjDarMethod(String adjDarMethod) {
            this.adjDarMethod = adjDarMethod;
            return this;
        }
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        public UpdateTemplateResponseBodyTemplateTransConfig setIsCheckAudioBitrate(String isCheckAudioBitrate) {
            this.isCheckAudioBitrate = isCheckAudioBitrate;
            return this;
        }
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        public UpdateTemplateResponseBodyTemplateTransConfig setIsCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
            this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
            return this;
        }
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

        public UpdateTemplateResponseBodyTemplateTransConfig setIsCheckReso(String isCheckReso) {
            this.isCheckReso = isCheckReso;
            return this;
        }
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        public UpdateTemplateResponseBodyTemplateTransConfig setIsCheckResoFail(String isCheckResoFail) {
            this.isCheckResoFail = isCheckResoFail;
            return this;
        }
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        public UpdateTemplateResponseBodyTemplateTransConfig setIsCheckVideoBitrate(String isCheckVideoBitrate) {
            this.isCheckVideoBitrate = isCheckVideoBitrate;
            return this;
        }
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        public UpdateTemplateResponseBodyTemplateTransConfig setIsCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
            this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
            return this;
        }
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        public UpdateTemplateResponseBodyTemplateTransConfig setTransMode(String transMode) {
            this.transMode = transMode;
            return this;
        }
        public String getTransMode() {
            return this.transMode;
        }

    }

    public static class UpdateTemplateResponseBodyTemplateVideoBitrateBnd extends TeaModel {
        @NameInMap("Max")
        public String max;

        @NameInMap("Min")
        public String min;

        public static UpdateTemplateResponseBodyTemplateVideoBitrateBnd build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateResponseBodyTemplateVideoBitrateBnd self = new UpdateTemplateResponseBodyTemplateVideoBitrateBnd();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateResponseBodyTemplateVideoBitrateBnd setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public UpdateTemplateResponseBodyTemplateVideoBitrateBnd setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

    }

    public static class UpdateTemplateResponseBodyTemplateVideo extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("BitrateBnd")
        public UpdateTemplateResponseBodyTemplateVideoBitrateBnd bitrateBnd;

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

        public static UpdateTemplateResponseBodyTemplateVideo build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateResponseBodyTemplateVideo self = new UpdateTemplateResponseBodyTemplateVideo();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateResponseBodyTemplateVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public UpdateTemplateResponseBodyTemplateVideo setBitrateBnd(UpdateTemplateResponseBodyTemplateVideoBitrateBnd bitrateBnd) {
            this.bitrateBnd = bitrateBnd;
            return this;
        }
        public UpdateTemplateResponseBodyTemplateVideoBitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        public UpdateTemplateResponseBodyTemplateVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public UpdateTemplateResponseBodyTemplateVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public UpdateTemplateResponseBodyTemplateVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public UpdateTemplateResponseBodyTemplateVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public UpdateTemplateResponseBodyTemplateVideo setDegrain(String degrain) {
            this.degrain = degrain;
            return this;
        }
        public String getDegrain() {
            return this.degrain;
        }

        public UpdateTemplateResponseBodyTemplateVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public UpdateTemplateResponseBodyTemplateVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public UpdateTemplateResponseBodyTemplateVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public UpdateTemplateResponseBodyTemplateVideo setMaxFps(String maxFps) {
            this.maxFps = maxFps;
            return this;
        }
        public String getMaxFps() {
            return this.maxFps;
        }

        public UpdateTemplateResponseBodyTemplateVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public UpdateTemplateResponseBodyTemplateVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public UpdateTemplateResponseBodyTemplateVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public UpdateTemplateResponseBodyTemplateVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public UpdateTemplateResponseBodyTemplateVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public UpdateTemplateResponseBodyTemplateVideo setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public UpdateTemplateResponseBodyTemplateVideo setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public UpdateTemplateResponseBodyTemplateVideo setResoPriority(String resoPriority) {
            this.resoPriority = resoPriority;
            return this;
        }
        public String getResoPriority() {
            return this.resoPriority;
        }

        public UpdateTemplateResponseBodyTemplateVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public UpdateTemplateResponseBodyTemplateVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class UpdateTemplateResponseBodyTemplate extends TeaModel {
        @NameInMap("Audio")
        public UpdateTemplateResponseBodyTemplateAudio audio;

        @NameInMap("Container")
        public UpdateTemplateResponseBodyTemplateContainer container;

        @NameInMap("Id")
        public String id;

        @NameInMap("MuxConfig")
        public UpdateTemplateResponseBodyTemplateMuxConfig muxConfig;

        @NameInMap("Name")
        public String name;

        @NameInMap("State")
        public String state;

        @NameInMap("TransConfig")
        public UpdateTemplateResponseBodyTemplateTransConfig transConfig;

        @NameInMap("Video")
        public UpdateTemplateResponseBodyTemplateVideo video;

        public static UpdateTemplateResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateResponseBodyTemplate self = new UpdateTemplateResponseBodyTemplate();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateResponseBodyTemplate setAudio(UpdateTemplateResponseBodyTemplateAudio audio) {
            this.audio = audio;
            return this;
        }
        public UpdateTemplateResponseBodyTemplateAudio getAudio() {
            return this.audio;
        }

        public UpdateTemplateResponseBodyTemplate setContainer(UpdateTemplateResponseBodyTemplateContainer container) {
            this.container = container;
            return this;
        }
        public UpdateTemplateResponseBodyTemplateContainer getContainer() {
            return this.container;
        }

        public UpdateTemplateResponseBodyTemplate setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateTemplateResponseBodyTemplate setMuxConfig(UpdateTemplateResponseBodyTemplateMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public UpdateTemplateResponseBodyTemplateMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public UpdateTemplateResponseBodyTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateTemplateResponseBodyTemplate setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateTemplateResponseBodyTemplate setTransConfig(UpdateTemplateResponseBodyTemplateTransConfig transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public UpdateTemplateResponseBodyTemplateTransConfig getTransConfig() {
            return this.transConfig;
        }

        public UpdateTemplateResponseBodyTemplate setVideo(UpdateTemplateResponseBodyTemplateVideo video) {
            this.video = video;
            return this;
        }
        public UpdateTemplateResponseBodyTemplateVideo getVideo() {
            return this.video;
        }

    }

}
