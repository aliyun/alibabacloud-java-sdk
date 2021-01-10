// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class AddVersionBlackDevicesRequest extends TeaModel {
    @NameInMap("DeviceIds")
    public String deviceIds;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("VersionType")
    public String versionType;

    @NameInMap("DeviceIdType")
    public String deviceIdType;

    @NameInMap("VersionId")
    public String versionId;

    public static AddVersionBlackDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVersionBlackDevicesRequest self = new AddVersionBlackDevicesRequest();
        return TeaModel.build(map, self);
    }

    public AddVersionBlackDevicesRequest setDeviceIds(String deviceIds) {
        this.deviceIds = deviceIds;
        return this;
    }
    public String getDeviceIds() {
        return this.deviceIds;
    }

    public AddVersionBlackDevicesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AddVersionBlackDevicesRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

    public AddVersionBlackDevicesRequest setDeviceIdType(String deviceIdType) {
        this.deviceIdType = deviceIdType;
        return this;
    }
    public String getDeviceIdType() {
        return this.deviceIdType;
    }

    public AddVersionBlackDevicesRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
