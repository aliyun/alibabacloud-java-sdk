// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateFaqShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000053274</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <strong>example:</strong>
     * <p>2030-12-31T16:00:00Z</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("SolutionContent")
    public String solutionContent;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SolutionType")
    public Integer solutionType;

    /**
     * <strong>example:</strong>
     * <p>2022-05-25T16:28:36Z</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("TagIdList")
    public String tagIdListShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Title")
    public String title;

    public static CreateFaqShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFaqShrinkRequest self = new CreateFaqShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateFaqShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateFaqShrinkRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public CreateFaqShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public CreateFaqShrinkRequest setSolutionContent(String solutionContent) {
        this.solutionContent = solutionContent;
        return this;
    }
    public String getSolutionContent() {
        return this.solutionContent;
    }

    public CreateFaqShrinkRequest setSolutionType(Integer solutionType) {
        this.solutionType = solutionType;
        return this;
    }
    public Integer getSolutionType() {
        return this.solutionType;
    }

    public CreateFaqShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public CreateFaqShrinkRequest setTagIdListShrink(String tagIdListShrink) {
        this.tagIdListShrink = tagIdListShrink;
        return this;
    }
    public String getTagIdListShrink() {
        return this.tagIdListShrink;
    }

    public CreateFaqShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
