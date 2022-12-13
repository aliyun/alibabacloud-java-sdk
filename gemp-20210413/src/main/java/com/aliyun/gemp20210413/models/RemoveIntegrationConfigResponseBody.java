// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RemoveIntegrationConfigResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static RemoveIntegrationConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveIntegrationConfigResponseBody self = new RemoveIntegrationConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveIntegrationConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
