// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class BlindTransferRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    @NameInMap("Transferee")
    public String transferee;

    @NameInMap("Transferor")
    public String transferor;

    @NameInMap("UserId")
    public String userId;

    public static BlindTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        BlindTransferRequest self = new BlindTransferRequest();
        return TeaModel.build(map, self);
    }

    public BlindTransferRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public BlindTransferRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BlindTransferRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public BlindTransferRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public BlindTransferRequest setTransferee(String transferee) {
        this.transferee = transferee;
        return this;
    }
    public String getTransferee() {
        return this.transferee;
    }

    public BlindTransferRequest setTransferor(String transferor) {
        this.transferor = transferor;
        return this;
    }
    public String getTransferor() {
        return this.transferor;
    }

    public BlindTransferRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
