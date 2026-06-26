// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class PauseSaasServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PauseSaasServiceResponseBody body;

    public static PauseSaasServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseSaasServiceResponse self = new PauseSaasServiceResponse();
        return TeaModel.build(map, self);
    }

    public PauseSaasServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PauseSaasServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PauseSaasServiceResponse setBody(PauseSaasServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public PauseSaasServiceResponseBody getBody() {
        return this.body;
    }

}
