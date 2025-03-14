// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class CloseDomainSlsConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseDomainSlsConfigResponseBody body;

    public static CloseDomainSlsConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseDomainSlsConfigResponse self = new CloseDomainSlsConfigResponse();
        return TeaModel.build(map, self);
    }

    public CloseDomainSlsConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseDomainSlsConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseDomainSlsConfigResponse setBody(CloseDomainSlsConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseDomainSlsConfigResponseBody getBody() {
        return this.body;
    }

}
