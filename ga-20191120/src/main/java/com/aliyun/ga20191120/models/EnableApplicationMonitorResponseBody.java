// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class EnableApplicationMonitorResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableApplicationMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationMonitorResponseBody self = new EnableApplicationMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableApplicationMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
