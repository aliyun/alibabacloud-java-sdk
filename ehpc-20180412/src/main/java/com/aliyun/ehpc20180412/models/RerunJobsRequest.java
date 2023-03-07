// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class RerunJobsRequest extends TeaModel {
    /**
     * <p>Specifies whether to use an asynchronous link to rerun the job.</p>
     * <br>
     * <p>Default value: false</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The list of jobs that you want to run. Maximum number of jobs: 100. Minimum number of jobs: 1.</p>
     * <br>
     * <p>Format: `[{"Id": "0.sched****"},{"Id": "1.sched****"}]`. Separate multiple jobs with commas (,).</p>
     * <br>
     * <p>You can call the [ListJobs](~~87251~~) operation to query the job ID.</p>
     * <br>
     * <p>>  You can rerun only jobs that are in the RUNNING or QUEUED state.</p>
     */
    @NameInMap("Jobs")
    public String jobs;

    public static RerunJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        RerunJobsRequest self = new RerunJobsRequest();
        return TeaModel.build(map, self);
    }

    public RerunJobsRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public RerunJobsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RerunJobsRequest setJobs(String jobs) {
        this.jobs = jobs;
        return this;
    }
    public String getJobs() {
        return this.jobs;
    }

}
