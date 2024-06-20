// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateDefaultWorkspaceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateDefaultWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDefaultWorkspaceRequest self = new UpdateDefaultWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDefaultWorkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
