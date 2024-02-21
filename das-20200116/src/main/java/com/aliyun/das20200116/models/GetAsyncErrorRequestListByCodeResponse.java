// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAsyncErrorRequestListByCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAsyncErrorRequestListByCodeResponseBody body;

    public static GetAsyncErrorRequestListByCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncErrorRequestListByCodeResponse self = new GetAsyncErrorRequestListByCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetAsyncErrorRequestListByCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAsyncErrorRequestListByCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAsyncErrorRequestListByCodeResponse setBody(GetAsyncErrorRequestListByCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAsyncErrorRequestListByCodeResponseBody getBody() {
        return this.body;
    }

}
