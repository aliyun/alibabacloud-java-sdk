// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetSemanticJobLogRequest extends TeaModel {
    /**
     * <p>The executor job ID. Use the Data.ExecutorJobId from the RunSemanticJob response or the ExecutorJobId from a ListSemanticJobRuns record.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exec-job-demo</p>
     */
    @NameInMap("ExecutorJobId")
    public String executorJobId;

    /**
     * <p>The ID of the DataWorks workspace to which the job belongs. Use the ProjectId from the CreateSemanticJob response or a ListSemanticJobs list item.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetSemanticJobLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSemanticJobLogRequest self = new GetSemanticJobLogRequest();
        return TeaModel.build(map, self);
    }

    public GetSemanticJobLogRequest setExecutorJobId(String executorJobId) {
        this.executorJobId = executorJobId;
        return this;
    }
    public String getExecutorJobId() {
        return this.executorJobId;
    }

    public GetSemanticJobLogRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
