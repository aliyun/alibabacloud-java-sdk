// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class AddVersionWhiteDevicesByDeviceGroupsRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("VersionType")
    public String versionType;

    @NameInMap("GroupIds")
    public String groupIds;

    @NameInMap("VersionId")
    public String versionId;

    public static AddVersionWhiteDevicesByDeviceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVersionWhiteDevicesByDeviceGroupsRequest self = new AddVersionWhiteDevicesByDeviceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public AddVersionWhiteDevicesByDeviceGroupsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AddVersionWhiteDevicesByDeviceGroupsRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

    public AddVersionWhiteDevicesByDeviceGroupsRequest setGroupIds(String groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public String getGroupIds() {
        return this.groupIds;
    }

    public AddVersionWhiteDevicesByDeviceGroupsRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
