// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetMcuLvsIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMcuLvsIpResponseBody body;

    public static GetMcuLvsIpResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMcuLvsIpResponse self = new GetMcuLvsIpResponse();
        return TeaModel.build(map, self);
    }

    public GetMcuLvsIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMcuLvsIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMcuLvsIpResponse setBody(GetMcuLvsIpResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMcuLvsIpResponseBody getBody() {
        return this.body;
    }

}
