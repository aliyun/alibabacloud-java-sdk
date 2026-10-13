// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateSolutionShrinkRequest extends TeaModel {
    /**
     * <p>The workspace key. If this parameter is not specified, the default workspace is accessed. You can obtain the key from the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The answer content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Updated answer content</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The answer type. Valid values:</p>
     * <ul>
     * <li>0: plain text</li>
     * <li>1: rich text</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ContentType")
    public Integer contentType;

    /**
     * <p>The list of perspective codes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PerspectiveCodes")
    public java.util.List<String> perspectiveCodes;

    /**
     * <p>The answer ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100001333260</p>
     */
    @NameInMap("SolutionId")
    public Long solutionId;

    /**
     * <p>The list of tag IDs.</p>
     */
    @NameInMap("TagIdList")
    public String tagIdListShrink;

    public static UpdateSolutionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSolutionShrinkRequest self = new UpdateSolutionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSolutionShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateSolutionShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateSolutionShrinkRequest setContentType(Integer contentType) {
        this.contentType = contentType;
        return this;
    }
    public Integer getContentType() {
        return this.contentType;
    }

    public UpdateSolutionShrinkRequest setPerspectiveCodes(java.util.List<String> perspectiveCodes) {
        this.perspectiveCodes = perspectiveCodes;
        return this;
    }
    public java.util.List<String> getPerspectiveCodes() {
        return this.perspectiveCodes;
    }

    public UpdateSolutionShrinkRequest setSolutionId(Long solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public Long getSolutionId() {
        return this.solutionId;
    }

    public UpdateSolutionShrinkRequest setTagIdListShrink(String tagIdListShrink) {
        this.tagIdListShrink = tagIdListShrink;
        return this;
    }
    public String getTagIdListShrink() {
        return this.tagIdListShrink;
    }

}
