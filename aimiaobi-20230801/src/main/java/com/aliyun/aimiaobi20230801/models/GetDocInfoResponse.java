// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetDocInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDocInfoResponseBody body;

    public static GetDocInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocInfoResponse self = new GetDocInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDocInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocInfoResponse setBody(GetDocInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocInfoResponseBody getBody() {
        return this.body;
    }

}
