// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListDatasetDocumentsShrinkRequest extends TeaModel {
    /**
     * <p>The unique IDs of the categories.</p>
     */
    @NameInMap("CategoryUuids")
    public String categoryUuidsShrink;

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
    public String docIdsShrink;

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
    public String docUuidsShrink;

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
    public String excludeFieldsShrink;

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
    public String includeFieldsShrink;

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
    public String tagsShrink;

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

    public static ListDatasetDocumentsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetDocumentsShrinkRequest self = new ListDatasetDocumentsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasetDocumentsShrinkRequest setCategoryUuidsShrink(String categoryUuidsShrink) {
        this.categoryUuidsShrink = categoryUuidsShrink;
        return this;
    }
    public String getCategoryUuidsShrink() {
        return this.categoryUuidsShrink;
    }

    public ListDatasetDocumentsShrinkRequest setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public ListDatasetDocumentsShrinkRequest setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    public ListDatasetDocumentsShrinkRequest setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
        return this;
    }
    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    public ListDatasetDocumentsShrinkRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public ListDatasetDocumentsShrinkRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public ListDatasetDocumentsShrinkRequest setDocIdsShrink(String docIdsShrink) {
        this.docIdsShrink = docIdsShrink;
        return this;
    }
    public String getDocIdsShrink() {
        return this.docIdsShrink;
    }

    public ListDatasetDocumentsShrinkRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public ListDatasetDocumentsShrinkRequest setDocUuidsShrink(String docUuidsShrink) {
        this.docUuidsShrink = docUuidsShrink;
        return this;
    }
    public String getDocUuidsShrink() {
        return this.docUuidsShrink;
    }

    public ListDatasetDocumentsShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDatasetDocumentsShrinkRequest setExcludeFieldsShrink(String excludeFieldsShrink) {
        this.excludeFieldsShrink = excludeFieldsShrink;
        return this;
    }
    public String getExcludeFieldsShrink() {
        return this.excludeFieldsShrink;
    }

    public ListDatasetDocumentsShrinkRequest setExtend1(String extend1) {
        this.extend1 = extend1;
        return this;
    }
    public String getExtend1() {
        return this.extend1;
    }

    public ListDatasetDocumentsShrinkRequest setExtend2(String extend2) {
        this.extend2 = extend2;
        return this;
    }
    public String getExtend2() {
        return this.extend2;
    }

    public ListDatasetDocumentsShrinkRequest setExtend3(String extend3) {
        this.extend3 = extend3;
        return this;
    }
    public String getExtend3() {
        return this.extend3;
    }

    public ListDatasetDocumentsShrinkRequest setIncludeFieldsShrink(String includeFieldsShrink) {
        this.includeFieldsShrink = includeFieldsShrink;
        return this;
    }
    public String getIncludeFieldsShrink() {
        return this.includeFieldsShrink;
    }

    public ListDatasetDocumentsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDatasetDocumentsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatasetDocumentsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatasetDocumentsShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListDatasetDocumentsShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListDatasetDocumentsShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListDatasetDocumentsShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public ListDatasetDocumentsShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ListDatasetDocumentsShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
