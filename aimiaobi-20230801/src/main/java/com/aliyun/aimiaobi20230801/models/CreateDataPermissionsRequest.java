// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CreateDataPermissionsRequest extends TeaModel {
    /**
     * <p>A unique identifier for the permission.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SystemSearch.QuarkCommonNews</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>The permission type. Currently, only \<code>dataset\\</code> is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The users to whom you want to assign permissions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PermissionUserInfos")
    public java.util.List<CreateDataPermissionsRequestPermissionUserInfos> permissionUserInfos;

    /**
     * <p>The unique identifier of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2587495.html">Get workspaceId</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDataPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataPermissionsRequest self = new CreateDataPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataPermissionsRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public CreateDataPermissionsRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateDataPermissionsRequest setPermissionUserInfos(java.util.List<CreateDataPermissionsRequestPermissionUserInfos> permissionUserInfos) {
        this.permissionUserInfos = permissionUserInfos;
        return this;
    }
    public java.util.List<CreateDataPermissionsRequestPermissionUserInfos> getPermissionUserInfos() {
        return this.permissionUserInfos;
    }

    public CreateDataPermissionsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateDataPermissionsRequestPermissionUserInfos extends TeaModel {
        /**
         * <p>The user ID.</p>
         * <ul>
         * <li><p>For a RAM user: The ID of the RAM user.</p>
         * </li>
         * <li><p>For a role user: The user identity in the format AssumedRoleUser${roleId}.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PermissionUserId")
        public String permissionUserId;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("PermissionUsername")
        public String permissionUsername;

        public static CreateDataPermissionsRequestPermissionUserInfos build(java.util.Map<String, ?> map) throws Exception {
            CreateDataPermissionsRequestPermissionUserInfos self = new CreateDataPermissionsRequestPermissionUserInfos();
            return TeaModel.build(map, self);
        }

        public CreateDataPermissionsRequestPermissionUserInfos setPermissionUserId(String permissionUserId) {
            this.permissionUserId = permissionUserId;
            return this;
        }
        public String getPermissionUserId() {
            return this.permissionUserId;
        }

        public CreateDataPermissionsRequestPermissionUserInfos setPermissionUsername(String permissionUsername) {
            this.permissionUsername = permissionUsername;
            return this;
        }
        public String getPermissionUsername() {
            return this.permissionUsername;
        }

    }

}
