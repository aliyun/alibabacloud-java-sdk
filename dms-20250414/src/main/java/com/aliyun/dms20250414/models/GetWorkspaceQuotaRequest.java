// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetWorkspaceQuotaRequest extends TeaModel {
    /**
     * <p>The ID of the DMS workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetWorkspaceQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceQuotaRequest self = new GetWorkspaceQuotaRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceQuotaRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
