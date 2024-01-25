// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAlgorithmListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlgorithmListResponseBody body;

    public static GetAlgorithmListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmListResponse self = new GetAlgorithmListResponse();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlgorithmListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlgorithmListResponse setBody(GetAlgorithmListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlgorithmListResponseBody getBody() {
        return this.body;
    }

}
