// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateEvaluatorSkillRequest extends TeaModel {
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
     * <p>The description of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>读取链路上下文辅助评估</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>Trace 上下文读取</p>
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
     * <p>The list of skill files. When provided, the skill file content is updated.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;SKILL.md&quot;,&quot;content&quot;:&quot;# Trace Context Loader&quot;,&quot;remark&quot;:&quot;主技能说明&quot;}]</p>
     */
    @NameInMap("files")
    public java.util.List<UpdateEvaluatorSkillRequestFiles> files;

    /**
     * <p>The idempotency token. CloudSpec declares this query parameter, but the backend does not currently perform idempotency comparison.</p>
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
         * <p>The skill file content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <h1>Trace Context Loader</h1>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The skill file name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SKILL.md</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The file remark.</p>
         * 
         * <strong>example:</strong>
         * <p>主技能说明</p>
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
