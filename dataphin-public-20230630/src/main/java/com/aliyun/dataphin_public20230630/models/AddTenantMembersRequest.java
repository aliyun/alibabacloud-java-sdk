// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AddTenantMembersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddCommand")
    public AddTenantMembersRequestAddCommand addCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static AddTenantMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTenantMembersRequest self = new AddTenantMembersRequest();
        return TeaModel.build(map, self);
    }

    public AddTenantMembersRequest setAddCommand(AddTenantMembersRequestAddCommand addCommand) {
        this.addCommand = addCommand;
        return this;
    }
    public AddTenantMembersRequestAddCommand getAddCommand() {
        return this.addCommand;
    }

    public AddTenantMembersRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class AddTenantMembersRequestAddCommandUserList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1323241</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("RoleList")
        public java.util.List<String> roleList;

        public static AddTenantMembersRequestAddCommandUserList build(java.util.Map<String, ?> map) throws Exception {
            AddTenantMembersRequestAddCommandUserList self = new AddTenantMembersRequestAddCommandUserList();
            return TeaModel.build(map, self);
        }

        public AddTenantMembersRequestAddCommandUserList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddTenantMembersRequestAddCommandUserList setRoleList(java.util.List<String> roleList) {
            this.roleList = roleList;
            return this;
        }
        public java.util.List<String> getRoleList() {
            return this.roleList;
        }

    }

    public static class AddTenantMembersRequestAddCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("UserList")
        public java.util.List<AddTenantMembersRequestAddCommandUserList> userList;

        public static AddTenantMembersRequestAddCommand build(java.util.Map<String, ?> map) throws Exception {
            AddTenantMembersRequestAddCommand self = new AddTenantMembersRequestAddCommand();
            return TeaModel.build(map, self);
        }

        public AddTenantMembersRequestAddCommand setUserList(java.util.List<AddTenantMembersRequestAddCommandUserList> userList) {
            this.userList = userList;
            return this;
        }
        public java.util.List<AddTenantMembersRequestAddCommandUserList> getUserList() {
            return this.userList;
        }

    }

}
