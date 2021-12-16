// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CancelAttendedTransferRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("UserId")
    public String userId;

    public static CancelAttendedTransferRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAttendedTransferRequest self = new CancelAttendedTransferRequest();
        return TeaModel.build(map, self);
    }

    public CancelAttendedTransferRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CancelAttendedTransferRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CancelAttendedTransferRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CancelAttendedTransferRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
