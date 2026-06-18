// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddModelApplicationRequest extends TeaModel {
    /**
     * <p>The number of concurrent requests per second (CPS).</p>
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
     * <p>测试应用</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>Specifies whether to push an event notification when a call is connected. The default value is false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CallConnectedTriggerModel")
    public Boolean callConnectedTriggerModel;

    /**
     * <p>The scene name.</p>
     * 
     * <strong>example:</strong>
     * <p>测试场景</p>
     */
    @NameInMap("DyvmsSceneName")
    public String dyvmsSceneName;

    /**
     * <p>The model code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("ModelCode")
    public String modelCode;

    /**
     * <p>The model version.</p>
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
     * <p>The number of consecutive mute events that trigger an automatic hang-up.</p>
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
     * <p>测试提示词。</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The qualification ID.</p>
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
     * <p>测试资质</p>
     */
    @NameInMap("QualificationName")
    public String qualificationName;

    /**
     * <p>The URL of the audio file for the opening line. This parameter is required if <code>StartWordType</code> is set to <code>1</code>.</p>
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
     * <p>The source. The value must be <code>USER</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The speech script content.</p>
     * 
     * <strong>example:</strong>
     * <p>测试话术。</p>
     */
    @NameInMap("SpeechContent")
    public String speechContent;

    /**
     * <p>The speech script ID.</p>
     * 
     * <strong>example:</strong>
     * <p>88</p>
     */
    @NameInMap("SpeechId")
    public Long speechId;

    /**
     * <p>The opening line.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>你好，这是一句开场白。</p>
     */
    @NameInMap("StartWord")
    public String startWord;

    /**
     * <p>The type of the opening line.</p>
     * 
     * <strong>example:</strong>
     * <p>0：文本
     * 1：录音</p>
     */
    @NameInMap("StartWordType")
    public Long startWordType;

    /**
     * <p>The TTS configuration, including voice, volume, speech speed, and more.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TtsConfig")
    public AddModelApplicationRequestTtsConfig ttsConfig;

    /**
     * <p>The purpose of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>测试用途</p>
     */
    @NameInMap("UsageDesc")
    public String usageDesc;

    public static AddModelApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddModelApplicationRequest self = new AddModelApplicationRequest();
        return TeaModel.build(map, self);
    }

    public AddModelApplicationRequest setApplicationCps(Long applicationCps) {
        this.applicationCps = applicationCps;
        return this;
    }
    public Long getApplicationCps() {
        return this.applicationCps;
    }

    public AddModelApplicationRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public AddModelApplicationRequest setCallConnectedTriggerModel(Boolean callConnectedTriggerModel) {
        this.callConnectedTriggerModel = callConnectedTriggerModel;
        return this;
    }
    public Boolean getCallConnectedTriggerModel() {
        return this.callConnectedTriggerModel;
    }

    public AddModelApplicationRequest setDyvmsSceneName(String dyvmsSceneName) {
        this.dyvmsSceneName = dyvmsSceneName;
        return this;
    }
    public String getDyvmsSceneName() {
        return this.dyvmsSceneName;
    }

    public AddModelApplicationRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public AddModelApplicationRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public AddModelApplicationRequest setMuteActive(Boolean muteActive) {
        this.muteActive = muteActive;
        return this;
    }
    public Boolean getMuteActive() {
        return this.muteActive;
    }

    public AddModelApplicationRequest setMuteDuration(Long muteDuration) {
        this.muteDuration = muteDuration;
        return this;
    }
    public Long getMuteDuration() {
        return this.muteDuration;
    }

    public AddModelApplicationRequest setMuteHangupNum(Long muteHangupNum) {
        this.muteHangupNum = muteHangupNum;
        return this;
    }
    public Long getMuteHangupNum() {
        return this.muteHangupNum;
    }

    public AddModelApplicationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddModelApplicationRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public AddModelApplicationRequest setQualificationId(Long qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public Long getQualificationId() {
        return this.qualificationId;
    }

    public AddModelApplicationRequest setQualificationName(String qualificationName) {
        this.qualificationName = qualificationName;
        return this;
    }
    public String getQualificationName() {
        return this.qualificationName;
    }

    public AddModelApplicationRequest setRecordingFile(String recordingFile) {
        this.recordingFile = recordingFile;
        return this;
    }
    public String getRecordingFile() {
        return this.recordingFile;
    }

    public AddModelApplicationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddModelApplicationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddModelApplicationRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public AddModelApplicationRequest setSpeechContent(String speechContent) {
        this.speechContent = speechContent;
        return this;
    }
    public String getSpeechContent() {
        return this.speechContent;
    }

    public AddModelApplicationRequest setSpeechId(Long speechId) {
        this.speechId = speechId;
        return this;
    }
    public Long getSpeechId() {
        return this.speechId;
    }

    public AddModelApplicationRequest setStartWord(String startWord) {
        this.startWord = startWord;
        return this;
    }
    public String getStartWord() {
        return this.startWord;
    }

    public AddModelApplicationRequest setStartWordType(Long startWordType) {
        this.startWordType = startWordType;
        return this;
    }
    public Long getStartWordType() {
        return this.startWordType;
    }

    public AddModelApplicationRequest setTtsConfig(AddModelApplicationRequestTtsConfig ttsConfig) {
        this.ttsConfig = ttsConfig;
        return this;
    }
    public AddModelApplicationRequestTtsConfig getTtsConfig() {
        return this.ttsConfig;
    }

    public AddModelApplicationRequest setUsageDesc(String usageDesc) {
        this.usageDesc = usageDesc;
        return this;
    }
    public String getUsageDesc() {
        return this.usageDesc;
    }

    public static class AddModelApplicationRequestTtsConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable background sound.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BackgroundEnabled")
        public Boolean backgroundEnabled;

        /**
         * <p>The background sound ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("BackgroundSound")
        public Long backgroundSound;

        /**
         * <p>The background sound volume.</p>
         * 
         * <strong>example:</strong>
         * <p>0：low
         * 1：medium
         * 2：high</p>
         */
        @NameInMap("BackgroundVolume")
        public Long backgroundVolume;

        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>45</p>
         */
        @NameInMap("CustomerAccountId")
        public Long customerAccountId;

        /**
         * <p>Specifies whether to enable mixing.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MixingEnabled")
        public Boolean mixingEnabled;

        /**
         * <p>The mixing template ID.</p>
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
         * <p>example</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The speech speed for TTS playback. Valid values: -200–200. The default value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("TtsSpeed")
        public Long ttsSpeed;

        /**
         * <p>The voice style.</p>
         * 
         * <strong>example:</strong>
         * <p>龙小夏</p>
         */
        @NameInMap("TtsStyle")
        public String ttsStyle;

        /**
         * <p>The volume for TTS playback. Valid values: 0–100. The default value is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        @NameInMap("TtsVolume")
        public Long ttsVolume;

        /**
         * <p>The voice code.</p>
         * 
         * <strong>example:</strong>
         * <p>ddddfd</p>
         */
        @NameInMap("VoiceCode")
        public String voiceCode;

        /**
         * <p>The voice type.</p>
         * <pre><code>SYSTEM: System voice
         * COSYCLONE: Cloned voice
         * BL-CUSTOM: Premium custom cloned voice
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("VoiceType")
        public String voiceType;

        public static AddModelApplicationRequestTtsConfig build(java.util.Map<String, ?> map) throws Exception {
            AddModelApplicationRequestTtsConfig self = new AddModelApplicationRequestTtsConfig();
            return TeaModel.build(map, self);
        }

        public AddModelApplicationRequestTtsConfig setBackgroundEnabled(Boolean backgroundEnabled) {
            this.backgroundEnabled = backgroundEnabled;
            return this;
        }
        public Boolean getBackgroundEnabled() {
            return this.backgroundEnabled;
        }

        public AddModelApplicationRequestTtsConfig setBackgroundSound(Long backgroundSound) {
            this.backgroundSound = backgroundSound;
            return this;
        }
        public Long getBackgroundSound() {
            return this.backgroundSound;
        }

        public AddModelApplicationRequestTtsConfig setBackgroundVolume(Long backgroundVolume) {
            this.backgroundVolume = backgroundVolume;
            return this;
        }
        public Long getBackgroundVolume() {
            return this.backgroundVolume;
        }

        public AddModelApplicationRequestTtsConfig setCustomerAccountId(Long customerAccountId) {
            this.customerAccountId = customerAccountId;
            return this;
        }
        public Long getCustomerAccountId() {
            return this.customerAccountId;
        }

        public AddModelApplicationRequestTtsConfig setMixingEnabled(Boolean mixingEnabled) {
            this.mixingEnabled = mixingEnabled;
            return this;
        }
        public Boolean getMixingEnabled() {
            return this.mixingEnabled;
        }

        public AddModelApplicationRequestTtsConfig setMixingTemplate(Long mixingTemplate) {
            this.mixingTemplate = mixingTemplate;
            return this;
        }
        public Long getMixingTemplate() {
            return this.mixingTemplate;
        }

        public AddModelApplicationRequestTtsConfig setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public AddModelApplicationRequestTtsConfig setTtsSpeed(Long ttsSpeed) {
            this.ttsSpeed = ttsSpeed;
            return this;
        }
        public Long getTtsSpeed() {
            return this.ttsSpeed;
        }

        public AddModelApplicationRequestTtsConfig setTtsStyle(String ttsStyle) {
            this.ttsStyle = ttsStyle;
            return this;
        }
        public String getTtsStyle() {
            return this.ttsStyle;
        }

        public AddModelApplicationRequestTtsConfig setTtsVolume(Long ttsVolume) {
            this.ttsVolume = ttsVolume;
            return this;
        }
        public Long getTtsVolume() {
            return this.ttsVolume;
        }

        public AddModelApplicationRequestTtsConfig setVoiceCode(String voiceCode) {
            this.voiceCode = voiceCode;
            return this;
        }
        public String getVoiceCode() {
            return this.voiceCode;
        }

        public AddModelApplicationRequestTtsConfig setVoiceType(String voiceType) {
            this.voiceType = voiceType;
            return this;
        }
        public String getVoiceType() {
            return this.voiceType;
        }

    }

}
