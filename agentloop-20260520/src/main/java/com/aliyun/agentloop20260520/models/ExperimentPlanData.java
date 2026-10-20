// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ExperimentPlanData extends TeaModel {
    /**
     * <p>The creation time, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1767225600000</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>The ID of the associated dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset-123456</p>
     */
    @NameInMap("datasetId")
    public String datasetId;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Customer service Q&amp;A offline evaluation plan</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The number of experiment executions under this plan.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("experimentCount")
    public Integer experimentCount;

    /**
     * <p>The experiment type: offline (offline experiment) or online (online experiment).</p>
     * 
     * <strong>example:</strong>
     * <p>offline</p>
     */
    @NameInMap("experimentType")
    public String experimentType;

    /**
     * <p>The name of the associated data processing pipeline. This field is empty if no pipeline is associated. After a pipeline is associated, when an experiment under this plan completes and writes experiment results to the Logstore, the system filters by the traceId of the current experiment trace and calls PreviewPipeline to write the results processed by the pipeline.</p>
     * 
     * <strong>example:</strong>
     * <p>trace-process-pipeline</p>
     */
    @NameInMap("pipelineName")
    public String pipelineName;

    /**
     * <p>The experiment plan ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exp-plan-e95bff54685a4ae29ff3a834c1008a71</p>
     */
    @NameInMap("planId")
    public String planId;

    /**
     * <p>The experiment plan name.</p>
     * 
     * <strong>example:</strong>
     * <p>customer-service-eval</p>
     */
    @NameInMap("planName")
    public String planName;

    /**
     * <p>The custom query SQL clause in dataset-partial mode.</p>
     * 
     * <strong>example:</strong>
     * <p>level &gt; 2</p>
     */
    @NameInMap("querySql")
    public String querySql;

    /**
     * <p>The status: pending, running, or stopped.</p>
     * 
     * <strong>example:</strong>
     * <p>pending</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The update time, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1767229200000</p>
     */
    @NameInMap("updatedAt")
    public Long updatedAt;

    public static ExperimentPlanData build(java.util.Map<String, ?> map) throws Exception {
        ExperimentPlanData self = new ExperimentPlanData();
        return TeaModel.build(map, self);
    }

    public ExperimentPlanData setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public ExperimentPlanData setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public ExperimentPlanData setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ExperimentPlanData setExperimentCount(Integer experimentCount) {
        this.experimentCount = experimentCount;
        return this;
    }
    public Integer getExperimentCount() {
        return this.experimentCount;
    }

    public ExperimentPlanData setExperimentType(String experimentType) {
        this.experimentType = experimentType;
        return this;
    }
    public String getExperimentType() {
        return this.experimentType;
    }

    public ExperimentPlanData setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }
    public String getPipelineName() {
        return this.pipelineName;
    }

    public ExperimentPlanData setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public ExperimentPlanData setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public ExperimentPlanData setQuerySql(String querySql) {
        this.querySql = querySql;
        return this;
    }
    public String getQuerySql() {
        return this.querySql;
    }

    public ExperimentPlanData setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ExperimentPlanData setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
