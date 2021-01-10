// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveSnapshotDetectPornConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLiveSnapshotDetectPornConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveSnapshotDetectPornConfigResponseBody self = new UpdateLiveSnapshotDetectPornConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLiveSnapshotDetectPornConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
