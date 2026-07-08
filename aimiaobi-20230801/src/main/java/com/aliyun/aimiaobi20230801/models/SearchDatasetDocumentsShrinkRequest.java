// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SearchDatasetDocumentsShrinkRequest extends TeaModel {
    /**
     * <p>A list of category UUIDs for filtering.</p>
     */
    @NameInMap("CategoryUuids")
    public String categoryUuidsShrink;

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
    public String docIdsShrink;

    /**
     * <p>A list of document types for filtering.</p>
     */
    @NameInMap("DocTypes")
    public String docTypesShrink;

    /**
     * <p>A list of document UUIDs for filtering.</p>
     */
    @NameInMap("DocUuids")
    public String docUuidsShrink;

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
    public String tagsShrink;

    /**
     * <p>The ID of the Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get workspaceId</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SearchDatasetDocumentsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchDatasetDocumentsShrinkRequest self = new SearchDatasetDocumentsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchDatasetDocumentsShrinkRequest setCategoryUuidsShrink(String categoryUuidsShrink) {
        this.categoryUuidsShrink = categoryUuidsShrink;
        return this;
    }
    public String getCategoryUuidsShrink() {
        return this.categoryUuidsShrink;
    }

    public SearchDatasetDocumentsShrinkRequest setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public SearchDatasetDocumentsShrinkRequest setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    public SearchDatasetDocumentsShrinkRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public SearchDatasetDocumentsShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public SearchDatasetDocumentsShrinkRequest setDocIdsShrink(String docIdsShrink) {
        this.docIdsShrink = docIdsShrink;
        return this;
    }
    public String getDocIdsShrink() {
        return this.docIdsShrink;
    }

    public SearchDatasetDocumentsShrinkRequest setDocTypesShrink(String docTypesShrink) {
        this.docTypesShrink = docTypesShrink;
        return this;
    }
    public String getDocTypesShrink() {
        return this.docTypesShrink;
    }

    public SearchDatasetDocumentsShrinkRequest setDocUuidsShrink(String docUuidsShrink) {
        this.docUuidsShrink = docUuidsShrink;
        return this;
    }
    public String getDocUuidsShrink() {
        return this.docUuidsShrink;
    }

    public SearchDatasetDocumentsShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SearchDatasetDocumentsShrinkRequest setExtend1(String extend1) {
        this.extend1 = extend1;
        return this;
    }
    public String getExtend1() {
        return this.extend1;
    }

    public SearchDatasetDocumentsShrinkRequest setExtend2(String extend2) {
        this.extend2 = extend2;
        return this;
    }
    public String getExtend2() {
        return this.extend2;
    }

    public SearchDatasetDocumentsShrinkRequest setExtend3(String extend3) {
        this.extend3 = extend3;
        return this;
    }
    public String getExtend3() {
        return this.extend3;
    }

    public SearchDatasetDocumentsShrinkRequest setIncludeContent(Boolean includeContent) {
        this.includeContent = includeContent;
        return this;
    }
    public Boolean getIncludeContent() {
        return this.includeContent;
    }

    public SearchDatasetDocumentsShrinkRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public SearchDatasetDocumentsShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SearchDatasetDocumentsShrinkRequest setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public String getSearchMode() {
        return this.searchMode;
    }

    public SearchDatasetDocumentsShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SearchDatasetDocumentsShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public SearchDatasetDocumentsShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
