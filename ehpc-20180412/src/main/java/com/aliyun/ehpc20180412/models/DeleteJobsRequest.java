// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteJobsRequest extends TeaModel {
    @NameInMap("Async")
    public Boolean async;

    @NameInMap("ClusterId")
    public String clusterId;

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
