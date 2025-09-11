// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class GetLongTextTranslateTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLongTextTranslateTaskResponseBody body;

    public static GetLongTextTranslateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLongTextTranslateTaskResponse self = new GetLongTextTranslateTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetLongTextTranslateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLongTextTranslateTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLongTextTranslateTaskResponse setBody(GetLongTextTranslateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLongTextTranslateTaskResponseBody getBody() {
        return this.body;
    }

}
