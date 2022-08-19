// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class JeepTetstResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public JeepTetstResponseBody body;

    public static JeepTetstResponse build(java.util.Map<String, ?> map) throws Exception {
        JeepTetstResponse self = new JeepTetstResponse();
        return TeaModel.build(map, self);
    }

    public JeepTetstResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JeepTetstResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public JeepTetstResponse setBody(JeepTetstResponseBody body) {
        this.body = body;
        return this;
    }
    public JeepTetstResponseBody getBody() {
        return this.body;
    }

}
