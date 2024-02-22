// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class SendDryRunSystemEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SendDryRunSystemEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendDryRunSystemEventResponse setBody(SendDryRunSystemEventResponseBody body) {
        this.body = body;
        return this;
    }
    public SendDryRunSystemEventResponseBody getBody() {
        return this.body;
    }

}
