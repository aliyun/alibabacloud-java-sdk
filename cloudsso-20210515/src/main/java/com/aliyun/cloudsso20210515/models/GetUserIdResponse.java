// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserIdResponseBody body;

    public static GetUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdResponse self = new GetUserIdResponse();
        return TeaModel.build(map, self);
    }

    public GetUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserIdResponse setBody(GetUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserIdResponseBody getBody() {
        return this.body;
    }

}
