// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class StopDcdnIpaDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopDcdnIpaDomainResponseBody body;

    public static StopDcdnIpaDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDcdnIpaDomainResponse self = new StopDcdnIpaDomainResponse();
        return TeaModel.build(map, self);
    }

    public StopDcdnIpaDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDcdnIpaDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDcdnIpaDomainResponse setBody(StopDcdnIpaDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDcdnIpaDomainResponseBody getBody() {
        return this.body;
    }

}
