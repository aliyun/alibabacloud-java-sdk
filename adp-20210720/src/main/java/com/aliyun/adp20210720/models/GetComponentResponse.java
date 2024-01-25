// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetComponentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetComponentResponseBody body;

    public static GetComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetComponentResponse self = new GetComponentResponse();
        return TeaModel.build(map, self);
    }

    public GetComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetComponentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetComponentResponse setBody(GetComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetComponentResponseBody getBody() {
        return this.body;
    }

}
