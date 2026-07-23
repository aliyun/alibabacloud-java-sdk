// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateExperimentRunRequest extends TeaModel {
    /**
     * <p>The experiment completion time. A millisecond-level UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1784719989371</p>
     */
    @NameInMap("completedAt")
    public Long completedAt;

    /**
     * <p>The number of completed tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("completedTasks")
    public Integer completedTasks;

    /**
     * <p>The experiment execution time. A millisecond-level UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1784719439255</p>
     */
    @NameInMap("executedAt")
    public Long executedAt;

    /**
     * <p>The number of failed tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("failedTasks")
    public Integer failedTasks;

    /**
     * <p>The experiment record name.</p>
     * 
     * <strong>example:</strong>
     * <p>rca_benchmark_eval_experiment 2026/07/22 19:23:59</p>
     */
    @NameInMap("recordName")
    public String recordName;

    /**
     * <p>The experiment record status. Set to cancelled to cancel execution.</p>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The total number of tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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

    public static UpdateExperimentRunRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentRunRequest self = new UpdateExperimentRunRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentRunRequest setCompletedAt(Long completedAt) {
        this.completedAt = completedAt;
        return this;
    }
    public Long getCompletedAt() {
        return this.completedAt;
    }

    public UpdateExperimentRunRequest setCompletedTasks(Integer completedTasks) {
        this.completedTasks = completedTasks;
        return this;
    }
    public Integer getCompletedTasks() {
        return this.completedTasks;
    }

    public UpdateExperimentRunRequest setExecutedAt(Long executedAt) {
        this.executedAt = executedAt;
        return this;
    }
    public Long getExecutedAt() {
        return this.executedAt;
    }

    public UpdateExperimentRunRequest setFailedTasks(Integer failedTasks) {
        this.failedTasks = failedTasks;
        return this;
    }
    public Integer getFailedTasks() {
        return this.failedTasks;
    }

    public UpdateExperimentRunRequest setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    public String getRecordName() {
        return this.recordName;
    }

    public UpdateExperimentRunRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateExperimentRunRequest setTotalTasks(Integer totalTasks) {
        this.totalTasks = totalTasks;
        return this;
    }
    public Integer getTotalTasks() {
        return this.totalTasks;
    }

    public UpdateExperimentRunRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
