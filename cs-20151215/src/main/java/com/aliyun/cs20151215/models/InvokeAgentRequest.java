// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class InvokeAgentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{&quot;description&quot;:&quot;cluster&quot;,&quot;value&quot;:&quot;c-1&quot;}]</p>
     */
    @NameInMap("context")
    public java.util.List<InvokeAgentRequestContext> context;

    /**
     * <strong>example:</strong>
     * <p>{&quot;enableThinking&quot;:true}</p>
     */
    @NameInMap("forwardedProps")
    public InvokeAgentRequestForwardedProps forwardedProps;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;id&quot;:&quot;m-1&quot;,&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:&quot;你好&quot;}]</p>
     */
    @NameInMap("messages")
    public java.util.List<InvokeAgentRequestMessages> messages;

    /**
     * <strong>example:</strong>
     * <p>r-0</p>
     */
    @NameInMap("parentRunId")
    public String parentRunId;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;interruptId&quot;:&quot;i-1&quot;,&quot;status&quot;:&quot;resolved&quot;,&quot;payload&quot;:{&quot;decision&quot;:&quot;yes&quot;}}]</p>
     */
    @NameInMap("resume")
    public java.util.List<InvokeAgentRequestResume> resume;

    /**
     * <strong>example:</strong>
     * <p>run-1</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("state")
    public Object state;

    /**
     * <strong>example:</strong>
     * <p>abcdef0123456789abcdef0123456789</p>
     */
    @NameInMap("threadId")
    public String threadId;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("tools")
    public java.util.List<InvokeAgentRequestTools> tools;

    public static InvokeAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeAgentRequest self = new InvokeAgentRequest();
        return TeaModel.build(map, self);
    }

    public InvokeAgentRequest setContext(java.util.List<InvokeAgentRequestContext> context) {
        this.context = context;
        return this;
    }
    public java.util.List<InvokeAgentRequestContext> getContext() {
        return this.context;
    }

    public InvokeAgentRequest setForwardedProps(InvokeAgentRequestForwardedProps forwardedProps) {
        this.forwardedProps = forwardedProps;
        return this;
    }
    public InvokeAgentRequestForwardedProps getForwardedProps() {
        return this.forwardedProps;
    }

    public InvokeAgentRequest setMessages(java.util.List<InvokeAgentRequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<InvokeAgentRequestMessages> getMessages() {
        return this.messages;
    }

    public InvokeAgentRequest setParentRunId(String parentRunId) {
        this.parentRunId = parentRunId;
        return this;
    }
    public String getParentRunId() {
        return this.parentRunId;
    }

    public InvokeAgentRequest setResume(java.util.List<InvokeAgentRequestResume> resume) {
        this.resume = resume;
        return this;
    }
    public java.util.List<InvokeAgentRequestResume> getResume() {
        return this.resume;
    }

    public InvokeAgentRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public InvokeAgentRequest setState(Object state) {
        this.state = state;
        return this;
    }
    public Object getState() {
        return this.state;
    }

    public InvokeAgentRequest setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public InvokeAgentRequest setTools(java.util.List<InvokeAgentRequestTools> tools) {
        this.tools = tools;
        return this;
    }
    public java.util.List<InvokeAgentRequestTools> getTools() {
        return this.tools;
    }

    public static class InvokeAgentRequestContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("value")
        public String value;

        public static InvokeAgentRequestContext build(java.util.Map<String, ?> map) throws Exception {
            InvokeAgentRequestContext self = new InvokeAgentRequestContext();
            return TeaModel.build(map, self);
        }

        public InvokeAgentRequestContext setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public InvokeAgentRequestContext setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class InvokeAgentRequestForwardedProps extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableThinking")
        public Boolean enableThinking;

        /**
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("language")
        public String language;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("source")
        public String source;

        public static InvokeAgentRequestForwardedProps build(java.util.Map<String, ?> map) throws Exception {
            InvokeAgentRequestForwardedProps self = new InvokeAgentRequestForwardedProps();
            return TeaModel.build(map, self);
        }

        public InvokeAgentRequestForwardedProps setEnableThinking(Boolean enableThinking) {
            this.enableThinking = enableThinking;
            return this;
        }
        public Boolean getEnableThinking() {
            return this.enableThinking;
        }

        public InvokeAgentRequestForwardedProps setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public InvokeAgentRequestForwardedProps setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class InvokeAgentRequestMessagesToolCallsFunction extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("arguments")
        public String arguments;

        /**
         * <strong>example:</strong>
         * <p>navy</p>
         */
        @NameInMap("name")
        public String name;

        public static InvokeAgentRequestMessagesToolCallsFunction build(java.util.Map<String, ?> map) throws Exception {
            InvokeAgentRequestMessagesToolCallsFunction self = new InvokeAgentRequestMessagesToolCallsFunction();
            return TeaModel.build(map, self);
        }

        public InvokeAgentRequestMessagesToolCallsFunction setArguments(String arguments) {
            this.arguments = arguments;
            return this;
        }
        public String getArguments() {
            return this.arguments;
        }

        public InvokeAgentRequestMessagesToolCallsFunction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class InvokeAgentRequestMessagesToolCalls extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("encryptedValue")
        public String encryptedValue;

        /**
         * <strong>example:</strong>
         * <p>{&quot;name&quot;: &quot;xxx&quot;, &quot;arguments&quot;: &quot;xxx&quot;}</p>
         */
        @NameInMap("function")
        public InvokeAgentRequestMessagesToolCallsFunction function;

        /**
         * <strong>example:</strong>
         * <p>64ea4d94937a4c5c84e2b3b814d14696</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <strong>example:</strong>
         * <p>function</p>
         */
        @NameInMap("type")
        public String type;

        public static InvokeAgentRequestMessagesToolCalls build(java.util.Map<String, ?> map) throws Exception {
            InvokeAgentRequestMessagesToolCalls self = new InvokeAgentRequestMessagesToolCalls();
            return TeaModel.build(map, self);
        }

        public InvokeAgentRequestMessagesToolCalls setEncryptedValue(String encryptedValue) {
            this.encryptedValue = encryptedValue;
            return this;
        }
        public String getEncryptedValue() {
            return this.encryptedValue;
        }

        public InvokeAgentRequestMessagesToolCalls setFunction(InvokeAgentRequestMessagesToolCallsFunction function) {
            this.function = function;
            return this;
        }
        public InvokeAgentRequestMessagesToolCallsFunction getFunction() {
            return this.function;
        }

        public InvokeAgentRequestMessagesToolCalls setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public InvokeAgentRequestMessagesToolCalls setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public InvokeAgentRequestMessagesToolCalls setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class InvokeAgentRequestMessages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("encryptedValue")
        public String encryptedValue;

        /**
         * <strong>example:</strong>
         * <p>64ea4d94937a4c5c84e2b3b814d14696</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <strong>example:</strong>
         * <p>n-1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>64ea4d94937a4c5c84e2b3b814d14696</p>
         */
        @NameInMap("subagentRunId")
        public String subagentRunId;

        /**
         * <strong>example:</strong>
         * <p>64ea4d94937a4c5c84e2b3b814d14696</p>
         */
        @NameInMap("toolCallId")
        public String toolCallId;

        @NameInMap("toolCalls")
        public java.util.List<InvokeAgentRequestMessagesToolCalls> toolCalls;

        public static InvokeAgentRequestMessages build(java.util.Map<String, ?> map) throws Exception {
            InvokeAgentRequestMessages self = new InvokeAgentRequestMessages();
            return TeaModel.build(map, self);
        }

        public InvokeAgentRequestMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public InvokeAgentRequestMessages setEncryptedValue(String encryptedValue) {
            this.encryptedValue = encryptedValue;
            return this;
        }
        public String getEncryptedValue() {
            return this.encryptedValue;
        }

        public InvokeAgentRequestMessages setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public InvokeAgentRequestMessages setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public InvokeAgentRequestMessages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InvokeAgentRequestMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public InvokeAgentRequestMessages setSubagentRunId(String subagentRunId) {
            this.subagentRunId = subagentRunId;
            return this;
        }
        public String getSubagentRunId() {
            return this.subagentRunId;
        }

        public InvokeAgentRequestMessages setToolCallId(String toolCallId) {
            this.toolCallId = toolCallId;
            return this;
        }
        public String getToolCallId() {
            return this.toolCallId;
        }

        public InvokeAgentRequestMessages setToolCalls(java.util.List<InvokeAgentRequestMessagesToolCalls> toolCalls) {
            this.toolCalls = toolCalls;
            return this;
        }
        public java.util.List<InvokeAgentRequestMessagesToolCalls> getToolCalls() {
            return this.toolCalls;
        }

    }

    public static class InvokeAgentRequestResume extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i-1</p>
         */
        @NameInMap("interruptId")
        public String interruptId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;decision&quot;:&quot;yes&quot;}</p>
         */
        @NameInMap("payload")
        public Object payload;

        /**
         * <strong>example:</strong>
         * <p>resolved</p>
         */
        @NameInMap("status")
        public String status;

        public static InvokeAgentRequestResume build(java.util.Map<String, ?> map) throws Exception {
            InvokeAgentRequestResume self = new InvokeAgentRequestResume();
            return TeaModel.build(map, self);
        }

        public InvokeAgentRequestResume setInterruptId(String interruptId) {
            this.interruptId = interruptId;
            return this;
        }
        public String getInterruptId() {
            return this.interruptId;
        }

        public InvokeAgentRequestResume setPayload(Object payload) {
            this.payload = payload;
            return this;
        }
        public Object getPayload() {
            return this.payload;
        }

        public InvokeAgentRequestResume setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class InvokeAgentRequestTools extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster-qa-icloud-edge-ohttp</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;region\&quot;: \&quot;cn-shanghai\&quot;, \&quot;vpcId\&quot;: \&quot;vpc-uf6bnhlxne8enjurxxjv4\&quot;, \&quot;functionName\&quot;: \&quot;filemgr-cn-shanghai-334a349cd2\&quot;, \&quot;mountPointsServerAddr\&quot;: \&quot;334a349cd2-umc45.cn-shanghai.nas.aliyuncs.com\&quot;}</p>
         */
        @NameInMap("parameters")
        public Object parameters;

        public static InvokeAgentRequestTools build(java.util.Map<String, ?> map) throws Exception {
            InvokeAgentRequestTools self = new InvokeAgentRequestTools();
            return TeaModel.build(map, self);
        }

        public InvokeAgentRequestTools setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public InvokeAgentRequestTools setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public InvokeAgentRequestTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InvokeAgentRequestTools setParameters(Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Object getParameters() {
            return this.parameters;
        }

    }

}
