// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetCustomTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomTemplateResponseBody body;

    public static GetCustomTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomTemplateResponse self = new GetCustomTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomTemplateResponse setBody(GetCustomTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomTemplateResponseBody getBody() {
        return this.body;
    }

}
