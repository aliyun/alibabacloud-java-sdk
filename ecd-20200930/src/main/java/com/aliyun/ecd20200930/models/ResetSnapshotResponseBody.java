// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ResetSnapshotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResetSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetSnapshotResponseBody self = new ResetSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
