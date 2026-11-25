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
     * <p>The configuration of the new version. This parameter is typically required when <code>version</code> is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;prompt&quot;:&quot;Evaluate task completion more strictly&quot;}</p>
     */
    @NameInMap("config")
    public java.util.Map<String, ?> config;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("createVersion")
    public Boolean createVersion;

    /**
     * <p>The evaluator description.</p>
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
     * <p>Task completion of the chain</p>
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
     * <strong>example:</strong>
     * <p>[{&quot;skillName&quot;:&quot;fact-check&quot;,&quot;files&quot;:[{&quot;name&quot;:&quot;SKILL.md&quot;,&quot;content&quot;:&quot;---\nname: fact-check\ndescription: 核对回答中的事实依据\n---\n逐项核对回答中的事实，并列出依据。&quot;}]}]</p>
     */
    @NameInMap("skills")
    public java.util.List<UpdateEvaluatorRequestSkills> skills;

    /**
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
     * <p>The idempotency token. CloudSpec declares this query parameter, but the backend does not currently perform idempotency comparison.</p>
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
         * <strong>example:</strong>
         * <hr>
         * <h2>name: fact-check
         * description: 核对回答中的事实依据</h2>
         * <p>逐项核对回答中的事实，并列出依据。</p>
         */
        @NameInMap("content")
        public String content;

        /**
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
         * <strong>example:</strong>
         * <p>核对回答中的事实依据</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>事实核查</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;SKILL.md&quot;,&quot;content&quot;:&quot;---\nname: fact-check\ndescription: 核对回答中的事实依据\n---\n逐项核对回答中的事实，并列出依据。&quot;}]</p>
         */
        @NameInMap("files")
        public java.util.List<UpdateEvaluatorRequestSkillsFiles> files;

        /**
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
