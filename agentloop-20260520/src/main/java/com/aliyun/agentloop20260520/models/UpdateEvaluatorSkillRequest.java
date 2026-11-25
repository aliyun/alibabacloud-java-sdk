// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateEvaluatorSkillRequest extends TeaModel {
    /**
     * <p>The name of the AgentSpace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-agentspace</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <p>The description of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>Read trace context to assist evaluation</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>Read Trace Context</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>Specifies whether the skill is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("evaluatorVersion")
    public String evaluatorVersion;

    /**
     * <p>The list of skill files. If specified, the content of the skill files is updated.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;SKILL.md&quot;,&quot;content&quot;:&quot;# Trace Context Loader&quot;,&quot;remark&quot;:&quot;Primary skill description&quot;}]</p>
     */
    @NameInMap("files")
    public java.util.List<UpdateEvaluatorSkillRequestFiles> files;

    /**
     * <p>The idempotency token. CloudSpec declares this query parameter, but the backend does not currently perform idempotency checks.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateEvaluatorSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEvaluatorSkillRequest self = new UpdateEvaluatorSkillRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEvaluatorSkillRequest setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public UpdateEvaluatorSkillRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateEvaluatorSkillRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateEvaluatorSkillRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateEvaluatorSkillRequest setEvaluatorVersion(String evaluatorVersion) {
        this.evaluatorVersion = evaluatorVersion;
        return this;
    }
    public String getEvaluatorVersion() {
        return this.evaluatorVersion;
    }

    public UpdateEvaluatorSkillRequest setFiles(java.util.List<UpdateEvaluatorSkillRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<UpdateEvaluatorSkillRequestFiles> getFiles() {
        return this.files;
    }

    public UpdateEvaluatorSkillRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateEvaluatorSkillRequestFiles extends TeaModel {
        /**
         * <p>The content of the skill file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <h1>Trace Context Loader</h1>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The name of the skill file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SKILL.md</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The remark for the file.</p>
         * 
         * <strong>example:</strong>
         * <p>Primary skill description</p>
         */
        @NameInMap("remark")
        public String remark;

        public static UpdateEvaluatorSkillRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            UpdateEvaluatorSkillRequestFiles self = new UpdateEvaluatorSkillRequestFiles();
            return TeaModel.build(map, self);
        }

        public UpdateEvaluatorSkillRequestFiles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateEvaluatorSkillRequestFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateEvaluatorSkillRequestFiles setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

}
