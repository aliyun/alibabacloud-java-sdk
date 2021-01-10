// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveAppSnapshotConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLiveAppSnapshotConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveAppSnapshotConfigResponseBody self = new UpdateLiveAppSnapshotConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLiveAppSnapshotConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
