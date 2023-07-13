// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StopServerlessJobsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("JobIds")
    public java.util.List<String> jobIds;

    public static StopServerlessJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        StopServerlessJobsRequest self = new StopServerlessJobsRequest();
        return TeaModel.build(map, self);
    }

    public StopServerlessJobsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public StopServerlessJobsRequest setJobIds(java.util.List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public java.util.List<String> getJobIds() {
        return this.jobIds;
    }

}
