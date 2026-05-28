// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateModelApplicationRequest extends TeaModel {
    /**
     * <p>应用编码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("ApplicationCode")
    public String applicationCode;

    /**
     * <p>应用并发请求数</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("ApplicationCps")
    public Long applicationCps;

    /**
     * <p>模型应用名称</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CallAssistantHangup")
    public Boolean callAssistantHangup;

    /**
     * <p>通话助手识别</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("CallAssistantRecognize")
    public Boolean callAssistantRecognize;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CallConnectedTriggerModel")
    public Boolean callConnectedTriggerModel;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("DtmfAllowedDigits")
    public String dtmfAllowedDigits;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DtmfAutoValidateEnable")
    public Boolean dtmfAutoValidateEnable;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DtmfDigitCount")
    public Long dtmfDigitCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DtmfInputTimeout")
    public Long dtmfInputTimeout;

    /**
     * <strong>example:</strong>
     * <p>RETURN_MODEL</p>
     */
    @NameInMap("DtmfOutOfRangeAction")
    public String dtmfOutOfRangeAction;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DtmfRetryPlayTimes")
    public Long dtmfRetryPlayTimes;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("DtmfRetryPromptText")
    public String dtmfRetryPromptText;

    /**
     * <p>场景名称</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("DyvmsSceneName")
    public String dyvmsSceneName;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableDtmfReceive")
    public Boolean enableDtmfReceive;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableMorse")
    public Boolean enableMorse;

    /**
     * <p>打断配置</p>
     */
    @NameInMap("InterruptConfig")
    public UpdateModelApplicationRequestInterruptConfig interruptConfig;

    /**
     * <p>模型编码</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("ModelCode")
    public String modelCode;

    /**
     * <p>模型版本</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("ModelVersion")
    public String modelVersion;

    /**
     * <p>第一个静音是否唤起模型</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MuteActive")
    public Boolean muteActive;

    /**
     * <p>静音时长</p>
     * 
     * <strong>example:</strong>
     * <p>85</p>
     */
    @NameInMap("MuteDuration")
    public Long muteDuration;

    /**
     * <p>连续多少个静音事件主动挂机</p>
     * 
     * <strong>example:</strong>
     * <p>70</p>
     */
    @NameInMap("MuteHangupNum")
    public Long muteHangupNum;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>提示词</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>资质ID</p>
     * 
     * <strong>example:</strong>
     * <p>61</p>
     */
    @NameInMap("QualificationId")
    public Long qualificationId;

    /**
     * <p>资质名称</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("QualificationName")
    public String qualificationName;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("RecordingFile")
    public String recordingFile;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>最大通话时长</p>
     * 
     * <strong>example:</strong>
     * <p>49</p>
     */
    @NameInMap("SessionTimeout")
    public Long sessionTimeout;

    /**
     * <p>来源</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>话术内容</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("SpeechContent")
    public String speechContent;

    /**
     * <p>话束id</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("SpeechId")
    public Long speechId;

    /**
     * <p>开场白</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("StartWord")
    public String startWord;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StartWordType")
    public Long startWordType;

    /**
     * <p>tts配置，包括音色、音量、音速等。</p>
     */
    @NameInMap("TtsConfig")
    public UpdateModelApplicationRequestTtsConfig ttsConfig;

    /**
     * <p>用途</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
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

    public UpdateModelApplicationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("InterruptNum")
        public Long interruptNum;

        /**
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
         * <p>防止连续抢话功能配置</p>
         */
        @NameInMap("AvoidInterruptDTO")
        public UpdateModelApplicationRequestInterruptConfigAvoidInterruptDTO avoidInterruptDTO;

        /**
         * <p>防止连续抢话功能是否开启</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableAvoidInterrupt")
        public Boolean enableAvoidInterrupt;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableInterruptBackchannel")
        public Boolean enableInterruptBackchannel;

        /**
         * <p>开场白全程不打断</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableStartwordEntireNotInterrupt")
        public Boolean enableStartwordEntireNotInterrupt;

        /**
         * <p>开场白不打断配置是否开启</p>
         */
        @NameInMap("EnableStartwordNotInterrupt")
        public Boolean enableStartwordNotInterrupt;

        /**
         * <p>开场白保护时长</p>
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
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BackgroundEnabled")
        public Boolean backgroundEnabled;

        /**
         * <p>背景音id</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("BackgroundSound")
        public Long backgroundSound;

        /**
         * <p>背景音音量(id)</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BackgroundVolume")
        public Long backgroundVolume;

        /**
         * <strong>example:</strong>
         * <p>47</p>
         */
        @NameInMap("CustomerAccountId")
        public Long customerAccountId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MixingEnabled")
        public Boolean mixingEnabled;

        /**
         * <p>混音模版id</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("MixingTemplate")
        public Long mixingTemplate;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>TTS 变量播放时的声音速度。取值范围：-200~200，默认值为 0。</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("TtsSpeed")
        public Long ttsSpeed;

        /**
         * <p>声音风格</p>
         * 
         * <strong>example:</strong>
         * <p>voice</p>
         */
        @NameInMap("TtsStyle")
        public String ttsStyle;

        /**
         * <p>TTS 变量播放的音量。取值范围：0~100，默认值为 0。</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("TtsVolume")
        public Long ttsVolume;

        /**
         * <p>声音编码</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("VoiceCode")
        public String voiceCode;

        /**
         * <p>声音类型</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
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
