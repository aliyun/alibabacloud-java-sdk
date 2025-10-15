// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApplicationTemplateResponseBody body;

    public static GetApplicationTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationTemplateResponse self = new GetApplicationTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplicationTemplateResponse setBody(GetApplicationTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationTemplateResponseBody getBody() {
        return this.body;
    }

}
