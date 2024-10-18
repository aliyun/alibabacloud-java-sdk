// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class CreateJobShrinkRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The job name.</p>
     * 
     * <strong>example:</strong>
     * <p>TestJob</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The job configurations.</p>
     */
    @NameInMap("JobSpec")
    public String jobSpecShrink;

    public static CreateJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobShrinkRequest self = new CreateJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateJobShrinkRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateJobShrinkRequest setJobSpecShrink(String jobSpecShrink) {
        this.jobSpecShrink = jobSpecShrink;
        return this;
    }
    public String getJobSpecShrink() {
        return this.jobSpecShrink;
    }

}
