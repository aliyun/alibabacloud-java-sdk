// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ValuateApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValuateApplicationResponseBody body;

    public static ValuateApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ValuateApplicationResponse self = new ValuateApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ValuateApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValuateApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValuateApplicationResponse setBody(ValuateApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ValuateApplicationResponseBody getBody() {
        return this.body;
    }

}
