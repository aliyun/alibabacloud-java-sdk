// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RemoveWorkspaceUserRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123***</p>
     */
    @NameInMap("DmsUserIds")
    public String dmsUserIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RemoveWorkspaceUserRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveWorkspaceUserRequest self = new RemoveWorkspaceUserRequest();
        return TeaModel.build(map, self);
    }

    public RemoveWorkspaceUserRequest setDmsUserIds(String dmsUserIds) {
        this.dmsUserIds = dmsUserIds;
        return this;
    }
    public String getDmsUserIds() {
        return this.dmsUserIds;
    }

    public RemoveWorkspaceUserRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
