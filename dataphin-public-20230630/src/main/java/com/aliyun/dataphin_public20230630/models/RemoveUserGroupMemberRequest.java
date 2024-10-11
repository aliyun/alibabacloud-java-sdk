// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RemoveUserGroupMemberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RemoveCommand")
    public RemoveUserGroupMemberRequestRemoveCommand removeCommand;

    public static RemoveUserGroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserGroupMemberRequest self = new RemoveUserGroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserGroupMemberRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public RemoveUserGroupMemberRequest setRemoveCommand(RemoveUserGroupMemberRequestRemoveCommand removeCommand) {
        this.removeCommand = removeCommand;
        return this;
    }
    public RemoveUserGroupMemberRequestRemoveCommand getRemoveCommand() {
        return this.removeCommand;
    }

    public static class RemoveUserGroupMemberRequestRemoveCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2311</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("UserIdList")
        public java.util.List<String> userIdList;

        public static RemoveUserGroupMemberRequestRemoveCommand build(java.util.Map<String, ?> map) throws Exception {
            RemoveUserGroupMemberRequestRemoveCommand self = new RemoveUserGroupMemberRequestRemoveCommand();
            return TeaModel.build(map, self);
        }

        public RemoveUserGroupMemberRequestRemoveCommand setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public RemoveUserGroupMemberRequestRemoveCommand setUserIdList(java.util.List<String> userIdList) {
            this.userIdList = userIdList;
            return this;
        }
        public java.util.List<String> getUserIdList() {
            return this.userIdList;
        }

    }

}
