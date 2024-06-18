// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateMeetingRoomGroupShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>172</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>测试分组</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static UpdateMeetingRoomGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeetingRoomGroupShrinkRequest self = new UpdateMeetingRoomGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeetingRoomGroupShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateMeetingRoomGroupShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateMeetingRoomGroupShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
