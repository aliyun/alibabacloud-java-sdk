// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLiveTranscodeTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("TemplateConfig")
    public CreateLiveTranscodeTemplateRequestTemplateConfig templateConfig;

    /**
     * <p>This parameter is required.</p>
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
        @NameInMap("AudioParams")
        public CreateLiveTranscodeTemplateRequestTemplateConfigAudioParams audioParams;

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
