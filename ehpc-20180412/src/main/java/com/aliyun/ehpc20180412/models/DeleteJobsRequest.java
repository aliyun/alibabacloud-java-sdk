// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteJobsRequest extends TeaModel {
    /**
     * <p>Specifies whether to use an asynchronous link to delete the jobs.</p>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The ID of the E-HPC cluster.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The list of jobs that you want to delete. Maximum number of jobs: 100. Minimum number of jobs: 1.</p>
     * <p>Format: <code>[{&quot;Id&quot;: &quot;0.sched****&quot;},{&quot;Id&quot;: &quot;1.sched****&quot;}]</code>. Separate multiple jobs with commas (,).</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87251.html">ListJobs</a> operation to query the job ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Id&quot;: &quot;0.sched****&quot;},{&quot;Id&quot;: &quot;1.sched****&quot;}]</p>
     */
    @NameInMap("Jobs")
    public String jobs;

    public static DeleteJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobsRequest self = new DeleteJobsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJobsRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public DeleteJobsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteJobsRequest setJobs(String jobs) {
        this.jobs = jobs;
        return this;
    }
    public String getJobs() {
        return this.jobs;
    }

}
