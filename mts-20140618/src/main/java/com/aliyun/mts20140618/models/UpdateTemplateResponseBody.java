// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateTemplateResponseBody extends TeaModel {
    /**
     * <p>The type of the transcoding template.</p>
     * 
     * <strong>example:</strong>
     * <p>5E4FB22E-B9EA-4E24-8FFC-B407EA71QW21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The type of the transcoding template.</p>
     */
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

    public static class UpdateTemplateResponseBodyTemplateAudioVolume extends TeaModel {
        /**
         * <p>The expected volume.</p>
         * <ul>
         * <li>This parameter takes effect only if the value of Method is dynamic.</li>
         * <li>Unit: decibel.</li>
         * <li>Valid values: [-70,-5].</li>
         * <li>Default value: -6.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-6</p>
         */
        @NameInMap("IntegratedLoudnessTarget")
        public String integratedLoudnessTarget;

        /**
         * <p>The increased volume relative to the volume of the input audio.</p>
         * <ul>
         * <li>This parameter takes effect only if the value of Method is linear.</li>
         * <li>Unit: decibel.</li>
         * <li>Valid values: less than or equal to 20.</li>
         * <li>Default value: -20.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-20</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The range of the volume relative to the expected volume.</p>
         * <ul>
         * <li>This parameter takes effect only if the value of Method is dynamic.</li>
         * <li>Unit: decibel.</li>
         * <li>Valid values: [1,20].</li>
         * <li>Default value: 8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("LoudnessRangeTarget")
        public String loudnessRangeTarget;

        /**
         * <p>The volume adjustment method. Valid values:</p>
         * <ul>
         * <li><strong>auto</strong></li>
         * <li><strong>dynamic</strong></li>
         * <li><strong>linear</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The volume adjustment coefficient.</p>
         * <p>This parameter takes effect only if the value of Method is adaptive.</p>
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
         * <ul>
         * <li>This parameter takes effect only if the value of Method is dynamic.</li>
         * <li>Unit: decibel.</li>
         * <li>Valid values: [-9,0].</li>
         * <li>Default value: -1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("TruePeak")
        public String truePeak;

        public static UpdateTemplateResponseBodyTemplateAudioVolume build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateResponseBodyTemplateAudioVolume self = new UpdateTemplateResponseBodyTemplateAudioVolume();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateResponseBodyTemplateAudioVolume setIntegratedLoudnessTarget(String integratedLoudnessTarget) {
            this.integratedLoudnessTarget = integratedLoudnessTarget;
            return this;
        }
        public String getIntegratedLoudnessTarget() {
            return this.integratedLoudnessTarget;
        }

        public UpdateTemplateResponseBodyTemplateAudioVolume setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public UpdateTemplateResponseBodyTemplateAudioVolume setLoudnessRangeTarget(String loudnessRangeTarget) {
            this.loudnessRangeTarget = loudnessRangeTarget;
            return this;
        }
        public String getLoudnessRangeTarget() {
            return this.loudnessRangeTarget;
        }

        public UpdateTemplateResponseBodyTemplateAudioVolume setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public UpdateTemplateResponseBodyTemplateAudioVolume setPeakLevel(String peakLevel) {
            this.peakLevel = peakLevel;
            return this;
        }
        public String getPeakLevel() {
            return this.peakLevel;
        }

        public UpdateTemplateResponseBodyTemplateAudioVolume setTruePeak(String truePeak) {
            this.truePeak = truePeak;
            return this;
        }
        public String getTruePeak() {
            return this.truePeak;
        }

    }

    public static class UpdateTemplateResponseBodyTemplateAudio extends TeaModel {
        /**
         * <p>The ID of the transcoding template.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The audio bitrate of the output file.</p>
         * <ul>
         * <li>Valid values: 8 to 1000.****</li>
         * <li>Unit: Kbit/s.</li>
         * <li>Default value: <strong>128</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <p>The sampling rate.</p>
         * <ul>
         * <li>Unit: Hz.</li>
         * <li>Default value: <strong>44100</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aac</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>Indicates whether the audio stream is deleted.</p>
         * <ul>
         * <li><strong>true</strong>: The audio stream is deleted.</li>
         * <li><strong>false</strong>: The audio stream is retained.</li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aac_low</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The number of sound channels. Default value: <strong>2</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Qscale")
        public String qscale;

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
         * <p>false</p>
         */
        @NameInMap("Remove")
        public String remove;

        /**
         * <p>The level of the independent denoising algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("Samplerate")
        public String samplerate;

        /**
         * <p>The volume control configurations.</p>
         */
        @NameInMap("Volume")
        public UpdateTemplateResponseBodyTemplateAudioVolume volume;

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

        public UpdateTemplateResponseBodyTemplateAudio setVolume(UpdateTemplateResponseBodyTemplateAudioVolume volume) {
            this.volume = volume;
            return this;
        }
        public UpdateTemplateResponseBodyTemplateAudioVolume getVolume() {
            return this.volume;
        }

    }

    public static class UpdateTemplateResponseBodyTemplateContainer extends TeaModel {
        /**
         * <p>The container format.</p>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
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
        /**
         * <p>The loop count.</p>
         * 
         * <strong>example:</strong>
         * <p>bayer</p>
         */
        @NameInMap("DitherMode")
        public String ditherMode;

        /**
         * <p>The color dithering algorithm of the palette. Valid values: sierra and bayer.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FinalDelay")
        public String finalDelay;

        /**
         * <p>The segment configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsCustomPalette")
        public String isCustomPalette;

        /**
         * <p>Indicates whether the custom palette is used.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        /**
         * <p>The transmuxing configurations for GIF.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <p>The duration for which the final frame is paused. Unit: milliseconds.</p>
         */
        @NameInMap("Gif")
        public UpdateTemplateResponseBodyTemplateMuxConfigGif gif;

        /**
         * <p>The length of the segment. Unit: seconds.</p>
         */
        @NameInMap("Segment")
        public UpdateTemplateResponseBodyTemplateMuxConfigSegment segment;

        /**
         * <p>The loop count.</p>
         */
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
        /**
         * <p>Indicates whether the video bitrate is checked. If this parameter is set to true and the system detects that the video bitrate of the output file is greater than that of the input file, the video bitrate of the input file is retained after transcoding. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The video bitrate is checked.</li>
         * <li><strong>false</strong>: The video bitrate is not checked.</li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("AdjDarMethod")
        public String adjDarMethod;

        /**
         * <p>The transcoding mode. Default value: <strong>onepass</strong>. Valid values:</p>
         * <ul>
         * <li><strong>onepass</strong></li>
         * <li><strong>twopass</strong></li>
         * <li><strong>CBR</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckAudioBitrate")
        public String isCheckAudioBitrate;

        /**
         * <p>The status of the template. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The template is normal.</li>
         * <li><strong>Deleted</strong>: The template is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckAudioBitrateFail")
        public String isCheckAudioBitrateFail;

        /**
         * <p>Indicates whether the video bitrate is checked. This parameter has a higher priority than the IsCheckVideoBitrate parameter. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The video bitrate is checked</li>
         * <li><strong>false</strong>: The video bitrate is not checked.</li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckReso")
        public String isCheckReso;

        /**
         * <p>Indicates whether the audio bitrate is checked. This parameter has a higher priority than the IsCheckAudioBitrate parameter. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The audio bitrate is checked.</li>
         * <li><strong>false</strong>: The audio bitrate is not checked.</li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckResoFail")
        public String isCheckResoFail;

        /**
         * <p>Indicates whether the resolution is checked. If this parameter is set to true and the system detects that the resolution of the output file is higher than that of the input file based on the width or height, an error that indicates a transcoding failure is returned. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The resolution is checked.</li>
         * <li><strong>false</strong>: The resolution is not checked.</li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckVideoBitrate")
        public String isCheckVideoBitrate;

        /**
         * <p>The method of resolution adjustment. Default value: <strong>none</strong>. Valid values:</p>
         * <ul>
         * <li>rescale: The input video is rescaled.</li>
         * <li>crop: The input video is cropped.</li>
         * <li>none: No change is made.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckVideoBitrateFail")
        public String isCheckVideoBitrateFail;

        /**
         * <p>Indicates whether the resolution is checked. If the output resolution is higher than the input resolution based on the width or height, the input resolution is retained after transcoding. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The resolution is checked.</li>
         * <li><strong>false</strong>: The resolution is not checked.</li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>onepass</p>
         */
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
        /**
         * <p>The lower limit of the total bitrate. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Max")
        public String max;

        /**
         * <p>The pixel format. Valid values: standard pixel formats such as yuv420p and yuvj420p.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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

    public static class UpdateTemplateResponseBodyTemplateVideoNarrowBand extends TeaModel {
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

        public static UpdateTemplateResponseBodyTemplateVideoNarrowBand build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateResponseBodyTemplateVideoNarrowBand self = new UpdateTemplateResponseBodyTemplateVideoNarrowBand();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateResponseBodyTemplateVideoNarrowBand setAbrmax(Float abrmax) {
            this.abrmax = abrmax;
            return this;
        }
        public Float getAbrmax() {
            return this.abrmax;
        }

        public UpdateTemplateResponseBodyTemplateVideoNarrowBand setMaxAbrRatio(Float maxAbrRatio) {
            this.maxAbrRatio = maxAbrRatio;
            return this;
        }
        public Float getMaxAbrRatio() {
            return this.maxAbrRatio;
        }

        public UpdateTemplateResponseBodyTemplateVideoNarrowBand setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateTemplateResponseBodyTemplateVideo extends TeaModel {
        /**
         * <p>The maximum bitrate of the video. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The upper limit of the total bitrate. Unit: Kbit/s.</p>
         */
        @NameInMap("BitrateBnd")
        public UpdateTemplateResponseBodyTemplateVideoBitrateBnd bitrateBnd;

        /**
         * <p>The level of quality control on the video.</p>
         * 
         * <strong>example:</strong>
         * <p>6000</p>
         */
        @NameInMap("Bufsize")
        public String bufsize;

        /**
         * <p>The height of the output video.</p>
         * <ul>
         * <li>Unit: pixel.</li>
         * <li>Default value: the height of the input video.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>H.264</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>Indicates whether the video stream is deleted. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The video stream is deleted.</li>
         * <li><strong>false</strong>: The video stream is retained.</li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Crf")
        public String crf;

        /**
         * <p>The average bitrate of the video. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>border</p>
         */
        @NameInMap("Crop")
        public String crop;

        /**
         * <p>The average bitrate range of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Degrain")
        public String degrain;

        /**
         * <p>The preset video algorithm. Default value: <strong>medium</strong>. Valid values:</p>
         * <ul>
         * <li><strong>veryfast</strong></li>
         * <li><strong>fast</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>slow</strong></li>
         * <li><strong>slower</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The width of the video.</p>
         * <ul>
         * <li>Unit: pixel.</li>
         * <li>Default value: <strong>the width of the input video</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The level of the independent denoising algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The size of the buffer.</p>
         * <ul>
         * <li>Unit: KB.</li>
         * <li>Default value: <strong>6000</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LongShortMode")
        public String longShortMode;

        /**
         * <p>The encoding profile. Valid values:</p>
         * <ul>
         * <li><strong>baseline</strong>: applicable to mobile devices.</li>
         * <li><strong>main</strong>: applicable to standard-definition devices.</li>
         * <li><strong>high</strong>: applicable to high-definition devices.</li>
         * <li>Default value: <strong>high</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("MaxFps")
        public String maxFps;

        /**
         * <p>The maximum frame rate.</p>
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
        public UpdateTemplateResponseBodyTemplateVideoNarrowBand narrowBand;

        /**
         * <p>The video codec. Default value: <strong>H.264</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1280:800:0:140</p>
         */
        @NameInMap("Pad")
        public String pad;

        /**
         * <p>The black borders added to the video.</p>
         * <ul>
         * <li>Format: width:height:left:top.</li>
         * <li>Example: 1280:800:0:140.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yuv420p</p>
         */
        @NameInMap("PixFmt")
        public String pixFmt;

        /**
         * <p>The scan mode. Valid values:</p>
         * <ul>
         * <li><strong>interlaced</strong>: An interlaced scan is performed.</li>
         * <li><strong>progressive</strong>: A progressive scan is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("Preset")
        public String preset;

        /**
         * <p>The bitrate quality control factor.</p>
         * <ul>
         * <li>Default value if the Codec parameter is set to H.264: <strong>23</strong>. Default value if the Codec parameter is set to H.265: <strong>26</strong>.</li>
         * <li>If this parameter is returned, the setting of the Bitrate parameter is invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The method used to crop the video.</p>
         * <ul>
         * <li><strong>border</strong>: automatically detects and removes borders.</li>
         * <li>Value in the width:height:left:top format: crops the video based on custom settings.**** Example: 1280:800:0:140.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Qscale")
        public String qscale;

        /**
         * <p>The maximum number of frames between two keyframes. Default value: <strong>250</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Remove")
        public String remove;

        /**
         * <p>The general transcoding configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResoPriority")
        public String resoPriority;

        /**
         * <p>The policy of resolution adjustment.</p>
         * 
         * <strong>example:</strong>
         * <p>interlaced</p>
         */
        @NameInMap("ScanMode")
        public String scanMode;

        /**
         * <p>The frame rate.</p>
         * <ul>
         * <li>A value of 60 is returned if the frame rate of the input video exceeds 60.</li>
         * <li>Default value: the frame rate of the input video.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
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

        public UpdateTemplateResponseBodyTemplateVideo setHdr2sdr(String hdr2sdr) {
            this.hdr2sdr = hdr2sdr;
            return this;
        }
        public String getHdr2sdr() {
            return this.hdr2sdr;
        }

        public UpdateTemplateResponseBodyTemplateVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public UpdateTemplateResponseBodyTemplateVideo setLongShortMode(String longShortMode) {
            this.longShortMode = longShortMode;
            return this;
        }
        public String getLongShortMode() {
            return this.longShortMode;
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

        public UpdateTemplateResponseBodyTemplateVideo setNarrowBand(UpdateTemplateResponseBodyTemplateVideoNarrowBand narrowBand) {
            this.narrowBand = narrowBand;
            return this;
        }
        public UpdateTemplateResponseBodyTemplateVideoNarrowBand getNarrowBand() {
            return this.narrowBand;
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
        /**
         * <p>The audio codec settings.</p>
         */
        @NameInMap("Audio")
        public UpdateTemplateResponseBodyTemplateAudio audio;

        /**
         * <p>The container format.</p>
         */
        @NameInMap("Container")
        public UpdateTemplateResponseBodyTemplateContainer container;

        /**
         * <p>The container configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>16f01ad6175e4230ac42bb5182cd****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The transmuxing configurations for WebP.</p>
         */
        @NameInMap("MuxConfig")
        public UpdateTemplateResponseBodyTemplateMuxConfig muxConfig;

        /**
         * <p>The audio codec configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>MPS-example</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The transmuxing configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>Indicates whether the audio bitrate is checked. If the bitrate of the output audio is greater than the bitrate of the input audio, the bitrate of the input audio is retained after transcoding. In this case, the specified audio bitrate does not take effect. This parameter has a lower priority than the IsCheckAudioBitrateFail parameter. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The audio bitrate is checked.</p>
         * </li>
         * <li><p><strong>false</strong>: The audio bitrate is not checked.</p>
         * </li>
         * <li><p>Default value:</p>
         * <ul>
         * <li>If the parameter is left empty and the codec of the output audio is different from that of the input audio, the default value is false.</li>
         * <li>If the parameter is left empty and the codec of the output audio is the same as that of the input audio, the default value is true.</li>
         * </ul>
         * </li>
         * </ul>
         */
        @NameInMap("TransConfig")
        public UpdateTemplateResponseBodyTemplateTransConfig transConfig;

        /**
         * <p>The video codec configurations.</p>
         */
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
