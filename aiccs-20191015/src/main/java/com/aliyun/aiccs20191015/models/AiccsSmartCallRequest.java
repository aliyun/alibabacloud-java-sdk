// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AiccsSmartCallRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("CalledShowNumber")
    public String calledShowNumber;

    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("VoiceCode")
    public String voiceCode;

    @NameInMap("OutId")
    public String outId;

    @NameInMap("PlayTimes")
    public Integer playTimes;

    @NameInMap("Volume")
    public Integer volume;

    @NameInMap("Speed")
    public Integer speed;

    @NameInMap("AsrModelId")
    public String asrModelId;

    @NameInMap("AsrBaseId")
    public String asrBaseId;

    @NameInMap("AsrAlsAmId")
    public String asrAlsAmId;

    @NameInMap("AsrVocabularyId")
    public String asrVocabularyId;

    @NameInMap("RecordFlag")
    public Boolean recordFlag;

    @NameInMap("PauseTime")
    public Integer pauseTime;

    @NameInMap("MuteTime")
    public Integer muteTime;

    @NameInMap("ActionCodeBreak")
    public Boolean actionCodeBreak;

    @NameInMap("DynamicId")
    public String dynamicId;

    @NameInMap("EarlyMediaAsr")
    public Boolean earlyMediaAsr;

    @NameInMap("VoiceCodeParam")
    public String voiceCodeParam;

    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    @NameInMap("ActionCodeTimeBreak")
    public Integer actionCodeTimeBreak;

    @NameInMap("TtsConf")
    public Boolean ttsConf;

    @NameInMap("TtsStyle")
    public String ttsStyle;

    @NameInMap("TtsVolume")
    public Integer ttsVolume;

    @NameInMap("TtsSpeed")
    public Integer ttsSpeed;

    @NameInMap("EnableITN")
    public Boolean enableITN;

    @NameInMap("BackgroundFileCode")
    public String backgroundFileCode;

    @NameInMap("BackgroundVolume")
    public Integer backgroundVolume;

    @NameInMap("BackgroundSpeed")
    public Integer backgroundSpeed;

    public static AiccsSmartCallRequest build(java.util.Map<String, ?> map) throws Exception {
        AiccsSmartCallRequest self = new AiccsSmartCallRequest();
        return TeaModel.build(map, self);
    }

    public AiccsSmartCallRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AiccsSmartCallRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AiccsSmartCallRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AiccsSmartCallRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public AiccsSmartCallRequest setCalledShowNumber(String calledShowNumber) {
        this.calledShowNumber = calledShowNumber;
        return this;
    }
    public String getCalledShowNumber() {
        return this.calledShowNumber;
    }

    public AiccsSmartCallRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public AiccsSmartCallRequest setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public AiccsSmartCallRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public AiccsSmartCallRequest setPlayTimes(Integer playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Integer getPlayTimes() {
        return this.playTimes;
    }

    public AiccsSmartCallRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

    public AiccsSmartCallRequest setSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }
    public Integer getSpeed() {
        return this.speed;
    }

    public AiccsSmartCallRequest setAsrModelId(String asrModelId) {
        this.asrModelId = asrModelId;
        return this;
    }
    public String getAsrModelId() {
        return this.asrModelId;
    }

    public AiccsSmartCallRequest setAsrBaseId(String asrBaseId) {
        this.asrBaseId = asrBaseId;
        return this;
    }
    public String getAsrBaseId() {
        return this.asrBaseId;
    }

    public AiccsSmartCallRequest setAsrAlsAmId(String asrAlsAmId) {
        this.asrAlsAmId = asrAlsAmId;
        return this;
    }
    public String getAsrAlsAmId() {
        return this.asrAlsAmId;
    }

    public AiccsSmartCallRequest setAsrVocabularyId(String asrVocabularyId) {
        this.asrVocabularyId = asrVocabularyId;
        return this;
    }
    public String getAsrVocabularyId() {
        return this.asrVocabularyId;
    }

    public AiccsSmartCallRequest setRecordFlag(Boolean recordFlag) {
        this.recordFlag = recordFlag;
        return this;
    }
    public Boolean getRecordFlag() {
        return this.recordFlag;
    }

    public AiccsSmartCallRequest setPauseTime(Integer pauseTime) {
        this.pauseTime = pauseTime;
        return this;
    }
    public Integer getPauseTime() {
        return this.pauseTime;
    }

    public AiccsSmartCallRequest setMuteTime(Integer muteTime) {
        this.muteTime = muteTime;
        return this;
    }
    public Integer getMuteTime() {
        return this.muteTime;
    }

    public AiccsSmartCallRequest setActionCodeBreak(Boolean actionCodeBreak) {
        this.actionCodeBreak = actionCodeBreak;
        return this;
    }
    public Boolean getActionCodeBreak() {
        return this.actionCodeBreak;
    }

    public AiccsSmartCallRequest setDynamicId(String dynamicId) {
        this.dynamicId = dynamicId;
        return this;
    }
    public String getDynamicId() {
        return this.dynamicId;
    }

    public AiccsSmartCallRequest setEarlyMediaAsr(Boolean earlyMediaAsr) {
        this.earlyMediaAsr = earlyMediaAsr;
        return this;
    }
    public Boolean getEarlyMediaAsr() {
        return this.earlyMediaAsr;
    }

    public AiccsSmartCallRequest setVoiceCodeParam(String voiceCodeParam) {
        this.voiceCodeParam = voiceCodeParam;
        return this;
    }
    public String getVoiceCodeParam() {
        return this.voiceCodeParam;
    }

    public AiccsSmartCallRequest setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public AiccsSmartCallRequest setActionCodeTimeBreak(Integer actionCodeTimeBreak) {
        this.actionCodeTimeBreak = actionCodeTimeBreak;
        return this;
    }
    public Integer getActionCodeTimeBreak() {
        return this.actionCodeTimeBreak;
    }

    public AiccsSmartCallRequest setTtsConf(Boolean ttsConf) {
        this.ttsConf = ttsConf;
        return this;
    }
    public Boolean getTtsConf() {
        return this.ttsConf;
    }

    public AiccsSmartCallRequest setTtsStyle(String ttsStyle) {
        this.ttsStyle = ttsStyle;
        return this;
    }
    public String getTtsStyle() {
        return this.ttsStyle;
    }

    public AiccsSmartCallRequest setTtsVolume(Integer ttsVolume) {
        this.ttsVolume = ttsVolume;
        return this;
    }
    public Integer getTtsVolume() {
        return this.ttsVolume;
    }

    public AiccsSmartCallRequest setTtsSpeed(Integer ttsSpeed) {
        this.ttsSpeed = ttsSpeed;
        return this;
    }
    public Integer getTtsSpeed() {
        return this.ttsSpeed;
    }

    public AiccsSmartCallRequest setEnableITN(Boolean enableITN) {
        this.enableITN = enableITN;
        return this;
    }
    public Boolean getEnableITN() {
        return this.enableITN;
    }

    public AiccsSmartCallRequest setBackgroundFileCode(String backgroundFileCode) {
        this.backgroundFileCode = backgroundFileCode;
        return this;
    }
    public String getBackgroundFileCode() {
        return this.backgroundFileCode;
    }

    public AiccsSmartCallRequest setBackgroundVolume(Integer backgroundVolume) {
        this.backgroundVolume = backgroundVolume;
        return this;
    }
    public Integer getBackgroundVolume() {
        return this.backgroundVolume;
    }

    public AiccsSmartCallRequest setBackgroundSpeed(Integer backgroundSpeed) {
        this.backgroundSpeed = backgroundSpeed;
        return this;
    }
    public Integer getBackgroundSpeed() {
        return this.backgroundSpeed;
    }

}
