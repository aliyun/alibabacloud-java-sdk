// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateDefaultWorkspaceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>17915******4216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDefaultWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDefaultWorkspaceResponseBody self = new UpdateDefaultWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDefaultWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
