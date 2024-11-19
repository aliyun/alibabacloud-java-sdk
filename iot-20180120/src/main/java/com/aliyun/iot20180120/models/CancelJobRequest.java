// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CancelJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>XUbmsMHmkqv0PiAG****010001</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static CancelJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelJobRequest self = new CancelJobRequest();
        return TeaModel.build(map, self);
    }

    public CancelJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CancelJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
