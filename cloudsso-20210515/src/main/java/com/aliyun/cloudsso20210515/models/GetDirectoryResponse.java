// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDirectoryResponseBody body;

    public static GetDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDirectoryResponse self = new GetDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public GetDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDirectoryResponse setBody(GetDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDirectoryResponseBody getBody() {
        return this.body;
    }

}
