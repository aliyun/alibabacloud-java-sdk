// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ValuateTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ValuateTemplateResponseBody body;

    public static ValuateTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ValuateTemplateResponse self = new ValuateTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ValuateTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValuateTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValuateTemplateResponse setBody(ValuateTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ValuateTemplateResponseBody getBody() {
        return this.body;
    }

}
