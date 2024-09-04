// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class GetPersonResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPersonResponseBody body;

    public static GetPersonResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPersonResponse self = new GetPersonResponse();
        return TeaModel.build(map, self);
    }

    public GetPersonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPersonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPersonResponse setBody(GetPersonResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPersonResponseBody getBody() {
        return this.body;
    }

}
