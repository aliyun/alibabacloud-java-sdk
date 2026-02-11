// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class WorkspaceResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Workspace data;

    @NameInMap("requestId")
    public String requestId;

    public static WorkspaceResult build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceResult self = new WorkspaceResult();
        return TeaModel.build(map, self);
    }

    public WorkspaceResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public WorkspaceResult setData(Workspace data) {
        this.data = data;
        return this;
    }
    public Workspace getData() {
        return this.data;
    }

    public WorkspaceResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
