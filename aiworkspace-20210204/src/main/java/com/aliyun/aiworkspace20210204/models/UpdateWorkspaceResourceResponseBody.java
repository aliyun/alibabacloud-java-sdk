// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceResourceResponseBody extends TeaModel {
    // 请求 id
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWorkspaceResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceResourceResponseBody self = new UpdateWorkspaceResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
