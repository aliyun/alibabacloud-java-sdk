// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateUserGroupRequest extends TeaModel {
    /**
     * <p>The creation request.</p>
     */
    @NameInMap("CreateCommand")
    public CreateUserGroupRequestCreateCommand createCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserGroupRequest self = new CreateUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserGroupRequest setCreateCommand(CreateUserGroupRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateUserGroupRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateUserGroupRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateUserGroupRequestCreateCommand extends TeaModel {
        /**
         * <p>Specifies whether to enable the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Active")
        public Boolean active;

        /**
         * <p>The user IDs of the user group administrators.</p>
         */
        @NameInMap("AdminUserIdList")
        public java.util.List<String> adminUserIdList;

        /**
         * <p>The description of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>xx用户组</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateUserGroupRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateUserGroupRequestCreateCommand self = new CreateUserGroupRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateUserGroupRequestCreateCommand setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public CreateUserGroupRequestCreateCommand setAdminUserIdList(java.util.List<String> adminUserIdList) {
            this.adminUserIdList = adminUserIdList;
            return this;
        }
        public java.util.List<String> getAdminUserIdList() {
            return this.adminUserIdList;
        }

        public CreateUserGroupRequestCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateUserGroupRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
