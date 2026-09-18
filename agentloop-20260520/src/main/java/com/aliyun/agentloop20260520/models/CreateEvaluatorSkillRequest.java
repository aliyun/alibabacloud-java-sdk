// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateEvaluatorSkillRequest extends TeaModel {
    /**
     * <p>The AgentSpace name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-agentspace</p>
     */
    @NameInMap("agentSpace")
    public String agentSpace;

    /**
     * <p>The skill description.</p>
     * 
     * <strong>example:</strong>
     * <p>Reads trace context to assist evaluation</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>Trace Context Loader</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>Specifies whether to enable the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The list of skill files.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;SKILL.md&quot;,&quot;content&quot;:&quot;# Trace Context Loader&quot;,&quot;remark&quot;:&quot;Main skill description&quot;}]</p>
     */
    @NameInMap("files")
    public java.util.List<CreateEvaluatorSkillRequestFiles> files;

    /**
     * <p>The skill name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>trace_context_loader</p>
     */
    @NameInMap("skillName")
    public String skillName;

    /**
     * <p>The idempotency token. CloudSpec declares this query parameter, but the backend does not currently perform idempotency comparison.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateEvaluatorSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEvaluatorSkillRequest self = new CreateEvaluatorSkillRequest();
        return TeaModel.build(map, self);
    }

    public CreateEvaluatorSkillRequest setAgentSpace(String agentSpace) {
        this.agentSpace = agentSpace;
        return this;
    }
    public String getAgentSpace() {
        return this.agentSpace;
    }

    public CreateEvaluatorSkillRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEvaluatorSkillRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateEvaluatorSkillRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateEvaluatorSkillRequest setFiles(java.util.List<CreateEvaluatorSkillRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<CreateEvaluatorSkillRequestFiles> getFiles() {
        return this.files;
    }

    public CreateEvaluatorSkillRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public CreateEvaluatorSkillRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateEvaluatorSkillRequestFiles extends TeaModel {
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
         * <p>Main skill description</p>
         */
        @NameInMap("remark")
        public String remark;

        public static CreateEvaluatorSkillRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            CreateEvaluatorSkillRequestFiles self = new CreateEvaluatorSkillRequestFiles();
            return TeaModel.build(map, self);
        }

        public CreateEvaluatorSkillRequestFiles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateEvaluatorSkillRequestFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEvaluatorSkillRequestFiles setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

}
