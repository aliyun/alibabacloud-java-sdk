// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateMeetingRoomGroupRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("TenantContext")
    public UpdateMeetingRoomGroupRequestTenantContext tenantContext;

    public static UpdateMeetingRoomGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeetingRoomGroupRequest self = new UpdateMeetingRoomGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMeetingRoomGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateMeetingRoomGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateMeetingRoomGroupRequest setTenantContext(UpdateMeetingRoomGroupRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public UpdateMeetingRoomGroupRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class UpdateMeetingRoomGroupRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static UpdateMeetingRoomGroupRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateMeetingRoomGroupRequestTenantContext self = new UpdateMeetingRoomGroupRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public UpdateMeetingRoomGroupRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
