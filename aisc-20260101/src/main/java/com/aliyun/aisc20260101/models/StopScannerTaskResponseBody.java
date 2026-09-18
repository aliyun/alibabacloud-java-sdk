// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class StopScannerTaskResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the request, used for troubleshooting and log tracing.</p>
     * 
     * <strong>example:</strong>
     * <p>1EBD0C05-6C1F-4C95-9C63-B7AB7B5A9C8E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopScannerTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopScannerTaskResponseBody self = new StopScannerTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StopScannerTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
