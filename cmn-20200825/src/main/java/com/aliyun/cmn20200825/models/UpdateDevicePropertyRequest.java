// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDevicePropertyRequest extends TeaModel {
    @NameInMap("DevicePropertyId")
    public String devicePropertyId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PropertyContent")
    public String propertyContent;

    @NameInMap("PropertyFormat")
    public String propertyFormat;

    @NameInMap("PropertyName")
    public String propertyName;

    public static UpdateDevicePropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevicePropertyRequest self = new UpdateDevicePropertyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDevicePropertyRequest setDevicePropertyId(String devicePropertyId) {
        this.devicePropertyId = devicePropertyId;
        return this;
    }
    public String getDevicePropertyId() {
        return this.devicePropertyId;
    }

    public UpdateDevicePropertyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDevicePropertyRequest setPropertyContent(String propertyContent) {
        this.propertyContent = propertyContent;
        return this;
    }
    public String getPropertyContent() {
        return this.propertyContent;
    }

    public UpdateDevicePropertyRequest setPropertyFormat(String propertyFormat) {
        this.propertyFormat = propertyFormat;
        return this;
    }
    public String getPropertyFormat() {
        return this.propertyFormat;
    }

    public UpdateDevicePropertyRequest setPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }
    public String getPropertyName() {
        return this.propertyName;
    }

}
