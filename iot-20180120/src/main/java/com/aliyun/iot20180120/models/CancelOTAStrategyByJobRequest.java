// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CancelOTAStrategyByJobRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("JobId")
    @Validation(required = true)
    public String jobId;

    public static CancelOTAStrategyByJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelOTAStrategyByJobRequest self = new CancelOTAStrategyByJobRequest();
        return TeaModel.build(map, self);
    }

    public CancelOTAStrategyByJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CancelOTAStrategyByJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
