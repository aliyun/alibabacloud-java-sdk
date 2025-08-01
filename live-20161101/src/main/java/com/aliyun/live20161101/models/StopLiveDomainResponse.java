// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopLiveDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopLiveDomainResponseBody body;

    public static StopLiveDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        StopLiveDomainResponse self = new StopLiveDomainResponse();
        return TeaModel.build(map, self);
    }

    public StopLiveDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopLiveDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopLiveDomainResponse setBody(StopLiveDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public StopLiveDomainResponseBody getBody() {
        return this.body;
    }

}
