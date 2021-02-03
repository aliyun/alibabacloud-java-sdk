// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmMonitorResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateDnsGtmMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsGtmMonitorResponse self = new UpdateDnsGtmMonitorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDnsGtmMonitorResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
