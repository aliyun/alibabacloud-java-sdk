// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class GetHtmlTranslateTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHtmlTranslateTaskResponseBody body;

    public static GetHtmlTranslateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHtmlTranslateTaskResponse self = new GetHtmlTranslateTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetHtmlTranslateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHtmlTranslateTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHtmlTranslateTaskResponse setBody(GetHtmlTranslateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHtmlTranslateTaskResponseBody getBody() {
        return this.body;
    }

}
