// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteSnapshotResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotResponseBody self = new DeleteSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
