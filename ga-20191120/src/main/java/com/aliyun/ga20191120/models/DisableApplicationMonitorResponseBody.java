// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DisableApplicationMonitorResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableApplicationMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationMonitorResponseBody self = new DisableApplicationMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableApplicationMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
