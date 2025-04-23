// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class RerunJobsRequest extends TeaModel {
    /**
     * <p>Specifies whether to use an asynchronous link to rerun the job.</p>
     * <p>Default value: false</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The ID of the cluster.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-sh-3VeFyR****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The list of jobs that you want to run. Maximum number of jobs: 100. Minimum number of jobs: 1.</p>
     * <p>Format: <code>[{&quot;Id&quot;: &quot;0.sched****&quot;},{&quot;Id&quot;: &quot;1.sched****&quot;}]</code>. Separate multiple jobs with commas (,).</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87251.html">ListJobs</a> operation to query the job ID.</p>
     * <blockquote>
     * <p> You can rerun only jobs that are in the RUNNING or QUEUED state.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Id&quot;:&quot;1.scheduler&quot;}]</p>
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
