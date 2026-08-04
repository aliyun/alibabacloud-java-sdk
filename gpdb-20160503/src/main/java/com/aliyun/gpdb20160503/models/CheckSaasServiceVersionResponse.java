// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CheckSaasServiceVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckSaasServiceVersionResponseBody body;

    public static CheckSaasServiceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSaasServiceVersionResponse self = new CheckSaasServiceVersionResponse();
        return TeaModel.build(map, self);
    }

    public CheckSaasServiceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSaasServiceVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckSaasServiceVersionResponse setBody(CheckSaasServiceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSaasServiceVersionResponseBody getBody() {
        return this.body;
    }

}
