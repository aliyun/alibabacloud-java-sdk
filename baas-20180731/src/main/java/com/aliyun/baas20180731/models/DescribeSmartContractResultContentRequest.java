// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeSmartContractResultContentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static DescribeSmartContractResultContentRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartContractResultContentRequest self = new DescribeSmartContractResultContentRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSmartContractResultContentRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
