// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetCardDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCardDetailResponseBody body;

    public static GetCardDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCardDetailResponse self = new GetCardDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetCardDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCardDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCardDetailResponse setBody(GetCardDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCardDetailResponseBody getBody() {
        return this.body;
    }

}
