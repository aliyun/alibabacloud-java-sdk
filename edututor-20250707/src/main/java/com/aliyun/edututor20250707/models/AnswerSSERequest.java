// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edututor20250707.models;

import com.aliyun.tea.*;

public class AnswerSSERequest extends TeaModel {
    @NameInMap("messages")
    public java.util.List<AnswerSSERequestMessages> messages;

    @NameInMap("parameters")
    public AnswerSSERequestParameters parameters;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-1ijrzuv3v0ivvls7</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static AnswerSSERequest build(java.util.Map<String, ?> map) throws Exception {
        AnswerSSERequest self = new AnswerSSERequest();
        return TeaModel.build(map, self);
    }

    public AnswerSSERequest setMessages(java.util.List<AnswerSSERequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<AnswerSSERequestMessages> getMessages() {
        return this.messages;
    }

    public AnswerSSERequest setParameters(AnswerSSERequestParameters parameters) {
        this.parameters = parameters;
        return this;
    }
    public AnswerSSERequestParameters getParameters() {
        return this.parameters;
    }

    public AnswerSSERequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class AnswerSSERequestMessages extends TeaModel {
        @NameInMap("content")
        public java.util.List<java.util.Map<String, String>> content;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static AnswerSSERequestMessages build(java.util.Map<String, ?> map) throws Exception {
            AnswerSSERequestMessages self = new AnswerSSERequestMessages();
            return TeaModel.build(map, self);
        }

        public AnswerSSERequestMessages setContent(java.util.List<java.util.Map<String, String>> content) {
            this.content = content;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getContent() {
            return this.content;
        }

        public AnswerSSERequestMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class AnswerSSERequestParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("grade")
        public Integer grade;

        /**
         * <strong>example:</strong>
         * <p>other</p>
         */
        @NameInMap("stage")
        public String stage;

        /**
         * <strong>example:</strong>
         * <p>other</p>
         */
        @NameInMap("subject")
        public String subject;

        public static AnswerSSERequestParameters build(java.util.Map<String, ?> map) throws Exception {
            AnswerSSERequestParameters self = new AnswerSSERequestParameters();
            return TeaModel.build(map, self);
        }

        public AnswerSSERequestParameters setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public AnswerSSERequestParameters setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public AnswerSSERequestParameters setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

}
