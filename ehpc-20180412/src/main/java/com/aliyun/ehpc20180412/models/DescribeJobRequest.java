// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeJobRequest extends TeaModel {
    /**
     * <p>Specifies whether to use an asynchronous link to stop the job.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The ID of the E-HPC cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to obtain the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The job ID.</p>
     * <br>
     * <p>You can call the [ListJobs](~~87251~~) operation to obtain the job ID.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static DescribeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobRequest self = new DescribeJobRequest();
        return TeaModel.build(map, self);
    }

    public DescribeJobRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public DescribeJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
