// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class InterceptCallRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("InterceptedUserId")
    public String interceptedUserId;

    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    public static InterceptCallRequest build(java.util.Map<String, ?> map) throws Exception {
        InterceptCallRequest self = new InterceptCallRequest();
        return TeaModel.build(map, self);
    }

    public InterceptCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InterceptCallRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public InterceptCallRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public InterceptCallRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public InterceptCallRequest setInterceptedUserId(String interceptedUserId) {
        this.interceptedUserId = interceptedUserId;
        return this;
    }
    public String getInterceptedUserId() {
        return this.interceptedUserId;
    }

    public InterceptCallRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

}
