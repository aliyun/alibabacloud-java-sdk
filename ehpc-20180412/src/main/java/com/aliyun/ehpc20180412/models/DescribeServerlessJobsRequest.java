// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeServerlessJobsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("JobIds")
    public java.util.List<String> jobIds;

    public static DescribeServerlessJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerlessJobsRequest self = new DescribeServerlessJobsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServerlessJobsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeServerlessJobsRequest setJobIds(java.util.List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public java.util.List<String> getJobIds() {
        return this.jobIds;
    }

}
