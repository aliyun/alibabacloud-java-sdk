// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveTranscodeTemplateRequest extends TeaModel {
    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>The template 1130-2</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The template configuration.</p>
     */
    @NameInMap("TemplateConfig")
    public UpdateLiveTranscodeTemplateRequestTemplateConfig templateConfig;

    /**
     * <p>The template ID. You can obtain the ID from the <a href="https://ims.console.aliyun.com/summary">Intelligent Media Services console</a> by choosing Templates &gt; Real-time Transcoding Templates, or from the response parameters of the <a href="https://help.aliyun.com/document_detail/449217.html">Create a real-time transcoding template</a> API operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static UpdateLiveTranscodeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveTranscodeTemplateRequest self = new UpdateLiveTranscodeTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveTranscodeTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLiveTranscodeTemplateRequest setTemplateConfig(UpdateLiveTranscodeTemplateRequestTemplateConfig templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public UpdateLiveTranscodeTemplateRequestTemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

    public UpdateLiveTranscodeTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public static class UpdateLiveTranscodeTemplateRequestTemplateConfigAudioParams extends TeaModel {
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
         * <li>1: mono.</li>
         * <li>2: stereo.</li>
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
         * <p>The audio encoding profile. Valid values when Codec is set to AAC:</p>
         * <ul>
         * <li>aac_low</li>
         * <li>aac_he</li>
         * <li>aac_he_v2</li>
         * <li>aac_ld</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aac_low</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The audio sampling rate. Valid values: 22050 to 96000.</p>
         * <p>Note: If AudioProfile is set to aac_ld, the sampling rate must not exceed 44100.</p>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("Samplerate")
        public String samplerate;

        public static UpdateLiveTranscodeTemplateRequestTemplateConfigAudioParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveTranscodeTemplateRequestTemplateConfigAudioParams self = new UpdateLiveTranscodeTemplateRequestTemplateConfigAudioParams();
            return TeaModel.build(map, self);
        }

        public UpdateLiveTranscodeTemplateRequestTemplateConfigAudioParams setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public UpdateLiveTranscodeTemplateRequestTemplateConfigAudioParams setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public UpdateLiveTranscodeTemplateRequestTemplateConfigAudioParams setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public UpdateLiveTranscodeTemplateRequestTemplateConfigAudioParams setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public UpdateLiveTranscodeTemplateRequestTemplateConfigAudioParams setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

    }

    public static class UpdateLiveTranscodeTemplateRequestTemplateConfigVideoParams extends TeaModel {
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
         * <p>30</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The group of pictures (GOP) of the video. Unit: frames. Valid values: 1 to 3000.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Gop")
        public String gop;

        /**
         * <p>The height of the transcoded video. Valid values:</p>
         * <ul>
         * <li>Height ≥ 128</li>
         * <li>max(Height, Width) ≤ 2560</li>
         * <li>min(Height, Width) ≤ 1440</li>
         * </ul>
         * <blockquote>
         * <p>The resolution of an H.265 Narrowband HD template must not exceed 1280×720.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The encoding profile. A specific set of encoding features supported by the video. Generally, a larger value indicates better video quality but higher resource consumption for encoding and decoding. Valid values:</p>
         * <ul>
         * <li>1: baseline. Suitable for mobile devices.</li>
         * <li>2: main. Suitable for standard resolution devices.</li>
         * <li>3: high. Suitable for high resolution devices.</li>
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
         * <li>Width ≥ 128</li>
         * <li>max(Height, Width) ≤ 2560</li>
         * <li>min(Height, Width) ≤ 1440</li>
         * </ul>
         * <blockquote>
         * <p>The resolution of an H.265 Narrowband HD template must not exceed 1280×720.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Width")
        public String width;

        public static UpdateLiveTranscodeTemplateRequestTemplateConfigVideoParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveTranscodeTemplateRequestTemplateConfigVideoParams self = new UpdateLiveTranscodeTemplateRequestTemplateConfigVideoParams();
            return TeaModel.build(map, self);
        }

        public UpdateLiveTranscodeTemplateRequestTemplateConfigVideoParams setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public UpdateLiveTranscodeTemplateRequestTemplateConfigVideoParams setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public UpdateLiveTranscodeTemplateRequestTemplateConfigVideoParams setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public UpdateLiveTranscodeTemplateRequestTemplateConfigVideoParams setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public UpdateLiveTranscodeTemplateRequestTemplateConfigVideoParams setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public UpdateLiveTranscodeTemplateRequestTemplateConfigVideoParams setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public UpdateLiveTranscodeTemplateRequestTemplateConfigVideoParams setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class UpdateLiveTranscodeTemplateRequestTemplateConfig extends TeaModel {
        /**
         * <p>The audio parameters.</p>
         */
        @NameInMap("AudioParams")
        public UpdateLiveTranscodeTemplateRequestTemplateConfigAudioParams audioParams;

        /**
         * <p>The video parameters.</p>
         */
        @NameInMap("VideoParams")
        public UpdateLiveTranscodeTemplateRequestTemplateConfigVideoParams videoParams;

        public static UpdateLiveTranscodeTemplateRequestTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveTranscodeTemplateRequestTemplateConfig self = new UpdateLiveTranscodeTemplateRequestTemplateConfig();
            return TeaModel.build(map, self);
        }

        public UpdateLiveTranscodeTemplateRequestTemplateConfig setAudioParams(UpdateLiveTranscodeTemplateRequestTemplateConfigAudioParams audioParams) {
            this.audioParams = audioParams;
            return this;
        }
        public UpdateLiveTranscodeTemplateRequestTemplateConfigAudioParams getAudioParams() {
            return this.audioParams;
        }

        public UpdateLiveTranscodeTemplateRequestTemplateConfig setVideoParams(UpdateLiveTranscodeTemplateRequestTemplateConfigVideoParams videoParams) {
            this.videoParams = videoParams;
            return this;
        }
        public UpdateLiveTranscodeTemplateRequestTemplateConfigVideoParams getVideoParams() {
            return this.videoParams;
        }

    }

}
