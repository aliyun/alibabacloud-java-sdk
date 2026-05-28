// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateModelApplicationShrinkRequest extends TeaModel {
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
    public String interruptConfigShrink;

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
    public String ttsConfigShrink;

    /**
     * <p>用途</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
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

    public UpdateModelApplicationShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
