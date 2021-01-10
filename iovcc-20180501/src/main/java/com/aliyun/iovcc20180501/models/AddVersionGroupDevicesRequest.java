// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class AddVersionGroupDevicesRequest extends TeaModel {
    @NameInMap("DeviceIdType")
    public String deviceIdType;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("DeviceIds")
    public String deviceIds;

    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    public static AddVersionGroupDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVersionGroupDevicesRequest self = new AddVersionGroupDevicesRequest();
        return TeaModel.build(map, self);
    }

    public AddVersionGroupDevicesRequest setDeviceIdType(String deviceIdType) {
        this.deviceIdType = deviceIdType;
        return this;
    }
    public String getDeviceIdType() {
        return this.deviceIdType;
    }

    public AddVersionGroupDevicesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AddVersionGroupDevicesRequest setDeviceIds(String deviceIds) {
        this.deviceIds = deviceIds;
        return this;
    }
    public String getDeviceIds() {
        return this.deviceIds;
    }

    public AddVersionGroupDevicesRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

}
