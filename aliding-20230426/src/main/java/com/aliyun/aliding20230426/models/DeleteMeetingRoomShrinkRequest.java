// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteMeetingRoomShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static DeleteMeetingRoomShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMeetingRoomShrinkRequest self = new DeleteMeetingRoomShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMeetingRoomShrinkRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public DeleteMeetingRoomShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
