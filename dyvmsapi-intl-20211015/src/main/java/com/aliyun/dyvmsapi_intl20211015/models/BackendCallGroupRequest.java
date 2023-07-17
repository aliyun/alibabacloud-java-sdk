// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class BackendCallGroupRequest extends TeaModel {
    @NameInMap("CalledNumber")
    public java.util.List<String> calledNumber;

    @NameInMap("CallerIdNumber")
    public String callerIdNumber;

    @NameInMap("CountryId")
    public String countryId;

    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PlayTimes")
    public Long playTimes;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SendType")
    public Long sendType;

    @NameInMap("Speed")
    public Long speed;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TimingStart")
    public String timingStart;

    @NameInMap("TtsCode")
    public String ttsCode;

    @NameInMap("VoiceCode")
    public String voiceCode;

    @NameInMap("Volume")
    public Long volume;

    public static BackendCallGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        BackendCallGroupRequest self = new BackendCallGroupRequest();
        return TeaModel.build(map, self);
    }

    public BackendCallGroupRequest setCalledNumber(java.util.List<String> calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public java.util.List<String> getCalledNumber() {
        return this.calledNumber;
    }

    public BackendCallGroupRequest setCallerIdNumber(String callerIdNumber) {
        this.callerIdNumber = callerIdNumber;
        return this;
    }
    public String getCallerIdNumber() {
        return this.callerIdNumber;
    }

    public BackendCallGroupRequest setCountryId(String countryId) {
        this.countryId = countryId;
        return this;
    }
    public String getCountryId() {
        return this.countryId;
    }

    public BackendCallGroupRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public BackendCallGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BackendCallGroupRequest setPlayTimes(Long playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Long getPlayTimes() {
        return this.playTimes;
    }

    public BackendCallGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BackendCallGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BackendCallGroupRequest setSendType(Long sendType) {
        this.sendType = sendType;
        return this;
    }
    public Long getSendType() {
        return this.sendType;
    }

    public BackendCallGroupRequest setSpeed(Long speed) {
        this.speed = speed;
        return this;
    }
    public Long getSpeed() {
        return this.speed;
    }

    public BackendCallGroupRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public BackendCallGroupRequest setTimingStart(String timingStart) {
        this.timingStart = timingStart;
        return this;
    }
    public String getTimingStart() {
        return this.timingStart;
    }

    public BackendCallGroupRequest setTtsCode(String ttsCode) {
        this.ttsCode = ttsCode;
        return this;
    }
    public String getTtsCode() {
        return this.ttsCode;
    }

    public BackendCallGroupRequest setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public BackendCallGroupRequest setVolume(Long volume) {
        this.volume = volume;
        return this;
    }
    public Long getVolume() {
        return this.volume;
    }

}
