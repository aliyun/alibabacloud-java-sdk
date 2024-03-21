// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class StartDcdnIpaDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartDcdnIpaDomainResponseBody body;

    public static StartDcdnIpaDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDcdnIpaDomainResponse self = new StartDcdnIpaDomainResponse();
        return TeaModel.build(map, self);
    }

    public StartDcdnIpaDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDcdnIpaDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDcdnIpaDomainResponse setBody(StartDcdnIpaDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDcdnIpaDomainResponseBody getBody() {
        return this.body;
    }

}
