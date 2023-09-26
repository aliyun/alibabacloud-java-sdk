// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetGroupByPathResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetGroupByPathResponseBody body;

    public static GetGroupByPathResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGroupByPathResponse self = new GetGroupByPathResponse();
        return TeaModel.build(map, self);
    }

    public GetGroupByPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGroupByPathResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGroupByPathResponse setBody(GetGroupByPathResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGroupByPathResponseBody getBody() {
        return this.body;
    }

}
