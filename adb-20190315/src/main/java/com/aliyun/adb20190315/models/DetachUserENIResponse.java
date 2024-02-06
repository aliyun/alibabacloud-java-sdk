// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DetachUserENIResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachUserENIResponseBody body;

    public static DetachUserENIResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachUserENIResponse self = new DetachUserENIResponse();
        return TeaModel.build(map, self);
    }

    public DetachUserENIResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachUserENIResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachUserENIResponse setBody(DetachUserENIResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachUserENIResponseBody getBody() {
        return this.body;
    }

}
