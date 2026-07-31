// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DownloadSemanticResultsRequest extends TeaModel {
    /**
     * <p>The node name. Use the Data.Name value from the CreateSemanticJob response, the Name value from a ListSemanticJobs list item, or the JobName value from a ListSemanticJobRuns record.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>semantic-job-demo</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The optional run ID. If you specify the Data.JobRunId value from the RunSemanticJob response or the JobRunId value from a ListSemanticJobRuns record, only the artifacts of that specific run are returned. If you do not specify this parameter, the artifacts of the latest run of the node are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>01H00000000000000000000000</p>
     */
    @NameInMap("JobRunId")
    public String jobRunId;

    public static DownloadSemanticResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadSemanticResultsRequest self = new DownloadSemanticResultsRequest();
        return TeaModel.build(map, self);
    }

    public DownloadSemanticResultsRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public DownloadSemanticResultsRequest setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
        return this;
    }
    public String getJobRunId() {
        return this.jobRunId;
    }

}
