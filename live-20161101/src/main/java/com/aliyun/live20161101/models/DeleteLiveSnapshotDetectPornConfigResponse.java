// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveSnapshotDetectPornConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLiveSnapshotDetectPornConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveSnapshotDetectPornConfigResponse self = new DeleteLiveSnapshotDetectPornConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveSnapshotDetectPornConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
