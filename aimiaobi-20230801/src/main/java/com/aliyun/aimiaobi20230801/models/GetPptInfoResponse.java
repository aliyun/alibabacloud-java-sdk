// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetPptInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPptInfoResponseBody body;

    public static GetPptInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPptInfoResponse self = new GetPptInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetPptInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPptInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPptInfoResponse setBody(GetPptInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPptInfoResponseBody getBody() {
        return this.body;
    }

}
