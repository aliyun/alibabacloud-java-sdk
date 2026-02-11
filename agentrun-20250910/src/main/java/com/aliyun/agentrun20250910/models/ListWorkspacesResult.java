// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListWorkspacesResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListWorkspacesOutput data;

    @NameInMap("requestId")
    public String requestId;

    public static ListWorkspacesResult build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesResult self = new ListWorkspacesResult();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWorkspacesResult setData(ListWorkspacesOutput data) {
        this.data = data;
        return this;
    }
    public ListWorkspacesOutput getData() {
        return this.data;
    }

    public ListWorkspacesResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
