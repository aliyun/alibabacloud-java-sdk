// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableDasProResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableDasProResponseBody body;

    public static DisableDasProResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDasProResponse self = new DisableDasProResponse();
        return TeaModel.build(map, self);
    }

    public DisableDasProResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDasProResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableDasProResponse setBody(DisableDasProResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDasProResponseBody getBody() {
        return this.body;
    }

}
