// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SendMessageRequest extends TeaModel {
    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("TextRequest")
    public SendMessageRequestTextRequest textRequest;

    public static SendMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageRequest self = new SendMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SendMessageRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public SendMessageRequest setTextRequest(SendMessageRequestTextRequest textRequest) {
        this.textRequest = textRequest;
        return this;
    }
    public SendMessageRequestTextRequest getTextRequest() {
        return this.textRequest;
    }

    public static class SendMessageRequestTextRequest extends TeaModel {
        @NameInMap("CommandType")
        public String commandType;

        @NameInMap("Id")
        public String id;

        @NameInMap("SpeechText")
        public String speechText;

        @NameInMap("interrupt")
        public Boolean interrupt;

        public static SendMessageRequestTextRequest build(java.util.Map<String, ?> map) throws Exception {
            SendMessageRequestTextRequest self = new SendMessageRequestTextRequest();
            return TeaModel.build(map, self);
        }

        public SendMessageRequestTextRequest setCommandType(String commandType) {
            this.commandType = commandType;
            return this;
        }
        public String getCommandType() {
            return this.commandType;
        }

        public SendMessageRequestTextRequest setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SendMessageRequestTextRequest setSpeechText(String speechText) {
            this.speechText = speechText;
            return this;
        }
        public String getSpeechText() {
            return this.speechText;
        }

        public SendMessageRequestTextRequest setInterrupt(Boolean interrupt) {
            this.interrupt = interrupt;
            return this;
        }
        public Boolean getInterrupt() {
            return this.interrupt;
        }

    }

}
