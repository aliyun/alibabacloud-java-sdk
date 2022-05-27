// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class CalcCACSResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CalcCACSResponseBody body;

    public static CalcCACSResponse build(java.util.Map<String, ?> map) throws Exception {
        CalcCACSResponse self = new CalcCACSResponse();
        return TeaModel.build(map, self);
    }

    public CalcCACSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CalcCACSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CalcCACSResponse setBody(CalcCACSResponseBody body) {
        this.body = body;
        return this;
    }
    public CalcCACSResponseBody getBody() {
        return this.body;
    }

}
