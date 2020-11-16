// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveAppSnapshotConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateLiveAppSnapshotConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveAppSnapshotConfigResponse self = new UpdateLiveAppSnapshotConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveAppSnapshotConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
