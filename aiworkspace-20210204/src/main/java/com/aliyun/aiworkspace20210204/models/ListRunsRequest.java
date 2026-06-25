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
     * <p>The time when the instance was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-30T12:51:33.028Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The labels of the run for an exact match. The following formats are supported:</p>
     * <ul>
     * <li><p>Single-label query: &quot;is_evaluation:true&quot;</p>
     * </li>
     * <li><p>Multi-label query: &quot;is_evaluation:true,LLM_evaluation:true&quot;. This method is not recommended for common scenarios because it may degrade performance. Use commas (,) to separate multiple labels. The system matches all specified key-value pairs.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>is_evaluation:true</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The maximum number of results to return. The default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The name of the run.</p>
     * 
     * <strong>example:</strong>
     * <p>myName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort order for the paged query. Use this parameter with SortBy.</p>
     * <ul>
     * <li><p>ASC: ascending order.</p>
     * </li>
     * <li><p>DESC (default): descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The fields to sort by and the sort order. You can sort by GmtCreateTime and Name. Valid sort orders are DESC and ASC. The default is ASC. To sort by multiple fields, separate them with a comma (,).</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime DESC,Name ASC</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number. The value must be greater than 0. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of records to display on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The paging token. The value starts from 0. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageToken")
    public Long pageToken;

    /**
     * <p>The field to use for sorting. Valid values:</p>
     * <ul>
     * <li><p>Name: the name of the run.</p>
     * </li>
     * <li><p>GmtCreateTime (default): the time when the run was created.</p>
     * </li>
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
     * <p>Specifies whether to display details, including Metrics, Params, and Labels. Valid values:</p>
     * <ul>
     * <li><p>true: displays details.</p>
     * </li>
     * <li><p>false (default): does not display details.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    /**
     * <p>The ID of the workspace where the experiment resides. For more information about how to obtain a workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
     * <blockquote>
     * <p>If you do not specify a workspace ID, the system returns the list of runs in the default workspace.</p>
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
