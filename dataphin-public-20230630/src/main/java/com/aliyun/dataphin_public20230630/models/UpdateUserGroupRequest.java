// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateUserGroupRequest extends TeaModel {
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
     * <p>The command to edit the user group.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateUserGroupRequestUpdateCommand updateCommand;

    public static UpdateUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserGroupRequest self = new UpdateUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserGroupRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateUserGroupRequest setUpdateCommand(UpdateUserGroupRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateUserGroupRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateUserGroupRequestUpdateCommand extends TeaModel {
        /**
         * <p>The list of administrator user IDs for the user group.</p>
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
         * <p>The ID of the user group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13423</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateUserGroupRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserGroupRequestUpdateCommand self = new UpdateUserGroupRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateUserGroupRequestUpdateCommand setAdminUserIdList(java.util.List<String> adminUserIdList) {
            this.adminUserIdList = adminUserIdList;
            return this;
        }
        public java.util.List<String> getAdminUserIdList() {
            return this.adminUserIdList;
        }

        public UpdateUserGroupRequestUpdateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateUserGroupRequestUpdateCommand setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateUserGroupRequestUpdateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
