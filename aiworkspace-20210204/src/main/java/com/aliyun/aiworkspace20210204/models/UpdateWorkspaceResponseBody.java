// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceResponseBody extends TeaModel {
    // 请求 id
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceResponseBody self = new UpdateWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
