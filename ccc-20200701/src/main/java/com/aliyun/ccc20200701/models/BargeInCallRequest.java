// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class BargeInCallRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("BargedUserId")
    public String bargedUserId;

    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    public static BargeInCallRequest build(java.util.Map<String, ?> map) throws Exception {
        BargeInCallRequest self = new BargeInCallRequest();
        return TeaModel.build(map, self);
    }

    public BargeInCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BargeInCallRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public BargeInCallRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public BargeInCallRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public BargeInCallRequest setBargedUserId(String bargedUserId) {
        this.bargedUserId = bargedUserId;
        return this;
    }
    public String getBargedUserId() {
        return this.bargedUserId;
    }

    public BargeInCallRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

}
