// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryAiVoiceAgentDetailResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why the access was denied.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the agent.</p>
     */
    @NameInMap("Data")
    public QueryAiVoiceAgentDetailResponseBodyData data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>742C9243-2870-B8D6-0C68-C60BEB2DF09A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful. Possible values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The operation was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: Failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAiVoiceAgentDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAiVoiceAgentDetailResponseBody self = new QueryAiVoiceAgentDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAiVoiceAgentDetailResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryAiVoiceAgentDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAiVoiceAgentDetailResponseBody setData(QueryAiVoiceAgentDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAiVoiceAgentDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryAiVoiceAgentDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAiVoiceAgentDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAiVoiceAgentDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigEventConfig extends TeaModel {
        /**
         * <p>Specifies whether to hang up the call if an answering machine is detected.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CallAssistantHangup")
        public Boolean callAssistantHangup;

        /**
         * <p>Whether answering machine detection is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CallAssistantRecognize")
        public Boolean callAssistantRecognize;

        /**
         * <p>Specifies whether to trigger the model on the first silence event.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MuteActive")
        public Boolean muteActive;

        /**
         * <p>Silence duration.</p>
         * <blockquote>
         * <ul>
         * <li><p>Maximum value: 15 s.</p>
         * </li>
         * <li><p>Minimum value: 3 s.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MuteDuration")
        public Long muteDuration;

        /**
         * <p>The system automatically disconnects the call after a specified number of consecutive silence events.</p>
         * <blockquote>
         * <ul>
         * <li><p>Maximum value: 5.</p>
         * </li>
         * <li><p>Minimum value: 1.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MuteHangupNum")
        public Long muteHangupNum;

        /**
         * <p>The maximum call duration, in seconds. The call automatically disconnects when this duration is exceeded.</p>
         * <blockquote>
         * <ul>
         * <li><p>Maximum value: 3600.</p>
         * </li>
         * <li><p>Minimum value: 600.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("SessionTimeout")
        public Long sessionTimeout;

        public static QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigEventConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigEventConfig self = new QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigEventConfig();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigEventConfig setCallAssistantHangup(Boolean callAssistantHangup) {
            this.callAssistantHangup = callAssistantHangup;
            return this;
        }
        public Boolean getCallAssistantHangup() {
            return this.callAssistantHangup;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigEventConfig setCallAssistantRecognize(Boolean callAssistantRecognize) {
            this.callAssistantRecognize = callAssistantRecognize;
            return this;
        }
        public Boolean getCallAssistantRecognize() {
            return this.callAssistantRecognize;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigEventConfig setMuteActive(Boolean muteActive) {
            this.muteActive = muteActive;
            return this;
        }
        public Boolean getMuteActive() {
            return this.muteActive;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigEventConfig setMuteDuration(Long muteDuration) {
            this.muteDuration = muteDuration;
            return this;
        }
        public Long getMuteDuration() {
            return this.muteDuration;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigEventConfig setMuteHangupNum(Long muteHangupNum) {
            this.muteHangupNum = muteHangupNum;
            return this;
        }
        public Long getMuteHangupNum() {
            return this.muteHangupNum;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigEventConfig setSessionTimeout(Long sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
            return this;
        }
        public Long getSessionTimeout() {
            return this.sessionTimeout;
        }

    }

    public static class QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigTtsConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BackgroundEnabled")
        public Boolean backgroundEnabled;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BackgroundSound")
        public Long backgroundSound;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BackgroundVolume")
        public Long backgroundVolume;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MixingEnabled")
        public Boolean mixingEnabled;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MixingTemplate")
        public Long mixingTemplate;

        /**
         * <p>The TTS speech rate.</p>
         * <blockquote>
         * <ul>
         * <li><p>Valid values: -200 to 200. Default value: 0.</p>
         * </li>
         * <li><p>If this parameter is not specified, the speech rate configured for the large model application is used.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>34</p>
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
         * <p>The TTS playback volume.</p>
         * <blockquote>
         * <ul>
         * <li><p>Valid values: 0 to 100. Default value: 0.</p>
         * </li>
         * <li><p>If this parameter is not specified, the volume configured for the large model application is used.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("TtsVolume")
        public Long ttsVolume;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("VoiceCode")
        public String voiceCode;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("VoiceType")
        public String voiceType;

        public static QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigTtsConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigTtsConfig self = new QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigTtsConfig();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigTtsConfig setBackgroundEnabled(Boolean backgroundEnabled) {
            this.backgroundEnabled = backgroundEnabled;
            return this;
        }
        public Boolean getBackgroundEnabled() {
            return this.backgroundEnabled;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigTtsConfig setBackgroundSound(Long backgroundSound) {
            this.backgroundSound = backgroundSound;
            return this;
        }
        public Long getBackgroundSound() {
            return this.backgroundSound;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigTtsConfig setBackgroundVolume(Long backgroundVolume) {
            this.backgroundVolume = backgroundVolume;
            return this;
        }
        public Long getBackgroundVolume() {
            return this.backgroundVolume;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigTtsConfig setMixingEnabled(Boolean mixingEnabled) {
            this.mixingEnabled = mixingEnabled;
            return this;
        }
        public Boolean getMixingEnabled() {
            return this.mixingEnabled;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigTtsConfig setMixingTemplate(Long mixingTemplate) {
            this.mixingTemplate = mixingTemplate;
            return this;
        }
        public Long getMixingTemplate() {
            return this.mixingTemplate;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigTtsConfig setTtsSpeed(Long ttsSpeed) {
            this.ttsSpeed = ttsSpeed;
            return this;
        }
        public Long getTtsSpeed() {
            return this.ttsSpeed;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigTtsConfig setTtsStyle(String ttsStyle) {
            this.ttsStyle = ttsStyle;
            return this;
        }
        public String getTtsStyle() {
            return this.ttsStyle;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigTtsConfig setTtsVolume(Long ttsVolume) {
            this.ttsVolume = ttsVolume;
            return this;
        }
        public Long getTtsVolume() {
            return this.ttsVolume;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigTtsConfig setVoiceCode(String voiceCode) {
            this.voiceCode = voiceCode;
            return this;
        }
        public String getVoiceCode() {
            return this.voiceCode;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigTtsConfig setVoiceType(String voiceType) {
            this.voiceType = voiceType;
            return this;
        }
        public String getVoiceType() {
            return this.voiceType;
        }

    }

    public static class QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfig extends TeaModel {
        /**
         * <p>The call event configuration.</p>
         */
        @NameInMap("EventConfig")
        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigEventConfig eventConfig;

        /**
         * <p>The TTS configuration.</p>
         */
        @NameInMap("TtsConfig")
        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigTtsConfig ttsConfig;

        /**
         * <p>The ID of the hotword.</p>
         * 
         * <strong>example:</strong>
         * <p>afb2c43**********83e6df30551c11f7</p>
         */
        @NameInMap("VocabId")
        public String vocabId;

        public static QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfig self = new QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfig();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfig setEventConfig(QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigEventConfig eventConfig) {
            this.eventConfig = eventConfig;
            return this;
        }
        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigEventConfig getEventConfig() {
            return this.eventConfig;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfig setTtsConfig(QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigTtsConfig ttsConfig) {
            this.ttsConfig = ttsConfig;
            return this;
        }
        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfigTtsConfig getTtsConfig() {
            return this.ttsConfig;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfig setVocabId(String vocabId) {
            this.vocabId = vocabId;
            return this;
        }
        public String getVocabId() {
            return this.vocabId;
        }

    }

    public static class QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigChildTaskList extends TeaModel {
        /**
         * <p>The description of the subtask.</p>
         * 
         * <strong>example:</strong>
         * <p>新用户邀约: \&quot;喂，家长您好！我是***<strong>的王老师，我们现在有</strong>课程100个试听名额，想帮宝贝安排一下体验，您看什么时候比较方便呢？\</p>
         */
        @NameInMap("ChildTaskDescription")
        public String childTaskDescription;

        /**
         * <p>The name of the subtask.</p>
         * 
         * <strong>example:</strong>
         * <p>开场与邀约</p>
         */
        @NameInMap("ChildTaskName")
        public String childTaskName;

        /**
         * <p>The unique ID of the subtask.</p>
         * 
         * <strong>example:</strong>
         * <p>280cd4bf-*******df472c</p>
         */
        @NameInMap("Id")
        public String id;

        public static QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigChildTaskList build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigChildTaskList self = new QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigChildTaskList();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigChildTaskList setChildTaskDescription(String childTaskDescription) {
            this.childTaskDescription = childTaskDescription;
            return this;
        }
        public String getChildTaskDescription() {
            return this.childTaskDescription;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigChildTaskList setChildTaskName(String childTaskName) {
            this.childTaskName = childTaskName;
            return this;
        }
        public String getChildTaskName() {
            return this.childTaskName;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigChildTaskList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigCustomExceptionList extends TeaModel {
        /**
         * <p>Specifies whether to output the content as an exception tag.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExceptionSign")
        public Boolean exceptionSign;

        /**
         * <p>The exception type.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ExceptionType")
        public String exceptionType;

        /**
         * <p>The reply.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Reply")
        public String reply;

        /**
         * <p>Specifies whether interruption is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SupportBreak")
        public Boolean supportBreak;

        public static QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigCustomExceptionList build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigCustomExceptionList self = new QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigCustomExceptionList();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigCustomExceptionList setExceptionSign(Boolean exceptionSign) {
            this.exceptionSign = exceptionSign;
            return this;
        }
        public Boolean getExceptionSign() {
            return this.exceptionSign;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigCustomExceptionList setExceptionType(String exceptionType) {
            this.exceptionType = exceptionType;
            return this;
        }
        public String getExceptionType() {
            return this.exceptionType;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigCustomExceptionList setReply(String reply) {
            this.reply = reply;
            return this;
        }
        public String getReply() {
            return this.reply;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigCustomExceptionList setSupportBreak(Boolean supportBreak) {
            this.supportBreak = supportBreak;
            return this;
        }
        public Boolean getSupportBreak() {
            return this.supportBreak;
        }

    }

    public static class QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurposeMainPurposeEnum extends TeaModel {
        /**
         * <p>The description of the value.</p>
         * 
         * <strong>example:</strong>
         * <p>意向强烈。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The unique ID of the value.</p>
         * 
         * <strong>example:</strong>
         * <p>d5606d80-7625-dcea-xxxx-17f66fbb564a</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The value.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurposeMainPurposeEnum build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurposeMainPurposeEnum self = new QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurposeMainPurposeEnum();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurposeMainPurposeEnum setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurposeMainPurposeEnum setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurposeMainPurposeEnum setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurpose extends TeaModel {
        /**
         * <p>The ID of the main intent.</p>
         * 
         * <strong>example:</strong>
         * <p>1ee6e994-08e0-xxxx-f662-1659cc54d409</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The description of the main intent.</p>
         * 
         * <strong>example:</strong>
         * <p>通话效果评级：A、B、C、D，（A最好）</p>
         */
        @NameInMap("MainPurposeDescription")
        public String mainPurposeDescription;

        /**
         * <p>The list of valid values for the main intent.</p>
         */
        @NameInMap("MainPurposeEnum")
        public java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurposeMainPurposeEnum> mainPurposeEnum;

        /**
         * <p>The name of the main intent.</p>
         * 
         * <strong>example:</strong>
         * <p>通话效果评级</p>
         */
        @NameInMap("MainPurposeName")
        public String mainPurposeName;

        /**
         * <p>The value type of the main intent. Currently, only the <code>ENUM</code> type is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ENUM</p>
         */
        @NameInMap("MainPurposeType")
        public String mainPurposeType;

        public static QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurpose build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurpose self = new QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurpose();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurpose setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurpose setMainPurposeDescription(String mainPurposeDescription) {
            this.mainPurposeDescription = mainPurposeDescription;
            return this;
        }
        public String getMainPurposeDescription() {
            return this.mainPurposeDescription;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurpose setMainPurposeEnum(java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurposeMainPurposeEnum> mainPurposeEnum) {
            this.mainPurposeEnum = mainPurposeEnum;
            return this;
        }
        public java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurposeMainPurposeEnum> getMainPurposeEnum() {
            return this.mainPurposeEnum;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurpose setMainPurposeName(String mainPurposeName) {
            this.mainPurposeName = mainPurposeName;
            return this;
        }
        public String getMainPurposeName() {
            return this.mainPurposeName;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurpose setMainPurposeType(String mainPurposeType) {
            this.mainPurposeType = mainPurposeType;
            return this;
        }
        public String getMainPurposeType() {
            return this.mainPurposeType;
        }

    }

    public static class QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfigOutputTagEnum extends TeaModel {
        /**
         * <p>The description of the enumerated value.</p>
         * 
         * <strong>example:</strong>
         * <p>高（非常积极，大概率转化）</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The unique ID of the enumerated value.</p>
         * 
         * <strong>example:</strong>
         * <p>8757************2c499fa</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The enumerated value.</p>
         * 
         * <strong>example:</strong>
         * <p>高</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfigOutputTagEnum build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfigOutputTagEnum self = new QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfigOutputTagEnum();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfigOutputTagEnum setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfigOutputTagEnum setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfigOutputTagEnum setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfig extends TeaModel {
        /**
         * <p>The unique ID of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>8757************2c499fa</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The description of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>记录本次通话的最终状态</p>
         */
        @NameInMap("OutputTagDescription")
        public String outputTagDescription;

        /**
         * <p>The enumerated values for the tag. This parameter is returned only if the value of <code>OutputTagType</code> is <code>ENUM</code>.</p>
         */
        @NameInMap("OutputTagEnum")
        public java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfigOutputTagEnum> outputTagEnum;

        /**
         * <p>The name of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>客户意向度</p>
         */
        @NameInMap("OutputTagName")
        public String outputTagName;

        /**
         * <p>The data type of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>ENUM</p>
         */
        @NameInMap("OutputTagType")
        public String outputTagType;

        public static QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfig self = new QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfig();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfig setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfig setOutputTagDescription(String outputTagDescription) {
            this.outputTagDescription = outputTagDescription;
            return this;
        }
        public String getOutputTagDescription() {
            return this.outputTagDescription;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfig setOutputTagEnum(java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfigOutputTagEnum> outputTagEnum) {
            this.outputTagEnum = outputTagEnum;
            return this;
        }
        public java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfigOutputTagEnum> getOutputTagEnum() {
            return this.outputTagEnum;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfig setOutputTagName(String outputTagName) {
            this.outputTagName = outputTagName;
            return this;
        }
        public String getOutputTagName() {
            return this.outputTagName;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfig setOutputTagType(String outputTagType) {
            this.outputTagType = outputTagType;
            return this;
        }
        public String getOutputTagType() {
            return this.outputTagType;
        }

    }

    public static class QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfigPhoneTagEnum extends TeaModel {
        /**
         * <p>The description of the enumerated value.</p>
         * 
         * <strong>example:</strong>
         * <p>客户完全不接受挽留</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The unique ID of the enumerated value.</p>
         * 
         * <strong>example:</strong>
         * <p>c3d4ff4e-*********bc26dc044682</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The enumerated value.</p>
         * 
         * <strong>example:</strong>
         * <p>完全不接受</p>
         */
        @NameInMap("Value")
        public String value;

        public static QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfigPhoneTagEnum build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfigPhoneTagEnum self = new QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfigPhoneTagEnum();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfigPhoneTagEnum setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfigPhoneTagEnum setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfigPhoneTagEnum setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfig extends TeaModel {
        /**
         * <p>The unique ID of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>280cd4bf-*******df472c</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The description of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>用户感兴趣的车系。</p>
         */
        @NameInMap("PhoneTagDescription")
        public String phoneTagDescription;

        /**
         * <p>A list of enumerated values for the variable. This parameter is returned only if the value of <code>PhoneTagType</code> is <code>ENUM</code>.</p>
         */
        @NameInMap("PhoneTagEnum")
        public java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfigPhoneTagEnum> phoneTagEnum;

        /**
         * <p>The key of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>testParam</p>
         */
        @NameInMap("PhoneTagKey")
        public String phoneTagKey;

        /**
         * <p>The name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>意向车系</p>
         */
        @NameInMap("PhoneTagName")
        public String phoneTagName;

        /**
         * <p>Specifies whether the variable is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PhoneTagRequired")
        public Boolean phoneTagRequired;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("PhoneTagSource")
        public String phoneTagSource;

        /**
         * <p>The data type of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>ENUM</p>
         */
        @NameInMap("PhoneTagType")
        public String phoneTagType;

        public static QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfig self = new QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfig();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfig setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfig setPhoneTagDescription(String phoneTagDescription) {
            this.phoneTagDescription = phoneTagDescription;
            return this;
        }
        public String getPhoneTagDescription() {
            return this.phoneTagDescription;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfig setPhoneTagEnum(java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfigPhoneTagEnum> phoneTagEnum) {
            this.phoneTagEnum = phoneTagEnum;
            return this;
        }
        public java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfigPhoneTagEnum> getPhoneTagEnum() {
            return this.phoneTagEnum;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfig setPhoneTagKey(String phoneTagKey) {
            this.phoneTagKey = phoneTagKey;
            return this;
        }
        public String getPhoneTagKey() {
            return this.phoneTagKey;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfig setPhoneTagName(String phoneTagName) {
            this.phoneTagName = phoneTagName;
            return this;
        }
        public String getPhoneTagName() {
            return this.phoneTagName;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfig setPhoneTagRequired(Boolean phoneTagRequired) {
            this.phoneTagRequired = phoneTagRequired;
            return this;
        }
        public Boolean getPhoneTagRequired() {
            return this.phoneTagRequired;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfig setPhoneTagSource(String phoneTagSource) {
            this.phoneTagSource = phoneTagSource;
            return this;
        }
        public String getPhoneTagSource() {
            return this.phoneTagSource;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfig setPhoneTagType(String phoneTagType) {
            this.phoneTagType = phoneTagType;
            return this;
        }
        public String getPhoneTagType() {
            return this.phoneTagType;
        }

    }

    public static class QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig extends TeaModel {
        /**
         * <p>The configuration for the basic task.</p>
         * 
         * <strong>example:</strong>
         * <p>任务描述。</p>
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
         * <p>The list of subtask configurations.</p>
         */
        @NameInMap("ChildTaskList")
        public java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigChildTaskList> childTaskList;

        /**
         * <p>Specifies whether custom exception handling is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CustomExceptionEnable")
        public Boolean customExceptionEnable;

        /**
         * <p>The ID of the custom exception file.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS文件ID</p>
         */
        @NameInMap("CustomExceptionFileId")
        public String customExceptionFileId;

        /**
         * <p>The name of the custom exception file.</p>
         * 
         * <strong>example:</strong>
         * <p>异常测试文件.xlsx</p>
         */
        @NameInMap("CustomExceptionFileName")
        public String customExceptionFileName;

        /**
         * <p>This parameter is deprecated and will be removed in a future release.</p>
         */
        @NameInMap("CustomExceptionList")
        public java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigCustomExceptionList> customExceptionList;

        /**
         * <p>This parameter is deprecated and will be removed in a future release.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("CustomExceptionUrlPath")
        public String customExceptionUrlPath;

        /**
         * <p>The voice style.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CustomExceptionVoiceStyle")
        public Long customExceptionVoiceStyle;

        /**
         * <p>The description of the advanced task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>这次外呼通过三个核心步骤与家长沟通，........ 3. 用户需求 &gt; 主动介绍</p>
         */
        @NameInMap("FlowDesc")
        public String flowDesc;

        /**
         * <p>The list of knowledge document IDs.</p>
         */
        @NameInMap("KnowledgeDocIdList")
        public java.util.List<String> knowledgeDocIdList;

        /**
         * <p>The list of knowledge document names.</p>
         */
        @NameInMap("KnowledgeDocNameList")
        public java.util.List<String> knowledgeDocNameList;

        /**
         * <p>A list of original file names for the knowledge base documents.</p>
         */
        @NameInMap("KnowledgeDocOriginalNameList")
        public java.util.List<String> knowledgeDocOriginalNameList;

        /**
         * <p>Specifies whether the agent is associated with a knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("KnowledgeEnable")
        public Boolean knowledgeEnable;

        /**
         * <p>The ID of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>1232131*******</p>
         */
        @NameInMap("KnowledgeId")
        public String knowledgeId;

        /**
         * <p>The main intent configuration.</p>
         */
        @NameInMap("MainPurpose")
        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurpose mainPurpose;

        /**
         * <p>The output tag configuration.</p>
         */
        @NameInMap("OutputTagConfig")
        public java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfig> outputTagConfig;

        /**
         * <p>The call variable configuration.</p>
         */
        @NameInMap("PhoneTagConfig")
        public java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfig> phoneTagConfig;

        /**
         * <p>The opening statement.</p>
         * 
         * <strong>example:</strong>
         * <p>你好，这里是******。</p>
         */
        @NameInMap("Prologue")
        public String prologue;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("RecordingFile")
        public String recordingFile;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StartWordType")
        public Long startWordType;

        /**
         * <p>The system role.</p>
         * 
         * <strong>example:</strong>
         * <p>课程销售</p>
         */
        @NameInMap("SysRole")
        public String sysRole;

        /**
         * <p>The task type.</p>
         * 
         * <strong>example:</strong>
         * <p>ADVANCED</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The user role.</p>
         * 
         * <strong>example:</strong>
         * <p>急需课程的新用户</p>
         */
        @NameInMap("UserRole")
        public String userRole;

        public static QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig self = new QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setBasicTaskDescription(String basicTaskDescription) {
            this.basicTaskDescription = basicTaskDescription;
            return this;
        }
        public String getBasicTaskDescription() {
            return this.basicTaskDescription;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setBusinessType(Long businessType) {
            this.businessType = businessType;
            return this;
        }
        public Long getBusinessType() {
            return this.businessType;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setChildTaskList(java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigChildTaskList> childTaskList) {
            this.childTaskList = childTaskList;
            return this;
        }
        public java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigChildTaskList> getChildTaskList() {
            return this.childTaskList;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setCustomExceptionEnable(Boolean customExceptionEnable) {
            this.customExceptionEnable = customExceptionEnable;
            return this;
        }
        public Boolean getCustomExceptionEnable() {
            return this.customExceptionEnable;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setCustomExceptionFileId(String customExceptionFileId) {
            this.customExceptionFileId = customExceptionFileId;
            return this;
        }
        public String getCustomExceptionFileId() {
            return this.customExceptionFileId;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setCustomExceptionFileName(String customExceptionFileName) {
            this.customExceptionFileName = customExceptionFileName;
            return this;
        }
        public String getCustomExceptionFileName() {
            return this.customExceptionFileName;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setCustomExceptionList(java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigCustomExceptionList> customExceptionList) {
            this.customExceptionList = customExceptionList;
            return this;
        }
        public java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigCustomExceptionList> getCustomExceptionList() {
            return this.customExceptionList;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setCustomExceptionUrlPath(String customExceptionUrlPath) {
            this.customExceptionUrlPath = customExceptionUrlPath;
            return this;
        }
        public String getCustomExceptionUrlPath() {
            return this.customExceptionUrlPath;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setCustomExceptionVoiceStyle(Long customExceptionVoiceStyle) {
            this.customExceptionVoiceStyle = customExceptionVoiceStyle;
            return this;
        }
        public Long getCustomExceptionVoiceStyle() {
            return this.customExceptionVoiceStyle;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setFlowDesc(String flowDesc) {
            this.flowDesc = flowDesc;
            return this;
        }
        public String getFlowDesc() {
            return this.flowDesc;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setKnowledgeDocIdList(java.util.List<String> knowledgeDocIdList) {
            this.knowledgeDocIdList = knowledgeDocIdList;
            return this;
        }
        public java.util.List<String> getKnowledgeDocIdList() {
            return this.knowledgeDocIdList;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setKnowledgeDocNameList(java.util.List<String> knowledgeDocNameList) {
            this.knowledgeDocNameList = knowledgeDocNameList;
            return this;
        }
        public java.util.List<String> getKnowledgeDocNameList() {
            return this.knowledgeDocNameList;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setKnowledgeDocOriginalNameList(java.util.List<String> knowledgeDocOriginalNameList) {
            this.knowledgeDocOriginalNameList = knowledgeDocOriginalNameList;
            return this;
        }
        public java.util.List<String> getKnowledgeDocOriginalNameList() {
            return this.knowledgeDocOriginalNameList;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setKnowledgeEnable(Boolean knowledgeEnable) {
            this.knowledgeEnable = knowledgeEnable;
            return this;
        }
        public Boolean getKnowledgeEnable() {
            return this.knowledgeEnable;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setKnowledgeId(String knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }
        public String getKnowledgeId() {
            return this.knowledgeId;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setMainPurpose(QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurpose mainPurpose) {
            this.mainPurpose = mainPurpose;
            return this;
        }
        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigMainPurpose getMainPurpose() {
            return this.mainPurpose;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setOutputTagConfig(java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfig> outputTagConfig) {
            this.outputTagConfig = outputTagConfig;
            return this;
        }
        public java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigOutputTagConfig> getOutputTagConfig() {
            return this.outputTagConfig;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setPhoneTagConfig(java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfig> phoneTagConfig) {
            this.phoneTagConfig = phoneTagConfig;
            return this;
        }
        public java.util.List<QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfigPhoneTagConfig> getPhoneTagConfig() {
            return this.phoneTagConfig;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setPrologue(String prologue) {
            this.prologue = prologue;
            return this;
        }
        public String getPrologue() {
            return this.prologue;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setRecordingFile(String recordingFile) {
            this.recordingFile = recordingFile;
            return this;
        }
        public String getRecordingFile() {
            return this.recordingFile;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setStartWordType(Long startWordType) {
            this.startWordType = startWordType;
            return this;
        }
        public Long getStartWordType() {
            return this.startWordType;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setSysRole(String sysRole) {
            this.sysRole = sysRole;
            return this;
        }
        public String getSysRole() {
            return this.sysRole;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig setUserRole(String userRole) {
            this.userRole = userRole;
            return this;
        }
        public String getUserRole() {
            return this.userRole;
        }

    }

    public static class QueryAiVoiceAgentDetailResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>12311212******</p>
         */
        @NameInMap("AgentId")
        public Long agentId;

        /**
         * <p>The name of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>测试智能体</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>The voice configuration for AI-powered outbound calls.</p>
         */
        @NameInMap("AiVoiceAgentCallConfig")
        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfig aiVoiceAgentCallConfig;

        /**
         * <p>The model configuration for the agent.</p>
         */
        @NameInMap("AiVoiceAgentModelConfig")
        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig aiVoiceAgentModelConfig;

        /**
         * <p>The name of the business scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>个人线索转化</p>
         */
        @NameInMap("BusinessTypeName")
        public String businessTypeName;

        /**
         * <p>The description of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>日常测试使用。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>测试知识库</p>
         */
        @NameInMap("KnowledgeName")
        public String knowledgeName;

        /**
         * <p>The status of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>The name of the voice style.</p>
         * 
         * <strong>example:</strong>
         * <p>亲切</p>
         */
        @NameInMap("VoiceStyleName")
        public String voiceStyleName;

        public static QueryAiVoiceAgentDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAiVoiceAgentDetailResponseBodyData self = new QueryAiVoiceAgentDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAiVoiceAgentDetailResponseBodyData setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public QueryAiVoiceAgentDetailResponseBodyData setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public QueryAiVoiceAgentDetailResponseBodyData setAiVoiceAgentCallConfig(QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfig aiVoiceAgentCallConfig) {
            this.aiVoiceAgentCallConfig = aiVoiceAgentCallConfig;
            return this;
        }
        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentCallConfig getAiVoiceAgentCallConfig() {
            return this.aiVoiceAgentCallConfig;
        }

        public QueryAiVoiceAgentDetailResponseBodyData setAiVoiceAgentModelConfig(QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig aiVoiceAgentModelConfig) {
            this.aiVoiceAgentModelConfig = aiVoiceAgentModelConfig;
            return this;
        }
        public QueryAiVoiceAgentDetailResponseBodyDataAiVoiceAgentModelConfig getAiVoiceAgentModelConfig() {
            return this.aiVoiceAgentModelConfig;
        }

        public QueryAiVoiceAgentDetailResponseBodyData setBusinessTypeName(String businessTypeName) {
            this.businessTypeName = businessTypeName;
            return this;
        }
        public String getBusinessTypeName() {
            return this.businessTypeName;
        }

        public QueryAiVoiceAgentDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryAiVoiceAgentDetailResponseBodyData setKnowledgeName(String knowledgeName) {
            this.knowledgeName = knowledgeName;
            return this;
        }
        public String getKnowledgeName() {
            return this.knowledgeName;
        }

        public QueryAiVoiceAgentDetailResponseBodyData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryAiVoiceAgentDetailResponseBodyData setVoiceStyleName(String voiceStyleName) {
            this.voiceStyleName = voiceStyleName;
            return this;
        }
        public String getVoiceStyleName() {
            return this.voiceStyleName;
        }

    }

}
