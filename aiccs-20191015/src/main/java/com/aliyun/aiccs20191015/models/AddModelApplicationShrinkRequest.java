// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddModelApplicationShrinkRequest extends TeaModel {
    /**
     * <p>The number of concurrent requests for the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("ApplicationCps")
    public Long applicationCps;

    /**
     * <p>The name of the model application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test application</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>Specifies whether to enable push notifications for call connected events. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CallConnectedTriggerModel")
    public Boolean callConnectedTriggerModel;

    /**
     * <p>The name of the scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>Test scenario</p>
     */
    @NameInMap("DyvmsSceneName")
    public String dyvmsSceneName;

    /**
     * <p>The code of the model.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
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
     * <p>Specifies whether to trigger the model upon the first mute event.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MuteActive")
    public Boolean muteActive;

    /**
     * <p>The mute duration.</p>
     * 
     * <strong>example:</strong>
     * <p>70</p>
     */
    @NameInMap("MuteDuration")
    public Long muteDuration;

    /**
     * <p>The number of consecutive mute events required to actively hang up the call.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MuteHangupNum")
    public Long muteHangupNum;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The prompt.</p>
     * 
     * <strong>example:</strong>
     * <p>Test prompt</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The ID of the qualification.</p>
     * 
     * <strong>example:</strong>
     * <p>85</p>
     */
    @NameInMap("QualificationId")
    public Long qualificationId;

    /**
     * <p>The name of the qualification.</p>
     * 
     * <strong>example:</strong>
     * <p>Test qualification</p>
     */
    @NameInMap("QualificationName")
    public String qualificationName;

    /**
     * <p>The URL of the audio recording file for the opening remark. This parameter is required when the opening remark type is set to 1.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxxxxxx.wav">https://xxxxxxxx.wav</a></p>
     */
    @NameInMap("RecordingFile")
    public String recordingFile;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
     * <p>Test speech script</p>
     */
    @NameInMap("SpeechContent")
    public String speechContent;

    /**
     * <p>The ID of the speech script.</p>
     * 
     * <strong>example:</strong>
     * <p>88</p>
     */
    @NameInMap("SpeechId")
    public Long speechId;

    /**
     * <p>The opening remark.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello, this is an opening remark</p>
     */
    @NameInMap("StartWord")
    public String startWord;

    /**
     * <p>The type of the opening remark.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartWordType")
    public Long startWordType;

    /**
     * <p>The text-to-speech (TTS) configuration, including the voice, volume, and speed.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TtsConfig")
    public String ttsConfigShrink;

    /**
     * <p>The usage.</p>
     * 
     * <strong>example:</strong>
     * <p>Test usage</p>
     */
    @NameInMap("UsageDesc")
    public String usageDesc;

    public static AddModelApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddModelApplicationShrinkRequest self = new AddModelApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddModelApplicationShrinkRequest setApplicationCps(Long applicationCps) {
        this.applicationCps = applicationCps;
        return this;
    }
    public Long getApplicationCps() {
        return this.applicationCps;
    }

    public AddModelApplicationShrinkRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public AddModelApplicationShrinkRequest setCallConnectedTriggerModel(Boolean callConnectedTriggerModel) {
        this.callConnectedTriggerModel = callConnectedTriggerModel;
        return this;
    }
    public Boolean getCallConnectedTriggerModel() {
        return this.callConnectedTriggerModel;
    }

    public AddModelApplicationShrinkRequest setDyvmsSceneName(String dyvmsSceneName) {
        this.dyvmsSceneName = dyvmsSceneName;
        return this;
    }
    public String getDyvmsSceneName() {
        return this.dyvmsSceneName;
    }

    public AddModelApplicationShrinkRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public AddModelApplicationShrinkRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public AddModelApplicationShrinkRequest setMuteActive(Boolean muteActive) {
        this.muteActive = muteActive;
        return this;
    }
    public Boolean getMuteActive() {
        return this.muteActive;
    }

    public AddModelApplicationShrinkRequest setMuteDuration(Long muteDuration) {
        this.muteDuration = muteDuration;
        return this;
    }
    public Long getMuteDuration() {
        return this.muteDuration;
    }

    public AddModelApplicationShrinkRequest setMuteHangupNum(Long muteHangupNum) {
        this.muteHangupNum = muteHangupNum;
        return this;
    }
    public Long getMuteHangupNum() {
        return this.muteHangupNum;
    }

    public AddModelApplicationShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddModelApplicationShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public AddModelApplicationShrinkRequest setQualificationId(Long qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public Long getQualificationId() {
        return this.qualificationId;
    }

    public AddModelApplicationShrinkRequest setQualificationName(String qualificationName) {
        this.qualificationName = qualificationName;
        return this;
    }
    public String getQualificationName() {
        return this.qualificationName;
    }

    public AddModelApplicationShrinkRequest setRecordingFile(String recordingFile) {
        this.recordingFile = recordingFile;
        return this;
    }
    public String getRecordingFile() {
        return this.recordingFile;
    }

    public AddModelApplicationShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddModelApplicationShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddModelApplicationShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public AddModelApplicationShrinkRequest setSpeechContent(String speechContent) {
        this.speechContent = speechContent;
        return this;
    }
    public String getSpeechContent() {
        return this.speechContent;
    }

    public AddModelApplicationShrinkRequest setSpeechId(Long speechId) {
        this.speechId = speechId;
        return this;
    }
    public Long getSpeechId() {
        return this.speechId;
    }

    public AddModelApplicationShrinkRequest setStartWord(String startWord) {
        this.startWord = startWord;
        return this;
    }
    public String getStartWord() {
        return this.startWord;
    }

    public AddModelApplicationShrinkRequest setStartWordType(Long startWordType) {
        this.startWordType = startWordType;
        return this;
    }
    public Long getStartWordType() {
        return this.startWordType;
    }

    public AddModelApplicationShrinkRequest setTtsConfigShrink(String ttsConfigShrink) {
        this.ttsConfigShrink = ttsConfigShrink;
        return this;
    }
    public String getTtsConfigShrink() {
        return this.ttsConfigShrink;
    }

    public AddModelApplicationShrinkRequest setUsageDesc(String usageDesc) {
        this.usageDesc = usageDesc;
        return this;
    }
    public String getUsageDesc() {
        return this.usageDesc;
    }

}
