// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ConfirmIntegrationConfigResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ConfirmIntegrationConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmIntegrationConfigResponseBody self = new ConfirmIntegrationConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmIntegrationConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
