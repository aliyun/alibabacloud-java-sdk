// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDefaultWorkspaceResponseBody extends TeaModel {
    // 请求 id
    @NameInMap("RequestId")
    public String requestId;

    // 工作空间 id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDefaultWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDefaultWorkspaceResponseBody self = new CreateDefaultWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDefaultWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDefaultWorkspaceResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
