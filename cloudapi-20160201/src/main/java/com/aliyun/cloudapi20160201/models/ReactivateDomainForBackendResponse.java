// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ReactivateDomainForBackendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReactivateDomainForBackendResponseBody body;

    public static ReactivateDomainForBackendResponse build(java.util.Map<String, ?> map) throws Exception {
        ReactivateDomainForBackendResponse self = new ReactivateDomainForBackendResponse();
        return TeaModel.build(map, self);
    }

    public ReactivateDomainForBackendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReactivateDomainForBackendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReactivateDomainForBackendResponse setBody(ReactivateDomainForBackendResponseBody body) {
        this.body = body;
        return this;
    }
    public ReactivateDomainForBackendResponseBody getBody() {
        return this.body;
    }

}
