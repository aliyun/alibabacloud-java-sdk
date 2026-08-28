// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateExternalAgentRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public UpdateExternalAgentRequestBody body;

    /**
     * <p>A reserved idempotency token. The backend does not guarantee idempotency in the current version.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateExternalAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExternalAgentRequest self = new UpdateExternalAgentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExternalAgentRequest setBody(UpdateExternalAgentRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateExternalAgentRequestBody getBody() {
        return this.body;
    }

    public UpdateExternalAgentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateExternalAgentRequestBodyModel extends TeaModel {
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

        public static UpdateExternalAgentRequestBodyModel build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentRequestBodyModel self = new UpdateExternalAgentRequestBodyModel();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentRequestBodyModel setModelConnectionId(String modelConnectionId) {
            this.modelConnectionId = modelConnectionId;
            return this;
        }
        public String getModelConnectionId() {
            return this.modelConnectionId;
        }

        public UpdateExternalAgentRequestBodyModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

    }

    public static class UpdateExternalAgentRequestBodySkills extends TeaModel {
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

        public static UpdateExternalAgentRequestBodySkills build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentRequestBodySkills self = new UpdateExternalAgentRequestBodySkills();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentRequestBodySkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateExternalAgentRequestBodySkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateExternalAgentRequestBodyTemplateAiRegistry extends TeaModel {
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

        public static UpdateExternalAgentRequestBodyTemplateAiRegistry build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentRequestBodyTemplateAiRegistry self = new UpdateExternalAgentRequestBodyTemplateAiRegistry();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentRequestBodyTemplateAiRegistry setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateExternalAgentRequestBodyTemplateAiRegistry setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateExternalAgentRequestBodyTemplate extends TeaModel {
        /**
         * <p>The AI Registry template configuration.</p>
         */
        @NameInMap("aiRegistry")
        public UpdateExternalAgentRequestBodyTemplateAiRegistry aiRegistry;

        public static UpdateExternalAgentRequestBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentRequestBodyTemplate self = new UpdateExternalAgentRequestBodyTemplate();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentRequestBodyTemplate setAiRegistry(UpdateExternalAgentRequestBodyTemplateAiRegistry aiRegistry) {
            this.aiRegistry = aiRegistry;
            return this;
        }
        public UpdateExternalAgentRequestBodyTemplateAiRegistry getAiRegistry() {
            return this.aiRegistry;
        }

    }

    public static class UpdateExternalAgentRequestBodyTools extends TeaModel {
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

        public static UpdateExternalAgentRequestBodyTools build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentRequestBodyTools self = new UpdateExternalAgentRequestBodyTools();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentRequestBodyTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateExternalAgentRequestBodyTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateExternalAgentRequestBody extends TeaModel {
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
        public UpdateExternalAgentRequestBodyModel model;

        /**
         * <p>The source of the model configuration. Valid values:</p>
         * <ul>
         * <li>PLATFORM: The model configuration is parsed and distributed by the platform. You can specify the model parameter.</li>
         * <li>RUNTIME: The model is managed by the external runtime. You cannot specify the model parameter at the same time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PLATFORM</p>
         */
        @NameInMap("modelSource")
        public String modelSource;

        /**
         * <p>The name of the external agent.</p>
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
        public java.util.List<UpdateExternalAgentRequestBodySkills> skills;

        /**
         * <p>The agent template configuration.</p>
         */
        @NameInMap("template")
        public UpdateExternalAgentRequestBodyTemplate template;

        /**
         * <p>The list of tool configurations.</p>
         */
        @NameInMap("tools")
        public java.util.List<UpdateExternalAgentRequestBodyTools> tools;

        public static UpdateExternalAgentRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateExternalAgentRequestBody self = new UpdateExternalAgentRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateExternalAgentRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateExternalAgentRequestBody setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public UpdateExternalAgentRequestBody setModel(UpdateExternalAgentRequestBodyModel model) {
            this.model = model;
            return this;
        }
        public UpdateExternalAgentRequestBodyModel getModel() {
            return this.model;
        }

        public UpdateExternalAgentRequestBody setModelSource(String modelSource) {
            this.modelSource = modelSource;
            return this;
        }
        public String getModelSource() {
            return this.modelSource;
        }

        public UpdateExternalAgentRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateExternalAgentRequestBody setSkills(java.util.List<UpdateExternalAgentRequestBodySkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<UpdateExternalAgentRequestBodySkills> getSkills() {
            return this.skills;
        }

        public UpdateExternalAgentRequestBody setTemplate(UpdateExternalAgentRequestBodyTemplate template) {
            this.template = template;
            return this;
        }
        public UpdateExternalAgentRequestBodyTemplate getTemplate() {
            return this.template;
        }

        public UpdateExternalAgentRequestBody setTools(java.util.List<UpdateExternalAgentRequestBodyTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<UpdateExternalAgentRequestBodyTools> getTools() {
            return this.tools;
        }

    }

}
