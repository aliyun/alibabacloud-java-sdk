// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveSnapshotNotifyConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddLiveSnapshotNotifyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLiveSnapshotNotifyConfigResponseBody self = new AddLiveSnapshotNotifyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLiveSnapshotNotifyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
