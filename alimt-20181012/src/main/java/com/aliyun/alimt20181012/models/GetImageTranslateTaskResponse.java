// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetImageTranslateTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
