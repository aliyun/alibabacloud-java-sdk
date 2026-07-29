// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetServiceTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceTaskResponseBody body;

    public static GetServiceTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceTaskResponse self = new GetServiceTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceTaskResponse setBody(GetServiceTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceTaskResponseBody getBody() {
        return this.body;
    }

}
