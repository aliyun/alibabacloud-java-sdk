// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveSnapshotDetectPornConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddLiveSnapshotDetectPornConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveSnapshotDetectPornConfigResponse self = new AddLiveSnapshotDetectPornConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveSnapshotDetectPornConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
