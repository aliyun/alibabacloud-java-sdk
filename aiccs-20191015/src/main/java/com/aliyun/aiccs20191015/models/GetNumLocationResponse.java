// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetNumLocationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetNumLocationResponseBody body;

    public static GetNumLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNumLocationResponse self = new GetNumLocationResponse();
        return TeaModel.build(map, self);
    }

    public GetNumLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNumLocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNumLocationResponse setBody(GetNumLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNumLocationResponseBody getBody() {
        return this.body;
    }

}
