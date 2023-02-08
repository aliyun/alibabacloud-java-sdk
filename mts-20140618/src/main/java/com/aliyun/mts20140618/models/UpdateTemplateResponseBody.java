// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
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

    public static class UpdateTemplateResponseBodyTemplateAudio extends TeaModel {
        /**
         * <p>The audio bitrate of the output file.</p>
         * <br>
         * <p>*   Valid values: **\[8, 1000]**.</p>
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
         * <p>The codec profile of the audio. Valid values when the **Codec** parameter is set to **aac**:</p>
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
         * <p>The strength of the independent noise reduction algorithm.</p>
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
        /**
         * <p>The container format.</p>
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
         * <p>The color dithering algorithm of the palette. Valid values: sierra and bayer.</p>
         */
        @NameInMap("DitherMode")
        public String ditherMode;

        /**
         * <p>The duration for which the final frame is paused. Unit: milliseconds.</p>
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
         * <p>The length of the segment. Unit: seconds.</p>
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
         * <p>The loop count.</p>
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
         * <p>The transmuxing configuration for GIF.</p>
         */
        @NameInMap("Gif")
        public UpdateTemplateResponseBodyTemplateMuxConfigGif gif;

        /**
         * <p>The segment configuration.</p>
         */
        @NameInMap("Segment")
        public UpdateTemplateResponseBodyTemplateMuxConfigSegment segment;

        /**
         * <p>The transmuxing configuration for WebP.</p>
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
         * <p>*   **true**. If the audio bitrate check fails, the input file is not transcoded.</p>
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
         * <p>*   **true**. If the video bitrate check fails, the input file is not transcoded.</p>
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
         * <p>The upper limit of the total bitrate. Unit: Kbit/s.</p>
         */
        @NameInMap("Max")
        public String max;

        /**
         * <p>The lower limit of the total bitrate. Unit: Kbit/s.</p>
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

    public static class UpdateTemplateResponseBodyTemplateVideo extends TeaModel {
        /**
         * <p>The average bitrate of the video. Unit: Kbit/s.</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The average bitrate range of the video.</p>
         */
        @NameInMap("BitrateBnd")
        public UpdateTemplateResponseBodyTemplateVideoBitrateBnd bitrateBnd;

        /**
         * <p>The size of the buffer.</p>
         * <br>
         * <p>*   Unit: KB.</p>
         * <p>*   Default value: **6000**.</p>
         */
        @NameInMap("Bufsize")
        public String bufsize;

        /**
         * <p>The video codec. Default value: **H.264**.</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The constant rate factor.</p>
         * <br>
         * <p>*   Default value when the Codec parameter is set to H.264: **23**. Default value when the Codec parameter is set to H.265: **26**.</p>
         * <p>*   If this parameter is specified, the setting of the Bitrate parameter is invalid.</p>
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
         * <p>The policy of resolution adjustment.</p>
         */
        @NameInMap("ResoPriority")
        public String resoPriority;

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
         * <p>*   Unit: pixel.</p>
         * <p>*   Default value: the width of the input video.</p>
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
         * <p>The audio codec configuration.</p>
         */
        @NameInMap("Audio")
        public UpdateTemplateResponseBodyTemplateAudio audio;

        /**
         * <p>The container configuration.</p>
         */
        @NameInMap("Container")
        public UpdateTemplateResponseBodyTemplateContainer container;

        /**
         * <p>The ID of the transcoding template.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The transmuxing configuration.</p>
         */
        @NameInMap("MuxConfig")
        public UpdateTemplateResponseBodyTemplateMuxConfig muxConfig;

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
        public UpdateTemplateResponseBodyTemplateTransConfig transConfig;

        /**
         * <p>The video codec configuration.</p>
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
