// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StopJobsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Jobs")
    public String jobs;

    public static StopJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        StopJobsRequest self = new StopJobsRequest();
        return TeaModel.build(map, self);
    }

    public StopJobsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public StopJobsRequest setJobs(String jobs) {
        this.jobs = jobs;
        return this;
    }
    public String getJobs() {
        return this.jobs;
    }

}
