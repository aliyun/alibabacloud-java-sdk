// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDevicePropertyRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("DevicePropertyId")
    public String devicePropertyId;

    // 属性主键
    @NameInMap("PropertyKey")
    public String propertyKey;

    // 设备形态ID
    @NameInMap("DeviceFormId")
    public String deviceFormId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDevicePropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDevicePropertyRequest self = new GetDevicePropertyRequest();
        return TeaModel.build(map, self);
    }

    public GetDevicePropertyRequest setDevicePropertyId(String devicePropertyId) {
        this.devicePropertyId = devicePropertyId;
        return this;
    }
    public String getDevicePropertyId() {
        return this.devicePropertyId;
    }

    public GetDevicePropertyRequest setPropertyKey(String propertyKey) {
        this.propertyKey = propertyKey;
        return this;
    }
    public String getPropertyKey() {
        return this.propertyKey;
    }

    public GetDevicePropertyRequest setDeviceFormId(String deviceFormId) {
        this.deviceFormId = deviceFormId;
        return this;
    }
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    public GetDevicePropertyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
