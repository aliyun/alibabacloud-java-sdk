// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateFlowlogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFlowlogResponseBody body;

    public static CreateFlowlogResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowlogResponse self = new CreateFlowlogResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowlogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowlogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFlowlogResponse setBody(CreateFlowlogResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowlogResponseBody getBody() {
        return this.body;
    }

}
