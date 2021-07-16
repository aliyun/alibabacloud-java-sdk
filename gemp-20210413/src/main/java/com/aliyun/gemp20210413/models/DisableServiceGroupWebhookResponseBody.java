// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DisableServiceGroupWebhookResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static DisableServiceGroupWebhookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableServiceGroupWebhookResponseBody self = new DisableServiceGroupWebhookResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableServiceGroupWebhookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
