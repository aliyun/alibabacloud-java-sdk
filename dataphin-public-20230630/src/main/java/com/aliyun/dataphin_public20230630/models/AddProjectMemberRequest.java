// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AddProjectMemberRequest extends TeaModel {
    /**
     * <p>The command to add members.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddCommand")
    public AddProjectMemberRequestAddCommand addCommand;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>711833</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The operator user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

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

    public AddProjectMemberRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class AddProjectMemberRequestAddCommandUserList extends TeaModel {
        /**
         * <p>The list of role codes for members. System and custom project roles are supported and can be obtained from ListProjectRoles. Only one role is supported. If this parameter is not empty, it takes precedence over RoleList. You must specify at least one of RoleList and RoleCodeList.</p>
         */
        @NameInMap("RoleCodeList")
        public java.util.List<String> roleCodeList;

        /**
         * <p>The member role. Valid values: 1 (Project administrator), 2 (Developer), 3 (Guest), 4 (Analyst), and 5 (O&amp;M engineer).</p>
         */
        @NameInMap("RoleList")
        public java.util.List<Integer> roleList;

        /**
         * <p>The user ID.</p>
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

        public AddProjectMemberRequestAddCommandUserList setRoleCodeList(java.util.List<String> roleCodeList) {
            this.roleCodeList = roleCodeList;
            return this;
        }
        public java.util.List<String> getRoleCodeList() {
            return this.roleCodeList;
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
         * <p>The environment identifier. Valid values: DEV and PROD.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The user members.</p>
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
