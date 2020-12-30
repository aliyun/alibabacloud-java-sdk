// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CommitFlowEntitySnapshotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static CommitFlowEntitySnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CommitFlowEntitySnapshotResponseBody self = new CommitFlowEntitySnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public CommitFlowEntitySnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CommitFlowEntitySnapshotResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
