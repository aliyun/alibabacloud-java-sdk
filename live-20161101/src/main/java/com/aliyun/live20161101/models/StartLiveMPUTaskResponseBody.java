// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartLiveMPUTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0F72851F-5DC1-1979-9B2C-450040316C3E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartLiveMPUTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartLiveMPUTaskResponseBody self = new StartLiveMPUTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StartLiveMPUTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
