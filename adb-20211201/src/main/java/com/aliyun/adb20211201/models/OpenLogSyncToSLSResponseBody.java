// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class OpenLogSyncToSLSResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenLogSyncToSLSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenLogSyncToSLSResponseBody self = new OpenLogSyncToSLSResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenLogSyncToSLSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
