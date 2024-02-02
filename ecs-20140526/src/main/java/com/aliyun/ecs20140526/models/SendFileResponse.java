// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class SendFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendFileResponseBody body;

    public static SendFileResponse build(java.util.Map<String, ?> map) throws Exception {
        SendFileResponse self = new SendFileResponse();
        return TeaModel.build(map, self);
    }

    public SendFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendFileResponse setBody(SendFileResponseBody body) {
        this.body = body;
        return this;
    }
    public SendFileResponseBody getBody() {
        return this.body;
    }

}
