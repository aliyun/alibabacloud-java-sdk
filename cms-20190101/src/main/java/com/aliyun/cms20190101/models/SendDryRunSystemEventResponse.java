// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class SendDryRunSystemEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendDryRunSystemEventResponseBody body;

    public static SendDryRunSystemEventResponse build(java.util.Map<String, ?> map) throws Exception {
        SendDryRunSystemEventResponse self = new SendDryRunSystemEventResponse();
        return TeaModel.build(map, self);
    }

    public SendDryRunSystemEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendDryRunSystemEventResponse setBody(SendDryRunSystemEventResponseBody body) {
        this.body = body;
        return this;
    }
    public SendDryRunSystemEventResponseBody getBody() {
        return this.body;
    }

}
