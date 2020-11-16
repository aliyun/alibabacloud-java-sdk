// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RealTimeSnapshotCommandResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RealTimeSnapshotCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        RealTimeSnapshotCommandResponse self = new RealTimeSnapshotCommandResponse();
        return TeaModel.build(map, self);
    }

    public RealTimeSnapshotCommandResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
