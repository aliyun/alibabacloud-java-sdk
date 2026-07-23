// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListExperimentPlansResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJsYXN0SWQiOjEwMX0=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The list of experiment plan summaries.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;planId&quot;: &quot;exp-plan-e95bff54685a4ae29ff3a834c1008a71&quot;, &quot;planName&quot;: &quot;rca_benchmark_eval_experiment&quot;, &quot;experimentType&quot;: &quot;offline&quot;, &quot;description&quot;: &quot;&quot;, &quot;status&quot;: &quot;pending&quot;, &quot;datasetId&quot;: &quot;rca_benckmark_eval&quot;, &quot;querySql&quot;: &quot;&quot;, &quot;experimentCount&quot;: 5, &quot;createdAt&quot;: 1784612365000, &quot;updatedAt&quot;: 1784619562000}, {&quot;planId&quot;: &quot;exp-plan-0242d983f5d340fd8479cf2c19eb279e&quot;, &quot;planName&quot;: &quot;arms_agent_experiment&quot;, &quot;experimentType&quot;: &quot;online&quot;, &quot;description&quot;: &quot;&quot;, &quot;status&quot;: &quot;stopped&quot;, &quot;datasetId&quot;: &quot;arms_customer_agent_level1&quot;, &quot;querySql&quot;: &quot;&quot;, &quot;experimentCount&quot;: 4, &quot;createdAt&quot;: 1784257858000, &quot;updatedAt&quot;: 1784721811000}, {&quot;planId&quot;: &quot;b7f0ad3d-3765-446a-a744-ab64ab8bf386&quot;, &quot;planName&quot;: &quot;arms_customer_agent_plan&quot;, &quot;experimentType&quot;: &quot;offline&quot;, &quot;description&quot;: &quot;&quot;, &quot;status&quot;: &quot;stopped&quot;, &quot;datasetId&quot;: &quot;arms_customer_agent_level1&quot;, &quot;querySql&quot;: &quot;where \&quot;input\&quot; LIKE \&quot;%探针%\&quot;&quot;, &quot;experimentCount&quot;: 65, &quot;createdAt&quot;: 1782310430000, &quot;updatedAt&quot;: 1784692254000}]</p>
     */
    @NameInMap("plans")
    public java.util.List<ExperimentPlanData> plans;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3FE4CD1E-FF41-56BE-B590-7A021D9C1524</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of records that match the filter criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListExperimentPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentPlansResponseBody self = new ListExperimentPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExperimentPlansResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExperimentPlansResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExperimentPlansResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListExperimentPlansResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListExperimentPlansResponseBody setPlans(java.util.List<ExperimentPlanData> plans) {
        this.plans = plans;
        return this;
    }
    public java.util.List<ExperimentPlanData> getPlans() {
        return this.plans;
    }

    public ListExperimentPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExperimentPlansResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
