// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetApiPathFieldTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApiPathFieldTemplateResponseBody body;

    public static GetApiPathFieldTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApiPathFieldTemplateResponse self = new GetApiPathFieldTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetApiPathFieldTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApiPathFieldTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApiPathFieldTemplateResponse setBody(GetApiPathFieldTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApiPathFieldTemplateResponseBody getBody() {
        return this.body;
    }

}
