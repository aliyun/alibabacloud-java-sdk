// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateAICoachTaskSessionResponseBody extends TeaModel {
    /**
     * <p>rtctoken</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("channelToken")
    public String channelToken;

    /**
     * <strong>example:</strong>
     * <p>4830493A-728F-5F19-BBCC-1443292E9C49</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("scriptInfo")
    public CreateAICoachTaskSessionResponseBodyScriptInfo scriptInfo;

    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>Token</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("token")
    public String token;

    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
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
        @NameInMap("initiator")
        public String initiator;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("maxDuration")
        public Long maxDuration;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("scriptDesc")
        public String scriptDesc;

        @NameInMap("scriptName")
        public String scriptName;

        public static CreateAICoachTaskSessionResponseBodyScriptInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAICoachTaskSessionResponseBodyScriptInfo self = new CreateAICoachTaskSessionResponseBodyScriptInfo();
            return TeaModel.build(map, self);
        }

        public CreateAICoachTaskSessionResponseBodyScriptInfo setInitiator(String initiator) {
            this.initiator = initiator;
            return this;
        }
        public String getInitiator() {
            return this.initiator;
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

    }

}
