// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CancelCoordinationForMonitoringResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelCoordinationForMonitoringResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelCoordinationForMonitoringResponseBody self = new CancelCoordinationForMonitoringResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelCoordinationForMonitoringResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
