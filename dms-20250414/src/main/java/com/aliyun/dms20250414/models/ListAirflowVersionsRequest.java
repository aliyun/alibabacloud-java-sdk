// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListAirflowVersionsRequest extends TeaModel {
    /**
     * <p>The ID of the DMS workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8630242382****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListAirflowVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAirflowVersionsRequest self = new ListAirflowVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListAirflowVersionsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
