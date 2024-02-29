// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBusinessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBusinessResponseBody body;

    public static GetBusinessResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessResponse self = new GetBusinessResponse();
        return TeaModel.build(map, self);
    }

    public GetBusinessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBusinessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBusinessResponse setBody(GetBusinessResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBusinessResponseBody getBody() {
        return this.body;
    }

}
