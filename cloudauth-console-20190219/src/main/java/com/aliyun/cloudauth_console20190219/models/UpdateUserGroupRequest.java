// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class UpdateUserGroupRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("ProjectId")
    public String projectId;

    public static UpdateUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserGroupRequest self = new UpdateUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserGroupRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateUserGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public UpdateUserGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateUserGroupRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
