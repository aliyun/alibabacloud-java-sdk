// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEntityResponseBody body;

    public static GetEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEntityResponse self = new GetEntityResponse();
        return TeaModel.build(map, self);
    }

    public GetEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEntityResponse setBody(GetEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEntityResponseBody getBody() {
        return this.body;
    }

}
