// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateVersionTestRequest extends TeaModel {
    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    @NameInMap("Description")
    public String description;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("VersionType")
    public String versionType;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectId")
    public String projectId;

    public static CreateVersionTestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVersionTestRequest self = new CreateVersionTestRequest();
        return TeaModel.build(map, self);
    }

    public CreateVersionTestRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    public CreateVersionTestRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVersionTestRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public CreateVersionTestRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

    public CreateVersionTestRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVersionTestRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
