// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class UpdateReminderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateReminderResponseBody body;

    public static UpdateReminderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateReminderResponse self = new UpdateReminderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateReminderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateReminderResponse setBody(UpdateReminderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateReminderResponseBody getBody() {
        return this.body;
    }

}
