// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DiffFlowEntitySnapshotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static DiffFlowEntitySnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DiffFlowEntitySnapshotResponseBody self = new DiffFlowEntitySnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public DiffFlowEntitySnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DiffFlowEntitySnapshotResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
