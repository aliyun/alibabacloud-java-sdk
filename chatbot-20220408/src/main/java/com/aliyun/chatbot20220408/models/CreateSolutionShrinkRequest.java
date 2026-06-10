// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateSolutionShrinkRequest extends TeaModel {
    /**
     * <p>The key of the business space. If this parameter is omitted, the system uses the default business space. You can obtain the key from the Business Management page of your primary account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The content of the knowledge answer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>答案内容</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The answer type. Valid values: <code>0</code> (plain text) and <code>1</code> (rich text).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ContentType")
    public Integer contentType;

    /**
     * <p>The ID of the knowledge.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001905617</p>
     */
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    /**
     * <p>A list of perspective codes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PerspectiveCodes")
    public java.util.List<String> perspectiveCodes;

    /**
     * <p>A list of tag IDs.</p>
     */
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
