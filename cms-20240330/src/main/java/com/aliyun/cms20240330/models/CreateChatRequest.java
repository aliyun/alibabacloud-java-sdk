// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateChatRequest extends TeaModel {
    /**
     * <p>Action type: create (default), reconnect, or stop</p>
     * 
     * <strong>example:</strong>
     * <p>create</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>Digital employee name</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("digitalEmployeeName")
    public String digitalEmployeeName;

    /**
     * <p>Messages list</p>
     */
    @NameInMap("messages")
    public java.util.List<CreateChatRequestMessages> messages;

    /**
     * <p>Session thread ID</p>
     * 
     * <strong>example:</strong>
     * <p>thread_id01</p>
     */
    @NameInMap("threadId")
    public String threadId;

    /**
     * <p>Variables list</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;workspace&quot;: &quot;test&quot;,
     *   &quot;region&quot;: &quot;cn-beijing&quot;,
     *   &quot;project&quot;: &quot;test&quot;,
     *   &quot;language&quot;: &quot;zh&quot;,
     *   &quot;timeZone&quot;: &quot;Asia/Shanghai&quot;,
     *   &quot;timeStamp&quot;: &quot;1768893948&quot;,
     *   &quot;startTime&quot;: 1768887171,
     *   &quot;endTime&quot;: 1768890771,
     *   &quot;skill&quot;: &quot;trace&quot;
     * }</p>
     */
    @NameInMap("variables")
    public java.util.Map<String, ?> variables;

    public static CreateChatRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChatRequest self = new CreateChatRequest();
        return TeaModel.build(map, self);
    }

    public CreateChatRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public CreateChatRequest setDigitalEmployeeName(String digitalEmployeeName) {
        this.digitalEmployeeName = digitalEmployeeName;
        return this;
    }
    public String getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    public CreateChatRequest setMessages(java.util.List<CreateChatRequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<CreateChatRequestMessages> getMessages() {
        return this.messages;
    }

    public CreateChatRequest setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public CreateChatRequest setVariables(java.util.Map<String, ?> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.Map<String, ?> getVariables() {
        return this.variables;
    }

    public static class CreateChatRequestMessagesContents extends TeaModel {
        /**
         * <p>Content type</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Value of the content</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateChatRequestMessagesContents build(java.util.Map<String, ?> map) throws Exception {
            CreateChatRequestMessagesContents self = new CreateChatRequestMessagesContents();
            return TeaModel.build(map, self);
        }

        public CreateChatRequestMessagesContents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateChatRequestMessagesContents setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateChatRequestMessages extends TeaModel {
        /**
         * <p>Text or multimodal array</p>
         */
        @NameInMap("contents")
        public java.util.List<CreateChatRequestMessagesContents> contents;

        /**
         * <p>Unique identifier for the message</p>
         * 
         * <strong>example:</strong>
         * <p>message_id02</p>
         */
        @NameInMap("messageId")
        public String messageId;

        /**
         * <p>Role of the message</p>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>Tools calls list</p>
         */
        @NameInMap("tools")
        public java.util.List<java.util.Map<String, ?>> tools;

        public static CreateChatRequestMessages build(java.util.Map<String, ?> map) throws Exception {
            CreateChatRequestMessages self = new CreateChatRequestMessages();
            return TeaModel.build(map, self);
        }

        public CreateChatRequestMessages setContents(java.util.List<CreateChatRequestMessagesContents> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<CreateChatRequestMessagesContents> getContents() {
            return this.contents;
        }

        public CreateChatRequestMessages setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public CreateChatRequestMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CreateChatRequestMessages setTools(java.util.List<java.util.Map<String, ?>> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getTools() {
            return this.tools;
        }

    }

}
