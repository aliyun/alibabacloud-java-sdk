// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionBlackDevicesRequest extends TeaModel {
    @NameInMap("DeviceIds")
    public String deviceIds;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("VersionType")
    public String versionType;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("DeviceIdType")
    public String deviceIdType;

    public static DeleteVersionBlackDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionBlackDevicesRequest self = new DeleteVersionBlackDevicesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVersionBlackDevicesRequest setDeviceIds(String deviceIds) {
        this.deviceIds = deviceIds;
        return this;
    }
    public String getDeviceIds() {
        return this.deviceIds;
    }

    public DeleteVersionBlackDevicesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteVersionBlackDevicesRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

    public DeleteVersionBlackDevicesRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public DeleteVersionBlackDevicesRequest setDeviceIdType(String deviceIdType) {
        this.deviceIdType = deviceIdType;
        return this;
    }
    public String getDeviceIdType() {
        return this.deviceIdType;
    }

}
