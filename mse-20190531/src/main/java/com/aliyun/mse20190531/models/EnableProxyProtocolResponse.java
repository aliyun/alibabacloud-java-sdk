// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class EnableProxyProtocolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableProxyProtocolResponseBody body;

    public static EnableProxyProtocolResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableProxyProtocolResponse self = new EnableProxyProtocolResponse();
        return TeaModel.build(map, self);
    }

    public EnableProxyProtocolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableProxyProtocolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableProxyProtocolResponse setBody(EnableProxyProtocolResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableProxyProtocolResponseBody getBody() {
        return this.body;
    }

}
