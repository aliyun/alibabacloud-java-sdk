// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetFileMetasResponseBody extends TeaModel {
    /**
     * <p>The detailed metadata of the dataset files.</p>
     */
    @NameInMap("DatasetFileMetas")
    public java.util.List<DatasetFileMeta> datasetFileMetas;

    /**
     * <p>The dataset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-rbvg5*****jhc9ks92</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <p>The version name of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DatasetVersion")
    public String datasetVersion;

    /**
     * <p>The maximum number of results returned per page when you use the \<code>NextToken\\</code> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. If the number of results that match the query exceeds the page size, this token is returned. To retrieve the next page of data, use the returned token in your next request. Repeat this process until no token is returned, which indicates that all data has been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>90******-f5c5-4cd4-927e-1f45e1cb8b62_1729644433000</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    @Deprecated
    public Integer pageSize;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>105173</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDatasetFileMetasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetFileMetasResponseBody self = new ListDatasetFileMetasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasetFileMetasResponseBody setDatasetFileMetas(java.util.List<DatasetFileMeta> datasetFileMetas) {
        this.datasetFileMetas = datasetFileMetas;
        return this;
    }
    public java.util.List<DatasetFileMeta> getDatasetFileMetas() {
        return this.datasetFileMetas;
    }

    public ListDatasetFileMetasResponseBody setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public ListDatasetFileMetasResponseBody setDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    public ListDatasetFileMetasResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDatasetFileMetasResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    @Deprecated
    public ListDatasetFileMetasResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatasetFileMetasResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListDatasetFileMetasResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
