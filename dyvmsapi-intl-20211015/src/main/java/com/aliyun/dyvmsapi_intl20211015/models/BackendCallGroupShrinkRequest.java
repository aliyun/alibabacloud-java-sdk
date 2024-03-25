// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class BackendCallGroupShrinkRequest extends TeaModel {
    /**
     * <p>The called numbers. You can specify up to 50,000 phone numbers.</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumberShrink;

    /**
     * <p>The calling number.</p>
     * <br>
     * <p>If you do not specify this parameter, the system uses a local random number as the display number. If you use a dedicated number for outbound calls, you must specify the purchased number. You can specify only one number. You can log on to the VMS console and choose Number Management to view the purchased phone numbers.</p>
     */
    @NameInMap("CallerIdNumber")
    public String callerIdNumber;

    /**
     * <p>The ISO2 country code.</p>
     */
    @NameInMap("CountryId")
    public String countryId;

    /**
     * <p>The ID reserved for the caller. This ID is returned to the caller in a receipt message.</p>
     * <br>
     * <p>The value must be of the STRING type and 1 to 15 bytes in length.</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of times the audio file is played. Valid values: 1 to 3.</p>
     */
    @NameInMap("PlayTimes")
    public Long playTimes;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The delivery type. Valid values: 1 and 2.</p>
     * <br>
     * <p>1: The audio file is delivered immediately.</p>
     * <br>
     * <p>2: The audio file is delivered at a scheduled time. If you specify SendType as 2, you must specify TimingStart.</p>
     */
    @NameInMap("SendType")
    public Long sendType;

    /**
     * <p>The playback speed. Valid values: -500 to 500.</p>
     * <br>
     * <p>You must specify this parameter when the audio type is text-to-speech (TTS). You do not need to specify this parameter when you use recordings.</p>
     */
    @NameInMap("Speed")
    public Long speed;

    /**
     * <p>The task name.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The time when the audio file is scheduled to be delivered.</p>
     */
    @NameInMap("TimingStart")
    public String timingStart;

    /**
     * <p>The voice template ID of the audio file.</p>
     * <br>
     * <p>You can log on to the VMS console and choose Voice Call Template > Audio File to view the template ID.</p>
     * <br>
     * <p>You must specify either TtsCode or VoiceCode. You can specify TtsCode to use the audio file as the call content. Alternatively, you can specify VoiceCode to use preset text as the call content.</p>
     */
    @NameInMap("TtsCode")
    public String ttsCode;

    /**
     * <p>The TTS template ID.</p>
     * <br>
     * <p>You can log on to the VMS console and choose Voice Call Template > TTS Template to view the template ID.</p>
     * <br>
     * <p>You must specify either TtsCode or VoiceCode. You can specify TtsCode to use the audio file as the call content. Alternatively, you can specify VoiceCode to use preset text as the call content.</p>
     */
    @NameInMap("VoiceCode")
    public String voiceCode;

    /**
     * <p>The playback volume of the audio file. Valid values: 0 to 100. Default value: 100.</p>
     */
    @NameInMap("Volume")
    public Long volume;

    public static BackendCallGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BackendCallGroupShrinkRequest self = new BackendCallGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BackendCallGroupShrinkRequest setCalledNumberShrink(String calledNumberShrink) {
        this.calledNumberShrink = calledNumberShrink;
        return this;
    }
    public String getCalledNumberShrink() {
        return this.calledNumberShrink;
    }

    public BackendCallGroupShrinkRequest setCallerIdNumber(String callerIdNumber) {
        this.callerIdNumber = callerIdNumber;
        return this;
    }
    public String getCallerIdNumber() {
        return this.callerIdNumber;
    }

    public BackendCallGroupShrinkRequest setCountryId(String countryId) {
        this.countryId = countryId;
        return this;
    }
    public String getCountryId() {
        return this.countryId;
    }

    public BackendCallGroupShrinkRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public BackendCallGroupShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BackendCallGroupShrinkRequest setPlayTimes(Long playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Long getPlayTimes() {
        return this.playTimes;
    }

    public BackendCallGroupShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BackendCallGroupShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BackendCallGroupShrinkRequest setSendType(Long sendType) {
        this.sendType = sendType;
        return this;
    }
    public Long getSendType() {
        return this.sendType;
    }

    public BackendCallGroupShrinkRequest setSpeed(Long speed) {
        this.speed = speed;
        return this;
    }
    public Long getSpeed() {
        return this.speed;
    }

    public BackendCallGroupShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public BackendCallGroupShrinkRequest setTimingStart(String timingStart) {
        this.timingStart = timingStart;
        return this;
    }
    public String getTimingStart() {
        return this.timingStart;
    }

    public BackendCallGroupShrinkRequest setTtsCode(String ttsCode) {
        this.ttsCode = ttsCode;
        return this;
    }
    public String getTtsCode() {
        return this.ttsCode;
    }

    public BackendCallGroupShrinkRequest setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public BackendCallGroupShrinkRequest setVolume(Long volume) {
        this.volume = volume;
        return this;
    }
    public Long getVolume() {
        return this.volume;
    }

}
