// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveEdgeTransferResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveEdgeTransferResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveEdgeTransferResponseBody self = new DeleteLiveEdgeTransferResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveEdgeTransferResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
