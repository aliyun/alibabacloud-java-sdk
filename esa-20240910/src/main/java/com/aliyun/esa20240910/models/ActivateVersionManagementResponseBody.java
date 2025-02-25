// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ActivateVersionManagementResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C370DAF1-C838-4288-A1A0-9A87633D2***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ActivateVersionManagementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActivateVersionManagementResponseBody self = new ActivateVersionManagementResponseBody();
        return TeaModel.build(map, self);
    }

    public ActivateVersionManagementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
