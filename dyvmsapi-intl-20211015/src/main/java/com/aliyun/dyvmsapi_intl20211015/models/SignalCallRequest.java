// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SignalCallRequest extends TeaModel {
    /**
     * <p>接收语音通知的手机号码。  号码格式：国际码+号码： 示例：85200****00。</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>主叫号码。  若您不填该参数，系统将会使用当地随机号码作为外显号码。 若您专属号码外呼，则必须传入已购买的号码，仅支持一个号码。您可以登录国际语音服务控制台，选择"号码管理"查看已购买的号码。</p>
     */
    @NameInMap("CallerIdNumber")
    public String callerIdNumber;

    /**
     * <p>国家/地区二字码，ISO2。</p>
     */
    @NameInMap("CountryId")
    public String countryId;

    /**
     * <p>预留给调用方使用的ID，最终会通过在回执消息中将此ID带回给调用方。  字符串类型，长度为1~15个字节。</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>一通电话内语音通知内容的播放次数。取值范围：1~3，默认取值3。</p>
     */
    @NameInMap("PlayTimes")
    public Long playTimes;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>发送类型：取值[1,2]。  1： 立即开始发送任务，不等待。  2： 定时开始发送任务。如果传该类型，TimingStart为必选字段。</p>
     */
    @NameInMap("SendType")
    public Long sendType;

    @NameInMap("Signature")
    public String signature;

    @NameInMap("SignatureNonce")
    public String signatureNonce;

    /**
     * <p>语速控制。取值范围为：-500~500。</p>
     */
    @NameInMap("Speed")
    public Long speed;

    /**
     * <p>任务名称。</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("Timestamp")
    public String timestamp;

    /**
     * <p>定时发送的时间。</p>
     */
    @NameInMap("TimingStart")
    public String timingStart;

    /**
     * <p>文本转语音模板的语音ID。  您可以登录国际语音服务控制台，选择"语音模板管理"-"文本转语音模板"，查看模板ID。  此参数与VoiceCode二选一必填。分别代表使用语音文件作为呼叫内容呼叫或者使用固定模板文字作为呼叫内容。</p>
     */
    @NameInMap("TtsCode")
    public String ttsCode;

    /**
     * <p>模板中的变量参数，JSON格式。</p>
     */
    @NameInMap("TtsParam")
    public String ttsParam;

    /**
     * <p>语音文件的模板ID。  您可以登录国际语音服务控制台，选择"语音模板管理"-"语音文件"，查看模板ID。  此参数与TtsCode二选一必填。分别代表使用语音文件作为呼叫内容呼叫或者使用固定模板文字作为呼叫内容。</p>
     */
    @NameInMap("VoiceCode")
    public String voiceCode;

    /**
     * <p>语音通知的播放音量。取值范围：0~100，默认取值100。</p>
     */
    @NameInMap("Volume")
    public Long volume;

    public static SignalCallRequest build(java.util.Map<String, ?> map) throws Exception {
        SignalCallRequest self = new SignalCallRequest();
        return TeaModel.build(map, self);
    }

    public SignalCallRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public SignalCallRequest setCallerIdNumber(String callerIdNumber) {
        this.callerIdNumber = callerIdNumber;
        return this;
    }
    public String getCallerIdNumber() {
        return this.callerIdNumber;
    }

    public SignalCallRequest setCountryId(String countryId) {
        this.countryId = countryId;
        return this;
    }
    public String getCountryId() {
        return this.countryId;
    }

    public SignalCallRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public SignalCallRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SignalCallRequest setPlayTimes(Long playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Long getPlayTimes() {
        return this.playTimes;
    }

    public SignalCallRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SignalCallRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SignalCallRequest setSendType(Long sendType) {
        this.sendType = sendType;
        return this;
    }
    public Long getSendType() {
        return this.sendType;
    }

    public SignalCallRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public SignalCallRequest setSignatureNonce(String signatureNonce) {
        this.signatureNonce = signatureNonce;
        return this;
    }
    public String getSignatureNonce() {
        return this.signatureNonce;
    }

    public SignalCallRequest setSpeed(Long speed) {
        this.speed = speed;
        return this;
    }
    public Long getSpeed() {
        return this.speed;
    }

    public SignalCallRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public SignalCallRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public SignalCallRequest setTimingStart(String timingStart) {
        this.timingStart = timingStart;
        return this;
    }
    public String getTimingStart() {
        return this.timingStart;
    }

    public SignalCallRequest setTtsCode(String ttsCode) {
        this.ttsCode = ttsCode;
        return this;
    }
    public String getTtsCode() {
        return this.ttsCode;
    }

    public SignalCallRequest setTtsParam(String ttsParam) {
        this.ttsParam = ttsParam;
        return this;
    }
    public String getTtsParam() {
        return this.ttsParam;
    }

    public SignalCallRequest setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public SignalCallRequest setVolume(Long volume) {
        this.volume = volume;
        return this;
    }
    public Long getVolume() {
        return this.volume;
    }

}
