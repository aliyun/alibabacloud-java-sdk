// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateAICoachTaskSessionResponseBody extends TeaModel {
    @NameInMap("channelToken")
    public String channelToken;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("scriptInfo")
    public CreateAICoachTaskSessionResponseBodyScriptInfo scriptInfo;

    @NameInMap("sessionId")
    public String sessionId;

    @NameInMap("sessionStatus")
    public Long sessionStatus;

    @NameInMap("token")
    public String token;

    @NameInMap("webSocketUrl")
    public String webSocketUrl;

    public static CreateAICoachTaskSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAICoachTaskSessionResponseBody self = new CreateAICoachTaskSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAICoachTaskSessionResponseBody setChannelToken(String channelToken) {
        this.channelToken = channelToken;
        return this;
    }
    public String getChannelToken() {
        return this.channelToken;
    }

    public CreateAICoachTaskSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAICoachTaskSessionResponseBody setScriptInfo(CreateAICoachTaskSessionResponseBodyScriptInfo scriptInfo) {
        this.scriptInfo = scriptInfo;
        return this;
    }
    public CreateAICoachTaskSessionResponseBodyScriptInfo getScriptInfo() {
        return this.scriptInfo;
    }

    public CreateAICoachTaskSessionResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CreateAICoachTaskSessionResponseBody setSessionStatus(Long sessionStatus) {
        this.sessionStatus = sessionStatus;
        return this;
    }
    public Long getSessionStatus() {
        return this.sessionStatus;
    }

    public CreateAICoachTaskSessionResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateAICoachTaskSessionResponseBody setWebSocketUrl(String webSocketUrl) {
        this.webSocketUrl = webSocketUrl;
        return this;
    }
    public String getWebSocketUrl() {
        return this.webSocketUrl;
    }

    public static class CreateAICoachTaskSessionResponseBodyScriptInfo extends TeaModel {
        @NameInMap("agentIconUrl")
        public String agentIconUrl;

        @NameInMap("characterName")
        public String characterName;

        @NameInMap("dialogueTextFlag")
        public Boolean dialogueTextFlag;

        @NameInMap("dialogueTipFlag")
        public Boolean dialogueTipFlag;

        @NameInMap("initiator")
        public String initiator;

        @NameInMap("inputTypeList")
        public java.util.List<String> inputTypeList;

        @NameInMap("maxDuration")
        public Long maxDuration;

        @NameInMap("scriptDesc")
        public String scriptDesc;

        @NameInMap("scriptName")
        public String scriptName;

        @NameInMap("scriptRecordId")
        public String scriptRecordId;

        @NameInMap("scriptType")
        public Long scriptType;

        @NameInMap("sparringTipContent")
        public String sparringTipContent;

        @NameInMap("sparringTipTitle")
        public String sparringTipTitle;

        @NameInMap("studentThinkTimeFlag")
        public Boolean studentThinkTimeFlag;

        @NameInMap("studentThinkTimeLimit")
        public Long studentThinkTimeLimit;

        public static CreateAICoachTaskSessionResponseBodyScriptInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAICoachTaskSessionResponseBodyScriptInfo self = new CreateAICoachTaskSessionResponseBodyScriptInfo();
            return TeaModel.build(map, self);
        }

        public CreateAICoachTaskSessionResponseBodyScriptInfo setAgentIconUrl(String agentIconUrl) {
            this.agentIconUrl = agentIconUrl;
            return this;
        }
        public String getAgentIconUrl() {
            return this.agentIconUrl;
        }

        public CreateAICoachTaskSessionResponseBodyScriptInfo setCharacterName(String characterName) {
            this.characterName = characterName;
            return this;
        }
        public String getCharacterName() {
            return this.characterName;
        }

        public CreateAICoachTaskSessionResponseBodyScriptInfo setDialogueTextFlag(Boolean dialogueTextFlag) {
            this.dialogueTextFlag = dialogueTextFlag;
            return this;
        }
        public Boolean getDialogueTextFlag() {
            return this.dialogueTextFlag;
        }

        public CreateAICoachTaskSessionResponseBodyScriptInfo setDialogueTipFlag(Boolean dialogueTipFlag) {
            this.dialogueTipFlag = dialogueTipFlag;
            return this;
        }
        public Boolean getDialogueTipFlag() {
            return this.dialogueTipFlag;
        }

        public CreateAICoachTaskSessionResponseBodyScriptInfo setInitiator(String initiator) {
            this.initiator = initiator;
            return this;
        }
        public String getInitiator() {
            return this.initiator;
        }

        public CreateAICoachTaskSessionResponseBodyScriptInfo setInputTypeList(java.util.List<String> inputTypeList) {
            this.inputTypeList = inputTypeList;
            return this;
        }
        public java.util.List<String> getInputTypeList() {
            return this.inputTypeList;
        }

        public CreateAICoachTaskSessionResponseBodyScriptInfo setMaxDuration(Long maxDuration) {
            this.maxDuration = maxDuration;
            return this;
        }
        public Long getMaxDuration() {
            return this.maxDuration;
        }

        public CreateAICoachTaskSessionResponseBodyScriptInfo setScriptDesc(String scriptDesc) {
            this.scriptDesc = scriptDesc;
            return this;
        }
        public String getScriptDesc() {
            return this.scriptDesc;
        }

        public CreateAICoachTaskSessionResponseBodyScriptInfo setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public CreateAICoachTaskSessionResponseBodyScriptInfo setScriptRecordId(String scriptRecordId) {
            this.scriptRecordId = scriptRecordId;
            return this;
        }
        public String getScriptRecordId() {
            return this.scriptRecordId;
        }

        public CreateAICoachTaskSessionResponseBodyScriptInfo setScriptType(Long scriptType) {
            this.scriptType = scriptType;
            return this;
        }
        public Long getScriptType() {
            return this.scriptType;
        }

        public CreateAICoachTaskSessionResponseBodyScriptInfo setSparringTipContent(String sparringTipContent) {
            this.sparringTipContent = sparringTipContent;
            return this;
        }
        public String getSparringTipContent() {
            return this.sparringTipContent;
        }

        public CreateAICoachTaskSessionResponseBodyScriptInfo setSparringTipTitle(String sparringTipTitle) {
            this.sparringTipTitle = sparringTipTitle;
            return this;
        }
        public String getSparringTipTitle() {
            return this.sparringTipTitle;
        }

        public CreateAICoachTaskSessionResponseBodyScriptInfo setStudentThinkTimeFlag(Boolean studentThinkTimeFlag) {
            this.studentThinkTimeFlag = studentThinkTimeFlag;
            return this;
        }
        public Boolean getStudentThinkTimeFlag() {
            return this.studentThinkTimeFlag;
        }

        public CreateAICoachTaskSessionResponseBodyScriptInfo setStudentThinkTimeLimit(Long studentThinkTimeLimit) {
            this.studentThinkTimeLimit = studentThinkTimeLimit;
            return this;
        }
        public Long getStudentThinkTimeLimit() {
            return this.studentThinkTimeLimit;
        }

    }

}
