// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListRunsRequest extends TeaModel {
    /**
     * <p>The ID of the experiment to which the run belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>exp-1zpfthdx******</p>
     */
    @NameInMap("ExperimentId")
    public String experimentId;

    /**
     * <p>The time when the instance was created. The time follows the ISO 8601 standard in UTC. Format: YYYY-MM-DDTHH:mm:ss.sssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-30T12:51:33.028Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The labels of the task for exact match. Supported formats:</p>
     * <ul>
     * <li>Single-label query: &quot;is_evaluation:true&quot;</li>
     * <li>Multi-label scenario (not recommended except in special cases due to potential performance issues): &quot;is_evaluation:true,LLM_evaluation:true&quot; separated by commas (,), indicating that multiple label key-value pairs must all match.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>is_evaluation:true</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The maximum number of results to return. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The run name.</p>
     * 
     * <strong>example:</strong>
     * <p>myName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sorting order for the specified field in a paging query. Used together with SortBy. Valid values:</p>
     * <ul>
     * <li>ASC: Ascending order.</li>
     * <li>DESC (default): Descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>A comma-separated list of sorting strings. Supported fields: GmtCreateTime and Name. Supported sorting orders: DESC and ASC. Default: ASC. Separate multiple fields with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime DESC,Name ASC</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number. Valid values: greater than 0. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The pagination token. Starts from 0. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageToken")
    public Long pageToken;

    /**
     * <p>The field used for sorting. Valid values:</p>
     * <ul>
     * <li>Name: The run name.</li>
     * <li>GmtCreateTime (default): The run creation time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The ID of the PAI workload associated with the run.</p>
     * 
     * <strong>example:</strong>
     * <p>job-rbvg5wzlj****</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The type of the PAI workload associated with the run.</p>
     * 
     * <strong>example:</strong>
     * <p>TrainingService</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>Specifies whether to display detailed information, including Metrics, Params, and Labels. Valid values:</p>
     * <ul>
     * <li>true: Detailed information is displayed.</li>
     * <li>false (default): Detailed information is not displayed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    /**
     * <p>The ID of the workspace where the experiment resides. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
     * <blockquote>
     * <p>If you do not specify a workspace ID, the system returns the run list of the default workspace.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>228**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListRunsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRunsRequest self = new ListRunsRequest();
        return TeaModel.build(map, self);
    }

    public ListRunsRequest setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public ListRunsRequest setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public ListRunsRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public ListRunsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListRunsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListRunsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListRunsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListRunsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListRunsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRunsRequest setPageToken(Long pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public Long getPageToken() {
        return this.pageToken;
    }

    public ListRunsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListRunsRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ListRunsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ListRunsRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

    public ListRunsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
