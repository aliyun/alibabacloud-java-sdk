// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class KillSemanticJobRequest extends TeaModel {
    /**
     * <p>The executor job ID of the run to stop. Use the Data.ExecutorJobId value from the RunSemanticJob response or the ExecutorJobId value from a ListSemanticJobRuns record.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exec-job-demo</p>
     */
    @NameInMap("ExecutorJobId")
    public String executorJobId;

    /**
     * <p>The ID of the DataWorks workspace to which the job belongs. Use the ProjectId value from the CreateSemanticJob response or a ListSemanticJobs list item.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The number of retries when sending the stop request to the executor. This parameter is typically optional. If specified, use a non-negative integer. After the call, confirm the final status by calling GetSemanticJobDetail.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RetryTimes")
    public Integer retryTimes;

    public static KillSemanticJobRequest build(java.util.Map<String, ?> map) throws Exception {
        KillSemanticJobRequest self = new KillSemanticJobRequest();
        return TeaModel.build(map, self);
    }

    public KillSemanticJobRequest setExecutorJobId(String executorJobId) {
        this.executorJobId = executorJobId;
        return this;
    }
    public String getExecutorJobId() {
        return this.executorJobId;
    }

    public KillSemanticJobRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public KillSemanticJobRequest setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }
    public Integer getRetryTimes() {
        return this.retryTimes;
    }

}
