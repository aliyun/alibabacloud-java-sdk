// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveTranscodeTemplateRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("TemplateConfig")
    public UpdateLiveTranscodeTemplateRequestTemplateConfig templateConfig;

    /**
     * <p>This parameter is required.</p>
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
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Profile")
        public String profile;

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
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Gop")
        public String gop;

        @NameInMap("Height")
        public String height;

        @NameInMap("Profile")
        public String profile;

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
        @NameInMap("AudioParams")
        public UpdateLiveTranscodeTemplateRequestTemplateConfigAudioParams audioParams;

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
