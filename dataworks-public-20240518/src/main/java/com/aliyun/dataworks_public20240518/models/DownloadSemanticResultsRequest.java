// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DownloadSemanticResultsRequest extends TeaModel {
    /**
     * <p>The job name. You can obtain this value from Data.Name in the CreateSemanticJob response, Name in the ListSemanticJobs response, or JobName in the ListSemanticJobRuns response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>semantic-job-demo</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The optional run ID. If you specify the JobRunId from the RunSemanticJob response (Data.JobRunId) or the ListSemanticJobRuns response, only the artifacts of the specified run are returned. If you do not specify this parameter, the artifacts of the most recent run of the job are returned.</p>
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
