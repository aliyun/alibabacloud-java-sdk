// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class GetPersonsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPersonsResponseBody body;

    public static GetPersonsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPersonsResponse self = new GetPersonsResponse();
        return TeaModel.build(map, self);
    }

    public GetPersonsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPersonsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPersonsResponse setBody(GetPersonsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPersonsResponseBody getBody() {
        return this.body;
    }

}
