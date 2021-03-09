// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ResetSnapshotResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ResetSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetSnapshotResponse self = new ResetSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public ResetSnapshotResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
