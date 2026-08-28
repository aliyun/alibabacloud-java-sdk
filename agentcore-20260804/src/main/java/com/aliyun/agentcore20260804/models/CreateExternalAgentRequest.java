// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateExternalAgentRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public CreateExternalAgentRequestBody body;

    /**
     * <p>The reserved idempotency token. The backend does not guarantee idempotence in the current version.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateExternalAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExternalAgentRequest self = new CreateExternalAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateExternalAgentRequest setBody(CreateExternalAgentRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateExternalAgentRequestBody getBody() {
        return this.body;
    }

    public CreateExternalAgentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateExternalAgentRequestBodyModel extends TeaModel {
        /**
         * <p>The model connection ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-1</p>
         */
        @NameInMap("modelConnectionId")
        public String modelConnectionId;

        /**
         * <p>The upstream model name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        public static CreateExternalAgentRequestBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentRequestBodyModel self = new CreateExternalAgentRequestBodyModel();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentRequestBodyModel setModelConnectionId(String modelConnectionId) {
            this.modelConnectionId = modelConnectionId;
            return this;
        }
        public String getModelConnectionId() {
            return this.modelConnectionId;
        }

        public CreateExternalAgentRequestBodyModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

    }

    public static class CreateExternalAgentRequestBodySkills extends TeaModel {
        /**
         * <p>The skill name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>code-analysis</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The skill version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static CreateExternalAgentRequestBodySkills build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentRequestBodySkills self = new CreateExternalAgentRequestBodySkills();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentRequestBodySkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateExternalAgentRequestBodySkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateExternalAgentRequestBodyTemplateAiRegistry extends TeaModel {
        /**
         * <p>The name of the template in AI Registry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>code-review-template</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The version of the template in AI Registry.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static CreateExternalAgentRequestBodyTemplateAiRegistry build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentRequestBodyTemplateAiRegistry self = new CreateExternalAgentRequestBodyTemplateAiRegistry();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentRequestBodyTemplateAiRegistry setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateExternalAgentRequestBodyTemplateAiRegistry setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateExternalAgentRequestBodyTemplate extends TeaModel {
        /**
         * <p>The AI Registry template configuration.</p>
         */
        @NameInMap("aiRegistry")
        public CreateExternalAgentRequestBodyTemplateAiRegistry aiRegistry;

        public static CreateExternalAgentRequestBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentRequestBodyTemplate self = new CreateExternalAgentRequestBodyTemplate();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentRequestBodyTemplate setAiRegistry(CreateExternalAgentRequestBodyTemplateAiRegistry aiRegistry) {
            this.aiRegistry = aiRegistry;
            return this;
        }
        public CreateExternalAgentRequestBodyTemplateAiRegistry getAiRegistry() {
            return this.aiRegistry;
        }

    }

    public static class CreateExternalAgentRequestBodyTools extends TeaModel {
        /**
         * <p>The tool name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>code-reviewer</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The tool type. Valid values:</p>
         * <ul>
         * <li>MCP: MCP tool.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MCP</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateExternalAgentRequestBodyTools build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentRequestBodyTools self = new CreateExternalAgentRequestBodyTools();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentRequestBodyTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateExternalAgentRequestBodyTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateExternalAgentRequestBody extends TeaModel {
        /**
         * <p>The description of the external agent.</p>
         * 
         * <strong>example:</strong>
         * <p>A code review agent running in the user environment</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The agent instruction that guides the behavior of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>You are a code review assistant</p>
         */
        @NameInMap("instruction")
        public String instruction;

        /**
         * <p>The model configuration. This parameter is available only when modelSource is set to PLATFORM.</p>
         */
        @NameInMap("model")
        public CreateExternalAgentRequestBodyModel model;

        /**
         * <p>The source of the model configuration. Valid values:</p>
         * <ul>
         * <li>PLATFORM: The platform parses and delivers the model configuration. You can specify the model parameter.</li>
         * <li>RUNTIME: The external runtime manages the model on its own. You cannot specify the model parameter at the same time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PLATFORM</p>
         */
        @NameInMap("modelSource")
        public String modelSource;

        /**
         * <p>The name of the external agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-external-agent</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The list of skill configurations.</p>
         */
        @NameInMap("skills")
        public java.util.List<CreateExternalAgentRequestBodySkills> skills;

        /**
         * <p>The agent template configuration.</p>
         */
        @NameInMap("template")
        public CreateExternalAgentRequestBodyTemplate template;

        /**
         * <p>The list of tool configurations.</p>
         */
        @NameInMap("tools")
        public java.util.List<CreateExternalAgentRequestBodyTools> tools;

        public static CreateExternalAgentRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalAgentRequestBody self = new CreateExternalAgentRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateExternalAgentRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateExternalAgentRequestBody setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public CreateExternalAgentRequestBody setModel(CreateExternalAgentRequestBodyModel model) {
            this.model = model;
            return this;
        }
        public CreateExternalAgentRequestBodyModel getModel() {
            return this.model;
        }

        public CreateExternalAgentRequestBody setModelSource(String modelSource) {
            this.modelSource = modelSource;
            return this;
        }
        public String getModelSource() {
            return this.modelSource;
        }

        public CreateExternalAgentRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateExternalAgentRequestBody setSkills(java.util.List<CreateExternalAgentRequestBodySkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<CreateExternalAgentRequestBodySkills> getSkills() {
            return this.skills;
        }

        public CreateExternalAgentRequestBody setTemplate(CreateExternalAgentRequestBodyTemplate template) {
            this.template = template;
            return this;
        }
        public CreateExternalAgentRequestBodyTemplate getTemplate() {
            return this.template;
        }

        public CreateExternalAgentRequestBody setTools(java.util.List<CreateExternalAgentRequestBodyTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<CreateExternalAgentRequestBodyTools> getTools() {
            return this.tools;
        }

    }

}
