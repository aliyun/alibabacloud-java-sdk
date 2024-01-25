// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SetDomainForBackendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDomainForBackendResponseBody body;

    public static SetDomainForBackendResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDomainForBackendResponse self = new SetDomainForBackendResponse();
        return TeaModel.build(map, self);
    }

    public SetDomainForBackendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDomainForBackendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDomainForBackendResponse setBody(SetDomainForBackendResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDomainForBackendResponseBody getBody() {
        return this.body;
    }

}
