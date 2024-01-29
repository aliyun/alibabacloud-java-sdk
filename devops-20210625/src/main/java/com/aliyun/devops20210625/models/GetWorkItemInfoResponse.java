// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkItemInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkItemInfoResponseBody body;

    public static GetWorkItemInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkItemInfoResponse self = new GetWorkItemInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkItemInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkItemInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkItemInfoResponse setBody(GetWorkItemInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkItemInfoResponseBody getBody() {
        return this.body;
    }

}
