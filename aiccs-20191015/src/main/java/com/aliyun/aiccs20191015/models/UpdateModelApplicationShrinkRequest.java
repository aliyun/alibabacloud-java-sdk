// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateModelApplicationShrinkRequest extends TeaModel {
    /**
     * <p>The code of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DKSDLSA</p>
     */
    @NameInMap("ApplicationCode")
    public String applicationCode;

    /**
     * <p>The number of concurrent requests for the application.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("ApplicationCps")
    public Long applicationCps;

    /**
     * <p>The name of the model application.</p>
     * 
     * <strong>example:</strong>
     * <p>TestApplication</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>Specifies whether to hang up when an intelligent answering service is detected.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CallAssistantHangup")
    public Boolean callAssistantHangup;

    /**
     * <p>Specifies whether to enable call assistant recognition.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CallAssistantRecognize")
    public Boolean callAssistantRecognize;

    /**
     * <p>Specifies whether to enable call-connected event push. This feature is disabled by default.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CallConnectedTriggerModel")
    public Boolean callConnectedTriggerModel;

    /**
     * <p>The enumeration of allowed key digits, specified as comma-separated text such as 1,2,3. A maximum of 20 values are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DtmfAllowedDigits")
    public String dtmfAllowedDigits;

    /**
     * <p>Specifies whether to enable automatic key value validation.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DtmfAutoValidateEnable")
    public Boolean dtmfAutoValidateEnable;

    /**
     * <p>The number of DTMF key digits. Valid values: 1 to 12.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DtmfDigitCount")
    public Long dtmfDigitCount;

    /**
     * <p>The DTMF input timeout period in seconds. Valid values: 1 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DtmfInputTimeout")
    public Long dtmfInputTimeout;

    /**
     * <p>The action to take when the input is out of range. Valid values:</p>
     * <ul>
     * <li>RETURN_MODEL</li>
     * <li>AUTO_RETRY</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RETURN_MODEL</p>
     */
    @NameInMap("DtmfOutOfRangeAction")
    public String dtmfOutOfRangeAction;

    /**
     * <p>The number of retry attempts (PlayTimes). Valid values: 1 to 3. This parameter takes effect only when DtmfOutOfRangeAction is set to AUTO_RETRY.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DtmfRetryPlayTimes")
    public Long dtmfRetryPlayTimes;

    /**
     * <p>The custom retry prompt text. The maximum length is 50 characters. If this parameter is left empty, the default prompt &quot;Invalid input. Enter again.&quot; is used.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample text</p>
     */
    @NameInMap("DtmfRetryPromptText")
    public String dtmfRetryPromptText;

    /**
     * <p>The maximum number of DTMF key sending attempts.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("DtmfSendMaxCount")
    public Long dtmfSendMaxCount;

    /**
     * <p>The timeout period for waiting for DTMF key sending.</p>
     * 
     * <strong>example:</strong>
     * <p>58</p>
     */
    @NameInMap("DtmfSendWaitTimeout")
    public Long dtmfSendWaitTimeout;

    /**
     * <p>The name of the scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>TestScenario</p>
     */
    @NameInMap("DyvmsSceneName")
    public String dyvmsSceneName;

    /**
     * <p>Specifies whether to enable DTMF key collection. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableDtmfReceive")
    public Boolean enableDtmfReceive;

    /**
     * <p>Specifies whether to enable DTMF key sending.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableDtmfSend")
    public Boolean enableDtmfSend;

    /**
     * <p>Specifies whether to enable Morse code configuration. This feature is disabled by default.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableMorse")
    public Boolean enableMorse;

    /**
     * <p>The interruption configuration.</p>
     */
    @NameInMap("InterruptConfig")
    public String interruptConfigShrink;

    /**
     * <p>The code of the model.</p>
     * 
     * <strong>example:</strong>
     * <p>1231</p>
     */
    @NameInMap("ModelCode")
    public String modelCode;

    /**
     * <p>The version of the model.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ModelVersion")
    public String modelVersion;

    /**
     * <p>Specifies whether the first mute event triggers the model.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MuteActive")
    public Boolean muteActive;

    /**
     * <p>The mute duration.</p>
     * 
     * <strong>example:</strong>
     * <p>85</p>
     */
    @NameInMap("MuteDuration")
    public Long muteDuration;

    /**
     * <p>The number of consecutive mute events before the system proactively hangs up.</p>
     * 
     * <strong>example:</strong>
     * <p>70</p>
     */
    @NameInMap("MuteHangupNum")
    public Long muteHangupNum;

    /**
     * <p>The push mode for mute events.</p>
     * 
     * <strong>example:</strong>
     * <p>FIRST_ONLY</p>
     */
    @NameInMap("MutePushMode")
    public String mutePushMode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ASR recognition pause duration.</p>
     * 
     * <strong>example:</strong>
     * <p>350</p>
     */
    @NameInMap("PauseTime")
    public Long pauseTime;

    /**
     * <p>The prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>TestPrompt</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The ID of the qualification.</p>
     * 
     * <strong>example:</strong>
     * <p>61</p>
     */
    @NameInMap("QualificationId")
    public Long qualificationId;

    /**
     * <p>The name of the qualification.</p>
     * 
     * <strong>example:</strong>
     * <p>TestQualification</p>
     */
    @NameInMap("QualificationName")
    public String qualificationName;

    /**
     * <p>The URL of the recording audio file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxxxxxxxxxxxxx.wav">https://xxxxxxxxxxxxxxx.wav</a></p>
     */
    @NameInMap("RecordingFile")
    public String recordingFile;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The maximum call duration.</p>
     * 
     * <strong>example:</strong>
     * <p>49</p>
     */
    @NameInMap("SessionTimeout")
    public Long sessionTimeout;

    /**
     * <p>The source. Fixed value: USER.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The content of the speech script.</p>
     * 
     * <strong>example:</strong>
     * <p>TestSpeechScript</p>
     */
    @NameInMap("SpeechContent")
    public String speechContent;

    /**
     * <p>The ID of the speech script.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("SpeechId")
    public Long speechId;

    /**
     * <p>The opening statement.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello, this is a test opening statement</p>
     */
    @NameInMap("StartWord")
    public String startWord;

    /**
     * <p>The type of the opening statement.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartWordType")
    public Long startWordType;

    /**
     * <p>The text-to-speech (TTS) configuration, including voice, volume, and speed.</p>
     */
    @NameInMap("TtsConfig")
    public String ttsConfigShrink;

    /**
     * <p>The usage description.</p>
     * 
     * <strong>example:</strong>
     * <p>TestUsage</p>
     */
    @NameInMap("UsageDesc")
    public String usageDesc;

    public static UpdateModelApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelApplicationShrinkRequest self = new UpdateModelApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelApplicationShrinkRequest setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
        return this;
    }
    public String getApplicationCode() {
        return this.applicationCode;
    }

    public UpdateModelApplicationShrinkRequest setApplicationCps(Long applicationCps) {
        this.applicationCps = applicationCps;
        return this;
    }
    public Long getApplicationCps() {
        return this.applicationCps;
    }

    public UpdateModelApplicationShrinkRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public UpdateModelApplicationShrinkRequest setCallAssistantHangup(Boolean callAssistantHangup) {
        this.callAssistantHangup = callAssistantHangup;
        return this;
    }
    public Boolean getCallAssistantHangup() {
        return this.callAssistantHangup;
    }

    public UpdateModelApplicationShrinkRequest setCallAssistantRecognize(Boolean callAssistantRecognize) {
        this.callAssistantRecognize = callAssistantRecognize;
        return this;
    }
    public Boolean getCallAssistantRecognize() {
        return this.callAssistantRecognize;
    }

    public UpdateModelApplicationShrinkRequest setCallConnectedTriggerModel(Boolean callConnectedTriggerModel) {
        this.callConnectedTriggerModel = callConnectedTriggerModel;
        return this;
    }
    public Boolean getCallConnectedTriggerModel() {
        return this.callConnectedTriggerModel;
    }

    public UpdateModelApplicationShrinkRequest setDtmfAllowedDigits(String dtmfAllowedDigits) {
        this.dtmfAllowedDigits = dtmfAllowedDigits;
        return this;
    }
    public String getDtmfAllowedDigits() {
        return this.dtmfAllowedDigits;
    }

    public UpdateModelApplicationShrinkRequest setDtmfAutoValidateEnable(Boolean dtmfAutoValidateEnable) {
        this.dtmfAutoValidateEnable = dtmfAutoValidateEnable;
        return this;
    }
    public Boolean getDtmfAutoValidateEnable() {
        return this.dtmfAutoValidateEnable;
    }

    public UpdateModelApplicationShrinkRequest setDtmfDigitCount(Long dtmfDigitCount) {
        this.dtmfDigitCount = dtmfDigitCount;
        return this;
    }
    public Long getDtmfDigitCount() {
        return this.dtmfDigitCount;
    }

    public UpdateModelApplicationShrinkRequest setDtmfInputTimeout(Long dtmfInputTimeout) {
        this.dtmfInputTimeout = dtmfInputTimeout;
        return this;
    }
    public Long getDtmfInputTimeout() {
        return this.dtmfInputTimeout;
    }

    public UpdateModelApplicationShrinkRequest setDtmfOutOfRangeAction(String dtmfOutOfRangeAction) {
        this.dtmfOutOfRangeAction = dtmfOutOfRangeAction;
        return this;
    }
    public String getDtmfOutOfRangeAction() {
        return this.dtmfOutOfRangeAction;
    }

    public UpdateModelApplicationShrinkRequest setDtmfRetryPlayTimes(Long dtmfRetryPlayTimes) {
        this.dtmfRetryPlayTimes = dtmfRetryPlayTimes;
        return this;
    }
    public Long getDtmfRetryPlayTimes() {
        return this.dtmfRetryPlayTimes;
    }

    public UpdateModelApplicationShrinkRequest setDtmfRetryPromptText(String dtmfRetryPromptText) {
        this.dtmfRetryPromptText = dtmfRetryPromptText;
        return this;
    }
    public String getDtmfRetryPromptText() {
        return this.dtmfRetryPromptText;
    }

    public UpdateModelApplicationShrinkRequest setDtmfSendMaxCount(Long dtmfSendMaxCount) {
        this.dtmfSendMaxCount = dtmfSendMaxCount;
        return this;
    }
    public Long getDtmfSendMaxCount() {
        return this.dtmfSendMaxCount;
    }

    public UpdateModelApplicationShrinkRequest setDtmfSendWaitTimeout(Long dtmfSendWaitTimeout) {
        this.dtmfSendWaitTimeout = dtmfSendWaitTimeout;
        return this;
    }
    public Long getDtmfSendWaitTimeout() {
        return this.dtmfSendWaitTimeout;
    }

    public UpdateModelApplicationShrinkRequest setDyvmsSceneName(String dyvmsSceneName) {
        this.dyvmsSceneName = dyvmsSceneName;
        return this;
    }
    public String getDyvmsSceneName() {
        return this.dyvmsSceneName;
    }

    public UpdateModelApplicationShrinkRequest setEnableDtmfReceive(Boolean enableDtmfReceive) {
        this.enableDtmfReceive = enableDtmfReceive;
        return this;
    }
    public Boolean getEnableDtmfReceive() {
        return this.enableDtmfReceive;
    }

    public UpdateModelApplicationShrinkRequest setEnableDtmfSend(Boolean enableDtmfSend) {
        this.enableDtmfSend = enableDtmfSend;
        return this;
    }
    public Boolean getEnableDtmfSend() {
        return this.enableDtmfSend;
    }

    public UpdateModelApplicationShrinkRequest setEnableMorse(Boolean enableMorse) {
        this.enableMorse = enableMorse;
        return this;
    }
    public Boolean getEnableMorse() {
        return this.enableMorse;
    }

    public UpdateModelApplicationShrinkRequest setInterruptConfigShrink(String interruptConfigShrink) {
        this.interruptConfigShrink = interruptConfigShrink;
        return this;
    }
    public String getInterruptConfigShrink() {
        return this.interruptConfigShrink;
    }

    public UpdateModelApplicationShrinkRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public UpdateModelApplicationShrinkRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public UpdateModelApplicationShrinkRequest setMuteActive(Boolean muteActive) {
        this.muteActive = muteActive;
        return this;
    }
    public Boolean getMuteActive() {
        return this.muteActive;
    }

    public UpdateModelApplicationShrinkRequest setMuteDuration(Long muteDuration) {
        this.muteDuration = muteDuration;
        return this;
    }
    public Long getMuteDuration() {
        return this.muteDuration;
    }

    public UpdateModelApplicationShrinkRequest setMuteHangupNum(Long muteHangupNum) {
        this.muteHangupNum = muteHangupNum;
        return this;
    }
    public Long getMuteHangupNum() {
        return this.muteHangupNum;
    }

    public UpdateModelApplicationShrinkRequest setMutePushMode(String mutePushMode) {
        this.mutePushMode = mutePushMode;
        return this;
    }
    public String getMutePushMode() {
        return this.mutePushMode;
    }

    public UpdateModelApplicationShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateModelApplicationShrinkRequest setPauseTime(Long pauseTime) {
        this.pauseTime = pauseTime;
        return this;
    }
    public Long getPauseTime() {
        return this.pauseTime;
    }

    public UpdateModelApplicationShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public UpdateModelApplicationShrinkRequest setQualificationId(Long qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public Long getQualificationId() {
        return this.qualificationId;
    }

    public UpdateModelApplicationShrinkRequest setQualificationName(String qualificationName) {
        this.qualificationName = qualificationName;
        return this;
    }
    public String getQualificationName() {
        return this.qualificationName;
    }

    public UpdateModelApplicationShrinkRequest setRecordingFile(String recordingFile) {
        this.recordingFile = recordingFile;
        return this;
    }
    public String getRecordingFile() {
        return this.recordingFile;
    }

    public UpdateModelApplicationShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateModelApplicationShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateModelApplicationShrinkRequest setSessionTimeout(Long sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Long getSessionTimeout() {
        return this.sessionTimeout;
    }

    public UpdateModelApplicationShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdateModelApplicationShrinkRequest setSpeechContent(String speechContent) {
        this.speechContent = speechContent;
        return this;
    }
    public String getSpeechContent() {
        return this.speechContent;
    }

    public UpdateModelApplicationShrinkRequest setSpeechId(Long speechId) {
        this.speechId = speechId;
        return this;
    }
    public Long getSpeechId() {
        return this.speechId;
    }

    public UpdateModelApplicationShrinkRequest setStartWord(String startWord) {
        this.startWord = startWord;
        return this;
    }
    public String getStartWord() {
        return this.startWord;
    }

    public UpdateModelApplicationShrinkRequest setStartWordType(Long startWordType) {
        this.startWordType = startWordType;
        return this;
    }
    public Long getStartWordType() {
        return this.startWordType;
    }

    public UpdateModelApplicationShrinkRequest setTtsConfigShrink(String ttsConfigShrink) {
        this.ttsConfigShrink = ttsConfigShrink;
        return this;
    }
    public String getTtsConfigShrink() {
        return this.ttsConfigShrink;
    }

    public UpdateModelApplicationShrinkRequest setUsageDesc(String usageDesc) {
        this.usageDesc = usageDesc;
        return this;
    }
    public String getUsageDesc() {
        return this.usageDesc;
    }

}
