// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class StopCdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopCdnDomainResponseBody body;

    public static StopCdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        StopCdnDomainResponse self = new StopCdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public StopCdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopCdnDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopCdnDomainResponse setBody(StopCdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public StopCdnDomainResponseBody getBody() {
        return this.body;
    }

}
