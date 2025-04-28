// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetFileMetasStatisticsRequest extends TeaModel {
    /**
     * <p>Aggregates statistics based on the specified metadata field. The value is not case-sensitive. If not specified, the total number of dataset file metadata will be returned, instead of aggregation lists. Valid values:</p>
     * <ul>
     * <li>filedir: the directory path of the file</li>
     * <li>file_type: the file type</li>
     * <li>tags.user: user-defined tag</li>
     * <li>tags.user-delete-ai-tags: algorithm tags deleted by the user</li>
     * <li>tags.ai: algorithm tags (aggregated by all tagging tasks)</li>
     * <li>tags.all: algorithm tags and user-defined tags (excluding alogorithm tags deleted by the user)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>filedir</p>
     */
    @NameInMap("AggregateBy")
    public String aggregateBy;

    /**
     * <p>The dataset version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DatasetVersion")
    public String datasetVersion;

    /**
     * <p>The maximum number of results to be returned from a single query when the NextToken parameter is used in the query. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
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
