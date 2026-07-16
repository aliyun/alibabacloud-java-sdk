// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class RollbackEnvironmentVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackEnvironmentVersionResponseBody body;

    public static RollbackEnvironmentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackEnvironmentVersionResponse self = new RollbackEnvironmentVersionResponse();
        return TeaModel.build(map, self);
    }

    public RollbackEnvironmentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackEnvironmentVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackEnvironmentVersionResponse setBody(RollbackEnvironmentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackEnvironmentVersionResponseBody getBody() {
        return this.body;
    }

}
