// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class BatchEvaluateWorkspacePermissionsResult extends TeaModel {
    /**
     * <p>OK 表示成功</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public BatchEvaluateWorkspacePermissionsOutput data;

    /**
     * <p>与响应头 x-funagent-request-id 对应</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static BatchEvaluateWorkspacePermissionsResult build(java.util.Map<String, ?> map) throws Exception {
        BatchEvaluateWorkspacePermissionsResult self = new BatchEvaluateWorkspacePermissionsResult();
        return TeaModel.build(map, self);
    }

    public BatchEvaluateWorkspacePermissionsResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchEvaluateWorkspacePermissionsResult setData(BatchEvaluateWorkspacePermissionsOutput data) {
        this.data = data;
        return this;
    }
    public BatchEvaluateWorkspacePermissionsOutput getData() {
        return this.data;
    }

    public BatchEvaluateWorkspacePermissionsResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
