// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeNodeToolExecutionHistoryRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DcId")
    public String dcId;

    @NameInMap("JobId")
    public String jobId;

    public static DescribeNodeToolExecutionHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeToolExecutionHistoryRequest self = new DescribeNodeToolExecutionHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNodeToolExecutionHistoryRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeNodeToolExecutionHistoryRequest setDcId(String dcId) {
        this.dcId = dcId;
        return this;
    }
    public String getDcId() {
        return this.dcId;
    }

    public DescribeNodeToolExecutionHistoryRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
