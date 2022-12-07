// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class RerunJobsRequest extends TeaModel {
    @NameInMap("Async")
    public Boolean async;

    @NameInMap("ClusterId")
    public String clusterId;

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
