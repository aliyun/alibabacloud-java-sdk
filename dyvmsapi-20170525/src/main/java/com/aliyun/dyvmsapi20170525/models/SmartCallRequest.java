// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SmartCallRequest extends TeaModel {
    /**
     * <p>Specifies whether the playback of the recording file can be interrupted. Default value: **true**. The default value indicates that the playback of the recording file can be interrupted.</p>
     * <br>
     * <p>If you set the value of this parameter to false, the playback of the recording file cannot be interrupted even if the value of action_break is set to true.</p>
     * <br>
     * <p>> The value of action_code_break takes precedence over the value of action_break.</p>
     */
    @NameInMap("ActionCodeBreak")
    public Boolean actionCodeBreak;

    /**
     * <p>The duration that the user keeps speaking. The playback of the recording file is interrupted when this duration is reached. Unit: milliseconds.</p>
     * <br>
     * <p>If the value of ActionCodeBreak is set to **true** for the recording file and the duration that the user keeps speaking reaches the specified duration, the playback of the recording file is interrupted. If you do not specify ActionCodeTimeBreak or set the value of ActionCodeTimeBreak to 0, the setting of ActionCodeBreak does not take effect.</p>
     */
    @NameInMap("ActionCodeTimeBreak")
    public Integer actionCodeTimeBreak;

    /**
     * <p>The ASR base model. Valid values:</p>
     * <br>
     * <p>*   **customer_service\_8k** (default): Chinese Mandarin.</p>
     * <p>*   **dialect_customer_service\_8k**: a heavy accent.</p>
     * <br>
     * <p>> You must specify the ASR model when you call the SmartCall operation. We recommend that you specify either of the AsrModelId and AsrBaseId parameters.</p>
     * <br>
     * <p>*   If you specify only the AsrModelId parameter, the specified ASR model is used.</p>
     * <br>
     * <p>*   If you specify only the AsrBaseId parameter, the ASR base model is used.</p>
     * <br>
     * <p>*   If you specify neither of the two parameters, the default ASR base model is used, that is, the default value customer_service\_8k is used for the AsrBaseId parameter.</p>
     * <br>
     * <p>*   If you specify both parameters, make sure that their values do not conflict with each other.</p>
     */
    @NameInMap("AsrBaseId")
    public String asrBaseId;

    /**
     * <p>The ID of the Automatic Speech Recognition (ASR) model.</p>
     * <br>
     * <p>You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home) and view the ID of the ASR model on the **ASR Model Management** page.</p>
     * <br>
     * <p>> You must specify the ASR model when you call the SmartCall operation. We recommend that you specify either of the AsrModelId and AsrBaseId parameters.</p>
     * <br>
     * <p>*   If you specify only the AsrModelId parameter, the specified ASR model is used.</p>
     * <br>
     * <p>*   If you specify only the AsrBaseId parameter, the specified ASR base model is used.</p>
     * <br>
     * <p>*   If you specify neither of the two parameters, the default value customer_service\_8k is used for the AsrBaseId parameter. This means that the default Mandarin ASR base model is used.</p>
     * <br>
     * <p>*   If you specify both parameters, make sure that their values do not conflict with each other.</p>
     */
    @NameInMap("AsrModelId")
    public String asrModelId;

    /**
     * <p>The ID of the background voice file that is played back when the user talks with the robot.</p>
     * <br>
     * <p>You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home), choose **Voice File Management**, click the **Intelligent Speech Interaction Recording File** tab, and then click **Details** in the Actions column to view the voice ID.</p>
     */
    @NameInMap("BackgroundFileCode")
    public String backgroundFileCode;

    /**
     * <p>This parameter is unavailable.</p>
     */
    @NameInMap("BackgroundSpeed")
    public Integer backgroundSpeed;

    /**
     * <p>This parameter is unavailable.</p>
     */
    @NameInMap("BackgroundVolume")
    public Integer backgroundVolume;

    /**
     * <p>The called number. Only phone numbers in the Chinese mainland are supported.</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>The number displayed to the called party. The value must be the number you purchased.</p>
     * <br>
     * <p>You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home) and choose **Voice Numbers** > **Real Number Management** to view the number you purchased.</p>
     */
    @NameInMap("CalledShowNumber")
    public String calledShowNumber;

    /**
     * <p>The dynamic extension ID that is reserved for the caller of the operation. This ID is returned in the callback URL and is used as the development identifier of the customer.</p>
     */
    @NameInMap("DynamicId")
    public String dynamicId;

    /**
     * <p>Specifies whether to enable speech recognition of early media. Valid values:</p>
     * <br>
     * <p>*   **false** (default): Speech recognition of early media is disabled.</p>
     * <p>*   **true**: Speech recognition of early media is enabled.</p>
     * <br>
     * <p>> If you set the value of this parameter to **true**, the reason why the call is not answered is recorded.</p>
     */
    @NameInMap("EarlyMediaAsr")
    public Boolean earlyMediaAsr;

    /**
     * <p>Specifies whether to enable Inverse Text Normalization (ITN) during post-processing. Default value: **false**. If you set the value to false, ITN is not enabled during post-processing.</p>
     * <br>
     * <p>If you set the value to **true**, Chinese numerals are converted into Arabic numerals for output.</p>
     */
    @NameInMap("EnableITN")
    public Boolean enableITN;

    /**
     * <p>The silence duration. The system determines the end of the conversation based on the silence duration of the user. Unit: milliseconds. Valid values: 1000 to 20000.****</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If you specify a value out of the valid range, the default value **10000** is used.</p>
     * <br>
     * <p>*   The parameter value can be adjusted during the conversation. The last setting prevails.</p>
     */
    @NameInMap("MuteTime")
    public Integer muteTime;

    @NameInMap("NoiseThreshold")
    public Double noiseThreshold;

    /**
     * <p>The ID that is reserved for the caller of the operation. This ID is returned to the caller in a receipt message.</p>
     * <br>
     * <p>The value is of the STRING type and must be 1 to 15 bytes in length.</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The pause duration. The system determines the end of a sentence based on the pause duration of the user in the conversation. Unit: milliseconds. Valid values: 300 to 1200.****</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If you specify a value out of the valid range, the default value **800** is used.</p>
     * <br>
     * <p>*   You cannot change the parameter value after specifying it.</p>
     */
    @NameInMap("PauseTime")
    public Integer pauseTime;

    /**
     * <p>Specifies whether to record the conversation. Valid values:</p>
     * <br>
     * <p>*   **true**: The conversation is recorded.</p>
     * <p>*   **false**: The conversation is not recorded.</p>
     */
    @NameInMap("RecordFlag")
    public Boolean recordFlag;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The maximum call duration. The call is automatically hung up when the maximum call duration is reached. Unit: seconds.</p>
     * <br>
     * <p>> The maximum call duration is 3,600 seconds.</p>
     */
    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    /**
     * <p>This parameter is unavailable.</p>
     */
    @NameInMap("Speed")
    public Integer speed;

    /**
     * <p>Specifies whether to enable streaming ASR, which intelligently judges what the user wants to express based on the first few words spoken by the user. Valid values:</p>
     * <br>
     * <p>*   **0**: Streaming ASR is disabled.</p>
     * <p>*   **1**: Streaming ASR is enabled.</p>
     */
    @NameInMap("StreamAsr")
    public Integer streamAsr;

    /**
     * <p>Specifies whether to set TTS sound parameters. Valid values:</p>
     * <br>
     * <p>*   **true**: TTS sound parameters must be set. You must set the **TtsStyle**, **TtsColume**, and **TtsSpeed** parameters to specify a sound style.</p>
     * <p>*   **false**: TTS sound parameters do not need to be set. The values of TTS sound parameters do not take effect even if you set them.</p>
     */
    @NameInMap("TtsConf")
    public Boolean ttsConf;

    /**
     * <p>The speed of TTS variable playback. Valid values: -200 to 200. Default value: 0.</p>
     */
    @NameInMap("TtsSpeed")
    public Integer ttsSpeed;

    /**
     * <p>The sound style for TTS variable playback. Default value: **xiaoyun**. For more information about the sound styles, see the **Sound styles** table below.</p>
     */
    @NameInMap("TtsStyle")
    public String ttsStyle;

    /**
     * <p>The volume of TTS variable playback. Valid values: 0 to 100. Default value: 0.</p>
     */
    @NameInMap("TtsVolume")
    public Integer ttsVolume;

    /**
     * <p>The recording file that is played back in the intelligent outbound call.</p>
     * <br>
     * <p>The file can be an online file, a voice file uploaded from the Voice Messaging Service console, or a text-to-speech (TTS) template that contains variables. You can specify multiple files and a TTS variable together. Separate them with commas (,). The values of the variables in the TTS template are specified by the **VoiceCodeParam** parameter.</p>
     * <br>
     * <p>*   If you use an online file as the recording file, set the value of **VoiceCode** to the URL of the file that can be accessed over the Internet.</p>
     * <p>*   If you use a voice file uploaded from the Voice Messaging Service console as the recording file, set the value of **VoiceCode** to the voice ID of the file. You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home), choose **Voice File Management**, click the **Intelligent Speech Interaction Recording File** tab, and then click **Details** in the Actions column to view the voice ID.</p>
     * <p>*   If you use a TTS template that contains variables as the recording file, set the value of **VoiceCode** to a variable name such as $name$, and also set a value for the variable in the **VoiceCodeParam** parameter.</p>
     */
    @NameInMap("VoiceCode")
    public String voiceCode;

    /**
     * <p>The value of the TTS variable, in the JSON format. This value must match the TTS variable specified by the **VoiceCode** parameter.</p>
     */
    @NameInMap("VoiceCodeParam")
    public String voiceCodeParam;

    /**
     * <p>The volume at which the recording file is played. Valid values: -4 to 4. We recommend that you set the value of this parameter to **1**.</p>
     */
    @NameInMap("Volume")
    public Integer volume;

    public static SmartCallRequest build(java.util.Map<String, ?> map) throws Exception {
        SmartCallRequest self = new SmartCallRequest();
        return TeaModel.build(map, self);
    }

    public SmartCallRequest setActionCodeBreak(Boolean actionCodeBreak) {
        this.actionCodeBreak = actionCodeBreak;
        return this;
    }
    public Boolean getActionCodeBreak() {
        return this.actionCodeBreak;
    }

    public SmartCallRequest setActionCodeTimeBreak(Integer actionCodeTimeBreak) {
        this.actionCodeTimeBreak = actionCodeTimeBreak;
        return this;
    }
    public Integer getActionCodeTimeBreak() {
        return this.actionCodeTimeBreak;
    }

    public SmartCallRequest setAsrBaseId(String asrBaseId) {
        this.asrBaseId = asrBaseId;
        return this;
    }
    public String getAsrBaseId() {
        return this.asrBaseId;
    }

    public SmartCallRequest setAsrModelId(String asrModelId) {
        this.asrModelId = asrModelId;
        return this;
    }
    public String getAsrModelId() {
        return this.asrModelId;
    }

    public SmartCallRequest setBackgroundFileCode(String backgroundFileCode) {
        this.backgroundFileCode = backgroundFileCode;
        return this;
    }
    public String getBackgroundFileCode() {
        return this.backgroundFileCode;
    }

    public SmartCallRequest setBackgroundSpeed(Integer backgroundSpeed) {
        this.backgroundSpeed = backgroundSpeed;
        return this;
    }
    public Integer getBackgroundSpeed() {
        return this.backgroundSpeed;
    }

    public SmartCallRequest setBackgroundVolume(Integer backgroundVolume) {
        this.backgroundVolume = backgroundVolume;
        return this;
    }
    public Integer getBackgroundVolume() {
        return this.backgroundVolume;
    }

    public SmartCallRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public SmartCallRequest setCalledShowNumber(String calledShowNumber) {
        this.calledShowNumber = calledShowNumber;
        return this;
    }
    public String getCalledShowNumber() {
        return this.calledShowNumber;
    }

    public SmartCallRequest setDynamicId(String dynamicId) {
        this.dynamicId = dynamicId;
        return this;
    }
    public String getDynamicId() {
        return this.dynamicId;
    }

    public SmartCallRequest setEarlyMediaAsr(Boolean earlyMediaAsr) {
        this.earlyMediaAsr = earlyMediaAsr;
        return this;
    }
    public Boolean getEarlyMediaAsr() {
        return this.earlyMediaAsr;
    }

    public SmartCallRequest setEnableITN(Boolean enableITN) {
        this.enableITN = enableITN;
        return this;
    }
    public Boolean getEnableITN() {
        return this.enableITN;
    }

    public SmartCallRequest setMuteTime(Integer muteTime) {
        this.muteTime = muteTime;
        return this;
    }
    public Integer getMuteTime() {
        return this.muteTime;
    }

    public SmartCallRequest setNoiseThreshold(Double noiseThreshold) {
        this.noiseThreshold = noiseThreshold;
        return this;
    }
    public Double getNoiseThreshold() {
        return this.noiseThreshold;
    }

    public SmartCallRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public SmartCallRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SmartCallRequest setPauseTime(Integer pauseTime) {
        this.pauseTime = pauseTime;
        return this;
    }
    public Integer getPauseTime() {
        return this.pauseTime;
    }

    public SmartCallRequest setRecordFlag(Boolean recordFlag) {
        this.recordFlag = recordFlag;
        return this;
    }
    public Boolean getRecordFlag() {
        return this.recordFlag;
    }

    public SmartCallRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SmartCallRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SmartCallRequest setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public SmartCallRequest setSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }
    public Integer getSpeed() {
        return this.speed;
    }

    public SmartCallRequest setStreamAsr(Integer streamAsr) {
        this.streamAsr = streamAsr;
        return this;
    }
    public Integer getStreamAsr() {
        return this.streamAsr;
    }

    public SmartCallRequest setTtsConf(Boolean ttsConf) {
        this.ttsConf = ttsConf;
        return this;
    }
    public Boolean getTtsConf() {
        return this.ttsConf;
    }

    public SmartCallRequest setTtsSpeed(Integer ttsSpeed) {
        this.ttsSpeed = ttsSpeed;
        return this;
    }
    public Integer getTtsSpeed() {
        return this.ttsSpeed;
    }

    public SmartCallRequest setTtsStyle(String ttsStyle) {
        this.ttsStyle = ttsStyle;
        return this;
    }
    public String getTtsStyle() {
        return this.ttsStyle;
    }

    public SmartCallRequest setTtsVolume(Integer ttsVolume) {
        this.ttsVolume = ttsVolume;
        return this;
    }
    public Integer getTtsVolume() {
        return this.ttsVolume;
    }

    public SmartCallRequest setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public SmartCallRequest setVoiceCodeParam(String voiceCodeParam) {
        this.voiceCodeParam = voiceCodeParam;
        return this;
    }
    public String getVoiceCodeParam() {
        return this.voiceCodeParam;
    }

    public SmartCallRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

}
