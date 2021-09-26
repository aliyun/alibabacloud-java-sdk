// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class SendCcoSmartCallRequest extends TeaModel {
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

    @NameInMap("BackgroundFileCode")
    public String backgroundFileCode;

    @NameInMap("BackgroundVolume")
    public Integer backgroundVolume;

    @NameInMap("BackgroundSpeed")
    public Integer backgroundSpeed;

    @NameInMap("EnableITN")
    public Boolean enableITN;

    public static SendCcoSmartCallRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCcoSmartCallRequest self = new SendCcoSmartCallRequest();
        return TeaModel.build(map, self);
    }

    public SendCcoSmartCallRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendCcoSmartCallRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendCcoSmartCallRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SendCcoSmartCallRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public SendCcoSmartCallRequest setCalledShowNumber(String calledShowNumber) {
        this.calledShowNumber = calledShowNumber;
        return this;
    }
    public String getCalledShowNumber() {
        return this.calledShowNumber;
    }

    public SendCcoSmartCallRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public SendCcoSmartCallRequest setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public SendCcoSmartCallRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public SendCcoSmartCallRequest setPlayTimes(Integer playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Integer getPlayTimes() {
        return this.playTimes;
    }

    public SendCcoSmartCallRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

    public SendCcoSmartCallRequest setSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }
    public Integer getSpeed() {
        return this.speed;
    }

    public SendCcoSmartCallRequest setAsrModelId(String asrModelId) {
        this.asrModelId = asrModelId;
        return this;
    }
    public String getAsrModelId() {
        return this.asrModelId;
    }

    public SendCcoSmartCallRequest setAsrBaseId(String asrBaseId) {
        this.asrBaseId = asrBaseId;
        return this;
    }
    public String getAsrBaseId() {
        return this.asrBaseId;
    }

    public SendCcoSmartCallRequest setAsrAlsAmId(String asrAlsAmId) {
        this.asrAlsAmId = asrAlsAmId;
        return this;
    }
    public String getAsrAlsAmId() {
        return this.asrAlsAmId;
    }

    public SendCcoSmartCallRequest setAsrVocabularyId(String asrVocabularyId) {
        this.asrVocabularyId = asrVocabularyId;
        return this;
    }
    public String getAsrVocabularyId() {
        return this.asrVocabularyId;
    }

    public SendCcoSmartCallRequest setRecordFlag(Boolean recordFlag) {
        this.recordFlag = recordFlag;
        return this;
    }
    public Boolean getRecordFlag() {
        return this.recordFlag;
    }

    public SendCcoSmartCallRequest setPauseTime(Integer pauseTime) {
        this.pauseTime = pauseTime;
        return this;
    }
    public Integer getPauseTime() {
        return this.pauseTime;
    }

    public SendCcoSmartCallRequest setMuteTime(Integer muteTime) {
        this.muteTime = muteTime;
        return this;
    }
    public Integer getMuteTime() {
        return this.muteTime;
    }

    public SendCcoSmartCallRequest setActionCodeBreak(Boolean actionCodeBreak) {
        this.actionCodeBreak = actionCodeBreak;
        return this;
    }
    public Boolean getActionCodeBreak() {
        return this.actionCodeBreak;
    }

    public SendCcoSmartCallRequest setDynamicId(String dynamicId) {
        this.dynamicId = dynamicId;
        return this;
    }
    public String getDynamicId() {
        return this.dynamicId;
    }

    public SendCcoSmartCallRequest setEarlyMediaAsr(Boolean earlyMediaAsr) {
        this.earlyMediaAsr = earlyMediaAsr;
        return this;
    }
    public Boolean getEarlyMediaAsr() {
        return this.earlyMediaAsr;
    }

    public SendCcoSmartCallRequest setVoiceCodeParam(String voiceCodeParam) {
        this.voiceCodeParam = voiceCodeParam;
        return this;
    }
    public String getVoiceCodeParam() {
        return this.voiceCodeParam;
    }

    public SendCcoSmartCallRequest setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public SendCcoSmartCallRequest setActionCodeTimeBreak(Integer actionCodeTimeBreak) {
        this.actionCodeTimeBreak = actionCodeTimeBreak;
        return this;
    }
    public Integer getActionCodeTimeBreak() {
        return this.actionCodeTimeBreak;
    }

    public SendCcoSmartCallRequest setTtsConf(Boolean ttsConf) {
        this.ttsConf = ttsConf;
        return this;
    }
    public Boolean getTtsConf() {
        return this.ttsConf;
    }

    public SendCcoSmartCallRequest setTtsStyle(String ttsStyle) {
        this.ttsStyle = ttsStyle;
        return this;
    }
    public String getTtsStyle() {
        return this.ttsStyle;
    }

    public SendCcoSmartCallRequest setTtsVolume(Integer ttsVolume) {
        this.ttsVolume = ttsVolume;
        return this;
    }
    public Integer getTtsVolume() {
        return this.ttsVolume;
    }

    public SendCcoSmartCallRequest setTtsSpeed(Integer ttsSpeed) {
        this.ttsSpeed = ttsSpeed;
        return this;
    }
    public Integer getTtsSpeed() {
        return this.ttsSpeed;
    }

    public SendCcoSmartCallRequest setBackgroundFileCode(String backgroundFileCode) {
        this.backgroundFileCode = backgroundFileCode;
        return this;
    }
    public String getBackgroundFileCode() {
        return this.backgroundFileCode;
    }

    public SendCcoSmartCallRequest setBackgroundVolume(Integer backgroundVolume) {
        this.backgroundVolume = backgroundVolume;
        return this;
    }
    public Integer getBackgroundVolume() {
        return this.backgroundVolume;
    }

    public SendCcoSmartCallRequest setBackgroundSpeed(Integer backgroundSpeed) {
        this.backgroundSpeed = backgroundSpeed;
        return this;
    }
    public Integer getBackgroundSpeed() {
        return this.backgroundSpeed;
    }

    public SendCcoSmartCallRequest setEnableITN(Boolean enableITN) {
        this.enableITN = enableITN;
        return this;
    }
    public Boolean getEnableITN() {
        return this.enableITN;
    }

}
