// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateMeetingRoomGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>测试分组</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>172L</p>
     */
    @NameInMap("ParentGroupId")
    public Long parentGroupId;

    @NameInMap("TenantContext")
    public CreateMeetingRoomGroupRequestTenantContext tenantContext;

    public static CreateMeetingRoomGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMeetingRoomGroupRequest self = new CreateMeetingRoomGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateMeetingRoomGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateMeetingRoomGroupRequest setParentGroupId(Long parentGroupId) {
        this.parentGroupId = parentGroupId;
        return this;
    }
    public Long getParentGroupId() {
        return this.parentGroupId;
    }

    public CreateMeetingRoomGroupRequest setTenantContext(CreateMeetingRoomGroupRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CreateMeetingRoomGroupRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class CreateMeetingRoomGroupRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static CreateMeetingRoomGroupRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CreateMeetingRoomGroupRequestTenantContext self = new CreateMeetingRoomGroupRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CreateMeetingRoomGroupRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
