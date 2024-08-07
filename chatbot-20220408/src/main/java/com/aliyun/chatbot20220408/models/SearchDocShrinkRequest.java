// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class SearchDocShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("CategoryIds")
    public String categoryIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>2022-04-02T03:09:30Z</p>
     */
    @NameInMap("CreateTimeBegin")
    public String createTimeBegin;

    /**
     * <strong>example:</strong>
     * <p>2022-05-02T03:09:30Z</p>
     */
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    @NameInMap("CreateUserName")
    public String createUserName;

    /**
     * <strong>example:</strong>
     * <p>2023-04-02T03:09:30Z</p>
     */
    @NameInMap("EndTimeBegin")
    public String endTimeBegin;

    /**
     * <strong>example:</strong>
     * <p>2023-05-02T03:09:30Z</p>
     */
    @NameInMap("EndTimeEnd")
    public String endTimeEnd;

    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>2023-04-02T03:09:30Z</p>
     */
    @NameInMap("ModifyTimeBegin")
    public String modifyTimeBegin;

    /**
     * <strong>example:</strong>
     * <p>2023-05-02T03:09:30Z</p>
     */
    @NameInMap("ModifyTimeEnd")
    public String modifyTimeEnd;

    @NameInMap("ModifyUserName")
    public String modifyUserName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ProcessStatus")
    public Integer processStatus;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SearchScope")
    public Integer searchScope;

    /**
     * <strong>example:</strong>
     * <p>2022-04-02T03:09:30Z</p>
     */
    @NameInMap("StartTimeBegin")
    public String startTimeBegin;

    /**
     * <strong>example:</strong>
     * <p>2022-04-03T03:09:30Z</p>
     */
    @NameInMap("StartTimeEnd")
    public String startTimeEnd;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    @NameInMap("TagIds")
    public String tagIdsShrink;

    public static SearchDocShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchDocShrinkRequest self = new SearchDocShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchDocShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SearchDocShrinkRequest setCategoryIdsShrink(String categoryIdsShrink) {
        this.categoryIdsShrink = categoryIdsShrink;
        return this;
    }
    public String getCategoryIdsShrink() {
        return this.categoryIdsShrink;
    }

    public SearchDocShrinkRequest setCreateTimeBegin(String createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
        return this;
    }
    public String getCreateTimeBegin() {
        return this.createTimeBegin;
    }

    public SearchDocShrinkRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public SearchDocShrinkRequest setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }
    public String getCreateUserName() {
        return this.createUserName;
    }

    public SearchDocShrinkRequest setEndTimeBegin(String endTimeBegin) {
        this.endTimeBegin = endTimeBegin;
        return this;
    }
    public String getEndTimeBegin() {
        return this.endTimeBegin;
    }

    public SearchDocShrinkRequest setEndTimeEnd(String endTimeEnd) {
        this.endTimeEnd = endTimeEnd;
        return this;
    }
    public String getEndTimeEnd() {
        return this.endTimeEnd;
    }

    public SearchDocShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public SearchDocShrinkRequest setModifyTimeBegin(String modifyTimeBegin) {
        this.modifyTimeBegin = modifyTimeBegin;
        return this;
    }
    public String getModifyTimeBegin() {
        return this.modifyTimeBegin;
    }

    public SearchDocShrinkRequest setModifyTimeEnd(String modifyTimeEnd) {
        this.modifyTimeEnd = modifyTimeEnd;
        return this;
    }
    public String getModifyTimeEnd() {
        return this.modifyTimeEnd;
    }

    public SearchDocShrinkRequest setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
        return this;
    }
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    public SearchDocShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchDocShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchDocShrinkRequest setProcessStatus(Integer processStatus) {
        this.processStatus = processStatus;
        return this;
    }
    public Integer getProcessStatus() {
        return this.processStatus;
    }

    public SearchDocShrinkRequest setSearchScope(Integer searchScope) {
        this.searchScope = searchScope;
        return this;
    }
    public Integer getSearchScope() {
        return this.searchScope;
    }

    public SearchDocShrinkRequest setStartTimeBegin(String startTimeBegin) {
        this.startTimeBegin = startTimeBegin;
        return this;
    }
    public String getStartTimeBegin() {
        return this.startTimeBegin;
    }

    public SearchDocShrinkRequest setStartTimeEnd(String startTimeEnd) {
        this.startTimeEnd = startTimeEnd;
        return this;
    }
    public String getStartTimeEnd() {
        return this.startTimeEnd;
    }

    public SearchDocShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public SearchDocShrinkRequest setTagIdsShrink(String tagIdsShrink) {
        this.tagIdsShrink = tagIdsShrink;
        return this;
    }
    public String getTagIdsShrink() {
        return this.tagIdsShrink;
    }

}
