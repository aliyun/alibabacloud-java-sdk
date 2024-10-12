// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListExperimentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>is_evaluation:true</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>exp-test</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Options")
    public ListExperimentRequestOptions options;

    /**
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>GmtCreateTime DESC,Name ASC</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageToken")
    public Long pageToken;

    /**
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    /**
     * <strong>example:</strong>
     * <p>151739</p>
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
