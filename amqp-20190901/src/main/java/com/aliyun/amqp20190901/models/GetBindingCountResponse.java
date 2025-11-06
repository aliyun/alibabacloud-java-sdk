// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetBindingCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBindingCountResponseBody body;

    public static GetBindingCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBindingCountResponse self = new GetBindingCountResponse();
        return TeaModel.build(map, self);
    }

    public GetBindingCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBindingCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBindingCountResponse setBody(GetBindingCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBindingCountResponseBody getBody() {
        return this.body;
    }

}
