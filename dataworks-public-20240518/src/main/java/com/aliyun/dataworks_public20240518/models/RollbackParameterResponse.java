// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RollbackParameterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackParameterResponseBody body;

    public static RollbackParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackParameterResponse self = new RollbackParameterResponse();
        return TeaModel.build(map, self);
    }

    public RollbackParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackParameterResponse setBody(RollbackParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackParameterResponseBody getBody() {
        return this.body;
    }

}
