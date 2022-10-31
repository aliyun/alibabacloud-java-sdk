// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveEdgeTransferResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetLiveEdgeTransferResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetLiveEdgeTransferResponseBody self = new SetLiveEdgeTransferResponseBody();
        return TeaModel.build(map, self);
    }

    public SetLiveEdgeTransferResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
