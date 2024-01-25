// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ReactivateDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReactivateDomainResponseBody body;

    public static ReactivateDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        ReactivateDomainResponse self = new ReactivateDomainResponse();
        return TeaModel.build(map, self);
    }

    public ReactivateDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReactivateDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReactivateDomainResponse setBody(ReactivateDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public ReactivateDomainResponseBody getBody() {
        return this.body;
    }

}
