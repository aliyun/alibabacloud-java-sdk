// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class SaveUserGroupRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("ProjectId")
    public String projectId;

    public static SaveUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveUserGroupRequest self = new SaveUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public SaveUserGroupRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public SaveUserGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public SaveUserGroupRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
