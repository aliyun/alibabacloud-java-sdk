// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class StopDcdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopDcdnDomainResponseBody body;

    public static StopDcdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDcdnDomainResponse self = new StopDcdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public StopDcdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDcdnDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDcdnDomainResponse setBody(StopDcdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDcdnDomainResponseBody getBody() {
        return this.body;
    }

}
