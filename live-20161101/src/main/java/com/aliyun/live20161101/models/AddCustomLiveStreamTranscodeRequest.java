// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCustomLiveStreamTranscodeRequest extends TeaModel {
    @NameInMap("Domain")
    @Validation(required = true)
    public String domain;

    @NameInMap("App")
    @Validation(required = true)
    public String app;

    @NameInMap("Template")
    @Validation(required = true)
    public String template;

    @NameInMap("TemplateType")
    @Validation(required = true)
    public String templateType;

    @NameInMap("Height")
    public Integer height;

    @NameInMap("Width")
    public Integer width;

    @NameInMap("FPS")
    public Integer FPS;

    @NameInMap("VideoBitrate")
    public Integer videoBitrate;

    @NameInMap("AudioBitrate")
    public Integer audioBitrate;

    @NameInMap("Gop")
    public String gop;

    @NameInMap("Profile")
    public Integer profile;

    @NameInMap("AudioProfile")
    public String audioProfile;

    @NameInMap("AudioCodec")
    public String audioCodec;

    @NameInMap("AudioRate")
    public Integer audioRate;

    @NameInMap("AudioChannelNum")
    public Integer audioChannelNum;

    @NameInMap("Lazy")
    public String lazy;

    public static AddCustomLiveStreamTranscodeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCustomLiveStreamTranscodeRequest self = new AddCustomLiveStreamTranscodeRequest();
        return TeaModel.build(map, self);
    }

    public AddCustomLiveStreamTranscodeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AddCustomLiveStreamTranscodeRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public AddCustomLiveStreamTranscodeRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public AddCustomLiveStreamTranscodeRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public AddCustomLiveStreamTranscodeRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public AddCustomLiveStreamTranscodeRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

    public AddCustomLiveStreamTranscodeRequest setFPS(Integer FPS) {
        this.FPS = FPS;
        return this;
    }
    public Integer getFPS() {
        return this.FPS;
    }

    public AddCustomLiveStreamTranscodeRequest setVideoBitrate(Integer videoBitrate) {
        this.videoBitrate = videoBitrate;
        return this;
    }
    public Integer getVideoBitrate() {
        return this.videoBitrate;
    }

    public AddCustomLiveStreamTranscodeRequest setAudioBitrate(Integer audioBitrate) {
        this.audioBitrate = audioBitrate;
        return this;
    }
    public Integer getAudioBitrate() {
        return this.audioBitrate;
    }

    public AddCustomLiveStreamTranscodeRequest setGop(String gop) {
        this.gop = gop;
        return this;
    }
    public String getGop() {
        return this.gop;
    }

    public AddCustomLiveStreamTranscodeRequest setProfile(Integer profile) {
        this.profile = profile;
        return this;
    }
    public Integer getProfile() {
        return this.profile;
    }

    public AddCustomLiveStreamTranscodeRequest setAudioProfile(String audioProfile) {
        this.audioProfile = audioProfile;
        return this;
    }
    public String getAudioProfile() {
        return this.audioProfile;
    }

    public AddCustomLiveStreamTranscodeRequest setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }
    public String getAudioCodec() {
        return this.audioCodec;
    }

    public AddCustomLiveStreamTranscodeRequest setAudioRate(Integer audioRate) {
        this.audioRate = audioRate;
        return this;
    }
    public Integer getAudioRate() {
        return this.audioRate;
    }

    public AddCustomLiveStreamTranscodeRequest setAudioChannelNum(Integer audioChannelNum) {
        this.audioChannelNum = audioChannelNum;
        return this;
    }
    public Integer getAudioChannelNum() {
        return this.audioChannelNum;
    }

    public AddCustomLiveStreamTranscodeRequest setLazy(String lazy) {
        this.lazy = lazy;
        return this;
    }
    public String getLazy() {
        return this.lazy;
    }

}
