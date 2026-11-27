// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateEvaluatorRequest extends TeaModel {
    /**
     * <p>The list of annotation tags.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;__en&quot;]</p>
     */
    @NameInMap("annotations")
    public java.util.List<String> annotations;

    /**
     * <p>The configuration for the new version. This parameter is typically required when version is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;prompt&quot;:&quot;Evaluate task completion more strictly&quot;}</p>
     */
    @NameInMap("config")
    public java.util.Map<String, ?> config;

    /**
     * <p>Specifies whether to create a new draft. Set to true to create a new draft, or false to update a specified existing draft. When this parameter is specified, the version status defaults to DRAFT.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("createVersion")
    public Boolean createVersion;

    /**
     * <p>The description of the evaluator.</p>
     * 
     * <strong>example:</strong>
     * <p>Determines whether the agent completes the user task</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name.</p>
     * 
     * <strong>example:</strong>
     * <p>Pipeline task completion</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The evaluator properties.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;agentEvaluatorMode&quot;:&quot;raw_prompt&quot;}</p>
     */
    @NameInMap("properties")
    public java.util.Map<String, ?> properties;

    /**
     * <p>The complete list of business skills saved for the standard agent evaluator in this request. Pass an empty array to clear the business skills for this version.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;skillName&quot;:&quot;fact-check&quot;,&quot;files&quot;:[{&quot;name&quot;:&quot;SKILL.md&quot;,&quot;content&quot;:&quot;---\nname: fact-check\ndescription: Verify factual basis in responses\n---\nVerify the facts in the response item by item and list the basis.&quot;}]}]</p>
     */
    @NameInMap("skills")
    public java.util.List<UpdateEvaluatorRequestSkills> skills;

    /**
     * <p>The status of the evaluator version to be written. Only DRAFT is supported when explicitly specified. To publish a draft, call UpdateEvaluatorVersionStatus.</p>
     * 
     * <strong>example:</strong>
     * <p>DRAFT</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The new version number. A new version is created when this parameter is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.0</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>The version description.</p>
     * 
     * <strong>example:</strong>
     * <p>Optimized scoring instructions</p>
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

    public static UpdateEvaluatorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEvaluatorRequest self = new UpdateEvaluatorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEvaluatorRequest setAnnotations(java.util.List<String> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<String> getAnnotations() {
        return this.annotations;
    }

    public UpdateEvaluatorRequest setConfig(java.util.Map<String, ?> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    public UpdateEvaluatorRequest setCreateVersion(Boolean createVersion) {
        this.createVersion = createVersion;
        return this;
    }
    public Boolean getCreateVersion() {
        return this.createVersion;
    }

    public UpdateEvaluatorRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEvaluatorRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateEvaluatorRequest setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    public UpdateEvaluatorRequest setSkills(java.util.List<UpdateEvaluatorRequestSkills> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<UpdateEvaluatorRequestSkills> getSkills() {
        return this.skills;
    }

    public UpdateEvaluatorRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateEvaluatorRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public UpdateEvaluatorRequest setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public UpdateEvaluatorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateEvaluatorRequestSkillsFiles extends TeaModel {
        /**
         * <p>The text content of the file.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         * <h2>name: fact-check
         * description: Verify factual basis in responses</h2>
         * <p>Verify the facts in the response item by item and list the basis</p>
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

        public static UpdateEvaluatorRequestSkillsFiles build(java.util.Map<String, ?> map) throws Exception {
            UpdateEvaluatorRequestSkillsFiles self = new UpdateEvaluatorRequestSkillsFiles();
            return TeaModel.build(map, self);
        }

        public UpdateEvaluatorRequestSkillsFiles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateEvaluatorRequestSkillsFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateEvaluatorRequestSkills extends TeaModel {
        /**
         * <p>The description of the skill purpose.</p>
         * 
         * <strong>example:</strong>
         * <p>Verify factual basis in responses</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The display name of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>Fact-checking</p>
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
         * <p>The complete list of files for the skill, which must include SKILL.md in the root directory.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;SKILL.md&quot;,&quot;content&quot;:&quot;---\nname: fact-check\ndescription: Verify factual basis in responses\n---\nVerify the facts in the response item by item and list the basis.&quot;}]</p>
         */
        @NameInMap("files")
        public java.util.List<UpdateEvaluatorRequestSkillsFiles> files;

        /**
         * <p>The name of the skill, which must be unique in the list of skills submitted in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>fact-check</p>
         */
        @NameInMap("skillName")
        public String skillName;

        public static UpdateEvaluatorRequestSkills build(java.util.Map<String, ?> map) throws Exception {
            UpdateEvaluatorRequestSkills self = new UpdateEvaluatorRequestSkills();
            return TeaModel.build(map, self);
        }

        public UpdateEvaluatorRequestSkills setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateEvaluatorRequestSkills setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateEvaluatorRequestSkills setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateEvaluatorRequestSkills setFiles(java.util.List<UpdateEvaluatorRequestSkillsFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<UpdateEvaluatorRequestSkillsFiles> getFiles() {
            return this.files;
        }

        public UpdateEvaluatorRequestSkills setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

    }

}
