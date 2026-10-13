// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateFaqRequest extends TeaModel {
    /**
     * <p>The workspace key. If not specified, the default workspace is accessed. You can obtain the key value from the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The category ID of the knowledge entry.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30000049006</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p>The expiration time.</p>
     * 
     * <strong>example:</strong>
     * <p>2030-12-31T16:00:00Z</p>
     */
    @NameInMap("EndDate")
    public String endDate;

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
     * <p>The effective period.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-27T05:18:20Z</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The list of tag IDs.</p>
     */
    @NameInMap("TagIdList")
    public java.util.List<Long> tagIdList;

    /**
     * <p>The title of the knowledge entry.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test title</p>
     */
    @NameInMap("Title")
    public String title;

    public static UpdateFaqRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaqRequest self = new UpdateFaqRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFaqRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateFaqRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public UpdateFaqRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public UpdateFaqRequest setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public UpdateFaqRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public UpdateFaqRequest setTagIdList(java.util.List<Long> tagIdList) {
        this.tagIdList = tagIdList;
        return this;
    }
    public java.util.List<Long> getTagIdList() {
        return this.tagIdList;
    }

    public UpdateFaqRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
