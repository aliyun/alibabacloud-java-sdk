// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class RunCompletionMessageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Messages")
    public java.util.List<RunCompletionMessageRequestMessages> messages;

    /**
     * <strong>example:</strong>
     * <p>ccai-14b</p>
     */
    @NameInMap("ModelCode")
    public String modelCode;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Stream")
    public Boolean stream;

    @NameInMap("responseFormatType")
    public String responseFormatType;

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

    public RunCompletionMessageRequest setResponseFormatType(String responseFormatType) {
        this.responseFormatType = responseFormatType;
        return this;
    }
    public String getResponseFormatType() {
        return this.responseFormatType;
    }

    public static class RunCompletionMessageRequestMessages extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
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
