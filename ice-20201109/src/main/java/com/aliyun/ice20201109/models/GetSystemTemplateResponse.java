// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetSystemTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSystemTemplateResponseBody body;

    public static GetSystemTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSystemTemplateResponse self = new GetSystemTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetSystemTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSystemTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSystemTemplateResponse setBody(GetSystemTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSystemTemplateResponseBody getBody() {
        return this.body;
    }

}
