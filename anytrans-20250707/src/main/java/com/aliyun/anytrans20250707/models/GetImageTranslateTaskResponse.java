// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class GetImageTranslateTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetImageTranslateTaskResponseBody body;

    public static GetImageTranslateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageTranslateTaskResponse self = new GetImageTranslateTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetImageTranslateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageTranslateTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageTranslateTaskResponse setBody(GetImageTranslateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageTranslateTaskResponseBody getBody() {
        return this.body;
    }

}
