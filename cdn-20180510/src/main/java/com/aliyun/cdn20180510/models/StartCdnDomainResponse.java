// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class StartCdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartCdnDomainResponseBody body;

    public static StartCdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        StartCdnDomainResponse self = new StartCdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public StartCdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartCdnDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartCdnDomainResponse setBody(StartCdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public StartCdnDomainResponseBody getBody() {
        return this.body;
    }

}
