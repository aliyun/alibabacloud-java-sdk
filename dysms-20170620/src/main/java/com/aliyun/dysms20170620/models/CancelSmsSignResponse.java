// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CancelSmsSignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelSmsSignResponseBody body;

    public static CancelSmsSignResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelSmsSignResponse self = new CancelSmsSignResponse();
        return TeaModel.build(map, self);
    }

    public CancelSmsSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelSmsSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelSmsSignResponse setBody(CancelSmsSignResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelSmsSignResponseBody getBody() {
        return this.body;
    }

}
