// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmMonitorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDnsGtmMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsGtmMonitorResponseBody self = new UpdateDnsGtmMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDnsGtmMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
