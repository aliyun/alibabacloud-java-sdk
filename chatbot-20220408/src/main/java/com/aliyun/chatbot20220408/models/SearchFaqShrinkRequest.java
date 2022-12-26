// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class SearchFaqShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("CategoryIds")
    public String categoryIdsShrink;

    @NameInMap("CreateTimeBegin")
    public String createTimeBegin;

    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    @NameInMap("CreateUserName")
    public String createUserName;

    @NameInMap("EndTimeBegin")
    public String endTimeBegin;

    @NameInMap("EndTimeEnd")
    public String endTimeEnd;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("ModifyTimeBegin")
    public String modifyTimeBegin;

    @NameInMap("ModifyTimeEnd")
    public String modifyTimeEnd;

    @NameInMap("ModifyUserName")
    public String modifyUserName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchScope")
    public Integer searchScope;

    @NameInMap("StartTimeBegin")
    public String startTimeBegin;

    @NameInMap("StartTimeEnd")
    public String startTimeEnd;

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
