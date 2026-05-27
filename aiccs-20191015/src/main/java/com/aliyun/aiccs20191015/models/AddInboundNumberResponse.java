// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddInboundNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddInboundNumberResponseBody body;

    public static AddInboundNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddInboundNumberResponse self = new AddInboundNumberResponse();
        return TeaModel.build(map, self);
    }

    public AddInboundNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddInboundNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddInboundNumberResponse setBody(AddInboundNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddInboundNumberResponseBody getBody() {
        return this.body;
    }

}
