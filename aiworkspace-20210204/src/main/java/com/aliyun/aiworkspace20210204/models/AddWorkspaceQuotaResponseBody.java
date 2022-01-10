// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class AddWorkspaceQuotaResponseBody extends TeaModel {
    // 请求 id
    @NameInMap("RequestId")
    public String requestId;

    public static AddWorkspaceQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceQuotaResponseBody self = new AddWorkspaceQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
