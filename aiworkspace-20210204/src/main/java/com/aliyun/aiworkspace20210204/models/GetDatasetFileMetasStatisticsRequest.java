// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetFileMetasStatisticsRequest extends TeaModel {
    /**
     * <p>The metadata field used for statistical aggregation. The value is not case-sensitive. If you do not specify this parameter, the total number of file metadata entries in the dataset is returned, and the aggregation list is not returned.
     * Valid values:</p>
     * <ul>
     * <li><p>filedir: The directory path of the file.</p>
     * </li>
     * <li><p>filetype: The file type.</p>
     * </li>
     * <li><p>tags.user: Custom user tags.</p>
     * </li>
     * <li><p>tags.user-delete-ai-tags: Algorithm tags deleted by the user.</p>
     * </li>
     * <li><p>tags.ai: Algorithm tags that are aggregated from all labeling tasks.</p>
     * </li>
     * <li><p>tags.all: A combination of algorithm tags and custom user tags, excluding any algorithm tags deleted by the user.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>filedir</p>
     */
    @NameInMap("AggregateBy")
    public String aggregateBy;

    /**
     * <p>The name of the dataset version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DatasetVersion")
    public String datasetVersion;

    /**
     * <p>The maximum number of results to return for each query that uses the NextToken parameter. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The workspace ID. For more information about how to obtain a workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
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
