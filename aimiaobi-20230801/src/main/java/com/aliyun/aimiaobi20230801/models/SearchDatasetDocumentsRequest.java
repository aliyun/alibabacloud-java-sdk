// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SearchDatasetDocumentsRequest extends TeaModel {
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
     * <p>业务参数</p>
     */
    @NameInMap("Extend1")
    public String extend1;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeContent")
    public Boolean includeContent;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>搜索内容</p>
     */
    @NameInMap("Query")
    public String query;

    /**
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

    public SearchDatasetDocumentsRequest setExtend1(String extend1) {
        this.extend1 = extend1;
        return this;
    }
    public String getExtend1() {
        return this.extend1;
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

    public SearchDatasetDocumentsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
