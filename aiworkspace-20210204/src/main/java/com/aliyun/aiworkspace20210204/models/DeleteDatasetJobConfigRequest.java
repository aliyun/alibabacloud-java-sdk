// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetJobConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>513663</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteDatasetJobConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetJobConfigRequest self = new DeleteDatasetJobConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetJobConfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
