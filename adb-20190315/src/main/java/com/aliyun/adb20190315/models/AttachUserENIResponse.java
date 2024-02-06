// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class AttachUserENIResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachUserENIResponseBody body;

    public static AttachUserENIResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachUserENIResponse self = new AttachUserENIResponse();
        return TeaModel.build(map, self);
    }

    public AttachUserENIResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachUserENIResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachUserENIResponse setBody(AttachUserENIResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachUserENIResponseBody getBody() {
        return this.body;
    }

}
