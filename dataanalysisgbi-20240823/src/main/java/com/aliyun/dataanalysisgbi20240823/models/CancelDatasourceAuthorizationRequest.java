// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class CancelDatasourceAuthorizationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2v3934xtp49esw64</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static CancelDatasourceAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelDatasourceAuthorizationRequest self = new CancelDatasourceAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public CancelDatasourceAuthorizationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
