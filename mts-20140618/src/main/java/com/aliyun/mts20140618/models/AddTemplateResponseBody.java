// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FA258E67-09B8-4EAA-8F33-BA567834A2C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the transcoding template.</p>
     */
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
         * <p>The output volume.</p>
         * <p>This parameter takes effect only when the value of Method is dynamic.</p>
         * <p>Unit: dB.</p>
         * <p>Valid values: [-70,-5].</p>
         * <p>Default value: -6.</p>
         * 
         * <strong>example:</strong>
         * <p>-6</p>
         */
        @NameInMap("IntegratedLoudnessTarget")
        public String integratedLoudnessTarget;

        /**
         * <p>The volume adjustment range.</p>
         * <ul>
         * <li>Default value: <strong>-20</strong>.</li>
         * <li>Unit: dB.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-20</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The range of the volume relative to the output volume.</p>
         * <p>This parameter takes effect only when the value of Method is dynamic.</p>
         * <p>Unit: dB.</p>
         * <p>Valid values: [1,20].</p>
         * <p>Default value: 8.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("LoudnessRangeTarget")
        public String loudnessRangeTarget;

        /**
         * <p>The volume adjustment method. Valid values:</p>
         * <ul>
         * <li><strong>auto</strong>: The volume is automatically adjusted.</li>
         * <li><strong>dynamic</strong>: The volume is dynamically adjusted.</li>
         * <li><strong>linear</strong>: The volume is linearly adjusted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The volume adjustment coefficient.</p>
         * <p>This parameter takes effect only when the value of Method is adaptive.</p>
         * <p>Valid values: [0,1].</p>
         * <p>Default value: 0.9.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("PeakLevel")
        public String peakLevel;

        /**
         * <p>The peak volume.</p>
         * <p>This parameter takes effect only when the value of Method is dynamic.</p>
         * <p>Unit: dB.</p>
         * <p>Valid values: [-9,0].</p>
         * <p>Default value: -1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TruePeak")
        public String truePeak;

        public static AddTemplateResponseBodyTemplateAudioVolume build(java.util.Map<String, ?> map) throws Exception {
            AddTemplateResponseBodyTemplateAudioVolume self = new AddTemplateResponseBodyTemplateAudioVolume();
            return TeaModel.build(map, self);
        }

        public AddTemplateResponseBodyTemplateAudioVolume setIntegratedLoudnessTarget(String integratedLoudnessTarget) {
            this.integratedLoudnessTarget = integratedLoudnessTarget;
            return this;
        }
        public String getIntegratedLoudnessTarget() {
            return this.integratedLoudnessTarget;
        }

        public AddTemplateResponseBodyTemplateAudioVolume setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public AddTemplateResponseBodyTemplateAudioVolume setLoudnessRangeTarget(String loudnessRangeTarget) {
            this.loudnessRangeTarget = loudnessRangeTarget;
            return this;
        }
        public String getLoudnessRangeTarget() {
            return this.loudnessRangeTarget;
        }

        public AddTemplateResponseBodyTemplateAudioVolume setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public AddTemplateResponseBodyTemplateAudioVolume setPeakLevel(String peakLevel) {
            this.peakLevel = peakLevel;
            return this;
        }
        public String getPeakLevel() {
            return this.peakLevel;
        }

        public AddTemplateResponseBodyTemplateAudioVolume setTruePeak(String truePeak) {
            this.truePeak = truePeak;
            return this;
        }
        public String getTruePeak() {
            return this.truePeak;
        }

    }

    public static class AddTemplateResponseBodyTemplateAudio extends TeaModel {
        /**
         * <p>The audio bitrate of the output file.</p>
         * <ul>
         * <li>Unit: Kbit/s.</li>
         * <li>Default value: <strong>128</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>500</p>
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
         * <p>The audio codec format. Default value: <strong>aac</strong>. Valid values:</p>
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
         * <p>The codec profile of the audio. Valid values if the <strong>Codec</strong> parameter is set to <strong>AAC</strong>:</p>
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
         * <p>The level of the independent denoising algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Qscale")
        public String qscale;

        /**
         * <p>Indicates whether the audio stream is deleted.</p>
         * <ul>
         * <li><strong>true</strong>: The audio stream is deleted.</li>
         * <li><strong>false</strong>: The audio stream is retained.</li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Remove")
        public String remove;

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

        /**
         * <p>The volume control configurations</p>
         */
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
         * <p>The container format.</p>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
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
         * <p>The color dithering algorithm of the palette. Valid values: sierra and bayer.</p>
         * 
         * <strong>example:</strong>
         * <p>sierra</p>
         */
        @NameInMap("DitherMode")
        public String ditherMode;

        /**
         * <p>The duration for which the final frame is paused. Unit: centiseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FinalDelay")
        public String finalDelay;

        /**
         * <p>Indicates whether the custom palette is used.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCustomPalette")
        public String isCustomPalette;

        /**
         * <p>The loop count.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The length of the segment. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The loop count.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
        /**
         * <p>The transmuxing settings for GIF.</p>
         */
        @NameInMap("Gif")
        public AddTemplateResponseBodyTemplateMuxConfigGif gif;

        /**
         * <p>The segment settings.</p>
         */
        @NameInMap("Segment")
        public AddTemplateResponseBodyTemplateMuxConfigSegment segment;

        /**
         * <p>The transmuxing settings for WebP.</p>
         */
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
         * <p>The method of resolution adjustment. Default value: <strong>none</strong>. Valid values:</p>
         * <ul>
         * <li><strong>rescale</strong>: The input video is rescaled.</li>
         * <li><strong>crop</strong>: The input video is cropped.</li>
         * <li><strong>none</strong>: No change is made.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rescale</p>
         */
        @NameInMap("AdjDarMethod")
        public String adjDarMethod;

        /**
         * <p>Indicates whether the audio bitrate is checked.</p>
         * <p>If this feature is enabled and the system detects that the audio bitrate of the output file is greater than that of the input file, the audio bitrate of the input file is retained after transcoding.</p>
         * <ul>
         * <li><strong>true</strong>: The audio bitrate is checked.</li>
         * <li><strong>false</strong>: The audio bitrate is not checked.</li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCheckAudioBitrate")
        public String isCheckAudioBitrate;

        /**
         * <p>Indicates whether the audio bitrate is checked. If this feature is enabled and the system detects that the audio bitrate of the output file is higher than that of the input file, the input file is not transcoded. This parameter has a higher priority than the <strong>IsCheckAudioBitrate</strong> parameter. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The audio bitrate is checked. In this case, if the audio bitrate of the output file is higher than that of the input file, the input file is not transcoded.</li>
         * <li><strong>false</strong>: The audio bitrate is not checked.</li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCheckAudioBitrateFail")
        public String isCheckAudioBitrateFail;

        /**
         * <p>Indicates whether the resolution is checked.</p>
         * <ul>
         * <li><strong>true</strong>: The resolution is checked.</li>
         * <li><strong>false</strong>: The resolution is not checked.</li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * <blockquote>
         * <p>If this feature is enabled and the system detects that the resolution of the output file is higher than that of the input file based on the width or height, the resolution of the input file is retained after transcoding.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCheckReso")
        public String isCheckReso;

        /**
         * <p>Indicates whether the resolution is checked.</p>
         * <ul>
         * <li><strong>true</strong>: The resolution is checked.</li>
         * <li><strong>false</strong>: The resolution is not checked.</li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * <blockquote>
         * <p>If this feature is enabled and the system detects that the resolution of the output file is higher than that of the input file based on the width or height, an error that indicates a transcoding failure is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCheckResoFail")
        public String isCheckResoFail;

        /**
         * <p>Indicates whether the video bitrate is checked.</p>
         * <ul>
         * <li><strong>true</strong>: The video bitrate is checked.</li>
         * <li><strong>false</strong>: The video bitrate is not checked.</li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * <blockquote>
         * <p>If this feature is enabled and the system detects that the video bitrate of the output file is greater than that of the input file, the video bitrate of the input file is retained after transcoding.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCheckVideoBitrate")
        public String isCheckVideoBitrate;

        /**
         * <p>Indicates whether the video bitrate is checked. If this feature is enabled and the system detects that the video bitrate of the output file is higher than that of the input file, the input file is not transcoded. This parameter has a higher priority than the IsCheckVideoBitrate parameter.</p>
         * <ul>
         * <li><strong>true</strong>: The video bitrate is checked. In this case, if the video bitrate of the output file is higher than that of the input file, the input file is not transcoded.</li>
         * <li><strong>false</strong>: The video bitrate is not checked.</li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCheckVideoBitrateFail")
        public String isCheckVideoBitrateFail;

        /**
         * <p>The transcoding mode. Valid values:</p>
         * <ul>
         * <li><strong>onepass</strong></li>
         * <li><strong>twopass</strong></li>
         * <li><strong>CBR</strong></li>
         * <li>Default value: <strong>onepass</strong>.</li>
         * </ul>
         * 
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
         * <p>The maximum bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("Max")
        public String max;

        /**
         * <p>The minimum bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
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

    public static class AddTemplateResponseBodyTemplateVideoNarrowBand extends TeaModel {
        /**
         * <p>The upper limit of the dynamic bitrate. If this parameter is set, the average bitrate is in the range of (0, 1000000].</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("Abrmax")
        public Float abrmax;

        /**
         * <p>The maximum ratio of the upper limit of dynamic bitrate. If this parameter is set, the value of Abrmax does not exceed x times of the source video bitrate. Valid values: (0,1.0].</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("MaxAbrRatio")
        public Float maxAbrRatio;

        /**
         * <p>The Narrowband HD version. Only 1.0 may be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static AddTemplateResponseBodyTemplateVideoNarrowBand build(java.util.Map<String, ?> map) throws Exception {
            AddTemplateResponseBodyTemplateVideoNarrowBand self = new AddTemplateResponseBodyTemplateVideoNarrowBand();
            return TeaModel.build(map, self);
        }

        public AddTemplateResponseBodyTemplateVideoNarrowBand setAbrmax(Float abrmax) {
            this.abrmax = abrmax;
            return this;
        }
        public Float getAbrmax() {
            return this.abrmax;
        }

        public AddTemplateResponseBodyTemplateVideoNarrowBand setMaxAbrRatio(Float maxAbrRatio) {
            this.maxAbrRatio = maxAbrRatio;
            return this;
        }
        public Float getMaxAbrRatio() {
            return this.maxAbrRatio;
        }

        public AddTemplateResponseBodyTemplateVideoNarrowBand setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class AddTemplateResponseBodyTemplateVideo extends TeaModel {
        /**
         * <p>The bitrate of the output video. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The bitrate range of the video.</p>
         */
        @NameInMap("BitrateBnd")
        public AddTemplateResponseBodyTemplateVideoBitrateBnd bitrateBnd;

        /**
         * <p>The size of the buffer.</p>
         * <ul>
         * <li>Default value: <strong>6000</strong>.</li>
         * <li>Unit: KB.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6000</p>
         */
        @NameInMap("Bufsize")
        public String bufsize;

        /**
         * <p>The video codec. Valid values: H.264, H.265, GIF, and WebP. Default value: <strong>H.264</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>H.264</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The constant rate factor. Default value if the video codec is set to H.264: <strong>23</strong>. Default value if the video codec is set to H.265: <strong>26</strong>.</p>
         * <blockquote>
         * <p>If this parameter is specified, the setting of the Bitrate parameter becomes invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Crf")
        public String crf;

        /**
         * <p>The method of video cropping. Valid values:</p>
         * <ul>
         * <li><strong>border</strong>: automatically detects and removes borders.</li>
         * <li><strong>Value in the format of width:height:left:top</strong>: crops the video image based on the custom settings. Example: 1280:800:0:140.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>border</p>
         */
        @NameInMap("Crop")
        public String crop;

        /**
         * <p>The level of quality control on the video.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Degrain")
        public String degrain;

        /**
         * <p>The frame rate. Default value: the frame rate of the input file. The value is 60 if the frame rate of the input file exceeds 60. Unit: frames per second.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The GOP size. The GOP size can be the maximum interval of keyframes or the maximum number of frames in a frame group. If the maximum interval is specified, the value contains the unit (s). If the maximum number of frames is specified, the value does not contain a unit. Default value: <strong>10s</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10s</p>
         */
        @NameInMap("Gop")
        public String gop;

        /**
         * <p>Indicates whether the HDR2SDR conversion feature is enabled. If this feature is enabled, high dynamic range (HDR) videos are transcoded to standard dynamic range (SDR) videos.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Hdr2sdr")
        public String hdr2sdr;

        /**
         * <p>The height of the video.</p>
         * <ul>
         * <li>Unit: pixel.</li>
         * <li>Default value: the height of the input video.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>Indicates whether the auto-rotate screen feature is enabled. Default value: <strong>false</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The auto-rotate screen feature is enabled.</li>
         * <li><strong>false</strong>: The auto-rotate screen feature is disabled.</li>
         * </ul>
         * <blockquote>
         * <p>If this feature is enabled, the width of the output video corresponds to the long side of the input video, which is the height of the input video in portrait mode. The height of the output video corresponds to the short side of the input video, which is the width of the input video in portrait mode.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LongShortMode")
        public String longShortMode;

        /**
         * <p>The maximum frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("MaxFps")
        public String maxFps;

        /**
         * <p>The maximum bitrate of the video. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Maxrate")
        public String maxrate;

        /**
         * <p>The Narrowband HD settings.</p>
         */
        @NameInMap("NarrowBand")
        public AddTemplateResponseBodyTemplateVideoNarrowBand narrowBand;

        /**
         * <p>The black borders to be added to the video. The value is in the width:height:left:top format.</p>
         * 
         * <strong>example:</strong>
         * <p>1280:800:0:140</p>
         */
        @NameInMap("Pad")
        public String pad;

        /**
         * <p>The pixel format. Standard pixel formats such as yuv420p and yuvj420p are supported. The default pixel format can be <strong>yuv420p</strong> or the pixel format of the input video.</p>
         * 
         * <strong>example:</strong>
         * <p>yuv420p</p>
         */
        @NameInMap("PixFmt")
        public String pixFmt;

        /**
         * <p>The preset video algorithm. Default value: <strong>medium</strong>. Valid values:</p>
         * <ul>
         * <li><strong>veryfast</strong></li>
         * <li><strong>fast</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>slow</strong></li>
         * <li><strong>slower</strong></li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid only if the Codec parameter is set to H.264.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fast</p>
         */
        @NameInMap("Preset")
        public String preset;

        /**
         * <p>The codec profile.</p>
         * <ul>
         * <li><strong>baseline</strong>: suitable for mobile devices</li>
         * <li><strong>main</strong>: suitable for standard-definition devices</li>
         * <li><strong>high</strong>: suitable for high-definition devices</li>
         * <li>Default value: <strong>high</strong>.</li>
         * </ul>
         * <p>If multiple definitions are available, we recommend that you set this parameter to baseline for the lowest definition to ensure normal playback on low-end devices. Set this parameter to main or high for other definitions.</p>
         * <blockquote>
         * <p>This parameter is valid only if the Codec parameter is set to H.264.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The level of the independent denoising algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Qscale")
        public String qscale;

        /**
         * <p>Indicates whether the video stream is deleted.</p>
         * <ul>
         * <li><strong>true</strong>: The video stream is deleted.</li>
         * <li><strong>false</strong>: The video stream is retained.</li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Remove")
        public String remove;

        /**
         * <p>The policy of resolution adjustment.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResoPriority")
        public String resoPriority;

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
         * <li>Default value: the width of the input video.****</li>
         * <li>Unit: pixel.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>256</p>
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

        public AddTemplateResponseBodyTemplateVideo setHdr2sdr(String hdr2sdr) {
            this.hdr2sdr = hdr2sdr;
            return this;
        }
        public String getHdr2sdr() {
            return this.hdr2sdr;
        }

        public AddTemplateResponseBodyTemplateVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public AddTemplateResponseBodyTemplateVideo setLongShortMode(String longShortMode) {
            this.longShortMode = longShortMode;
            return this;
        }
        public String getLongShortMode() {
            return this.longShortMode;
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

        public AddTemplateResponseBodyTemplateVideo setNarrowBand(AddTemplateResponseBodyTemplateVideoNarrowBand narrowBand) {
            this.narrowBand = narrowBand;
            return this;
        }
        public AddTemplateResponseBodyTemplateVideoNarrowBand getNarrowBand() {
            return this.narrowBand;
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
        /**
         * <p>The audio codec configurations.</p>
         */
        @NameInMap("Audio")
        public AddTemplateResponseBodyTemplateAudio audio;

        /**
         * <p>The container format settings.</p>
         */
        @NameInMap("Container")
        public AddTemplateResponseBodyTemplateContainer container;

        /**
         * <p>The ID of the transcoding template. We recommend that you keep this ID for subsequent operation calls.</p>
         * 
         * <strong>example:</strong>
         * <p>16f01ad6175e4230ac42bb5182cd****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The transmuxing settings.</p>
         */
        @NameInMap("MuxConfig")
        public AddTemplateResponseBodyTemplateMuxConfig muxConfig;

        /**
         * <p>The name of the transcoding template.</p>
         * 
         * <strong>example:</strong>
         * <p>mps-example</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the template. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The template is normal.</li>
         * <li><strong>Deleted</strong>: The template is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The general transcoding settings.</p>
         */
        @NameInMap("TransConfig")
        public AddTemplateResponseBodyTemplateTransConfig transConfig;

        /**
         * <p>The video codec configurations.</p>
         */
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
