// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class AddVersionWhiteDevicesRequest extends TeaModel {
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

    public static AddVersionWhiteDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVersionWhiteDevicesRequest self = new AddVersionWhiteDevicesRequest();
        return TeaModel.build(map, self);
    }

    public AddVersionWhiteDevicesRequest setDeviceIds(String deviceIds) {
        this.deviceIds = deviceIds;
        return this;
    }
    public String getDeviceIds() {
        return this.deviceIds;
    }

    public AddVersionWhiteDevicesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AddVersionWhiteDevicesRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

    public AddVersionWhiteDevicesRequest setDeviceIdType(String deviceIdType) {
        this.deviceIdType = deviceIdType;
        return this;
    }
    public String getDeviceIdType() {
        return this.deviceIdType;
    }

    public AddVersionWhiteDevicesRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
