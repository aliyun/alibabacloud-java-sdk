// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class StopJobsShrinkRequest extends TeaModel {
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
     * <p>The IDs of the jobs that you want to stop.</p>
     */
    @NameInMap("JobIds")
    public String jobIdsShrink;

    public static StopJobsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StopJobsShrinkRequest self = new StopJobsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StopJobsShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public StopJobsShrinkRequest setJobIdsShrink(String jobIdsShrink) {
        this.jobIdsShrink = jobIdsShrink;
        return this;
    }
    public String getJobIdsShrink() {
        return this.jobIdsShrink;
    }

}
