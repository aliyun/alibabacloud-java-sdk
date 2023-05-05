// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetCertTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCertTemplateResponseBody body;

    public static GetCertTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCertTemplateResponse self = new GetCertTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetCertTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCertTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCertTemplateResponse setBody(GetCertTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCertTemplateResponseBody getBody() {
        return this.body;
    }

}
