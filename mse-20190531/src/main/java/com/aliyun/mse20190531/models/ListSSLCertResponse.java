// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListSSLCertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSSLCertResponseBody body;

    public static ListSSLCertResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSSLCertResponse self = new ListSSLCertResponse();
        return TeaModel.build(map, self);
    }

    public ListSSLCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSSLCertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSSLCertResponse setBody(ListSSLCertResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSSLCertResponseBody getBody() {
        return this.body;
    }

}
