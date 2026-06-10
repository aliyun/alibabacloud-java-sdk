// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class SearchDocRequest extends TeaModel {
    /**
     * <p>The workspace key. If omitted, the default workspace is used. You can obtain this key from the Business Management page of your main account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>A list of category IDs.</p>
     */
    @NameInMap("CategoryIds")
    public java.util.List<Long> categoryIds;

    /**
     * <p>The start of the creation time range.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-02T03:09:30Z</p>
     */
    @NameInMap("CreateTimeBegin")
    public String createTimeBegin;

    /**
     * <p>The end of the creation time range.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-02T03:09:30Z</p>
     */
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    /**
     * <p>The name of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("CreateUserName")
    public String createUserName;

    /**
     * <p>The start of the expiration time range.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-02T03:09:30Z</p>
     */
    @NameInMap("EndTimeBegin")
    public String endTimeBegin;

    /**
     * <p>The end of the expiration time range.</p>
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
     * <p>搜索关键字</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The start of the modification time range.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-02T03:09:30Z</p>
     */
    @NameInMap("ModifyTimeBegin")
    public String modifyTimeBegin;

    /**
     * <p>The end of the modification time range.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-02T03:09:30Z</p>
     */
    @NameInMap("ModifyTimeEnd")
    public String modifyTimeEnd;

    /**
     * <p>The name of the last modifier.</p>
     * 
     * <strong>example:</strong>
     * <p>李四</p>
     */
    @NameInMap("ModifyUserName")
    public String modifyUserName;

    /**
     * <p>The page number to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The task status.<br>Valid values:<br>• -1: Queued<br>• 0: Succeeded<br>• 1: Parsing<br>• 2: Processing<br>• 3: Failed<br><br><br><br><br><br></p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ProcessStatus")
    public Integer processStatus;

    /**
     * <p>The search scope.<br>Valid values:<br>• 1: Search titles<br>• 2: Search content<br><br><br></p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SearchScope")
    public Integer searchScope;

    /**
     * <p>The start of the effective time range.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-02T03:09:30Z</p>
     */
    @NameInMap("StartTimeBegin")
    public String startTimeBegin;

    /**
     * <p>The end of the effective time range.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-03T03:09:30Z</p>
     */
    @NameInMap("StartTimeEnd")
    public String startTimeEnd;

    /**
     * <p>The edit status.<br>Valid values:<br>• 1: Unpublished<br>• 2: Published<br>• 3: Updated but not published<br><br><br><br></p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>A list of tag IDs. If you provide multiple IDs, the operation returns documents that match at least one of the specified tags (logical OR).</p>
     */
    @NameInMap("TagIds")
    public java.util.List<Long> tagIds;

    public static SearchDocRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchDocRequest self = new SearchDocRequest();
        return TeaModel.build(map, self);
    }

    public SearchDocRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SearchDocRequest setCategoryIds(java.util.List<Long> categoryIds) {
        this.categoryIds = categoryIds;
        return this;
    }
    public java.util.List<Long> getCategoryIds() {
        return this.categoryIds;
    }

    public SearchDocRequest setCreateTimeBegin(String createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
        return this;
    }
    public String getCreateTimeBegin() {
        return this.createTimeBegin;
    }

    public SearchDocRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public SearchDocRequest setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }
    public String getCreateUserName() {
        return this.createUserName;
    }

    public SearchDocRequest setEndTimeBegin(String endTimeBegin) {
        this.endTimeBegin = endTimeBegin;
        return this;
    }
    public String getEndTimeBegin() {
        return this.endTimeBegin;
    }

    public SearchDocRequest setEndTimeEnd(String endTimeEnd) {
        this.endTimeEnd = endTimeEnd;
        return this;
    }
    public String getEndTimeEnd() {
        return this.endTimeEnd;
    }

    public SearchDocRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public SearchDocRequest setModifyTimeBegin(String modifyTimeBegin) {
        this.modifyTimeBegin = modifyTimeBegin;
        return this;
    }
    public String getModifyTimeBegin() {
        return this.modifyTimeBegin;
    }

    public SearchDocRequest setModifyTimeEnd(String modifyTimeEnd) {
        this.modifyTimeEnd = modifyTimeEnd;
        return this;
    }
    public String getModifyTimeEnd() {
        return this.modifyTimeEnd;
    }

    public SearchDocRequest setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
        return this;
    }
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    public SearchDocRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchDocRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchDocRequest setProcessStatus(Integer processStatus) {
        this.processStatus = processStatus;
        return this;
    }
    public Integer getProcessStatus() {
        return this.processStatus;
    }

    public SearchDocRequest setSearchScope(Integer searchScope) {
        this.searchScope = searchScope;
        return this;
    }
    public Integer getSearchScope() {
        return this.searchScope;
    }

    public SearchDocRequest setStartTimeBegin(String startTimeBegin) {
        this.startTimeBegin = startTimeBegin;
        return this;
    }
    public String getStartTimeBegin() {
        return this.startTimeBegin;
    }

    public SearchDocRequest setStartTimeEnd(String startTimeEnd) {
        this.startTimeEnd = startTimeEnd;
        return this;
    }
    public String getStartTimeEnd() {
        return this.startTimeEnd;
    }

    public SearchDocRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public SearchDocRequest setTagIds(java.util.List<Long> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<Long> getTagIds() {
        return this.tagIds;
    }

}
