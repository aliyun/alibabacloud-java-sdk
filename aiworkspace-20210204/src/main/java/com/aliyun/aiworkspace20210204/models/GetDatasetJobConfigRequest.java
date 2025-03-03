// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDatasetJobConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>114243</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetDatasetJobConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetJobConfigRequest self = new GetDatasetJobConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetDatasetJobConfigRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
