// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class VoiceModelResponse extends TeaModel {
    @NameInMap("resourceTypeDesc")
    public String resourceTypeDesc;

    @NameInMap("useScene")
    public String useScene;

    @NameInMap("voiceDesc")
    public String voiceDesc;

    @NameInMap("voiceGender")
    public String voiceGender;

    @NameInMap("voiceId")
    public Long voiceId;

    @NameInMap("voiceLanguage")
    public String voiceLanguage;

    @NameInMap("voiceModel")
    public String voiceModel;

    @NameInMap("voiceName")
    public String voiceName;

    @NameInMap("voiceType")
    public String voiceType;

    @NameInMap("voiceUrl")
    public String voiceUrl;

    public static VoiceModelResponse build(java.util.Map<String, ?> map) throws Exception {
        VoiceModelResponse self = new VoiceModelResponse();
        return TeaModel.build(map, self);
    }

    public VoiceModelResponse setResourceTypeDesc(String resourceTypeDesc) {
        this.resourceTypeDesc = resourceTypeDesc;
        return this;
    }
    public String getResourceTypeDesc() {
        return this.resourceTypeDesc;
    }

    public VoiceModelResponse setUseScene(String useScene) {
        this.useScene = useScene;
        return this;
    }
    public String getUseScene() {
        return this.useScene;
    }

    public VoiceModelResponse setVoiceDesc(String voiceDesc) {
        this.voiceDesc = voiceDesc;
        return this;
    }
    public String getVoiceDesc() {
        return this.voiceDesc;
    }

    public VoiceModelResponse setVoiceGender(String voiceGender) {
        this.voiceGender = voiceGender;
        return this;
    }
    public String getVoiceGender() {
        return this.voiceGender;
    }

    public VoiceModelResponse setVoiceId(Long voiceId) {
        this.voiceId = voiceId;
        return this;
    }
    public Long getVoiceId() {
        return this.voiceId;
    }

    public VoiceModelResponse setVoiceLanguage(String voiceLanguage) {
        this.voiceLanguage = voiceLanguage;
        return this;
    }
    public String getVoiceLanguage() {
        return this.voiceLanguage;
    }

    public VoiceModelResponse setVoiceModel(String voiceModel) {
        this.voiceModel = voiceModel;
        return this;
    }
    public String getVoiceModel() {
        return this.voiceModel;
    }

    public VoiceModelResponse setVoiceName(String voiceName) {
        this.voiceName = voiceName;
        return this;
    }
    public String getVoiceName() {
        return this.voiceName;
    }

    public VoiceModelResponse setVoiceType(String voiceType) {
        this.voiceType = voiceType;
        return this;
    }
    public String getVoiceType() {
        return this.voiceType;
    }

    public VoiceModelResponse setVoiceUrl(String voiceUrl) {
        this.voiceUrl = voiceUrl;
        return this;
    }
    public String getVoiceUrl() {
        return this.voiceUrl;
    }

}
