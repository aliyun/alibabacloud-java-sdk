// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CoachCallRequest extends TeaModel {
    /**
     * <p>Agent ID being coached.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>coached-agent@ccc-test</p>
     */
    @NameInMap("CoachedUserId")
    public String coachedUserId;

    /**
     * <p>Device ID. This field is meaningless and can be filled with any value.</p>
     * 
     * <strong>example:</strong>
     * <p>device</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Call ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-65382141036853491</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>Coaching timeout. If the coaching session is not established within the specified time, the coaching operation is canceled. This field is optional and defaults to 30 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    /**
     * <p>Agent ID initiating the coaching.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
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
