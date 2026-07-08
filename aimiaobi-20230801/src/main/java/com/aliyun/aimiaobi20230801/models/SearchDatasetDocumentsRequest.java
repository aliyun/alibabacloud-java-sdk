// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SearchDatasetDocumentsRequest extends TeaModel {
    /**
     * <p>A list of category UUIDs for filtering.</p>
     */
    @NameInMap("CategoryUuids")
    public java.util.List<String> categoryUuids;

    /**
     * <p>The end time for document creation, specified as a Unix timestamp.</p>
     */
    @NameInMap("CreateTimeEnd")
    public Long createTimeEnd;

    /**
     * <p>The start time for document creation, specified as a Unix timestamp.</p>
     */
    @NameInMap("CreateTimeStart")
    public Long createTimeStart;

    /**
     * <p>The ID of the dataset. You must specify either <code>DatasetId</code> or <code>DatasetName</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DatasetId")
    public Long datasetId;

    /**
     * <p>The name of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>数据集名称</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>A list of document IDs for filtering.</p>
     */
    @NameInMap("DocIds")
    public java.util.List<String> docIds;

    /**
     * <p>A list of document types for filtering.</p>
     */
    @NameInMap("DocTypes")
    public java.util.List<String> docTypes;

    /**
     * <p>A list of document UUIDs for filtering.</p>
     */
    @NameInMap("DocUuids")
    public java.util.List<String> docUuids;

    /**
     * <p>The end of the time range for filtering, specified as a Unix timestamp.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>A business parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>业务参数</p>
     */
    @NameInMap("Extend1")
    public String extend1;

    /**
     * <p>A reserved business parameter.</p>
     */
    @NameInMap("Extend2")
    public String extend2;

    /**
     * <p>A reserved business parameter.</p>
     */
    @NameInMap("Extend3")
    public String extend3;

    /**
     * <p>Specifies whether to include the document content in the search results. The default value is <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeContent")
    public Boolean includeContent;

    /**
     * <p>The number of documents to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The search query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>搜索内容</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The search mode.</p>
     */
    @NameInMap("SearchMode")
    public String searchMode;

    /**
     * <p>The start of the time range for filtering, specified as a Unix timestamp.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>A list of tags for filtering.</p>
     */
    @NameInMap("Tags")
    public java.util.List<String> tags;

    /**
     * <p>The ID of the Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get workspaceId</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SearchDatasetDocumentsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchDatasetDocumentsRequest self = new SearchDatasetDocumentsRequest();
        return TeaModel.build(map, self);
    }

    public SearchDatasetDocumentsRequest setCategoryUuids(java.util.List<String> categoryUuids) {
        this.categoryUuids = categoryUuids;
        return this;
    }
    public java.util.List<String> getCategoryUuids() {
        return this.categoryUuids;
    }

    public SearchDatasetDocumentsRequest setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public SearchDatasetDocumentsRequest setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    public SearchDatasetDocumentsRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public SearchDatasetDocumentsRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public SearchDatasetDocumentsRequest setDocIds(java.util.List<String> docIds) {
        this.docIds = docIds;
        return this;
    }
    public java.util.List<String> getDocIds() {
        return this.docIds;
    }

    public SearchDatasetDocumentsRequest setDocTypes(java.util.List<String> docTypes) {
        this.docTypes = docTypes;
        return this;
    }
    public java.util.List<String> getDocTypes() {
        return this.docTypes;
    }

    public SearchDatasetDocumentsRequest setDocUuids(java.util.List<String> docUuids) {
        this.docUuids = docUuids;
        return this;
    }
    public java.util.List<String> getDocUuids() {
        return this.docUuids;
    }

    public SearchDatasetDocumentsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SearchDatasetDocumentsRequest setExtend1(String extend1) {
        this.extend1 = extend1;
        return this;
    }
    public String getExtend1() {
        return this.extend1;
    }

    public SearchDatasetDocumentsRequest setExtend2(String extend2) {
        this.extend2 = extend2;
        return this;
    }
    public String getExtend2() {
        return this.extend2;
    }

    public SearchDatasetDocumentsRequest setExtend3(String extend3) {
        this.extend3 = extend3;
        return this;
    }
    public String getExtend3() {
        return this.extend3;
    }

    public SearchDatasetDocumentsRequest setIncludeContent(Boolean includeContent) {
        this.includeContent = includeContent;
        return this;
    }
    public Boolean getIncludeContent() {
        return this.includeContent;
    }

    public SearchDatasetDocumentsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public SearchDatasetDocumentsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SearchDatasetDocumentsRequest setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public String getSearchMode() {
        return this.searchMode;
    }

    public SearchDatasetDocumentsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SearchDatasetDocumentsRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public SearchDatasetDocumentsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
