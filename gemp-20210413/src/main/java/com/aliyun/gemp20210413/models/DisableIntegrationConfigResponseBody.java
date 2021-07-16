// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DisableIntegrationConfigResponseBody extends TeaModel {
    // requestId
    @NameInMap("requestId")
    public String requestId;

    public static DisableIntegrationConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableIntegrationConfigResponseBody self = new DisableIntegrationConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableIntegrationConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
