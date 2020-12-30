// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CleanupFlowEntitySnapshotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Boolean data;

    public static CleanupFlowEntitySnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CleanupFlowEntitySnapshotResponseBody self = new CleanupFlowEntitySnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public CleanupFlowEntitySnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CleanupFlowEntitySnapshotResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
