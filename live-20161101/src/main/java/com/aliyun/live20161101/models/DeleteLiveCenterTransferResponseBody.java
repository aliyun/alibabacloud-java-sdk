// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveCenterTransferResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7908F2FF-44F8-120F-9FD6-85A******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveCenterTransferResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveCenterTransferResponseBody self = new DeleteLiveCenterTransferResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveCenterTransferResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
