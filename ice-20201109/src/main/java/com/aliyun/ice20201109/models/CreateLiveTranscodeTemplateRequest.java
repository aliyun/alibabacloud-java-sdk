// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLiveTranscodeTemplateRequest extends TeaModel {
    /**
     * <p>The template name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my template</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The template configuration.</p>
     * <blockquote>
     * <p>The pass parameter requirements vary based on the templatetype (Type). When Type is set to normal, at least one of the width and height parameters must be specified, and the frame rate and bitrate parameters are required. For other template types, specify the parameters based on your requirements.</p>
     * </blockquote>
     */
    @NameInMap("TemplateConfig")
    public CreateLiveTranscodeTemplateRequestTemplateConfig templateConfig;

    /**
     * <p>The template type. Valid values:</p>
     * <ul>
     * <li>normal: standard.</li>
     * <li>narrow-band: narrowband HD.</li>
     * <li>audio-only: audio only.</li>
     * <li>origin: original quality.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateLiveTranscodeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveTranscodeTemplateRequest self = new CreateLiveTranscodeTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveTranscodeTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLiveTranscodeTemplateRequest setTemplateConfig(CreateLiveTranscodeTemplateRequestTemplateConfig templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public CreateLiveTranscodeTemplateRequestTemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

    public CreateLiveTranscodeTemplateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateLiveTranscodeTemplateRequestTemplateConfigAudioParams extends TeaModel {
        /**
         * <p>The bitrate of the transcoded audio. Unit: kbps. Valid values: 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The number of audio channels. Valid values:</p>
         * <ul>
         * <li><p>1: mono.</p>
         * </li>
         * <li><p>2: stereo.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <p>The audio encoding format. Valid values:</p>
         * <ul>
         * <li>AAC</li>
         * <li>MP3</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AAC</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The audio encoding preset. When Codec is set to AAC, valid values:</p>
         * <ul>
         * <li>aac_low</li>
         * <li>aac_he</li>
         * <li>aac_he_v2</li>
         * <li>aac_ld</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aaclow</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The audio sample rate. Valid values: 22050 to 96000.</p>
         * <blockquote>
         * <p>Notice: If AudioProfile is set to aac_ld, the sample rate must not exceed 44100.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("Samplerate")
        public String samplerate;

        public static CreateLiveTranscodeTemplateRequestTemplateConfigAudioParams build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveTranscodeTemplateRequestTemplateConfigAudioParams self = new CreateLiveTranscodeTemplateRequestTemplateConfigAudioParams();
            return TeaModel.build(map, self);
        }

        public CreateLiveTranscodeTemplateRequestTemplateConfigAudioParams setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public CreateLiveTranscodeTemplateRequestTemplateConfigAudioParams setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public CreateLiveTranscodeTemplateRequestTemplateConfigAudioParams setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public CreateLiveTranscodeTemplateRequestTemplateConfigAudioParams setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public CreateLiveTranscodeTemplateRequestTemplateConfigAudioParams setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

    }

    public static class CreateLiveTranscodeTemplateRequestTemplateConfigVideoParams extends TeaModel {
        /**
         * <p>The bitrate of the transcoded video. Unit: kbps. Valid values: 1 to 6000.</p>
         * 
         * <strong>example:</strong>
         * <p>2500</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The encoding type. Valid values:</p>
         * <ul>
         * <li>H.264</li>
         * <li>H.265</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>H.264</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The frame rate of the transcoded video. Unit: FPS. Valid values: 1 to 60.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The video GOP (Group of Pictures). Unit: frames. Valid values: 1 to 3000.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Gop")
        public String gop;

        /**
         * <p>The height of the transcoded video. Valid values:</p>
         * <ul>
         * <li><p>Height ≥ 128</p>
         * </li>
         * <li><p>max(Height, Width) ≤ 2560</p>
         * </li>
         * <li><p>min(Height, Width) ≤ 1440</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Notice: For H.265 narrowband HD templates, the resolution must not exceed 1280 × 720.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The encoding profile. A set of specific encoding features supported by the video. A higher value generally produces better image quality but consumes more encoding and decoding resources. Valid values:</p>
         * <ul>
         * <li><p>1: baseline (suitable for mobile devices).</p>
         * </li>
         * <li><p>2: main (suitable for standard resolution devices).</p>
         * </li>
         * <li><p>3: high (suitable for high resolution devices).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The width of the transcoded video. Valid values:</p>
         * <ul>
         * <li><p>Width ≥ 128</p>
         * </li>
         * <li><p>max(Height, Width) ≤ 2560</p>
         * </li>
         * <li><p>min(Height, Width) ≤ 1440</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Notice: For H.265 narrowband HD templates, the resolution must not exceed 1280 × 720.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Width")
        public String width;

        public static CreateLiveTranscodeTemplateRequestTemplateConfigVideoParams build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveTranscodeTemplateRequestTemplateConfigVideoParams self = new CreateLiveTranscodeTemplateRequestTemplateConfigVideoParams();
            return TeaModel.build(map, self);
        }

        public CreateLiveTranscodeTemplateRequestTemplateConfigVideoParams setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public CreateLiveTranscodeTemplateRequestTemplateConfigVideoParams setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public CreateLiveTranscodeTemplateRequestTemplateConfigVideoParams setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public CreateLiveTranscodeTemplateRequestTemplateConfigVideoParams setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public CreateLiveTranscodeTemplateRequestTemplateConfigVideoParams setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public CreateLiveTranscodeTemplateRequestTemplateConfigVideoParams setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public CreateLiveTranscodeTemplateRequestTemplateConfigVideoParams setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class CreateLiveTranscodeTemplateRequestTemplateConfig extends TeaModel {
        /**
         * <p>The audio parameters.</p>
         */
        @NameInMap("AudioParams")
        public CreateLiveTranscodeTemplateRequestTemplateConfigAudioParams audioParams;

        /**
         * <p>The video parameters.</p>
         */
        @NameInMap("VideoParams")
        public CreateLiveTranscodeTemplateRequestTemplateConfigVideoParams videoParams;

        public static CreateLiveTranscodeTemplateRequestTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveTranscodeTemplateRequestTemplateConfig self = new CreateLiveTranscodeTemplateRequestTemplateConfig();
            return TeaModel.build(map, self);
        }

        public CreateLiveTranscodeTemplateRequestTemplateConfig setAudioParams(CreateLiveTranscodeTemplateRequestTemplateConfigAudioParams audioParams) {
            this.audioParams = audioParams;
            return this;
        }
        public CreateLiveTranscodeTemplateRequestTemplateConfigAudioParams getAudioParams() {
            return this.audioParams;
        }

        public CreateLiveTranscodeTemplateRequestTemplateConfig setVideoParams(CreateLiveTranscodeTemplateRequestTemplateConfigVideoParams videoParams) {
            this.videoParams = videoParams;
            return this;
        }
        public CreateLiveTranscodeTemplateRequestTemplateConfigVideoParams getVideoParams() {
            return this.videoParams;
        }

    }

}
