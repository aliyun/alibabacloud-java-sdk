// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class MonitorCallRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("MonitoredUserId")
    public String monitoredUserId;

    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    public static MonitorCallRequest build(java.util.Map<String, ?> map) throws Exception {
        MonitorCallRequest self = new MonitorCallRequest();
        return TeaModel.build(map, self);
    }

    public MonitorCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public MonitorCallRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public MonitorCallRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
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

}
