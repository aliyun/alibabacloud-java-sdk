// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmMonitorResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateGtmMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmMonitorResponse self = new UpdateGtmMonitorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGtmMonitorResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
