// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class UninstallSoftwaresResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UninstallSoftwaresResponseBody body;

    public static UninstallSoftwaresResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallSoftwaresResponse self = new UninstallSoftwaresResponse();
        return TeaModel.build(map, self);
    }

    public UninstallSoftwaresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallSoftwaresResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallSoftwaresResponse setBody(UninstallSoftwaresResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallSoftwaresResponseBody getBody() {
        return this.body;
    }

}
