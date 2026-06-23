// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class RunChatResultGenerationRequest extends TeaModel {
    /**
     * <p>Hyperparameters used for inference.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;topP&quot;: 0.8}</p>
     */
    @NameInMap("inferenceParameters")
    public java.util.Map<String, ?> inferenceParameters;

    /**
     * <p>Messages to input into the model.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("messages")
    public java.util.List<RunChatResultGenerationRequestMessages> messages;

    /**
     * <p>The model service type. Get this value from the /api/app/config API endpoint in the llmHelperTypeList field.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <p>Session ID. Use this to mark a conversation.</p>
     * 
     * <strong>example:</strong>
     * <p>237645726354</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>Streaming mode. Set to true for streaming responses. Set to false for full responses. Default is false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    /**
     * <p>Tool information. Specify a list of tools the model can call. When multiple tools are provided, the model selects one to generate a response.</p>
     */
    @NameInMap("tools")
    public java.util.List<RunChatResultGenerationRequestTools> tools;

    public static RunChatResultGenerationRequest build(java.util.Map<String, ?> map) throws Exception {
        RunChatResultGenerationRequest self = new RunChatResultGenerationRequest();
        return TeaModel.build(map, self);
    }

    public RunChatResultGenerationRequest setInferenceParameters(java.util.Map<String, ?> inferenceParameters) {
        this.inferenceParameters = inferenceParameters;
        return this;
    }
    public java.util.Map<String, ?> getInferenceParameters() {
        return this.inferenceParameters;
    }

    public RunChatResultGenerationRequest setMessages(java.util.List<RunChatResultGenerationRequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<RunChatResultGenerationRequestMessages> getMessages() {
        return this.messages;
    }

    public RunChatResultGenerationRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunChatResultGenerationRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunChatResultGenerationRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public RunChatResultGenerationRequest setTools(java.util.List<RunChatResultGenerationRequestTools> tools) {
        this.tools = tools;
        return this;
    }
    public java.util.List<RunChatResultGenerationRequestTools> getTools() {
        return this.tools;
    }

    public static class RunChatResultGenerationRequestMessages extends TeaModel {
        /**
         * <p>Message content.</p>
         * 
         * <strong>example:</strong>
         * <p>你是一个信息处理专家</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>Message role.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static RunChatResultGenerationRequestMessages build(java.util.Map<String, ?> map) throws Exception {
            RunChatResultGenerationRequestMessages self = new RunChatResultGenerationRequestMessages();
            return TeaModel.build(map, self);
        }

        public RunChatResultGenerationRequestMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunChatResultGenerationRequestMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class RunChatResultGenerationRequestToolsFunctionParameters extends TeaModel {
        /**
         * <p>Properties.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *                             &quot;location&quot;: {
         *                                 &quot;type&quot;: &quot;string&quot;,
         *                                 &quot;description&quot;: &quot;The city and state, e.g. San Francisco, CA&quot;
         *                             },
         *                             &quot;unit&quot;: {
         *                                 &quot;type&quot;: &quot;string&quot;,
         *                                 &quot;enum&quot;: [
         *                                     &quot;celsius&quot;,
         *                                     &quot;fahrenheit&quot;
         *                                 ]
         *                             }
         *                         }</p>
         */
        @NameInMap("properties")
        public java.util.Map<String, ?> properties;

        /**
         * <p>Type.</p>
         * 
         * <strong>example:</strong>
         * <p>object</p>
         */
        @NameInMap("type")
        public String type;

        public static RunChatResultGenerationRequestToolsFunctionParameters build(java.util.Map<String, ?> map) throws Exception {
            RunChatResultGenerationRequestToolsFunctionParameters self = new RunChatResultGenerationRequestToolsFunctionParameters();
            return TeaModel.build(map, self);
        }

        public RunChatResultGenerationRequestToolsFunctionParameters setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public RunChatResultGenerationRequestToolsFunctionParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RunChatResultGenerationRequestToolsFunction extends TeaModel {
        /**
         * <p>A string describing the tool function. This helps the model decide when and how to call it.</p>
         * 
         * <strong>example:</strong>
         * <p>工具函数的描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>A string representing the tool function name. It must contain only letters, digits, underscores, and hyphens. Maximum length is 64 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>get_time</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>An object describing the tool parameters. It must be a valid JSON Schema.</p>
         */
        @NameInMap("parameters")
        public RunChatResultGenerationRequestToolsFunctionParameters parameters;

        /**
         * <p>List of required parameters.</p>
         */
        @NameInMap("required")
        public java.util.List<String> required;

        public static RunChatResultGenerationRequestToolsFunction build(java.util.Map<String, ?> map) throws Exception {
            RunChatResultGenerationRequestToolsFunction self = new RunChatResultGenerationRequestToolsFunction();
            return TeaModel.build(map, self);
        }

        public RunChatResultGenerationRequestToolsFunction setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RunChatResultGenerationRequestToolsFunction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RunChatResultGenerationRequestToolsFunction setParameters(RunChatResultGenerationRequestToolsFunctionParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public RunChatResultGenerationRequestToolsFunctionParameters getParameters() {
            return this.parameters;
        }

        public RunChatResultGenerationRequestToolsFunction setRequired(java.util.List<String> required) {
            this.required = required;
            return this;
        }
        public java.util.List<String> getRequired() {
            return this.required;
        }

    }

    public static class RunChatResultGenerationRequestTools extends TeaModel {
        /**
         * <p>An object containing name, description, and parameters.</p>
         */
        @NameInMap("function")
        public RunChatResultGenerationRequestToolsFunction function;

        /**
         * <p>A string indicating the tool type. Currently, only &quot;function&quot; is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>function</p>
         */
        @NameInMap("type")
        public String type;

        public static RunChatResultGenerationRequestTools build(java.util.Map<String, ?> map) throws Exception {
            RunChatResultGenerationRequestTools self = new RunChatResultGenerationRequestTools();
            return TeaModel.build(map, self);
        }

        public RunChatResultGenerationRequestTools setFunction(RunChatResultGenerationRequestToolsFunction function) {
            this.function = function;
            return this;
        }
        public RunChatResultGenerationRequestToolsFunction getFunction() {
            return this.function;
        }

        public RunChatResultGenerationRequestTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
