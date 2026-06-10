// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class SearchFaqShrinkRequest extends TeaModel {
    /**
     * <p>The key for the workspace. If this parameter is not specified, the default workspace is used. You can get the key on the Business Management page of your main account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>An array of category IDs to filter the search results.</p>
     */
    @NameInMap("CategoryIds")
    public String categoryIdsShrink;

    /**
     * <p>The start of the creation period.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-02T03:09:30Z</p>
     */
    @NameInMap("CreateTimeBegin")
    public String createTimeBegin;

    /**
     * <p>The end of the creation period.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-02T03:09:30Z</p>
     */
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    /**
     * <p>The creator\&quot;s username.</p>
     * 
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("CreateUserName")
    public String createUserName;

    /**
     * <p>The start of the expiration period.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-02T03:09:30Z</p>
     */
    @NameInMap("EndTimeBegin")
    public String endTimeBegin;

    /**
     * <p>The end of the expiration period.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-02T03:09:30Z</p>
     */
    @NameInMap("EndTimeEnd")
    public String endTimeEnd;

    /**
     * <p>The search keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>搜索标题</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The start of the modification period.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-02T03:09:30Z</p>
     */
    @NameInMap("ModifyTimeBegin")
    public String modifyTimeBegin;

    /**
     * <p>The end of the modification period.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-02T03:09:30Z</p>
     */
    @NameInMap("ModifyTimeEnd")
    public String modifyTimeEnd;

    /**
     * <p>The modifier\&quot;s username.</p>
     * 
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("ModifyUserName")
    public String modifyUserName;

    /**
     * <p>The number of the page to return. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. The default value is 10, and the maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search scope.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SearchScope")
    public Integer searchScope;

    /**
     * <p>The start of the effective period.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-02T03:09:30Z</p>
     */
    @NameInMap("StartTimeBegin")
    public String startTimeBegin;

    /**
     * <p>The end of the effective period.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-03T03:09:30Z</p>
     */
    @NameInMap("StartTimeEnd")
    public String startTimeEnd;

    /**
     * <p>The status of the knowledge item.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static SearchFaqShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchFaqShrinkRequest self = new SearchFaqShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchFaqShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SearchFaqShrinkRequest setCategoryIdsShrink(String categoryIdsShrink) {
        this.categoryIdsShrink = categoryIdsShrink;
        return this;
    }
    public String getCategoryIdsShrink() {
        return this.categoryIdsShrink;
    }

    public SearchFaqShrinkRequest setCreateTimeBegin(String createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
        return this;
    }
    public String getCreateTimeBegin() {
        return this.createTimeBegin;
    }

    public SearchFaqShrinkRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public SearchFaqShrinkRequest setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }
    public String getCreateUserName() {
        return this.createUserName;
    }

    public SearchFaqShrinkRequest setEndTimeBegin(String endTimeBegin) {
        this.endTimeBegin = endTimeBegin;
        return this;
    }
    public String getEndTimeBegin() {
        return this.endTimeBegin;
    }

    public SearchFaqShrinkRequest setEndTimeEnd(String endTimeEnd) {
        this.endTimeEnd = endTimeEnd;
        return this;
    }
    public String getEndTimeEnd() {
        return this.endTimeEnd;
    }

    public SearchFaqShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public SearchFaqShrinkRequest setModifyTimeBegin(String modifyTimeBegin) {
        this.modifyTimeBegin = modifyTimeBegin;
        return this;
    }
    public String getModifyTimeBegin() {
        return this.modifyTimeBegin;
    }

    public SearchFaqShrinkRequest setModifyTimeEnd(String modifyTimeEnd) {
        this.modifyTimeEnd = modifyTimeEnd;
        return this;
    }
    public String getModifyTimeEnd() {
        return this.modifyTimeEnd;
    }

    public SearchFaqShrinkRequest setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
        return this;
    }
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    public SearchFaqShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchFaqShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchFaqShrinkRequest setSearchScope(Integer searchScope) {
        this.searchScope = searchScope;
        return this;
    }
    public Integer getSearchScope() {
        return this.searchScope;
    }

    public SearchFaqShrinkRequest setStartTimeBegin(String startTimeBegin) {
        this.startTimeBegin = startTimeBegin;
        return this;
    }
    public String getStartTimeBegin() {
        return this.startTimeBegin;
    }

    public SearchFaqShrinkRequest setStartTimeEnd(String startTimeEnd) {
        this.startTimeEnd = startTimeEnd;
        return this;
    }
    public String getStartTimeEnd() {
        return this.startTimeEnd;
    }

    public SearchFaqShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
