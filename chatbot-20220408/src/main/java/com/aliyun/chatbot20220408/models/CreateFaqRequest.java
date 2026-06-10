// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateFaqRequest extends TeaModel {
    /**
     * <p>The agent key. If omitted, the default agent is used. Find this key on the Agent Management page.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The ID of the knowledge category.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000053274</p>
     */
    @NameInMap("CategoryId")
    public Long categoryId;

    /**
     * <p>The knowledge end time. The time is in UTC and in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2030-12-31T16:00:00Z</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The content of the default solution. Required if the fallback feature is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>测试答案</p>
     */
    @NameInMap("SolutionContent")
    public String solutionContent;

    /**
     * <p>The type of the default solution. Valid values: <code>0</code> (plain text) and <code>1</code> (rich text).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SolutionType")
    public Integer solutionType;

    /**
     * <p>The knowledge start time. The time is in UTC and in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-25T16:28:36Z</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>A list of tag IDs to associate with the knowledge.</p>
     */
    @NameInMap("TagIdList")
    public java.util.List<Long> tagIdList;

    /**
     * <p>The knowledge title. Max length: 120 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试标题</p>
     */
    @NameInMap("Title")
    public String title;

    public static CreateFaqRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFaqRequest self = new CreateFaqRequest();
        return TeaModel.build(map, self);
    }

    public CreateFaqRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateFaqRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public CreateFaqRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public CreateFaqRequest setSolutionContent(String solutionContent) {
        this.solutionContent = solutionContent;
        return this;
    }
    public String getSolutionContent() {
        return this.solutionContent;
    }

    public CreateFaqRequest setSolutionType(Integer solutionType) {
        this.solutionType = solutionType;
        return this;
    }
    public Integer getSolutionType() {
        return this.solutionType;
    }

    public CreateFaqRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public CreateFaqRequest setTagIdList(java.util.List<Long> tagIdList) {
        this.tagIdList = tagIdList;
        return this;
    }
    public java.util.List<Long> getTagIdList() {
        return this.tagIdList;
    }

    public CreateFaqRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
