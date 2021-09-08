// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDeviceDistributeJobRequest extends TeaModel {
    @NameInMap("JobId")
    @Validation(required = true)
    public String jobId;

    public static DeleteDeviceDistributeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceDistributeJobRequest self = new DeleteDeviceDistributeJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceDistributeJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
