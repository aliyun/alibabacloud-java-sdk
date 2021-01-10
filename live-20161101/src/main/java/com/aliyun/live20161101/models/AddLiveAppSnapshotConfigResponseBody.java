// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAppSnapshotConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddLiveAppSnapshotConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAppSnapshotConfigResponseBody self = new AddLiveAppSnapshotConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLiveAppSnapshotConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
