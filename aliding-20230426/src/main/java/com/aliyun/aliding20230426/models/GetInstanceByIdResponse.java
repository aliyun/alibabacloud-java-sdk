// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetInstanceByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceByIdResponseBody body;

    public static GetInstanceByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceByIdResponse self = new GetInstanceByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceByIdResponse setBody(GetInstanceByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceByIdResponseBody getBody() {
        return this.body;
    }

}
