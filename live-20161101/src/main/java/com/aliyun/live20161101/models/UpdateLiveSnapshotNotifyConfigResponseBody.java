// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveSnapshotNotifyConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A3136B58-5876-5A93-83CA-B562781981A0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLiveSnapshotNotifyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveSnapshotNotifyConfigResponseBody self = new UpdateLiveSnapshotNotifyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLiveSnapshotNotifyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
