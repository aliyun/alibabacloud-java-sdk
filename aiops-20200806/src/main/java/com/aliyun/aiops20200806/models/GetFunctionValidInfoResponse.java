// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetFunctionValidInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFunctionValidInfoResponseBody body;

    public static GetFunctionValidInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionValidInfoResponse self = new GetFunctionValidInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetFunctionValidInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFunctionValidInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFunctionValidInfoResponse setBody(GetFunctionValidInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFunctionValidInfoResponseBody getBody() {
        return this.body;
    }

}
