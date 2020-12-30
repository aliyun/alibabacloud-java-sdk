// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DeleteUserGroupRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("ProjectId")
    public String projectId;

    public static DeleteUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserGroupRequest self = new DeleteUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserGroupRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeleteUserGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DeleteUserGroupRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
