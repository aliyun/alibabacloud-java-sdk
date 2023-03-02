// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateIntegrationConfigResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateIntegrationConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntegrationConfigResponseBody self = new UpdateIntegrationConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIntegrationConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
