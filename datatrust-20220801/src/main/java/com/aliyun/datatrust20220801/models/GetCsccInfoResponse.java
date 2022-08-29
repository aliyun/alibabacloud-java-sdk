// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetCsccInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCsccInfoResponseBody body;

    public static GetCsccInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCsccInfoResponse self = new GetCsccInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetCsccInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCsccInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCsccInfoResponse setBody(GetCsccInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCsccInfoResponseBody getBody() {
        return this.body;
    }

}
