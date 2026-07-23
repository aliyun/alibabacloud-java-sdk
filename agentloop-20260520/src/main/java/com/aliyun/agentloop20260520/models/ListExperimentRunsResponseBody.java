// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListExperimentRunsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>Optional.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJwYWdlIjoxfQ==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The current page number.</p>
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
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The list of experiment run records.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;recordId&quot;: &quot;exp-run-f6d419b0ed3d43a7b585948a55efc07b&quot;, &quot;experimentPlanId&quot;: &quot;exp-plan-0242d983f5d340fd8479cf2c19eb279e&quot;, &quot;recordName&quot;: &quot;arms_agent_experiment 2026/07/22 20:02:55&quot;, &quot;planName&quot;: &quot;arms_agent_experiment&quot;, &quot;status&quot;: &quot;evaluating&quot;, &quot;progress&quot;: 100.0, &quot;totalTasks&quot;: 40, &quot;completedTasks&quot;: 40, &quot;failedTasks&quot;: 0, &quot;dataSourceType&quot;: &quot;dataset-full&quot;, &quot;datasetId&quot;: &quot;arms_customer_agent_level1&quot;, &quot;modelNames&quot;: [&quot;qwen3.7-plus&quot;, &quot;qwen3.7-max&quot;], &quot;evaluationTaskId&quot;: &quot;eval-task-6bec93bfa03740dd86ce2bf1496e65fb&quot;, &quot;executedAt&quot;: 1784721775379, &quot;completedAt&quot;: 1784721811392}, {&quot;recordId&quot;: &quot;a5397261-6e6d-4e45-bf52-feb8686f7524&quot;, &quot;experimentPlanId&quot;: &quot;exp-plan-e95bff54685a4ae29ff3a834c1008a71&quot;, &quot;recordName&quot;: &quot;rca_benchmark_eval_experiment 2026/07/22 19:23:59&quot;, &quot;planName&quot;: &quot;rca_benchmark_eval_experiment&quot;, &quot;status&quot;: &quot;completed&quot;, &quot;progress&quot;: 100.0, &quot;totalTasks&quot;: 20, &quot;completedTasks&quot;: 20, &quot;failedTasks&quot;: 0, &quot;dataSourceType&quot;: &quot;dataset-full&quot;, &quot;datasetId&quot;: &quot;rca_benckmark_eval&quot;, &quot;modelNames&quot;: [], &quot;evaluationTaskId&quot;: &quot;eval-task-b1395b3bdf3e4dc994d7dcde7a66da45&quot;, &quot;executedAt&quot;: 1784719439255, &quot;completedAt&quot;: 1784719989371}]</p>
     */
    @NameInMap("records")
    public java.util.List<ExperimentRecord> records;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3FE4CD1E-FF41-56BE-B590-7A021D9C1524</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListExperimentRunsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentRunsResponseBody self = new ListExperimentRunsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExperimentRunsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExperimentRunsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExperimentRunsResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListExperimentRunsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListExperimentRunsResponseBody setRecords(java.util.List<ExperimentRecord> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ExperimentRecord> getRecords() {
        return this.records;
    }

    public ListExperimentRunsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExperimentRunsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
