// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetGroupResourceNumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGroupResourceNumResponseBody body;

    public static GetGroupResourceNumResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGroupResourceNumResponse self = new GetGroupResourceNumResponse();
        return TeaModel.build(map, self);
    }

    public GetGroupResourceNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGroupResourceNumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGroupResourceNumResponse setBody(GetGroupResourceNumResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGroupResourceNumResponseBody getBody() {
        return this.body;
    }

}
