// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateSolutionShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ContentType")
    public Integer contentType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001905617</p>
     */
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PerspectiveCodes")
    public java.util.List<String> perspectiveCodes;

    @NameInMap("TagIdList")
    public String tagIdListShrink;

    public static CreateSolutionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSolutionShrinkRequest self = new CreateSolutionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSolutionShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateSolutionShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateSolutionShrinkRequest setContentType(Integer contentType) {
        this.contentType = contentType;
        return this;
    }
    public Integer getContentType() {
        return this.contentType;
    }

    public CreateSolutionShrinkRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public CreateSolutionShrinkRequest setPerspectiveCodes(java.util.List<String> perspectiveCodes) {
        this.perspectiveCodes = perspectiveCodes;
        return this;
    }
    public java.util.List<String> getPerspectiveCodes() {
        return this.perspectiveCodes;
    }

    public CreateSolutionShrinkRequest setTagIdListShrink(String tagIdListShrink) {
        this.tagIdListShrink = tagIdListShrink;
        return this;
    }
    public String getTagIdListShrink() {
        return this.tagIdListShrink;
    }

}
