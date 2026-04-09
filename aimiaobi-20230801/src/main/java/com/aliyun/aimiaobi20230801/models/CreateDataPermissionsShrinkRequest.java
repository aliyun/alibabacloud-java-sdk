// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CreateDataPermissionsShrinkRequest extends TeaModel {
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
    public String permissionUserInfosShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDataPermissionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataPermissionsShrinkRequest self = new CreateDataPermissionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataPermissionsShrinkRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public CreateDataPermissionsShrinkRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateDataPermissionsShrinkRequest setPermissionUserInfosShrink(String permissionUserInfosShrink) {
        this.permissionUserInfosShrink = permissionUserInfosShrink;
        return this;
    }
    public String getPermissionUserInfosShrink() {
        return this.permissionUserInfosShrink;
    }

    public CreateDataPermissionsShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
