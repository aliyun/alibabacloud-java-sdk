// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMeetingRoomGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("TenantContext")
    public QueryMeetingRoomGroupRequestTenantContext tenantContext;

    public static QueryMeetingRoomGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMeetingRoomGroupRequest self = new QueryMeetingRoomGroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryMeetingRoomGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryMeetingRoomGroupRequest setTenantContext(QueryMeetingRoomGroupRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryMeetingRoomGroupRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class QueryMeetingRoomGroupRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryMeetingRoomGroupRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryMeetingRoomGroupRequestTenantContext self = new QueryMeetingRoomGroupRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryMeetingRoomGroupRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
