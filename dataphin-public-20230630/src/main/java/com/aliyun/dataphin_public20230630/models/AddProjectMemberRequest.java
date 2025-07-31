// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AddProjectMemberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddCommand")
    public AddProjectMemberRequestAddCommand addCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>711833</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static AddProjectMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProjectMemberRequest self = new AddProjectMemberRequest();
        return TeaModel.build(map, self);
    }

    public AddProjectMemberRequest setAddCommand(AddProjectMemberRequestAddCommand addCommand) {
        this.addCommand = addCommand;
        return this;
    }
    public AddProjectMemberRequestAddCommand getAddCommand() {
        return this.addCommand;
    }

    public AddProjectMemberRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AddProjectMemberRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class AddProjectMemberRequestAddCommandUserList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("RoleList")
        public java.util.List<Integer> roleList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static AddProjectMemberRequestAddCommandUserList build(java.util.Map<String, ?> map) throws Exception {
            AddProjectMemberRequestAddCommandUserList self = new AddProjectMemberRequestAddCommandUserList();
            return TeaModel.build(map, self);
        }

        public AddProjectMemberRequestAddCommandUserList setRoleList(java.util.List<Integer> roleList) {
            this.roleList = roleList;
            return this;
        }
        public java.util.List<Integer> getRoleList() {
            return this.roleList;
        }

        public AddProjectMemberRequestAddCommandUserList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class AddProjectMemberRequestAddCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("UserList")
        public java.util.List<AddProjectMemberRequestAddCommandUserList> userList;

        public static AddProjectMemberRequestAddCommand build(java.util.Map<String, ?> map) throws Exception {
            AddProjectMemberRequestAddCommand self = new AddProjectMemberRequestAddCommand();
            return TeaModel.build(map, self);
        }

        public AddProjectMemberRequestAddCommand setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public AddProjectMemberRequestAddCommand setUserList(java.util.List<AddProjectMemberRequestAddCommandUserList> userList) {
            this.userList = userList;
            return this;
        }
        public java.util.List<AddProjectMemberRequestAddCommandUserList> getUserList() {
            return this.userList;
        }

    }

}
