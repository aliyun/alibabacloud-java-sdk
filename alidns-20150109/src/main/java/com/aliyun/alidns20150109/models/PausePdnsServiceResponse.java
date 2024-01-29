// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class PausePdnsServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PausePdnsServiceResponseBody body;

    public static PausePdnsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        PausePdnsServiceResponse self = new PausePdnsServiceResponse();
        return TeaModel.build(map, self);
    }

    public PausePdnsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PausePdnsServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PausePdnsServiceResponse setBody(PausePdnsServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public PausePdnsServiceResponseBody getBody() {
        return this.body;
    }

}
