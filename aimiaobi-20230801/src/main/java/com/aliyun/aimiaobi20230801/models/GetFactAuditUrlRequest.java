// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetFactAuditUrlRequest extends TeaModel {
    /**
     * <p>The unique identifier of the Alibaba Cloud Model Studio workspace. Get the <a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetFactAuditUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFactAuditUrlRequest self = new GetFactAuditUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetFactAuditUrlRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
