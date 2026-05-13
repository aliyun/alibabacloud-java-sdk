// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class WorkspaceActionStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-xxx-xxxx</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static WorkspaceActionStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceActionStatusRequest self = new WorkspaceActionStatusRequest();
        return TeaModel.build(map, self);
    }

    public WorkspaceActionStatusRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public WorkspaceActionStatusRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
