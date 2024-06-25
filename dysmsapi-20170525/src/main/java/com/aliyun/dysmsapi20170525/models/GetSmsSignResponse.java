// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsSignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSmsSignResponseBody body;

    public static GetSmsSignResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSmsSignResponse self = new GetSmsSignResponse();
        return TeaModel.build(map, self);
    }

    public GetSmsSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSmsSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSmsSignResponse setBody(GetSmsSignResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSmsSignResponseBody getBody() {
        return this.body;
    }

}
