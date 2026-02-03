// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListDatasetDocumentsShrinkRequest extends TeaModel {
    @NameInMap("CategoryUuids")
    public String categoryUuidsShrink;

    @NameInMap("CreateTimeEnd")
    public Long createTimeEnd;

    @NameInMap("CreateTimeStart")
    public Long createTimeStart;

    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("DatasetDescription")
    public String datasetDescription;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DatasetId")
    public Long datasetId;

    /**
     * <strong>example:</strong>
     * <p>数据集名称</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("DocIds")
    public String docIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("DocType")
    public String docType;

    @NameInMap("DocUuids")
    public String docUuidsShrink;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ExcludeFields")
    public String excludeFieldsShrink;

    @NameInMap("Extend1")
    public String extend1;

    @NameInMap("Extend2")
    public String extend2;

    @NameInMap("Extend3")
    public String extend3;

    @NameInMap("IncludeFields")
    public String includeFieldsShrink;

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
     * <p>搜索条件</p>
     */
    @NameInMap("Query")
    public String query;

    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Status")
    public Integer status;

    @NameInMap("Tags")
    public String tagsShrink;

    @NameInMap("Title")
    public String title;

    /**
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
