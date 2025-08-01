// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveCenterTransferResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7908F2FF-44F8-120F-9FD6-85AE4B6C19EC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddLiveCenterTransferResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLiveCenterTransferResponseBody self = new AddLiveCenterTransferResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLiveCenterTransferResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
