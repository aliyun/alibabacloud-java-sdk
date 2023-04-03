// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetGtmMonitorStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetGtmMonitorStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetGtmMonitorStatusResponseBody self = new SetGtmMonitorStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetGtmMonitorStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
