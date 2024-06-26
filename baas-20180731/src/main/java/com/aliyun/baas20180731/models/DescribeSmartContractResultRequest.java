// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeSmartContractResultRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static DescribeSmartContractResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartContractResultRequest self = new DescribeSmartContractResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSmartContractResultRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
