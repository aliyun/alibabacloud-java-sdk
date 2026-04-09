// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CreateDataPermissionsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SystemSearch.QuarkCommonNews</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PermissionUserInfos")
    public java.util.List<CreateDataPermissionsRequestPermissionUserInfos> permissionUserInfos;

    /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PermissionUserId")
        public String permissionUserId;

        /**
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
