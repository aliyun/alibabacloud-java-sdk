// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CommitFlowEntitySnapshotResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static CommitFlowEntitySnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CommitFlowEntitySnapshotResponseBody self = new CommitFlowEntitySnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public CommitFlowEntitySnapshotResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CommitFlowEntitySnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
