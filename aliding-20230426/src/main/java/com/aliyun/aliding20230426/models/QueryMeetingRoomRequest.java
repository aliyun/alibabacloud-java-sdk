// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomRequest extends TeaModel {
    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("TenantContext")
    public QueryMeetingRoomRequestTenantContext tenantContext;

    public static QueryMeetingRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeetingRoomRequest self = new QueryMeetingRoomRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeetingRoomRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public QueryMeetingRoomRequest setTenantContext(QueryMeetingRoomRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryMeetingRoomRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class QueryMeetingRoomRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryMeetingRoomRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryMeetingRoomRequestTenantContext self = new QueryMeetingRoomRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryMeetingRoomRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
