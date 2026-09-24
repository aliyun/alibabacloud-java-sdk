// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateModelApplicationRequest extends TeaModel {
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
    public UpdateModelApplicationRequestInterruptConfig interruptConfig;

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
    public UpdateModelApplicationRequestTtsConfig ttsConfig;

    /**
     * <p>The usage description.</p>
     * 
     * <strong>example:</strong>
     * <p>TestUsage</p>
     */
    @NameInMap("UsageDesc")
    public String usageDesc;

    public static UpdateModelApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelApplicationRequest self = new UpdateModelApplicationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelApplicationRequest setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
        return this;
    }
    public String getApplicationCode() {
        return this.applicationCode;
    }

    public UpdateModelApplicationRequest setApplicationCps(Long applicationCps) {
        this.applicationCps = applicationCps;
        return this;
    }
    public Long getApplicationCps() {
        return this.applicationCps;
    }

    public UpdateModelApplicationRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public UpdateModelApplicationRequest setCallAssistantHangup(Boolean callAssistantHangup) {
        this.callAssistantHangup = callAssistantHangup;
        return this;
    }
    public Boolean getCallAssistantHangup() {
        return this.callAssistantHangup;
    }

    public UpdateModelApplicationRequest setCallAssistantRecognize(Boolean callAssistantRecognize) {
        this.callAssistantRecognize = callAssistantRecognize;
        return this;
    }
    public Boolean getCallAssistantRecognize() {
        return this.callAssistantRecognize;
    }

    public UpdateModelApplicationRequest setCallConnectedTriggerModel(Boolean callConnectedTriggerModel) {
        this.callConnectedTriggerModel = callConnectedTriggerModel;
        return this;
    }
    public Boolean getCallConnectedTriggerModel() {
        return this.callConnectedTriggerModel;
    }

    public UpdateModelApplicationRequest setDtmfAllowedDigits(String dtmfAllowedDigits) {
        this.dtmfAllowedDigits = dtmfAllowedDigits;
        return this;
    }
    public String getDtmfAllowedDigits() {
        return this.dtmfAllowedDigits;
    }

    public UpdateModelApplicationRequest setDtmfAutoValidateEnable(Boolean dtmfAutoValidateEnable) {
        this.dtmfAutoValidateEnable = dtmfAutoValidateEnable;
        return this;
    }
    public Boolean getDtmfAutoValidateEnable() {
        return this.dtmfAutoValidateEnable;
    }

    public UpdateModelApplicationRequest setDtmfDigitCount(Long dtmfDigitCount) {
        this.dtmfDigitCount = dtmfDigitCount;
        return this;
    }
    public Long getDtmfDigitCount() {
        return this.dtmfDigitCount;
    }

    public UpdateModelApplicationRequest setDtmfInputTimeout(Long dtmfInputTimeout) {
        this.dtmfInputTimeout = dtmfInputTimeout;
        return this;
    }
    public Long getDtmfInputTimeout() {
        return this.dtmfInputTimeout;
    }

    public UpdateModelApplicationRequest setDtmfOutOfRangeAction(String dtmfOutOfRangeAction) {
        this.dtmfOutOfRangeAction = dtmfOutOfRangeAction;
        return this;
    }
    public String getDtmfOutOfRangeAction() {
        return this.dtmfOutOfRangeAction;
    }

    public UpdateModelApplicationRequest setDtmfRetryPlayTimes(Long dtmfRetryPlayTimes) {
        this.dtmfRetryPlayTimes = dtmfRetryPlayTimes;
        return this;
    }
    public Long getDtmfRetryPlayTimes() {
        return this.dtmfRetryPlayTimes;
    }

    public UpdateModelApplicationRequest setDtmfRetryPromptText(String dtmfRetryPromptText) {
        this.dtmfRetryPromptText = dtmfRetryPromptText;
        return this;
    }
    public String getDtmfRetryPromptText() {
        return this.dtmfRetryPromptText;
    }

    public UpdateModelApplicationRequest setDtmfSendMaxCount(Long dtmfSendMaxCount) {
        this.dtmfSendMaxCount = dtmfSendMaxCount;
        return this;
    }
    public Long getDtmfSendMaxCount() {
        return this.dtmfSendMaxCount;
    }

    public UpdateModelApplicationRequest setDtmfSendWaitTimeout(Long dtmfSendWaitTimeout) {
        this.dtmfSendWaitTimeout = dtmfSendWaitTimeout;
        return this;
    }
    public Long getDtmfSendWaitTimeout() {
        return this.dtmfSendWaitTimeout;
    }

    public UpdateModelApplicationRequest setDyvmsSceneName(String dyvmsSceneName) {
        this.dyvmsSceneName = dyvmsSceneName;
        return this;
    }
    public String getDyvmsSceneName() {
        return this.dyvmsSceneName;
    }

    public UpdateModelApplicationRequest setEnableDtmfReceive(Boolean enableDtmfReceive) {
        this.enableDtmfReceive = enableDtmfReceive;
        return this;
    }
    public Boolean getEnableDtmfReceive() {
        return this.enableDtmfReceive;
    }

    public UpdateModelApplicationRequest setEnableDtmfSend(Boolean enableDtmfSend) {
        this.enableDtmfSend = enableDtmfSend;
        return this;
    }
    public Boolean getEnableDtmfSend() {
        return this.enableDtmfSend;
    }

    public UpdateModelApplicationRequest setEnableMorse(Boolean enableMorse) {
        this.enableMorse = enableMorse;
        return this;
    }
    public Boolean getEnableMorse() {
        return this.enableMorse;
    }

    public UpdateModelApplicationRequest setInterruptConfig(UpdateModelApplicationRequestInterruptConfig interruptConfig) {
        this.interruptConfig = interruptConfig;
        return this;
    }
    public UpdateModelApplicationRequestInterruptConfig getInterruptConfig() {
        return this.interruptConfig;
    }

    public UpdateModelApplicationRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public UpdateModelApplicationRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public UpdateModelApplicationRequest setMuteActive(Boolean muteActive) {
        this.muteActive = muteActive;
        return this;
    }
    public Boolean getMuteActive() {
        return this.muteActive;
    }

    public UpdateModelApplicationRequest setMuteDuration(Long muteDuration) {
        this.muteDuration = muteDuration;
        return this;
    }
    public Long getMuteDuration() {
        return this.muteDuration;
    }

    public UpdateModelApplicationRequest setMuteHangupNum(Long muteHangupNum) {
        this.muteHangupNum = muteHangupNum;
        return this;
    }
    public Long getMuteHangupNum() {
        return this.muteHangupNum;
    }

    public UpdateModelApplicationRequest setMutePushMode(String mutePushMode) {
        this.mutePushMode = mutePushMode;
        return this;
    }
    public String getMutePushMode() {
        return this.mutePushMode;
    }

    public UpdateModelApplicationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateModelApplicationRequest setPauseTime(Long pauseTime) {
        this.pauseTime = pauseTime;
        return this;
    }
    public Long getPauseTime() {
        return this.pauseTime;
    }

    public UpdateModelApplicationRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public UpdateModelApplicationRequest setQualificationId(Long qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public Long getQualificationId() {
        return this.qualificationId;
    }

    public UpdateModelApplicationRequest setQualificationName(String qualificationName) {
        this.qualificationName = qualificationName;
        return this;
    }
    public String getQualificationName() {
        return this.qualificationName;
    }

    public UpdateModelApplicationRequest setRecordingFile(String recordingFile) {
        this.recordingFile = recordingFile;
        return this;
    }
    public String getRecordingFile() {
        return this.recordingFile;
    }

    public UpdateModelApplicationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateModelApplicationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateModelApplicationRequest setSessionTimeout(Long sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Long getSessionTimeout() {
        return this.sessionTimeout;
    }

    public UpdateModelApplicationRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdateModelApplicationRequest setSpeechContent(String speechContent) {
        this.speechContent = speechContent;
        return this;
    }
    public String getSpeechContent() {
        return this.speechContent;
    }

    public UpdateModelApplicationRequest setSpeechId(Long speechId) {
        this.speechId = speechId;
        return this;
    }
    public Long getSpeechId() {
        return this.speechId;
    }

    public UpdateModelApplicationRequest setStartWord(String startWord) {
        this.startWord = startWord;
        return this;
    }
    public String getStartWord() {
        return this.startWord;
    }

    public UpdateModelApplicationRequest setStartWordType(Long startWordType) {
        this.startWordType = startWordType;
        return this;
    }
    public Long getStartWordType() {
        return this.startWordType;
    }

    public UpdateModelApplicationRequest setTtsConfig(UpdateModelApplicationRequestTtsConfig ttsConfig) {
        this.ttsConfig = ttsConfig;
        return this;
    }
    public UpdateModelApplicationRequestTtsConfig getTtsConfig() {
        return this.ttsConfig;
    }

    public UpdateModelApplicationRequest setUsageDesc(String usageDesc) {
        this.usageDesc = usageDesc;
        return this;
    }
    public String getUsageDesc() {
        return this.usageDesc;
    }

    public static class UpdateModelApplicationRequestInterruptConfigAvoidInterruptDTO extends TeaModel {
        /**
         * <p>The number of consecutive interruptions.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("InterruptNum")
        public Long interruptNum;

        /**
         * <p>The interrupt protection duration.</p>
         * 
         * <strong>example:</strong>
         * <p>16.417547</p>
         */
        @NameInMap("InterruptProtectDuration")
        public Double interruptProtectDuration;

        public static UpdateModelApplicationRequestInterruptConfigAvoidInterruptDTO build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelApplicationRequestInterruptConfigAvoidInterruptDTO self = new UpdateModelApplicationRequestInterruptConfigAvoidInterruptDTO();
            return TeaModel.build(map, self);
        }

        public UpdateModelApplicationRequestInterruptConfigAvoidInterruptDTO setInterruptNum(Long interruptNum) {
            this.interruptNum = interruptNum;
            return this;
        }
        public Long getInterruptNum() {
            return this.interruptNum;
        }

        public UpdateModelApplicationRequestInterruptConfigAvoidInterruptDTO setInterruptProtectDuration(Double interruptProtectDuration) {
            this.interruptProtectDuration = interruptProtectDuration;
            return this;
        }
        public Double getInterruptProtectDuration() {
            return this.interruptProtectDuration;
        }

    }

    public static class UpdateModelApplicationRequestInterruptConfig extends TeaModel {
        /**
         * <p>The continuous interruption prevention configuration.</p>
         */
        @NameInMap("AvoidInterruptDTO")
        public UpdateModelApplicationRequestInterruptConfigAvoidInterruptDTO avoidInterruptDTO;

        /**
         * <p>Specifies whether to enable the continuous interruption prevention feature.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableAvoidInterrupt")
        public Boolean enableAvoidInterrupt;

        /**
         * <p>Specifies whether to enable the interrupt filler word configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableInterruptBackchannel")
        public Boolean enableInterruptBackchannel;

        /**
         * <p>Specifies whether to disable interruption during the entire opening statement.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableStartwordEntireNotInterrupt")
        public Boolean enableStartwordEntireNotInterrupt;

        /**
         * <p>Specifies whether to enable the opening line no-interrupt configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableStartwordNotInterrupt")
        public Boolean enableStartwordNotInterrupt;

        /**
         * <p>The opening line protection duration.</p>
         * 
         * <strong>example:</strong>
         * <p>1.4699</p>
         */
        @NameInMap("StartwordProtectDuration")
        public Double startwordProtectDuration;

        public static UpdateModelApplicationRequestInterruptConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelApplicationRequestInterruptConfig self = new UpdateModelApplicationRequestInterruptConfig();
            return TeaModel.build(map, self);
        }

        public UpdateModelApplicationRequestInterruptConfig setAvoidInterruptDTO(UpdateModelApplicationRequestInterruptConfigAvoidInterruptDTO avoidInterruptDTO) {
            this.avoidInterruptDTO = avoidInterruptDTO;
            return this;
        }
        public UpdateModelApplicationRequestInterruptConfigAvoidInterruptDTO getAvoidInterruptDTO() {
            return this.avoidInterruptDTO;
        }

        public UpdateModelApplicationRequestInterruptConfig setEnableAvoidInterrupt(Boolean enableAvoidInterrupt) {
            this.enableAvoidInterrupt = enableAvoidInterrupt;
            return this;
        }
        public Boolean getEnableAvoidInterrupt() {
            return this.enableAvoidInterrupt;
        }

        public UpdateModelApplicationRequestInterruptConfig setEnableInterruptBackchannel(Boolean enableInterruptBackchannel) {
            this.enableInterruptBackchannel = enableInterruptBackchannel;
            return this;
        }
        public Boolean getEnableInterruptBackchannel() {
            return this.enableInterruptBackchannel;
        }

        public UpdateModelApplicationRequestInterruptConfig setEnableStartwordEntireNotInterrupt(Boolean enableStartwordEntireNotInterrupt) {
            this.enableStartwordEntireNotInterrupt = enableStartwordEntireNotInterrupt;
            return this;
        }
        public Boolean getEnableStartwordEntireNotInterrupt() {
            return this.enableStartwordEntireNotInterrupt;
        }

        public UpdateModelApplicationRequestInterruptConfig setEnableStartwordNotInterrupt(Boolean enableStartwordNotInterrupt) {
            this.enableStartwordNotInterrupt = enableStartwordNotInterrupt;
            return this;
        }
        public Boolean getEnableStartwordNotInterrupt() {
            return this.enableStartwordNotInterrupt;
        }

        public UpdateModelApplicationRequestInterruptConfig setStartwordProtectDuration(Double startwordProtectDuration) {
            this.startwordProtectDuration = startwordProtectDuration;
            return this;
        }
        public Double getStartwordProtectDuration() {
            return this.startwordProtectDuration;
        }

    }

    public static class UpdateModelApplicationRequestTtsConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable background sound.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BackgroundEnabled")
        public Boolean backgroundEnabled;

        /**
         * <p>The ID of the background sound.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("BackgroundSound")
        public Long backgroundSound;

        /**
         * <p>The background sound volume (ID). Valid values:</p>
         * <ul>
         * <li>0: low.</li>
         * <li>1: medium.</li>
         * <li>2: high.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BackgroundVolume")
        public Long backgroundVolume;

        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>47</p>
         */
        @NameInMap("CustomerAccountId")
        public Long customerAccountId;

        /**
         * <p>Specifies whether to enable audio mixing.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MixingEnabled")
        public Boolean mixingEnabled;

        /**
         * <p>The ID of the mixing template.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("MixingTemplate")
        public Long mixingTemplate;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>122</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The speed for TTS variable playback. Valid values: -200 to 200. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("TtsSpeed")
        public Long ttsSpeed;

        /**
         * <p>The voice style.</p>
         * 
         * <strong>example:</strong>
         * <p>voice</p>
         */
        @NameInMap("TtsStyle")
        public String ttsStyle;

        /**
         * <p>The volume for TTS variable playback. Valid values: 0 to 100. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("TtsVolume")
        public Long ttsVolume;

        /**
         * <p>The code of the voice.</p>
         * 
         * <strong>example:</strong>
         * <p>12123213123</p>
         */
        @NameInMap("VoiceCode")
        public String voiceCode;

        /**
         * <p>The voice type. Valid values:</p>
         * <ul>
         * <li>SYSTEM: system voice.</li>
         * <li>COSYCLONE: cloned voice.</li>
         * <li>BL-CUSTOM: custom premium cloned voice.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("VoiceType")
        public String voiceType;

        public static UpdateModelApplicationRequestTtsConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelApplicationRequestTtsConfig self = new UpdateModelApplicationRequestTtsConfig();
            return TeaModel.build(map, self);
        }

        public UpdateModelApplicationRequestTtsConfig setBackgroundEnabled(Boolean backgroundEnabled) {
            this.backgroundEnabled = backgroundEnabled;
            return this;
        }
        public Boolean getBackgroundEnabled() {
            return this.backgroundEnabled;
        }

        public UpdateModelApplicationRequestTtsConfig setBackgroundSound(Long backgroundSound) {
            this.backgroundSound = backgroundSound;
            return this;
        }
        public Long getBackgroundSound() {
            return this.backgroundSound;
        }

        public UpdateModelApplicationRequestTtsConfig setBackgroundVolume(Long backgroundVolume) {
            this.backgroundVolume = backgroundVolume;
            return this;
        }
        public Long getBackgroundVolume() {
            return this.backgroundVolume;
        }

        public UpdateModelApplicationRequestTtsConfig setCustomerAccountId(Long customerAccountId) {
            this.customerAccountId = customerAccountId;
            return this;
        }
        public Long getCustomerAccountId() {
            return this.customerAccountId;
        }

        public UpdateModelApplicationRequestTtsConfig setMixingEnabled(Boolean mixingEnabled) {
            this.mixingEnabled = mixingEnabled;
            return this;
        }
        public Boolean getMixingEnabled() {
            return this.mixingEnabled;
        }

        public UpdateModelApplicationRequestTtsConfig setMixingTemplate(Long mixingTemplate) {
            this.mixingTemplate = mixingTemplate;
            return this;
        }
        public Long getMixingTemplate() {
            return this.mixingTemplate;
        }

        public UpdateModelApplicationRequestTtsConfig setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public UpdateModelApplicationRequestTtsConfig setTtsSpeed(Long ttsSpeed) {
            this.ttsSpeed = ttsSpeed;
            return this;
        }
        public Long getTtsSpeed() {
            return this.ttsSpeed;
        }

        public UpdateModelApplicationRequestTtsConfig setTtsStyle(String ttsStyle) {
            this.ttsStyle = ttsStyle;
            return this;
        }
        public String getTtsStyle() {
            return this.ttsStyle;
        }

        public UpdateModelApplicationRequestTtsConfig setTtsVolume(Long ttsVolume) {
            this.ttsVolume = ttsVolume;
            return this;
        }
        public Long getTtsVolume() {
            return this.ttsVolume;
        }

        public UpdateModelApplicationRequestTtsConfig setVoiceCode(String voiceCode) {
            this.voiceCode = voiceCode;
            return this;
        }
        public String getVoiceCode() {
            return this.voiceCode;
        }

        public UpdateModelApplicationRequestTtsConfig setVoiceType(String voiceType) {
            this.voiceType = voiceType;
            return this;
        }
        public String getVoiceType() {
            return this.voiceType;
        }

    }

}
