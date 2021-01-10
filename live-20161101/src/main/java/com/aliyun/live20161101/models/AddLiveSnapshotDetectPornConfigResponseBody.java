// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveSnapshotDetectPornConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddLiveSnapshotDetectPornConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLiveSnapshotDetectPornConfigResponseBody self = new AddLiveSnapshotDetectPornConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLiveSnapshotDetectPornConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
