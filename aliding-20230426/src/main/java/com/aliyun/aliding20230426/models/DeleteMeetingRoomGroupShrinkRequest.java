// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteMeetingRoomGroupShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static DeleteMeetingRoomGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMeetingRoomGroupShrinkRequest self = new DeleteMeetingRoomGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMeetingRoomGroupShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteMeetingRoomGroupShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
