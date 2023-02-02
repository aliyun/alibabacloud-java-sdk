// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeJobRequest extends TeaModel {
    @NameInMap("Async")
    public Boolean async;

    @NameInMap("ClusterId")
    public String clusterId;

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
