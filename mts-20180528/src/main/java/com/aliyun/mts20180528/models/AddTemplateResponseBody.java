// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class AddTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FA258E67-09B8-4EAA-8F33-BA5678341CF2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Template")
    public AddTemplateResponseBodyTemplate template;

    public static AddTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTemplateResponseBody self = new AddTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddTemplateResponseBody setTemplate(AddTemplateResponseBodyTemplate template) {
        this.template = template;
        return this;
    }
    public AddTemplateResponseBodyTemplate getTemplate() {
        return this.template;
    }

    public static class AddTemplateResponseBodyTemplateAudioVolume extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>-100</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("Method")
        public String method;

        public static AddTemplateResponseBodyTemplateAudioVolume build(java.util.Map<String, ?> map) throws Exception {
            AddTemplateResponseBodyTemplateAudioVolume self = new AddTemplateResponseBodyTemplateAudioVolume();
            return TeaModel.build(map, self);
        }

        public AddTemplateResponseBodyTemplateAudioVolume setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public AddTemplateResponseBodyTemplateAudioVolume setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

    }

    public static class AddTemplateResponseBodyTemplateAudio extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <strong>example:</strong>
         * <p>acc</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <strong>example:</strong>
         * <p>aac_eld</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Qscale")
        public String qscale;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Remove")
        public String remove;

        /**
         * <strong>example:</strong>
         * <p>22050</p>
         */
        @NameInMap("Samplerate")
        public String samplerate;

        @NameInMap("Volume")
        public AddTemplateResponseBodyTemplateAudioVolume volume;

        public static AddTemplateResponseBodyTemplateAudio build(java.util.Map<String, ?> map) throws Exception {
            AddTemplateResponseBodyTemplateAudio self = new AddTemplateResponseBodyTemplateAudio();
            return TeaModel.build(map, self);
        }

        public AddTemplateResponseBodyTemplateAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public AddTemplateResponseBodyTemplateAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public AddTemplateResponseBodyTemplateAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public AddTemplateResponseBodyTemplateAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public AddTemplateResponseBodyTemplateAudio setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public AddTemplateResponseBodyTemplateAudio setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public AddTemplateResponseBodyTemplateAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public AddTemplateResponseBodyTemplateAudio setVolume(AddTemplateResponseBodyTemplateAudioVolume volume) {
            this.volume = volume;
            return this;
        }
        public AddTemplateResponseBodyTemplateAudioVolume getVolume() {
            return this.volume;
        }

    }

    public static class AddTemplateResponseBodyTemplateContainer extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>flv</p>
         */
        @NameInMap("Format")
        public String format;

        public static AddTemplateResponseBodyTemplateContainer build(java.util.Map<String, ?> map) throws Exception {
            AddTemplateResponseBodyTemplateContainer self = new AddTemplateResponseBodyTemplateContainer();
            return TeaModel.build(map, self);
        }

        public AddTemplateResponseBodyTemplateContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class AddTemplateResponseBodyTemplateMuxConfigGif extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sierra</p>
         */
        @NameInMap("DitherMode")
        public String ditherMode;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("FinalDelay")
        public String finalDelay;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCustomPalette")
        public String isCustomPalette;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Loop")
        public String loop;

        public static AddTemplateResponseBodyTemplateMuxConfigGif build(java.util.Map<String, ?> map) throws Exception {
            AddTemplateResponseBodyTemplateMuxConfigGif self = new AddTemplateResponseBodyTemplateMuxConfigGif();
            return TeaModel.build(map, self);
        }

        public AddTemplateResponseBodyTemplateMuxConfigGif setDitherMode(String ditherMode) {
            this.ditherMode = ditherMode;
            return this;
        }
        public String getDitherMode() {
            return this.ditherMode;
        }

        public AddTemplateResponseBodyTemplateMuxConfigGif setFinalDelay(String finalDelay) {
            this.finalDelay = finalDelay;
            return this;
        }
        public String getFinalDelay() {
            return this.finalDelay;
        }

        public AddTemplateResponseBodyTemplateMuxConfigGif setIsCustomPalette(String isCustomPalette) {
            this.isCustomPalette = isCustomPalette;
            return this;
        }
        public String getIsCustomPalette() {
            return this.isCustomPalette;
        }

        public AddTemplateResponseBodyTemplateMuxConfigGif setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

    }

    public static class AddTemplateResponseBodyTemplateMuxConfigSegment extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Duration")
        public String duration;

        public static AddTemplateResponseBodyTemplateMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            AddTemplateResponseBodyTemplateMuxConfigSegment self = new AddTemplateResponseBodyTemplateMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public AddTemplateResponseBodyTemplateMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class AddTemplateResponseBodyTemplateMuxConfigWebp extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Loop")
        public String loop;

        public static AddTemplateResponseBodyTemplateMuxConfigWebp build(java.util.Map<String, ?> map) throws Exception {
            AddTemplateResponseBodyTemplateMuxConfigWebp self = new AddTemplateResponseBodyTemplateMuxConfigWebp();
            return TeaModel.build(map, self);
        }

        public AddTemplateResponseBodyTemplateMuxConfigWebp setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

    }

    public static class AddTemplateResponseBodyTemplateMuxConfig extends TeaModel {
        @NameInMap("Gif")
        public AddTemplateResponseBodyTemplateMuxConfigGif gif;

        @NameInMap("Segment")
        public AddTemplateResponseBodyTemplateMuxConfigSegment segment;

        @NameInMap("Webp")
        public AddTemplateResponseBodyTemplateMuxConfigWebp webp;

        public static AddTemplateResponseBodyTemplateMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            AddTemplateResponseBodyTemplateMuxConfig self = new AddTemplateResponseBodyTemplateMuxConfig();
            return TeaModel.build(map, self);
        }

        public AddTemplateResponseBodyTemplateMuxConfig setGif(AddTemplateResponseBodyTemplateMuxConfigGif gif) {
            this.gif = gif;
            return this;
        }
        public AddTemplateResponseBodyTemplateMuxConfigGif getGif() {
            return this.gif;
        }

        public AddTemplateResponseBodyTemplateMuxConfig setSegment(AddTemplateResponseBodyTemplateMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public AddTemplateResponseBodyTemplateMuxConfigSegment getSegment() {
            return this.segment;
        }

        public AddTemplateResponseBodyTemplateMuxConfig setWebp(AddTemplateResponseBodyTemplateMuxConfigWebp webp) {
            this.webp = webp;
            return this;
        }
        public AddTemplateResponseBodyTemplateMuxConfigWebp getWebp() {
            return this.webp;
        }

    }

    public static class AddTemplateResponseBodyTemplateTransConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pda</p>
         */
        @NameInMap("AdjDarMethod")
        public String adjDarMethod;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckAudioBitrate")
        public String isCheckAudioBitrate;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckAudioBitrateFail")
        public String isCheckAudioBitrateFail;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckReso")
        public String isCheckReso;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckResoFail")
        public String isCheckResoFail;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckVideoBitrate")
        public String isCheckVideoBitrate;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckVideoBitrateFail")
        public String isCheckVideoBitrateFail;

        /**
         * <strong>example:</strong>
         * <p>onepass</p>
         */
        @NameInMap("TransMode")
        public String transMode;

        public static AddTemplateResponseBodyTemplateTransConfig build(java.util.Map<String, ?> map) throws Exception {
            AddTemplateResponseBodyTemplateTransConfig self = new AddTemplateResponseBodyTemplateTransConfig();
            return TeaModel.build(map, self);
        }

        public AddTemplateResponseBodyTemplateTransConfig setAdjDarMethod(String adjDarMethod) {
            this.adjDarMethod = adjDarMethod;
            return this;
        }
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        public AddTemplateResponseBodyTemplateTransConfig setIsCheckAudioBitrate(String isCheckAudioBitrate) {
            this.isCheckAudioBitrate = isCheckAudioBitrate;
            return this;
        }
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        public AddTemplateResponseBodyTemplateTransConfig setIsCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
            this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
            return this;
        }
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

        public AddTemplateResponseBodyTemplateTransConfig setIsCheckReso(String isCheckReso) {
            this.isCheckReso = isCheckReso;
            return this;
        }
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        public AddTemplateResponseBodyTemplateTransConfig setIsCheckResoFail(String isCheckResoFail) {
            this.isCheckResoFail = isCheckResoFail;
            return this;
        }
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        public AddTemplateResponseBodyTemplateTransConfig setIsCheckVideoBitrate(String isCheckVideoBitrate) {
            this.isCheckVideoBitrate = isCheckVideoBitrate;
            return this;
        }
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        public AddTemplateResponseBodyTemplateTransConfig setIsCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
            this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
            return this;
        }
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        public AddTemplateResponseBodyTemplateTransConfig setTransMode(String transMode) {
            this.transMode = transMode;
            return this;
        }
        public String getTransMode() {
            return this.transMode;
        }

    }

    public static class AddTemplateResponseBodyTemplateVideoBitrateBnd extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Max")
        public String max;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Min")
        public String min;

        public static AddTemplateResponseBodyTemplateVideoBitrateBnd build(java.util.Map<String, ?> map) throws Exception {
            AddTemplateResponseBodyTemplateVideoBitrateBnd self = new AddTemplateResponseBodyTemplateVideoBitrateBnd();
            return TeaModel.build(map, self);
        }

        public AddTemplateResponseBodyTemplateVideoBitrateBnd setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public AddTemplateResponseBodyTemplateVideoBitrateBnd setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

    }

    public static class AddTemplateResponseBodyTemplateVideo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("BitrateBnd")
        public AddTemplateResponseBodyTemplateVideoBitrateBnd bitrateBnd;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Bufsize")
        public String bufsize;

        /**
         * <strong>example:</strong>
         * <p>aac</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Crf")
        public String crf;

        /**
         * <strong>example:</strong>
         * <p>1280:800:0:140</p>
         */
        @NameInMap("Crop")
        public String crop;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Degrain")
        public String degrain;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Gop")
        public String gop;

        /**
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxFps")
        public String maxFps;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Maxrate")
        public String maxrate;

        /**
         * <strong>example:</strong>
         * <p>1280:800:0:140</p>
         */
        @NameInMap("Pad")
        public String pad;

        /**
         * <strong>example:</strong>
         * <p>yuv420p</p>
         */
        @NameInMap("PixFmt")
        public String pixFmt;

        /**
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("Preset")
        public String preset;

        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Qscale")
        public String qscale;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Remove")
        public String remove;

        /**
         * <strong>example:</strong>
         * <p>cropFirst</p>
         */
        @NameInMap("ResoPriority")
        public String resoPriority;

        /**
         * <strong>example:</strong>
         * <p>interlaced</p>
         */
        @NameInMap("ScanMode")
        public String scanMode;

        /**
         * <strong>example:</strong>
         * <p>129</p>
         */
        @NameInMap("Width")
        public String width;

        public static AddTemplateResponseBodyTemplateVideo build(java.util.Map<String, ?> map) throws Exception {
            AddTemplateResponseBodyTemplateVideo self = new AddTemplateResponseBodyTemplateVideo();
            return TeaModel.build(map, self);
        }

        public AddTemplateResponseBodyTemplateVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public AddTemplateResponseBodyTemplateVideo setBitrateBnd(AddTemplateResponseBodyTemplateVideoBitrateBnd bitrateBnd) {
            this.bitrateBnd = bitrateBnd;
            return this;
        }
        public AddTemplateResponseBodyTemplateVideoBitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        public AddTemplateResponseBodyTemplateVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public AddTemplateResponseBodyTemplateVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public AddTemplateResponseBodyTemplateVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public AddTemplateResponseBodyTemplateVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public AddTemplateResponseBodyTemplateVideo setDegrain(String degrain) {
            this.degrain = degrain;
            return this;
        }
        public String getDegrain() {
            return this.degrain;
        }

        public AddTemplateResponseBodyTemplateVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public AddTemplateResponseBodyTemplateVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public AddTemplateResponseBodyTemplateVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public AddTemplateResponseBodyTemplateVideo setMaxFps(String maxFps) {
            this.maxFps = maxFps;
            return this;
        }
        public String getMaxFps() {
            return this.maxFps;
        }

        public AddTemplateResponseBodyTemplateVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public AddTemplateResponseBodyTemplateVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public AddTemplateResponseBodyTemplateVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public AddTemplateResponseBodyTemplateVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public AddTemplateResponseBodyTemplateVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public AddTemplateResponseBodyTemplateVideo setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public AddTemplateResponseBodyTemplateVideo setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public AddTemplateResponseBodyTemplateVideo setResoPriority(String resoPriority) {
            this.resoPriority = resoPriority;
            return this;
        }
        public String getResoPriority() {
            return this.resoPriority;
        }

        public AddTemplateResponseBodyTemplateVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public AddTemplateResponseBodyTemplateVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class AddTemplateResponseBodyTemplate extends TeaModel {
        @NameInMap("Audio")
        public AddTemplateResponseBodyTemplateAudio audio;

        @NameInMap("Container")
        public AddTemplateResponseBodyTemplateContainer container;

        /**
         * <strong>example:</strong>
         * <p>16f01ad6175e4230ac42bb5182cd05c3</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("MuxConfig")
        public AddTemplateResponseBodyTemplateMuxConfig muxConfig;

        /**
         * <strong>example:</strong>
         * <p>yourname</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("State")
        public String state;

        @NameInMap("TransConfig")
        public AddTemplateResponseBodyTemplateTransConfig transConfig;

        @NameInMap("Video")
        public AddTemplateResponseBodyTemplateVideo video;

        public static AddTemplateResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            AddTemplateResponseBodyTemplate self = new AddTemplateResponseBodyTemplate();
            return TeaModel.build(map, self);
        }

        public AddTemplateResponseBodyTemplate setAudio(AddTemplateResponseBodyTemplateAudio audio) {
            this.audio = audio;
            return this;
        }
        public AddTemplateResponseBodyTemplateAudio getAudio() {
            return this.audio;
        }

        public AddTemplateResponseBodyTemplate setContainer(AddTemplateResponseBodyTemplateContainer container) {
            this.container = container;
            return this;
        }
        public AddTemplateResponseBodyTemplateContainer getContainer() {
            return this.container;
        }

        public AddTemplateResponseBodyTemplate setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddTemplateResponseBodyTemplate setMuxConfig(AddTemplateResponseBodyTemplateMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public AddTemplateResponseBodyTemplateMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public AddTemplateResponseBodyTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddTemplateResponseBodyTemplate setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public AddTemplateResponseBodyTemplate setTransConfig(AddTemplateResponseBodyTemplateTransConfig transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public AddTemplateResponseBodyTemplateTransConfig getTransConfig() {
            return this.transConfig;
        }

        public AddTemplateResponseBodyTemplate setVideo(AddTemplateResponseBodyTemplateVideo video) {
            this.video = video;
            return this;
        }
        public AddTemplateResponseBodyTemplateVideo getVideo() {
            return this.video;
        }

    }

}
