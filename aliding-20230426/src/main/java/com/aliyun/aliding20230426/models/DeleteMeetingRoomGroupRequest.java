// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteMeetingRoomGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("TenantContext")
    public DeleteMeetingRoomGroupRequestTenantContext tenantContext;

    public static DeleteMeetingRoomGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMeetingRoomGroupRequest self = new DeleteMeetingRoomGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMeetingRoomGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteMeetingRoomGroupRequest setTenantContext(DeleteMeetingRoomGroupRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public DeleteMeetingRoomGroupRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class DeleteMeetingRoomGroupRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static DeleteMeetingRoomGroupRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteMeetingRoomGroupRequestTenantContext self = new DeleteMeetingRoomGroupRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public DeleteMeetingRoomGroupRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
