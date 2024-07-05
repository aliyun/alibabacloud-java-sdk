// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SearchTemplateResponseBody extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BC860F04-778A-472F-AB39-E1BF329C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The transcoding templates.</p>
     */
    @NameInMap("TemplateList")
    public SearchTemplateResponseBodyTemplateList templateList;

    /**
     * <p>The total number of search results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static SearchTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTemplateResponseBody self = new SearchTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTemplateResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
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

    public SearchTemplateResponseBody setTemplateList(SearchTemplateResponseBodyTemplateList templateList) {
        this.templateList = templateList;
        return this;
    }
    public SearchTemplateResponseBodyTemplateList getTemplateList() {
        return this.templateList;
    }

    public SearchTemplateResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class SearchTemplateResponseBodyTemplateListTemplateAudio extends TeaModel {
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
         * <p>The strength of the independent denoising algorithm. Valid values: <strong>[1,9]</strong>.</p>
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

        public static SearchTemplateResponseBodyTemplateListTemplateAudio build(java.util.Map<String, ?> map) throws Exception {
            SearchTemplateResponseBodyTemplateListTemplateAudio self = new SearchTemplateResponseBodyTemplateListTemplateAudio();
            return TeaModel.build(map, self);
        }

        public SearchTemplateResponseBodyTemplateListTemplateAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SearchTemplateResponseBodyTemplateListTemplateAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public SearchTemplateResponseBodyTemplateListTemplateAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public SearchTemplateResponseBodyTemplateListTemplateAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SearchTemplateResponseBodyTemplateListTemplateAudio setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public SearchTemplateResponseBodyTemplateListTemplateAudio setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public SearchTemplateResponseBodyTemplateListTemplateAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

    }

    public static class SearchTemplateResponseBodyTemplateListTemplateContainer extends TeaModel {
        /**
         * <p>The format of the container. Valid values:</p>
         * <ul>
         * <li><strong>flv</strong></li>
         * <li><strong>mp4</strong></li>
         * <li><strong>ts</strong></li>
         * <li><strong>m3u8</strong></li>
         * <li><strong>gif</strong></li>
         * <li><strong>mp3</strong></li>
         * <li><strong>ogg</strong></li>
         * <li><strong>flac</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
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

    public static class SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif extends TeaModel {
        /**
         * <p>The color dithering algorithm of the palette. Valid values: sierra and bayer.</p>
         * 
         * <strong>example:</strong>
         * <p>sierra</p>
         */
        @NameInMap("DitherMode")
        public String ditherMode;

        /**
         * <p>The duration for which the final frame is paused. Unit: centisecond.</p>
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

        public static SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif build(java.util.Map<String, ?> map) throws Exception {
            SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif self = new SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif();
            return TeaModel.build(map, self);
        }

        public SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif setDitherMode(String ditherMode) {
            this.ditherMode = ditherMode;
            return this;
        }
        public String getDitherMode() {
            return this.ditherMode;
        }

        public SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif setFinalDelay(String finalDelay) {
            this.finalDelay = finalDelay;
            return this;
        }
        public String getFinalDelay() {
            return this.finalDelay;
        }

        public SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif setIsCustomPalette(String isCustomPalette) {
            this.isCustomPalette = isCustomPalette;
            return this;
        }
        public String getIsCustomPalette() {
            return this.isCustomPalette;
        }

        public SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

    }

    public static class SearchTemplateResponseBodyTemplateListTemplateMuxConfigSegment extends TeaModel {
        /**
         * <p>The length of the segment. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        /**
         * <p>The transmuxing configurations for GIF.</p>
         */
        @NameInMap("Gif")
        public SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif gif;

        /**
         * <p>The segment configurations.</p>
         */
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

    public static class SearchTemplateResponseBodyTemplateListTemplateTransConfig extends TeaModel {
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
         * <li>If this parameter is empty and the codec of the output audio is different from that of the input audio, the default value is false.</li>
         * <li>If this parameter is empty and the codec of the output audio is the same as that of the input audio, the default value is true.</li>
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

        public static SearchTemplateResponseBodyTemplateListTemplateTransConfig build(java.util.Map<String, ?> map) throws Exception {
            SearchTemplateResponseBodyTemplateListTemplateTransConfig self = new SearchTemplateResponseBodyTemplateListTemplateTransConfig();
            return TeaModel.build(map, self);
        }

        public SearchTemplateResponseBodyTemplateListTemplateTransConfig setAdjDarMethod(String adjDarMethod) {
            this.adjDarMethod = adjDarMethod;
            return this;
        }
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        public SearchTemplateResponseBodyTemplateListTemplateTransConfig setIsCheckAudioBitrate(String isCheckAudioBitrate) {
            this.isCheckAudioBitrate = isCheckAudioBitrate;
            return this;
        }
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        public SearchTemplateResponseBodyTemplateListTemplateTransConfig setIsCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
            this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
            return this;
        }
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

        public SearchTemplateResponseBodyTemplateListTemplateTransConfig setIsCheckReso(String isCheckReso) {
            this.isCheckReso = isCheckReso;
            return this;
        }
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        public SearchTemplateResponseBodyTemplateListTemplateTransConfig setIsCheckResoFail(String isCheckResoFail) {
            this.isCheckResoFail = isCheckResoFail;
            return this;
        }
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        public SearchTemplateResponseBodyTemplateListTemplateTransConfig setIsCheckVideoBitrate(String isCheckVideoBitrate) {
            this.isCheckVideoBitrate = isCheckVideoBitrate;
            return this;
        }
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        public SearchTemplateResponseBodyTemplateListTemplateTransConfig setIsCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
            this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
            return this;
        }
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        public SearchTemplateResponseBodyTemplateListTemplateTransConfig setTransMode(String transMode) {
            this.transMode = transMode;
            return this;
        }
        public String getTransMode() {
            return this.transMode;
        }

    }

    public static class SearchTemplateResponseBodyTemplateListTemplateVideoBitrateBnd extends TeaModel {
        /**
         * <p>The upper limit of the total bitrate. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Max")
        public String max;

        /**
         * <p>The lower limit of the total bitrate. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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

    public static class SearchTemplateResponseBodyTemplateListTemplateVideoNarrowBand extends TeaModel {
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

        public static SearchTemplateResponseBodyTemplateListTemplateVideoNarrowBand build(java.util.Map<String, ?> map) throws Exception {
            SearchTemplateResponseBodyTemplateListTemplateVideoNarrowBand self = new SearchTemplateResponseBodyTemplateListTemplateVideoNarrowBand();
            return TeaModel.build(map, self);
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideoNarrowBand setAbrmax(Float abrmax) {
            this.abrmax = abrmax;
            return this;
        }
        public Float getAbrmax() {
            return this.abrmax;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideoNarrowBand setMaxAbrRatio(Float maxAbrRatio) {
            this.maxAbrRatio = maxAbrRatio;
            return this;
        }
        public Float getMaxAbrRatio() {
            return this.maxAbrRatio;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideoNarrowBand setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class SearchTemplateResponseBodyTemplateListTemplateVideo extends TeaModel {
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
        public SearchTemplateResponseBodyTemplateListTemplateVideoBitrateBnd bitrateBnd;

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
         * <p>The codec.</p>
         * <ul>
         * <li>Valid values: H.264 and H.265.</li>
         * <li>Default value: <strong>H.264</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>H.264</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The constant rate factor.</p>
         * <ul>
         * <li>Default value when the value of Codec is H.264: <strong>23</strong>, default value when the value of Codec is H.265: <strong>26</strong>.</li>
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
         * <li><strong>Value in the width:height:left:top format</strong>: crops the video image based on the custom settings. Format: width:height:left:top. Example: 1280:800:0:140.</li>
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
         * <p>The frame rate of the video.</p>
         * <ul>
         * <li>The value is 60 if the frame rate of the input video exceeds 60.</li>
         * <li>Default value: <strong>the frame rate of the input video</strong>.</li>
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
        public SearchTemplateResponseBodyTemplateListTemplateVideoNarrowBand narrowBand;

        /**
         * <p>The black bars that are added to the video.</p>
         * <ul>
         * <li>Format: width:height:left:top.</li>
         * <li>Example: 1280:800:0:140.</li>
         * </ul>
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
         * <p>medium</p>
         */
        @NameInMap("Preset")
        public String preset;

        /**
         * <p>The codec profile. Valid values:</p>
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
         * <p>The policy of resolution adjustment.</p>
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
         * <li>Valid values: <strong>[128,4096]</strong>.</li>
         * <li>Unit: pixel.</li>
         * <li>Default value: <strong>the width of the input video</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        @NameInMap("Width")
        public String width;

        public static SearchTemplateResponseBodyTemplateListTemplateVideo build(java.util.Map<String, ?> map) throws Exception {
            SearchTemplateResponseBodyTemplateListTemplateVideo self = new SearchTemplateResponseBodyTemplateListTemplateVideo();
            return TeaModel.build(map, self);
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setBitrateBnd(SearchTemplateResponseBodyTemplateListTemplateVideoBitrateBnd bitrateBnd) {
            this.bitrateBnd = bitrateBnd;
            return this;
        }
        public SearchTemplateResponseBodyTemplateListTemplateVideoBitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setDegrain(String degrain) {
            this.degrain = degrain;
            return this;
        }
        public String getDegrain() {
            return this.degrain;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setHdr2sdr(String hdr2sdr) {
            this.hdr2sdr = hdr2sdr;
            return this;
        }
        public String getHdr2sdr() {
            return this.hdr2sdr;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setLongShortMode(String longShortMode) {
            this.longShortMode = longShortMode;
            return this;
        }
        public String getLongShortMode() {
            return this.longShortMode;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setMaxFps(String maxFps) {
            this.maxFps = maxFps;
            return this;
        }
        public String getMaxFps() {
            return this.maxFps;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setNarrowBand(SearchTemplateResponseBodyTemplateListTemplateVideoNarrowBand narrowBand) {
            this.narrowBand = narrowBand;
            return this;
        }
        public SearchTemplateResponseBodyTemplateListTemplateVideoNarrowBand getNarrowBand() {
            return this.narrowBand;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setRemove(String remove) {
            this.remove = remove;
            return this;
        }
        public String getRemove() {
            return this.remove;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setResoPriority(String resoPriority) {
            this.resoPriority = resoPriority;
            return this;
        }
        public String getResoPriority() {
            return this.resoPriority;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public SearchTemplateResponseBodyTemplateListTemplateVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SearchTemplateResponseBodyTemplateListTemplate extends TeaModel {
        /**
         * <p>The audio codec configurations.</p>
         */
        @NameInMap("Audio")
        public SearchTemplateResponseBodyTemplateListTemplateAudio audio;

        /**
         * <p>The container format configurations.</p>
         */
        @NameInMap("Container")
        public SearchTemplateResponseBodyTemplateListTemplateContainer container;

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
        public SearchTemplateResponseBodyTemplateListTemplateMuxConfig muxConfig;

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
        public SearchTemplateResponseBodyTemplateListTemplateTransConfig transConfig;

        /**
         * <p>The video codec configurations.</p>
         */
        @NameInMap("Video")
        public SearchTemplateResponseBodyTemplateListTemplateVideo video;

        public static SearchTemplateResponseBodyTemplateListTemplate build(java.util.Map<String, ?> map) throws Exception {
            SearchTemplateResponseBodyTemplateListTemplate self = new SearchTemplateResponseBodyTemplateListTemplate();
            return TeaModel.build(map, self);
        }

        public SearchTemplateResponseBodyTemplateListTemplate setAudio(SearchTemplateResponseBodyTemplateListTemplateAudio audio) {
            this.audio = audio;
            return this;
        }
        public SearchTemplateResponseBodyTemplateListTemplateAudio getAudio() {
            return this.audio;
        }

        public SearchTemplateResponseBodyTemplateListTemplate setContainer(SearchTemplateResponseBodyTemplateListTemplateContainer container) {
            this.container = container;
            return this;
        }
        public SearchTemplateResponseBodyTemplateListTemplateContainer getContainer() {
            return this.container;
        }

        public SearchTemplateResponseBodyTemplateListTemplate setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SearchTemplateResponseBodyTemplateListTemplate setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
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

        public SearchTemplateResponseBodyTemplateListTemplate setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SearchTemplateResponseBodyTemplateListTemplate setTransConfig(SearchTemplateResponseBodyTemplateListTemplateTransConfig transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public SearchTemplateResponseBodyTemplateListTemplateTransConfig getTransConfig() {
            return this.transConfig;
        }

        public SearchTemplateResponseBodyTemplateListTemplate setVideo(SearchTemplateResponseBodyTemplateListTemplateVideo video) {
            this.video = video;
            return this;
        }
        public SearchTemplateResponseBodyTemplateListTemplateVideo getVideo() {
            return this.video;
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
