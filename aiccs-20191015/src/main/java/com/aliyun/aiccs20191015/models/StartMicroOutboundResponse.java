// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartMicroOutboundResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartMicroOutboundResponseBody body;

    public static StartMicroOutboundResponse build(java.util.Map<String, ?> map) throws Exception {
        StartMicroOutboundResponse self = new StartMicroOutboundResponse();
        return TeaModel.build(map, self);
    }

    public StartMicroOutboundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartMicroOutboundResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartMicroOutboundResponse setBody(StartMicroOutboundResponseBody body) {
        this.body = body;
        return this;
    }
    public StartMicroOutboundResponseBody getBody() {
        return this.body;
    }

}
