// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AiccsSmartCallRequest extends TeaModel {
    /**
     * <p>Whether the initial audio playback file is interruptible. The default value is <strong>true</strong>, which means the initial audio playback file can be interrupted.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ActionCodeBreak")
    public Boolean actionCodeBreak;

    /**
     * <p>Interrupts based on the user\&quot;s continuous speaking duration. Takes effect only when ActionCodeBreak is <strong>true</strong>. Unit: milliseconds.</p>
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
     * <p>23387****</p>
     */
    @NameInMap("AsrAlsAmId")
    public String asrAlsAmId;

    /**
     * <p>ASR foundation model.</p>
     * <ul>
     * <li><strong>customer_service_8k</strong>: Mandarin.</li>
     * <li><strong>dialect_customer_service_8k</strong>: Heavy accent.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>When invoking the <strong>SendCcoSmartCall</strong> API, you must specify an ASR model. We recommend that you provide either the <strong>asrModelId</strong> or <strong>AsrBaseId</strong> parameter.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If only <strong>asrModelId</strong> is set, the specified ASR model is used.</li>
     * <li>If only <strong>AsrBaseId</strong> is set, the specified ASR foundation model is used.</li>
     * <li>If neither parameter is set, the default ASR foundation model is used. By default, <strong>AsrBaseId</strong> is <strong>customer_service_8k</strong>, which corresponds to the Mandarin ASR foundation model.</li>
     * <li>If both parameters are set, confirm that they correctly correspond to each other.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>customer_service_8k</p>
     */
    @NameInMap("AsrBaseId")
    public String asrBaseId;

    /**
     * <p>ASR model ID. You can view the ASR model ID on the <a href="https://aiccs.console.aliyun.com/sentence/model/private?spm=a2c4g.11186623.0.0.7f9b2964fYSGv4">ASR Model Management page</a>.</p>
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
     * <p>6689****</p>
     */
    @NameInMap("AsrVocabularyId")
    public String asrVocabularyId;

    /**
     * <p>ID of the background audio file played during the conversation between the user and the robot.  </p>
     * <p>You can log on to the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>, choose <strong>Intelligent Interaction &gt; Audio File Management</strong>, and click <strong>View</strong> to check the corresponding audio ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2d4c-4e78-8d2a-afbb06cf****.wav</p>
     */
    @NameInMap("BackgroundFileCode")
    public String backgroundFileCode;

    /**
     * <p>This parameter is currently not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BackgroundSpeed")
    public Integer backgroundSpeed;

    /**
     * <p>The parameter is not supported yet.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BackgroundVolume")
    public Integer backgroundVolume;

    /**
     * <p>Called number. Only numbers in the Chinese mainland are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1862222****</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>The caller ID displayed to the callee. This must be a number you have purchased.</p>
     * <p>You can log on to the <a href="https://aiccs.console.aliyun.com/overview?spm=a2c4g.11186623.0.0.7f9bf9658X6jte">Contact Center console</a> to view your purchased numbers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0571000****</p>
     */
    @NameInMap("CalledShowNumber")
    public String calledShowNumber;

    /**
     * <p>A dynamic extension ID reserved for the caller, which is returned in the webhook address to serve as the customer\&quot;s developer identity.</p>
     * 
     * <strong>example:</strong>
     * <p>2234****</p>
     */
    @NameInMap("DynamicId")
    public String dynamicId;

    /**
     * <p>Early media speech recognition identity. When set to <strong>true</strong>, it records the reason why the call was not answered. Default value: <strong>false</strong>, meaning disabled.</p>
     * <blockquote>
     * <p>To enable early media speech recognition, you must manually set this parameter to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>fasle</p>
     */
    @NameInMap("EarlyMediaAsr")
    public Boolean earlyMediaAsr;

    /**
     * <p>Whether to execute ITN during post-processing.  </p>
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
     * <p>Silence duration. This parameter defines how long the call waits for user speech before ending the call. The unit is milliseconds, and valid values range from <strong>1000 to 20000</strong>.</p>
     * <ul>
     * <li>If the specified value is outside this range, <strong>MuteTime</strong> defaults to <strong>10000</strong>.</li>
     * <li>This parameter can be dynamically updated during the call. The last set value takes effect.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("MuteTime")
    public Integer muteTime;

    /**
     * <p>An ID reserved for the caller. This ID will be returned to the caller in the receipt message.<br>It is a string with a length of 1 to 15 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>222356****</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Pause duration. Specifies how long the user must pause to indicate the end of a sentence. Unit: milliseconds. Valid range: <strong>300–1200</strong>.</p>
     * <ul>
     * <li>If the specified value is outside this range, PauseTime defaults to <strong>800</strong>.</li>
     * <li>Only the first setting takes effect; subsequent settings are ignored.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("PauseTime")
    public Integer pauseTime;

    /**
     * <p>The parameter is not supported yet.</p>
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
     * <p>Maximum call duration, in seconds. The call is automatically disconnected after timeout.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    /**
     * <p>This parameter is not currently supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Speed")
    public Integer speed;

    /**
     * <p>Whether to configure TTS voice parameters.</p>
     * <ul>
     * <li>If set to <strong>true</strong>, you must use the TtsStyle, TtsVolume, and TtsSpeed parameters to define the voice style.</li>
     * <li>If set to <strong>false</strong>, related parameters are not required and will have no effect even if configured.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TtsConf")
    public Boolean ttsConf;

    /**
     * <p>Speech speed when playing TTS variables. Valid values range from <strong>-200 to 200</strong>. The default value is <strong>0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TtsSpeed")
    public Integer ttsSpeed;

    /**
     * <p>Voice style used during TTS variable playback. Default value: <strong>xiaoyun</strong>. For available styles, see the voice style list.</p>
     * 
     * <strong>example:</strong>
     * <p>xiaoyun</p>
     */
    @NameInMap("TtsStyle")
    public String ttsStyle;

    /**
     * <p>The volume for TTS variable playback. Valid values range from <strong>0 to 100</strong>. The default value is <strong>0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TtsVolume")
    public Integer ttsVolume;

    /**
     * <p>The Intelligent Outbound Call playback audio file supports both network files and TTS. Multiple files and TTS parameters can be mixed for playback, separated by commas (,). The replacement values for TTS parameters are specified in <strong>VoiceCodeParam</strong>.</p>
     * <ul>
     * <li>When the playback file is a network file: Set the VoiceCode parameter to a publicly accessible URL of the audio file. We recommend using a WAV-formatted audio file with a sampling frequency of 8000 Hz or 16000 Hz.</li>
     * <li>When the playback file uses TTS: Set the VoiceCode parameter to a variable name such as $name$, and define the corresponding content for this variable in VoiceCodeParam.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2d4c-4e78-8d2a-afbb06cf****.wav,$name$</p>
     */
    @NameInMap("VoiceCode")
    public String voiceCode;

    /**
     * <p>TTS parameter string in JSON format. It must correspond to the TTS parameters of VoiceCode.</p>
     * 
     * <strong>example:</strong>
     * <p>“{\”name\”:\”喂，你好\”}”</p>
     */
    @NameInMap("VoiceCodeParam")
    public String voiceCodeParam;

    /**
     * <p>The volume for playing user audio. Valid values range from <strong>-4 to 4</strong>. We recommend setting it to <strong>1</strong>.</p>
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
