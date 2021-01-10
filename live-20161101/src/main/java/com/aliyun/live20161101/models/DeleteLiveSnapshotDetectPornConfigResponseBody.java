// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveSnapshotDetectPornConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveSnapshotDetectPornConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveSnapshotDetectPornConfigResponseBody self = new DeleteLiveSnapshotDetectPornConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveSnapshotDetectPornConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
