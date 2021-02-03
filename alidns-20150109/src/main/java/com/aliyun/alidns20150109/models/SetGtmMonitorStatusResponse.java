// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetGtmMonitorStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetGtmMonitorStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetGtmMonitorStatusResponse self = new SetGtmMonitorStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetGtmMonitorStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
