// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class GetDcdnKvDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDcdnKvDetailResponseBody body;

    public static GetDcdnKvDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDcdnKvDetailResponse self = new GetDcdnKvDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetDcdnKvDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDcdnKvDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDcdnKvDetailResponse setBody(GetDcdnKvDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDcdnKvDetailResponseBody getBody() {
        return this.body;
    }

}
