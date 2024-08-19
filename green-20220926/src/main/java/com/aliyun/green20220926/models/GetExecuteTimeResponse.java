// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetExecuteTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExecuteTimeResponseBody body;

    public static GetExecuteTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExecuteTimeResponse self = new GetExecuteTimeResponse();
        return TeaModel.build(map, self);
    }

    public GetExecuteTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExecuteTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExecuteTimeResponse setBody(GetExecuteTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExecuteTimeResponseBody getBody() {
        return this.body;
    }

}
