// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class EnableAdviceServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableAdviceServiceResponseBody body;

    public static EnableAdviceServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAdviceServiceResponse self = new EnableAdviceServiceResponse();
        return TeaModel.build(map, self);
    }

    public EnableAdviceServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableAdviceServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableAdviceServiceResponse setBody(EnableAdviceServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAdviceServiceResponseBody getBody() {
        return this.body;
    }

}
