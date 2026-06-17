// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-*****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceRequest self = new DeleteWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteWorkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
