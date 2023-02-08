// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SearchTemplateResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the custom transcoding templates.</p>
     */
    @NameInMap("TemplateList")
    public SearchTemplateResponseBodyTemplateList templateList;

    /**
     * <p>The total number of entries returned.</p>
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
         * <br>
         * <p>*   Unit: Kbit/s.</p>
         * <p>*   Default value: **128**.</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The number of sound channels. Default value: **2**.</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <p>The audio codec. Default value: **aac**. Valid values:</p>
         * <br>
         * <p>*   **aac**</p>
         * <p>*   **mp3**</p>
         * <p>*   **vorbis**</p>
         * <p>*   **flac**</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The codec profile of the audio. Valid values when the Codec parameter is set to aac:</p>
         * <br>
         * <p>*   **aac_low**</p>
         * <p>*   **aac_he**</p>
         * <p>*   **aac_he_v2**</p>
         * <p>*   **aac_ld**</p>
         * <p>*   **aac_eld**</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The strength of the independent noise reduction algorithm. Valid values: **\[1, 9]**.</p>
         */
        @NameInMap("Qscale")
        public String qscale;

        /**
         * <p>Indicates whether to delete the audio stream.</p>
         * <br>
         * <p>*   **true**: The audio stream is deleted.</p>
         * <p>*   **false**: The audio stream is retained.</p>
         * <p>*   Default value: **false**.</p>
         */
        @NameInMap("Remove")
        public String remove;

        /**
         * <p>The sampling rate.</p>
         * <br>
         * <p>*   Unit: Hz.</p>
         * <p>*   Default value: **44100**.</p>
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
         * <p>The container format. Valid values:</p>
         * <br>
         * <p>*   **flv**</p>
         * <p>*   **mp4**</p>
         * <p>*   **ts**</p>
         * <p>*   **m3u8**</p>
         * <p>*   **gif**</p>
         * <p>*   **mp3**</p>
         * <p>*   **ogg**</p>
         * <p>*   **flac**</p>
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
         */
        @NameInMap("DitherMode")
        public String ditherMode;

        /**
         * <p>The duration for which the final frame is paused. Unit: centiseconds.</p>
         */
        @NameInMap("FinalDelay")
        public String finalDelay;

        /**
         * <p>Indicates whether the custom palette is used.</p>
         */
        @NameInMap("IsCustomPalette")
        public String isCustomPalette;

        /**
         * <p>The loop count.</p>
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
         * <p>The transmuxing configuration for GIF.</p>
         */
        @NameInMap("Gif")
        public SearchTemplateResponseBodyTemplateListTemplateMuxConfigGif gif;

        /**
         * <p>The segment configuration.</p>
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
         * <p>The method of resolution adjustment. Default value: **none**. Valid values:</p>
         * <br>
         * <p>*   rescale: The input video is rescaled.</p>
         * <p>*   crop: The input video is cropped.</p>
         * <p>*   none: No change is made.</p>
         */
        @NameInMap("AdjDarMethod")
        public String adjDarMethod;

        /**
         * <p>Indicates whether to check the audio bitrate.</p>
         * <br>
         * <p>*   If this feature is enabled and the system detects that the audio bitrate of the output file is greater than that of the input file, the audio bitrate of the input file is retained after transcoding.</p>
         * <p>*   **true**: The audio bitrate is checked.</p>
         * <p>*   **false**: The audio bitrate is not checked.</p>
         * <p>*   Default value: **false**.</p>
         */
        @NameInMap("IsCheckAudioBitrate")
        public String isCheckAudioBitrate;

        /**
         * <p>Indicates whether to allow audio bitrate check errors.</p>
         * <br>
         * <p>*   **true**: If the audio bitrate check fails, the input file is not transcoded.</p>
         * <p>*   **false**: The audio bitrate is not checked.</p>
         * <p>*   Default value: **false**.</p>
         * <p>*   This parameter takes precedence over the IsCheckAudioBitrate parameter.</p>
         */
        @NameInMap("IsCheckAudioBitrateFail")
        public String isCheckAudioBitrateFail;

        /**
         * <p>Indicates whether to check the resolution.</p>
         * <br>
         * <p>*   If this feature is enabled and the system detects that the resolution of the output file is higher than that of the input file based on the width or height, the resolution of the input file is retained after transcoding.</p>
         * <p>*   **true**: The resolution is checked.</p>
         * <p>*   **false**: The resolution is not checked.</p>
         * <p>*   Default value: **false**.</p>
         */
        @NameInMap("IsCheckReso")
        public String isCheckReso;

        /**
         * <p>Indicates whether to check the resolution.</p>
         * <br>
         * <p>*   If this feature is enabled and the system detects that the resolution of the output file is higher than that of the input file based on the width or height, an error that indicates a transcoding failure is returned.</p>
         * <p>*   **true**: The resolution is checked.</p>
         * <p>*   **false**: The resolution is not checked.</p>
         * <p>*   Default value: **false**.</p>
         */
        @NameInMap("IsCheckResoFail")
        public String isCheckResoFail;

        /**
         * <p>Indicates whether to check the video bitrate.</p>
         * <br>
         * <p>*   If this feature is enabled and the system detects that the video bitrate of the output file is greater than that of the input file, the video bitrate of the input file is retained after transcoding.</p>
         * <p>*   **true**: The video bitrate is checked.</p>
         * <p>*   **false**: The video bitrate is not checked.</p>
         * <p>*   Default value: **false**.</p>
         */
        @NameInMap("IsCheckVideoBitrate")
        public String isCheckVideoBitrate;

        /**
         * <p>Indicates whether to allow video bitrate check errors.</p>
         * <br>
         * <p>*   **true**: If the video bitrate check fails, the input file is not transcoded.</p>
         * <p>*   **false**: The video bitrate is not checked.</p>
         * <p>*   Default value: **false**.</p>
         * <p>*   This parameter takes precedence over the IsCheckVideoBitrate parameter.</p>
         */
        @NameInMap("IsCheckVideoBitrateFail")
        public String isCheckVideoBitrateFail;

        /**
         * <p>The transcoding mode. Default value: **onepass**. Valid values:</p>
         * <br>
         * <p>*   **onepass**</p>
         * <p>*   **twopass**</p>
         * <p>*   **CBR**</p>
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
         */
        @NameInMap("Max")
        public String max;

        /**
         * <p>The lower limit of the total bitrate. Unit: Kbit/s.</p>
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

    public static class SearchTemplateResponseBodyTemplateListTemplateVideo extends TeaModel {
        /**
         * <p>The average bitrate of the video. Unit: Kbit/s.</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The average bitrate range of the video.</p>
         */
        @NameInMap("BitrateBnd")
        public SearchTemplateResponseBodyTemplateListTemplateVideoBitrateBnd bitrateBnd;

        /**
         * <p>The size of the buffer.</p>
         * <br>
         * <p>*   Unit: KB.</p>
         * <p>*   Default value: **6000**.</p>
         */
        @NameInMap("Bufsize")
        public String bufsize;

        /**
         * <p>The video codec.</p>
         * <br>
         * <p>*   Valid values: H.264 and H.265.</p>
         * <p>*   Default value: **H.264**.</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The constant rate factor.</p>
         * <br>
         * <p>*   Default value when the Codec parameter is set to H.264: **23**. Default value when the Codec parameter is set to H.265: **26**.</p>
         * <p>*   If this parameter is specified, the setting of Bitrate becomes invalid.</p>
         */
        @NameInMap("Crf")
        public String crf;

        /**
         * <p>The method of video cropping. Valid values:</p>
         * <br>
         * <p>*   **border**: automatically detects and removes borders.</p>
         * <p>*   **Other values**: the custom cropping modes. Format: width:height:left:top. Example: 1280:800:0:140.</p>
         */
        @NameInMap("Crop")
        public String crop;

        /**
         * <p>The level of video quality control.</p>
         */
        @NameInMap("Degrain")
        public String degrain;

        /**
         * <p>The frame rate of the video.</p>
         * <br>
         * <p>*   The value is 60 if the frame rate of the input video exceeds 60.</p>
         * <p>*   Default value: the frame rate of the input video.</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The maximum number of frames between two keyframes. Default value: **250**.</p>
         */
        @NameInMap("Gop")
        public String gop;

        /**
         * <p>The height of the video.</p>
         * <br>
         * <p>*   Unit: pixel.</p>
         * <p>*   Default value: the height of the input video.</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>Indicates whether to enable the auto-rotate screen feature.</p>
         * <br>
         * <p>*   If this feature is enabled, the width of the output video corresponds to the long side of the input video, which is the height of the input video in portrait mode. The height of the output video corresponds to the short side of the input video, which is the width of the input video in portrait mode.</p>
         * <p>*   **true**: The auto-rotate screen feature is enabled.</p>
         * <p>*   **false**: The auto-rotate screen feature is disabled.</p>
         * <p>*   Default value: **false**.</p>
         */
        @NameInMap("LongShortMode")
        public String longShortMode;

        /**
         * <p>The maximum frame rate.</p>
         */
        @NameInMap("MaxFps")
        public String maxFps;

        /**
         * <p>The maximum video bitrate. Unit: Kbit/s.</p>
         */
        @NameInMap("Maxrate")
        public String maxrate;

        /**
         * <p>The black borders to be added to the video.</p>
         * <br>
         * <p>*   Format: width:height:left:top.</p>
         * <p>*   Example: 1280:800:0:140.</p>
         */
        @NameInMap("Pad")
        public String pad;

        /**
         * <p>The pixel format for video color encoding. Valid values: standard pixel formats such as yuv420p and yuvj420p.</p>
         */
        @NameInMap("PixFmt")
        public String pixFmt;

        /**
         * <p>The preset video algorithm. Default value: **medium**. Valid values:</p>
         * <br>
         * <p>*   **veryfast**</p>
         * <p>*   **fast**</p>
         * <p>*   **medium**</p>
         * <p>*   **slow**</p>
         * <p>*   **slower**</p>
         */
        @NameInMap("Preset")
        public String preset;

        /**
         * <p>The codec profile.</p>
         * <br>
         * <p>*   **baseline**: applicable to mobile devices.</p>
         * <p>*   **main**: applicable to standard-definition devices.</p>
         * <p>*   **high**: applicable to high-definition devices.</p>
         * <p>*   Default value: **high**.</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The strength of the independent noise reduction algorithm.</p>
         */
        @NameInMap("Qscale")
        public String qscale;

        /**
         * <p>Indicates whether to delete the video stream.</p>
         * <br>
         * <p>*   **true**: The video stream is deleted.</p>
         * <p>*   **false**: The video stream is retained.</p>
         * <p>*   Default value: **false**.</p>
         */
        @NameInMap("Remove")
        public String remove;

        /**
         * <p>The scan mode. Valid values:</p>
         * <br>
         * <p>*   **interlaced**</p>
         * <p>*   **progressive**</p>
         */
        @NameInMap("ScanMode")
        public String scanMode;

        /**
         * <p>The width of the video.</p>
         * <br>
         * <p>*   Valid values: **\[128, 4096]**.</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>*   Unit: pixel.</p>
         * <p>*   Default value: the width of the input video.</p>
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
         * <p>The audio codec configuration.</p>
         */
        @NameInMap("Audio")
        public SearchTemplateResponseBodyTemplateListTemplateAudio audio;

        /**
         * <p>The container configuration.</p>
         */
        @NameInMap("Container")
        public SearchTemplateResponseBodyTemplateListTemplateContainer container;

        /**
         * <p>The ID of the transcoding template.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The transmuxing configuration.</p>
         */
        @NameInMap("MuxConfig")
        public SearchTemplateResponseBodyTemplateListTemplateMuxConfig muxConfig;

        /**
         * <p>The name of the template.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the template.</p>
         * <br>
         * <p>*   **Normal**: The template is normal.</p>
         * <p>*   **Deleted**: The template is deleted.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The general transcoding configuration.</p>
         */
        @NameInMap("TransConfig")
        public SearchTemplateResponseBodyTemplateListTemplateTransConfig transConfig;

        /**
         * <p>The video codec configuration.</p>
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
