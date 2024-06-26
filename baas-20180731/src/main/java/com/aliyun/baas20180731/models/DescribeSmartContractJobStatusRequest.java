// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeSmartContractJobStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static DescribeSmartContractJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartContractJobStatusRequest self = new DescribeSmartContractJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSmartContractJobStatusRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
