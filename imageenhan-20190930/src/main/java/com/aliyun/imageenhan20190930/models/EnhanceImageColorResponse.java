// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class EnhanceImageColorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnhanceImageColorResponseBody body;

    public static EnhanceImageColorResponse build(java.util.Map<String, ?> map) throws Exception {
        EnhanceImageColorResponse self = new EnhanceImageColorResponse();
        return TeaModel.build(map, self);
    }

    public EnhanceImageColorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnhanceImageColorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnhanceImageColorResponse setBody(EnhanceImageColorResponseBody body) {
        this.body = body;
        return this;
    }
    public EnhanceImageColorResponseBody getBody() {
        return this.body;
    }

}
