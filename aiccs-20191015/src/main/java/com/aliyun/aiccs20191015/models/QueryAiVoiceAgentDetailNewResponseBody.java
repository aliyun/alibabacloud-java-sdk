// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryAiVoiceAgentDetailNewResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why access was denied.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The agent details.</p>
     */
    @NameInMap("Data")
    public QueryAiVoiceAgentDetailNewResponseBodyData data;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>742C9243-2870-B8D6-0C68-C12345AABBCC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Successful.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAiVoiceAgentDetailNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAiVoiceAgentDetailNewResponseBody self = new QueryAiVoiceAgentDetailNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAiVoiceAgentDetailNewResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryAiVoiceAgentDetailNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAiVoiceAgentDetailNewResponseBody setData(QueryAiVoiceAgentDetailNewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAiVoiceAgentDetailNewResponseBodyData getData() {
        return this.data;
    }

    public QueryAiVoiceAgentDetailNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAiVoiceAgentDetailNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAiVoiceAgentDetailNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigEventConfig extends TeaModel {
        /**
         * <p>Specifies whether to hang up when intelligent answering is detected.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CallAssistantHangup")
        public Boolean callAssistantHangup;

        /**
         * <p>Specifies whether intelligent answering recognition is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CallAssistantRecognize")
        public Boolean callAssistantRecognize;

        /**
         * <p>Specifies whether the first silence event triggers the model.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MuteActive")
        public Boolean muteActive;

        /**
         * <p>The silence duration in seconds. Minimum: 3s. Maximum: 15s.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MuteDuration")
        public Long muteDuration;

        /**
         * <p>The number of consecutive silence events before the call is automatically hung up. Minimum: 1. Maximum: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MuteHangupNum")
        public Long muteHangupNum;

        /**
         * <p>The maximum call duration in seconds. Minimum: 600s. Maximum: 3600s. The call is automatically hung up after the timeout.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("SessionTimeout")
        public Long sessionTimeout;

        public static QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigEventConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigEventConfig self = new QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigEventConfig();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigEventConfig setCallAssistantHangup(Boolean callAssistantHangup) {
            this.callAssistantHangup = callAssistantHangup;
            return this;
        }
        public Boolean getCallAssistantHangup() {
            return this.callAssistantHangup;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigEventConfig setCallAssistantRecognize(Boolean callAssistantRecognize) {
            this.callAssistantRecognize = callAssistantRecognize;
            return this;
        }
        public Boolean getCallAssistantRecognize() {
            return this.callAssistantRecognize;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigEventConfig setMuteActive(Boolean muteActive) {
            this.muteActive = muteActive;
            return this;
        }
        public Boolean getMuteActive() {
            return this.muteActive;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigEventConfig setMuteDuration(Long muteDuration) {
            this.muteDuration = muteDuration;
            return this;
        }
        public Long getMuteDuration() {
            return this.muteDuration;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigEventConfig setMuteHangupNum(Long muteHangupNum) {
            this.muteHangupNum = muteHangupNum;
            return this;
        }
        public Long getMuteHangupNum() {
            return this.muteHangupNum;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigEventConfig setSessionTimeout(Long sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
            return this;
        }
        public Long getSessionTimeout() {
            return this.sessionTimeout;
        }

    }

    public static class QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig extends TeaModel {
        /**
         * <p>The called number.</p>
         * 
         * <strong>example:</strong>
         * <p>123111122222</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        /**
         * <p>The caller number.</p>
         * 
         * <strong>example:</strong>
         * <p>123111122222</p>
         */
        @NameInMap("CallerNumber")
        public String callerNumber;

        /**
         * <p>The caller number type.</p>
         * 
         * <strong>example:</strong>
         * <p>48</p>
         */
        @NameInMap("CallerNumberType")
        public Long callerNumberType;

        /**
         * <p>The answering party number, such as a user mobile number, customer service agent number, or robot number.</p>
         * 
         * <strong>example:</strong>
         * <p>123111122222</p>
         */
        @NameInMap("CallingNumber")
        public String callingNumber;

        /**
         * <p>The called number type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallingNumberType")
        public Long callingNumberType;

        /**
         * <p>The customer line code.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CustomerRouteCode")
        public String customerRouteCode;

        /**
         * <p>Specifies whether the feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The supplementary information.</p>
         * 
         * <strong>example:</strong>
         * <p>Additional information for the agent</p>
         */
        @NameInMap("ExtraInfo")
        public String extraInfo;

        /**
         * <p>The prompt displayed when the transfer to a human agent fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Failure description</p>
         */
        @NameInMap("FailureContent")
        public String failureContent;

        /**
         * <p>The agent line code.</p>
         * 
         * <strong>example:</strong>
         * <p>SEAT_CTI_A_NET</p>
         */
        @NameInMap("SeatRouteCode")
        public String seatRouteCode;

        /**
         * <p>The agent line name.</p>
         * 
         * <strong>example:</strong>
         * <p>Human agent</p>
         */
        @NameInMap("SeatRouteName")
        public String seatRouteName;

        /**
         * <p>The business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("TransferBizId")
        public String transferBizId;

        /**
         * <p>The prompt displayed when the call is transferred to a human agent.</p>
         * 
         * <strong>example:</strong>
         * <p>Prompt message</p>
         */
        @NameInMap("TransferContent")
        public String transferContent;

        /**
         * <p>The transfer-to-agent type.</p>
         * 
         * <strong>example:</strong>
         * <p>73</p>
         */
        @NameInMap("TransferType")
        public Long transferType;

        public static QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig self = new QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig setCallerNumber(String callerNumber) {
            this.callerNumber = callerNumber;
            return this;
        }
        public String getCallerNumber() {
            return this.callerNumber;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig setCallerNumberType(Long callerNumberType) {
            this.callerNumberType = callerNumberType;
            return this;
        }
        public Long getCallerNumberType() {
            return this.callerNumberType;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig setCallingNumberType(Long callingNumberType) {
            this.callingNumberType = callingNumberType;
            return this;
        }
        public Long getCallingNumberType() {
            return this.callingNumberType;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig setCustomerRouteCode(String customerRouteCode) {
            this.customerRouteCode = customerRouteCode;
            return this;
        }
        public String getCustomerRouteCode() {
            return this.customerRouteCode;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig setFailureContent(String failureContent) {
            this.failureContent = failureContent;
            return this;
        }
        public String getFailureContent() {
            return this.failureContent;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig setSeatRouteCode(String seatRouteCode) {
            this.seatRouteCode = seatRouteCode;
            return this;
        }
        public String getSeatRouteCode() {
            return this.seatRouteCode;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig setSeatRouteName(String seatRouteName) {
            this.seatRouteName = seatRouteName;
            return this;
        }
        public String getSeatRouteName() {
            return this.seatRouteName;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig setTransferBizId(String transferBizId) {
            this.transferBizId = transferBizId;
            return this;
        }
        public String getTransferBizId() {
            return this.transferBizId;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig setTransferContent(String transferContent) {
            this.transferContent = transferContent;
            return this;
        }
        public String getTransferContent() {
            return this.transferContent;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig setTransferType(Long transferType) {
            this.transferType = transferType;
            return this;
        }
        public Long getTransferType() {
            return this.transferType;
        }

    }

    public static class QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTtsConfig extends TeaModel {
        /**
         * <p>Specifies whether background sound is enabled.</p>
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
         * <p>17</p>
         */
        @NameInMap("BackgroundSound")
        public Long backgroundSound;

        /**
         * <p>The background sound volume. Valid values: 0: low. 1: medium. 2: high.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BackgroundVolume")
        public Long backgroundVolume;

        /**
         * <p>The third-party voice platform account.</p>
         * 
         * <strong>example:</strong>
         * <p>75</p>
         */
        @NameInMap("CustomerAccountId")
        public Long customerAccountId;

        /**
         * <p>Specifies whether audio mixing is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MixingEnabled")
        public Boolean mixingEnabled;

        /**
         * <p>The audio mixing template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MixingTemplate")
        public Long mixingTemplate;

        /**
         * <p>The resource ID. This parameter is required only for third-party voices.</p>
         * 
         * <strong>example:</strong>
         * <p>voice-12345</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The voice speed for TTS playback. Valid values: -200 to 200. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TtsSpeed")
        public Long ttsSpeed;

        /**
         * <p>The voice style.</p>
         * 
         * <strong>example:</strong>
         * <p>longxiaoxia_v2p1</p>
         */
        @NameInMap("TtsStyle")
        public String ttsStyle;

        /**
         * <p>The volume for TTS playback. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>88</p>
         */
        @NameInMap("TtsVolume")
        public Long ttsVolume;

        /**
         * <p>The voice code.</p>
         * 
         * <strong>example:</strong>
         * <p>V123ABC00</p>
         */
        @NameInMap("VoiceCode")
        public String voiceCode;

        /**
         * <p>The TTS voice type. Valid values:</p>
         * <p><code>VOICE_TYPE_SYSTEM</code>: system voice.</p>
         * <p><code>VOICE_TYPE_CLONE</code>: cloned voice.</p>
         * <p><code>VOICE_TYPE_DOUBAO</code>: Doubao voice.</p>
         * <p><code>VOICE_TYPE_MINIMAX</code>: Minimax voice.</p>
         * <p><code>VOICE_TYPE_OPENTTS</code>: open voice.</p>
         * <p><code>VOICE_TYPE_BL_CUSTOM</code>: custom premium cloned voice.</p>
         * 
         * <strong>example:</strong>
         * <p>VOICE_TYPE_SYSTEM</p>
         */
        @NameInMap("VoiceType")
        public Boolean voiceType;

        public static QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTtsConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTtsConfig self = new QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTtsConfig();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTtsConfig setBackgroundEnabled(Boolean backgroundEnabled) {
            this.backgroundEnabled = backgroundEnabled;
            return this;
        }
        public Boolean getBackgroundEnabled() {
            return this.backgroundEnabled;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTtsConfig setBackgroundSound(Long backgroundSound) {
            this.backgroundSound = backgroundSound;
            return this;
        }
        public Long getBackgroundSound() {
            return this.backgroundSound;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTtsConfig setBackgroundVolume(Long backgroundVolume) {
            this.backgroundVolume = backgroundVolume;
            return this;
        }
        public Long getBackgroundVolume() {
            return this.backgroundVolume;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTtsConfig setCustomerAccountId(Long customerAccountId) {
            this.customerAccountId = customerAccountId;
            return this;
        }
        public Long getCustomerAccountId() {
            return this.customerAccountId;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTtsConfig setMixingEnabled(Boolean mixingEnabled) {
            this.mixingEnabled = mixingEnabled;
            return this;
        }
        public Boolean getMixingEnabled() {
            return this.mixingEnabled;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTtsConfig setMixingTemplate(Long mixingTemplate) {
            this.mixingTemplate = mixingTemplate;
            return this;
        }
        public Long getMixingTemplate() {
            return this.mixingTemplate;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTtsConfig setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTtsConfig setTtsSpeed(Long ttsSpeed) {
            this.ttsSpeed = ttsSpeed;
            return this;
        }
        public Long getTtsSpeed() {
            return this.ttsSpeed;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTtsConfig setTtsStyle(String ttsStyle) {
            this.ttsStyle = ttsStyle;
            return this;
        }
        public String getTtsStyle() {
            return this.ttsStyle;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTtsConfig setTtsVolume(Long ttsVolume) {
            this.ttsVolume = ttsVolume;
            return this;
        }
        public Long getTtsVolume() {
            return this.ttsVolume;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTtsConfig setVoiceCode(String voiceCode) {
            this.voiceCode = voiceCode;
            return this;
        }
        public String getVoiceCode() {
            return this.voiceCode;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTtsConfig setVoiceType(Boolean voiceType) {
            this.voiceType = voiceType;
            return this;
        }
        public Boolean getVoiceType() {
            return this.voiceType;
        }

    }

    public static class QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfig extends TeaModel {
        /**
         * <p>The event configuration.</p>
         */
        @NameInMap("EventConfig")
        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigEventConfig eventConfig;

        /**
         * <p>The opening statement.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello, this is ******</p>
         */
        @NameInMap("Prologue")
        public String prologue;

        /**
         * <p>The URL of the opening statement recording audio file. This parameter has a value only when StartWordType is set to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>/oss-file-key</p>
         */
        @NameInMap("RecordingFile")
        public String recordingFile;

        /**
         * <p>The opening statement type. 0: text. 1: recording.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StartWordType")
        public Long startWordType;

        /**
         * <p>The transfer-to-agent configuration.</p>
         */
        @NameInMap("TransferConfig")
        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig transferConfig;

        /**
         * <p>The TTS configuration.</p>
         */
        @NameInMap("TtsConfig")
        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTtsConfig ttsConfig;

        /**
         * <p>The hot word library ID.</p>
         * 
         * <strong>example:</strong>
         * <p>afb2c43**********83e6df30551c11f7</p>
         */
        @NameInMap("VocabId")
        public String vocabId;

        public static QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfig self = new QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfig();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfig setEventConfig(QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigEventConfig eventConfig) {
            this.eventConfig = eventConfig;
            return this;
        }
        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigEventConfig getEventConfig() {
            return this.eventConfig;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfig setPrologue(String prologue) {
            this.prologue = prologue;
            return this;
        }
        public String getPrologue() {
            return this.prologue;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfig setRecordingFile(String recordingFile) {
            this.recordingFile = recordingFile;
            return this;
        }
        public String getRecordingFile() {
            return this.recordingFile;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfig setStartWordType(Long startWordType) {
            this.startWordType = startWordType;
            return this;
        }
        public Long getStartWordType() {
            return this.startWordType;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfig setTransferConfig(QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig transferConfig) {
            this.transferConfig = transferConfig;
            return this;
        }
        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTransferConfig getTransferConfig() {
            return this.transferConfig;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfig setTtsConfig(QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTtsConfig ttsConfig) {
            this.ttsConfig = ttsConfig;
            return this;
        }
        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfigTtsConfig getTtsConfig() {
            return this.ttsConfig;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfig setVocabId(String vocabId) {
            this.vocabId = vocabId;
            return this;
        }
        public String getVocabId() {
            return this.vocabId;
        }

    }

    public static class QueryAiVoiceAgentDetailNewResponseBodyDataAgentDemandConfig extends TeaModel {
        /**
         * <p>Specifies whether AI-assisted building is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AiGenerate")
        public Boolean aiGenerate;

        /**
         * <p>The basic task configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>Conduct product marketing and introduce advantages and features</p>
         */
        @NameInMap("BasicTaskDescription")
        public String basicTaskDescription;

        /**
         * <p>The business scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BusinessType")
        public Long businessType;

        /**
         * <p>The core objective.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales lead conversion</p>
         */
        @NameInMap("CoreTarget")
        public String coreTarget;

        /**
         * <p>The system role.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales</p>
         */
        @NameInMap("SysRole")
        public String sysRole;

        /**
         * <p>The user role.</p>
         * 
         * <strong>example:</strong>
         * <p>Potential customer</p>
         */
        @NameInMap("UserRole")
        public String userRole;

        public static QueryAiVoiceAgentDetailNewResponseBodyDataAgentDemandConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailNewResponseBodyDataAgentDemandConfig self = new QueryAiVoiceAgentDetailNewResponseBodyDataAgentDemandConfig();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentDemandConfig setAiGenerate(Boolean aiGenerate) {
            this.aiGenerate = aiGenerate;
            return this;
        }
        public Boolean getAiGenerate() {
            return this.aiGenerate;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentDemandConfig setBasicTaskDescription(String basicTaskDescription) {
            this.basicTaskDescription = basicTaskDescription;
            return this;
        }
        public String getBasicTaskDescription() {
            return this.basicTaskDescription;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentDemandConfig setBusinessType(Long businessType) {
            this.businessType = businessType;
            return this;
        }
        public Long getBusinessType() {
            return this.businessType;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentDemandConfig setCoreTarget(String coreTarget) {
            this.coreTarget = coreTarget;
            return this;
        }
        public String getCoreTarget() {
            return this.coreTarget;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentDemandConfig setSysRole(String sysRole) {
            this.sysRole = sysRole;
            return this;
        }
        public String getSysRole() {
            return this.sysRole;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentDemandConfig setUserRole(String userRole) {
            this.userRole = userRole;
            return this;
        }
        public String getUserRole() {
            return this.userRole;
        }

    }

    public static class QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfigKnowledgeIds extends TeaModel {
        /**
         * <p>The knowledge base ID.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("KnowledgeId")
        public Long knowledgeId;

        /**
         * <p>The knowledge base name.</p>
         * 
         * <strong>example:</strong>
         * <p>Product knowledge base</p>
         */
        @NameInMap("KnowledgeName")
        public String knowledgeName;

        public static QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfigKnowledgeIds build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfigKnowledgeIds self = new QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfigKnowledgeIds();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfigKnowledgeIds setKnowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfigKnowledgeIds setKnowledgeName(String knowledgeName) {
            this.knowledgeName = knowledgeName;
            return this;
        }
        public String getKnowledgeName() {
            return this.knowledgeName;
        }

    }

    public static class QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfigRagConfig extends TeaModel {
        /**
         * <p>The RAG retrieval description.</p>
         * 
         * <strong>example:</strong>
         * <p>Knowledge base retrieval</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether RAG retrieval is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        public static QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfigRagConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfigRagConfig self = new QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfigRagConfig();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfigRagConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfigRagConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfig extends TeaModel {
        /**
         * <p>The collection of knowledge bases.</p>
         */
        @NameInMap("KnowledgeIds")
        public java.util.List<QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfigKnowledgeIds> knowledgeIds;

        /**
         * <p>The RAG configuration.</p>
         */
        @NameInMap("RagConfig")
        public QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfigRagConfig ragConfig;

        public static QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfig self = new QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfig();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfig setKnowledgeIds(java.util.List<QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfigKnowledgeIds> knowledgeIds) {
            this.knowledgeIds = knowledgeIds;
            return this;
        }
        public java.util.List<QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfigKnowledgeIds> getKnowledgeIds() {
            return this.knowledgeIds;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfig setRagConfig(QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfigRagConfig ragConfig) {
            this.ragConfig = ragConfig;
            return this;
        }
        public QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfigRagConfig getRagConfig() {
            return this.ragConfig;
        }

    }

    public static class QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfigPhoneTagEnum extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>gender</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The label ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The label value.</p>
         * 
         * <strong>example:</strong>
         * <p>male</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfigPhoneTagEnum build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfigPhoneTagEnum self = new QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfigPhoneTagEnum();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfigPhoneTagEnum setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfigPhoneTagEnum setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfigPhoneTagEnum setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfig extends TeaModel {
        /**
         * <p>The call variable ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The available values for the call variable label.</p>
         */
        @NameInMap("PhoneTagEnum")
        public java.util.List<QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfigPhoneTagEnum> phoneTagEnum;

        /**
         * <p>The key name of the call variable.</p>
         * 
         * <strong>example:</strong>
         * <p>gender</p>
         */
        @NameInMap("PhoneTagKey")
        public String phoneTagKey;

        /**
         * <p>The description of the call variable.</p>
         * 
         * <strong>example:</strong>
         * <p>User gender</p>
         */
        @NameInMap("PhoneTagName")
        public String phoneTagName;

        /**
         * <p>Indicates whether the call variable is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PhoneTagRequired")
        public Boolean phoneTagRequired;

        /**
         * <p>The source of the call variable.</p>
         * 
         * <strong>example:</strong>
         * <p>MANUAL_CREATE</p>
         */
        @NameInMap("PhoneTagSource")
        public String phoneTagSource;

        /**
         * <p>The type of the call variable. Valid values: TEXT (text type) and ENUM (enumeration type).</p>
         * 
         * <strong>example:</strong>
         * <p>ENUM</p>
         */
        @NameInMap("PhoneTagType")
        public String phoneTagType;

        public static QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfig self = new QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfig();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfig setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfig setPhoneTagEnum(java.util.List<QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfigPhoneTagEnum> phoneTagEnum) {
            this.phoneTagEnum = phoneTagEnum;
            return this;
        }
        public java.util.List<QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfigPhoneTagEnum> getPhoneTagEnum() {
            return this.phoneTagEnum;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfig setPhoneTagKey(String phoneTagKey) {
            this.phoneTagKey = phoneTagKey;
            return this;
        }
        public String getPhoneTagKey() {
            return this.phoneTagKey;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfig setPhoneTagName(String phoneTagName) {
            this.phoneTagName = phoneTagName;
            return this;
        }
        public String getPhoneTagName() {
            return this.phoneTagName;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfig setPhoneTagRequired(Boolean phoneTagRequired) {
            this.phoneTagRequired = phoneTagRequired;
            return this;
        }
        public Boolean getPhoneTagRequired() {
            return this.phoneTagRequired;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfig setPhoneTagSource(String phoneTagSource) {
            this.phoneTagSource = phoneTagSource;
            return this;
        }
        public String getPhoneTagSource() {
            return this.phoneTagSource;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfig setPhoneTagType(String phoneTagType) {
            this.phoneTagType = phoneTagType;
            return this;
        }
        public String getPhoneTagType() {
            return this.phoneTagType;
        }

    }

    public static class QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigCallResultTagConfigDefaultTag extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Tag description</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The tag.</p>
         * 
         * <strong>example:</strong>
         * <p>Tag1</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigCallResultTagConfigDefaultTag build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigCallResultTagConfigDefaultTag self = new QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigCallResultTagConfigDefaultTag();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigCallResultTagConfigDefaultTag setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigCallResultTagConfigDefaultTag setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigCallResultTagConfig extends TeaModel {
        /**
         * <p>The default fallback tag information.</p>
         */
        @NameInMap("DefaultTag")
        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigCallResultTagConfigDefaultTag defaultTag;

        /**
         * <p>The mapping between call results and tags.</p>
         */
        @NameInMap("MappingTag")
        public java.util.Map<String, String> mappingTag;

        public static QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigCallResultTagConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigCallResultTagConfig self = new QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigCallResultTagConfig();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigCallResultTagConfig setDefaultTag(QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigCallResultTagConfigDefaultTag defaultTag) {
            this.defaultTag = defaultTag;
            return this;
        }
        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigCallResultTagConfigDefaultTag getDefaultTag() {
            return this.defaultTag;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigCallResultTagConfig setMappingTag(java.util.Map<String, String> mappingTag) {
            this.mappingTag = mappingTag;
            return this;
        }
        public java.util.Map<String, String> getMappingTag() {
            return this.mappingTag;
        }

    }

    public static class QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurposeMainPurposeEnum extends TeaModel {
        /**
         * <p>The description of the available value.</p>
         * 
         * <strong>example:</strong>
         * <p>Description of the tag value</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The unique ID of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>tag_12345</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The available value.</p>
         * 
         * <strong>example:</strong>
         * <p>Tag value example</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurposeMainPurposeEnum build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurposeMainPurposeEnum self = new QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurposeMainPurposeEnum();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurposeMainPurposeEnum setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurposeMainPurposeEnum setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurposeMainPurposeEnum setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurpose extends TeaModel {
        /**
         * <p>The main intent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The description of the main intent.</p>
         * 
         * <strong>example:</strong>
         * <p>Description of the main intent</p>
         */
        @NameInMap("MainPurposeDescription")
        public String mainPurposeDescription;

        /**
         * <p>The available values for the main intent.</p>
         */
        @NameInMap("MainPurposeEnum")
        public java.util.List<QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurposeMainPurposeEnum> mainPurposeEnum;

        /**
         * <p>The name of the main intent.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer inquiry handling</p>
         */
        @NameInMap("MainPurposeName")
        public String mainPurposeName;

        /**
         * <p>The value type of the main intent. Valid values: TEXT (text type) and ENUM (enumeration type).</p>
         * 
         * <strong>example:</strong>
         * <p>ENUM</p>
         */
        @NameInMap("MainPurposeType")
        public String mainPurposeType;

        public static QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurpose build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurpose self = new QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurpose();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurpose setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurpose setMainPurposeDescription(String mainPurposeDescription) {
            this.mainPurposeDescription = mainPurposeDescription;
            return this;
        }
        public String getMainPurposeDescription() {
            return this.mainPurposeDescription;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurpose setMainPurposeEnum(java.util.List<QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurposeMainPurposeEnum> mainPurposeEnum) {
            this.mainPurposeEnum = mainPurposeEnum;
            return this;
        }
        public java.util.List<QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurposeMainPurposeEnum> getMainPurposeEnum() {
            return this.mainPurposeEnum;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurpose setMainPurposeName(String mainPurposeName) {
            this.mainPurposeName = mainPurposeName;
            return this;
        }
        public String getMainPurposeName() {
            return this.mainPurposeName;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurpose setMainPurposeType(String mainPurposeType) {
            this.mainPurposeType = mainPurposeType;
            return this;
        }
        public String getMainPurposeType() {
            return this.mainPurposeType;
        }

    }

    public static class QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfigOutputTagEnum extends TeaModel {
        /**
         * <p>The tag description.</p>
         * 
         * <strong>example:</strong>
         * <p>The user has a high willingness to purchase</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The tag ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The tag enumeration value.</p>
         * 
         * <strong>example:</strong>
         * <p>High willingness</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfigOutputTagEnum build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfigOutputTagEnum self = new QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfigOutputTagEnum();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfigOutputTagEnum setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfigOutputTagEnum setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfigOutputTagEnum setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfig extends TeaModel {
        /**
         * <p>The output tag ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The description of the output tag.</p>
         * 
         * <strong>example:</strong>
         * <p>The user\&quot;s willingness to purchase the product</p>
         */
        @NameInMap("OutputTagDescription")
        public String outputTagDescription;

        /**
         * <p>The available options for the output tag.</p>
         */
        @NameInMap("OutputTagEnum")
        public java.util.List<QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfigOutputTagEnum> outputTagEnum;

        /**
         * <p>The name of the output tag.</p>
         * 
         * <strong>example:</strong>
         * <p>Purchase willingness</p>
         */
        @NameInMap("OutputTagName")
        public String outputTagName;

        /**
         * <p>The value type of the output tag. Valid values: TEXT (text type) and ENUM (enumeration type).</p>
         * 
         * <strong>example:</strong>
         * <p>ENUM</p>
         */
        @NameInMap("OutputTagType")
        public String outputTagType;

        public static QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfig self = new QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfig();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfig setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfig setOutputTagDescription(String outputTagDescription) {
            this.outputTagDescription = outputTagDescription;
            return this;
        }
        public String getOutputTagDescription() {
            return this.outputTagDescription;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfig setOutputTagEnum(java.util.List<QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfigOutputTagEnum> outputTagEnum) {
            this.outputTagEnum = outputTagEnum;
            return this;
        }
        public java.util.List<QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfigOutputTagEnum> getOutputTagEnum() {
            return this.outputTagEnum;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfig setOutputTagName(String outputTagName) {
            this.outputTagName = outputTagName;
            return this;
        }
        public String getOutputTagName() {
            return this.outputTagName;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfig setOutputTagType(String outputTagType) {
            this.outputTagType = outputTagType;
            return this;
        }
        public String getOutputTagType() {
            return this.outputTagType;
        }

    }

    public static class QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfig extends TeaModel {
        /**
         * <p>The call result tag mapping configuration.</p>
         */
        @NameInMap("CallResultTagConfig")
        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigCallResultTagConfig callResultTagConfig;

        /**
         * <p>The main intent.</p>
         */
        @NameInMap("MainPurpose")
        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurpose mainPurpose;

        /**
         * <p>The output tag configurations.</p>
         */
        @NameInMap("OutputTagConfig")
        public java.util.List<QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfig> outputTagConfig;

        public static QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfig self = new QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfig();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfig setCallResultTagConfig(QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigCallResultTagConfig callResultTagConfig) {
            this.callResultTagConfig = callResultTagConfig;
            return this;
        }
        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigCallResultTagConfig getCallResultTagConfig() {
            return this.callResultTagConfig;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfig setMainPurpose(QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurpose mainPurpose) {
            this.mainPurpose = mainPurpose;
            return this;
        }
        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigMainPurpose getMainPurpose() {
            return this.mainPurpose;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfig setOutputTagConfig(java.util.List<QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfig> outputTagConfig) {
            this.outputTagConfig = outputTagConfig;
            return this;
        }
        public java.util.List<QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfigOutputTagConfig> getOutputTagConfig() {
            return this.outputTagConfig;
        }

    }

    public static class QueryAiVoiceAgentDetailNewResponseBodyData extends TeaModel {
        /**
         * <p>The intelligent outbound voice call configuration.</p>
         */
        @NameInMap("AgentCallConfig")
        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfig agentCallConfig;

        /**
         * <p>The agent business requirement configuration.</p>
         */
        @NameInMap("AgentDemandConfig")
        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentDemandConfig agentDemandConfig;

        /**
         * <p>The agent description.</p>
         * 
         * <strong>example:</strong>
         * <p>Used for daily testing</p>
         */
        @NameInMap("AgentDesc")
        public String agentDesc;

        /**
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3021893791</p>
         */
        @NameInMap("AgentId")
        public Long agentId;

        /**
         * <p>The building method. Valid values:</p>
         * <ul>
         * <li>0: prompt mode.</li>
         * <li>1: dialog flow mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentMode")
        public Long agentMode;

        /**
         * <p>The agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test agent</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>The deployment status. Valid values:</p>
         * <ul>
         * <li>0: not effective (NOT_EFFECT).</li>
         * <li>1: effective (EFFECT).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BranchDeployStatus")
        public Long branchDeployStatus;

        /**
         * <p>The branch description.</p>
         * 
         * <strong>example:</strong>
         * <p>Default branch</p>
         */
        @NameInMap("BranchDesc")
        public String branchDesc;

        /**
         * <p>The branch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("BranchId")
        public Long branchId;

        /**
         * <p>The branch name.</p>
         * 
         * <strong>example:</strong>
         * <p>Default version</p>
         */
        @NameInMap("BranchName")
        public String branchName;

        /**
         * <p>The knowledge base configuration.</p>
         */
        @NameInMap("KnowledgeConfig")
        public QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfig knowledgeConfig;

        /**
         * <p>The call variable configurations.</p>
         */
        @NameInMap("PhoneTagConfig")
        public java.util.List<QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfig> phoneTagConfig;

        /**
         * <p>The scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>Personal customer lead conversion</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The service direction.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ServiceDirection")
        public String serviceDirection;

        /**
         * <p>The call summary configuration.</p>
         */
        @NameInMap("SummaryConfig")
        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfig summaryConfig;

        /**
         * <p>The version description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test first version</p>
         */
        @NameInMap("VersionDesc")
        public String versionDesc;

        /**
         * <p>The version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>89</p>
         */
        @NameInMap("VersionId")
        public Long versionId;

        /**
         * <p>The version name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test version 1</p>
         */
        @NameInMap("VersionName")
        public String versionName;

        /**
         * <p>The version publish status. Valid values:</p>
         * <ul>
         * <li>0: Not published.</li>
         * <li>1: Published.</li>
         * <li>2: Draft.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VersionPublishStatus")
        public Long versionPublishStatus;

        /**
         * <p>The most recent publish time of the version. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-15 10:30:00</p>
         */
        @NameInMap("VersionPublishTime")
        public String versionPublishTime;

        public static QueryAiVoiceAgentDetailNewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailNewResponseBodyData self = new QueryAiVoiceAgentDetailNewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailNewResponseBodyData setAgentCallConfig(QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfig agentCallConfig) {
            this.agentCallConfig = agentCallConfig;
            return this;
        }
        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentCallConfig getAgentCallConfig() {
            return this.agentCallConfig;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyData setAgentDemandConfig(QueryAiVoiceAgentDetailNewResponseBodyDataAgentDemandConfig agentDemandConfig) {
            this.agentDemandConfig = agentDemandConfig;
            return this;
        }
        public QueryAiVoiceAgentDetailNewResponseBodyDataAgentDemandConfig getAgentDemandConfig() {
            return this.agentDemandConfig;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyData setAgentDesc(String agentDesc) {
            this.agentDesc = agentDesc;
            return this;
        }
        public String getAgentDesc() {
            return this.agentDesc;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyData setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyData setAgentMode(Long agentMode) {
            this.agentMode = agentMode;
            return this;
        }
        public Long getAgentMode() {
            return this.agentMode;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyData setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyData setBranchDeployStatus(Long branchDeployStatus) {
            this.branchDeployStatus = branchDeployStatus;
            return this;
        }
        public Long getBranchDeployStatus() {
            return this.branchDeployStatus;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyData setBranchDesc(String branchDesc) {
            this.branchDesc = branchDesc;
            return this;
        }
        public String getBranchDesc() {
            return this.branchDesc;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyData setBranchId(Long branchId) {
            this.branchId = branchId;
            return this;
        }
        public Long getBranchId() {
            return this.branchId;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyData setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyData setKnowledgeConfig(QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfig knowledgeConfig) {
            this.knowledgeConfig = knowledgeConfig;
            return this;
        }
        public QueryAiVoiceAgentDetailNewResponseBodyDataKnowledgeConfig getKnowledgeConfig() {
            return this.knowledgeConfig;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyData setPhoneTagConfig(java.util.List<QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfig> phoneTagConfig) {
            this.phoneTagConfig = phoneTagConfig;
            return this;
        }
        public java.util.List<QueryAiVoiceAgentDetailNewResponseBodyDataPhoneTagConfig> getPhoneTagConfig() {
            return this.phoneTagConfig;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyData setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyData setServiceDirection(String serviceDirection) {
            this.serviceDirection = serviceDirection;
            return this;
        }
        public String getServiceDirection() {
            return this.serviceDirection;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyData setSummaryConfig(QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfig summaryConfig) {
            this.summaryConfig = summaryConfig;
            return this;
        }
        public QueryAiVoiceAgentDetailNewResponseBodyDataSummaryConfig getSummaryConfig() {
            return this.summaryConfig;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyData setVersionDesc(String versionDesc) {
            this.versionDesc = versionDesc;
            return this;
        }
        public String getVersionDesc() {
            return this.versionDesc;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyData setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyData setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyData setVersionPublishStatus(Long versionPublishStatus) {
            this.versionPublishStatus = versionPublishStatus;
            return this;
        }
        public Long getVersionPublishStatus() {
            return this.versionPublishStatus;
        }

        public QueryAiVoiceAgentDetailNewResponseBodyData setVersionPublishTime(String versionPublishTime) {
            this.versionPublishTime = versionPublishTime;
            return this;
        }
        public String getVersionPublishTime() {
            return this.versionPublishTime;
        }

    }

}
