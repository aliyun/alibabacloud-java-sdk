// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveTranscodeTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateContent")
    public GetLiveTranscodeTemplateResponseBodyTemplateContent templateContent;

    public static GetLiveTranscodeTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveTranscodeTemplateResponseBody self = new GetLiveTranscodeTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveTranscodeTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLiveTranscodeTemplateResponseBody setTemplateContent(GetLiveTranscodeTemplateResponseBodyTemplateContent templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public GetLiveTranscodeTemplateResponseBodyTemplateContent getTemplateContent() {
        return this.templateContent;
    }

    public static class GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigAudioParams extends TeaModel {
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

        public static GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigAudioParams build(java.util.Map<String, ?> map) throws Exception {
            GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigAudioParams self = new GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigAudioParams();
            return TeaModel.build(map, self);
        }

        public GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigAudioParams setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigAudioParams setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigAudioParams setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigAudioParams setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigAudioParams setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

    }

    public static class GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigVideoParams extends TeaModel {
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

        public static GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigVideoParams build(java.util.Map<String, ?> map) throws Exception {
            GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigVideoParams self = new GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigVideoParams();
            return TeaModel.build(map, self);
        }

        public GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigVideoParams setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigVideoParams setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigVideoParams setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigVideoParams setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigVideoParams setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigVideoParams setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigVideoParams setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfig extends TeaModel {
        @NameInMap("AudioParams")
        public GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigAudioParams audioParams;

        @NameInMap("VideoParams")
        public GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigVideoParams videoParams;

        public static GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
            GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfig self = new GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfig();
            return TeaModel.build(map, self);
        }

        public GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfig setAudioParams(GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigAudioParams audioParams) {
            this.audioParams = audioParams;
            return this;
        }
        public GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigAudioParams getAudioParams() {
            return this.audioParams;
        }

        public GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfig setVideoParams(GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigVideoParams videoParams) {
            this.videoParams = videoParams;
            return this;
        }
        public GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfigVideoParams getVideoParams() {
            return this.videoParams;
        }

    }

    public static class GetLiveTranscodeTemplateResponseBodyTemplateContent extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateConfig")
        public GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfig templateConfig;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("Type")
        public String type;

        public static GetLiveTranscodeTemplateResponseBodyTemplateContent build(java.util.Map<String, ?> map) throws Exception {
            GetLiveTranscodeTemplateResponseBodyTemplateContent self = new GetLiveTranscodeTemplateResponseBodyTemplateContent();
            return TeaModel.build(map, self);
        }

        public GetLiveTranscodeTemplateResponseBodyTemplateContent setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetLiveTranscodeTemplateResponseBodyTemplateContent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetLiveTranscodeTemplateResponseBodyTemplateContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLiveTranscodeTemplateResponseBodyTemplateContent setTemplateConfig(GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfig templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public GetLiveTranscodeTemplateResponseBodyTemplateContentTemplateConfig getTemplateConfig() {
            return this.templateConfig;
        }

        public GetLiveTranscodeTemplateResponseBodyTemplateContent setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetLiveTranscodeTemplateResponseBodyTemplateContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
