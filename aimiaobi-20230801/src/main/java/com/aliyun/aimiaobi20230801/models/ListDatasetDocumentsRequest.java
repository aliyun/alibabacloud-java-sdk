// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListDatasetDocumentsRequest extends TeaModel {
    /**
     * <p>The unique IDs of the categories.</p>
     */
    @NameInMap("CategoryUuids")
    public java.util.List<String> categoryUuids;

    /**
     * <p>The end of the creation time range, specified as a Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("CreateTimeEnd")
    public Long createTimeEnd;

    /**
     * <p>The start of the creation time range, specified as a Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("CreateTimeStart")
    public Long createTimeStart;

    /**
     * <p>Deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("DatasetDescription")
    public String datasetDescription;

    /**
     * <p>The unique ID of the dataset. You must specify either this parameter or <code>DatasetName</code>.</p>
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
     * <p>An array of document IDs.</p>
     */
    @NameInMap("DocIds")
    public java.util.List<String> docIds;

    /**
     * <p>The type of the document. Valid values:</p>
     * <ul>
     * <li><p><code>plainText</code>: Plain text.</p>
     * </li>
     * <li><p><code>richText</code>: Rich text.</p>
     * </li>
     * <li><p><code>text</code>: A text file.</p>
     * </li>
     * <li><p><code>pdf</code>: A PDF file.</p>
     * </li>
     * <li><p><code>word</code>: A Word file.</p>
     * </li>
     * <li><p><code>image</code>: An image file.</p>
     * </li>
     * <li><p><code>video</code>: A video file.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>The unique IDs of the documents.</p>
     */
    @NameInMap("DocUuids")
    public java.util.List<String> docUuids;

    /**
     * <p>The end time, specified as a Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The fields to exclude from the response. Valid value:</p>
     * <ul>
     * <li><code>content</code>: The document content.</li>
     * </ul>
     */
    @NameInMap("ExcludeFields")
    public java.util.List<String> excludeFields;

    /**
     * <p>A custom extension field.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("Extend1")
    public String extend1;

    /**
     * <p>A custom extension field.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("Extend2")
    public String extend2;

    /**
     * <p>A custom extension field.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("Extend3")
    public String extend3;

    /**
     * <p>The fields to include in the response.</p>
     */
    @NameInMap("IncludeFields")
    public java.util.List<String> includeFields;

    /**
     * <p>A token to retrieve the next page of results. This parameter is required when you retrieve more than 10,000 entries.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search query.</p>
     * 
     * <strong>example:</strong>
     * <p>搜索条件</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The start time, specified as a Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The status of the document. Valid values:</p>
     * <ul>
     * <li><p><code>1</code>: Document created.</p>
     * </li>
     * <li><p><code>2</code>: Text index built.</p>
     * </li>
     * <li><p><code>3</code>: Multimodal index built.</p>
     * </li>
     * <li><p><code>100</code>: Full build complete.</p>
     * </li>
     * <li><p><code>0</code>: Build failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<String> tags;

    /**
     * <p>The title.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The unique ID of the Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDatasetDocumentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetDocumentsRequest self = new ListDatasetDocumentsRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasetDocumentsRequest setCategoryUuids(java.util.List<String> categoryUuids) {
        this.categoryUuids = categoryUuids;
        return this;
    }
    public java.util.List<String> getCategoryUuids() {
        return this.categoryUuids;
    }

    public ListDatasetDocumentsRequest setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public ListDatasetDocumentsRequest setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    public ListDatasetDocumentsRequest setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
        return this;
    }
    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    public ListDatasetDocumentsRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public ListDatasetDocumentsRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public ListDatasetDocumentsRequest setDocIds(java.util.List<String> docIds) {
        this.docIds = docIds;
        return this;
    }
    public java.util.List<String> getDocIds() {
        return this.docIds;
    }

    public ListDatasetDocumentsRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public ListDatasetDocumentsRequest setDocUuids(java.util.List<String> docUuids) {
        this.docUuids = docUuids;
        return this;
    }
    public java.util.List<String> getDocUuids() {
        return this.docUuids;
    }

    public ListDatasetDocumentsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDatasetDocumentsRequest setExcludeFields(java.util.List<String> excludeFields) {
        this.excludeFields = excludeFields;
        return this;
    }
    public java.util.List<String> getExcludeFields() {
        return this.excludeFields;
    }

    public ListDatasetDocumentsRequest setExtend1(String extend1) {
        this.extend1 = extend1;
        return this;
    }
    public String getExtend1() {
        return this.extend1;
    }

    public ListDatasetDocumentsRequest setExtend2(String extend2) {
        this.extend2 = extend2;
        return this;
    }
    public String getExtend2() {
        return this.extend2;
    }

    public ListDatasetDocumentsRequest setExtend3(String extend3) {
        this.extend3 = extend3;
        return this;
    }
    public String getExtend3() {
        return this.extend3;
    }

    public ListDatasetDocumentsRequest setIncludeFields(java.util.List<String> includeFields) {
        this.includeFields = includeFields;
        return this;
    }
    public java.util.List<String> getIncludeFields() {
        return this.includeFields;
    }

    public ListDatasetDocumentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDatasetDocumentsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatasetDocumentsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatasetDocumentsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListDatasetDocumentsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListDatasetDocumentsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListDatasetDocumentsRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public ListDatasetDocumentsRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ListDatasetDocumentsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
