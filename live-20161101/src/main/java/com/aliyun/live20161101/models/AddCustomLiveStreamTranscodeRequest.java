// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCustomLiveStreamTranscodeRequest extends TeaModel {
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

    @NameInMap("Domain")
    public String domain;

    @NameInMap("EncryptParameters")
    public String encryptParameters;

    @NameInMap("FPS")
    public Integer FPS;

    @NameInMap("Gop")
    public String gop;

    @NameInMap("Height")
    public Integer height;

    @NameInMap("KmsKeyExpireInterval")
    public String kmsKeyExpireInterval;

    @NameInMap("KmsKeyID")
    public String kmsKeyID;

    @NameInMap("KmsUID")
    public String kmsUID;

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

    public static AddCustomLiveStreamTranscodeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCustomLiveStreamTranscodeRequest self = new AddCustomLiveStreamTranscodeRequest();
        return TeaModel.build(map, self);
    }

    public AddCustomLiveStreamTranscodeRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public AddCustomLiveStreamTranscodeRequest setAudioBitrate(Integer audioBitrate) {
        this.audioBitrate = audioBitrate;
        return this;
    }
    public Integer getAudioBitrate() {
        return this.audioBitrate;
    }

    public AddCustomLiveStreamTranscodeRequest setAudioChannelNum(Integer audioChannelNum) {
        this.audioChannelNum = audioChannelNum;
        return this;
    }
    public Integer getAudioChannelNum() {
        return this.audioChannelNum;
    }

    public AddCustomLiveStreamTranscodeRequest setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }
    public String getAudioCodec() {
        return this.audioCodec;
    }

    public AddCustomLiveStreamTranscodeRequest setAudioProfile(String audioProfile) {
        this.audioProfile = audioProfile;
        return this;
    }
    public String getAudioProfile() {
        return this.audioProfile;
    }

    public AddCustomLiveStreamTranscodeRequest setAudioRate(Integer audioRate) {
        this.audioRate = audioRate;
        return this;
    }
    public Integer getAudioRate() {
        return this.audioRate;
    }

    public AddCustomLiveStreamTranscodeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AddCustomLiveStreamTranscodeRequest setEncryptParameters(String encryptParameters) {
        this.encryptParameters = encryptParameters;
        return this;
    }
    public String getEncryptParameters() {
        return this.encryptParameters;
    }

    public AddCustomLiveStreamTranscodeRequest setFPS(Integer FPS) {
        this.FPS = FPS;
        return this;
    }
    public Integer getFPS() {
        return this.FPS;
    }

    public AddCustomLiveStreamTranscodeRequest setGop(String gop) {
        this.gop = gop;
        return this;
    }
    public String getGop() {
        return this.gop;
    }

    public AddCustomLiveStreamTranscodeRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public AddCustomLiveStreamTranscodeRequest setKmsKeyExpireInterval(String kmsKeyExpireInterval) {
        this.kmsKeyExpireInterval = kmsKeyExpireInterval;
        return this;
    }
    public String getKmsKeyExpireInterval() {
        return this.kmsKeyExpireInterval;
    }

    public AddCustomLiveStreamTranscodeRequest setKmsKeyID(String kmsKeyID) {
        this.kmsKeyID = kmsKeyID;
        return this;
    }
    public String getKmsKeyID() {
        return this.kmsKeyID;
    }

    public AddCustomLiveStreamTranscodeRequest setKmsUID(String kmsUID) {
        this.kmsUID = kmsUID;
        return this;
    }
    public String getKmsUID() {
        return this.kmsUID;
    }

    public AddCustomLiveStreamTranscodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddCustomLiveStreamTranscodeRequest setProfile(Integer profile) {
        this.profile = profile;
        return this;
    }
    public Integer getProfile() {
        return this.profile;
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

    public AddCustomLiveStreamTranscodeRequest setVideoBitrate(Integer videoBitrate) {
        this.videoBitrate = videoBitrate;
        return this;
    }
    public Integer getVideoBitrate() {
        return this.videoBitrate;
    }

    public AddCustomLiveStreamTranscodeRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
