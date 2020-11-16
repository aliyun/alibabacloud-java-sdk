// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveSnapshotDetectPornConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateLiveSnapshotDetectPornConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveSnapshotDetectPornConfigResponse self = new UpdateLiveSnapshotDetectPornConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveSnapshotDetectPornConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
