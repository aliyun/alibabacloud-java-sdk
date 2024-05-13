// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CoachCallRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CoachedUserId")
    public String coachedUserId;

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

    public static CoachCallRequest build(java.util.Map<String, ?> map) throws Exception {
        CoachCallRequest self = new CoachCallRequest();
        return TeaModel.build(map, self);
    }

    public CoachCallRequest setCoachedUserId(String coachedUserId) {
        this.coachedUserId = coachedUserId;
        return this;
    }
    public String getCoachedUserId() {
        return this.coachedUserId;
    }

    public CoachCallRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CoachCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CoachCallRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CoachCallRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public CoachCallRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
