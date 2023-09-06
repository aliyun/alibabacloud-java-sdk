// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomShrinkRequest extends TeaModel {
    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static QueryMeetingRoomShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeetingRoomShrinkRequest self = new QueryMeetingRoomShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeetingRoomShrinkRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public QueryMeetingRoomShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
