// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class VoiceSingleCallRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>852****0000</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <strong>example:</strong>
     * <p>852****0001</p>
     */
    @NameInMap("CallerIdNumber")
    public String callerIdNumber;

    /**
     * <strong>example:</strong>
     * <p>HK</p>
     */
    @NameInMap("CountryId")
    public String countryId;

    /**
     * <strong>example:</strong>
     * <p>22522****</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PlayTimes")
    public Long playTimes;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SendType")
    public Long sendType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Speed")
    public Long speed;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <strong>example:</strong>
     * <p>2022-05-01T08:00:00+08:00</p>
     */
    @NameInMap("TimingStart")
    public String timingStart;

    /**
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("TtsCode")
    public String ttsCode;

    /**
     * <strong>example:</strong>
     * <p>{&quot;code&quot;:&quot;1234&quot;}</p>
     */
    @NameInMap("TtsParam")
    public String ttsParam;

    /**
     * <strong>example:</strong>
     * <p>1002</p>
     */
    @NameInMap("VoiceCode")
    public String voiceCode;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Volume")
    public Long volume;

    public static VoiceSingleCallRequest build(java.util.Map<String, ?> map) throws Exception {
        VoiceSingleCallRequest self = new VoiceSingleCallRequest();
        return TeaModel.build(map, self);
    }

    public VoiceSingleCallRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public VoiceSingleCallRequest setCallerIdNumber(String callerIdNumber) {
        this.callerIdNumber = callerIdNumber;
        return this;
    }
    public String getCallerIdNumber() {
        return this.callerIdNumber;
    }

    public VoiceSingleCallRequest setCountryId(String countryId) {
        this.countryId = countryId;
        return this;
    }
    public String getCountryId() {
        return this.countryId;
    }

    public VoiceSingleCallRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public VoiceSingleCallRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public VoiceSingleCallRequest setPlayTimes(Long playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Long getPlayTimes() {
        return this.playTimes;
    }

    public VoiceSingleCallRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public VoiceSingleCallRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public VoiceSingleCallRequest setSendType(Long sendType) {
        this.sendType = sendType;
        return this;
    }
    public Long getSendType() {
        return this.sendType;
    }

    public VoiceSingleCallRequest setSpeed(Long speed) {
        this.speed = speed;
        return this;
    }
    public Long getSpeed() {
        return this.speed;
    }

    public VoiceSingleCallRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public VoiceSingleCallRequest setTimingStart(String timingStart) {
        this.timingStart = timingStart;
        return this;
    }
    public String getTimingStart() {
        return this.timingStart;
    }

    public VoiceSingleCallRequest setTtsCode(String ttsCode) {
        this.ttsCode = ttsCode;
        return this;
    }
    public String getTtsCode() {
        return this.ttsCode;
    }

    public VoiceSingleCallRequest setTtsParam(String ttsParam) {
        this.ttsParam = ttsParam;
        return this;
    }
    public String getTtsParam() {
        return this.ttsParam;
    }

    public VoiceSingleCallRequest setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public VoiceSingleCallRequest setVolume(Long volume) {
        this.volume = volume;
        return this;
    }
    public Long getVolume() {
        return this.volume;
    }

}
