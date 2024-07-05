// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryTemplateListResponseBody extends TeaModel {
    /**
     * <p>The IDs of the templates that do not exist. This parameter is not returned if all specified transcoding templates are found.</p>
     */
    @NameInMap("NonExistTids")
    public QueryTemplateListResponseBodyNonExistTids nonExistTids;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BC860F04-778A-472F-AB39-E1BF329C1EA8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The transcoding templates.</p>
     */
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

    public static class QueryTemplateListResponseBodyTemplateListTemplateAudioVolume extends TeaModel {
        /**
         * <p>The output volume.</p>
         * <ul>
         * <li>This parameter takes effect only if the value of Method is dynamic.</li>
         * <li>Unit: dB.</li>
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
         * <li>Unit: dB.</li>
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
         * <p>The range of the volume relative to the output volume.</p>
         * <ul>
         * <li>This parameter takes effect only if the value of Method is dynamic.</li>
         * <li>Unit: dB.</li>
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
         * <p>The method that is used to adjust the volume. Valid values:</p>
         * <ul>
         * <li><strong>auto</strong></li>
         * <li><strong>dynamic</strong></li>
         * <li><strong>linear</strong></li>
         * <li>Default value: dynamic.</li>
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
         * <li>Unit: dB.</li>
         * <li>Valid values: [-9,0].</li>
         * <li>Default value: -1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("TruePeak")
        public String truePeak;

        public static QueryTemplateListResponseBodyTemplateListTemplateAudioVolume build(java.util.Map<String, ?> map) throws Exception {
            QueryTemplateListResponseBodyTemplateListTemplateAudioVolume self = new QueryTemplateListResponseBodyTemplateListTemplateAudioVolume();
            return TeaModel.build(map, self);
        }

        public QueryTemplateListResponseBodyTemplateListTemplateAudioVolume setIntegratedLoudnessTarget(String integratedLoudnessTarget) {
            this.integratedLoudnessTarget = integratedLoudnessTarget;
            return this;
        }
        public String getIntegratedLoudnessTarget() {
            return this.integratedLoudnessTarget;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateAudioVolume setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateAudioVolume setLoudnessRangeTarget(String loudnessRangeTarget) {
            this.loudnessRangeTarget = loudnessRangeTarget;
            return this;
        }
        public String getLoudnessRangeTarget() {
            return this.loudnessRangeTarget;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateAudioVolume setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateAudioVolume setPeakLevel(String peakLevel) {
            this.peakLevel = peakLevel;
            return this;
        }
        public String getPeakLevel() {
            return this.peakLevel;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateAudioVolume setTruePeak(String truePeak) {
            this.truePeak = truePeak;
            return this;
        }
        public String getTruePeak() {
            return this.truePeak;
        }

    }

    public static class QueryTemplateListResponseBodyTemplateListTemplateAudio extends TeaModel {
        /**
         * <p>The audio bitrate of the output file.</p>
         * <ul>
         * <li>Valid values: <strong>[8,1000]</strong>.</li>
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
         * <p>The codec profile of the audio. Valid values when the value of Codec is aac:</p>
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
         * <p>The strength of the independent denoising algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Qscale")
        public String qscale;

        /**
         * <p>Indicates whether the audio stream is deleted. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Remove")
        public String remove;

        /**
         * <p>The sampling rate.</p>
         * <ul>
         * <li>Unit: Hz</li>
         * <li>Default value: <strong>44100</strong>.</li>
         * </ul>
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
        public QueryTemplateListResponseBodyTemplateListTemplateAudioVolume volume;

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

        public QueryTemplateListResponseBodyTemplateListTemplateAudio setVolume(QueryTemplateListResponseBodyTemplateListTemplateAudioVolume volume) {
            this.volume = volume;
            return this;
        }
        public QueryTemplateListResponseBodyTemplateListTemplateAudioVolume getVolume() {
            return this.volume;
        }

    }

    public static class QueryTemplateListResponseBodyTemplateListTemplateContainer extends TeaModel {
        /**
         * <p>The format of the container. Valid values: flv, mp4, ts, m3u8, gif, mp3, ogg, and flac.</p>
         * 
         * <strong>example:</strong>
         * <p>flv</p>
         */
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
        /**
         * <p>The color dithering algorithm of the palette. Valid values: sierra and bayer.</p>
         * 
         * <strong>example:</strong>
         * <p>sierra</p>
         */
        @NameInMap("DitherMode")
        public String ditherMode;

        /**
         * <p>The duration for which the final frame is paused.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FinalDelay")
        public String finalDelay;

        /**
         * <p>Indicates whether a custom palette is used.</p>
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
        /**
         * <p>The length of the segment. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        /**
         * <p>The loop count.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <p>The transmuxing configurations for GIF.</p>
         */
        @NameInMap("Gif")
        public QueryTemplateListResponseBodyTemplateListTemplateMuxConfigGif gif;

        /**
         * <p>The segment configurations.</p>
         */
        @NameInMap("Segment")
        public QueryTemplateListResponseBodyTemplateListTemplateMuxConfigSegment segment;

        /**
         * <p>The transmuxing configurations for WebP.</p>
         */
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
        /**
         * <p>The method of resolution adjustment. Default value: <strong>none</strong>. Valid values:</p>
         * <ul>
         * <li>rescale</li>
         * <li>crop</li>
         * <li>none</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("AdjDarMethod")
        public String adjDarMethod;

        /**
         * <p>Indicates whether the audio bitrate is checked. If the bitrate of the output audio is higher than that of the input audio, the input bitrate is retained and the specified audio bitrate does not take effect. This parameter has a lower priority than IsCheckAudioBitrateFail. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
         * </li>
         * <li><p>Default value:</p>
         * <ul>
         * <li>If this parameter is not specified and the codec of the output audio is different from that of the input audio, the default value is false.</li>
         * <li>If this parameter is not specified and the codec of the output audio is the same as that of the input audio, the default value is true.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckAudioBitrate")
        public String isCheckAudioBitrate;

        /**
         * <p>Indicates whether audio bitrate check errors are allowed. This parameter has a greater priority than IsCheckAudioBitrate. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: If the audio bitrate check fails, the input file is not transcoded.</li>
         * <li><strong>false</strong>: The audio bitrate is not checked.</li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckAudioBitrateFail")
        public String isCheckAudioBitrateFail;

        /**
         * <p>Indicates whether the resolution is checked. If the output resolution is higher than the input resolution based on the width or height, the input resolution is retained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckReso")
        public String isCheckReso;

        /**
         * <p>Indicates whether the resolution is checked. If the output resolution is higher than the input resolution based on the width or height, a transcoding failure is returned. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckResoFail")
        public String isCheckResoFail;

        /**
         * <p>Indicates whether the video bitrate is checked. If the bitrate of the output video is higher than that of the input video, the input bitrate is retained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckVideoBitrate")
        public String isCheckVideoBitrate;

        /**
         * <p>Indicates whether video bitrate check errors are allowed. This parameter has a higher priority than IsCheckVideoBitrate. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: If the video bitrate check fails, the input file is not transcoded.</li>
         * <li><strong>false</strong>: The video bitrate is not checked.</li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckVideoBitrateFail")
        public String isCheckVideoBitrateFail;

        /**
         * <p>The transcoding mode. Default value: <strong>onepass</strong>. Valid values:</p>
         * <ul>
         * <li><strong>onepass</strong></li>
         * <li><strong>twopass</strong></li>
         * <li><strong>CBR</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>onepass</p>
         */
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
        /**
         * <p>The upper limit of the total bitrate. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Max")
        public String max;

        /**
         * <p>The lower limit of the total bitrate. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
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

    public static class QueryTemplateListResponseBodyTemplateListTemplateVideoNarrowBand extends TeaModel {
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

        public static QueryTemplateListResponseBodyTemplateListTemplateVideoNarrowBand build(java.util.Map<String, ?> map) throws Exception {
            QueryTemplateListResponseBodyTemplateListTemplateVideoNarrowBand self = new QueryTemplateListResponseBodyTemplateListTemplateVideoNarrowBand();
            return TeaModel.build(map, self);
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideoNarrowBand setAbrmax(Float abrmax) {
            this.abrmax = abrmax;
            return this;
        }
        public Float getAbrmax() {
            return this.abrmax;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideoNarrowBand setMaxAbrRatio(Float maxAbrRatio) {
            this.maxAbrRatio = maxAbrRatio;
            return this;
        }
        public Float getMaxAbrRatio() {
            return this.maxAbrRatio;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideoNarrowBand setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryTemplateListResponseBodyTemplateListTemplateVideo extends TeaModel {
        /**
         * <p>The average bitrate of the video. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The average bitrate range of the video.</p>
         */
        @NameInMap("BitrateBnd")
        public QueryTemplateListResponseBodyTemplateListTemplateVideoBitrateBnd bitrateBnd;

        /**
         * <p>The buffer size.</p>
         * <ul>
         * <li>Unit: KB.</li>
         * <li>Default value: <strong>6000</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6000</p>
         */
        @NameInMap("Bufsize")
        public String bufsize;

        /**
         * <p>The codec. Default value: <strong>H.264</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>H.264</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The constant rate factor.</p>
         * <ul>
         * <li>Default value when the encoding format is H.264: <strong>23</strong>. Default value when the encoding format is H.265: <strong>26</strong>.</li>
         * <li>If this parameter is set, the value of Bitrate becomes invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Crf")
        public String crf;

        /**
         * <p>The method of video cropping. Valid values:</p>
         * <ul>
         * <li><strong>border</strong>: automatically detects and removes black bars.</li>
         * <li><strong>Value in the width:height:left:top format</strong>: crops the video based on custom settings. Format: width:height:left:top. Example: 1280:800:0:140.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>border</p>
         */
        @NameInMap("Crop")
        public String crop;

        /**
         * <p>The level of video quality control.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Degrain")
        public String degrain;

        /**
         * <p>The frame rate.</p>
         * <ul>
         * <li>The value is 60 if the frame rate of the input file exceeds 60.</li>
         * <li>Default value: <strong>the frame rate of the input file</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The maximum number of frames between two keyframes. Default value: <strong>250</strong>.</p>
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
         * <p>The height of the video.</p>
         * <ul>
         * <li>Unit: pixel.</li>
         * <li>Default value: <strong>the height of the input video</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>Indicates whether the auto-rotate screen feature is enabled.</p>
         * <ul>
         * <li>If this feature is enabled, the width of the output video corresponds to the long side of the input video, which is the height of the input video in portrait mode. The height of the output video corresponds to the short side of the input video, which is the width of the input video in portrait mode. Valid values:</li>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
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
        public QueryTemplateListResponseBodyTemplateListTemplateVideoNarrowBand narrowBand;

        /**
         * <p>The black bars that are added to the video. Format: width:height:left:top. Example: 1280:800:0:140.</p>
         * 
         * <strong>example:</strong>
         * <p>1280:800:0:140</p>
         */
        @NameInMap("Pad")
        public String pad;

        /**
         * <p>The pixel format of the video. Valid values: standard pixel formats such as yuv420p and yuvj420p.</p>
         * 
         * <strong>example:</strong>
         * <p>yuv420p</p>
         */
        @NameInMap("PixFmt")
        public String pixFmt;

        /**
         * <p>The preset video algorithm. Valid values: veryfast, fast, medium, slow, and slower. Default value: <strong>medium</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("Preset")
        public String preset;

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
         * <p>high</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The strength of the independent denoising algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Qscale")
        public String qscale;

        /**
         * <p>Indicates whether the video stream is deleted. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Remove")
        public String remove;

        /**
         * <p>The policy of resolution adjustment. Valid values: cropFirst, widthFirst, and heightFirst.</p>
         * 
         * <strong>example:</strong>
         * <p>heightFirst</p>
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
         * <li>Unit: pixel.</li>
         * <li>Default value: <strong>the width of the input video</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
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

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setHdr2sdr(String hdr2sdr) {
            this.hdr2sdr = hdr2sdr;
            return this;
        }
        public String getHdr2sdr() {
            return this.hdr2sdr;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setLongShortMode(String longShortMode) {
            this.longShortMode = longShortMode;
            return this;
        }
        public String getLongShortMode() {
            return this.longShortMode;
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

        public QueryTemplateListResponseBodyTemplateListTemplateVideo setNarrowBand(QueryTemplateListResponseBodyTemplateListTemplateVideoNarrowBand narrowBand) {
            this.narrowBand = narrowBand;
            return this;
        }
        public QueryTemplateListResponseBodyTemplateListTemplateVideoNarrowBand getNarrowBand() {
            return this.narrowBand;
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
        /**
         * <p>The audio codec configurations.</p>
         */
        @NameInMap("Audio")
        public QueryTemplateListResponseBodyTemplateListTemplateAudio audio;

        /**
         * <p>The container format configurations.</p>
         */
        @NameInMap("Container")
        public QueryTemplateListResponseBodyTemplateListTemplateContainer container;

        /**
         * <p>The time when the template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-04T06:44:43Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The transcoding template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16f01ad6175e4230ac42bb5182cd****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The transmuxing configurations.</p>
         */
        @NameInMap("MuxConfig")
        public QueryTemplateListResponseBodyTemplateListTemplateMuxConfig muxConfig;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>MPS-example</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the template. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong></li>
         * <li><strong>Deleted</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The general transcoding configurations.</p>
         */
        @NameInMap("TransConfig")
        public QueryTemplateListResponseBodyTemplateListTemplateTransConfig transConfig;

        /**
         * <p>The video codec configurations.</p>
         */
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

        public QueryTemplateListResponseBodyTemplateListTemplate setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
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
