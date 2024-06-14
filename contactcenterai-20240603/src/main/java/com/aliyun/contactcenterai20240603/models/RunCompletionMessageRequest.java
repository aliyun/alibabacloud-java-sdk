// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class RunCompletionMessageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Messages")
    public java.util.List<RunCompletionMessageRequestMessages> messages;

    @NameInMap("ModelCode")
    public String modelCode;

    @NameInMap("Stream")
    public Boolean stream;

    public static RunCompletionMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCompletionMessageRequest self = new RunCompletionMessageRequest();
        return TeaModel.build(map, self);
    }

    public RunCompletionMessageRequest setMessages(java.util.List<RunCompletionMessageRequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<RunCompletionMessageRequestMessages> getMessages() {
        return this.messages;
    }

    public RunCompletionMessageRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public RunCompletionMessageRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public static class RunCompletionMessageRequestMessages extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Role")
        public String role;

        public static RunCompletionMessageRequestMessages build(java.util.Map<String, ?> map) throws Exception {
            RunCompletionMessageRequestMessages self = new RunCompletionMessageRequestMessages();
            return TeaModel.build(map, self);
        }

        public RunCompletionMessageRequestMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunCompletionMessageRequestMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
