// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetDocTranslateTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDocTranslateTaskResponseBody body;

    public static GetDocTranslateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocTranslateTaskResponse self = new GetDocTranslateTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetDocTranslateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocTranslateTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDocTranslateTaskResponse setBody(GetDocTranslateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocTranslateTaskResponseBody getBody() {
        return this.body;
    }

}
