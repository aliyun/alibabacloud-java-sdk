// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVpdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVpdResponseBody body;

    public static GetVpdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVpdResponse self = new GetVpdResponse();
        return TeaModel.build(map, self);
    }

    public GetVpdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVpdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVpdResponse setBody(GetVpdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVpdResponseBody getBody() {
        return this.body;
    }

}
