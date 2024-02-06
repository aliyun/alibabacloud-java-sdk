// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DisableAdviceServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableAdviceServiceResponseBody body;

    public static DisableAdviceServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableAdviceServiceResponse self = new DisableAdviceServiceResponse();
        return TeaModel.build(map, self);
    }

    public DisableAdviceServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableAdviceServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableAdviceServiceResponse setBody(DisableAdviceServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableAdviceServiceResponseBody getBody() {
        return this.body;
    }

}
