// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListDatasetDocumentsShrinkRequest extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("DocType")
    public String docType;

    @NameInMap("ExcludeFields")
    public String excludeFieldsShrink;

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

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Status")
    public Integer status;

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

    public ListDatasetDocumentsShrinkRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public ListDatasetDocumentsShrinkRequest setExcludeFieldsShrink(String excludeFieldsShrink) {
        this.excludeFieldsShrink = excludeFieldsShrink;
        return this;
    }
    public String getExcludeFieldsShrink() {
        return this.excludeFieldsShrink;
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

    public ListDatasetDocumentsShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListDatasetDocumentsShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
