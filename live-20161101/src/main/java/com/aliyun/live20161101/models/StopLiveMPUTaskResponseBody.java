// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopLiveMPUTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0F72851F-5DC1-1979-9B2C-450040316C3E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopLiveMPUTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopLiveMPUTaskResponseBody self = new StopLiveMPUTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StopLiveMPUTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
