// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AiccsSmartCallRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ActionCodeBreak")
    public Boolean actionCodeBreak;

    /**
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("ActionCodeTimeBreak")
    public Integer actionCodeTimeBreak;

    /**
     * <strong>example:</strong>
     * <p>23387****</p>
     */
    @NameInMap("AsrAlsAmId")
    public String asrAlsAmId;

    /**
     * <strong>example:</strong>
     * <p>customer_service_8k</p>
     */
    @NameInMap("AsrBaseId")
    public String asrBaseId;

    /**
     * <strong>example:</strong>
     * <p>bf71664d30d2478fb8cb8c39c6b6****</p>
     */
    @NameInMap("AsrModelId")
    public String asrModelId;

    /**
     * <strong>example:</strong>
     * <p>6689****</p>
     */
    @NameInMap("AsrVocabularyId")
    public String asrVocabularyId;

    /**
     * <strong>example:</strong>
     * <p>2d4c-4e78-8d2a-afbb06cf****.wav</p>
     */
    @NameInMap("BackgroundFileCode")
    public String backgroundFileCode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BackgroundSpeed")
    public Integer backgroundSpeed;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BackgroundVolume")
    public Integer backgroundVolume;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1862222****</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0571000****</p>
     */
    @NameInMap("CalledShowNumber")
    public String calledShowNumber;

    /**
     * <strong>example:</strong>
     * <p>2234****</p>
     */
    @NameInMap("DynamicId")
    public String dynamicId;

    /**
     * <strong>example:</strong>
     * <p>fasle</p>
     */
    @NameInMap("EarlyMediaAsr")
    public Boolean earlyMediaAsr;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableITN")
    public Boolean enableITN;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("MuteTime")
    public Integer muteTime;

    /**
     * <strong>example:</strong>
     * <p>222356****</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("PauseTime")
    public Integer pauseTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PlayTimes")
    public Integer playTimes;

    /**
     * <strong>example:</strong>
     * <p>aiccs</p>
     */
    @NameInMap("ProdCode")
    public String prodCode;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RecordFlag")
    public Boolean recordFlag;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Speed")
    public Integer speed;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TtsConf")
    public Boolean ttsConf;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TtsSpeed")
    public Integer ttsSpeed;

    /**
     * <strong>example:</strong>
     * <p>xiaoyun</p>
     */
    @NameInMap("TtsStyle")
    public String ttsStyle;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TtsVolume")
    public Integer ttsVolume;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2d4c-4e78-8d2a-afbb06cf****.wav,$name$</p>
     */
    @NameInMap("VoiceCode")
    public String voiceCode;

    @NameInMap("VoiceCodeParam")
    public String voiceCodeParam;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Volume")
    public Integer volume;

    public static AiccsSmartCallRequest build(java.util.Map<String, ?> map) throws Exception {
        AiccsSmartCallRequest self = new AiccsSmartCallRequest();
        return TeaModel.build(map, self);
    }

    public AiccsSmartCallRequest setActionCodeBreak(Boolean actionCodeBreak) {
        this.actionCodeBreak = actionCodeBreak;
        return this;
    }
    public Boolean getActionCodeBreak() {
        return this.actionCodeBreak;
    }

    public AiccsSmartCallRequest setActionCodeTimeBreak(Integer actionCodeTimeBreak) {
        this.actionCodeTimeBreak = actionCodeTimeBreak;
        return this;
    }
    public Integer getActionCodeTimeBreak() {
        return this.actionCodeTimeBreak;
    }

    public AiccsSmartCallRequest setAsrAlsAmId(String asrAlsAmId) {
        this.asrAlsAmId = asrAlsAmId;
        return this;
    }
    public String getAsrAlsAmId() {
        return this.asrAlsAmId;
    }

    public AiccsSmartCallRequest setAsrBaseId(String asrBaseId) {
        this.asrBaseId = asrBaseId;
        return this;
    }
    public String getAsrBaseId() {
        return this.asrBaseId;
    }

    public AiccsSmartCallRequest setAsrModelId(String asrModelId) {
        this.asrModelId = asrModelId;
        return this;
    }
    public String getAsrModelId() {
        return this.asrModelId;
    }

    public AiccsSmartCallRequest setAsrVocabularyId(String asrVocabularyId) {
        this.asrVocabularyId = asrVocabularyId;
        return this;
    }
    public String getAsrVocabularyId() {
        return this.asrVocabularyId;
    }

    public AiccsSmartCallRequest setBackgroundFileCode(String backgroundFileCode) {
        this.backgroundFileCode = backgroundFileCode;
        return this;
    }
    public String getBackgroundFileCode() {
        return this.backgroundFileCode;
    }

    public AiccsSmartCallRequest setBackgroundSpeed(Integer backgroundSpeed) {
        this.backgroundSpeed = backgroundSpeed;
        return this;
    }
    public Integer getBackgroundSpeed() {
        return this.backgroundSpeed;
    }

    public AiccsSmartCallRequest setBackgroundVolume(Integer backgroundVolume) {
        this.backgroundVolume = backgroundVolume;
        return this;
    }
    public Integer getBackgroundVolume() {
        return this.backgroundVolume;
    }

    public AiccsSmartCallRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public AiccsSmartCallRequest setCalledShowNumber(String calledShowNumber) {
        this.calledShowNumber = calledShowNumber;
        return this;
    }
    public String getCalledShowNumber() {
        return this.calledShowNumber;
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

    public AiccsSmartCallRequest setEnableITN(Boolean enableITN) {
        this.enableITN = enableITN;
        return this;
    }
    public Boolean getEnableITN() {
        return this.enableITN;
    }

    public AiccsSmartCallRequest setMuteTime(Integer muteTime) {
        this.muteTime = muteTime;
        return this;
    }
    public Integer getMuteTime() {
        return this.muteTime;
    }

    public AiccsSmartCallRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public AiccsSmartCallRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AiccsSmartCallRequest setPauseTime(Integer pauseTime) {
        this.pauseTime = pauseTime;
        return this;
    }
    public Integer getPauseTime() {
        return this.pauseTime;
    }

    public AiccsSmartCallRequest setPlayTimes(Integer playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Integer getPlayTimes() {
        return this.playTimes;
    }

    public AiccsSmartCallRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public AiccsSmartCallRequest setRecordFlag(Boolean recordFlag) {
        this.recordFlag = recordFlag;
        return this;
    }
    public Boolean getRecordFlag() {
        return this.recordFlag;
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

    public AiccsSmartCallRequest setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public AiccsSmartCallRequest setSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }
    public Integer getSpeed() {
        return this.speed;
    }

    public AiccsSmartCallRequest setTtsConf(Boolean ttsConf) {
        this.ttsConf = ttsConf;
        return this;
    }
    public Boolean getTtsConf() {
        return this.ttsConf;
    }

    public AiccsSmartCallRequest setTtsSpeed(Integer ttsSpeed) {
        this.ttsSpeed = ttsSpeed;
        return this;
    }
    public Integer getTtsSpeed() {
        return this.ttsSpeed;
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

    public AiccsSmartCallRequest setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public AiccsSmartCallRequest setVoiceCodeParam(String voiceCodeParam) {
        this.voiceCodeParam = voiceCodeParam;
        return this;
    }
    public String getVoiceCodeParam() {
        return this.voiceCodeParam;
    }

    public AiccsSmartCallRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

}
