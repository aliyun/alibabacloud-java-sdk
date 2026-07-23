// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class CreateExperimentRunRequest extends TeaModel {
    /**
     * <p>The completion time, in millisecond-level UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1784721811392</p>
     */
    @NameInMap("completedAt")
    public Long completedAt;

    /**
     * <p>The number of completed tasks. If not specified, the default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("completedTasks")
    public Integer completedTasks;

    /**
     * <p>The execution time, in millisecond-level UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1784721775379</p>
     */
    @NameInMap("executedAt")
    public Long executedAt;

    /**
     * <p>The experiment plan ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exp-plan-0242d983f5d340fd8479cf2c19eb279e</p>
     */
    @NameInMap("experimentPlanId")
    public String experimentPlanId;

    /**
     * <p>The number of failed tasks. If not specified, the default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("failedTasks")
    public Integer failedTasks;

    /**
     * <p>The list of offline experiment configurations. Required when the plan type is offline. The number of items ranges from 1 to 5.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;label&quot;: &quot;experimentA&quot;, &quot;name&quot;: &quot;experimentA&quot;}]</p>
     */
    @NameInMap("offlineExperiments")
    public java.util.List<OfflineExperimentConfig> offlineExperiments;

    /**
     * <p>The experiment record name. If not specified, the default value is the plan name plus a timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>arms_agent_experiment 2026/07/22 20:02:55</p>
     */
    @NameInMap("recordName")
    public String recordName;

    /**
     * <p>The initial status. If not specified, the default value is <code>pending</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>pending</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The total number of tasks. For online experiments, if not specified, the value is calculated based on the number of generated tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("totalTasks")
    public Integer totalTasks;

    /**
     * <p>Optional.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateExperimentRunRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentRunRequest self = new CreateExperimentRunRequest();
        return TeaModel.build(map, self);
    }

    public CreateExperimentRunRequest setCompletedAt(Long completedAt) {
        this.completedAt = completedAt;
        return this;
    }
    public Long getCompletedAt() {
        return this.completedAt;
    }

    public CreateExperimentRunRequest setCompletedTasks(Integer completedTasks) {
        this.completedTasks = completedTasks;
        return this;
    }
    public Integer getCompletedTasks() {
        return this.completedTasks;
    }

    public CreateExperimentRunRequest setExecutedAt(Long executedAt) {
        this.executedAt = executedAt;
        return this;
    }
    public Long getExecutedAt() {
        return this.executedAt;
    }

    public CreateExperimentRunRequest setExperimentPlanId(String experimentPlanId) {
        this.experimentPlanId = experimentPlanId;
        return this;
    }
    public String getExperimentPlanId() {
        return this.experimentPlanId;
    }

    public CreateExperimentRunRequest setFailedTasks(Integer failedTasks) {
        this.failedTasks = failedTasks;
        return this;
    }
    public Integer getFailedTasks() {
        return this.failedTasks;
    }

    public CreateExperimentRunRequest setOfflineExperiments(java.util.List<OfflineExperimentConfig> offlineExperiments) {
        this.offlineExperiments = offlineExperiments;
        return this;
    }
    public java.util.List<OfflineExperimentConfig> getOfflineExperiments() {
        return this.offlineExperiments;
    }

    public CreateExperimentRunRequest setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    public String getRecordName() {
        return this.recordName;
    }

    public CreateExperimentRunRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateExperimentRunRequest setTotalTasks(Integer totalTasks) {
        this.totalTasks = totalTasks;
        return this;
    }
    public Integer getTotalTasks() {
        return this.totalTasks;
    }

    public CreateExperimentRunRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
