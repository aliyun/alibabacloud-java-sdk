// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteSnapshotResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotResponse self = new DeleteSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
