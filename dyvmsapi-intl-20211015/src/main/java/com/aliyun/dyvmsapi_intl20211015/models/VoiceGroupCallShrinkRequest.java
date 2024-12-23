// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class VoiceGroupCallShrinkRequest extends TeaModel {
    @NameInMap("CalledNumber")
    public String calledNumberShrink;

    /**
     * <strong>example:</strong>
     * <p>852****1111</p>
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
     * <p>22596****</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
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
     * <p>100</p>
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
     * <p>1****01</p>
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
     * <p>2*****01</p>
     */
    @NameInMap("VoiceCode")
    public String voiceCode;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Volume")
    public Long volume;

    public static VoiceGroupCallShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        VoiceGroupCallShrinkRequest self = new VoiceGroupCallShrinkRequest();
        return TeaModel.build(map, self);
    }

    public VoiceGroupCallShrinkRequest setCalledNumberShrink(String calledNumberShrink) {
        this.calledNumberShrink = calledNumberShrink;
        return this;
    }
    public String getCalledNumberShrink() {
        return this.calledNumberShrink;
    }

    public VoiceGroupCallShrinkRequest setCallerIdNumber(String callerIdNumber) {
        this.callerIdNumber = callerIdNumber;
        return this;
    }
    public String getCallerIdNumber() {
        return this.callerIdNumber;
    }

    public VoiceGroupCallShrinkRequest setCountryId(String countryId) {
        this.countryId = countryId;
        return this;
    }
    public String getCountryId() {
        return this.countryId;
    }

    public VoiceGroupCallShrinkRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public VoiceGroupCallShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public VoiceGroupCallShrinkRequest setPlayTimes(Long playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Long getPlayTimes() {
        return this.playTimes;
    }

    public VoiceGroupCallShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public VoiceGroupCallShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public VoiceGroupCallShrinkRequest setSendType(Long sendType) {
        this.sendType = sendType;
        return this;
    }
    public Long getSendType() {
        return this.sendType;
    }

    public VoiceGroupCallShrinkRequest setSpeed(Long speed) {
        this.speed = speed;
        return this;
    }
    public Long getSpeed() {
        return this.speed;
    }

    public VoiceGroupCallShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public VoiceGroupCallShrinkRequest setTimingStart(String timingStart) {
        this.timingStart = timingStart;
        return this;
    }
    public String getTimingStart() {
        return this.timingStart;
    }

    public VoiceGroupCallShrinkRequest setTtsCode(String ttsCode) {
        this.ttsCode = ttsCode;
        return this;
    }
    public String getTtsCode() {
        return this.ttsCode;
    }

    public VoiceGroupCallShrinkRequest setTtsParam(String ttsParam) {
        this.ttsParam = ttsParam;
        return this;
    }
    public String getTtsParam() {
        return this.ttsParam;
    }

    public VoiceGroupCallShrinkRequest setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public VoiceGroupCallShrinkRequest setVolume(Long volume) {
        this.volume = volume;
        return this;
    }
    public Long getVolume() {
        return this.volume;
    }

}
