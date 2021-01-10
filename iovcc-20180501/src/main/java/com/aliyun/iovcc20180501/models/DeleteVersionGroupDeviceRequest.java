// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionGroupDeviceRequest extends TeaModel {
    @NameInMap("DeviceIds")
    public String deviceIds;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    @NameInMap("DeviceIdType")
    public String deviceIdType;

    public static DeleteVersionGroupDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionGroupDeviceRequest self = new DeleteVersionGroupDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVersionGroupDeviceRequest setDeviceIds(String deviceIds) {
        this.deviceIds = deviceIds;
        return this;
    }
    public String getDeviceIds() {
        return this.deviceIds;
    }

    public DeleteVersionGroupDeviceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteVersionGroupDeviceRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    public DeleteVersionGroupDeviceRequest setDeviceIdType(String deviceIdType) {
        this.deviceIdType = deviceIdType;
        return this;
    }
    public String getDeviceIdType() {
        return this.deviceIdType;
    }

}
