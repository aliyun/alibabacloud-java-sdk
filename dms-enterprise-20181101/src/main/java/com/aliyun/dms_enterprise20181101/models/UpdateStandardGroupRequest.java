// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateStandardGroupRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("Tid")
    public Long tid;

    public static UpdateStandardGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStandardGroupRequest self = new UpdateStandardGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStandardGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateStandardGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public UpdateStandardGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateStandardGroupRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
