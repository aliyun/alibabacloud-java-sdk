// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceRolesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A519F77D-28A0-52F5-AB82-5********8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWorkspaceRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceRolesResponseBody self = new DeleteWorkspaceRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
