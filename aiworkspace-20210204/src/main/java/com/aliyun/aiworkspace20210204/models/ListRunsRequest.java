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
     * <p>The time when the instance was created. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ss.sssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-30T12:51:33.028Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The labels of the task for exact matching. Supported formats:</p>
     * <ul>
     * <li>Single-label query: &quot;is_evaluation:true&quot;</li>
     * <li>Multi-label scenario (not recommended for common scenarios due to potential performance issues): &quot;is_evaluation:true,LLM_evaluation:true&quot;. Use commas (,) to separate multiple labels, which means all specified label key-value pairs must be matched at the same time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>is_evaluation:true</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The maximum number of results to return for the request. Default value: 10.</p>
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
     * <p>Specifies the sorting of the specified field during a paged query. This parameter is used together with SortBy for paging. Valid values:</p>
     * <ul>
     * <li>ASC: ascending order.</li>
     * <li>DESC (default): descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The list of strings that specify the sort order. Supported fields for sorting include GmtCreateTime and Name. The sort orders include DESC and ASC. Default value: ASC. You can specify multiple fields and separate them with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime DESC,Name ASC</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The current page number. Valid values: integers greater than 0. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The pagination token. The value starts from 0. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageToken")
    public Long pageToken;

    /**
     * <p>The name of the field used for sorting. Valid values:</p>
     * <ul>
     * <li>Name: the name of the run.</li>
     * <li>GmtCreateTime (default): the time when the run was created.</li>
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
     * <li>true: Displays detailed information.</li>
     * <li>false (default): Does not display detailed information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    /**
     * <p>The ID of the workspace to which the experiment belongs. For more information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>. If you do not specify the workspace ID, the system returns the runs in the default workspace.</p>
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
