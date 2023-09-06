// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateMeetingRoomGroupShrinkRequest extends TeaModel {
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("ParentGroupId")
    public Long parentGroupId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static CreateMeetingRoomGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMeetingRoomGroupShrinkRequest self = new CreateMeetingRoomGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMeetingRoomGroupShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateMeetingRoomGroupShrinkRequest setParentGroupId(Long parentGroupId) {
        this.parentGroupId = parentGroupId;
        return this;
    }
    public Long getParentGroupId() {
        return this.parentGroupId;
    }

    public CreateMeetingRoomGroupShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
