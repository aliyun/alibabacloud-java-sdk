// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
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
         * <p>The volume adjustment range.</p>
         * <br>
         * <p>*   Default value: **-20**.</p>
         * <p>*   Unit: dB.</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The volume adjustment method. Valid values:</p>
         * <br>
         * <p>*   **auto**: The volume is automatically adjusted.</p>
         * <p>*   **dynamic**: The volume is dynamically adjusted.</p>
         * <p>*   **linear**: The volume is linearly adjusted.</p>
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
         * <p>The audio codec. Default audio codec: **AAC**. Valid audio codecs:</p>
         * <br>
         * <p>*   **AAC**</p>
         * <p>*   **MP3**</p>
         * <p>*   **VORBIS**</p>
         * <p>*   **FLAC**</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The codec profile of the audio. Valid values when the audio codec is set to **AAC**:****</p>
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
         * <p>The level of the independent denoising algorithm.</p>
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

        /**
         * <p>The details of the volume.</p>
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
         * <p>The transmuxing configuration for GIF.</p>
         */
        @NameInMap("Gif")
        public AddTemplateResponseBodyTemplateMuxConfigGif gif;

        /**
         * <p>The segment configuration.</p>
         */
        @NameInMap("Segment")
        public AddTemplateResponseBodyTemplateMuxConfigSegment segment;

        /**
         * <p>The transmuxing configuration for WebP.</p>
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
         * <p>The method of resolution adjustment. Default value: **none** Valid values:</p>
         * <br>
         * <p>*   **rescale**: The input video is rescaled.</p>
         * <p>*   **crop**: The input video is cropped.</p>
         * <p>*   **none**: No change is made.</p>
         */
        @NameInMap("AdjDarMethod")
        public String adjDarMethod;

        /**
         * <p>Indicates whether to check the audio bitrate.</p>
         * <br>
         * <p>If this feature is enabled and the system detects that the audio bitrate of the output file is greater than that of the input file, the audio bitrate of the input file is retained after transcoding.</p>
         * <br>
         * <p>*   **true**: The audio bitrate is checked.</p>
         * <p>*   **false**: The audio bitrate is not checked.</p>
         * <p>*   Default value: **false**.</p>
         */
        @NameInMap("IsCheckAudioBitrate")
        public String isCheckAudioBitrate;

        /**
         * <p>Indicates whether to check the audio bitrate. If the bitrate of the output audio is greater than that of the input audio, this parameter has a higher priority than the **IsCheckAudioBitrate** parameter.</p>
         * <br>
         * <p>*   **true**: The audio bitrate is checked. If the bitrate of the output audio is greater than that of the input audio, the input file is not transcoded.</p>
         * <p>*   **false**: The audio bitrate is not checked.</p>
         * <p>*   Default value: **false**.</p>
         */
        @NameInMap("IsCheckAudioBitrateFail")
        public String isCheckAudioBitrateFail;

        /**
         * <p>Indicates whether to check the resolution.</p>
         * <br>
         * <p>*   **true**: The resolution is checked.</p>
         * <p>*   **false**: The resolution is not checked.</p>
         * <p>*   Default value: **false**.</p>
         * <br>
         * <p>>  If this feature is enabled and the system detects that the resolution of the output file is higher than that of the input file based on the width or height, the resolution of the input file is retained after transcoding.</p>
         */
        @NameInMap("IsCheckReso")
        public String isCheckReso;

        /**
         * <p>Indicates whether to check the resolution.</p>
         * <br>
         * <p>*   **true**: The resolution is checked.</p>
         * <p>*   **false**: The resolution is not checked.</p>
         * <p>*   Default value: **false**.</p>
         * <br>
         * <p>>  If this feature is enabled and the system detects that the resolution of the output file is higher than that of the input file based on the width or height, an error that indicates a transcoding failure is returned.</p>
         */
        @NameInMap("IsCheckResoFail")
        public String isCheckResoFail;

        /**
         * <p>Indicates whether to check the video bitrate.</p>
         * <br>
         * <p>*   **true**: The video bitrate is checked.</p>
         * <p>*   **false**: The video bitrate is not checked.</p>
         * <p>*   Default value: **false**.</p>
         * <br>
         * <p>>  If this feature is enabled and the system detects that the video bitrate of the output file is greater than that of the input file, the video bitrate of the input file is retained after transcoding.</p>
         */
        @NameInMap("IsCheckVideoBitrate")
        public String isCheckVideoBitrate;

        /**
         * <p>If the video bitrate of the output file is found to be greater than that of the input file, this parameter has a higher priority than the IsCheckVideoBitrate parameter. Valid values:</p>
         * <br>
         * <p>*   **true**: The video bitrate is checked. If the video bitrate of the output file is higher than that of the input file, the input file is not transcoded.</p>
         * <p>*   **false**: The video bitrate is not checked.</p>
         * <p>*   Default value: **false**.</p>
         */
        @NameInMap("IsCheckVideoBitrateFail")
        public String isCheckVideoBitrateFail;

        /**
         * <p>The transcoding mode. Valid values:</p>
         * <br>
         * <p>*   **onepass**</p>
         * <p>*   **twopass**</p>
         * <p>*   **CBR**</p>
         * <p>*   Default value: **onepass**.</p>
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
         */
        @NameInMap("Max")
        public String max;

        /**
         * <p>The minimum bitrate.</p>
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
         * <p>The bitrate of the output video. Unit: Kbit/s.</p>
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
         * <br>
         * <p>*   Default value: **6000**.</p>
         * <p>*   Unit: KB.</p>
         */
        @NameInMap("Bufsize")
        public String bufsize;

        /**
         * <p>The video codec. Valid video codecs: H.264, H.265, GIF, and WebP. Default video codec: **H.264**.</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The constant rate factor. Default value when the video codec is set to H.264: **23**. Default value when the video codec is set to H.265: **26**.</p>
         * <br>
         * <p>>  If this parameter is specified, the setting of the Bitrate parameter becomes invalid.</p>
         */
        @NameInMap("Crf")
        public String crf;

        /**
         * <p>The method of video cropping. Valid values:</p>
         * <br>
         * <p>*   **border**: automatically detects and removes borders.</p>
         * <p>*   Value in the format of **width:height:left:top**: crops the video image based on the custom setting. Example: 1280:800:0:140.</p>
         */
        @NameInMap("Crop")
        public String crop;

        /**
         * <p>The level of quality control on the video.</p>
         */
        @NameInMap("Degrain")
        public String degrain;

        /**
         * <p>The frame rate of the video. Default value: the frame rate of the input file. The value is 60 if the frame rate of the input file exceeds 60. Unit: frames per second.</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The GOP size. The GOP size can be the maximum interval of keyframes or the maximum number of frames in a frame group. If you specified the maximum interval, the value contains the unit (s). If you specified the maximum number of frames, the value does not contain a unit. Default value: **10s**.</p>
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
         * <p>Indicates whether to enable the auto-rotate screen feature. Default value: **false**. Valid values:</p>
         * <br>
         * <p>*   **true**: The auto-rotate screen feature is enabled.</p>
         * <p>*   **false**: The auto-rotate screen feature is disabled.</p>
         * <br>
         * <p>>  If this feature is enabled, the width of the output video corresponds to the long side of the input video, which is the height of the input video in portrait mode. The height of the output video corresponds to the short side of the input video, which is the width of the input video in portrait mode.</p>
         */
        @NameInMap("LongShortMode")
        public String longShortMode;

        /**
         * <p>The maximum frame rate.</p>
         */
        @NameInMap("MaxFps")
        public String maxFps;

        /**
         * <p>The maximum bitrate of the output video. Unit: Kbit/s.</p>
         */
        @NameInMap("Maxrate")
        public String maxrate;

        /**
         * <p>The black borders to be added to the video. Format: width:height:left:top.</p>
         */
        @NameInMap("Pad")
        public String pad;

        /**
         * <p>The pixel format for video color encoding. Standard pixel formats such as yuv420p and yuvj420p are supported. The default pixel format can be yuv420p or the original color format.</p>
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
         * <br>
         * <p>>  This parameter is valid only when the video codec is set to H.264.</p>
         */
        @NameInMap("Preset")
        public String preset;

        /**
         * <p>The codec profile. Valid values:</p>
         * <br>
         * <p>*   **baseline**: suitable for mobile devices</p>
         * <p>*   **main**: suitable for standard-definition devices</p>
         * <p>*   **high**: suitable for high-definition devices</p>
         * <p>*   Default value: **high**.</p>
         * <br>
         * <p>If multiple definitions exist, we recommend that you set this parameter to baseline for the lowest definition to ensure normal playback on low-end devices. Set this parameter to main or high for other definitions.</p>
         * <br>
         * <p>>  This parameter is valid only when the video codec is set to H.264.</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The level of the independent denoising algorithm.</p>
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
         * <p>*   Default value: the width of the input video.****</p>
         * <p>*   Unit: pixel.</p>
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
         * <p>The audio codec configuration.</p>
         */
        @NameInMap("Audio")
        public AddTemplateResponseBodyTemplateAudio audio;

        /**
         * <p>The container configuration.</p>
         */
        @NameInMap("Container")
        public AddTemplateResponseBodyTemplateContainer container;

        /**
         * <p>The ID of the transcoding template. We recommend that you keep this ID for subsequent operation calls.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The transmuxing configuration.</p>
         */
        @NameInMap("MuxConfig")
        public AddTemplateResponseBodyTemplateMuxConfig muxConfig;

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
        public AddTemplateResponseBodyTemplateTransConfig transConfig;

        /**
         * <p>The video codec configuration.</p>
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
