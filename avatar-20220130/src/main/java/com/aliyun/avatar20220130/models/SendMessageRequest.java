// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SendMessageRequest extends TeaModel {
    @NameInMap("Feedback")
    public Boolean feedback;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("StreamExtension")
    public SendMessageRequestStreamExtension streamExtension;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("TextRequest")
    public SendMessageRequestTextRequest textRequest;

    @NameInMap("VAMLRequest")
    public SendMessageRequestVAMLRequest VAMLRequest;

    public static SendMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageRequest self = new SendMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageRequest setFeedback(Boolean feedback) {
        this.feedback = feedback;
        return this;
    }
    public Boolean getFeedback() {
        return this.feedback;
    }

    public SendMessageRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SendMessageRequest setStreamExtension(SendMessageRequestStreamExtension streamExtension) {
        this.streamExtension = streamExtension;
        return this;
    }
    public SendMessageRequestStreamExtension getStreamExtension() {
        return this.streamExtension;
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

    public SendMessageRequest setVAMLRequest(SendMessageRequestVAMLRequest VAMLRequest) {
        this.VAMLRequest = VAMLRequest;
        return this;
    }
    public SendMessageRequestVAMLRequest getVAMLRequest() {
        return this.VAMLRequest;
    }

    public static class SendMessageRequestStreamExtension extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("IsStream")
        public Boolean isStream;

        @NameInMap("Position")
        public String position;

        public static SendMessageRequestStreamExtension build(java.util.Map<String, ?> map) throws Exception {
            SendMessageRequestStreamExtension self = new SendMessageRequestStreamExtension();
            return TeaModel.build(map, self);
        }

        public SendMessageRequestStreamExtension setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public SendMessageRequestStreamExtension setIsStream(Boolean isStream) {
            this.isStream = isStream;
            return this;
        }
        public Boolean getIsStream() {
            return this.isStream;
        }

        public SendMessageRequestStreamExtension setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

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

    public static class SendMessageRequestVAMLRequest extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Vaml")
        public String vaml;

        public static SendMessageRequestVAMLRequest build(java.util.Map<String, ?> map) throws Exception {
            SendMessageRequestVAMLRequest self = new SendMessageRequestVAMLRequest();
            return TeaModel.build(map, self);
        }

        public SendMessageRequestVAMLRequest setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SendMessageRequestVAMLRequest setVaml(String vaml) {
            this.vaml = vaml;
            return this;
        }
        public String getVaml() {
            return this.vaml;
        }

    }

}
