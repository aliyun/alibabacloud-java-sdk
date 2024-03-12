// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableApplicationApiInvokeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableApplicationApiInvokeResponseBody body;

    public static DisableApplicationApiInvokeResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableApplicationApiInvokeResponse self = new DisableApplicationApiInvokeResponse();
        return TeaModel.build(map, self);
    }

    public DisableApplicationApiInvokeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableApplicationApiInvokeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableApplicationApiInvokeResponse setBody(DisableApplicationApiInvokeResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableApplicationApiInvokeResponseBody getBody() {
        return this.body;
    }

}
