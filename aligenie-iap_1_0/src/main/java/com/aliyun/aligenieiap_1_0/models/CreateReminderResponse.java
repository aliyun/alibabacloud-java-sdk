// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class CreateReminderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateReminderResponseBody body;

    public static CreateReminderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateReminderResponse self = new CreateReminderResponse();
        return TeaModel.build(map, self);
    }

    public CreateReminderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateReminderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateReminderResponse setBody(CreateReminderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateReminderResponseBody getBody() {
        return this.body;
    }

}
