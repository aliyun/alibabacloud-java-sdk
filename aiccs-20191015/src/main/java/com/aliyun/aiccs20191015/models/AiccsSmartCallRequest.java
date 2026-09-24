// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AiccsSmartCallRequest extends TeaModel {
    /**
     * <p>Specifies whether the opening audio file can be interrupted. Default value: <strong>true</strong>, which indicates that the opening audio file can be interrupted.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ActionCodeBreak")
    public Boolean actionCodeBreak;

    /**
     * <p>The interruption threshold based on the duration of continuous user speech. This parameter takes effect only when ActionCodeBreak is set to <strong>true</strong>. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("ActionCodeTimeBreak")
    public Integer actionCodeTimeBreak;

    /**
     * <p>The acoustic model ID.</p>
     * 
     * <strong>example:</strong>
     * <p>23387****</p>
     */
    @NameInMap("AsrAlsAmId")
    public String asrAlsAmId;

    /**
     * <p>The ASR foundation model.</p>
     * <ul>
     * <li><strong>customer_service_8k</strong>: Mandarin.</li>
     * <li><strong>dialect_customer_service_8k</strong>: Heavy accent.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>When calling the <strong>SendCcoSmartCall</strong> operation, specify the ASR model to use. Specify either <strong>asrModelId</strong> or <strong>AsrBaseId</strong>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If only <strong>asrModelId</strong> is set, the specified ASR model is used.</li>
     * <li>If only <strong>AsrBaseId</strong> is set, the specified ASR foundation model is used.</li>
     * <li>If neither is set, the default ASR foundation model is used. The default value of <strong>AsrBaseId</strong> is <strong>customer_service_8k</strong>, which indicates the Mandarin ASR foundation model.</li>
     * <li>If both are set, make sure they correspond correctly.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>customer_service_8k</p>
     */
    @NameInMap("AsrBaseId")
    public String asrBaseId;

    /**
     * <p>The ASR model ID. View the ASR model ID on the <a href="https://aiccs.console.aliyun.com/sentence/model/private?spm=a2c4g.11186623.0.0.7f9b2964fYSGv4">ASR Model Management page</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>bf71664d30d2478fb8cb8c39c6b6****</p>
     */
    @NameInMap("AsrModelId")
    public String asrModelId;

    /**
     * <p>The hot word ID. View the ASR hot word ID on the <a href="https://aiccs.console.aliyun.com/sentence/vocab?spm=a2c4g.11186623.0.0.7f9bf965IKBpsi">ASR Hot Word Management page</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>6689****</p>
     */
    @NameInMap("AsrVocabularyId")
    public String asrVocabularyId;

    /**
     * <p>The ID of the background audio file played during the conversation between the user and the robot.</p>
     * <p>Log on to the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>, choose <strong>Intelligent Interaction &gt; Voice File Management</strong>, and click <strong>Details</strong> to view the corresponding voice ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2d4c-4e78-8d2a-afbb06cf****.wav</p>
     */
    @NameInMap("BackgroundFileCode")
    public String backgroundFileCode;

    /**
     * <p>This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BackgroundSpeed")
    public Integer backgroundSpeed;

    /**
     * <p>This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BackgroundVolume")
    public Integer backgroundVolume;

    /**
     * <p>The called number. Only numbers in the Chinese mainland are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1862222****</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>The China-based number displayed to the called party. The number must be a purchased number.</p>
     * <p>You can log on to the <a href="https://aiccs.console.aliyun.com/overview?spm=a2c4g.11186623.0.0.7f9bf9658X6jte">Contact Center console</a> to view purchased numbers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0571000****</p>
     */
    @NameInMap("CalledShowNumber")
    public String calledShowNumber;

    /**
     * <p>The dynamic extension ID reserved for the caller. This ID is returned in the callback URL for the caller\&quot;s development identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>2234****</p>
     */
    @NameInMap("DynamicId")
    public String dynamicId;

    /**
     * <p>The early media speech recognition flag. If set to <strong>true</strong>, the reason for unanswered calls is recorded. Default value: <strong>false</strong>, which indicates that this feature is disabled.</p>
     * <blockquote>
     * <p>To enable early media speech recognition, manually set this parameter to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EarlyMediaAsr")
    public Boolean earlyMediaAsr;

    /**
     * <p>Specifies whether to perform Inverse Text Normalization (ITN) in post-processing.</p>
     * <blockquote>
     * <p>If set to <strong>true</strong>, Chinese numerals are converted to Arabic numerals in the output. Default value: <strong>false</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableITN")
    public Boolean enableITN;

    /**
     * <p>The silence duration. Specifies how long the user remains silent before the call ends. Unit: milliseconds. Valid values: <strong>1000</strong> to <strong>20000</strong>.</p>
     * <ul>
     * <li>If the specified value is not within the valid range, the default value of MuteTime is <strong>10000</strong>.</li>
     * <li>This parameter can be dynamically set during the call. The last setting takes effect.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("MuteTime")
    public Integer muteTime;

    /**
     * <p>The ID reserved for the caller. This ID is returned to the caller in the receipt message.
     * The value is a string of 1 to 15 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>222356****</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The pause duration. Specifies how long the user pauses before a sentence is considered complete. Unit: milliseconds. Valid values: <strong>300</strong> to <strong>1200</strong>.</p>
     * <ul>
     * <li>If the specified value is not within the valid range, the default value of PauseTime is <strong>800</strong>.</li>
     * <li>Only the initial setting takes effect. Subsequent settings are ignored.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("PauseTime")
    public Integer pauseTime;

    /**
     * <p>This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PlayTimes")
    public Integer playTimes;

    /**
     * <p>The product name. Default value: <strong>aiccs</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>aiccs</p>
     */
    @NameInMap("ProdCode")
    public String prodCode;

    /**
     * <p>Specifies whether to record the call.</p>
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
     * <p>The maximum call duration. Unit: seconds. The call is automatically hung up after the timeout period.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    /**
     * <p>This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Speed")
    public Integer speed;

    /**
     * <p>Specifies whether to configure TTS voice parameters.</p>
     * <ul>
     * <li>true: Configure the voice style by using the TtsStyle, TtsColume, and TtsSpeed parameters.</li>
     * <li>false: No configuration is required. Even if these parameters are set, they do not take effect.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TtsConf")
    public Boolean ttsConf;

    /**
     * <p>The speech speed for TTS variable playback. Valid values: <strong>-200</strong> to <strong>200</strong>. Default value: <strong>0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TtsSpeed")
    public Integer ttsSpeed;

    /**
     * <p>The voice style for TTS variable playback. Default value: <strong>xiaoyun</strong>. For specific styles, refer to the voice style list.</p>
     * 
     * <strong>example:</strong>
     * <p>xiaoyun</p>
     */
    @NameInMap("TtsStyle")
    public String ttsStyle;

    /**
     * <p>The volume for TTS variable playback. Valid values: <strong>0</strong> to <strong>100</strong>. Default value: <strong>0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TtsVolume")
    public Integer ttsVolume;

    /**
     * <p>The intelligent outbound call audio file. Network files and text-to-speech (TTS) are supported. You can mix multiple files and TTS parameters, separated by commas (,). The replacement values for TTS parameters are specified in <strong>VoiceCodeParam</strong>.</p>
     * <ul>
     * <li>If the audio file is a network file, set VoiceCode to a URL of the audio file that allows public network access. Use a WAV format audio file with a sampling frequency of 8000 Hz or 16000 Hz.</li>
     * <li>If the audio file uses TTS, set VoiceCode to a variable name such as $name$, and set the corresponding content for the variable in VoiceCodeParam.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2d4c-4e78-8d2a-afbb06cf****.wav,$name$</p>
     */
    @NameInMap("VoiceCode")
    public String voiceCode;

    /**
     * <p>The TTS parameter string in JSON format. This parameter must correspond to the TTS parameters in VoiceCode.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{\&quot;name\&quot;:\&quot;Hello\&quot;}&quot;</p>
     */
    @NameInMap("VoiceCodeParam")
    public String voiceCodeParam;

    /**
     * <p>The volume for playing user audio. Valid values: <strong>-4</strong> to <strong>4</strong>. Set this parameter to <strong>1</strong>.</p>
     * 
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
