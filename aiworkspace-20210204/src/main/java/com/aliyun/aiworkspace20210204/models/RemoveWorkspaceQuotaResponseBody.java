// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class RemoveWorkspaceQuotaResponseBody extends TeaModel {
    // 请求 id
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveWorkspaceQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveWorkspaceQuotaResponseBody self = new RemoveWorkspaceQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveWorkspaceQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
