// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetReminderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetReminderResponseBody body;

    public static GetReminderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReminderResponse self = new GetReminderResponse();
        return TeaModel.build(map, self);
    }

    public GetReminderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReminderResponse setBody(GetReminderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetReminderResponseBody getBody() {
        return this.body;
    }

}
