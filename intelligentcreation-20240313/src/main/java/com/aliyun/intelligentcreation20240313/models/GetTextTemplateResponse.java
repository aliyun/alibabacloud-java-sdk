// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetTextTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTextTemplateResponseBody body;

    public static GetTextTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTextTemplateResponse self = new GetTextTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetTextTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTextTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTextTemplateResponse setBody(GetTextTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTextTemplateResponseBody getBody() {
        return this.body;
    }

}
