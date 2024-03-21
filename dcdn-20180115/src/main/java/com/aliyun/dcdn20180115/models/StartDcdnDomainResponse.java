// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class StartDcdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartDcdnDomainResponseBody body;

    public static StartDcdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDcdnDomainResponse self = new StartDcdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public StartDcdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDcdnDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDcdnDomainResponse setBody(StartDcdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDcdnDomainResponseBody getBody() {
        return this.body;
    }

}
