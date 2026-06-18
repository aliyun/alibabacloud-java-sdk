// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class SendCcoSmartCallRequest extends TeaModel {
    /**
     * <p>Indicates whether the initial playback file can be interrupted. The default value is <strong>true</strong>, meaning the initial playback file can be interrupted.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ActionCodeBreak")
    public Boolean actionCodeBreak;

    /**
     * <p>Interrupts based on the user\&quot;s continuous speaking duration. Takes effect only when ActionCodeBreak is set to <strong>true</strong>. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("ActionCodeTimeBreak")
    public Integer actionCodeTimeBreak;

    /**
     * <p>Acoustic model ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AsrAlsAmId")
    public String asrAlsAmId;

    /**
     * <p>ASR foundation model.</p>
     * <ul>
     * <li><strong>customer_service_8k</strong>: Mandarin.</li>
     * <li><strong>dialect_customer_service_8k</strong>: Strong accent.</li>
     * <li>If only <strong>asrModelId</strong> is set, the specified ASR model is used.</li>
     * <li>If only <strong>AsrBaseId</strong> is set, the specified ASR foundation model is used.</li>
     * <li>If neither is set, the default ASR foundation model is used. By default, <strong>AsrBaseId</strong> is <strong>customer_service_8k</strong>, which corresponds to the Mandarin ASR foundation model.</li>
     * <li>If both are set, ensure they correctly correspond to each other.</li>
     * </ul>
     * <blockquote>
     * <p>When invoking the <strong>SendCcoSmartCall</strong> API, you must specify the ASR model to use. We recommend that you specify either <strong>asrModelId</strong> or <strong>AsrBaseId</strong>, but not both.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>customer_service_8k</p>
     */
    @NameInMap("AsrBaseId")
    public String asrBaseId;

    /**
     * <p>The ASR model ID. You can view the ASR model ID on the <a href="https://aiccs.console.aliyun.com/sentence/model/private?spm=a2c4g.11186623.0.0.7f9b2964fYSGv4">ASR Model Management Page</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>bf71664d30d2478fb8cb8c39c6b6****</p>
     */
    @NameInMap("AsrModelId")
    public String asrModelId;

    /**
     * <p>Hotword ID. You can view the ASR hotword ID on the <a href="https://aiccs.console.aliyun.com/sentence/vocab?spm=a2c4g.11186623.0.0.7f9bf965IKBpsi">ASR Hotword Management Page</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AsrVocabularyId")
    public String asrVocabularyId;

    /**
     * <p>ID of the background audio file played during the conversation between the user and the robot. You can log on to the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>, choose <strong>Intelligent Interaction &gt; Audio File Management</strong>, and click <strong>View Details</strong> to obtain the corresponding audio ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2d4c-4e78-8d2a-afbb06cf****.wav</p>
     */
    @NameInMap("BackgroundFileCode")
    public String backgroundFileCode;

    /**
     * <p>This parameter is not currently supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BackgroundSpeed")
    public Integer backgroundSpeed;

    /**
     * <p>This parameter is not currently supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BackgroundVolume")
    public Integer backgroundVolume;

    /**
     * <p>Callee number. Only numbers from the Chinese mainland are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>137****0000</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>Called party display number. This must be a purchased number.</p>
     * <p>You can log on to the <a href="https://aiccs.console.aliyun.com/overview?spm=a2c4g.11186623.0.0.7f9bf9658X6jte">Contact Center console</a> to view your purchased numbers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0571****0000</p>
     */
    @NameInMap("CalledShowNumber")
    public String calledShowNumber;

    /**
     * <p>A dynamic extension ID reserved for the caller. This ID is returned in the webhook address and used as a developer identity for the customer.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("DynamicId")
    public String dynamicId;

    /**
     * <p>The early media speech recognition identity. When set to true, it records the reason why the call was not answered. The default value is <strong>false</strong>, meaning this feature is disabled.</p>
     * <blockquote>
     * <p>To enable early media speech recognition, you must manually set this parameter to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EarlyMediaAsr")
    public Boolean earlyMediaAsr;

    /**
     * <p>Whether to execute ITN in post-processing.</p>
     * <blockquote>
     * <p>When set to <strong>true</strong>, Chinese numerals are converted to Arabic numerals in the output. The default value is <strong>false</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableITN")
    public Boolean enableITN;

    /**
     * <p>Mute duration, used to set how long the user remains silent before the call ends. The unit is milliseconds, and the valid range is <strong>1000–20000</strong>.  </p>
     * <ul>
     * <li>If the specified value is outside this range, the default MuteTime is <strong>10000</strong>.  </li>
     * <li>This parameter can be dynamically set during the call, and the last setting takes effect.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("MuteTime")
    public Integer muteTime;

    /**
     * <p>An ID reserved for the caller, which will ultimately be returned to the caller in the receipt message.<br>It is of string type and must be 1 to 15 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>222356****</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The pause duration. This parameter specifies how long a user must pause to indicate the end of a sentence. Unit: milliseconds. Valid values are <strong>300–1200</strong>. If the specified value is outside this range, PauseTime defaults to <strong>800</strong>.</p>
     * <blockquote>
     * <p>The first setting takes effect; subsequent settings are ignored.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("PauseTime")
    public Integer pauseTime;

    /**
     * <p>This parameter is not currently supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PlayTimes")
    public Integer playTimes;

    /**
     * <p>Product name. Default value: <strong>aiccs</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>aiccs</p>
     */
    @NameInMap("ProdCode")
    public String prodCode;

    /**
     * <p>Whether to record during the call.</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
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
     * <p>The maximum call duration, in seconds. The call is automatically disconnected after timeout.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    /**
     * <p>This parameter is currently not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Speed")
    public Integer speed;

    /**
     * <p>Whether to configure TTS voice parameters.</p>
     * <ul>
     * <li>If set to <strong>true</strong>, you must configure the voice style using the TtsStyle, TtsVolume, and TtsSpeed parameters.</li>
     * <li>If set to <strong>false</strong>, related parameters do not take effect, even if configured.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TtsConf")
    public Boolean ttsConf;

    /**
     * <p>The playback speed of the TTS variable. Valid values range from -200 to 200. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TtsSpeed")
    public Integer ttsSpeed;

    /**
     * <p>The voice style for TTS variable playback. The default value is <strong>xiaoyun</strong>. For available styles, see the voice style list.</p>
     * 
     * <strong>example:</strong>
     * <p>xiaoyun</p>
     */
    @NameInMap("TtsStyle")
    public String ttsStyle;

    /**
     * <p>Playback volume for TTS variables. Valid values: <strong>0–100</strong>. Default value: <strong>0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TtsVolume")
    public Integer ttsVolume;

    /**
     * <p>The audio playback file for Intelligent outbound calls, which supports both network files and TTS. Multiple files and TTS parameters can be mixed and separated by commas (,). The replacement values for TTS parameters are specified in <strong>VoiceCodeParam</strong>.</p>
     * <ul>
     * <li>When using a network file for playback: Set the VoiceCode parameter to a publicly accessible URL of the audio file. We recommend using a .wav audio file with a sampling frequency of 8000 Hz or 16000 Hz.</li>
     * <li>When using TTS for playback: Set the VoiceCode parameter to a variable name such as $name$, and define the corresponding content for this variable in VoiceCodeParam.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2d4c-4e78-8d2a-afbb06cf****.wav,$name$</p>
     */
    @NameInMap("VoiceCode")
    public String voiceCode;

    /**
     * <p>A JSON-formatted string for passing TTS parameters. It must correspond to the TTS parameters of VoiceCode.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;喂，你好&quot;}</p>
     */
    @NameInMap("VoiceCodeParam")
    public String voiceCodeParam;

    /**
     * <p>Playback volume for user audio. Valid values: –4 to 4. We recommend setting it to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Volume")
    public Integer volume;

    public static SendCcoSmartCallRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCcoSmartCallRequest self = new SendCcoSmartCallRequest();
        return TeaModel.build(map, self);
    }

    public SendCcoSmartCallRequest setActionCodeBreak(Boolean actionCodeBreak) {
        this.actionCodeBreak = actionCodeBreak;
        return this;
    }
    public Boolean getActionCodeBreak() {
        return this.actionCodeBreak;
    }

    public SendCcoSmartCallRequest setActionCodeTimeBreak(Integer actionCodeTimeBreak) {
        this.actionCodeTimeBreak = actionCodeTimeBreak;
        return this;
    }
    public Integer getActionCodeTimeBreak() {
        return this.actionCodeTimeBreak;
    }

    public SendCcoSmartCallRequest setAsrAlsAmId(String asrAlsAmId) {
        this.asrAlsAmId = asrAlsAmId;
        return this;
    }
    public String getAsrAlsAmId() {
        return this.asrAlsAmId;
    }

    public SendCcoSmartCallRequest setAsrBaseId(String asrBaseId) {
        this.asrBaseId = asrBaseId;
        return this;
    }
    public String getAsrBaseId() {
        return this.asrBaseId;
    }

    public SendCcoSmartCallRequest setAsrModelId(String asrModelId) {
        this.asrModelId = asrModelId;
        return this;
    }
    public String getAsrModelId() {
        return this.asrModelId;
    }

    public SendCcoSmartCallRequest setAsrVocabularyId(String asrVocabularyId) {
        this.asrVocabularyId = asrVocabularyId;
        return this;
    }
    public String getAsrVocabularyId() {
        return this.asrVocabularyId;
    }

    public SendCcoSmartCallRequest setBackgroundFileCode(String backgroundFileCode) {
        this.backgroundFileCode = backgroundFileCode;
        return this;
    }
    public String getBackgroundFileCode() {
        return this.backgroundFileCode;
    }

    public SendCcoSmartCallRequest setBackgroundSpeed(Integer backgroundSpeed) {
        this.backgroundSpeed = backgroundSpeed;
        return this;
    }
    public Integer getBackgroundSpeed() {
        return this.backgroundSpeed;
    }

    public SendCcoSmartCallRequest setBackgroundVolume(Integer backgroundVolume) {
        this.backgroundVolume = backgroundVolume;
        return this;
    }
    public Integer getBackgroundVolume() {
        return this.backgroundVolume;
    }

    public SendCcoSmartCallRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public SendCcoSmartCallRequest setCalledShowNumber(String calledShowNumber) {
        this.calledShowNumber = calledShowNumber;
        return this;
    }
    public String getCalledShowNumber() {
        return this.calledShowNumber;
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

    public SendCcoSmartCallRequest setEnableITN(Boolean enableITN) {
        this.enableITN = enableITN;
        return this;
    }
    public Boolean getEnableITN() {
        return this.enableITN;
    }

    public SendCcoSmartCallRequest setMuteTime(Integer muteTime) {
        this.muteTime = muteTime;
        return this;
    }
    public Integer getMuteTime() {
        return this.muteTime;
    }

    public SendCcoSmartCallRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public SendCcoSmartCallRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendCcoSmartCallRequest setPauseTime(Integer pauseTime) {
        this.pauseTime = pauseTime;
        return this;
    }
    public Integer getPauseTime() {
        return this.pauseTime;
    }

    public SendCcoSmartCallRequest setPlayTimes(Integer playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Integer getPlayTimes() {
        return this.playTimes;
    }

    public SendCcoSmartCallRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public SendCcoSmartCallRequest setRecordFlag(Boolean recordFlag) {
        this.recordFlag = recordFlag;
        return this;
    }
    public Boolean getRecordFlag() {
        return this.recordFlag;
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

    public SendCcoSmartCallRequest setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public SendCcoSmartCallRequest setSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }
    public Integer getSpeed() {
        return this.speed;
    }

    public SendCcoSmartCallRequest setTtsConf(Boolean ttsConf) {
        this.ttsConf = ttsConf;
        return this;
    }
    public Boolean getTtsConf() {
        return this.ttsConf;
    }

    public SendCcoSmartCallRequest setTtsSpeed(Integer ttsSpeed) {
        this.ttsSpeed = ttsSpeed;
        return this;
    }
    public Integer getTtsSpeed() {
        return this.ttsSpeed;
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

    public SendCcoSmartCallRequest setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public SendCcoSmartCallRequest setVoiceCodeParam(String voiceCodeParam) {
        this.voiceCodeParam = voiceCodeParam;
        return this;
    }
    public String getVoiceCodeParam() {
        return this.voiceCodeParam;
    }

    public SendCcoSmartCallRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

}
