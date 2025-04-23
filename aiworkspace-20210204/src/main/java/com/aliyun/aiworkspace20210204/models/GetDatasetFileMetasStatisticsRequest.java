// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetFileMetasStatisticsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>filedir</p>
     */
    @NameInMap("AggregateBy")
    public String aggregateBy;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DatasetVersion")
    public String datasetVersion;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>145883</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetDatasetFileMetasStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetFileMetasStatisticsRequest self = new GetDatasetFileMetasStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetDatasetFileMetasStatisticsRequest setAggregateBy(String aggregateBy) {
        this.aggregateBy = aggregateBy;
        return this;
    }
    public String getAggregateBy() {
        return this.aggregateBy;
    }

    public GetDatasetFileMetasStatisticsRequest setDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    public GetDatasetFileMetasStatisticsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetDatasetFileMetasStatisticsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
