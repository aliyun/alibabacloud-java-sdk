// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetFileMetasResponseBody extends TeaModel {
    @NameInMap("DatasetFileMetas")
    public java.util.List<DatasetFileMeta> datasetFileMetas;

    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("DatasetVersion")
    public String datasetVersion;

    /**
     * <strong>example:</strong>
     * <p>90******-f5c5-4cd4-927e-1f45e1cb8b62_1729644433000</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public ListDatasetFileMetasResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

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
