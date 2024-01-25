// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventAbNormalListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEventAbNormalListResponseBody body;

    public static GetEventAbNormalListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventAbNormalListResponse self = new GetEventAbNormalListResponse();
        return TeaModel.build(map, self);
    }

    public GetEventAbNormalListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventAbNormalListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEventAbNormalListResponse setBody(GetEventAbNormalListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventAbNormalListResponseBody getBody() {
        return this.body;
    }

}
