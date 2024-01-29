// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkItemActivityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkItemActivityResponseBody body;

    public static GetWorkItemActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkItemActivityResponse self = new GetWorkItemActivityResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkItemActivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkItemActivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkItemActivityResponse setBody(GetWorkItemActivityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkItemActivityResponseBody getBody() {
        return this.body;
    }

}
