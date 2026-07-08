// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CreateDataPermissionsShrinkRequest extends TeaModel {
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
    public String permissionUserInfosShrink;

    /**
     * <p>The unique identifier of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2587495.html">Get workspaceId</a>.</p>
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
