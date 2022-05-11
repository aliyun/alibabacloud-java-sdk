// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGraySixResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HuichengTestGraySixResponseBody body;

    public static HuichengTestGraySixResponse build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGraySixResponse self = new HuichengTestGraySixResponse();
        return TeaModel.build(map, self);
    }

    public HuichengTestGraySixResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HuichengTestGraySixResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HuichengTestGraySixResponse setBody(HuichengTestGraySixResponseBody body) {
        this.body = body;
        return this;
    }
    public HuichengTestGraySixResponseBody getBody() {
        return this.body;
    }

}
