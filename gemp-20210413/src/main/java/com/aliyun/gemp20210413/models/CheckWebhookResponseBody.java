// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CheckWebhookResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static CheckWebhookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckWebhookResponseBody self = new CheckWebhookResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckWebhookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
