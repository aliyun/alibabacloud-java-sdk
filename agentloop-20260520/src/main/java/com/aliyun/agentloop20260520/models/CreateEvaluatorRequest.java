// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateEvaluatorRequest extends TeaModel {
    /**
     * <p>The list of annotation tags.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;__en&quot;]</p>
     */
    @NameInMap("annotations")
    public java.util.List<String> annotations;

    /**
     * <p>The evaluator configuration. For LLM or AGENT evaluators, the configuration typically includes prompt, variables, and outputSchema. For CODE evaluators, it typically includes codeType, faasConfig, variables, and parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;prompt&quot;:&quot;Please evaluate the task completion&quot;,&quot;variables&quot;:[{&quot;name&quot;:&quot;input&quot;}]}</p>
     */
    @NameInMap("config")
    public java.util.Map<String, ?> config;

    /**
     * <p>The description of the evaluator. The description can be up to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Determines whether the agent completes the user task</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name. The name can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Trace task completion</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The name of the evaluation metric.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_task_completion</p>
     */
    @NameInMap("metricName")
    public String metricName;

    /**
     * <p>The name of the evaluator. The name cannot start with a system-reserved prefix and can be up to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>trace_task_completion</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The evaluator properties.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;agentEvaluatorMode&quot;:&quot;raw_prompt&quot;}</p>
     */
    @NameInMap("properties")
    public java.util.Map<String, ?> properties;

    /**
     * <p>The list of business skills for the initial version of a standard agent evaluator.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;skillName&quot;:&quot;fact-check&quot;,&quot;files&quot;:[{&quot;name&quot;:&quot;SKILL.md&quot;,&quot;content&quot;:&quot;---\nname: fact-check\ndescription: Verify the factual basis in the response\n---\nVerify the facts in the response item by item and list the evidence.&quot;}]}]</p>
     */
    @NameInMap("skills")
    public java.util.List<CreateEvaluatorRequestSkills> skills;

    /**
     * <p>The initial version status. Set this parameter to DRAFT to save the evaluator as a draft. If you omit this parameter, the initial version is directly published.</p>
     * 
     * <strong>example:</strong>
     * <p>DRAFT</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The type of the evaluator. <code>LLM</code> indicates an inner join model evaluation tool for large language models, <code>AGENT</code> indicates a StarOps digital employee evaluator, and <code>CODE</code> indicates a code evaluator.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AGENT</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The initial version number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>The version description.</p>
     * 
     * <strong>example:</strong>
     * <p>Initial version</p>
     */
    @NameInMap("versionDescription")
    public String versionDescription;

    /**
     * <p>The idempotency token. CloudSpec declares this query parameter, but the backend does not currently perform idempotency checks.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateEvaluatorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluatorRequest self = new CreateEvaluatorRequest();
        return TeaModel.build(map, self);
    }

    public CreateEvaluatorRequest setAnnotations(java.util.List<String> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<String> getAnnotations() {
        return this.annotations;
    }

    public CreateEvaluatorRequest setConfig(java.util.Map<String, ?> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    public CreateEvaluatorRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEvaluatorRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateEvaluatorRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public CreateEvaluatorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEvaluatorRequest setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    public CreateEvaluatorRequest setSkills(java.util.List<CreateEvaluatorRequestSkills> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<CreateEvaluatorRequestSkills> getSkills() {
        return this.skills;
    }

    public CreateEvaluatorRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateEvaluatorRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateEvaluatorRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateEvaluatorRequest setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public CreateEvaluatorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateEvaluatorRequestSkillsFiles extends TeaModel {
        /**
         * <p>The text content of the file.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         * <h2>name: fact-check
         * description: Verify the factual basis in the response</h2>
         * <p>Verify the facts in the response item by item and list the evidence</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The path of the file relative to the root directory of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>SKILL.md</p>
         */
        @NameInMap("name")
        public String name;

        public static CreateEvaluatorRequestSkillsFiles build(java.util.Map<String, ?> map) throws Exception {
            CreateEvaluatorRequestSkillsFiles self = new CreateEvaluatorRequestSkillsFiles();
            return TeaModel.build(map, self);
        }

        public CreateEvaluatorRequestSkillsFiles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateEvaluatorRequestSkillsFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateEvaluatorRequestSkills extends TeaModel {
        /**
         * <p>The description of the skill purpose.</p>
         * 
         * <strong>example:</strong>
         * <p>Verify the factual basis in the response</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The display name of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>Fact check</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>Specifies whether to enable the skill. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The complete list of files for the skill. The list must include SKILL.md in the root directory.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;SKILL.md&quot;,&quot;content&quot;:&quot;---\nname: fact-check\ndescription: Verify the factual basis in the response\n---\nVerify the facts in the response item by item and list the evidence.&quot;}]</p>
         */
        @NameInMap("files")
        public java.util.List<CreateEvaluatorRequestSkillsFiles> files;

        /**
         * <p>The name of the skill. The name must be unique in the list of skills submitted in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>fact-check</p>
         */
        @NameInMap("skillName")
        public String skillName;

        public static CreateEvaluatorRequestSkills build(java.util.Map<String, ?> map) throws Exception {
            CreateEvaluatorRequestSkills self = new CreateEvaluatorRequestSkills();
            return TeaModel.build(map, self);
        }

        public CreateEvaluatorRequestSkills setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateEvaluatorRequestSkills setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateEvaluatorRequestSkills setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateEvaluatorRequestSkills setFiles(java.util.List<CreateEvaluatorRequestSkillsFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<CreateEvaluatorRequestSkillsFiles> getFiles() {
            return this.files;
        }

        public CreateEvaluatorRequestSkills setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

    }

}
