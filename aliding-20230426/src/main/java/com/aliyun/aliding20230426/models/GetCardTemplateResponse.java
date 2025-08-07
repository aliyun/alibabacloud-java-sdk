// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetCardTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCardTemplateResponseBody body;

    public static GetCardTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCardTemplateResponse self = new GetCardTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetCardTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCardTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCardTemplateResponse setBody(GetCardTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCardTemplateResponseBody getBody() {
        return this.body;
    }

}
