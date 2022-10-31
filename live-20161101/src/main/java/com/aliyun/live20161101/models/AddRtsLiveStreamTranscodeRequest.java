// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddRtsLiveStreamTranscodeRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("AudioBitrate")
    public Integer audioBitrate;

    @NameInMap("AudioChannelNum")
    public Integer audioChannelNum;

    @NameInMap("AudioCodec")
    public String audioCodec;

    @NameInMap("AudioProfile")
    public String audioProfile;

    @NameInMap("AudioRate")
    public Integer audioRate;

    @NameInMap("DeleteBframes")
    public Boolean deleteBframes;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("FPS")
    public Integer FPS;

    @NameInMap("Gop")
    public String gop;

    @NameInMap("Height")
    public Integer height;

    @NameInMap("Lazy")
    public String lazy;

    @NameInMap("Opus")
    public Boolean opus;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Profile")
    public Integer profile;

    @NameInMap("Template")
    public String template;

    @NameInMap("TemplateType")
    public String templateType;

    @NameInMap("VideoBitrate")
    public Integer videoBitrate;

    @NameInMap("Width")
    public Integer width;

    public static AddRtsLiveStreamTranscodeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRtsLiveStreamTranscodeRequest self = new AddRtsLiveStreamTranscodeRequest();
        return TeaModel.build(map, self);
    }

    public AddRtsLiveStreamTranscodeRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public AddRtsLiveStreamTranscodeRequest setAudioBitrate(Integer audioBitrate) {
        this.audioBitrate = audioBitrate;
        return this;
    }
    public Integer getAudioBitrate() {
        return this.audioBitrate;
    }

    public AddRtsLiveStreamTranscodeRequest setAudioChannelNum(Integer audioChannelNum) {
        this.audioChannelNum = audioChannelNum;
        return this;
    }
    public Integer getAudioChannelNum() {
        return this.audioChannelNum;
    }

    public AddRtsLiveStreamTranscodeRequest setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }
    public String getAudioCodec() {
        return this.audioCodec;
    }

    public AddRtsLiveStreamTranscodeRequest setAudioProfile(String audioProfile) {
        this.audioProfile = audioProfile;
        return this;
    }
    public String getAudioProfile() {
        return this.audioProfile;
    }

    public AddRtsLiveStreamTranscodeRequest setAudioRate(Integer audioRate) {
        this.audioRate = audioRate;
        return this;
    }
    public Integer getAudioRate() {
        return this.audioRate;
    }

    public AddRtsLiveStreamTranscodeRequest setDeleteBframes(Boolean deleteBframes) {
        this.deleteBframes = deleteBframes;
        return this;
    }
    public Boolean getDeleteBframes() {
        return this.deleteBframes;
    }

    public AddRtsLiveStreamTranscodeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AddRtsLiveStreamTranscodeRequest setFPS(Integer FPS) {
        this.FPS = FPS;
        return this;
    }
    public Integer getFPS() {
        return this.FPS;
    }

    public AddRtsLiveStreamTranscodeRequest setGop(String gop) {
        this.gop = gop;
        return this;
    }
    public String getGop() {
        return this.gop;
    }

    public AddRtsLiveStreamTranscodeRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public AddRtsLiveStreamTranscodeRequest setLazy(String lazy) {
        this.lazy = lazy;
        return this;
    }
    public String getLazy() {
        return this.lazy;
    }

    public AddRtsLiveStreamTranscodeRequest setOpus(Boolean opus) {
        this.opus = opus;
        return this;
    }
    public Boolean getOpus() {
        return this.opus;
    }

    public AddRtsLiveStreamTranscodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddRtsLiveStreamTranscodeRequest setProfile(Integer profile) {
        this.profile = profile;
        return this;
    }
    public Integer getProfile() {
        return this.profile;
    }

    public AddRtsLiveStreamTranscodeRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public AddRtsLiveStreamTranscodeRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public AddRtsLiveStreamTranscodeRequest setVideoBitrate(Integer videoBitrate) {
        this.videoBitrate = videoBitrate;
        return this;
    }
    public Integer getVideoBitrate() {
        return this.videoBitrate;
    }

    public AddRtsLiveStreamTranscodeRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
