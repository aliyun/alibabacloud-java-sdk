// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class MonitorCallRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>device</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent2@ccc-test</p>
     */
    @NameInMap("MonitoredUserId")
    public String monitoredUserId;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    /**
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static MonitorCallRequest build(java.util.Map<String, ?> map) throws Exception {
        MonitorCallRequest self = new MonitorCallRequest();
        return TeaModel.build(map, self);
    }

    public MonitorCallRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public MonitorCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public MonitorCallRequest setMonitoredUserId(String monitoredUserId) {
        this.monitoredUserId = monitoredUserId;
        return this;
    }
    public String getMonitoredUserId() {
        return this.monitoredUserId;
    }

    public MonitorCallRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public MonitorCallRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
