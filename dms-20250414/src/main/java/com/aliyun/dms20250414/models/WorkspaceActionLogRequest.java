// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class WorkspaceActionLogRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qps</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static WorkspaceActionLogRequest build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceActionLogRequest self = new WorkspaceActionLogRequest();
        return TeaModel.build(map, self);
    }

    public WorkspaceActionLogRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public WorkspaceActionLogRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
