// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class BargeInCallRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BargedUserId")
    public String bargedUserId;

    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    @NameInMap("UserId")
    public String userId;

    public static BargeInCallRequest build(java.util.Map<String, ?> map) throws Exception {
        BargeInCallRequest self = new BargeInCallRequest();
        return TeaModel.build(map, self);
    }

    public BargeInCallRequest setBargedUserId(String bargedUserId) {
        this.bargedUserId = bargedUserId;
        return this;
    }
    public String getBargedUserId() {
        return this.bargedUserId;
    }

    public BargeInCallRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public BargeInCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BargeInCallRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public BargeInCallRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public BargeInCallRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
