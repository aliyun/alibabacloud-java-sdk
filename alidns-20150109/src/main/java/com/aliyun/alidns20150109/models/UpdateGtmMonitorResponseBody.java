// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmMonitorResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateGtmMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmMonitorResponseBody self = new UpdateGtmMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGtmMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
