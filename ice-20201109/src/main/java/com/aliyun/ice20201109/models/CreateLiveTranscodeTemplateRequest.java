// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLiveTranscodeTemplateRequest extends TeaModel {
    /**
     * <p>The name of the template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my template</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The configuration of the template.</p>
     */
    @NameInMap("TemplateConfig")
    public CreateLiveTranscodeTemplateRequestTemplateConfig templateConfig;

    /**
     * <p>The type of the template. Valid values:</p>
     * <ul>
     * <li>normal</li>
     * <li>narrow-band</li>
     * <li>audio-only</li>
     * <li>origin</li>
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
         * <p>The bitrate of the output audio. Unit: Kbit/s. Valid values: 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The number of sound channels. Valid values: 1: mono 2: binaural</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <p>The audio codec. Valid values:</p>
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
         * <p>The audio codec profile. Valid values when the Codec parameter is set to AAC:</p>
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
         * <p>The audio sampling rate. Valid values: 22050 to 96000.</p>
         * <p>Note: If you set AudioProfile to aac_ld, the audio sampling rate cannot exceed 44,100.</p>
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
         * <p>The bitrate of the output video. Unit: Kbit/s. Valid values: 1 to 6000.</p>
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
         * <p>The frame rate of the output video. Unit: frames per second (FPS). Valid values: 1 to 60.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The group of pictures (GOP) of the output video. Unit: frame. Valid values: 1 to 3000.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Gop")
        public String gop;

        /**
         * <p>The height of the output video. Valid values: Height ≥ 128 max (Height,Width) ≤ 2560 min (Height,Width) ≤ 1440</p>
         * <p>Note: The resolution of the output video that is transcoded by using the H.265 Narrowband HD transcoding template cannot exceed 1280 × 720 pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The encoding profile. The profile determines how a video is encoded. In most cases, a greater value indicates better image quality and higher resource consumption. Valid values: 1: baseline. This value is suitable for mobile devices. 2: main. This value is suitable for standard-definition devices. 3: high. This value is suitable for high-definition devices.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The width of the output video. Valid values: Width ≥ 128 max (Height,Width) ≤ 2560 min (Height,Width) ≤ 1440</p>
         * <p>Note: The resolution of the output video that is transcoded by using the H.265 Narrowband HD transcoding template cannot exceed 1280 × 720 pixels.</p>
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
