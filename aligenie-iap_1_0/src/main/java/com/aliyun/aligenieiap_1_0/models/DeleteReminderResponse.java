// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class DeleteReminderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteReminderResponseBody body;

    public static DeleteReminderResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteReminderResponse self = new DeleteReminderResponse();
        return TeaModel.build(map, self);
    }

    public DeleteReminderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteReminderResponse setBody(DeleteReminderResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteReminderResponseBody getBody() {
        return this.body;
    }

}
