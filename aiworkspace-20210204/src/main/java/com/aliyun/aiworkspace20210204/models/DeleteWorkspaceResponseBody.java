// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

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

}
