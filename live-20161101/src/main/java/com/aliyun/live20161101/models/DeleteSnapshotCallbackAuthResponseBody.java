// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteSnapshotCallbackAuthResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSnapshotCallbackAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotCallbackAuthResponseBody self = new DeleteSnapshotCallbackAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotCallbackAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
