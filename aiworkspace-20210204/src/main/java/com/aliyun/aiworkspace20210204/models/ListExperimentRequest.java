// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListExperimentRequest extends TeaModel {
    /**
     * <p>The filter conditions for labels. Separate multiple conditions with commas (,). A single filter condition must be in the <code>Key=Value</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>is_evaluation:true</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The maximum number of results to return. The default is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The name of the experiment.</p>
     * 
     * <strong>example:</strong>
     * <p>exp-test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Optional parameters.</p>
     */
    @NameInMap("Options")
    public ListExperimentRequestOptions options;

    /**
     * <p>The order in which to sort the results of a paged query. Valid values:</p>
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
     * <p>A list of sorting methods as strings. You can sort by the following fields: GmtCreateTime, Name, GmtModifiedTime, or ExperimentId. The sorting methods are DESC and ASC. The default is ASC.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime DESC,Name ASC</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number. Pages start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The paging token. It starts from 0. The default is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageToken")
    public Long pageToken;

    /**
     * <p>The field to use for sorting in a paged query. Currently, only the GmtCreateTime field is supported for sorting.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>Specifies whether to retrieve the LatestRun information related to the experiment.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    /**
     * <p>The ID of the workspace where the experiment resides. For more information about how to obtain a workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
     * <blockquote>
     * <p>If you do not specify a workspace ID, the system returns the list of experiments in the default workspace.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1517**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentRequest self = new ListExperimentRequest();
        return TeaModel.build(map, self);
    }

    public ListExperimentRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public ListExperimentRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListExperimentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListExperimentRequest setOptions(ListExperimentRequestOptions options) {
        this.options = options;
        return this;
    }
    public ListExperimentRequestOptions getOptions() {
        return this.options;
    }

    public ListExperimentRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListExperimentRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListExperimentRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListExperimentRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListExperimentRequest setPageToken(Long pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public Long getPageToken() {
        return this.pageToken;
    }

    public ListExperimentRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListExperimentRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

    public ListExperimentRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ListExperimentRequestOptions extends TeaModel {
        /**
         * <p>Specifies whether to perform an exact match for the name. Valid values are &quot;true&quot; and &quot;false&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("match_name_exactly")
        public String matchNameExactly;

        public static ListExperimentRequestOptions build(java.util.Map<String, ?> map) throws Exception {
            ListExperimentRequestOptions self = new ListExperimentRequestOptions();
            return TeaModel.build(map, self);
        }

        public ListExperimentRequestOptions setMatchNameExactly(String matchNameExactly) {
            this.matchNameExactly = matchNameExactly;
            return this;
        }
        public String getMatchNameExactly() {
            return this.matchNameExactly;
        }

    }

}
