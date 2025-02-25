// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetIssueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIssueResponseBody body;

    public static GetIssueResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIssueResponse self = new GetIssueResponse();
        return TeaModel.build(map, self);
    }

    public GetIssueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIssueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIssueResponse setBody(GetIssueResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIssueResponseBody getBody() {
        return this.body;
    }

}
