// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class BargeInCallRequest extends TeaModel {
    /**
     * <p>Agent ID whose call was barged in on.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent2@ccc-test</p>
     */
    @NameInMap("BargedUserId")
    public String bargedUserId;

    /**
     * <p>Device ID. This parameter is meaningless and can be filled in with any value.</p>
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
     * <p>job-6538214103685****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>Timeout for force insert, in seconds. If the force insert operation does not succeed within the specified time, it is canceled. Normally, the force insert operation succeeds immediately. The timeout setting is provided to handle abnormal scenarios. This field is optional and defaults to 30 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    /**
     * <p>Agent ID initiating the force insert.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
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
