// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunLegalAdviceConsultationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>farui</p>
     */
    @NameInMap("appId")
    public String appId;

    @NameInMap("assistant")
    public RunLegalAdviceConsultationRequestAssistant assistant;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    @NameInMap("thread")
    public RunLegalAdviceConsultationRequestThread thread;

    public static RunLegalAdviceConsultationRequest build(java.util.Map<String, ?> map) throws Exception {
        RunLegalAdviceConsultationRequest self = new RunLegalAdviceConsultationRequest();
        return TeaModel.build(map, self);
    }

    public RunLegalAdviceConsultationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RunLegalAdviceConsultationRequest setAssistant(RunLegalAdviceConsultationRequestAssistant assistant) {
        this.assistant = assistant;
        return this;
    }
    public RunLegalAdviceConsultationRequestAssistant getAssistant() {
        return this.assistant;
    }

    public RunLegalAdviceConsultationRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public RunLegalAdviceConsultationRequest setThread(RunLegalAdviceConsultationRequestThread thread) {
        this.thread = thread;
        return this;
    }
    public RunLegalAdviceConsultationRequestThread getThread() {
        return this.thread;
    }

    public static class RunLegalAdviceConsultationRequestAssistant extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>assitant_abc_123</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("metaData")
        public java.util.Map<String, String> metaData;

        /**
         * <strong>example:</strong>
         * <p>legal_advice_consult</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static RunLegalAdviceConsultationRequestAssistant build(java.util.Map<String, ?> map) throws Exception {
            RunLegalAdviceConsultationRequestAssistant self = new RunLegalAdviceConsultationRequestAssistant();
            return TeaModel.build(map, self);
        }

        public RunLegalAdviceConsultationRequestAssistant setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RunLegalAdviceConsultationRequestAssistant setMetaData(java.util.Map<String, String> metaData) {
            this.metaData = metaData;
            return this;
        }
        public java.util.Map<String, String> getMetaData() {
            return this.metaData;
        }

        public RunLegalAdviceConsultationRequestAssistant setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RunLegalAdviceConsultationRequestAssistant setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class RunLegalAdviceConsultationRequestThreadMessages extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static RunLegalAdviceConsultationRequestThreadMessages build(java.util.Map<String, ?> map) throws Exception {
            RunLegalAdviceConsultationRequestThreadMessages self = new RunLegalAdviceConsultationRequestThreadMessages();
            return TeaModel.build(map, self);
        }

        public RunLegalAdviceConsultationRequestThreadMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunLegalAdviceConsultationRequestThreadMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class RunLegalAdviceConsultationRequestThread extends TeaModel {
        @NameInMap("messages")
        public java.util.List<RunLegalAdviceConsultationRequestThreadMessages> messages;

        public static RunLegalAdviceConsultationRequestThread build(java.util.Map<String, ?> map) throws Exception {
            RunLegalAdviceConsultationRequestThread self = new RunLegalAdviceConsultationRequestThread();
            return TeaModel.build(map, self);
        }

        public RunLegalAdviceConsultationRequestThread setMessages(java.util.List<RunLegalAdviceConsultationRequestThreadMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<RunLegalAdviceConsultationRequestThreadMessages> getMessages() {
            return this.messages;
        }

    }

}
