// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateSolutionRequest extends TeaModel {
    /**
     * <p>The key of the workspace. If this parameter is not specified, the default workspace is accessed. You can obtain the key on the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The content of the answer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Answer content</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The type of the answer. Valid values:</p>
     * <ul>
     * <li>0: plain text.</li>
     * <li>1: rich text.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ContentType")
    public Integer contentType;

    /**
     * <p>The knowledge ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001905617</p>
     */
    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    /**
     * <p>The list of perspective codes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PerspectiveCodes")
    public java.util.List<String> perspectiveCodes;

    /**
     * <p>The list of tag IDs.</p>
     */
    @NameInMap("TagIdList")
    public java.util.List<Long> tagIdList;

    public static CreateSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSolutionRequest self = new CreateSolutionRequest();
        return TeaModel.build(map, self);
    }

    public CreateSolutionRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateSolutionRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateSolutionRequest setContentType(Integer contentType) {
        this.contentType = contentType;
        return this;
    }
    public Integer getContentType() {
        return this.contentType;
    }

    public CreateSolutionRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public CreateSolutionRequest setPerspectiveCodes(java.util.List<String> perspectiveCodes) {
        this.perspectiveCodes = perspectiveCodes;
        return this;
    }
    public java.util.List<String> getPerspectiveCodes() {
        return this.perspectiveCodes;
    }

    public CreateSolutionRequest setTagIdList(java.util.List<Long> tagIdList) {
        this.tagIdList = tagIdList;
        return this;
    }
    public java.util.List<Long> getTagIdList() {
        return this.tagIdList;
    }

}
