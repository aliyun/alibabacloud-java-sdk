// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveTranscodeTemplateRequest extends TeaModel {
    /**
     * <p>The template name.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The configuration of the template.</p>
     */
    @NameInMap("TemplateConfig")
    public UpdateLiveTranscodeTemplateRequestTemplateConfig templateConfig;

    /**
     * <p>The template ID. To obtain the template ID, log on to the <a href="https://ims.console.aliyun.com/summary">Intelligent Media Services (IMS) console</a>, choose Real-time Media Processing &gt; Template Management, and then click the Transcoding tab. Alternatively, find the ID from the response parameters of the <a href="https://help.aliyun.com/document_detail/449217.html">CreateLiveTranscodeTemplate</a> operation.</p>
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
         * <p>The audio codec. Valid values: AAC MP3</p>
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
         * <p>aac_low</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The audio sampling rate. Valid values: 22050 to 96000.</p>
         * <p>Note If you set AudioProfile to aac_ld, the audio sampling rate cannot exceed 44100.</p>
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
         * <p>30</p>
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
         * <p>The height of the output video. Valid values:</p>
         * <ul>
         * <li>Height ≥ 128</li>
         * <li>max (Height,Width) ≤ 2560</li>
         * <li>min（Height,Width）≤ 1440</li>
         * </ul>
         * <blockquote>
         * <p> The resolution of a video transcoded by using the H.265 Narrowband HD template cannot exceed 1,280 × 720 pixels.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The video encoding profile. The profile determines how a video is encoded. In most cases, a greater value indicates better image quality and higher resource consumption. Valid values:</p>
         * <ul>
         * <li>1: baseline. This value is suitable for mobile devices.</li>
         * <li>2: main. This value is suitable for standard-definition devices.</li>
         * <li>3: high. This value is suitable for high-definition devices.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The width of the output video. Valid values:</p>
         * <ul>
         * <li>Width ≥ 128</li>
         * <li>max (Height,Width) ≤ 2560</li>
         * <li>min（Height,Width）≤ 1440</li>
         * </ul>
         * <blockquote>
         * <p> The resolution of a video transcoded by using the H.265 Narrowband HD template cannot exceed 1,280 × 720 pixels.</p>
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
