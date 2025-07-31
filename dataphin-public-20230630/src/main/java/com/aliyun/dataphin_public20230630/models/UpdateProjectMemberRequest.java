// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateProjectMemberRequest extends TeaModel {
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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateProjectMemberRequestUpdateCommand updateCommand;

    public static UpdateProjectMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectMemberRequest self = new UpdateProjectMemberRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectMemberRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateProjectMemberRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateProjectMemberRequest setUpdateCommand(UpdateProjectMemberRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateProjectMemberRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateProjectMemberRequestUpdateCommandUserList extends TeaModel {
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

        public static UpdateProjectMemberRequestUpdateCommandUserList build(java.util.Map<String, ?> map) throws Exception {
            UpdateProjectMemberRequestUpdateCommandUserList self = new UpdateProjectMemberRequestUpdateCommandUserList();
            return TeaModel.build(map, self);
        }

        public UpdateProjectMemberRequestUpdateCommandUserList setRoleList(java.util.List<Integer> roleList) {
            this.roleList = roleList;
            return this;
        }
        public java.util.List<Integer> getRoleList() {
            return this.roleList;
        }

        public UpdateProjectMemberRequestUpdateCommandUserList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class UpdateProjectMemberRequestUpdateCommand extends TeaModel {
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
        public java.util.List<UpdateProjectMemberRequestUpdateCommandUserList> userList;

        public static UpdateProjectMemberRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateProjectMemberRequestUpdateCommand self = new UpdateProjectMemberRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateProjectMemberRequestUpdateCommand setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public UpdateProjectMemberRequestUpdateCommand setUserList(java.util.List<UpdateProjectMemberRequestUpdateCommandUserList> userList) {
            this.userList = userList;
            return this;
        }
        public java.util.List<UpdateProjectMemberRequestUpdateCommandUserList> getUserList() {
            return this.userList;
        }

    }

}
