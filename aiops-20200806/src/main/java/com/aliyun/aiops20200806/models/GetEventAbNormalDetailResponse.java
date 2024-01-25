// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventAbNormalDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEventAbNormalDetailResponseBody body;

    public static GetEventAbNormalDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventAbNormalDetailResponse self = new GetEventAbNormalDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetEventAbNormalDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventAbNormalDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEventAbNormalDetailResponse setBody(GetEventAbNormalDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventAbNormalDetailResponseBody getBody() {
        return this.body;
    }

}
