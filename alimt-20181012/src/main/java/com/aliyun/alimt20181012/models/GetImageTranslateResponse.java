// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetImageTranslateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetImageTranslateResponseBody body;

    public static GetImageTranslateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageTranslateResponse self = new GetImageTranslateResponse();
        return TeaModel.build(map, self);
    }

    public GetImageTranslateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageTranslateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageTranslateResponse setBody(GetImageTranslateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageTranslateResponseBody getBody() {
        return this.body;
    }

}
