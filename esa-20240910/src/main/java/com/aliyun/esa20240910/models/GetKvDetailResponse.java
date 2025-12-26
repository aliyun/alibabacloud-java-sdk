// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetKvDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKvDetailResponseBody body;

    public static GetKvDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKvDetailResponse self = new GetKvDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetKvDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKvDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKvDetailResponse setBody(GetKvDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKvDetailResponseBody getBody() {
        return this.body;
    }

}
