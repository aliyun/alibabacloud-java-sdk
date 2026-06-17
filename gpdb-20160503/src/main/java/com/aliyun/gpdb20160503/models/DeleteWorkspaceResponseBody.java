// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>ws-*****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceResponseBody self = new DeleteWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteWorkspaceResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
