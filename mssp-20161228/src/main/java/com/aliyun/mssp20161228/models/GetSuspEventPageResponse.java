// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetSuspEventPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSuspEventPageResponseBody body;

    public static GetSuspEventPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSuspEventPageResponse self = new GetSuspEventPageResponse();
        return TeaModel.build(map, self);
    }

    public GetSuspEventPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSuspEventPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSuspEventPageResponse setBody(GetSuspEventPageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSuspEventPageResponseBody getBody() {
        return this.body;
    }

}
