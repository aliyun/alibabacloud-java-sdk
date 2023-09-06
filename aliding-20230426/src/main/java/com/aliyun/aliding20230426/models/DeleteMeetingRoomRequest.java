// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteMeetingRoomRequest extends TeaModel {
    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("TenantContext")
    public DeleteMeetingRoomRequestTenantContext tenantContext;

    public static DeleteMeetingRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMeetingRoomRequest self = new DeleteMeetingRoomRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMeetingRoomRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public DeleteMeetingRoomRequest setTenantContext(DeleteMeetingRoomRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public DeleteMeetingRoomRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class DeleteMeetingRoomRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static DeleteMeetingRoomRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteMeetingRoomRequestTenantContext self = new DeleteMeetingRoomRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public DeleteMeetingRoomRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
