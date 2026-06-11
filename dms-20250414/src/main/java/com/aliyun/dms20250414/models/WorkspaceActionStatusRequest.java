// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class WorkspaceActionStatusRequest extends TeaModel {
    /**
     * <p>The unique key that identifies the asynchronous task. You can obtain this key from the response of an operation, such as a deployment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-xxx-xxxx</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The ID of the workspace.</p>
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
