// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteApplicationMonitorResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteApplicationMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationMonitorResponseBody self = new DeleteApplicationMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
