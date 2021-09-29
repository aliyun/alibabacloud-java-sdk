// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ValuateApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ValuateApplicationResponse setBody(ValuateApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ValuateApplicationResponseBody getBody() {
        return this.body;
    }

}
