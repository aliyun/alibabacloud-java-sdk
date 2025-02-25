// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetIssuesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIssuesResponseBody body;

    public static GetIssuesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIssuesResponse self = new GetIssuesResponse();
        return TeaModel.build(map, self);
    }

    public GetIssuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIssuesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIssuesResponse setBody(GetIssuesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIssuesResponseBody getBody() {
        return this.body;
    }

}
