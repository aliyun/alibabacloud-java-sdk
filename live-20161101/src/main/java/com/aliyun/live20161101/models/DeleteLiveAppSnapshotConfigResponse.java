// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAppSnapshotConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLiveAppSnapshotConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveAppSnapshotConfigResponse self = new DeleteLiveAppSnapshotConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveAppSnapshotConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
