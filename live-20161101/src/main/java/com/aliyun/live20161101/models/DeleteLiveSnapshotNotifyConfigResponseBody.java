// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveSnapshotNotifyConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>32A96B9A-F203-4EC5-8E43-CB92E68F4I79E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveSnapshotNotifyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveSnapshotNotifyConfigResponseBody self = new DeleteLiveSnapshotNotifyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveSnapshotNotifyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
