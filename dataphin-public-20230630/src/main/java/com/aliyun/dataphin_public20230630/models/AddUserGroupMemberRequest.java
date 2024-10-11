// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AddUserGroupMemberRequest extends TeaModel {
    @NameInMap("AddCommand")
    public AddUserGroupMemberRequestAddCommand addCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static AddUserGroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserGroupMemberRequest self = new AddUserGroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public AddUserGroupMemberRequest setAddCommand(AddUserGroupMemberRequestAddCommand addCommand) {
        this.addCommand = addCommand;
        return this;
    }
    public AddUserGroupMemberRequestAddCommand getAddCommand() {
        return this.addCommand;
    }

    public AddUserGroupMemberRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class AddUserGroupMemberRequestAddCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>132331</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        @NameInMap("UserIdList")
        public java.util.List<String> userIdList;

        public static AddUserGroupMemberRequestAddCommand build(java.util.Map<String, ?> map) throws Exception {
            AddUserGroupMemberRequestAddCommand self = new AddUserGroupMemberRequestAddCommand();
            return TeaModel.build(map, self);
        }

        public AddUserGroupMemberRequestAddCommand setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public AddUserGroupMemberRequestAddCommand setUserIdList(java.util.List<String> userIdList) {
            this.userIdList = userIdList;
            return this;
        }
        public java.util.List<String> getUserIdList() {
            return this.userIdList;
        }

    }

}
