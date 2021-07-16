// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteIntegrationConfigResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static DeleteIntegrationConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntegrationConfigResponseBody self = new DeleteIntegrationConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIntegrationConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
