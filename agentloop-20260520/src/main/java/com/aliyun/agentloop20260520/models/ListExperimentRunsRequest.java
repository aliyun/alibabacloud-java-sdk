// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListExperimentRunsRequest extends TeaModel {
    /**
     * <p>Filters results by exact dataset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>arms_customer_agent_level1</p>
     */
    @NameInMap("datasetId")
    public String datasetId;

    /**
     * <p>Filters results by fuzzy match on the experiment configuration name.</p>
     * 
     * <strong>example:</strong>
     * <p>experimentA</p>
     */
    @NameInMap("experimentName")
    public String experimentName;

    /**
     * <p>Optional. Use <code>page</code> and <code>pageSize</code> for pagination instead.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>Optional. Use <code>page</code> and <code>pageSize</code> for pagination instead.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJwYWdlIjoxfQ==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The page number, starting from 0. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Filters results by fuzzy match on experiment plan name.</p>
     * 
     * <strong>example:</strong>
     * <p>arms_agent_experiment</p>
     */
    @NameInMap("planName")
    public String planName;

    /**
     * <p>Filters results by status.</p>
     * 
     * <strong>example:</strong>
     * <p>evaluating</p>
     */
    @NameInMap("status")
    public String status;

    public static ListExperimentRunsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentRunsRequest self = new ListExperimentRunsRequest();
        return TeaModel.build(map, self);
    }

    public ListExperimentRunsRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public ListExperimentRunsRequest setExperimentName(String experimentName) {
        this.experimentName = experimentName;
        return this;
    }
    public String getExperimentName() {
        return this.experimentName;
    }

    public ListExperimentRunsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExperimentRunsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExperimentRunsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListExperimentRunsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListExperimentRunsRequest setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public ListExperimentRunsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
