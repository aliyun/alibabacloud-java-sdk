// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetExperimentRunResponseBody extends TeaModel {
    /**
     * <p>The experiment run record details. Fields with null values are not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;recordId&quot;: &quot;exp-run-f6d419b0ed3d43a7b585948a55efc07b&quot;, &quot;experimentPlanId&quot;: &quot;exp-plan-0242d983f5d340fd8479cf2c19eb279e&quot;, &quot;recordName&quot;: &quot;arms_agent_experiment 2026/07/22 20:02:55&quot;, &quot;planName&quot;: &quot;arms_agent_experiment&quot;, &quot;status&quot;: &quot;evaluating&quot;, &quot;totalTasks&quot;: 40, &quot;completedTasks&quot;: 40, &quot;failedTasks&quot;: 0, &quot;progress&quot;: 100.0, &quot;executedAt&quot;: 1784721775379, &quot;completedAt&quot;: 1784721811392, &quot;dataSourceType&quot;: &quot;dataset-full&quot;, &quot;datasetId&quot;: &quot;arms_customer_agent_level1&quot;, &quot;modelNames&quot;: [&quot;qwen3.7-plus&quot;, &quot;qwen3.7-max&quot;], &quot;evaluationTaskId&quot;: &quot;eval-task-6bec93bfa03740dd86ce2bf1496e65fb&quot;}</p>
     */
    @NameInMap("record")
    public ExperimentRecord record;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3FE4CD1E-FF41-56BE-B590-7A021D9C1524</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetExperimentRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentRunResponseBody self = new GetExperimentRunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExperimentRunResponseBody setRecord(ExperimentRecord record) {
        this.record = record;
        return this;
    }
    public ExperimentRecord getRecord() {
        return this.record;
    }

    public GetExperimentRunResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetExperimentRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
