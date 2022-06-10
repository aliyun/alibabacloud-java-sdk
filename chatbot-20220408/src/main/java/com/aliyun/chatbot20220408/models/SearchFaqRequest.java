// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class SearchFaqRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 类目唯一标识
    @NameInMap("CategoryIds")
    public java.util.List<Long> categoryIds;

    // 创建开始时间
    @NameInMap("CreateTimeBegin")
    public String createTimeBegin;

    // 创建结束时间
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    // 创建人
    @NameInMap("CreateUserName")
    public String createUserName;

    // 失效开始时间
    @NameInMap("EndTimeBegin")
    public String endTimeBegin;

    // 失效结束时间
    @NameInMap("EndTimeEnd")
    public String endTimeEnd;

    // 关键字
    @NameInMap("Keyword")
    public String keyword;

    // 修改开始时间
    @NameInMap("ModifyTimeBegin")
    public String modifyTimeBegin;

    // 修改结束时间
    @NameInMap("ModifyTimeEnd")
    public String modifyTimeEnd;

    // 修改人
    @NameInMap("ModifyUserName")
    public String modifyUserName;

    // 页码 默认1
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页数量，默认10，最大50
    @NameInMap("PageSize")
    public Integer pageSize;

    // 搜索范围： 1-搜索标题相似问, 2-搜索答案, 3-搜索全部
    @NameInMap("SearchScope")
    public Integer searchScope;

    // 生效开始时间
    @NameInMap("StartTimeBegin")
    public String startTimeBegin;

    // 生效结束时间
    @NameInMap("StartTimeEnd")
    public String startTimeEnd;

    // 知识状态: -1-已删除未发布, 1-未发布, 2-已发布, 3-已更新未发布
    @NameInMap("Status")
    public Integer status;

    public static SearchFaqRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchFaqRequest self = new SearchFaqRequest();
        return TeaModel.build(map, self);
    }

    public SearchFaqRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SearchFaqRequest setCategoryIds(java.util.List<Long> categoryIds) {
        this.categoryIds = categoryIds;
        return this;
    }
    public java.util.List<Long> getCategoryIds() {
        return this.categoryIds;
    }

    public SearchFaqRequest setCreateTimeBegin(String createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
        return this;
    }
    public String getCreateTimeBegin() {
        return this.createTimeBegin;
    }

    public SearchFaqRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public SearchFaqRequest setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }
    public String getCreateUserName() {
        return this.createUserName;
    }

    public SearchFaqRequest setEndTimeBegin(String endTimeBegin) {
        this.endTimeBegin = endTimeBegin;
        return this;
    }
    public String getEndTimeBegin() {
        return this.endTimeBegin;
    }

    public SearchFaqRequest setEndTimeEnd(String endTimeEnd) {
        this.endTimeEnd = endTimeEnd;
        return this;
    }
    public String getEndTimeEnd() {
        return this.endTimeEnd;
    }

    public SearchFaqRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public SearchFaqRequest setModifyTimeBegin(String modifyTimeBegin) {
        this.modifyTimeBegin = modifyTimeBegin;
        return this;
    }
    public String getModifyTimeBegin() {
        return this.modifyTimeBegin;
    }

    public SearchFaqRequest setModifyTimeEnd(String modifyTimeEnd) {
        this.modifyTimeEnd = modifyTimeEnd;
        return this;
    }
    public String getModifyTimeEnd() {
        return this.modifyTimeEnd;
    }

    public SearchFaqRequest setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
        return this;
    }
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    public SearchFaqRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchFaqRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchFaqRequest setSearchScope(Integer searchScope) {
        this.searchScope = searchScope;
        return this;
    }
    public Integer getSearchScope() {
        return this.searchScope;
    }

    public SearchFaqRequest setStartTimeBegin(String startTimeBegin) {
        this.startTimeBegin = startTimeBegin;
        return this;
    }
    public String getStartTimeBegin() {
        return this.startTimeBegin;
    }

    public SearchFaqRequest setStartTimeEnd(String startTimeEnd) {
        this.startTimeEnd = startTimeEnd;
        return this;
    }
    public String getStartTimeEnd() {
        return this.startTimeEnd;
    }

    public SearchFaqRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
