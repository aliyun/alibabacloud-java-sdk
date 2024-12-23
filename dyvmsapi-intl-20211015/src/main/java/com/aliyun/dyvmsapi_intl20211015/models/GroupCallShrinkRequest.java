// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class GroupCallShrinkRequest extends TeaModel {
    /**
     * <p>被叫号码。上限为5万个。</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumberShrink;

    /**
     * <p>主叫号码。  若您不填该参数，系统将会使用当地随机号码作为外显号码。 若您专属号码外呼，则必须传入已购买的号码，仅支持一个号码。您可以登录国际语音服务控制台，选择&quot;号码管理&quot;查看已购买的号码。</p>
     * 
     * <strong>example:</strong>
     * <p>852****1111</p>
     */
    @NameInMap("CallerIdNumber")
    public String callerIdNumber;

    /**
     * <p>国家/地区二字码，ISO2。</p>
     * 
     * <strong>example:</strong>
     * <p>HK</p>
     */
    @NameInMap("CountryId")
    public String countryId;

    /**
     * <p>预留给调用方使用的ID，最终会通过在回执消息中将此ID带回给调用方。  字符串类型，长度为1~15个字节。</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>语音文件的播放次数。取值范围：1~3。</p>
     * 
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
     * <p>发送类型：取值[1,2]。  1： 立即开始发送任务，不等待。  2： 定时开始发送任务。如果传该类型，TimingStart为必选字段。</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SendType")
    public Long sendType;

    /**
     * <strong>example:</strong>
     * <p>s****************D</p>
     */
    @NameInMap("Signature")
    public String signature;

    /**
     * <strong>example:</strong>
     * <p>l*********y</p>
     */
    @NameInMap("SignatureNonce")
    public String signatureNonce;

    /**
     * <p>语速控制，取值范围：-500~500。  音频类型为TTS时必传。录音文件可不传。</p>
     * 
     * <strong>example:</strong>
     * <p>94</p>
     */
    @NameInMap("Speed")
    public Long speed;

    /**
     * <p>任务名称。</p>
     * 
     * <strong>example:</strong>
     * <p>群呼任务</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <strong>example:</strong>
     * <p>20**-**-******10Z</p>
     */
    @NameInMap("Timestamp")
    public String timestamp;

    /**
     * <p>2022-05-01T08:00:00+08:00</p>
     * 
     * <strong>example:</strong>
     * <p>定时发送的时间。</p>
     */
    @NameInMap("TimingStart")
    public String timingStart;

    /**
     * <p>文本转语音的模板ID。  您可以登录国际语音服务控制台，选择&quot;语音模板管理&quot;-&quot;文本转语音模板&quot;，查看模板ID。  此参数与VoiceCode二选一必填。分别代表使用语音文件作为呼叫内容呼叫或者使用固定模板文字作为呼叫内容。</p>
     * 
     * <strong>example:</strong>
     * <p>1****01</p>
     */
    @NameInMap("TtsCode")
    public String ttsCode;

    /**
     * <p>模板中的变量参数，JSON格式。</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;code&quot;:&quot;1234&quot;}</p>
     */
    @NameInMap("TtsParam")
    public String ttsParam;

    /**
     * <p>语音文件的模板ID。  您可以登录国际语音服务控制台，选择&quot;语音模板管理&quot;-&quot;语音文件&quot;，查看模板ID。  此参数与TtsCode二选一必填。分别代表使用语音文件作为呼叫内容呼叫或者使用固定模板文字作为呼叫内容。</p>
     * 
     * <strong>example:</strong>
     * <p>2*****01</p>
     */
    @NameInMap("VoiceCode")
    public String voiceCode;

    /**
     * <p>语音文件播放的音量。取值范围：0~100，默认取值100。</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("Volume")
    public Long volume;

    public static GroupCallShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GroupCallShrinkRequest self = new GroupCallShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GroupCallShrinkRequest setCalledNumberShrink(String calledNumberShrink) {
        this.calledNumberShrink = calledNumberShrink;
        return this;
    }
    public String getCalledNumberShrink() {
        return this.calledNumberShrink;
    }

    public GroupCallShrinkRequest setCallerIdNumber(String callerIdNumber) {
        this.callerIdNumber = callerIdNumber;
        return this;
    }
    public String getCallerIdNumber() {
        return this.callerIdNumber;
    }

    public GroupCallShrinkRequest setCountryId(String countryId) {
        this.countryId = countryId;
        return this;
    }
    public String getCountryId() {
        return this.countryId;
    }

    public GroupCallShrinkRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public GroupCallShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GroupCallShrinkRequest setPlayTimes(Long playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Long getPlayTimes() {
        return this.playTimes;
    }

    public GroupCallShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GroupCallShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GroupCallShrinkRequest setSendType(Long sendType) {
        this.sendType = sendType;
        return this;
    }
    public Long getSendType() {
        return this.sendType;
    }

    public GroupCallShrinkRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public GroupCallShrinkRequest setSignatureNonce(String signatureNonce) {
        this.signatureNonce = signatureNonce;
        return this;
    }
    public String getSignatureNonce() {
        return this.signatureNonce;
    }

    public GroupCallShrinkRequest setSpeed(Long speed) {
        this.speed = speed;
        return this;
    }
    public Long getSpeed() {
        return this.speed;
    }

    public GroupCallShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public GroupCallShrinkRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public GroupCallShrinkRequest setTimingStart(String timingStart) {
        this.timingStart = timingStart;
        return this;
    }
    public String getTimingStart() {
        return this.timingStart;
    }

    public GroupCallShrinkRequest setTtsCode(String ttsCode) {
        this.ttsCode = ttsCode;
        return this;
    }
    public String getTtsCode() {
        return this.ttsCode;
    }

    public GroupCallShrinkRequest setTtsParam(String ttsParam) {
        this.ttsParam = ttsParam;
        return this;
    }
    public String getTtsParam() {
        return this.ttsParam;
    }

    public GroupCallShrinkRequest setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public GroupCallShrinkRequest setVolume(Long volume) {
        this.volume = volume;
        return this;
    }
    public Long getVolume() {
        return this.volume;
    }

}
