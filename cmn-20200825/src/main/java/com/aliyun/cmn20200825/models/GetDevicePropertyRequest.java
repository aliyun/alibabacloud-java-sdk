// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDevicePropertyRequest extends TeaModel {
    @NameInMap("DeviceFormId")
    public String deviceFormId;

    @NameInMap("DevicePropertyId")
    public String devicePropertyId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PropertyKey")
    public String propertyKey;

    public static GetDevicePropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDevicePropertyRequest self = new GetDevicePropertyRequest();
        return TeaModel.build(map, self);
    }

    public GetDevicePropertyRequest setDeviceFormId(String deviceFormId) {
        this.deviceFormId = deviceFormId;
        return this;
    }
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    public GetDevicePropertyRequest setDevicePropertyId(String devicePropertyId) {
        this.devicePropertyId = devicePropertyId;
        return this;
    }
    public String getDevicePropertyId() {
        return this.devicePropertyId;
    }

    public GetDevicePropertyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDevicePropertyRequest setPropertyKey(String propertyKey) {
        this.propertyKey = propertyKey;
        return this;
    }
    public String getPropertyKey() {
        return this.propertyKey;
    }

}
